# Prototype
## Definition:
The Prototype Pattern is used to create new objects by copying an existing object, known as the prototype. This is useful when the cost of creating a new object is high and copying an existing object is more efficient.
## When to Use:

- When creating new instances of a class is more expensive than copying an existing instance.
- When you need to avoid subclasses of an object creator in the client application.
- When an object structure is complex, and instantiation involves a lot of overhead.

## Examples
- When objects are resource-intensive to create (e.g., objects that involve database operations or complex calculations), the Prototype pattern allows for creating a new instance by copying an existing object, reducing overhead.
- In game development, when creating multiple similar game objects (e.g., enemies with similar attributes), the Prototype pattern can clone existing objects, allowing for quick and efficient creation of game entities.
- When you have objects that are configured in a particular way and want to create multiple instances with the same configuration, the Prototype pattern can clone the configured instance instead of configuring new instances from scratch.