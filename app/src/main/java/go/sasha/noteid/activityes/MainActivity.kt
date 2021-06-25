package go.sasha.noteid.activityes

import android.os.Bundle
import android.os.PersistableBundle
import go.sasha.noteid.R


import go.sasha.noteid.model.Note
import go.sasha.noteid.presenters.MainPresenter
import go.sasha.noteid.views.MainView
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter

/**
 * Created by _go.sasha on 11.06.2021.
 */
class MainActivity : MvpAppCompatActivity(), MainView {

    val infoForPresenter: String = "F0r PreSentOOR"

    //add presenter
    @InjectPresenter
    lateinit var mainPresenter: MainPresenter

    @ProvidePresenter
    fun provideMainPresenter(): MainPresenter = MainPresenter()


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContentView(R.layout.activity_main)

    }

    //реализация функций

    override fun onNotesLoaded(notes: List<Note>) {
        TODO("Not yet implemented")
    }

    override fun updateView() {
        TODO("Not yet implemented")
    }

    override fun onSearchResult(notes: List<Note>) {
        TODO("Not yet implemented")
    }

    override fun onAllNotesDeleted() {
        TODO("Not yet implemented")
    }

    override fun onNoteDeleted() {
        TODO("Not yet implemented")
    }

    override fun showNoteInfoDialog() {
        TODO("Not yet implemented")
    }

    override fun showNoteDeleteDialog(notePosition: Int) {
        TODO("Not yet implemented")
    }

    override fun hideNoteDeleteDialog() {
        TODO("Not yet implemented")
    }

    override fun showNoteContextDialog(notePosition: Int) {
        TODO("Not yet implemented")
    }

    override fun hideNoteContextDialog() {
        TODO("Not yet implemented")
    }


}