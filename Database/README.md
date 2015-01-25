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

##Rank Scores: 
    select Scores.Score, count(Ranking.Score) as Rank 
    from Scores, (select distinct Score from Scores order by Score desc) as Ranking 
    where Ranking.Score >= Scores.Score  group by Scores.Id order by Scores.Score desc;
    #Ranking排不排序是一样的 =.=
    select Scores.Score, count(Ranking.Score) as Rank 
    from Scores, (select distinct Score from Scores) as Ranking 
    where Ranking.Score >= Scores.Score  group by Scores.Id order by Scores.Score desc;


##Consecutive Numbers:

    select distinct a.Num from Logs a, Logs b, Logs c 
    where a.Num = b.Num and b.Id = a.Id + 1 
    and b.Num = c.Num and c.Id = b.Id + 1;

##Duplicate Emails:
    select Email from (select Email, count(Email) as num from Person group by Email) as N where N.num >=2;

    select Email from Person group by Email having count(Email) > 1;

    select distinct a.Email from Person a left join (select Id, Email from Person group by Email) as b
    on a.Id = b.Id and a.Email = b.Email where b.Email is null; 

    left join 只管a表，b表里group by Email 会把重复的Email的Id归入第一次出现的Id，因此a表里那些存在重复
    Email的Id在left join时会找不到b表里相应的Id，那么对应Email就会成为NULL，得以筛选


##Customers Who Never Order:

    select Name from Customers, Orders where Customers.Id not in 
    (select Customers.Id from Customers, Orders where Orders.CustomerId = Customers.Id);
    (Time Limit Exceeded..)

    select Name from Customers where Id not in (select CustomerId from Orders);

##Department Highest Salary:

    select D.Name as Department, E.Name as Employee, E.Salary as Salary
    from  Department D, Employee E, (select DepartmentId, max(Salary) as Highest from Employee group by DepartmentId) as temp
    where D.Id = E.DepartmentId
    and E.DepartmentId = temp.DepartmentId
    and E.Salary = temp.Highest;
    