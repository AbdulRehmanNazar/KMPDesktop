package screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import api.APIService
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import kotlinx.coroutines.launch
import androidx.compose.runtime.rememberCoroutineScope


/**
 * @Author: Abdul Rehman
 */
class APICallScreen : Screen {
    @Composable
    override fun Content() {
        var scope = rememberCoroutineScope()
        var apiResponse by remember { mutableStateOf("waiting...") }
        val navigator = LocalNavigator.currentOrThrow
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {
                navigator.pop()
            }) {
                Text(text = "Go back")
            }
            Button(onClick = {
                scope.launch {
                    apiResponse = APIService().fetchData()
                }


            }) {
                Text(text = "Get API Response")
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = apiResponse)
        }
    }
}