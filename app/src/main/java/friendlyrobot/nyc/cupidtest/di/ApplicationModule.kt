package friendlyrobot.nyc.cupidtest.di

import dagger.Module
import dagger.Provides
import friendlyrobot.nyc.cupidtest.img.ImageLoader
import friendlyrobot.nyc.cupidtest.img.ImageLoaderPicasso
import javax.inject.Singleton

@Module
object ApplicationModule {

    @JvmStatic
    @Provides
    @Singleton
    fun provideImageLoader():ImageLoader = ImageLoaderPicasso()
}