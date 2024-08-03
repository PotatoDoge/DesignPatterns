# Singleton
## Definition:
The Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
## When to Use:
- When a change in one object requires changing others, and you don’t know how many objects need to be changed.
- When an object should be able to notify other objects without making assumptions about who those objects are.
- When you want to decouple the object that changes state from the objects that depend on the state changes.

## Examples
- In a news application, when a new article is published, all subscribers (observers) should be notified. The application (subject) manages the list of subscribers and sends notifications whenever there's new content.
- In stock market applications, when the price of a stock changes, all registered clients or services (observers) should be notified about the price change. The stock (subject) maintains the list of interested clients and notifies them of changes.
- In GUI frameworks, various UI components can act as observers that listen for events such as button clicks or text changes. The event source (subject) notifies all registered components when an event occurs.
- On social media platforms, when a user posts an update, all followers (observers) should receive a notification about the new post. The user's account (subject) handles notifying followers of updates.