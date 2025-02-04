# **Steps to Run the Loan Manager Program**  

### **1. Prerequisites**  
- Install **Java Development Kit (JDK 8+)**, **MySQL**, and **MySQL Connector/J** (JDBC driver).  
- Ensure the **MySQL server is running** and accessible.  

### **2. Database Setup**  
- Create a **database** and necessary **tables** in MySQL.  
- Ensure proper **primary and foreign key relationships** for loan and interest records.  

### **3. Configure the Program**  
- Update the **database connection details** (such as username, password, and database name) in the Java program to match your MySQL settings.  

### **4. Compile & Run the Program**  
- **If using Command Line:**  
  - Compile the Java files with MySQL connector.  
  - Run the program after successful compilation.  
- **If using an IDE (IntelliJ/Eclipse):**  
  - Add the **JDBC driver** to the project classpath.  
  - Execute the Java program.  

### **5. Using the Program**  
- The program provides a **menu-driven interface**.  
- Options include updating **loan details, interest details, and generating reports**.  
- Follow on-screen prompts to enter or modify loan records.  

### **6. Troubleshooting**  
- Check for **database connection errors** if MySQL is not accessible.  
- Ensure **JDBC driver** is correctly linked to avoid runtime errors.  
- Verify **table structure** in MySQL to prevent data insertion issues.  
