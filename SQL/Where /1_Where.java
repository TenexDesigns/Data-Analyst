where        = , <>, <, >, and , or, like , null, not null, in, is , NOT



EXAMPLE OF USES
  ----------------------------------------------------------------
where age <= 32
where firstName - 'jim';
Select * from employeedemographics where  age <= 32 or gender = 'Male';
Select * from employeedemographics where  age <= 32 and gender = 'Male';
where LastName Like '%s%'
 where LastName Like 's%';
where LastName Like 's%o%'
where LastName is not null;
where FirstName IN ('Jim','Pam');

-----------------------------------------------------------------------



The `WHERE` clause in SQL is used to filter the rows returned by a query based on a specified condition. It allows you to extract only the rows that satisfy a given condition. Here's a general structure of a SQL query with a `WHERE` clause:

```sql
SELECT column1, column2, ...
FROM table_name
WHERE condition;
```

Let's go through some examples to illustrate the use of the `WHERE` clause:

### Example 1: Basic WHERE Clause

```sql
-- Select employees whose job title is 'Salesman'
SELECT * FROM Employees
WHERE JobTitle = 'Salesman';
```

This query retrieves all columns from the "Employees" table where the job title is 'Salesman'.

### Example 2: Numeric Conditions

```sql
-- Select products with a price greater than 50
SELECT * FROM Products
WHERE Price > 50;
```

This query retrieves products from the "Products" table where the price is greater than 50.

### Example 3: Text Conditions

```sql
-- Select customers with a city name starting with 'New'
SELECT * FROM Customers
WHERE City LIKE 'New%';
```

This query retrieves customers from the "Customers" table where the city name starts with 'New'.

### Example 4: Date Conditions

```sql
-- Select orders placed after a specific date
SELECT * FROM Orders
WHERE OrderDate > '2022-01-01';
```

This query retrieves orders from the "Orders" table where the order date is after January 1, 2022.

### Example 5: Combined Conditions

```sql
-- Select employees with a salary greater than 50000 and job title is 'Manager'
SELECT * FROM Employees
WHERE Salary > 50000 AND JobTitle = 'Manager';
```

This query retrieves employees from the "Employees" table with a salary greater than 50000 and a job title of 'Manager'.

### Example 6: NULL Values

```sql
-- Select products with no supplier information
SELECT * FROM Products
WHERE SupplierID IS NULL;
```

This query retrieves products from the "Products" table where the supplier information is not available (NULL).

### Example 7: IN Operator

```sql
-- Select employees with specific employee IDs
SELECT * FROM Employees
WHERE EmployeeID IN (1001, 1003, 1005);
```

This query retrieves employees from the "Employees" table with specific employee IDs.

### Example 8: NOT Operator

```sql
-- Select customers not from a specific city
SELECT * FROM Customers
WHERE NOT City = 'London';
```

This query retrieves customers from the "Customers" table where the city is not 'London'.

The `WHERE` clause is a powerful tool for filtering data in SQL queries, allowing you to tailor the results to your specific criteria. It is commonly used in conjunction with `SELECT`, `UPDATE`, `DELETE`, and other SQL statements to manipulate and retrieve data from databases.



  



















