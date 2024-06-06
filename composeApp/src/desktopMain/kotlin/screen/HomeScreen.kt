package screen

import androidx.compose.foundation.HorizontalScrollbar
import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.jetbrains.skia.FontWeight


/**
 * @Author: Abdul Rehman
 */
class HomeScreen : Screen {

    @Composable
    override fun Content() {
        val verticalScroll = rememberScrollState(0)
        val horizantalScroll = rememberScrollState(0)
        val navigator = LocalNavigator.currentOrThrow
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 10.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize().verticalScroll(verticalScroll)
                    .horizontalScroll(horizantalScroll).padding(end = 12.dp, bottom = 12.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Demo Application for the Desktop using KMP",
                    fontSize = 30.sp,
                    style = MaterialTheme.typography.h1,
                )


                Button(onClick = {
                    navigator.push(
                        APICallScreen()
                    )
                }) {
                    Text(text = "HTTP API Call Screen")
                }


                Button(onClick = {
                    navigator.push(
                        DetailScreen()
                    )
                }) {
                    Text(text = "Go to Details")
                }

                Button(onClick = {
                    navigator.push(
                        ScrollableListScreen()
                    )
                }) {
                    Text(text = "Go to Scrollable List Screen")
                }



                Button(onClick = {
                    navigator.push(
                        LazyScrollableListScreen()
                    )
                }) {
                    Text(text = "Go to Lazy Scrollable List Screen")
                }

                Button(onClick = {
                    navigator.push(
                        ToolTipsScreen()
                    )
                }) {
                    Text(text = "ToolTip List Screen")
                }

                Button(onClick = {
                    navigator.push(
                        MouseHoverScreen()
                    )
                }) {
                    Text(text = "Mouse Hover Screen")
                }


                Button(onClick = {
                    navigator.push(
                        DraggableContentScreen()
                    )
                }) {
                    Text(text = "Draggable Content Screen")
                }

                Button(onClick = {
                    navigator.push(
                        ContextMenuContent()
                    )
                }) {
                    Text(text = "Contenxt Menu Screen")
                }


            }

            VerticalScrollbar(
                modifier = Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
                adapter = rememberScrollbarAdapter(verticalScroll)
            )

            HorizontalScrollbar(
                modifier = Modifier.align(Alignment.BottomStart).fillMaxWidth(),
                adapter = rememberScrollbarAdapter(horizantalScroll)
            )


            Text(
                modifier = Modifier.align(Alignment.BottomEnd).padding(4.dp),
                text = "Made with ❤️ by Abdul Rehman",
            )
        }
    }
}