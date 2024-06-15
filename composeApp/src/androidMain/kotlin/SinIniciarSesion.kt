import androidx.compose.material3.*
import androidx.compose.runtime.*

import burrito.composeapp.generated.resources.Res
import burrito.composeapp.generated.resources.compose_multiplatform


@Composable
fun SinIniciarSesion( onClick: () -> Unit)
{
    FilledTonalButton( onClick = { onClick() }){
        Text("Sin Iniciar Sesion")
    }
}
