import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.runtime.*
import androidx.compose.ui.platform.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import android.os.Bundle
import android.content.Context
import android.content.Intent
import androidx.activity.ComponentActivity
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import android.util.Log

import IniciarSesion
import SinIniciarSesion
import unmsm.fisi.burrito.R
import unmsm.fisi.burrito.HomeActivity

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFBB86FC),
    onPrimary = Color(0xFF000000),
    primaryContainer = Color(0xFF3700B3),
    onPrimaryContainer = Color(0xFFFFFFFF),
    secondary = Color(0xFF03DAC6),
    onSecondary = Color(0xFF000000),
    secondaryContainer = Color(0xFF018786),
    onSecondaryContainer = Color(0xFFFFFFFF),
    tertiary = Color(0xFFBB86FC),
    onTertiary = Color(0xFF000000),
    tertiaryContainer = Color(0xFF3700B3),
    onTertiaryContainer = Color(0xFFFFFFFF),
    error = Color(0xFFCF6679),
    onError = Color(0xFF000000),
    errorContainer = Color(0xFFB00020),
    onErrorContainer = Color(0xFFFFFFFF),
    background = Color(0xFF121212),
    onBackground = Color(0xFFFFFFFF),
    surface = Color(0xFF121212),
    onSurface = Color(0xFFFFFFFF),
    surfaceVariant = Color(0xFF121212),
    onSurfaceVariant = Color(0xFFBBBBBB),
    outline = Color(0xFFBBBBBB),
    inverseOnSurface = Color(0xFF000000),
    inverseSurface = Color(0xFFFFFFFF),
    inversePrimary = Color(0xFF6200EA),
)

@Composable
@Preview
fun App() {
    val context = LocalContext.current
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography()
    ) 
    {
        var showContent by remember { mutableStateOf(false) }
        var correoInstitucional by remember { mutableStateOf("") }
        var contrasena by remember { mutableStateOf("") }
        Column(Modifier.padding(8.dp).fillMaxWidth().verticalScroll(rememberScrollState()),horizontalAlignment = Alignment.CenterHorizontally , verticalArrangement = Arrangement.SpaceBetween){
            Card(Modifier.fillMaxSize()){
                Image(
                        painter = painterResource(R.drawable.unmsm), // Correct resource reference
                        contentDescription = "Imagen UNMSM",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                )
                Card(Modifier.fillMaxWidth().padding(16.dp)){
                    Row(modifier = Modifier.fillMaxWidth().height(IntrinsicSize.Min), horizontalArrangement = Arrangement.SpaceEvenly){
                        TextField(
                            value = correoInstitucional,
                            onValueChange = { correoInstitucional = it },
                            label = { 
                                Text("Correo Institucional") 
                            },
                            modifier = Modifier.weight(1f)
                        )
                        VerticalDivider(color = MaterialTheme.colorScheme.secondary)
                        Text(
                            "\n\n@unmsm.edu.pe",
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp,
                            color = MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Card(Modifier.fillMaxWidth().padding(16.dp)){
                    TextField(
                        value = contrasena,
                        onValueChange = { contrasena = it },
                        label = { Text("Contrasena") },
                        visualTransformation = PasswordVisualTransformation(),
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Card(Modifier.fillMaxWidth().padding(16.dp)){
                    IniciarSesion( onClick = {
                        Log.d("AppComposable",context.toString())
                        try{
                            context.startActivity(Intent(context,HomeActivity::class.java))
                        }
                        catch(e:Exception){
                            Log.e("Error:",e.toString())
                        }
                    })
                    SinIniciarSesion( onClick = {
                        context.startActivity(Intent(context,HomeActivity::class.java))
                    } )
                }
            }
        }
    }
}
