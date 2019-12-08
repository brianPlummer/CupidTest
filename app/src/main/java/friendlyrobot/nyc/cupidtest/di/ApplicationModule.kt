package friendlyrobot.nyc.cupidtest.di

import dagger.Module
import dagger.Provides
import friendlyrobot.nyc.cupidtest.SearchService
import friendlyrobot.nyc.cupidtest.img.ImageLoader
import friendlyrobot.nyc.cupidtest.img.ImageLoaderPicasso
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
object ApplicationModule {

    @JvmStatic
    @Provides
    @Singleton
    fun provideImageLoader():ImageLoader = ImageLoaderPicasso()

    @JvmStatic
    @Provides
    @Singleton
    fun provideRetrofit(endpoint: String) = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create())
        .baseUrl(endpoint)
        .build()

    @JvmStatic
    @Provides
    @Singleton
    fun provideSearchService(retrofit: Retrofit) : SearchService {
        return retrofit.create(SearchService::class.java)
    }
}