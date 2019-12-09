package friendlyrobot.nyc.cupidtest.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import friendlyrobot.nyc.cupidtest.MainActivity
import friendlyrobot.nyc.cupidtest.model.MatchesModel
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application) : Builder
        @BindsInstance
        fun withUrl(endpoint: String) : Builder
        fun build() : ApplicationComponent
    }
    fun inject(mainActivity: MainActivity)
    fun inject(matchesModel: MatchesModel)
}