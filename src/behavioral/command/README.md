# Command
## Definition:
The Command Pattern is a behavioral design pattern that turns a request into a stand-alone object, encapsulating the request as an object. This allows for parameterizing clients with queues, requests, and operations, and supports undoable operations.
## When to Use:
- When you need to issue requests to objects without knowing the operation being requested or the receiver of the request.
- When you want to queue requests, schedule requests to be executed at a later time, or support undo operations.
- When you want to encapsulate a request as an object to parameterize clients with different requests.

## Examples
- In a GUI application with menus, each menu item can be associated with a command (e.g., "Save", "Open", "Close"). The Command Pattern allows each menu action to be encapsulated as a command object that can be executed independently.
- In a text editor, commands like "Cut", "Copy", and "Paste" can be implemented using the Command Pattern to support undo and redo operations. Each command can store its state and allow reverting changes if necessary.
- In financial systems, transactions (e.g., "Deposit", "Withdraw") can be modeled as command objects. This allows for queuing transactions, rolling back operations, or scheduling transactions to be executed later.
- In home automation systems, a remote control might send commands to various devices (e.g., lights, thermostats). Each button press can be mapped to a command object that controls the device, enabling easy and flexible control.