package go.sasha.noteid.views

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(value =  AddToEndStrategy::class)
interface AddNoteView:MvpView {
}