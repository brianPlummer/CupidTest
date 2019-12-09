package friendlyrobot.nyc.cupidtest.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DataModel (
    val total_matches: Long,
    val data:List<MatchItem>
)

@JsonClass(generateAdapter = true)
data class MatchItem (
    val photo: Photo,
    val username: String,
    @Json(name ="city_name")
    val cityName: String,
    @Json(name ="state_code")
    val stateCode: String,
    val match: Long,
    val age: Int
)

@JsonClass(generateAdapter = true)
data class Photo(
    @Json(name ="full_paths")
    val paths: Paths
)

@JsonClass(generateAdapter = true)
data class Paths (
    val medium: String,
    val large: String
)

