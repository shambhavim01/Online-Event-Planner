/*


-- +-------------------+        +-----------------+
 |      Admin        |        |      Vendor     |
 +-------------------+        +-----------------+
 | AdminID (PK)     |        | VendorID (PK)  |
 | FullName          |        | Name            |
 | Username          |        | Address         |
 | Password          |        | Email           |
 | Email             |        | ContactNumber   |
 | Mobile            |        | EventPackages   |
 +-------------------+        | RegistrationDate|
                            +-----------------+
    
 +-------------------+        +-----------------+
 |       User        |        |     Quotation   |
 +-------------------+        +-----------------+
 | UserID (PK)      |        | QuotationID (PK)|
 | FullName          |        | Package         |
 | Username          |        | EstimatedAmount |
 | Password          |        | VendorID        |
 | DateOfJoining     |        | UserID          |
 | DateOfBirth       |        | PlanRequestID   |
 | Department        |        | Status          |
 | Mobile            |        +-----------------+
 | Email             |
 | Location          |        +-----------------+
 | Status            |        |     Package     |
 +-------------------+        +-----------------+
 
 +-------------------+
 |   PlanRequest     |
 +-------------------+
 | RequestID (PK)    |
 | FromDate          |
 | ToDate            |
 | ServicesNeeded    |
 | Attendees         |
 | OtherServices     |
 +-------------------+
 
 */



















CREATE DATABASE EventManagementDatabase;
use EventManagementDatabase;
CREATE TABLE Admin (
    AdminID INT PRIMARY KEY AUTO_INCREMENT,
    FullName VARCHAR(255),
    Username VARCHAR(50) UNIQUE,
    Password VARCHAR(255),
    Email VARCHAR(255),
    Mobile VARCHAR(20)
);

