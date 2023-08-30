# E-Event Management System API

This project is a RESTful CRUD API for an E-Event Management System, developed using Spring Boot, PostgreSQL, Spring Security, JWT authentication with HTTP-only cookies, and JPA/Hibernate for data persistence.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [API Endpoints](#api-endpoints)
- [Authentication](#authentication)
- [Data Models](#data-models)
- [Roles and Permissions](#roles-and-permissions)


## Features

- Create, Read, Update, and Delete events.
- Allow users to buy tickets for events.
- Organizers can add new events.
- Moderators can manage users, edit roles, and accept/refuse events.
- Secure endpoints using JWT authentication with HTTP-only cookies and Spring Security.
- Utilize PostgreSQL database for data storage.
- Implement JPA and Hibernate for database interactions.

## Prerequisites

- Java JDK 11+
- PostgreSQL database
- Maven

## Getting Started

1. Clone the repository: `git clone https://github.com/AS-JD/E-Event-mangement-Sytem-API.git`
2. Navigate to the project directory: `cd E-Event-mangement-Sytem-API`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

## Configuration

- Configure PostgreSQL database connection in `src/main/resources/application.properties`.

## API Endpoints

### Events

- **GET /api/events**: Get a list of all events.
- **GET /api/events/{id}**: Get details of a specific event.
- **POST /api/events**: Create a new event.
- **PUT /api/events/{id}**: Update an existing event.
- **DELETE /api/events/{id}**: Delete an event.

### Transactions

- **POST /api/transactions**: Create a transaction (buy a ticket).

### Users

- **GET /api/users**: Get a list of all users.
- **GET /api/users/{id}**: Get details of a specific user.
- **PUT /api/users/{id}**: Update user details.


## Authentication

- JWT (JSON Web Tokens) are used for authentication.
- Endpoints are secured using Spring Security and JWT filters.
- JWT tokens are stored in HTTP-only cookies for added security against XSS attacks.

## Data Models

- Event
  - id
  - name
  - date
  - location
  - description

- Transaction
  - id
  - userId
  - eventId
  - purchaseDate

- User
  - id
  - username
  - email
  - password
  - roles


## Roles and Permissions

- User: Buy tickets for events.
- Organizer: Add new events.
- Moderator: Manage users, edit roles, and accept/refuse events.


