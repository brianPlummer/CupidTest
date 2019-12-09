package friendlyrobot.nyc.cupidtest.di

import android.app.Application

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
