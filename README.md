# Playwright Java Portfolio Project

This project demonstrates:

API testing & mocking 

OAuth 2.0 flows with redirect handling 

Cross-browser execution 

Context isolation 

Auto-waiting strategies 

Page Object Model 

Complex authentication scenarios 

The complete implementation follows Playwright best practices while showcasing advanced testing capabilities.

This is a simple Java project using Playwright for browser automation, suitable for portfolio demonstration.

## How to Run

1. Install dependencies: `mvn install`
2. Run tests: `mvn test`

## Project Structure
- `pom.xml`: Maven dependencies
- `src/test/java/org/example/PlaywrightExampleTest.java`: Example Playwright tests

A great README should include:

Project Overview: Brief description of what the project does and its key features.

Setup Instructions: Step-by-step guide for installing dependencies and configuring the environment.

How to Run Tests: Clear commands to execute UI and API tests, including cross-browser and parallel options.

Project Structure: Explanation of the folder and file organization.

Key Scenarios Demonstrated: List the advanced features (API mocking, OAuth, context isolation, etc.) with short descriptions.

Troubleshooting/Common Issues: Tips for resolving potential problems.

Contribution/Contact Info: (Optional) How others can contribute or reach you.

Here’s a sample README template for your Playwright Java project:

text
# Playwright Java Advanced Portfolio Project

