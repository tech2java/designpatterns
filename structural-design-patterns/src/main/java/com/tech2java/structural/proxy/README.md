Proxy:
------
- Object Comes in place of actual object
- Dev Machine -> Proxy Server -> World Outside
- Web service client -> Web service proxy -> Web service provider => Remote Proxy
- ORM Tools -> Customer Proxy -> Database  => Virtual proxy(lazy loading) Ex: customer.getOrders()- Lazily loaded
- Client app -> Security Proxy (Authenticate,Authorize) - > Provider  
- Like **CustomerProxyImpl**  Hibernate created this kind of Object at runtime using reflection.
- 