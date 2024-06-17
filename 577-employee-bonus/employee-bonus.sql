# Write your MySQL query statement below
SELECT name, bonus FROM Employee AS E1 LEFT JOIN 
Bonus as b ON E1.empId=b.empId 
WHERE bonus<1000 or bonus is null; 