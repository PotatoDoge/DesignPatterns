# Memento Pattern

## Definition:
The Memento Pattern is a behavioral design pattern that allows an object to capture and externalize its internal state without violating encapsulation, so that the object can be restored to that state later. This pattern provides a way to save and restore an object's state at different points in time.

## When to Use:
- When you need to provide a mechanism to save and restore an object's state.
- When you want to implement undo/redo functionality.
- When you need to capture and externalize an object's internal state without exposing its implementation details.

## Examples:
- In a text editor application, you can use the Memento Pattern to save the state of a document (e.g., text content) so that users can undo and redo changes.
- In a game, you can use the Memento Pattern to save the state of a player's progress (e.g., score, level) and restore it later if needed.
- In a configuration management system, you can use the Memento Pattern to save different configurations and restore them as needed.
