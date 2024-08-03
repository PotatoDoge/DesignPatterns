# Template Method
## Definition:
The Template Method Pattern is a behavioral design pattern that defines the skeleton of an algorithm in a base class but lets subclasses override specific steps of the algorithm without changing its structure. It allows you to define the overall algorithm structure while deferring some steps to subclasses.

## When to Use:

- When you have multiple classes that share a common algorithm but implement some steps differently.
- When you want to avoid code duplication by defining common algorithm steps in a base class.
- When you want to ensure that certain algorithm steps are always executed in a specific order.

## Examples
- In a document processing system, a common sequence of steps (e.g., "Open Document", "Read Content", "Format Document", "Save Document") can be defined in a base class, while specific formatting or content-reading methods can be customized in subclasses.
- In a cooking application, a recipe template might include steps like "Prepare Ingredients", "Cook", and "Serve". Specific details like cooking method and additional ingredients can be defined in subclasses for different recipes.
- In an e-commerce system, the order processing workflow (e.g., "Validate Order", "Process Payment", "Ship Order") can be standardized, with specific details about payment methods or shipping procedures defined in subclasses.
- In a reporting system, the template might include steps like "Collect Data", "Format Data", "Generate Report". Different types of reports can override the formatting or data collection steps while maintaining the overall report generation process.