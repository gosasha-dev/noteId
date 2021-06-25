package go.sasha.noteid.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

/**
 * Created by _go.sasha on 13.06.2021.
 */

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    val noteId: Int,
    val name: String,
    val text: String?,
//    val createDate: Date? = null,
//    var changeDate: Date? = null
)