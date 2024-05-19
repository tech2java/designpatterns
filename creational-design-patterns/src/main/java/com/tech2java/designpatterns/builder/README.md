Builder:
--------

- **Problem**: Creating object using constructor with multiple parameters.
- Using Builder design pattern, can create object based on the required parameters.
- terms: Director,Builder,concreteBuilder and Product

Steps:
------
- Create public static inner class.
- Add method for each field.
- `public HttpClientBuilder method(String method){
  this.method=method;
  return this;
  }`
- Create a build method.
-  `public HttpClient build(){
       return new HttpClient(this);
    }`
- Create HttpClient() constructor with HttpClientBuilder parameter. 
` public HttpClient(HttpClientBuilder httpClientBuilder) {
   this.method=httpClientBuilder.method;
   }`