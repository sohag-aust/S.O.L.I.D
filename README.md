# Design Principles

## SRP
`Each class should have only one sole purpose, and not be filled with excessive functionality`

## OCP
`Classes should be open for extension and closed for modification. In other words, you should not have 
to rewrite an existing class for implementing new features`

## LSP
`This means that every subclass or derived class should be substitutable for their base or parent class`

## ISP
`Interfaces should not force classes to implement what they can't do. Large interfaces should be divided into small ones`

## DIP
`Components should depend on abstractions, not on concretions. Means, High-level modules should not depend on low-level modules. 
Both should depend on abstractions, so Depend upon Abstractions/Interfaces rather than concrete classes.`

> * When we create a class then, that class is dependent on some other classes, so the class doesn't need to understand on which other classes it is dependent.
> * So, these others classes are injected to this class on runtime, which is also known as dependency injection.
> * Ex: without dependency inversion:  UserDetailsController -> UserService -> 1) OauthUserAuthService (for auth request) | 2) MySQL Database Service (for fetching details).
> * Problem (without dependency inversion): let's say we want JWT authentication for auth service instead of Oauth , and NoSQL for fetching details instead of MySQL, then we need to change the implementation of UserService, which is not expected.
> * Ex: with dependency inversion: 
  ###### 1) UserDetailsController -> send request 
  ###### 2) UserService (interface) :: (has implementation of 1. Local User Service | 2. International User Service) -> handle auth request for AuthService and fetch details from Database Service
  ###### 3) AuthService (interface) :: has implementation of 1. Facebook Auth Service | 2. Google Auth Service
  ###### 4) DatabaseService (interface) :: has implementation of 1. Oracle Database Service | 2. MySQL Database Service
> * Here we inject dependent class or interfaces to concern class