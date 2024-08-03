# Decorator Pattern

## Definition:
The Decorator Pattern is a structural design pattern that allows you to add new functionality to an object dynamically without altering its structure. It involves creating a set of decorator classes that are used to wrap concrete components. This pattern provides a flexible alternative to subclassing for extending functionality.

## When to Use:
- When you need to add responsibilities to objects at runtime without affecting other objects.
- When you want to extend the functionality of a class in a modular way, allowing multiple extensions to be combined.
- When you need to avoid a large number of subclasses by using composition to achieve flexible extensions.

## Examples:
- In a graphical user interface (GUI) system, you can use the Decorator Pattern to add new features to UI components, such as adding scroll bars to a window or adding borders to buttons, without modifying the original components.
- In a text processing application, you can use the Decorator Pattern to add formatting options like bold, italic, or underline to text dynamically, allowing multiple formats to be applied independently.
- In a coffee shop system, you can use the Decorator Pattern to add various toppings or flavors to a basic coffee, allowing each decoration to be applied independently and combined as needed.
