# java-clean-architecture 
I created this repository to implement all the theory I learned from the `Get your hands dirty from clean architecture` book.

While reading and implementing it, I learned the Hexagonal Architecture, a `DDD (Domain Driven Development)` based architecture. It enforces really
interesting concepts like `Dependency Inversion` to make the application dependency flow go towards the project domain, `Dependency Injection` through interfaces to
decouple layers within the project from eachother and make testing a lot easier. The book also covered methods to enforce the boundaries between layers, avoiding
breaking the `Single Responsability Principle` by not creating unnecessary dependencies between the layers. Diverse mapping strategies for input and output ports
also received a whole chapter of discussion as well as diverse scenarios the take conscious decisions about taking shortcuts in a not destructive way.
