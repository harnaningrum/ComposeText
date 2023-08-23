package com.a961084.ningrum.compose.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.a961084.ningrum.compose.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreview()

                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, nama: String, modifier : Modifier = Modifier){
    Row {

        Text(
            text = message,
            fontSize = 20.sp,
            lineHeight = 50.sp,
        )
        Text(
            text = nama,
            fontSize = 10.sp
        )
    }
}

@Composable
fun GreetingImage(message: String, nama: String, modifier: Modifier = Modifier) {
    Row {
        Image(
            painter = painterResource(R.drawable.graphic),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(53.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.secondary,CircleShape)
        )
        Column {
            Text(message )
            Text(nama)
        }

    }
}


/*@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldTheme {
        GreetingImage(message = "Selamat datang di UTDI ", nama = "Dosen anda")
    }
}*/


/*@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldTheme {
        Row(
        content = {
                Text("Ini adalah kalimat ")
                Text("Ini yang kedua ")
                Text("Dan ini terakhir")
            }
        )
    }
}*/

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldTheme {
        Row{
                Text("Ini adalah kalimat ")
                Text("Ini yang kedua ")
                Text("Dan ini terakhir")
            }
    }
}
