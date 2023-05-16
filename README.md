# Ejercicio venta de perfumes
![image](https://github.com/kuhaku2016/perfumes.io/assets/132966260/8401231e-c7e1-44ca-b1d7-fb4e46149905)
### En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita un vendedor de perfumes, que desea calcular el promedio de perfumes vendidos. Este negocio evalúa la venta perfumes de forma permanente y calcula el promedio general de las ventas.
Aclaraciones:
* Se supondrá que la aplicación solo se requiere para calcular el promedio de un único periodo especifico.
* Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos.
* No se realiza validación, ni se verifica calidad en los datos ingresados.
## Historia de caso
![h1](https://github.com/kuhaku2016/perfumes.io/assets/132966260/c2ad064c-5b88-4b40-9fe9-e75fe6e6b5de)
![h2](https://github.com/kuhaku2016/perfumes.io/assets/132966260/6e81596d-2a25-49e8-9618-6f128acda9de)
## Aproximacion a caso de uso:
![Diagrama en blanco (2)](https://github.com/kuhaku2016/perfumes.io/assets/132966260/99fd2d53-ad14-49ad-a602-f2eac936396e)
## Aproximacion diagrama de flujo:
![Diagrama en blanco (1)](https://github.com/kuhaku2016/perfumes.io/assets/132966260/29d18fcd-7665-4816-9517-aa4bd679d97c)
## Pseudocodigo
-Inicio
  -Caracteres: Nombre [50]
  -Real:  Clientes [50], Cantidad [50]
  -Caracteres: nombres
  -Entero: cliente, Cantidades, i
  -Real: cantidad1, cantidad2, cantidad3, total<- 0
  -Imprimir: 'Digite el numero de clientes:'
  -Asignar: numeroClientes
  -Para i=0 hasta numeroClientes - 1, 1
  -Imprimir: 'Digite el nombre del cliente:'
  -Asignar: nombre
  -Imprimir: 'Ingrese la cantidad que desea comprar:'
  -Asignar: Cantidad
  -nombres[i] <- Nombre
  -clientes[i] <- Clientes
  -cantidades[i] <- Cantidad
  -finPara
  -Para i=0 hasta numeroClientes -1, 1
  -total <- (antidad1 + cantidad2 + cantidad3)/3
  -finPara
  -Imprimir: 'El total es: + total
-Fin
