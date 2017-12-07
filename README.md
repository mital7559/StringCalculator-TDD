# StringCalculator-TDD

# Completed below all steps

<ol>
<li>Create a simple String calculator with a method <strong>int Add(string numbers)</strong> <ol>
<li>The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example<strong> “” or “1” or “1,2”</strong></li>
<li>Start with the simplest test case of an empty string and move to 1 and two numbers</li>
<li>Remember to solve things as simply as possible so that you force yourself to write tests you did not think about</li>
<li>Remember to refactor after each passing test</li>
</ol></li>
<li>Allow the Add method to han<span class="sumo_twilighter_highlighted twilighter-4ddfce59" style="background-color: rgba(10, 6, 6, 0.15);">dle an unknown amount of numbers<span class="sumo_twilighter_shares" style="visibility: visible;">1</span></span></li>
<li>Allow the Add method to handle new lines between numbers (instead of commas). <ol>
<li>the following input is ok:&nbsp; “1\n2,3”&nbsp; (will equal 6)</li>
<li>the following input is NOT&nbsp;ok:&nbsp; “1,\n” (not need to prove it - just clarifying)</li>
</ol></li>
<li><ol><strong> Support different delimiters </strong>
<li>to change a delimiter, the beg<span class="sumo_twilighter_highlighted twilighter-4136e118" style="background-color: rgba(10, 6, 6, 0.15); cursor: inherit;">inning of the string will contain a separate line that looks like this:&nbsp;&nbsp; “/<span class="sumo_twilighter_shares" style="visibility: visible;">1</span></span>/[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ . </li>
<li>the first line is optional. all existing scenarios should still be supported</li>
</ol></li>
<li>Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed.if there are multiple negatives, show all of them in the exception message                                                                   
<hr>
<strong>stop here if you are a beginner</strong>. Continue if you can finish the steps so far in less than 30 minutes.                                                                   
<hr>
</li>
<li>Numbers bigger than 1000 should be ignored, so adding 2 + 1001 &nbsp;= 2</li>
<li>Delimiters can be of any length with the following format:&nbsp; “//[delimiter]\n” for example: “//[***]\n1***2***3” should return 6</li>
<li>Allow multiple delimiters like this:&nbsp; “//[delim1][delim2]\n” for example “//[*][%]\n1*2%3” should return 6.</li>
<li>make sure you can also handle multiple delimiters with length longer than one char</li>
</ol>
