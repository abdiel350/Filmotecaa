package es.ua.eps.filmoteca
import android.os.Bundle
import android.widget.Button
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {

    private val mode = Mode.Compose  // Para hacer el cambio de  Mode.Layouts y Mode.Compose

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initUI()
    }

    private fun initUI() {
        when (mode) {
            Mode.Layouts -> initLayouts()
            Mode.Compose -> initCompose()
        }
    }

    // Inicializando la interfaz con el layout XML
    private fun initLayouts() {
        setContentView(R.layout.activity_about)

        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)

        button4.setOnClickListener {
            Toast.makeText(this, "Funcionalidad sin implementar", Toast.LENGTH_SHORT).show()
        }

        button5.setOnClickListener {
            Toast.makeText(this, "Funcionalidad sin implementar", Toast.LENGTH_SHORT).show()
        }

        button6.setOnClickListener {
            Toast.makeText(this, "Funcionalidad sin implementar", Toast.LENGTH_SHORT).show()
        }
    }

    // Inicializando la interfaz utilizando Jetpack Compose
    private fun initCompose() {
        setContent {
            FilmotecaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                  ) {
                    AuthorInfoScreen()
                }
            }
        }
    }

    // Función para mostrar Toast
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    // Composable para la pantalla de información del autor
    @Composable
    fun AuthorInfoScreen() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Texto del autor
            Text(
                text = stringResource(id = R.string.text_view_content),
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black,
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Imagen del autor
            Image(
                painter = painterResource(id = R.drawable.tigre),
                contentDescription = "Imagen del autor",
                modifier = Modifier
                    .size(150.dp)
                    .padding(16.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Botón: "Ir al sitio web"
            Button(
                onClick = { showToast("Funcionalidad sin implementar") },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(id = R.string.button4))
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Botón: "Obtener soporte"
            Button(
                onClick = { showToast("Funcionalidad sin implementar") },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(id = R.string.button5))
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Botón: "Volver"
            Button(
                onClick = { showToast("Funcionalidad sin implementar") },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(id = R.string.button6))
            }
        }
    }

    // Previsualización de la UI en Compose
    @Preview(showBackground = true)
    @Composable
    fun ComposeUIPreview() {
        FilmotecaTheme {
            AuthorInfoScreen()
        }
    }

     //definiendo el tema
    @Composable
    fun FilmotecaTheme(content: @Composable () -> Unit) {
        MaterialTheme {
            content()
        }
    }
}