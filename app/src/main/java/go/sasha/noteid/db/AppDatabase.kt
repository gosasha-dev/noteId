package go.sasha.noteid.db

import androidx.room.Database
import androidx.room.RoomDatabase
import go.sasha.noteid.model.Note

/**
 * Created by _go.sasha on 13.06.2021.
 */

@Database(entities = [Note::class], version = AppDatabase.DB_VERSION)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        const val DB_NAME = "note.db"
        const val DB_VERSION = 1
    }

    abstract fun noteDao(): NoteDao
}