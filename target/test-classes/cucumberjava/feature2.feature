Feature: login

Scenario Outline: validate userid

Given launch gmail site
When enter userid as "<x>"
And click next button

Then validate userid with "<y>" criteria

And close site
Examples:
|x          |        y|
|ashudulla  |valid    |
|ash21kdl   |invalid  |
|           |invalid  |