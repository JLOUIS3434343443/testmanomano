Feature: Mano


 Scenario: Search  1
    Given A user navigates to HomePageManomanoUK
    When a user searches for "chair" and click into first suggestions
    Then "Chair" is displayed in the new page
 
# 
#  Scenario: Search 2
#    Given A user navigates to HomePageManomanoUK
#    When a user searches for "table" and click into second suggestion
#    Then "Table" is displayed in the new page
#    
#    Scenario: Search 3
#    Given A user navigates to HomePageManomanoUK
#    When a user searches for "HOMCOM" and click into first suggestion
#    Then "HOMCOM" is displayed in the new page
#
#    
#       Scenario: Search 4
#    Given A user navigates to HomePageManomanoUK
#    When a user searches for "HOMCOM" and click into second suggestion
#    Then "HOMCOM" is displayed in the new page