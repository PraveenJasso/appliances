## Appliances Demo

**1. Requirements

Java 8
Spring boot dependencies
PostgresSql

**2. Configure PostgreSQL**

First, created a database named `appliance` with credentials appliance/appliance. Then, run `appliance_schema.sql` and 'appliance_data.sql'.

**3. Run the app**

Type the following command from the root directory of the project to run it -

```bash / cmd
mvn clean instal

**4. To run the application

Start the boot application by this class AppliancesApplication.java

Alternatively, you can package the application in the form of a JAR file and then run it like so -

```bash
java -jar target/appliances-1.0.jar
```

**5. To Test the API

http://localhost:8080/appliance
