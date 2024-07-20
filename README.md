# Spring Boot Demo Application (sb-demo-app)

This project contains a **Spring Boot Demo Application**. It is used for testing GitHub Actions and project configuration.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Contributing](#contributing)
- [License](#license)

## Introduction
The **sb-demo-app** is a simple Spring Boot application designed to demonstrate and test various features of GitHub Actions and project configuration. It serves as a sandbox for experimenting with CI/CD pipelines, automated testing, and other project management tools.

## Features
- Spring Boot framework setup
- Sample REST API
- GitHub Actions workflow for CI/CD
- Unit and integration tests
- Application properties configuration
- Test the triggering pipeline with excluded README.md file

## Installation
To set up the project locally, follow these steps:

1. **Clone the repository**:
    ```sh
    git clone https://github.com/yourusername/sb-demo-app.git
    cd sb-demo-app
    ```

2. **Build the project**:
    ```sh
    ./mvnw clean install
    ```

3. **Run the application**:
    ```sh
    ./mvnw spring-boot:run
    ```

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure that your code follows the project's coding standards and passes all tests.

1. **Fork the repository**

2. **Create a new branch:**
    ```sh
    git checkout -b feature/your-feature-name
    ```

3. **Commit your changes:**
    ```sh
    git commit -m 'Add some feature'
    ```

4. **Push to the branch:**
    ```sh
    git push origin feature/your-feature-name
    ```

5. **Create a pull request**

## License

This project is licensed under the MIT License. See the LICENSE file for more details.
