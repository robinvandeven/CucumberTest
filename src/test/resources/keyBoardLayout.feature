@run
Feature: Keyboard layout editor

Scenario Outline: I want to add a keyboard of type <Keyboard type>
 Given I log in on the central storeMate Online environment
      | Username | Password  |
      | Admin    | Admin     |

 When I navigate to POS Keyboard maintenance
 And  I create a new keyboard layout
 Then the keyboard uses colour scheme <Colour scheme> and font scheme <Font scheme>
      | <Keyboard type> | <Colour scheme> | <Font scheme> |

Examples:
| Keyboard type             | Colour scheme                 | Font scheme   |
#| Large Touch               | TCx Elevate FO colour scheme  | Arial         |
#| Large Touch               | TCx Elevate FO colour scheme  | Open Sans     |
#| Large Touch               | storeMate FO colour scheme    | Arial         |
#| Large Touch               | storeMate FO colour scheme    | Open Sans     |
#| Touch Alphanumeric        | TCx Elevate FO colour scheme  | Arial         |
#| Touch Alphanumeric        | TCx Elevate FO colour scheme  | Open Sans     |
#| Touch Alphanumeric        | storeMate FO colour scheme    | Arial         |
#| Touch Alphanumeric        | storeMate FO colour scheme    | Open Sans     |
#| Touch image presets (4x5)| TCx Elevate FO colour scheme  | Arial         |
#| Touch image presets (4x5)| TCx Elevate FO colour scheme  | Open Sans     |
#| Touch image presets (4x5)| storeMate FO colour scheme    | Arial         |
#| Touch image presets (4x5)| storeMate FO colour scheme    | Open Sans     |
| Touch image presets (5x6)| TCx Elevate FO colour scheme  | Arial         |
#| Touch image presets (5x6)| TCx Elevate FO colour scheme  | Open Sans     |
#| Touch image presets (5x6)| storeMate FO colour scheme    | Arial         |
#| Touch image presets (5x6)| storeMate FO colour scheme    | Open Sans     |
#| Touch image presets (6x7)| TCx Elevate FO colour scheme  | Arial         |
#| Touch image presets (6x7)| TCx Elevate FO colour scheme  | Open Sans     |
#| Touch image presets (6x7)| storeMate FO colour scheme    | Arial         |
#| Touch image presets (6x7)| storeMate FO colour scheme    | Open Sans     |




