
Feature: Update application in storeMate Online

#  Scenario: Install new MSE Application package
#  | Username | Password  | Application | Path                                                  |
#  | Admin    | Admin     | MSE         | \\\\ho-buildwb-essc\\Builds\\MSE3\\v3.5\\Setup\\Bin\\ |
#
#    Given I log in on my local storeMate Online environment
#
#    When I want to install the new application package
#
#    Then I want to validate the installed application version



  Scenario: Install new SCO Application package

    Given I log in on my local storeMate Online environment
      | Username | Password  | Application | Path                                               |
      | Admin    | Admin     | SCO         | \\\\ho-buildwb-essc\\Builds\\SCO\\v3.6\\Setup\\Bin\\ |

    When I want to install the new application package
      | Username | Password  | Application | Path                                               |
      | Admin    | Admin     | SCO         | \\\\ho-buildwb-essc\\Builds\\SCO\\v3.6\\Setup\\Bin\\ |

    Then I want to validate the installed application version
      | Username | Password  | Application | Path                                               |
      | Admin    | Admin     | SCO         | \\\\ho-buildwb-essc\\Builds\\SCO\\v3.6\\Setup\\Bin\\ |













