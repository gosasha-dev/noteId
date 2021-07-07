package go.sasha.noteid.presenters

import com.github.terrakok.cicerone.Router
import go.sasha.noteid.db.NoteDao
import go.sasha.noteid.navigation.Screens
import go.sasha.noteid.views.MainView
import moxy.InjectViewState
import moxy.MvpPresenter

/**
 * Created by _go.sasha on 11.06.2021.
 */

//для связывания presenter и view
@InjectViewState
class MainPresenter(val router: Router, val noteDao: NoteDao) :
    MvpPresenter<MainView>() {

    fun navigateToAddNote() = router.navigateTo(Screens.addNote())


}