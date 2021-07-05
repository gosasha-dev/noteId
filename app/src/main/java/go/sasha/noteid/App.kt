package go.sasha.noteid

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import go.sasha.noteid.di.DaggerAppComponent

class App : DaggerApplication() {

    //test

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
            .application(this)
            .build()
    }

}