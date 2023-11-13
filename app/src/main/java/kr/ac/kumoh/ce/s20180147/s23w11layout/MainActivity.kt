package kr.ac.kumoh.ce.s20180147.s23w11layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kr.ac.kumoh.ce.s20180147.s23w11layout.ui.theme.S23W11LayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp(){
    S23W11LayoutTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
//            Greeting("프로그래밍")
            MyLinearLayout()
        }
    }
}

@Composable
fun MyLinearLayout(){
    Column{
        Row{
            Text("안녕하세요",
                Modifier.background(Color.Yellow)
                    .padding(8.dp)
            )
            Text(text = "컴공",
                modifier = Modifier.background(Color.Cyan)
                    .padding(8.dp)
            )}
        Text(text = "어디서 본 것 같은 예제",
            modifier = Modifier.background(Color.Magenta)
                .padding(8.dp)
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "스마트앱 $name!",
        modifier = modifier
    )
}