# Write your MySQL query statement below
SELECT e1.name Employee FROM Employee e1
WHERE e1.salary > (SELECT e2.salary FROM employee e2 WHERE e2.id = e1.managerid)