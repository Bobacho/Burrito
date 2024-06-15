import androidx.compose.material3.*
import androidx.compose.runtime.*

import burrito.composeapp.generated.resources.Res
import burrito.composeapp.generated.resources.compose_multiplatform


@Composable
fun IniciarSesion( onClick : () -> Unit)
{
    OutlinedButton( onClick = { onClick() }){
        Text("Iniciar Sesion")
    }
}

