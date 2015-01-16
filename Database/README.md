##Employees Earning More Than Their Managers:

select Ex.Name from Employee E, Employee Ex where E.Id = Ex.ManagerId and Ex.Salary > E.Salary;

##Combine Two Tables:

