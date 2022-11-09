# java_regex

- A Regular Expression is a sequence of characters that constructs a search
pattern 
- You can use Regex to search for data in a given text.
- Regex is a specific condition for a String and can find it, check if it matches, or manipulate the string to its liking.
- Regex consists of 2 classes, Matcher and Pattern.
- Example of a regex pattern: [a-z0-9]{3,15} -> This example looks for a pattern that contains lowercase letters or digits and length to be between 3 and 15 inclusive


- REGEX Single Character
  - [abc] -> a, b or c
  - [^abc] -> any character except a, b or c
  - [a-zA-Z] -> lowercase or uppercase letter
  - [a-d[m-p]] -> a to d or m to p
  - [a-z[^bc]] -> a to z but not b or c


- REGEX Quantifiers
  - X? -> X occurs once or not
  - X+ -> X occurs more than one time
  - X* -> X occurs zero or more times
  - X{n} -> X occurs n times only
  - X{n,} -> X occurs n or more times
  - X{n, m} -> X occurs at least n times but less than m times