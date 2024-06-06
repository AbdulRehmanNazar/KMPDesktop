import androidx.compose.ui.window.Notification
import androidx.compose.ui.window.Tray
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.isTraySupported
import androidx.compose.ui.window.rememberTrayState
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.avatar
import org.jetbrains.compose.resources.painterResource

fun main() = application {
    val icon = painterResource(Res.drawable.avatar)
    val trayState = rememberTrayState()
    if (isTraySupported) {
        Tray(
            state = trayState,
            icon = icon,
            menu = {
                Item(text = "Send Notification", onClick = {
                    trayState.sendNotification(
                        Notification(
                            title = "Notification",
                            message = "This is KMP desktop app notification"
                        )
                    )
                })
            }
        )
    }
    Window(
        onCloseRequest = ::exitApplication,
        title = "Desktop App Demo using KMP",
    ) {
        App()
    }
}