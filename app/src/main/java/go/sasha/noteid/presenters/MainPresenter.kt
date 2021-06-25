package go.sasha.noteid.presenters

import go.sasha.noteid.db.NoteDao
import go.sasha.noteid.views.MainView
import moxy.InjectViewState
import moxy.MvpPresenter
import javax.inject.Inject

/**
 * Created by _go.sasha on 11.06.2021.
 */

//для связывания presenter и view
@InjectViewState
class MainPresenter() : MvpPresenter<MainView>() {

    @Inject
    lateinit var noteDao: NoteDao

}