# Product Catalog

## Overview
The **Product Catalog** is a RESTful web service built using **Java** and **Spring Boot** that allows users to manage product data efficiently. It provides **JWT-based authentication** for secure access and supports CRUD operations on product information. **Postman** is used for API testing and interaction.

## Features
- **User Authentication** using JWT tokens.
- **Role-Based Access Control** (Admin/User roles).
- **CRUD Operations** for product management.
- **Secure API Endpoints** using Spring Security.
- **Postman API Collection** for testing.

## Technologies Used
- **Java 17**
- **Spring Boot 3.x**
- **Spring Security & JWT**
- **Spring Data JPA (Hibernate)**
- **MySQL Database**
- **Postman (for API testing)**

## Installation
### Prerequisites
Ensure you have the following installed:
- Java 17 or later
- Maven
- MySQL Database
- Postman (optional but recommended)

### Steps to Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/product-catalog.git
   cd product-catalog
   ```
2. Configure the database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/product_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. Build and run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## API Endpoints
### Authentication
- **Register a new user:** `POST /api/auth/register`
- **Login and get JWT Token:** `POST /api/auth/login`

### Product Management (Requires JWT Token)
- **Get all products:** `GET /api/products`
- **Get product by ID:** `GET /api/products/{id}`
- **Create a new product:** `POST /api/products` (Admin only)
- **Update a product:** `PUT /api/products/{id}` (Admin only)
- **Delete a product:** `DELETE /api/products/{id}` (Admin only)

## Usage with Postman
1. Import the Postman collection (provided in the repo).
2. Authenticate using `POST /api/auth/login` to get a JWT token.
3. Use the token in the **Authorization Header** for product API requests:
   ```
   Authorization: Bearer <your_jwt_token>
   ```
4. Perform CRUD operations on products.

## Security & Authentication
- Users must authenticate via **JWT** before accessing protected endpoints.
- Admin users can perform **create, update, and delete** operations on products.
- Regular users can only **view** product details.

## Contributing
1. Fork the repository.
2. Create a new branch (`feature-branch`).
3. Commit your changes.
4. Push to your forked repository.
5. Create a pull request.

## License
This project is licensed under the **MIT License**.

## Contact
For any issues or suggestions, feel free to contact:
- **Email:** vishwavish707@gmail.com
- **GitHub:** [vishwa707](https://github.com/vishwa707)
