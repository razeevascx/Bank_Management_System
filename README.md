<div align="center">

# Bank Management System

_Empowering Financial Institutions with Modern, Secure, and Scalable Banking Solutions_

![Last Commit](https://img.shields.io/github/last-commit/razeevascx/Bank_Management_System?label=last%20commit&color=blue&style=flat-square)
![Java](https://img.shields.io/badge/java-100%25-blue?style=flat-square)
![Languages](https://img.shields.io/github/languages/count/razeevascx/Bank_Management_System?label=languages&color=orange&style=flat-square)

**Built with the tools and technologies:**

![Java](https://img.shields.io/badge/-Java-blue?style=flat-square&logo=java)
![Spring Boot](https://img.shields.io/badge/-Spring%20Boot-green?style=flat-square&logo=springboot)
![Maven](https://img.shields.io/badge/-Maven-red?style=flat-square&logo=apachemaven)
![React](https://img.shields.io/badge/-React-blue?style=flat-square&logo=react)
![TypeScript](https://img.shields.io/badge/-TypeScript-blue?style=flat-square&logo=typescript)
![Vite](https://img.shields.io/badge/-Vite-purple?style=flat-square&logo=vite)
![TailwindCSS](https://img.shields.io/badge/-TailwindCSS-teal?style=flat-square&logo=tailwindcss)
![ESLint](https://img.shields.io/badge/-ESLint-blue?style=flat-square&logo=eslint)

</div>

## Database Schema

![Bank Management System Demo](https://raw.githubusercontent.com/razeevascx/Bank_Management_System/main/Backend/diagram-export-22-02-2025-14_20_40.png)

## Tech Stack

- **Backend:** Java 23, Spring Boot 3, Maven
- **Frontend:** React 19, TypeScript, Vite, TailwindCSS
- **Testing:** JUnit (backend), ESLint (frontend)
- **Infrastructure:** Docker Compose

## Installation & Setup

1. **Clone the Repository**

   ```powershell
   git clone https://github.com/razeevascx/Bank_Management_System.git
   ```

2. **Navigate to Project**

   ```powershell
   cd Bank_Management_System
   ```

3. **Backend Setup**

   - Navigate to Backend folder:
     ```powershell
     cd Backend
     ```
   - Build and run the backend (Java & Maven required):
     ```powershell
     mvnw spring-boot:run
     ```

4. **Frontend Setup**

   - Open a new terminal and navigate to Frontend folder:
     ```powershell
     cd ../Frontend
     ```
   - Install dependencies:
     ```powershell
     pnpm install
     ```
   - Start development server:
     ```powershell
     pnpm dev
     ```

5. **Verify Installation**
   - Backend: http://localhost:8080
   - Frontend: http://localhost:5173

## Contributing

We welcome contributions! Please follow these steps:

### 1. Report Bugs

- Create a [new issue](https://github.com/razeevascx/Bank_Management_System/issues)
- Include detailed steps to reproduce the bug
- Add screenshots if relevant
- Specify your environment (OS, browser version, etc.)

### 2. Suggest Features

- Use our [feature request template](https://github.com/razeevascx/Bank_Management_System/issues/new?template=feature_request.md)
- Explain the problem you're trying to solve
- Describe the solution you'd like
- List any alternatives you've considered

### 3. Submit Code Changes

1. Fork the repository
2. Create a new branch (`git checkout -b feature/improvement`)
3. Make your changes
4. Run tests (`mvn test` for backend, `pnpm lint` for frontend)
5. Commit with clear messages (`git commit -m 'Add: feature X'`)
6. Push to your fork (`git push origin feature/improvement`)
7. Open a Pull Request

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](LICENSE) file for details.
