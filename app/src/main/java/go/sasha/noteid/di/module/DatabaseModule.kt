package go.sasha.noteid.di.module

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import go.sasha.noteid.db.AppDatabase
import go.sasha.noteid.db.NoteDao
import javax.inject.Singleton

/**
 * Created by _go.sasha on 13.06.2021.
 */

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideRoomDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, AppDatabase.DB_NAME)
            .build()
    }

    @Provides
    fun provideNoteDao(appDatabase: AppDatabase): NoteDao = appDatabase.noteDao()
}