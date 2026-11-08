# Java Swing Address Book APP

A desktop address book application built in Java Swing. It features input validation, live table filtering, and text file data persistence using `java.io`.

## What It Does

- **Add & Validate Contacts:** Adds name, surname, phone number, email, and address to a live `JTable`.
  - Checks for empty fields before submitting.
  - Ensures phone numbers are exactly 10 digits, start with `0`, and contain numbers only.
  - Verifies that email addresses contain `@`.
- **Search & Filter:** Uses `TableRowSorter` to filter contacts in real time. Gives feedback if the search box is empty or if no matching contact is found.
- **Reset Button:** Clears the search filter and restores the full table view.
- **Export to File:** Loops through the contact list and uses `java.io.FileWriter` to output all data into `contacts.txt` with pipe (`|`) delimiters.
- **Import from File:** Uses `java.io.BufferedReader` and `File` to read `contacts.txt` line by line, splits the text on the delimiters, and appends the loaded contacts straight back into the table without wiping existing data.
- **UI Customization:** Styled using NetBeans `GroupLayout`, custom white background scroll panes, centered window alignment, and set table row heights (`28px`) for better readability.

---

## Tech Stack & Methods

- **Language:** Java
- **GUI Framework:** Java Swing (`JFrame`, `JTable`, `DefaultTableModel`, `TableRowSorter`, `GroupLayout`)
- **File Handling:** `java.io.File`, `java.io.FileWriter`, `java.io.BufferedReader`, `java.io.FileReader`
- **IDE:** NetBeans
- **Version Control:** Git & GitHub Desktop

### How to run it:
1. Clone or download the repo.
2. Open it up in NetBeans.
3. Hit run on `AddressBook.java` and test it out
