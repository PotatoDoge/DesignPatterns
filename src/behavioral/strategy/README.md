# Strategy
## Definition:
The Strategy Pattern is a behavioral design pattern that enables selecting an algorithm’s behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable. The strategy pattern allows the algorithm to vary independently from the clients that use it.

## When to Use:

- When you have multiple algorithms for a specific task, and you want to switch between them at runtime.
- When you want to avoid using conditionals to switch between different algorithms.
- When you want to isolate the implementation details of an algorithm from the rest of the code.

## Examples
- In an authentication system, you might have different strategies for authenticating users (e.g., LDAP, OAuth, SAML). The Strategy Pattern allows you to switch between these mechanisms dynamically based on configuration or user choice.
- In a data processing application, you might need to sort data in different ways (e.g., quicksort, mergesort, heapsort). Using the Strategy Pattern, you can switch between these algorithms at runtime based on the dataset or user preference.
- For file compression software, you might have different compression algorithms (e.g., ZIP, RAR, 7z). Using the Strategy Pattern, you can allow the user to choose the desired compression algorithm at runtime.
- In an e-commerce application, customers might have different payment methods (e.g., credit card, PayPal, bank transfer). The Strategy Pattern lets the application dynamically select the payment method based on user input.