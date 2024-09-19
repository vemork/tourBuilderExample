# Patrón de Diseño: Builder

## Introducción

El patrón de diseño **Builder** es un patrón creacional que se utiliza para construir objetos complejos paso a paso. A diferencia de otros patrones creacionales, no utiliza un solo constructor, sino que permite la creación de una variedad de representaciones de un objeto.

## Propósito

El propósito principal del patrón Builder es separar la construcción de un objeto complejo de su representación, de manera que el mismo proceso de construcción pueda crear distintas representaciones.


## Estructura

1. **TourPackageBuilder (Constructor Abstracto)**: Define una interfaz para crear las partes de un objeto Tour package.

2. **ConcreteBuilder (Constructor Concreto)**: Implementa la interfaz Builder y construye las partes del producto.  

- Basic    Tour Package Builder
- Complete Tour Package Builder
- Deluxe   Tour Package Builder

4. **Tour Package (Producto)**: Representa el objeto complejo que se construirá.

5. **Travel Agent (Director)**: Construye un objeto usando la interfaz Builder.

## Participantes

- **Builder**:         Especifica una interfaz abstracta para crear partes de un objeto Product.
- **ConcreteBuilder**: Construye y ensambla partes del producto a través de la implementación de la interfaz Builder.
- **Product**:         Representa o define un producto complejo.
- **Director**:        Construye un objeto utilizando la interfaz Builder.
