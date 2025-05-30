# Grading System

## Objective
Learn how to use the `Scanner` class in Java to capture numerical input from the user and use conditional statements to determine and print the corresponding grade based on the marks.

## Instructions

**Grading System**

In this project, you will write a small program that asks the user for their marks and then determines and prints the corresponding grade based on the school's grading system.

**For you to do:**

1. **Create a Scanner Object**
   - Create a `Scanner` object to read input from the console.

2. **Capture Marks Input**
   - Print "Please enter your marks".
   - Capture the user's input for the marks and store it in a variable called `marks`.

3. **Determine and Print the Grade**
   - Use conditional statements to determine and print the grade directly inside each conditional block:
      - If marks are between 1 and 25 (inclusive), print `Your grade is F`.
      - If marks are between 26 and 45 (inclusive), print `Your grade is E`.
      - If marks are between 46 and 50 (inclusive), print `Your grade is D`.
      - If marks are between 51 and 60 (inclusive), print `Your grade is C`.
      - If marks are between 61 and 80 (inclusive), print `Your grade is B`.
      - If marks are above 80, print `Your grade is A`.
      - If marks are not within the valid range (0-100), print `Please enter valid mark`.


## Expected Output
```
Please enter your mark
85
Your grade is A
```

```
Please enter your mark
-5
Please enter valid mark
```

## Tips
- Remember to import the `Scanner` class using `import java.util.Scanner;`.
- Ensure your variables are declared and assigned correctly.
- Use conditional statements to determine the grade based on the marks.

## Additional Information
- **Scanner Class**: The `Scanner` class is used to get user input. It is found in the `java.util` package.
- **Conditional Statements**: Use conditional statements to make decisions based on multiple conditions.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that the input is captured and printed correctly.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `Scanner` class and conditional statements in Java. Happy coding!
