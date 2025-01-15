**Calculadora suma Android Studio con Kotlin**

En este proyecto se ha desarrollado una calculadora básica de suma utilizando Android Studio como entorno de desarrollo, 
Kotlin como lenguaje de programación principal y uso de Jetpack Compose. 
La calculadora permite realizar sumas simples entre dos números ingresados por el usuario, mostrando el resultado de manera clara e intuitiva 
y mostrando errores en caso de haberlos para guiar al usuario.

**Iniciar el proyecto**

Para ello tenemos que descargar el proyecto, por lo que abrimos un terminal o una consola y añadimos la URL

```bash
git clone https://github.com/Yeyeando/calculadoraKotlin-.git
```

De esta manera lo tendremos descargado en una carpeta local.

Abrimos Android Studio le damos a  File > New > Project from Version Control. Ponemos la ubicación del proyecto y le damos a clone.

Finalmente, Android Studio descargará y abrirá el proyecto. Le damos a run y con ello compilamos y ponemos en funcionamiento el proyecto.

**Interfaz Usuario**

La interfaz de usuario es bastante simple.

![GUIkotlin](https://github.com/user-attachments/assets/86ceb057-b387-43ca-a165-274ae980286c)


Tenemos 2 editText donde ingresaremos los números a sumar y al darle al botón nos hará el calculo.


![GUIkotlin2](https://github.com/user-attachments/assets/dece9f84-fe23-48a5-8f37-bf1f5bb88105)


La app solo permite ingresar números y el punto decimal. En caso de escribir algo mal, se notificará en pantalla al intentar calcular la suma.

![GUIjava3](https://github.com/user-attachments/assets/0d11834c-c670-49c5-b2b9-2dcdbf8f63be)
