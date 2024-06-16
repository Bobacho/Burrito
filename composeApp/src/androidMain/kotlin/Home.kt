import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.runtime.*
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

@Composable
@Preview
fun Home()
{
   MaterialTheme(){
        var rutaActual by remember{mutableStateOf("Ruta perimetral")}
        Card(){
            Row(Modifier.fillMaxWidth()){
                Button(onClick = {})
                {
                    Text("---")
                }
                Text(rutaActual)
            }
            BusCard()
        }
   }
}

@Composable
fun BusCard()
{
}

