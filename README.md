# MyPortfolio — Archna's Java Developer Portfolio

A responsive portfolio built with:
- Java 17 and Spring Boot
- HTML, CSS and vanilla JavaScript
- A starter contact endpoint with request validation

## Run in Spring Tool Suite (STS)

1. Extract the ZIP file.
2. In STS, choose **File → Import → Maven → Existing Maven Projects**.
3. Select the extracted `MyPortfolio` folder and finish the import.
4. Wait for Maven dependencies to download.
5. Open `MyPortfolioApplication.java`.
6. Right-click → **Run As → Spring Boot App**.
7. Open http://localhost:8080 in your browser.

## Contact form note

The contact endpoint is `POST /api/contact`. It validates the submitted fields but does not store messages, send email, or persist personal data yet. Add a database/email integration before using the form for real visitors.

## Personalize before publishing

- Confirm the project descriptions match work you can discuss in an interview.
- Add a professional email address and LinkedIn profile.
- Add a CV PDF only after you have checked the file contains the details you want to publish.
- Review all personal information before deploying publicly.
