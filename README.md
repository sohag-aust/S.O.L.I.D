# Design Principles

## SRP
`Each class should have only one sole purpose, and not be filled with excessive functionality`

## OCP
`Classes should be open for extension and closed for modification. In other words, you should not have 
to rewrite an existing class for implementing new features`

## LSP
`This means that every subclass or derived class should be substitutable for their base or parent class`

## ISP
`Interfaces should not force classes to implement what they can't do. Large interfaces should be divided into small ones
Clients should not be forced to depend on methods they do not use`
### `Guideline for ISP`
### One fat interface need to be split to many smaller and relevant interfaces so that clients can know about the interfaces that are relevant to them

## DIP
`Components should depend on abstractions, not on concretions`