# Flyweight Pattern

## Definition:
The Flyweight Pattern is a structural design pattern that aims to reduce the memory usage by sharing as much data as possible with similar objects. It is used to efficiently handle a large number of fine-grained objects by reusing existing instances instead of creating new ones.

## When to Use:
- When you need to create a large number of objects with similar data.
- When you want to minimize memory usage by sharing common data among objects.
- When the overhead of creating and maintaining a large number of objects becomes a performance issue.

## Examples:
- In a text editor, you can use the Flyweight Pattern to handle a large number of characters. Each character object (e.g., 'a', 'b', 'c') can be shared among different parts of the text instead of creating a new instance for each occurrence.
- In a graphical application, you can use the Flyweight Pattern to represent graphic elements like trees or buildings in a large landscape. Each element's common attributes (e.g., color, texture) can be shared, while specific attributes (e.g., position) are handled separately.
- In a game with many characters that share common properties (e.g., NPCs with the same appearance but different locations), you can use the Flyweight Pattern to share character data and minimize memory usage.
