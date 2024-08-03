# Singleton
## Definition:
The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.

## When to Use:

- When only one instance of a class is needed to coordinate actions across the system.
- When managing resources that are expensive to create (like database connections).

## Examples
- A Singleton is used to manage the database connection in an application. This ensures that only one connection instance exists throughout the application's lifecycle, preventing issues like multiple connections and ensuring efficient resource usage.
- A logging utility in an application often uses the Singleton pattern to ensure that all classes use the same logger instance. This centralizes the logging mechanism and ensures consistent logging throughout the application.
- A Singleton can be used to manage configuration settings for an application. This ensures that configuration parameters are loaded once and are accessible globally, providing a single source of truth for configuration data.