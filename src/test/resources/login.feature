Feature: Login

@smoke
Scenario: Successful login with valid credentials
Given User launch chrome browser
When User opens url"https://careglp-staging.carevalidate.com/"
And user enters Email as"qa+employee@carevalidate.com" 
And user click on login with password
And user enter password as "bLPgk5tr7D3ZqpXvV@aNKz"
And click on continue button
And close browser

@smoke
Scenario: Verify that user should not be login with valid email name and invalid password.
Given User launch chrome browser
When User opens url"https://careglp-staging.carevalidate.com/"
And user enters Email as"qa+employee@carevalidate.com" 
And user click on login with password
And user enter password as "bLPgk5tr7D3ZqpXvV@aNKzpss"
And click on continue button
Then message display "Invalid email or password"

@smoke
Scenario: Verify that user should not login with invalid email and valid password.
Given User launch chrome browser
When User opens url"https://careglp-staging.carevalidate.com/"
And user enters Email as"qa+employee@carevalidate.commmm" 
And user click on login with password
And user enter password as "bLPgk5tr7D3ZqpXvV@aNKz"
And click on continue button
Then message display "Invalid email or password"

@smoke
Scenario: Verify that user should not login with invalid email and invalid password.
Given User launch chrome browser
When User opens url"https://careglp-staging.carevalidate.com/"
And user enters Email as"qa+employee@carevalidate.commmm" 
And user click on login with password
And user enter password as "bLPgk5tr7D3ZqpXvV@aNKzpss"
And click on continue button
Then message display "Invalid email or password"

@smoke
Scenario: user create new request and validate success message
Given User launch chrome browser
When User opens url"https://careglp-staging.carevalidate.com/"
And user enters Email as"qa+employee@carevalidate.com" 
And user click on login with password
And user enter password as "bLPgk5tr7D3ZqpXvV@aNKz"
And click on continue button
And user go to accomodation
Then user go to new request
Then user click on Weight Loss Eligibility Intake Form
And user select female from What was your gender at birth and click on comtinue
And user enters as"Yes"in What is your age Are you older than field
And user enters as"5.2"in What is your height
And user enters as"50"How much do you weigh 
And user select none of the above from Do you have any of the following conditions
And user select Eating disorders from Do you have any of the following conditions
And user select maintain my healthy waight from What are your weight loss goals
And user select exercise waight from What weight loss initiatives have you tried in the past
And user select date of birth
And user enters emailaddress as"priyankasapkal10@gmail.com"
And user enters phoneNumber as"8989879747"
And user enters shippingAddress as"ap-baramati"
And user enters city as"baramati"
And user enters state as"maharastra"
And user enters pincode as"413104"
And user select No from Do you require translation services
And user enter preferred language"Hindi"
And user upload government issued ID 
And user click on submitbutton
And user click on submit 
Then user confirm success message " Thank you for your submission. We have sent you a confirmation email for your records. 
And click on closebtn


Scenario: user confirm the submission
Given User launch chrome browser
When User opens url"https://careglp-staging.carevalidate.com/"
And user enters Email as"qa+employee@carevalidate.com" 
And user click on login with password
And user enter password as "bLPgk5tr7D3ZqpXvV@aNKz"
And click on continue button
And user click on myrequest
And close browser
