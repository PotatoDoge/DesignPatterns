# Composite Pattern

## Definition:
The Composite Pattern is a structural design pattern that allows you to compose objects into tree structures to represent part-whole hierarchies. This pattern enables clients to treat individual objects and compositions of objects uniformly. It is used to handle hierarchical collections of objects where individual objects and compositions of objects are treated the same way.

## When to Use:
- When you want to represent part-whole hierarchies of objects.
- When you want to treat individual objects and compositions of objects uniformly.
- When you need to work with tree structures where both leaf and composite objects need to be treated similarly.

## Examples:
- In a file system, you can use the Composite Pattern to represent files and directories. Both files (leaf nodes) and directories (composite nodes) can be treated uniformly in operations like listing contents or calculating total size.
- In a graphical user interface (GUI) system, you can use the Composite Pattern to represent components like windows, panels, and buttons. Both individual components and composite containers can be managed and manipulated in a consistent way.
- In a company organizational structure, you can use the Composite Pattern to represent employees and departments. Both individual employees and departments (which may contain other employees or departments) can be treated uniformly in operations like calculating salaries or generating reports.
