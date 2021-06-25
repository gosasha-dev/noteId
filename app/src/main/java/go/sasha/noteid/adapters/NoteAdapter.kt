package go.sasha.noteid.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import go.sasha.noteid.R
import go.sasha.noteid.model.Note

/**
 * Created by _go.sasha on 14.06.2021.
 */
class NoteAdapter:RecyclerView.Adapter<NoteAdapter.ViewHolder> {

    private var noteList:List<Note> = ArrayList()

    constructor(noteList: List<Note>){
        this.noteList = noteList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = noteList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var note = noteList[position]
        holder.itemView.findViewById<TextView>(R.id.tvNoteName).text = note.name
//        holder.itemView.findViewById<TextView>(R.id.tvNoteDate).text = formatDate(note.changeDate);
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {



    }
}