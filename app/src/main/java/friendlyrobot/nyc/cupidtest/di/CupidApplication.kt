package friendlyrobot.nyc.cupidtest.di

import android.app.Application
import friendlyrobot.nyc.cupidtest.di.ApplicationComponent
import friendlyrobot.nyc.cupidtest.di.DaggerApplicationComponent

class CupidApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent =  DaggerApplicationComponent.builder()
            .withUrl("https://www.okcupid.com/")
            .application(this)
            .build()
    }
}
