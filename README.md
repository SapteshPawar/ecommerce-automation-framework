# E-commerce Automation Framework – Selenium Project

## Project Overview
This is a **junior-level Selenium automation framework** built using Java and TestNG.  
It automates an end-to-end e-commerce flow including login, product filtering, adding items to cart, and validation.

The project demonstrates **clean automation practices**, including Page Object Model (POM), data-driven testing, explicit waits, and screenshot capture on failure.

---

## Features
- End-to-end test automation (Login → Filter → Add to Cart → Validate Cart)
- Page Object Model (POM) design pattern
- Data-driven testing using TestNG DataProvider
- Explicit waits for stable execution
- Screenshot capture on test failure (TestNG Listener)
- Positive and negative test scenarios
- Reusable and maintainable framework structure

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
- Apply product filter (Price: Low to High)
- Add product to cart
- Navigate to cart
- Verify product name is displayed

### Negative Scenario
- Login with invalid credentials
- Validate error message is displayed

---

## Test Website
https://www.saucedemo.com/

---

## Screenshots on Failure
Screenshots are automatically captured when a test fails and stored in the `/screenshots` folder.

### Example:
<img width="1920" height="847" alt="forceFailureForScreenshot_20260320_140053" src="https://github.com/user-attachments/assets/8b199bfc-53fa-4bb1-b129-7fba7998b090" />


---

## How to Run the Project
1. Clone the repository: git clone https://github.com/SapteshPawar/ecommerce-automation-framework.git
2. Open in Eclipse as a Maven Project
3. Run tests: Right Click → testng.xml → Run As → TestNG Suite

---

## What I Learned
- Building Selenium framework using Page Object Model
- Implementing data-driven testing using TestNG
- Handling dynamic elements using explicit waits
- Capturing screenshots using TestNG listeners
- Writing clean and maintainable automation code
- Using Git and GitHub for version control

---

## Why This Project
This project focuses on **automation fundamentals and real-world test scenarios** rather than complex frameworks.  
It demonstrates the ability to build **stable, readable, and maintainable automation tests**, which is essential for junior QA roles.

---

## Author
Saptesh Pawar
