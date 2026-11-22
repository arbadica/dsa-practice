class Solution {

    
    public boolean checkString(String s) {
        
        int aindx=-1;
        int bindx=-1;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                aindx=i;
            }
            if(s.charAt(i)=='b' && bindx<0){
                bindx=i;
                //break;
            }
        }

        if(aindx<0 && bindx>=0){
            return true;
        }
        else if(bindx<0 && aindx>=0){
            return true;
        }
        else if(aindx<bindx){
            return true;
        }
        else{
            return false;
        }
    }
}