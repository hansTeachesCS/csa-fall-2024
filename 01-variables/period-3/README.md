# Brainstorming Variables in Java

### Different than Python
- Must declare the type, such as int, "float"/double, String, char

### Variables can be named anything
- No spacing in the name, avoid Java-specific keywords (public, for, while, etc...), cannot start with a number
- Use camelCase to make your variable names readable

### Scanner Class
- Use this to store information given by the user

### Reassigning Values
- Using the `=` we can reassign the value of a variable
- For example, `total = total + i`

### Declare Only Once
```
int total = 0;
int total = total + i;
```
Gives the following error:
`error: variable total is already defined in method main`

Fix by:
```
int total = 0;
total = total + i;
```
