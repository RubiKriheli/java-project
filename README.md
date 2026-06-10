# ☁️ Cloud Infrastructure Setup — Java

A Java OOP project that simulates basic cloud infrastructure management.  
Built as part of an academic assignment focused on Object-Oriented Programming principles.

---

## 📁 Project Files

| File | Description |
|---|---|
| `Main.java` | Entry point — runs the full simulation |
| `CloudResource.java` | Abstract base class for all cloud resources |
| `Monitorable.java` | Interface for health monitoring |
| `ComputeNode.java` | Represents a CPU-based compute node |
| `DatabaseNode.java` | Represents a storage-based database node |
| `DatacenterConfig.java` | Static configuration and SOP |

---

## 🧱 OOP Concepts Used

- **Abstraction** — `CloudResource` is an abstract class with an abstract method
- **Inheritance** — `ComputeNode` and `DatabaseNode` extend `CloudResource`
- **Polymorphism** — each node overrides `allocateMemory()` and `generateHealthReport()`
- **Interface** — `Monitorable` defines a shared monitoring contract
- **Encapsulation** — fields are `private`/`protected`, exposed through methods

---

## ▶️ How to Run

```bash
javac *.java
java Main
```

---

## 📤 Sample Output

```
=== Standard Operating Procedure ===
Region: us-east-1
...

Resource C-01 is now ON
Resource DB-01 is now ON

Allocating 32 GB RAM for compute inference tasks.
Reserving 32 GB RAM for database indexing.

ComputeNode C-01 - Status: Healthy | Cores: 16
DatabaseNode DB-01 - Status: Running | Storage: 500 GB

Node1 uptime: 24 hours
Node2 uptime: 48 hours
```

