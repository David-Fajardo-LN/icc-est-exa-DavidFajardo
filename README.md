## METODO A
El primer metodo ordena y filtra segun el minimo de carga de trabajo.
La firma del metodo devuelve un set, entonces se crea una instania de esta, pero como un TreeSet, ya que permite organizar los datos segun un comparador que se le pase como una funcion flecha o en su defecto, por el orden natural de la clase, o su implementacion de comparable. Adicional a esto, el treeSet no permite repetidos, por eso se eligio esta estructura.
En el metodo primero de declara el TreeSet y se le pasa un comparador que primero revisa segun la carga de trabajo, para que el orden sea descendente (Mayor a menor) primero se compara el segundo parametro con el primero. Y si esto es == 0, entonces se compara con codigo, usando ignore Case para evitar mayusculas y minusculas y se compara el primer elemento con el segundo para lograr un orden ascendente.

Luego, con un bucle for, se recorre la lista que se pasa como parametro y se le agrega siempre y cuando esta sea mayor o igual al minimo requerido, finalmente se retorna este Set.
La complejidad teporar de la comparacion es de O(n) ya que depende de cuantos se quieran comparar, la agregacion a al treeSet ya filtrado, tambien es O(n)


## METODO B
El segundo metodo, con el fin de mantener ordenadas las claves se uso un linkedHasSet, ya que mantiene el orden en el que se ingresa al mapa.
En la firma solicitada retorna una lista, entonces por consecuencia, declaramos el mapa como : <String, <List<-->> para asi poder retornar. Se declaro tres listas como arraylist, con el nombre solicitado, y se agregaron al mpaa con sus respectivas claves. 

Una vez hecho este proceso, en conjunto con un bucle foreach y condicionales encadenados se clasifico en los distintos grupos.
Finalmente se retorna el grupo solicitado con map.get(clave).

Este metodo, no organiza internamente los proyectos solicitados, ya que no se implemento esta funcion. Sin embargo, se puede realizar de dos formas; usando un metodo de ordenamiento como bubbleSortAvz antes de retornar la lista, o en su defecto, usando un treeSet con un comparador simple que los clasifique, al final, este treeSet se pasan los valores uno por uno a una lista y se retorna ya organizado.
Ademas, esto permitiria eliminar duplicados, que es algo que por la fomra programada. no realiza.

La complejidad temporal de este metodo esta en O(n) ya que su duracion depende de cuantos elemenos haya, la inserccion es O(1) en cada uno de los arrays, por que es instantaneo.