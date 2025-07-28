# Unit Converter CLI App
*My first Java-based CLI project for converting Length, Weight, and Temperature units effortlessly.*

## Overview

A simple yet powerful **Command Line Interface (CLI)** app written in Java that allows users to convert between common units of:
**Length**
**Weight**
**Temperature**

Perfect for quick calculations directly from the terminal.

---

## Features

- Clean and user-friendly interface
- Supports multiple categories:
  - Length (e.g., meter ↔ kilometer, feet ↔ inches)
  - Weight (e.g., kg ↔ gram)
  - Temperature (e.g., Celsius ↔ Fahrenheit, Kelvin)
- Input validation and easy navigation
- Future plans for GUI (AWT/Swing) upgrade

---

## 🧪 Sample Output
╔═════════════════════════════╗
<br>
║     UNIT CONVERTER CLI      ║
╚═════════════════════════════╝

Categories: 
1. Length
2. Weight
3. Temperature
4. Exit

Choose a category: 1

1. Inches to Feet
2. Feet to Inches
3. Meter to Kilometer
4. Kilometer to Meter
Tip: Please choose a category or type 'back' to return to main menu.

--- Length Conversion ---

Choose conversion: 1
<br>
Enter value in inches(in): 12
<br>
Result: 1.0ft

--- Length Conversion ---

Choose conversion: 2
<br>
Enter value in feet(ft): back
<br>
Back to main menu...

╔═════════════════════════════╗
<br>
║     UNIT CONVERTER CLI      ║
╚═════════════════════════════╝

Categories:
1. Length
2. Weight
3. Temperature
4. Exit

Choose a category: 4

Exciting!! Thanks for using the app.


---

## 💡 Future Plans

- 🎨 Implement a sleek **AWT/Swing-based GUI version**
- 🌍 Add more conversion types like area, volume, speed, etc.
- 💾 Save conversion history (optional)

---

## 🧑‍💻 Author

Made  by Bhimsen
https://github.com/Bhimsen16  
*(Feel free to replace this with your GitHub username if you want it clickable!)*

---

## 📌 How to Run

> Prerequisite: JDK 8 or above installed

```bash
javac UnitConverter.java
java UnitConverter