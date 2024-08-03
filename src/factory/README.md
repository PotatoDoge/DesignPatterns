# Factory
## Definition:
The Factory Method Pattern defines an interface for creating an object but lets subclasses alter the type of objects that will be created.

## When to Use:

- When a class cannot anticipate the class of objects it must create.
- When a class wants its subclasses to specify the objects it creates.
- To delegate the responsibility of object instantiation to child classes.

## Examples:
- An application might use the Factory Method pattern to create different types of documents (e.g., Word, PDF, Excel). The factory method allows the application to instantiate the correct document type without knowing the details of the document creation.
- In a notification system, the Factory Method pattern can be used to create various types of notifications (e.g., email, SMS, push notifications). The system can decide which notification type to create at runtime based on user preferences or other criteria.
- A graphical user interface (GUI) framework might use the Factory Method pattern to create various UI components (e.g., buttons, text fields, checkboxes). The factory method allows the framework to instantiate the correct component type based on the context or user interaction.