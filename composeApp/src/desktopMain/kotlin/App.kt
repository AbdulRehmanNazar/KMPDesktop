import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.jetbrains.compose.ui.tooling.preview.Preview

import screen.HomeScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
      Navigator(HomeScreen()){ navigator: Navigator ->
          SlideTransition(navigator)
      }
    }
}