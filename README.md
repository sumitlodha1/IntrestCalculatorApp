# 💰 Interest Calculator App

A clean and minimal Android application built with **Kotlin** that instantly computes **Simple Interest** and **Compound Interest**. Designed for students, professionals, and anyone who needs quick and accurate financial calculations on the go.

---

## ✨ Features

| Feature | Description |
|---|---|
| 📊 Simple Interest | Calculate SI using Principal, Rate, and Time |
| 📈 Compound Interest | Calculate CI with standard yearly compounding |
| 🗓️ Monthly Compounding | Special case — monthly interest with yearly compounding |
| ⚡ Real-time Results | Results update instantly as you type |
| 🔢 Currency Formatted Output | Results displayed in clean, readable currency format |
| 🧹 Clear Input | One-tap reset to clear all fields |
| 🎨 Material Design UI | Simple, intuitive interface accessible to non-technical users |
| 🛡️ Input Validation | Handles zero, negative, and empty values gracefully |

---

## 🛠️ Tech Stack

- **Language:** Kotlin
- **Platform:** Android
- **IDE:** Android Studio
- **UI Components:** EditText, RadioButton, Switch, TextView, XML Layouts
- **Design:** Material Design Guidelines

---

## 💡 How It Works

```
1. Enter Principal Amount, Interest Rate, and Time Period
        ↓
2. Select Interest Type — Simple or Compound (via Radio Buttons)
        ↓
3. For Compound Interest, optionally enable Monthly Compounding (Switch)
        ↓
4. Result is calculated and displayed instantly in currency format
        ↓
5. Tap Clear to reset all fields
```

---

## 🧮 Formulas Used

**Simple Interest:**
```
SI = (Principal × Rate × Time) / 100
Total Amount = Principal + SI
```

**Compound Interest:**
```
CI = Principal × (1 + Rate/100)^Time - Principal
Total Amount = Principal + CI
```

**Monthly Compounding (Special Case):**
```
CI = Principal × (1 + Rate/1200)^(Time×12) - Principal
```

---

## 📂 Project Structure

```
IntrestCalculatorApp/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/         # Kotlin source files
│   │   │   ├── res/          # Layouts, drawables, strings
│   │   │   └── AndroidManifest.xml
│
├── gradle/
├── build.gradle.kts
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites
- Android Studio (latest version recommended)
- Android device or emulator running **API 21+**

### Installation

```bash
# 1. Clone the repository
git clone https://github.com/sumitlodha1/IntrestCalculatorApp.git

# 2. Open in Android Studio
File → Open → Select the cloned folder

# 3. Let Gradle sync, then run on device or emulator
```

---

## 📦 Planned Improvements

- [ ] Loan EMI calculator
- [ ] Graphical visualization of interest growth over time
- [ ] History of past calculations
- [ ] Dark mode support
- [ ] Export results as PDF

---

## 👨‍💻 Developer

**Sumit Lodha**
- 🔗 GitHub: [@sumitlodha1](https://github.com/sumitlodha1)
- 💼 LinkedIn: [sumitlodha1](https://www.linkedin.com/in/sumitlodha1/)

---

> Built with ❤️ using Kotlin & Android Studio
