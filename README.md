#TDD Kata 1 - String Calculator

###http://osherove.com/kata
Before you start:
- Try not to read ahead .
- Do one task at a time. The trick is to learn to work incrementally.
- Make sure you only test for correct inputs. there is no need to test for invalid inputs for
this kata
- Test First!
###String Calculator
- In a test-first manner, create a simple class `class StringCalculator` with a method `public int Add(string numbers)`
<br>
<br>
- The method can take `0`, `1` or `2` numbers, and will return their sum (for an empty string it will return 0) 
  for example - `“” == 0 , “1” == 1 , “1,2” == 3`
  <br>
  <br>
- Start with the simplest test case of an empty string and move to one & two numbers
  <br>
  <br>
- Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
  <br>
  <br>
- Remember to refactor after each passing test
  <br>
  <br>
- Allow the Add method to handle an unknown amount of numbers
  <br>
  <br>
- Allow the Add method to handle new lines between numbers (instead of commas).
  <br>
  <br>
- The following input is ok: `“1\n2,3” == 6`
  <br>
  <br>
- The following is INVALID input so do not expect it : `“1,\n”` (not need to write a test for it)
  <br>
  <br>
- Support different delimiters:<br>
   to change a delimiter, the beginning of the string will contain a separate line that looks like this:
  `“//[delimiter]\n[numbers…]”`<br>
   for example - `“//;\n1;2” == 3`, since the default delimiter is `;`.<br>
  <br>
  `Note: All existing scenarios and tests should still be supporte`
  <br>
  <br>
- Calling Add with a negative number will throw an exception `negatives not allowed` - and the negative that was passed.
  <br>
  <br>
- If there are multiple negatives, show all of them in the exception message
  <br>
  <br>
- Using TDD, Add a method to `StringCalculator` called `public int GetCalledCount()` that returns how many times 
  `Add()` was invoked.<br>
  Remember - Start with a failing (or even non compiling) test.
  <br>
  <br>
- Numbers bigger than 1000 should be ignored, for example:
   `2 + 1001 == 2`
  <br>
  <br>
- Delimiters can be of any length with the following format: `“//[delimiter]\n”`<br>
  for example: `“//[***]\n1***2***3” == 6`
  <br>
  <br>
- Allow multiple delimiters like this:`“//[delim1][delim2]\n”`<br>
  for example `“//[*][%]\n1*2%3” == 6.`
  <br>
  <br>
- make sure you can also handle multiple delimiters with length longer than one char 
  for example `“//[**][%%]\n1**2%%3” == 6.`
  <br>
  <br>
    
For more info visit https://osherove.com or email roy@osherove.com 