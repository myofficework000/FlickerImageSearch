package abhishek.flickr.recent

import android.net.Uri
import abhishek.flickr.core.TapAction
import java.util.*

typealias PhotoId = String

data class PhotoViewModel(
    val id: PhotoId = UUID.randomUUID().toString(),
    val link: Uri,
    val title: String? = null
) {
  val tapAction: TapAction<PhotoViewModel> = TapAction.create { this }
}
