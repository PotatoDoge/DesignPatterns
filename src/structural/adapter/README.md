# Adapter
## Definition:
The Adapter Pattern is used to allow two incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by wrapping an existing class with a new interface.

## When to Use:
- When you want to use an existing class but its interface is not compatible with the rest of your system.
- When you need to integrate a third-party library that doesn’t match the required interface.
- When you need to convert the interface of a class into another interface that clients expect.

## Examples
- When updating a software system, you might need to integrate old legacy components with new components. The Adapter Pattern allows you to create an adapter that sits between the legacy code and the new system, translating calls to the appropriate methods.
- When using a third-party library that has a different interface from what your application expects, you can create an adapter to wrap the library's classes, providing a compatible interface for your application.
- In scenarios where hardware interfaces (like device drivers) need to communicate with software systems, adapters can translate hardware-specific signals and commands into standardized software calls.
- When integrating UI components from different libraries or frameworks, adapters can help translate the component interfaces so they can work seamlessly within a single application.