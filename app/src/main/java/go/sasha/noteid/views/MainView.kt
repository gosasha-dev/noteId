package go.sasha.noteid.views

import go.sasha.noteid.model.Note
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.StateStrategyType

/**
 * Created by _go.sasha on 11.06.2021.
 */

//Эта стратегия - можно для всего интерфейса, а можно для конкретного метода
@StateStrategyType(value = AddToEndStrategy::class)
interface MainView : MvpView {

    //набор методов интерфейса, которые реализует активити, где юзаем(имплиментим это)

    fun onNotesLoaded(notes: List<Note>)

    fun updateView()

    fun onSearchResult(notes: List<Note>)

    fun onAllNotesDeleted()

    fun onNoteDeleted()

    fun showNoteInfoDialog()

    fun showNoteDeleteDialog(notePosition: Int)

    fun hideNoteDeleteDialog()

    fun showNoteContextDialog(notePosition: Int)

    fun hideNoteContextDialog()

}