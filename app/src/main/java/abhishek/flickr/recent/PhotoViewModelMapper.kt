package abhishek.flickr.recent

import android.net.Uri
import abhishek.flickr.Photo
import javax.inject.Inject

open class PhotoViewModelMapper @Inject internal constructor() {
  open operator fun invoke(photo: Photo) = PhotoViewModel(
      id = photo.id,
      link = Uri.parse(photo.link),
      title = photo.title
  )
}
