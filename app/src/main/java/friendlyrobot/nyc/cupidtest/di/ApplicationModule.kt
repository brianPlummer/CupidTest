package friendlyrobot.nyc.cupidtest.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import friendlyrobot.nyc.cupidtest.img.ImageLoader
import friendlyrobot.nyc.cupidtest.img.ImageLoaderPicasso
import friendlyrobot.nyc.cupidtest.model.MatchDao
import friendlyrobot.nyc.cupidtest.model.MatchDatabase
import friendlyrobot.nyc.cupidtest.network.SearchService
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

    @JvmStatic
    @Provides
    @Singleton
    fun provideMatchDatabase(application: Application) : MatchDatabase {
        return Room.databaseBuilder(
            application,
            MatchDatabase::class.java, "MatchDatabase"
        ).build()
    }

    @JvmStatic
    @Provides
    @Singleton
    fun provideMatchDao(matchDatabase: MatchDatabase) : MatchDao = matchDatabase.matchDao()
}
