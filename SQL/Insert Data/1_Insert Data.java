The SQL INSERT INTO statement is used to insert new records into a table. There are two main ways to use the INSERT INTO statement: 

1. **Inserting values for all columns:** If youre inserting values for all columns in the table, you can specify the values in the same order as the columns in the table.
  Here's the syntax:

```sql
INSERT INTO table_name
VALUES (value1, value2, value3,...);
```

For example:

```sql
INSERT INTO Employees
VALUES (1001, 'John', 'Doe', 'john.doe@example.com');
```

2. **Inserting values for specific columns:** If you're only inserting values for certain columns, you can specify the column names and corresponding values:

```sql
INSERT INTO table_name (column1, column2,...)
VALUES (value1, value2,...);
```
For example:

```sql
INSERT INTO Employees (EmployeeId, FirstName, LastName)
VALUES (1002, 'Jane', 'Smith');
```

In this example, only the EmployeeId, FirstName, and LastName fields are populated. Any other columns in the Employees table will be left empty or filled with their default values, if any.

In your case, the statement `INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');` is inserting 
  a new record into the "Customers" table. The values 'Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway' are being inserted into the CustomerName,
  ContactName, Address, City, PostalCode, and Country columns respectively.

To insert multiple records at once, you can extend the VALUES clause with multiple sets of values, each enclosed in parentheses and separated by commas:

```sql
INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES 
('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway'),
('Greasy Burger', 'Per Olsen', 'Gateveien 15', 'Sandnes', '4306', 'Norway'),
('Tasty Tee', 'Finn Egan', 'Streetroad 19B', 'Liverpool', 'L1 0AA', 'UK');
```

In this example, three new records are inserted into the "Customers" table in a single SQL statement [Source 0](https://www.w3schools.com/sql/sql_insert.asp), [Source 1](https://www.sqltutorial.org/sql-insert/), [Source 2](https://www.digitalocean.com/community/tutorials/how-to-insert-data-in-sql), [Source 4](https://www.geeksforgeeks.org/sql-insert-statement/).






