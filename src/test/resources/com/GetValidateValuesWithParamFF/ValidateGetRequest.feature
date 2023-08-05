Feature: Validate Get Request

Scenario: 1.Validate Get Request for Book
Given hit the URI1
Then validate title "Git Pocket Guide" and pages "234" of application


#Scenario: 2.Validate Get Request for Book attributes
#Given hit the URI2
#Then validate subTitle "A Working Introduction"
#Then validate isbn "9781449325862"
#Then validate author "Richard E. Silverman"
#Then validate publisher "O'Reilly Media"

#Scenario: 3.Validate Get Request for Book attributes
#Given hit the URI2
#Then validate value for "books[0].title" is "Git Pocket Guide"
#    Then validate value for "books[0].pages" is "234" 
#    Then validate value for "books[0].author" is "Richard E. Silverman" 
#    Then validate value for "books[0].publisher" is "O'Reilly Media" 
#    Then validate value for "books[1].title" is "Learning JavaScript Design Patterns"

Scenario: 4.Validate Get Request for Book titles
Given hit the URI1
Then validate value for attribute "title" is "Git Pocket Guide" present in response
Then validate value for attribute "author" is "Axel Rauschmayer11" present in response
