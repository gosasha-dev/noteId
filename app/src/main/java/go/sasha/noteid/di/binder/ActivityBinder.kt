package go.sasha.noteid.di.binder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import go.sasha.noteid.activityes.AddNoteActivity
import go.sasha.noteid.activityes.MainActivity

/**
 * Created by _go.sasha on 13.06.2021.
 */

@Module
abstract class ActivityBinder {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun bindAddNoteActivity(): AddNoteActivity
}