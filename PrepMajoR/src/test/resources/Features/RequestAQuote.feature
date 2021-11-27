Feature: As a user on prepmajor
  I want to see the request a quote form
  So that i will see and fill the request a quote form.

  Scenario: Request A Quote Form
    Given a user navigate to prepmajor
    When a user clicks on pricing on the header
    And a user clicks on request a quote at the customize plan card
    And a user enter in the name box
    And a user enter in the email box
    And a user enter in the company name box
    And a user enter in phone number
    And a user enter in the country box
    And a user click yes to book a free demo
    And a user click No doesn't want to book a free demo
    And a user select Yes-Book a meeting from the dropdown menu
    And a user select No-someone will contact you at a later date to arrange a meeting
    And a user enter message in the message box
    And a user click on the submit button
    Then Thank you for your message. It has been sent is displayed successfully

