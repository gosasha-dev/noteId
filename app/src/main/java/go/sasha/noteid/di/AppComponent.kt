package go.sasha.noteid.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import go.sasha.noteid.App
import go.sasha.noteid.di.binder.ActivityBinder
import go.sasha.noteid.di.module.DatabaseModule
import go.sasha.noteid.di.module.NavigationModule
import javax.inject.Singleton

/**
 * Created by _go.sasha on 13.06.2021.
 */

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ActivityBinder::class, DatabaseModule::class, NavigationModule::class])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}