CREATE TABLE Vendor (
    VendorID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Address VARCHAR(255) NOT NULL,
    Email VARCHAR(255) UNIQUE NOT NULL,
    ContactNumber VARCHAR(20) NOT NULL,
    EventPackages TEXT,
    RegistrationDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE User (
    UserID INT PRIMARY KEY AUTO_INCREMENT,
    FullName VARCHAR(255),
    Username VARCHAR(50) UNIQUE,
    Password VARCHAR(255),
    DateOfJoining DATE,
    DateOfBirth DATE,
    Department VARCHAR(50),
    Mobile VARCHAR(20),
    Email VARCHAR(255),
    Location VARCHAR(255),
    Status ENUM('active', 'non-active') DEFAULT 'non-active'
);
CREATE TABLE Quotation (
    QuotationID INT PRIMARY KEY AUTO_INCREMENT,
    Package ENUM('Basic', 'Premium', 'Classic'),
    EstimatedAmount DECIMAL(10, 2),
    VendorID INT,
    UserID INT,
    PlanRequestID INT,
    Status ENUM('accept', 'reject', 'pending') DEFAULT 'pending'
);
CREATE TABLE Package (
    PackageID INT PRIMARY KEY AUTO_INCREMENT,
    Type VARCHAR(255) NOT NULL,
    PackageType ENUM('Basic', 'Premium', 'Classic') NOT NULL,
    Services TEXT,
    Amount DECIMAL(10, 2) NOT NULL
);

CREATE TABLE PlanRequest (
    RequestID INT PRIMARY KEY AUTO_INCREMENT,
    FromDate DATE NOT NULL,
    ToDate DATE NOT NULL,
    ServicesNeeded TEXT NOT NULL,
    Attendees INT NOT NULL,
    OtherServices TEXT
);



INSERT INTO Admin (FullName, Username, Password, Email, Mobile)
VALUES
    ('Admin User', 'admin', 'adminpassword', 'admin@example.com', '1234567890');




-- Insert data into Vendor table with vendor names
INSERT INTO Vendor (Name, Address, Email, ContactNumber, EventPackages)
VALUES
    ('Sangeet Caterers', '123 ABC Street, Mumbai', 'sangeet@example.com', '9876543210', 'Catering, Decoration'),
    ('Raj Photography', '456 XYZ Road, Delhi', 'rajphoto@example.com', '9876541230', 'Photography, Decoration'),
    ('Shree Event Planners', '789 PQR Lane, Bangalore', 'shreevents@example.com', '8765432109', 'Event Planning, Catering'),
    ('Mayur Decorators', '101 DEF Avenue, Kolkata', 'mayurdecor@example.com', '8765432108', 'Decoration, Lighting'),
    ('Royal Caterers', '222 GHI Road, Jaipur', 'royalcater@example.com', '7890123456', 'Catering, Event Management'),
    ('Shubh Photography', '333 JKL Street, Chennai', 'shubhphoto@example.com', '7890123455', 'Photography, Videography'),
    ('Vivaah Creations', '444 MNO Road, Hyderabad', 'vivaahcreations@example.com', '8765432107', 'Event Planning, Decoration'),
    ('Sarita Events', '555 RST Avenue, Pune', 'saritaevents@example.com', '9876543211', 'Event Management, Catering'),
    ('Krishna Decor', '666 UVW Lane, Ahmedabad', 'krishnadecor@example.com', '9876543212', 'Decoration, Lighting'),
    ('Ganesh Caterers', '777 XYZ Road, Surat', 'ganeshcater@example.com', '8765432106', 'Catering, Event Planning');



-- Insert data into User table with user names
INSERT INTO User (FullName, Username, Password, DateOfJoining, DateOfBirth, Department, Mobile, Email, Location, Status)
VALUES
    ('Rajesh Kumar', 'rajeshk', 'password123', '2023-01-15', '1990-05-20', 'Marketing', '7890123456', 'rajesh@example.com', 'Mumbai', 'active'),
    ('Priya Sharma', 'priyas', 'smithpass', '2023-02-20', '1985-12-10', 'Sales', '9876543210', 'priya@example.com', 'Delhi', 'non-active'),
    ('Amit Singh', 'amits', 'mjpass456', '2023-03-10', '1995-09-15', 'IT', '5551234567', 'amit@example.com', 'Bangalore', 'active'),
    ('Neha Patel', 'nehap', 'sarah123', '2023-04-05', '1988-07-25', 'HR', '2223334444', 'neha@example.com', 'Ahmedabad', 'active'),
    ('Sanjay Verma', 'sanjayv', 'brownpass', '2023-05-12', '1992-03-08', 'Finance', '1112223333', 'sanjay@example.com', 'Kolkata', 'non-active'),
    ('Shikha Yadav', 'shikhay', 'lisa567', '2023-06-18', '1987-11-30', 'Sales', '7778889999', 'shikha@example.com', 'Chennai', 'active'),
    ('Amitabh Khanna', 'amitabhk', 'lee1234', '2023-07-24', '1983-06-05', 'Marketing', '6667778888', 'amitabh@example.com', 'Hyderabad', 'non-active'),
    ('Meera Iyer', 'meerai', 'taylor456', '2023-08-09', '1990-10-12', 'IT', '8889990000', 'meera@example.com', 'Pune', 'active'),
    ('Anil Deshpande', 'anild', 'danpass', '2023-09-14', '1989-02-18', 'Finance', '4445556666', 'anil@example.com', 'Mysore', 'non-active'),
    ('Sneha Menon', 'sneham', 'amanda789', '2023-10-20', '1994-04-22', 'HR', '3334445555', 'sneha@example.com', 'Jaipur', 'active');



-- Insert data into Quotation table and map to vendors and users

INSERT INTO Quotation (Package, EstimatedAmount, VendorID, UserID, PlanRequestID, Status)
VALUES
    ('Basic', 15000.00, 1, 1, 1, 'pending'),  -- VendorID 1, UserID 1, PlanRequestID 1
    ('Premium', 25000.00, 1, 2, 2, 'accept'),  -- VendorID 1, UserID 2, PlanRequestID 2
    ('Classic', 20000.00, 2, 3, 3, 'pending'),  -- VendorID 2, UserID 3, PlanRequestID 3
    ('Basic', 18000.00, 2, 4, 4, 'accept'),  -- VendorID 2, UserID 4, PlanRequestID 4
    ('Premium', 27000.00, 3, 5, 5, 'pending'),  -- VendorID 3, UserID 5, PlanRequestID 5
    ('Classic', 22000.00, 3, 6, 6, 'pending'),  -- VendorID 3, UserID 6, PlanRequestID 6
    ('Basic', 16000.00, 4, 7, 7, 'accept'),  -- VendorID 4, UserID 7, PlanRequestID 7
    ('Premium', 26000.00, 4, 8, 8, 'accept'),  -- VendorID 4, UserID 8, PlanRequestID 8
    ('Classic', 21000.00, 5, 9, 9, 'pending'),  -- VendorID 5, UserID 9, PlanRequestID 9
    ('Basic', 17000.00, 5, 10, 10, 'pending');  -- VendorID 5, UserID 10, PlanRequestID 10



-- Insert data into Package table with package details
INSERT INTO Package (Type, PackageType, Services, Amount)
VALUES
    ('Wedding Bliss', 'Basic', 'Decoration, Photography', 50000.00),
    ('Royal Wedding', 'Premium', 'Decoration, Photography, Catering', 100000.00),
    ('Birthday Bash', 'Basic', 'Decoration, Entertainment', 20000.00),
    ('Corporate Retreat', 'Premium', 'Event Planning, Catering', 75000.00),
    ('Anniversary Celebration', 'Classic', 'Decoration, Photography, Music', 60000.00),
    ('Engagement Gala', 'Basic', 'Decoration, Photography', 35000.00),
    ('Sangeet Night', 'Premium', 'Decoration, Entertainment, Catering', 85000.00),
    ('Product Launch', 'Basic', 'Event Planning, Presentation', 40000.00),
    ('Farewell Party', 'Classic', 'Decoration, Photography, Music', 55000.00),
    ('Conference', 'Premium', 'Event Planning, Presentation, Catering', 90000.00);


-- Insert data into PlanRequest table with plan request detailsadmin
INSERT INTO PlanRequest (FromDate, ToDate, ServicesNeeded, Attendees, OtherServices)
VALUES
    ('2023-09-20', '2023-09-25', 'Decoration, Photography, Catering', 150, 'Additional lighting required'),
    ('2023-10-10', '2023-10-15', 'Decoration, Entertainment', 80, 'Live music and dance performance'),
    ('2023-11-05', '2023-11-10', 'Photography, Catering', 200, 'Special dietary requirements'),
    ('2023-12-15', '2023-12-20', 'Event Planning, Presentation', 50, 'High-quality projectors needed'),
    ('2024-01-08', '2024-01-13', 'Decoration, Photography, Music', 100, 'Live band and DJ required'),
    ('2024-02-20', '2024-02-25', 'Decoration, Photography', 75, 'Customized photo booth setup'),
    ('2024-03-10', '2024-03-15', 'Decoration, Entertainment, Catering', 120, 'Vegetarian and non-vegetarian menu'),
    ('2024-04-05', '2024-04-10', 'Event Planning, Presentation', 60, 'Technical support for presentations'),
    ('2024-05-15', '2024-05-20', 'Decoration, Photography, Music', 90, 'Live orchestra and dance performances'),
    ('2024-06-10', '2024-06-15', 'Event Planning, Presentation, Catering', 180, 'Full-service catering and bar setup');
    
    
    

