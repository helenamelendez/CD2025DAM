```mermaid

classDiagram
class Book {
-String isbn
-String title
-boolean available
+Book(String isbn, String title)
+String getIsbn()
+String getTitle()
+boolean isAvailable()
+void borrow()
+void giveBack()
}

class User {
-String id
-String name
-List~Loan~ loans
+User(String id, String name)
+String getName()
+String getId()
+List~Loan~ getLoans()
+void addLoan(Loan loan)
+void removeLoan(Loan loan)
}

class Loan {
-Book book
-User user
-LocalDate startDate
-LocalDate endDate
+Loan(Book book, User user)
+Book getBook()
+User getUser()
+LocalDate getStartDate()
+void closeLoan()
+boolean isActive()
}

class LibraryService {
-Map~String, Book~ books
-Map~String, User~ users
+void addBook(Book book)
+void addUser(User user)
+Loan borrowBook(String isbn, String userId)
+void returnBook(Loan loan)
}

User "1" --> "*" Loan : tiene prestamo
Loan --> "1" Book : libro
Loan --> "1" User : usuario
LibraryService --> "*" Book : administra
LibraryService --> "*" User : administra