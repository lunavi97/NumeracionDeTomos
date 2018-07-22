# Numeración de tomos

Se necesita etiquetar un conjunto de libros, en lo posible, algo un poco más amigable para la gente que solo un número.

Se decidió usar una palabra que indique el dominio, y un número que indique el tomo, separados por un guión medio.

Cada dominio puede tener tomos del 01 al 99

## Ejemplo
Para **n = 132** y **dominio = ["MONOS", "LEONES", "CEBRAS", "GATOS"]**

La salida deberá ser:

**numeracionDeTomos(n, dominio) = "LEONES-33"**

Una salida de:

**MONOS-01** para **n = 1**,

**MONOS-99** para **n = 99**,

**LEONES-01** para **n = 100**,

etcétera.

## Input/Output

### [input] integer n
El número total de tomos para ser mapeado por el dominio

**0 < n ≤ minimo(3000, dominio.length * 99)**

### [input] array.string dominio
Una lista de palabras para ser usadas

**0 < dominio.length ≤ 100**

**0 < dominio[x].length ≤ 20**

### [output] string
La etiqueta del último tomo

**^.{1,20}-(0[1-9]|[1-9][0-9])$**

**\<dominio>-\<numero>\<numero>**

## Tests

* Ejemplo 1:

> n: **56**

> dominio: **["A", "B", "C", "D", "E", "F"]**

> Salida esperada: **"A-56"**

* Ejemplo 2:

> n: **100**

> dominio: **["@", "#", "$", "%", "^", "&", "\*"]**

> Salida esperada: **"#-01"**
