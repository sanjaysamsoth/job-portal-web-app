# Job Portal Application

This Job Portal Application is a feature-rich platform designed to connect job seekers with recruiters, enabling seamless profile management, job posting, and application tracking. Built using **Spring Framework**, it integrates **Spring Security** and **JWT** for secure access and authentication, providing a robust backend for handling job applications, profile management, and more.

## Features

- **User Registration and Login**: Secure login for both job seekers and recruiters.
- **Job Seeker Profiles**: Users can create and update profiles, upload resumes, and maintain a list of skills.
- **Recruiter Profiles**: Recruiters can manage profiles, post jobs, and view applicants.
- **Job Posting and Application Management**: Recruiters can post jobs, while job seekers can view and save jobs.
- **Resume Upload & Download**: Supports secure upload and download of resumes for job seekers.
- **Save Job Feature**: Allows job seekers to save job postings for later.
- **Spring Security Integration**: Authentication and authorization using Spring Security and JWT.
- **File Handling**: Upload and retrieve files with Spring's MultipartFile.

## Tech Stack

- **Java 17**
- **Spring Framework 3.x** - Spring Boot, Spring Data JPA, Spring Security
- **JWT** - JSON Web Token for secure authentication
- **MySQL** - Relational database management
- **Thymeleaf** - Server-side Java template engine for dynamic web content
- **HTML/CSS** - Frontend for basic UI
- **Maven** - Project management and build tool

## Architecture

This application is based on a multi-layered architecture to manage dependencies between various components:
- **Controller Layer**: Handles HTTP requests and routes to specific services.
- **Service Layer**: Implements business logic and interacts with the repository layer.
- **Repository Layer**: Provides CRUD operations for interacting with the database.

## Setup and Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/sanjaysamsoth/job-portal-web-app.git
   cd job-portal-web-app
2. **Configure the Database**:
   - Set up a MySQL database.
   - Update application.properties or application.yml with your database credentials.
3. **Run the Application**:
   ```bash
   mvn spring-boot:run
4. **Access the Application**:
   - The application should be running at http://localhost:8080.
## Usage
- **Register as a User**:
  - Navigate to /register to sign up as a Job Seeker or Recruiter.
- **Manage Profiles**:
  - For job seekers: View and update profiles, upload resumes, and add skills.
  - For recruiters: Manage profiles and create job posts.
- **Save and Apply for Jobs**:
  - Job seekers can save jobs for later or directly apply for open positions.
- **Dashboard**:
  - Access the dashboard for personalized actions like managing saved jobs and job applications.
## API Endpoints
### Authentication
- POST /register/new - Register a new user.
- GET /login - User login page.
### Job Seeker Profile
- GET /job-seeker-profile/ - View job seeker profile.
- POST /job-seeker-profile/addNew - Create or update job seeker profile.
### Recruiter Profile
- GET /recruiter-profile/ - View recruiter profile.
- POST /recruiter-profile/addNew - Create or update recruiter profile.
### Job Posting and Management
- POST /job-details/save/{id} - Save a job to the job seeker’s list.
- GET /saved-jobs/ - View all saved jobs for a job seeker.
### File Management
- POST /job-seeker-profile/addNew - Upload resume and profile photo for job seekers.
- GET /job-seeker-profile/downloadResume - Download a job seeker’s resume.

## Screenshots
![Screenshot (700)](https://github.com/user-attachments/assets/519821b9-f0c3-4b34-8e8e-b1e3698afe1c)

![Screenshot (703)](https://github.com/user-attachments/assets/e4a89b71-8ec4-4c50-8801-e4a03e1b01fb)

![Screenshot (702)](https://github.com/user-attachments/assets/631ac254-228f-45bb-a7c7-f1d7b5f423f1)

