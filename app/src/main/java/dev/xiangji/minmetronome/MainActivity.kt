package dev.xiangji.minmetronome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.xiangji.minmetronome.ui.theme.MinMetronomeTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MinMetronomeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colorScheme.background
        ) {
          MainComponent()
        }
      }
    }
  }
}

@Composable
fun MainComponent() {
  val padding = 16.dp
  Column(
    modifier = Modifier.padding(padding),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,
  ) {
    TickBar()
    Spacer(Modifier.size(padding))
    Text("Presto")
    Spacer(Modifier.size(padding))
    Text("120")
    Spacer(Modifier.size(padding))
    IPodControl()
    Spacer(Modifier.size(padding))
    Button(onClick = {}) {
      Text("TAP")
    }
  }
}

@Composable
fun TickBar() {
  Text("TickBar")
}

@Composable
fun IPodControl() {
  Text("IPodControl")
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
  MinMetronomeTheme {
    MainComponent()
  }
}