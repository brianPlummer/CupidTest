package friendlyrobot.nyc.cupidtest.model

import androidx.room.*
import androidx.room.OnConflictStrategy

@Database(entities = arrayOf(MatchValue::class), version = 1)
abstract class MatchDatabase : RoomDatabase() {
    abstract fun matchDao(): MatchDao
}

@Entity(primaryKeys = arrayOf("username"))
data class MatchValue(
    val imageUrl: String,
    val username: String,
    val age: Int,
    val city: String,
    val state: String,
    val matchScore: Int,
    val selected: Boolean
)

fun MatchItem.toMatchValue() : MatchValue {
    return MatchValue(photo.paths.large,
        username,
        age,
        cityName,
        stateCode,
        match,
        false)
}

fun DataModel.toMatchValueList() = data.map { it.toMatchValue()}

@Dao
interface MatchDao {

    @Query("SELECT * FROM matchvalue ORDER BY matchScore DESC")
    fun getAll(): List<MatchValue>

    @Delete
    fun delete(matchValue: MatchValue)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun saveAll(matches: List<MatchValue>)

    @Update
    fun update(matchValue: MatchValue)
}
