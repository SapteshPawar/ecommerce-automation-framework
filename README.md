# E-commerce Automation Framework – Selenium Project

## Project Overview
This is a **junior-level Selenium automation framework** built using Java and TestNG.  
It automates an end-to-end e-commerce flow including login, product filtering, adding items to cart, and validation.

The goal of this project is to demonstrate **clean automation practices**, including Page Object Model, data-driven testing, and handling test failures with screenshots.

---

## Features
- End-to-end test automation (Login → Filter → Add to Cart → Validate)
- Page Object Model (POM) design pattern
- Data-driven testing using TestNG DataProvider
- Explicit waits for stable test execution
- Screenshot capture on test failure
- Positive and negative test scenarios
- Clean and maintainable project structure

---

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)

---

## Project Structure
```
ecommerce-automation-framework
│
├── src/test/java
│   ├── base        → WebDriver setup
│   ├── pages       → Page Object classes
│   ├── tests       → Test classes
│   ├── utils       → Utilities (DataProvider, Screenshot)
│   └── listeners   → TestNG listeners
│
├── testng.xml
├── pom.xml
└── README.md
```

---

## Test Scenarios

### Positive Scenario
- Login with valid credentials
- Apply product filter
- Add product to cart
- Verify product is displayed in cart

### Negative Scenario
- Login with invalid credentials
- Validate that login fails and user stays on login page

---

## Screenshots on Failure
Screenshots are automatically captured when a test fails and stored in the `/screenshots` folder for debugging.

---

## How to Run the Project

1. Clone the repository: git clone https://github.com/SapteshPawar/ecommerce-automation-framework.git
2. Open in Eclipse as a Maven Project
3. Run tests: Right Click → testng.xml → Run As → TestNG Suite


---

## What I Learned
- Building a Selenium automation framework from scratch
- Implementing Page Object Model (POM)
- Writing stable tests using explicit waits
- Using TestNG DataProvider for multiple test scenarios
- Capturing screenshots automatically on failure
- Using Git and GitHub for version control

---

## Why This Project
This project focuses on **automation fundamentals** rather than complex frameworks.  
It is designed to demonstrate **clean, readable, and maintainable test automation code** suitable for junior QA roles.

---

## Author
Saptesh Pawar
