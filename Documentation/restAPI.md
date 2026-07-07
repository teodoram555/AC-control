#REST APIs
REST is an acronym for REpresentational State Transfer and an architectural style for distributed hypermedia systems.REST is not a protocol or a standard, it is an architectural style. During the development phase, API developers can implement REST in a variety of ways.
##The Guiding Principles of REST
###1.Uniform Interface
The following four constraints can achieve a uniform REST interface:
-Identification of resources
-Manipulation of sources through representations
-Self-descriptive messages
-Hypermedia as the engine of application state
###2.Client-server
The client-server pattern separates the user interface (client) from data storage (server). This separation provides three main benefits:
-Independent evolution
-Better portability
-Higher scalability
###3.Stateless
Statelessness mandates that each request from the client to the server must contain all of the information necessary to understand and complete the request
###4.Cacheble
The cacheable constraint requires that a response should implicitly or explicitly label itself as cacheable or non-cacheable.If the response is cacheable, the client application gets the right to reuse the response data later for equivalent requests and a specified period.
###5.Layered system
The layered system style allows an architecture to be composed of hierarchical layers by constraining component behavior. 
###6.Code on demand
REST lets servers dynamically extend client functionality via downloadable scripts, keeping the client lightweight by reducing the need for pre-implemented features.
##What is a Resource?
In REST, everything revolves around resources and their representations:
-Resource: Any namable entity (e.g., a document, image, collection, or real-world object).
-Representation: The current state of a resource, made up of three things:
    -Data: The actual content.
    -Metadata: Details describing the data.
    -Hypermedia Links: Links to help the client navigate to the next state
##Resource Methods
Actions used to transition a resource from one state to another.
The HTTP Misconception: Many think REST strictly dictates how to use HTTP verbs (GET, POST, PUT, DELETE).
##Rest and HTTP
REST is a protocol-agnostic architectural style, not a synonym for HTTP; any system that honors REST's six guiding principles is technically RESTful, regardless of the underlying protocol.
