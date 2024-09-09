# Brainstorming Variables in Java

### Variables Store Data
- Different types; int, String, boolean, double/float, short, long

### Scanner Class
- Get input from the user by *creating variables* from this class
- `.nextInt()` or `.nextLine()` or `nextDouble()` can be used to get the information from the user's keyboard.

### Types of Variables
- local (temporary) vs. intsance vs. static (declare once) vs. private/public vs. protected

### Final Keyword
- When you do not want to change the value of the variable, it can be declared as a final; for example, pi will always be 3.14159265358979323846264 so we might code pi as `final double PI = 3.1415926535897;`

### Variables only store 1 value
- If you want to store more than one value, you may want to use an array.

### Naming Restrictions
- You cannot use special keywords in Java, for example, public, System, int, for, while
- Cannot start with a number
- No special characters, for example @#$%^*
- No spaces
- Use camelCase to make your variable names readable!

### Declare Before Using
- Type of variable followed by name
  ```
  int value;
  value = 4;
  ```
  Is the same as:
  `int value = 4;`
