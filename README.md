# the-interenet-Heroku-Automation-with-Selenium-
Automated Tests using Selenium Webdriver for various applications on the-internet Heroku app.
Testing is done on various pages each consisting of certain common webapp features. 

Features Tested: Basic Authentication, Sortable Data Tables, Dynamic Controls, File Download, File Upload, iFrames, and JavaScript Alerts

Site link: https://the-internet.herokuapp.com/

**Test Cases**: 

**Basic Auth**: 

Pre-conditions: Open the Main Page

Test steps: 
            1) Click the "Basic Auth" link and perform basic authentication
            2) Accept Alert 
            
Expected Results: A success message is displayed on the Basic Auth page.

**Sortable Data Tables**:

Preconditions: Open the Main page 

Test Steps: 1) Click the "Sortable Data Tables" link 

Expected Result: Example 1 dues sum equals 251.0

**Dynamic Controls**:

Preconditions: Open the Main page 

Test Steps: 
            1) Click the "Dynamic Controls" link 
            2) Click the "Enable" button Step 3: Send random text to Enable/disable input 
            
Expected Result: Enable/disable input is enabled and random text is displayed

**File Download**:

Preconditions: Open the Main page 

Test Steps: 
            1) Click the "File Download" link 
            2) Download "Test.txt" file 
           
Expected Result: "Test.txt" file is downloaded (File name changes regularly so you have to choose a file from the site page)

**File Upload**:

Preconditions: Open the Main page 

Test Steps: 
           1) Click the "File Upload" link 
           2) Upload the file and click Upload button 
           
Expected Result: File name on Upload page is correct

**iFrames**:

Preconditions: Open the Main page 

Test Steps: 
           1) Click the "Frames" link 
           2) Click the "iFrame" link 
           3) Input random generated text to the text editor 
           4) Undo changes with Edit menu 
           
Expected Result: "Your content goes here." text is displayed in the editor after undoing changes

**JavaScript Alerts**:

Preconditions: Open the Main page 

Test Steps:
           1) Click the "JavaScript Alerts" link 
           2) Click the "Click for JS Alert" button 
           3) Accept alert 
           
Expected Result: Success message is displayed on the JavaScript Alert page
