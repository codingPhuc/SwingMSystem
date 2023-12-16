# Application Setup Instructions
Prerequisites
Ensure you have XAMPP installed on your machine.
# Database Setup:
Open `XAMPP` and start both the `MySQL` and `Apache servers`.
      Launch your web browser and go to http://localhost/phpmyadmin/.
      Or you can click the button `Admin` next to button start of MySQL

In the phpMyAdmin interface, navigate to the `Import` tab in the header.

Click on the `Choose File` button, then locate and select the `studentmanagementinformation.sql` file from your project directory.

Click `Import` to import the SQL file. This will automatically execute all the SQL commands in the file, creating the necessary tables and inserting the admin user.

# Configure Database Connection:
Open your preferred IDE (e.g., IntelliJ IDEA).
      + Navigate to the project directory and locate `src/main/java/com/Dao`  directory.
      + Locate the `ConnectionConfig`  file and open it
      + Change the connection string to your specific configuration :
      ` public static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/studentmanagementinformation?user=root"; ` 

# Running the Application:
Navigate to the project directory and locate `src/main/java/main.` 
Start the `Login file `.
Once the Login file has started, log in to the system using the following credentials:
      + Username: admin
      + Password: admin

Now you should have successfully set up and logged into the Student Management Information System. Explore and manage the student information as needed.




