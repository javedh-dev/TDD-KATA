# TDD Kata 1 - String Calculator

### http://osherove.com/kata
Before you start:
- Try not to read ahead .
- Do one task at a time. The trick is to learn to work incrementally.
- Make sure you only test for correct inputs. there is no need to test for invalid inputs for
this kata
- Test First!
### String Calculator
- In a test-first manner, create a simple class <code>class StringCalculator</code> with a method <code>public int Add(string numbers)</code>
- The method can take <code>0</code>, <code>1</code> or <code>2</code> numbers, and will return their sum (for an empty string it will return 0) 
  for example - <code>“” == 0 , “1” == 1 , “1,2” == 3</code>
- Start with the simplest test case of an empty string and move to one & two numbers
- Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
- Remember to refactor after each passing test
- Allow the Add method to handle an unknown amount of numbers
- Allow the Add method to handle new lines between numbers (instead of commas).
- The following input is ok: <code>“1\n2,3” == 6</code>
- The following is INVALID input so do not expect it : <code>“1,\n”</code> (not need to write a test for it)
- Support different delimiters:<br>
   to change a delimiter, the beginning of the string will contain a separate line that looks like this:
  <code>“//[delimiter]\n[numbers…]”</code><br>
   for example - <code>“//;\n1;2” == 3</code>, since the default delimiter is <code>;</code>.<br>
  <br>
  <code>Note: All existing scenarios and tests should still be supported</code>
- Calling Add with a negative number will throw an exception <code>negatives not allowed</code> - and the negative that was passed.
- If there are multiple negatives, show all of them in the exception message
- Using TDD, Add a method to <code>StringCalculator</code> called <code>public int GetCalledCount()</code> that returns how many times 
  <code>Add()</code> was invoked.<br>
  Remember - Start with a failing (or even non compiling) test.
- Numbers bigger than 1000 should be ignored, for example:
   <code>2 + 1001 == 2</code>
- Delimiters can be of any length with the following format: <code>“//[delimiter]\n”</code><br>
  for example: <code>“//[***]\n1***2***3” == 6</code>
- Allow multiple delimiters like this:<code>“//[delim1][delim2]\n”</code><br>
  for example <code>“//[*][%]\n1*2%3” == 6.</code>
- make sure you can also handle multiple delimiters with length longer than one char 
  for example <code>“//[**][%%]\n1**2%%3” == 6.</code>
    
For more info visit https://osherove.com or email roy@osherove.com 
