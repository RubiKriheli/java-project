# Cloud Infrastructure Setup — Java Project

## תיאור הפרויקט

פרויקט זה מדמה ניהול תשתית ענן בסיסית תוך שימוש בעקרונות תכנות מונחה עצמים (OOP) בשפת Java.
הפרויקט מדגים שימוש ב-Abstract Class, Interface, Inheritance ו-Static Configuration.

---

## מבנה הקבצים

| קובץ | תיאור |
|---|---|
| `Main.java` | נקודת הכניסה של התוכנית |
| `CloudResource.java` | Abstract class — בסיס לכל משאב ענן |
| `Monitorable.java` | Interface — מגדיר דרישות ניטור |
| `ComputeNode.java` | מחלקה המייצגת צומת חישוב |
| `DatabaseNode.java` | מחלקה המייצגת צומת בסיס נתונים |
| `DatacenterConfig.java` | הגדרות סטטיות של מרכז הנתונים |

---

## דיאגרמת מחלקות

```
        <<interface>>
         Monitorable
     + generateHealthReport()
     + getUptime()
            ▲
            |
    CloudResource  (abstract)
    - resourceId: String
    - isActive: boolean
    + togglePower()
    + allocateMemory() (abstract)
       /         \
ComputeNode   DatabaseNode
- cpuCores     - storageCapacityGb
```

---

## הרצת הפרויקט

### דרישות מקדימות
- Java JDK 17 ומעלה

### קומפילציה

```bash
/Users/rubikriheli/Desktop/java/oracleJdk-26.jdk/Contents/Home/bin/javac *.java
```

### הרצה

```bash
/Users/rubikriheli/Desktop/java/oracleJdk-26.jdk/Contents/Home/bin/java Main
```

---

## פלט לדוגמה

```
=== Standard Operating Procedure ===
Region: us-east-1
Standard Operating Procedure: All nodes must be toggled ON before memory allocation.
=====================================

Resource C-01 is now ON
Resource DB-01 is now ON

Allocating 32 GB RAM for compute inference tasks.
Reserving 32 GB RAM for database indexing.

ComputeNode C-01 - Status: Healthy | Cores: 16
DatabaseNode DB-01 - Status: Running | Storage: 500 GB

Node1 uptime: 24 hours
Node2 uptime: 48 hours
```

---

## עקרונות OOP בפרויקט

- **Abstraction** — `CloudResource` מגדיר מבנה משותף מבלי לממש הכל
- **Inheritance** — `ComputeNode` ו-`DatabaseNode` יורשות מ-`CloudResource`
- **Polymorphism** — כל צומת מממשת `allocateMemory` ו-`generateHealthReport` בצורתה שלה
- **Interface** — `Monitorable` מכתיב חוזה אחיד לניטור
- **Encapsulation** — שדות מוגנים עם `protected` / `private`
