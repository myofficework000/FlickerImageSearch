package abhishek.flickr

import dagger.Module
import dagger.android.ContributesAndroidInjector
import abhishek.flickr.photodetails.PhotoDetailsFragment
import abhishek.flickr.recent.RecentPhotosFragment

@Module
abstract class AndroidBindingModule {
  @ContributesAndroidInjector
  abstract fun getRecentPhotosFragment(): RecentPhotosFragment

  @ContributesAndroidInjector
  abstract fun getPhotoDetailsFragment(): PhotoDetailsFragment
}
