Feature: As a user, ensure that you run a test against the range 7920 and 7900
Scenario Outline: Verify number is Prime

When  user reverse enter valid <firstPoint> and <lastPoint>
Then check reversed the number <expected> is Prime

Examples:
|firstPoint|lastPoint|expected      |
|7920     |7900    |7901;7907;7919|