
-Se procede a la creacion de un nuevo proyecto usando Android Studio Koala Feature Drop version 2024.1.2
-Luego New Project , seguido procederemos a utilizar la plantilla  Empty Activity.
-En nuestra siguiente ventana, en donde dice Name se procede a colocar nuestro nombre de proyecto el cual es Filmoteca, 
seguido de nuestro Package name el cual llevara como nombre es.ua.eps.filmoteca, lenguaje Kotlin, SDK API 24 ("Nougat"; Android 7.0), seguido de Finish para la creación.
-El siguiente paso seria la creación de nuestro dispositivo virtual:
Create Virtual Device, seleccionamos la opcion Phone seguido de Pixel 2, API 34 y la version de Android (14).Se debe utilizar Gradle 8.7 que es la version que da Koala por defecto.


-Una vez realizado estos pasos Crearemos nuestra activity o cambiaremos por el nombre AboutActivity.kt y este a su vez se genera de forma automática el archivo activity_about.xml.
-Respondiendo a la pregunta del ejercicio: ¿Qué dependencias figuran en él?
Serian las siguientes:
dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    }

  -Una vez creada Nuestro  AboutActivity.kt y archivo activity_about.xml se procede a verificar de que funcione lo creado con nuestro emulador.
  -Luego en nuestro layout activity_about.xml se configuran con 3 botones, para mostrar tres opciones
  - utilizaremos un componente de tipo TextView Para mostrar nuestro nombre y un componente de tipo ImageView para mostar nuestra imagen,cabe mencionar que para las imagenes que utilizaremos
     sera del formato PNG y se guardara en el directorio res/drawable.
  - Cada boton se debe configurar con un msj el cual sera: Funcionalidad sin implementar, para esto utilizaremos un Toast.
  - Para la parte de Internacionalización crearemos un archivo o modificaremos strings.xml uno en español y otro ingles para poder hacer los cambios de idiomas.

    Una vez realizado estos pasos configuraremos nuestro activity para que se muestre nuestra imagen desde la carpeta drawable,nuestros botones los configuras
     con su name del archivo de idiomas por ejemplo @string/button4" , al igual que nuestro Textview, ya realizado esta parte nos vamos al AboutActivity.kt.

-Se procede a la creacion de la variable para hacer el cambio ya sea Mode.Layouts ó Mode.Compose
-se crea una funcion para elegir el tipo de mode a utilizar.
-seguido de esto se inicializan la interfaz layout XML:
    -En esta parte se configuran todos los botones para que muestre nuestro Toast con el msj funcionalidad incompleta
    al igual que su declaracion de variable para que cada boton tenga su id unico.
    -Luego una funciona para la inicializacion de Jetpack Compose usando MaterialTheme
    - Luego otra funcion para mostrar los toast, seguido de AuthorInfoScreen el cual seria la informacion del usuario usando compose
    se definen ciertos parametros para que muestre la informacion del autor al igual se configura para que haga el cambio de idioma usanso los strings creados anteriormente.
    -Se configura la parte de la imagen del autor, tambien se usa el id para hacer referencia a la 
    imagen guardada en drawable y unos parametros para que muestre la imagen en la forma que queremos.
    - Nuestros botones en la configuracion de compose, y luego por ultimo la Previsualización de la UI en Compose seguido de del tema definido.
    
    -EN EL CODIGO SE MUESTRA mas entendido todo lo que se comenta en esta parte, hay pequeños comentarios.
    -Los problemas que se me presentaran fue la integracion de Compose ya que anteriormente habia trabajado con Kotlin.
  
