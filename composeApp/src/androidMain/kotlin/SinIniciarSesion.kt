import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*

import burrito.composeapp.generated.resources.Res
import burrito.composeapp.generated.resources.compose_multiplatform


@Composable
fun SinIniciarSesion( onClick: () -> Unit)
{
    FilledTonalButton( onClick = { onClick() }, modifier=Modifier.fillMaxWidth()){
        Text("Sin Iniciar Sesion")
    }
}
