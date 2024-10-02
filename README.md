# 🚑 Doctor Management System 🩺

## 📜 Overview
This project is a **Doctor Management System** implemented using **Servlets** and **JSP**. It provides basic **CRUD** (Create, Read, Update, Delete) operations for managing doctor information.

## 💼 Features
The following operations are implemented in this project:
- **➕ Insert**: Add a new doctor to the system.
- **📋 Fetch All**: Retrieve and display all doctors.
- **🔍 Fetch By ID**: Retrieve a doctor by their unique ID.
- **✏️ Update**: Update the details of an existing doctor.
- **❌ Delete All**: Delete all doctors from the system.
- **🗑️ Delete By ID**: Delete a specific doctor by their ID.

## 💻 Technologies Used
- **Java Servlet** 🖥️: Used for backend logic.
- **JSP (Java Server Pages)** 🌐: Used for front-end and displaying the doctor information.
- **JDBC (Java Database Connectivity)** 💾: For database connectivity and CRUD operations.
- **MySQL**🗃️: Database used for storing doctor information.
- **Eclipse IDE** 🛠️: For development and testing.

## 🚀 Getting Started

### 📋 Prerequisites:
- **Java Development Kit (JDK)** ☕ installed on your machine.
- **MySQL** 🛢️ installed and running.
- **Apache Tomcat** 🌐 server for running the servlet.
- **Eclipse IDE** 💻 or any Java IDE of your choice.

### 🛠️ Setup
1. **Database Configuration**:  
   Create a MySQL database named `doctor_management` and a table `doctors` with the following structure:

   ```sql
   CREATE TABLE doctors (
     id INT AUTO_INCREMENT PRIMARY KEY,
     name VARCHAR(100),
     specialization VARCHAR(100),
     phone VARCHAR(15),
     email VARCHAR(100)
   );
   ```

2. **Database Connection**:  
   Configure the `DBUtil.java` class to connect to your MySQL database by providing the correct `username`, `password`, and `url`.

3. **Web.xml Configuration**:  
   Define the servlet mappings and URL patterns in `web.xml` to access different CRUD operations.

4. **Running the Application**:  
   Deploy the project in **Apache Tomcat** 🚀 and run it to access the Doctor Management System from the browser.

### 🌍 Endpoints:
- **➕ Insert Doctor**: `POST /addDoctor`  
  Insert a new doctor into the database.

- **📋 Fetch All Doctors**: `GET /getAllDoctors`  
  Retrieve and display all doctors.

- **🔍 Fetch Doctor by ID**: `GET /getDoctorById?id=<doctor_id>`  
  Retrieve a doctor by their unique ID.

- **✏️ Update Doctor Information**: `POST /updateDoctor`  
  Update the details of an existing doctor.

- **❌ Delete All Doctors**: `POST /deleteAllDoctors`  
  Delete all doctors from the database.

- **🗑️ Delete Doctor by ID**: `POST /deleteDoctor?id=<doctor_id>`  
  Delete a doctor based on the provided ID.

## 🗂️ Code Structure

- **`Doctor.java`**: Java class representing the Doctor entity.
- **`DoctorDao.java`**: Data Access Object for performing CRUD operations on the `doctors` table.
- **`DoctorServlet.java`**: Servlet class to handle requests and perform operations.
- **`DBUtil.java`**: Utility class for database connection using JDBC.
- **`doctor-list.jsp`**: JSP page to display the list of all doctors.
- **`add-doctor.jsp`**: JSP page to add a new doctor.
- **`update-doctor.jsp`**: JSP page to update a doctor's information.

## 💡 Contributing
Feel free to fork this repository, make changes, and submit a pull request if you want to contribute enhancements or fixes to the project.

## 📝 License
This project is open-source and available under the **MIT License**.
