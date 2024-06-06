@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package kotlinproject.composeapp.generated.resources

import kotlin.OptIn
import org.jetbrains.compose.resources.DrawableResource

private object CommonMainDrawable0 {
  public val avatar: DrawableResource by 
      lazy { init_avatar() }

  public val compose_multiplatform: DrawableResource by 
      lazy { init_compose_multiplatform() }
}

internal val Res.drawable.avatar: DrawableResource
  get() = CommonMainDrawable0.avatar

private fun init_avatar(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:avatar",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/kotlinproject.composeapp.generated.resources/drawable/avatar.jpg", -1, -1),
    )
)

internal val Res.drawable.compose_multiplatform: DrawableResource
  get() = CommonMainDrawable0.compose_multiplatform

private fun init_compose_multiplatform(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:compose_multiplatform",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/kotlinproject.composeapp.generated.resources/drawable/compose-multiplatform.xml", -1, -1),
    )
)
