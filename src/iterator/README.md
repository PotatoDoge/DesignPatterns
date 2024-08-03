# Iterator
## Definition:
The Iterator Pattern is a behavioral design pattern that provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. It allows for traversing a collection of objects without needing to understand the internal structure of the collection.

## When to Use:
- When you want to provide a standard way to access elements of a collection without exposing its internal structure.
- When you want to iterate over a collection of objects in a consistent manner regardless of how the collection is implemented.
- When you want to support multiple traversals of a collection simultaneously.

## Examples
- In a file system, iterators can be used to traverse directories and files. The iterator provides a consistent way to access files and directories without needing to understand the underlying directory structure.
- When querying a database, iterators can be used to access rows in the result set. The iterator provides a uniform way to retrieve rows without exposing the details of the database query execution.
- In a menu navigation system (e.g., a restaurant menu), an iterator can be used to traverse through different menu items. This allows for sequential access to items without revealing the internal data structure.
- In a collection of objects (e.g., a list of customer records), an iterator allows traversing the collection to perform operations like displaying, updating, or processing each item in a consistent manner.