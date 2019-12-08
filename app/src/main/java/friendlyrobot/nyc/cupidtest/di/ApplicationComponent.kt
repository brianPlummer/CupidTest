package friendlyrobot.nyc.cupidtest.di

import dagger.Component
import friendlyrobot.nyc.cupidtest.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    @Component.Builder
    interface Builder {
        fun build() : ApplicationComponent
    }

    fun inject(mainActivity: MainActivity)
}