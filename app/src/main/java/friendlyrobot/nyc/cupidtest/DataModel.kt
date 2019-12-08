package friendlyrobot.nyc.cupidtest

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DataModel (
    val total_matches: Long,
    val data:List<MatchItem>
)

@JsonClass(generateAdapter = true)
data class MatchItem (
    val photo: Photo
)

@JsonClass(generateAdapter = true)
data class Photo(
    val full_paths: Paths
)

@JsonClass(generateAdapter = true)
data class Paths (
    val medium: String
)

