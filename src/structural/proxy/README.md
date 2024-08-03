# Proxy Pattern

## Definition:
The Proxy Pattern is a structural design pattern that provides an object representing another object. It acts as an intermediary, allowing control over access to the real object. The proxy can add additional functionality, such as logging or access control, without modifying the real object's code.

## When to Use:
- When you need to control access to an object, such as adding authentication or logging.
- When you want to defer the creation of a resource-intensive object until it is needed (virtual proxy).
- When you want to manage or restrict access to an object, for example, to prevent expensive operations or to implement caching.

## Examples:
- In a network application, you can use the Proxy Pattern to create a proxy that handles network requests on behalf of the real object, adding features such as logging, caching, or access control.
- In a graphic system, you can use the Proxy Pattern to create a virtual proxy for large image files that are expensive to load. The proxy loads the image only when it is actually needed.
- In a security system, you can use the Proxy Pattern to create a security proxy that checks permissions before delegating requests to the real object, ensuring that only authorized users can access certain functionalities.
