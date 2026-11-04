class Solution {
    public int maxNumberOfBalloons(String text) {
        int cnb=0;
        int cna=0;
        int cnl=0;
        int cno=0;
        int cnn=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='b'){
                cnb++;
            }
            if(text.charAt(i)=='a'){
                cna++;
            }
            if(text.charAt(i)=='l'){
                cnl++;
            }
            if(text.charAt(i)=='o'){
                cno++;
            }
            if(text.charAt(i)=='n'){
                cnn++;
            }
        }



        int x=Math.min(cnb,cna);
        int y=Math.min(cnn,x);
        int z=Math.min(cnl/2,cno/2);

        int res=Math.min(y,z);

        return res;

    }
}