This project showcases advanced browser and API automation using [Playwright for Java](https://playwright.dev/java/). It demonstrates best practices for UI and API testing, API mocking, OAuth authentication scenarios, cross-browser execution, context isolation, and more.

## 🚀 Features

- **API Testing:** Includes GET, POST, and authenticated requests.
- **API Mocking:** Simulate backend responses for frontend testing.
- **OAuth 2.0 Authentication:** Automate complex login flows and token handling.
- **Cross-Browser UI Testing:** Run tests on Chromium, Firefox, and WebKit.
- **Context Isolation:** Each test runs in a fresh browser context for reliability.
- **Auto-Wait Strategies:** Uses Playwright’s auto-wait and web-first assertions.
- **Page Object Model:** Clean, maintainable UI test code.
- **Complex Scenarios:** Multi-tab, file upload, dynamic content, etc.

## 🛠️ Setup Instructions

1. **Clone this repository:**
git clone https://github.com/yourusername/playwright-java-advanced.git
cd playwright-java-advanced

text

2. **Install Java and Maven:**
- Java 8 or higher ([AdoptOpenJDK](https://adoptopenjdk.net/))
- [Maven](https://maven.apache.org/)

3. **Install dependencies:**
mvn install

text

4. **(Optional) Configure environment variables:**
- For OAuth or API tokens, set them in your shell or `.env` file.

## 🧪 Running Tests

- **All tests:**
mvn test

text

- **Cross-browser UI tests:**
Edit browser type in `CrossBrowserTest.java` or parameterize as needed.

- **API tests:**
mvn -Dtest=AuthApiTest test

text

## 📁 Project Structure

src/test/java/org/example/
├── api/
│ ├── AuthApiTest.java
│ └── MockApiTest.java
├── ui/
│ ├── CrossBrowserTest.java
│ ├── OAuthTest.java
│ └── pages/
│ ├── DashboardPage.java
│ └── LoginPage.java
└── utils/
├── TestBase.java
└── TestConfig.java

text

## 📝 Key Scenarios

- **API Mocking:** `MockApiTest` simulates backend responses.
- **OAuth Flow:** `OAuthTest` automates OAuth 2.0 login and consent.
- **Context Isolation:** Each test uses a fresh browser context for isolation.
- **Auto-Wait:** UI interactions use Playwright’s auto-wait for reliability.
- **Cross-Browser:** `CrossBrowserTest` runs the same test on multiple browsers.

## ❓ Troubleshooting

- Ensure all dependencies are installed.
- If browsers are missing, run:
mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"

text
- For OAuth tests, ensure test credentials are valid and endpoints are accessible.

---

**Feel free to reach out or contribute!**

Including a README like this will make your project much more impressive and accessible.
If you want a customized README for your exact project structure, just let me know!

yes
yes
Great! Here’s a detailed README template tailored for your advanced Playwright Java project.
You can copy this into your project as README.md before zipping and sharing.

Playwright Java Advanced Portfolio Project
This project demonstrates advanced browser and API automation using Playwright for Java. It is designed to showcase best practices and expertise in UI automation, API testing, API mocking, OAuth authentication, cross-browser execution, context isolation, and more.

🚀 Features
API Testing: GET, POST, and authenticated requests with schema validation.

API Mocking: Simulate backend responses for robust frontend testing.

OAuth 2.0 Authentication: Automate complex login flows and token handling.

Cross-Browser UI Testing: Run tests on Chromium, Firefox, and WebKit.

Context Isolation: Each test runs in a fresh browser context for reliability.

Auto-Wait Strategies: Uses Playwright’s auto-wait and web-first assertions.

Page Object Model: Clean, maintainable UI test code.

Complex Scenarios: Multi-tab, file upload, dynamic content, etc.

🛠️ Setup Instructions
Clone this repository:

text
git clone https://github.com/yourusername/playwright-java-advanced.git
cd playwright-java-advanced
Install Java and Maven:

Java 8 or higher (AdoptOpenJDK)

Maven

Install dependencies:

text
mvn install
(Optional) Configure environment variables:

For OAuth or API tokens, set them in your shell or a .env file.

Download Playwright browsers:

text
mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"
🧪 Running Tests
All tests:

text
mvn test
Run a specific test class:

text
mvn -Dtest=AuthApiTest test
Cross-browser UI tests:
Edit browser type in CrossBrowserTest.java or parameterize as needed.

📁 Project Structure
text
src/test/java/org/example/
├── api/
│   ├── AuthApiTest.java
│   └── MockApiTest.java
├── ui/
│   ├── CrossBrowserTest.java
│   ├── OAuthTest.java
│   └── pages/
│       ├── DashboardPage.java
│       └── LoginPage.java
└── utils/
    ├── TestBase.java
    └── TestConfig.java
src/test/resources/
└── testdata/
    └── mock_users.json
📝 Key Scenarios
API Mocking: MockApiTest simulates backend responses for frontend tests.

OAuth Flow: OAuthTest automates OAuth 2.0 login and consent.

Context Isolation: Each test uses a fresh browser context for isolation.

Auto-Wait: UI interactions use Playwright’s auto-wait for reliability.

Cross-Browser: CrossBrowserTest runs the same test on Chromium, Firefox, and WebKit.

Complex UI: Includes multi-tab, file upload, and dynamic content handling.

❓ Troubleshooting
Ensure all dependencies are installed.

If browsers are missing, run:

text
mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"
For OAuth tests, ensure test credentials are valid and endpoints are accessible.

For API mocking, verify the routes and mock data files are correctly configured.



Sample Website for Demo
https://practice.expandtesting.com

This site is designed specifically for automation practice and supports UI and API testing with Selenium, Playwright, and other tools.

It features login workflows, validation forms, OAuth/multi-factor authentication examples, API endpoints (with Swagger docs), drag-and-drop, popups, and more.

It is ideal for demonstrating cross-browser UI automation, authentication flows, and API mocking.

Alternative for API Mocking Demo:

https://demo.playwright.dev/api-mocking
This page is used in Playwright’s own API mocking examples and is perfect for demonstrating how to intercept and mock API responses in your tests.

Sample Mock Users
You can use the following mock user data in your tests and for API mocking:

json
[
  { "id": 1, "name": "John Doe", "email": "john.doe@example.com", "role": "admin" },
  { "id": 2, "name": "Jane Smith", "email": "jane.smith@example.com", "role": "user" },
  { "id": 3, "name": "Alice Johnson", "email": "alice.johnson@example.com", "role": "editor" }
]
Where to use:

As a mock API response for endpoints like /api/users or /users

For login/authentication test scenarios

In your mock_users.json file or as inline data in Playwright’s route.fulfill method

Example of using this data in Playwright Java:

java
page.route("**/api/users", route -> {
    String mockJson = "[{\"id\":1,\"name\":\"John Doe\",\"email\":\"john.doe@example.com\",\"role\":\"admin\"},"
                    + "{\"id\":2,\"name\":\"Jane Smith\",\"email\":\"jane.smith@example.com\",\"role\":\"user\"},"
                    + "{\"id\":3,\"name\":\"Alice Johnson\",\"email\":\"alice.johnson@example.com\",\"role\":\"editor\"}]";
    route.fulfill(new Route.FulfillOptions().setContentType("application/json").setBody(mockJson));
});
This intercepts requests to /api/users and returns your mock users, which you can verify in your UI tests.

Summary Table
Purpose	URL/Example Data
UI & API Demo Website	https://practice.expandtesting.com
API Mocking Demo	https://demo.playwright.dev/api-mocking
Sample Mock Users (JSON)	See JSON snippet above
Ready-made Mock API	https://mocki.io/v1/d4867d8b-b5d5-4a48-a4ab-79131b5809b8 (returns fake user list)
These resources will help you build realistic, robust Playwright Java portfolio tests covering UI, API, mocking, and authentication scenarios.



Jenkins Integration
Prerequisites
Jenkins installed with NodeJS and Pipeline plugins

Playwright project with tests and package.json

1. Jenkinsfile Configuration
Create a Jenkinsfile in your project root:

groovy
pipeline {
  agent any
  tools { 
    nodejs 'NodeJS_18' // Name of Node.js installation in Jenkins
  }
  stages {
    stage('Install Dependencies') {
      steps {
        sh 'npm ci'
        sh 'npx playwright install --with-deps' 
      }
    }
    stage('Run Tests') {
      steps {
        sh 'npx playwright test'
      }
    }
    stage('Publish Report') {
      steps {
        archiveArtifacts artifacts: 'playwright-report/**/*', allowEmptyArchive: true
        publishHTML([allowMissing: true, 
          reportDir: 'playwright-report', 
          reportFiles: 'index.html', 
          reportName: 'Playwright HTML Report'])
      }
    }
  }
}
2. Pipeline Setup
Create a New Item → Pipeline job in Jenkins.

Under Pipeline, select Pipeline script from SCM and link to your Git repo.

Configure triggers (e.g., GitHub webhooks for automatic builds on code push).

Azure DevOps Integration
1. azure-pipelines.yml Configuration
Create this file in your project root:

text
trigger:
- main

pool:
  vmImage: ubuntu-latest

steps:
- task: NodeTool@0
  inputs:
    versionSpec: '18.x'
  displayName: 'Install Node.js'

- script: npm ci
  displayName: 'Install dependencies'

- script: npx playwright install --with-deps
  displayName: 'Install browsers'

- script: npx playwright test
  displayName: 'Run Playwright tests'
  env:
    CI: true

- task: PublishTestResults@2
  inputs:
    testResultsFormat: 'JUnit'
    testResultsFiles: 'test-results/*.xml'
  condition: succeededOrFailed()

- task: PublishBuildArtifacts@1
  inputs:
    PathtoPublish: 'playwright-report'
    ArtifactName: 'PlaywrightReport'
  condition: succeededOrFailed()
2. Pipeline Setup
In Azure DevOps, create a new pipeline and link to your repo.

Select the azure-pipelines.yml file.

Enable triggers for automatic builds (e.g., on main branch updates).

Key Configurations for Both
Cross-Browser & Headless Execution
Playwright runs headless by default in CI. For cross-browser testing:

bash
npx playwright test --browser=all # chromium, firefox, webkit
Docker Support (Linux Agents)
Use Playwright’s Docker image to avoid browser installation:

text
# Azure DevOps example
pool:
  vmImage: ubuntu-latest
container:
  image: mcr.microsoft.com/playwright:v1.51.0-jammy
Parallel Execution
Add workers: 3 to playwright.config.ts:

ts
export default defineConfig({
  workers: 3 // Runs 3 tests in parallel
});
Troubleshooting Tips
Browser dependencies: Use npx playwright install --with-deps explicitly.

Artifact retention: Configure CI to store playwright-report for failed runs.

Environment variables: Set HEADLESS=false locally but keep CI=true in pipelines.

These configurations demonstrate best practices for integrating Playwright into CI/CD pipelines while showcasing your automation expertise.

