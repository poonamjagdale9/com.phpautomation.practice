
 Feature: Validate SignIn Feature

   Scenario: Validate sigIn_Page with Invalid data

     Given Customer is on homepage
     When Customer Click on SignIn link
     Then customer is on login_page
     Then customer enters emailId and clicked on createAnAccount button
     Then customer fill personalInformation
     Then customer select date of birth
     Then customer fills address and invalid zip code and click on register button
     Then customer should see error message

     Scenario: Validate signIn_Page with Valid data

       Given Customer is on homepage
       When Customer Click on SignIn link
       Then customer is on login_page
       Then customer enters emailId and clicked on createAnAccount button
       Then customer fill personalInformation
       Then customer select date of birth
       Then customer fills address and Valid zip code and click on register button
       Then customer should be on My Account Page