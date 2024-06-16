package unmsm.fisi.burrito
import Home
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import android.content.Context
import android.content.Intent
import android.util.Log

class HomeActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        try{
            setContent{
                Home()           
            }
        }
        catch(e:Exception){
            Log.e("HomeActivity",e.toString())
        }
    }
}
