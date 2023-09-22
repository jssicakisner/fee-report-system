# Fee Report System

This is a Java-Maven project that provides a simple application for managing fee reports. The application allows accountants to log in, view fee reports, and add new fee reports to the database. It also contains an admin section for managing accountants.

## Technologies Used

- Java 8
- Maven 3.6.3
- MySQL 8.0.26
- Spring MVC 5.3.9
- SpringBoot

## Getting Started

To run this project on your local machine, you will need to have Java, Maven, and MySQL installed. You can download Java and Maven from their official websites, and MySQL can be downloaded from the [MySQL website](https://www.mysql.com/downloads/) or installed using a package manager.

Once you have installed the necessary software, you can follow these steps to reproduce the project on your machine:

1. Clone the repository to your local machine using Git:

```
git clone https://github.com/yourusername/fee-report-system.git
```

2. Create a new MySQL database `feereportdb` for example and create the necessary tables `accountant` and `student`, populating them with the necessary columns.

3. Open the `application.properties` file located in the `src/main/resources` directory of the project and update the `spring.datasource.username` and `spring.datasource.password` properties with your MySQL username and password.

4. Open a terminal window and navigate to the root directory of the project.

5. Run the following command to build the project:

```
mvn clean install
```

## Usage

Once you run the application, you can view the list of fee reports and add new fee reports to the database. As well as new Accountants as a admin and new Students as an Accountant.

## License

This project is licensed under the MIT License. See the LICENSE file for details.