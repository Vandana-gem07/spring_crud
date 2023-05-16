# Employee Management System

The Employee Management System is a basic CRUD (Create, Read, Update and Delete) application built with Spring Boot, which allows you to manage employee records. 
With this application, you can create, read, update, and delete employee records in a database. The application includes a REST API is also provided for programmatic access.

## Requirements

- Java 8 or higher
- MySQL server 5.7 or higher

## Softwares you will be working on

- Eclipse IDE/IntelliJ
- MySQL Workbench
- Postman

## Getting started

1. Clone the repository to your local machine.
   
   git clone https://github.com/yourusername/employee-management-system.git
   
2. Import the project into your preferred IDE (such as Eclipse or IntelliJ) as a Maven project.
3. Update the `application.properties` file in the `src/main/resources` directory with your MySQL database configuration.
4. Build and run the application using Maven. From the command line, navigate to the project directory and run:
   
   mvn spring-boot:run
   
5. Access the application by visiting `http://localhost:9111` in your web browser.

## Usage

Once the application is up and running, you can perform CRUD operations on employee records via the user interface or the REST API.

### REST API

The REST API provides programmatic access to the application's functionality. The API supports the following endpoints:

- `GET /api/employees`: Returns a list of all employee records in the database.
- `POST /api/employees`: Creates a new employee record in the database.
- `GET /api/employees/{id}`: Returns the employee record with the specified ID.
- `PUT /api/employees/{id}`: Updates the employee record with the specified ID.
- `DELETE /api/employees/{id}`: Deletes the employee record with the specified ID.

All endpoints return JSON data.

## Contributing

If you find a bug or have an idea for a new feature, feel free to open an issue or submit a pull request. Contributions are always welcome!

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
