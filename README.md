# Java Password Validator

This is a simple Java console application that checks whether a user's password meets specific security requirements.

## Description

The program prompts the user to enter a password that follows these rules:

- At least **8 characters** long
- Contains **at least one uppercase letter**
- Contains **at least one lowercase letter**
- Contains **at least one special character** (`*&%$#@_-`)

The user has **three attempts** to enter a valid password. If the user fails all three attempts, the program exits with a message.

## Features

- Validates user input according to custom rules
- Provides feedback and tracks remaining attempts
- Uses basic Java control structures (loops, conditionals, character checking)

## How to Run

1. Make sure you have Java installed.
2. Save the code in a file named `Main.java`.
3. Open a terminal or command prompt in the directory containing the file.
4. Compile the program:
   ```bash
   javac Main.java
