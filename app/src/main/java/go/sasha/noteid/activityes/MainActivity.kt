package go.sasha.noteid.activityes


import android.os.Bundle
import com.github.terrakok.cicerone.Navigator
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.AppNavigator
import com.google.android.material.floatingactionbutton.FloatingActionButton
import dagger.android.AndroidInjection
import go.sasha.noteid.R
import go.sasha.noteid.db.NoteDao
import go.sasha.noteid.model.Note
import go.sasha.noteid.navigation.Screens
import go.sasha.noteid.presenters.MainPresenter
import go.sasha.noteid.views.MainView
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import javax.inject.Inject

/**
 * Created by _go.sasha on 11.06.2021.
 */
class MainActivity : MvpAppCompatActivity(), MainView {

    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    @Inject
    lateinit var router: Router

    @Inject
    lateinit var noteDao: NoteDao

    @InjectPresenter
    lateinit var mainPresenter: MainPresenter

    @ProvidePresenter
    fun provideMainPresenter(): MainPresenter = MainPresenter(router, noteDao)

    lateinit var addNoteButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        initView()

        addNoteButton.setOnClickListener {
            mainPresenter.navigateToAddNote()
        }
    }

    override fun onResume() {
        super.onResume()
        navigatorHolder.setNavigator(AppNavigator(this, -1))
    }

    override fun onPause() {
        super.onPause()
        navigatorHolder.removeNavigator()
    }

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

    private fun initView() {
        addNoteButton = findViewById(R.id.addNoteBtn)
    }
}