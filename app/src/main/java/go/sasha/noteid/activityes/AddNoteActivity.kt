package go.sasha.noteid.activityes

import android.os.Bundle
import go.sasha.noteid.R
import go.sasha.noteid.presenters.AddNotePresenter
import go.sasha.noteid.views.AddNoteView
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter

class AddNoteActivity : MvpAppCompatActivity(), AddNoteView {

    @InjectPresenter
    lateinit var addNotePresenter: AddNotePresenter

    @ProvidePresenter
    fun provideAddNotePresenter(): AddNotePresenter = AddNotePresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.fragment_add_note)
    }
}