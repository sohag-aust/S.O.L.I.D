# Design Principles

## SRP
`Each class should have only one sole purpose, and not be filled with excessive functionality`

## OCP
`Classes should be open for extension and closed for modification. In other words, you should not have 
to rewrite an existing class for implementing new features`

## LSP
`This means that every subclass or derived class should be substitutable for their base or parent class`
### `Guidelines for LSP`
### 1) Subtype should not throw new exceptions
### 2) Client should not know about subtype
### 3) Derived class should extend without replacing the functionality of old class

## ISP
`Interfaces should not force classes to implement what they can't do. Large interfaces should be divided into small ones`

## DIP
`Components should depend on abstractions, not on concretions`