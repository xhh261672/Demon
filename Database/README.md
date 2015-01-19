##Employees Earning More Than Their Managers:

select Ex.Name from Employee E, Employee Ex where E.Id = Ex.ManagerId and Ex.Salary > E.Salary;

##Combine Two Tables:

select FirstName, LastName, City, State from Person left join Address on Person.PersonId = Address.PersonId;

##Second Highest Salary

select max(Salary) from Employee where Salary < (select max(Salary) from Employee);
select (select distinct Salary from Employee order by Salary desc limit 1,1);

###不写distinct的后果：重复的记录会计入排名 如 100 200 200 正确结果100 实际输出200

##Nth Highest Salary:

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
DECLARE M INT;
SET M = N-1;
  RETURN (
      #### Write your MySQL query statement below.
      select (select distinct Salary from Employee order by Salary desc limit M, 1)
  );
END