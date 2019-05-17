$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/keyBoardLayout.feature");
formatter.feature({
  "name": "Keyboard layout editor",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.scenarioOutline({
  "name": "I want to add a keyboard of type \u003cKeyboard type\u003e",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I log in on the central storeMate Online environment",
  "keyword": "Given ",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Admin",
        "Admin"
      ]
    }
  ]
});
formatter.step({
  "name": "I navigate to POS Keyboard maintenance",
  "keyword": "When "
});
formatter.step({
  "name": "I create a new keyboard layout",
  "keyword": "And "
});
formatter.step({
  "name": "the keyboard uses colour scheme \u003cColour scheme\u003e and font scheme \u003cFont scheme\u003e",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "\u003cKeyboard type\u003e",
        "\u003cColour scheme\u003e",
        "\u003cFont scheme\u003e"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Keyboard type",
        "Colour scheme",
        "Font scheme"
      ]
    },
    {
      "cells": [
        "Touch image presets (6x7)",
        "TCx Elevate FO colour scheme",
        "Arial"
      ]
    }
  ]
});
formatter.scenario({
  "name": "I want to add a keyboard of type Touch image presets (6x7)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.step({
  "name": "I log in on the central storeMate Online environment",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Admin",
        "Admin"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "keyBoardLayout.i_log_in_on_the_central_storeMate_Online_environment(String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to POS Keyboard maintenance",
  "keyword": "When "
});
formatter.match({
  "location": "keyBoardLayout.i_navigate_to_POS_Keyboard_maintenance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I create a new keyboard layout",
  "keyword": "And "
});
formatter.match({
  "location": "keyBoardLayout.i_create_a_new_keyboard_layout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the keyboard uses colour scheme TCx Elevate FO colour scheme and font scheme Arial",
  "rows": [
    {
      "cells": [
        "Touch image presets (6x7)",
        "TCx Elevate FO colour scheme",
        "Arial"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "keyBoardLayout.the_keyboard_uses_colour_scheme_and_font_scheme(String,String,String\u003e\u003e)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.fail(Assert.java:95)\r\n\tat bindings.keyBoardLayout.assignRandomPosFunctions(keyBoardLayout.java:422)\r\n\tat bindings.keyBoardLayout.the_keyboard_uses_colour_scheme_and_font_scheme(keyBoardLayout.java:261)\r\n\tat ✽.the keyboard uses colour scheme TCx Elevate FO colour scheme and font scheme Arial(file:src/test/resources/keyBoardLayout.feature:11)\r\n",
  "status": "failed"
});
});