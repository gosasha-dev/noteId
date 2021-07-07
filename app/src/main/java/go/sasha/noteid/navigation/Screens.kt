package go.sasha.noteid.navigation

import android.content.Context
import android.content.Intent
import com.github.terrakok.cicerone.androidx.ActivityScreen
import go.sasha.noteid.activityes.AddNoteActivity
import go.sasha.noteid.activityes.MainActivity

object Screens {

    fun addNote() = ActivityScreen { context: Context ->
        Intent(context, AddNoteActivity::class.java)
    }
}