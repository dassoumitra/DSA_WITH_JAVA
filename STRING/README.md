# Java String Concepts

This repository contains important Java String concepts with examples and explanations.

---

# 📚 What You Will Learn

- Characters
- String Literals
- String Constant Pool
- Subsequences
- Substrings
- String Comparison
- String with `new` Operator
- Reference Comparison
- StringBuilder
- StringBuffer
- `next()` vs `nextLine()`
- Taking String as User Input
- Input Buffer and Delimiters
- String Formatting
- String Concatenation
- `compareTo()` Function
- `trim()` Function
- `split()` Function
- `startsWith()` Function
- `endsWith()` Function
- `indexOf()` Function
- `lastIndexOf()` Function
- `charAt()` Function
- `toLowerCase()` Function
- `toUpperCase()` Function
- `toCharArray()` Function

---

# 1. Characters in Java

A character in Java is represented using the `char` data type.

## Example

```java
char letter = 'A';
System.out.println(letter);
```

## Output

```text
A
```

---

# 2. String Literals

A String literal is a sequence of characters written inside double quotes.

## Example

```java
String name = "Java";
```

String literals are stored inside the **String Constant Pool**.

---

# 3. String Constant Pool (SCP)

The String Constant Pool is a special memory area inside the heap where Java stores String literals.

## Example

```java
String s1 = "Hello";
String s2 = "Hello";

System.out.println(s1 == s2);
```

## Output

```text
true
```

---

# 4. Subsequences

A subsequence is a sequence derived from another string by removing some characters without changing the order.

## Example

```text
ABCDE
```

Possible Subsequences:

```text
ACE
ABD
BCDE
```

---

# 5. Substrings

A substring is a continuous part of a string.

## Example

```java
String text = "Programming";

System.out.println(text.substring(0, 4));
```

## Output

```text
Prog
```

---

# 6. String Comparison

## Using `equals()`

```java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b));
```

## Output

```text
true
```

---

## Using `==`

```java
String a = "Java";
String b = "Java";

System.out.println(a == b);
```

## Output

```text
true
```

---

# 7. String with `new` Operator

```java
String s1 = new String("Hello");
String s2 = new String("Hello");

System.out.println(s1 == s2);
```

## Output

```text
false
```

---

# 8. Reference Comparison

```java
String s1 = "Java";
String s2 = "Java";
String s3 = new String("Java");

System.out.println(s1 == s2);
System.out.println(s1 == s3);
```

## Output

```text
true
false
```

---

# 9. StringBuilder

`StringBuilder` is used for mutable strings.

## Example

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" Java");

System.out.println(sb);
```

## Output

```text
Hello Java
```

---

# 10. StringBuffer

`StringBuffer` is similar to `StringBuilder` but thread-safe.

## Example

```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");

System.out.println(sb);
```

## Output

```text
Hello World
```

---

# 11. `next()` vs `nextLine()`

| Method | Description |
|--------|-------------|
| `next()` | Reads single word |
| `nextLine()` | Reads complete line |

## Example

```java
Scanner sc = new Scanner(System.in);

String name = sc.nextLine();
```

---

# 12. Taking String as User Input

## Example

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter Name: ");
String name = sc.nextLine();

System.out.println(name);
```

---

# 13. Input Buffer and Delimiters

The input buffer stores leftover input data.  
A delimiter separates input values.

## Example

```java
Scanner sc = new Scanner(System.in);

int num = sc.nextInt();
sc.nextLine();

String name = sc.nextLine();
```

`nextLine()` is used to clear the buffer.

---

# 14. String Formatting

Used to format strings using placeholders.

## Example

```java
String name = "Java";
int version = 21;

System.out.printf("Language: %s Version: %d", name, version);
```

---

# 15. String Concatenation

Combines multiple strings together.

## Example

```java
String first = "Hello";
String second = "World";

String result = first + " " + second;

System.out.println(result);
```

## Output

```text
Hello World
```

---

# 16. `compareTo()` Function

Compares two strings lexicographically.

## Example

```java
String a = "Apple";
String b = "Banana";

System.out.println(a.compareTo(b));
```

---

# 17. `trim()` Function

Removes extra spaces from both sides.

## Example

```java
String text = " Java ";

System.out.println(text.trim());
```

---

# 18. `split()` Function

Splits string into array.

## Example

```java
String text = "Java,Python,C";

String arr[] = text.split(",");
```

---

# 19. `startsWith()` Function

Checks starting characters.

## Example

```java
String text = "Programming";

System.out.println(text.startsWith("Pro"));
```

## Output

```text
true
```

---

# 20. `endsWith()` Function

Checks ending characters.

## Example

```java
String text = "Programming";

System.out.println(text.endsWith("ing"));
```

## Output

```text
true
```

---

# 21. `indexOf()` Function

Returns first occurrence index.

## Example

```java
String text = "Programming";

System.out.println(text.indexOf('g'));
```

---

# 22. `lastIndexOf()` Function

Returns last occurrence index.

## Example

```java
String text = "Programming";

System.out.println(text.lastIndexOf('g'));
```

---

# 23. `charAt()` Function

Returns character at specific index.

## Example

```java
String text = "Java";

System.out.println(text.charAt(2));
```

## Output

```text
v
```

---

# 24. `toLowerCase()` Function

Converts string to lowercase.

## Example

```java
String text = "JAVA";

System.out.println(text.toLowerCase());
```

## Output

```text
java
```

---

# 25. `toUpperCase()` Function

Converts string to uppercase.

## Example

```java
String text = "java";

System.out.println(text.toUpperCase());
```

## Output

```text
JAVA
```

---

# 26. `toCharArray()` Function

Converts string into character array.

## Example

```java
String text = "Java";

char arr[] = text.toCharArray();

for(char c : arr){
    System.out.println(c);
}
```

---

# 📋 Summary Table

| Concept | Description |
|----------|-------------|
| Character | Single character |
| String Literal | Stored in SCP |
| StringBuilder | Mutable string |
| StringBuffer | Thread-safe mutable string |
| String Formatting | Formats output |
| String Concatenation | Combines strings |
| `trim()` | Removes spaces |
| `split()` | Splits string |
| `compareTo()` | Lexicographical comparison |
| `charAt()` | Returns character |
| `indexOf()` | Finds first occurrence |
| `lastIndexOf()` | Finds last occurrence |
| `toUpperCase()` | Converts to uppercase |
| `toLowerCase()` | Converts to lowercase |

---

# 🚀 Conclusion

This repository helps beginners understand Java String concepts, methods, memory behavior, and user input handling with simple examples.

---

## 👨‍💻 Author

https://github.com/dassoumitra