$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("keyBoardLayout.feature");
formatter.feature({
  "line": 2,
  "name": "Keyboard layout editor",
  "description": "",
  "id": "keyboard-layout-editor",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "I want to add a keyboard of type \u003cKeyboard type\u003e",
  "description": "",
  "id": "keyboard-layout-editor;i-want-to-add-a-keyboard-of-type-\u003ckeyboard-type\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I log in on the central storeMate Online environment",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 6
    },
    {
      "cells": [
        "Admin",
        "Admin"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I navigate to POS Keyboard maintenance",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I create a new keyboard layout",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the keyboard uses colour scheme \u003cColour scheme\u003e and font scheme \u003cFont scheme\u003e",
  "rows": [
    {
      "cells": [
        "\u003cKeyboard type\u003e",
        "\u003cColour scheme\u003e",
        "\u003cFont scheme\u003e"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "keyboard-layout-editor;i-want-to-add-a-keyboard-of-type-\u003ckeyboard-type\u003e;",
  "rows": [
    {
      "cells": [
        "Keyboard type",
        "Colour scheme",
        "Font scheme"
      ],
      "line": 15,
      "id": "keyboard-layout-editor;i-want-to-add-a-keyboard-of-type-\u003ckeyboard-type\u003e;;1"
    },
    {
      "comments": [
        {
          "line": 16,
          "value": "#| Large Touch               | TCx Elevate FO colour scheme  | Arial         |"
        },
        {
          "line": 17,
          "value": "#| Large Touch               | TCx Elevate FO colour scheme  | Open Sans     |"
        },
        {
          "line": 18,
          "value": "#| Large Touch               | storeMate FO colour scheme    | Arial         |"
        },
        {
          "line": 19,
          "value": "#| Large Touch               | storeMate FO colour scheme    | Open Sans     |"
        },
        {
          "line": 20,
          "value": "#| Touch Alphanumeric        | TCx Elevate FO colour scheme  | Arial         |"
        },
        {
          "line": 21,
          "value": "#| Touch Alphanumeric        | TCx Elevate FO colour scheme  | Open Sans     |"
        },
        {
          "line": 22,
          "value": "#| Touch Alphanumeric        | storeMate FO colour scheme    | Arial         |"
        },
        {
          "line": 23,
          "value": "#| Touch Alphanumeric        | storeMate FO colour scheme    | Open Sans     |"
        },
        {
          "line": 24,
          "value": "#| Touch image presets (4x5)| TCx Elevate FO colour scheme  | Arial         |"
        },
        {
          "line": 25,
          "value": "#| Touch image presets (4x5)| TCx Elevate FO colour scheme  | Open Sans     |"
        },
        {
          "line": 26,
          "value": "#| Touch image presets (4x5)| storeMate FO colour scheme    | Arial         |"
        },
        {
          "line": 27,
          "value": "#| Touch image presets (4x5)| storeMate FO colour scheme    | Open Sans     |"
        }
      ],
      "cells": [
        "Touch image presets (5x6)",
        "TCx Elevate FO colour scheme",
        "Arial"
      ],
      "line": 28,
      "id": "keyboard-layout-editor;i-want-to-add-a-keyboard-of-type-\u003ckeyboard-type\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "comments": [
    {
      "line": 16,
      "value": "#| Large Touch               | TCx Elevate FO colour scheme  | Arial         |"
    },
    {
      "line": 17,
      "value": "#| Large Touch               | TCx Elevate FO colour scheme  | Open Sans     |"
    },
    {
      "line": 18,
      "value": "#| Large Touch               | storeMate FO colour scheme    | Arial         |"
    },
    {
      "line": 19,
      "value": "#| Large Touch               | storeMate FO colour scheme    | Open Sans     |"
    },
    {
      "line": 20,
      "value": "#| Touch Alphanumeric        | TCx Elevate FO colour scheme  | Arial         |"
    },
    {
      "line": 21,
      "value": "#| Touch Alphanumeric        | TCx Elevate FO colour scheme  | Open Sans     |"
    },
    {
      "line": 22,
      "value": "#| Touch Alphanumeric        | storeMate FO colour scheme    | Arial         |"
    },
    {
      "line": 23,
      "value": "#| Touch Alphanumeric        | storeMate FO colour scheme    | Open Sans     |"
    },
    {
      "line": 24,
      "value": "#| Touch image presets (4x5)| TCx Elevate FO colour scheme  | Arial         |"
    },
    {
      "line": 25,
      "value": "#| Touch image presets (4x5)| TCx Elevate FO colour scheme  | Open Sans     |"
    },
    {
      "line": 26,
      "value": "#| Touch image presets (4x5)| storeMate FO colour scheme    | Arial         |"
    },
    {
      "line": 27,
      "value": "#| Touch image presets (4x5)| storeMate FO colour scheme    | Open Sans     |"
    }
  ],
  "line": 28,
  "name": "I want to add a keyboard of type Touch image presets (5x6)",
  "description": "",
  "id": "keyboard-layout-editor;i-want-to-add-a-keyboard-of-type-\u003ckeyboard-type\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I log in on the central storeMate Online environment",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 6
    },
    {
      "cells": [
        "Admin",
        "Admin"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I navigate to POS Keyboard maintenance",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I create a new keyboard layout",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the keyboard uses colour scheme TCx Elevate FO colour scheme and font scheme Arial",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "rows": [
    {
      "cells": [
        "Touch image presets (5x6)",
        "TCx Elevate FO colour scheme",
        "Arial"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "keyBoardLayout.i_log_in_on_the_central_storeMate_Online_environment(String\u003e\u003e)"
});
formatter.result({
  "duration": 13785809800,
  "status": "passed"
});
formatter.match({
  "location": "keyBoardLayout.i_navigate_to_POS_Keyboard_maintenance()"
});
formatter.result({
  "duration": 2206129600,
  "status": "passed"
});
formatter.match({
  "location": "keyBoardLayout.i_create_a_new_keyboard_layout()"
});
formatter.result({
  "duration": 130387300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TCx Elevate FO colour scheme",
      "offset": 32
    },
    {
      "val": "Arial",
      "offset": 77
    }
  ],
  "location": "keyBoardLayout.the_keyboard_uses_colour_scheme_and_font_scheme(String,String,String\u003e\u003e)"
});
formatter.result({
  "duration": 16524157300,
  "status": "passed"
});
});