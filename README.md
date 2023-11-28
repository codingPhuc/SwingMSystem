# midterm_java
System
This is a simple Student Management Information System application. Follow the steps below to configure and run the application successfully.

# Step 1: Import Dependencies
Make sure to include the following dependencies in your project. You can add them to your Maven pom.xml file:

xml
Copy code


    <dependencies>
        <!-- MigLayout -->
        <dependency>
            <groupId>com.miglayout</groupId>
            <artifactId>miglayout</artifactId>
            <version>4.0</version>
        </dependency>

        <!-- TimingFramework -->
        <dependency>
            <groupId>org.jdesktop</groupId>
            <artifactId>timingframework</artifactId>
            <version>1.0</version>
        </dependency>

        <!-- MySQL Connector Java -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.28</version>
        </dependency>

        <!-- Commons Lang -->
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.13.0</version>
        </dependency>

        <!-- Commons Codec -->
        <dependency>
            <groupId>commons-codec</groupId>
            <artifactId>commons-codec</artifactId>
            <version>1.16.0</version>
        </dependency>

        <!-- Commons Collections -->
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-collections4</artifactId>
            <version>4.4</version>
        </dependency>

        <!-- Commons Compress -->
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-compress</artifactId>
            <version>1.24.0</version>
        </dependency>

        <!-- Commons IO -->
        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.13.0</version>
        </dependency>

        <!-- Commons Math3 -->
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-math3</artifactId>
            <version>3.6.1</version>
        </dependency>

        <!-- CurvesAPI -->
        <dependency>
            <groupId>com.github.mukel</groupId>
            <artifactId>curvesapi</artifactId>
            <version>1.08</version>
        </dependency>

        <!-- SparseBitSet -->
        <dependency>
            <groupId>org.battelle</groupId>
            <artifactId>SparseBitSet</artifactId>
            <version>1.3</version>
        </dependency>

        <!-- Log4j API -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>2.20.0</version>
        </dependency>

        <!-- Apache POI -->
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
            <version>5.2.4</version>
        </dependency>

        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>5.2.4</version>
        </dependency>

        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml-lite</artifactId>
            <version>5.2.4</version>
        </dependency>

        <!-- XMLBeans -->
        <dependency>
            <groupId>org.apache.xmlbeans</groupId>
            <artifactId>xmlbeans</artifactId>
            <version>5.1.1</version>
        </dependency>

        <!-- JCalendar -->
        <dependency>
            <groupId>com.toedter</groupId>
            <artifactId>jcalendar</artifactId>
            <version>1.4</version>
        </dependency>
    </dependencies>


# Step 2: Configure Database Connection
Navigate to the ConnectionConfig class in the com.Dao folder. Adjust the connection string according to your database configuration. You have the option to either create the database manually or let the connection string create it during runtime.

// Update the connection details in ConnectionConfig.java
// com.Dao -> ConnectionConfig

# Step 3: Database Setup
Use a MySQL database tool (e.g., XAMPP) to execute the following SQL queries. This will create the necessary tables for the application:

sql
Copy code
CREATE TABLE Student (
    ID VARCHAR(10) PRIMARY KEY,
    Name VARCHAR(250),
    BeginningYear INT,
    EndYear INT,
    Major VARCHAR(250),
    EducationQuality VARCHAR(10),
    Phone VARCHAR(10)
);

CREATE TABLE UserManagement (
    UserID INT AUTO_INCREMENT PRIMARY KEY,
    UserName VARCHAR(250),
    Password VARCHAR(255), -- Assuming you're storing hashed passwords
    ProfilePicture MEDIUMTEXT,
    Age INT,
    PhoneNumber VARCHAR(10),
    Status INT CHECK (Status IN (0, 1)), -- 0: Normal, 1: Blocked
    UserRole INT CHECK (UserRole IN (0, 1, 2)) -- 0: Admin, 1: Manager, 2: Employee
);

CREATE TABLE LoginHistory (
    LoginHistoryID INT AUTO_INCREMENT PRIMARY KEY,
    UserID INT,
    TimeLogin DATETIME,
    CONSTRAINT FK_LoginHistory_UserID FOREIGN KEY (UserID)
    REFERENCES UserManagement(UserID) ON DELETE CASCADE
);

CREATE TABLE CertificateManagement (
    CertificateID INT AUTO_INCREMENT PRIMARY KEY,
    StudentID VARCHAR(10),
    FOREIGN KEY (StudentID) REFERENCES Student(ID) ON DELETE CASCADE,
    CertificateName VARCHAR(250),
    IssueDate DATE,
    ExpiryDate DATE,
    Grade FLOAT 
);
Save to grepper
# Step 4: Run the Application
Go to the main folder of the application and run the main function to start the Student Management Information System.