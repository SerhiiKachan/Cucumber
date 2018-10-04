Feature: Log in to gmail, select messages, delete messages, undo deleting, check whether undo completed

    Scenario Outline: Log in to gmail
        Given I have my data("<email>","<password>")
        When I open gmail authorization form
        When I type my email and password
        Then I will see my email in account window

        Examples:
                | email | password |
                | serkach.test@gmail.com | QwErTy123456 |
