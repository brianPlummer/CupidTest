package friendlyrobot.nyc.cupidtest.di

import dagger.BindsInstance
import dagger.Component
import friendlyrobot.nyc.cupidtest.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun withUrl(endpoint: String) : Builder
        fun build() : ApplicationComponent
    }
    fun inject(mainActivity: MainActivity)
}