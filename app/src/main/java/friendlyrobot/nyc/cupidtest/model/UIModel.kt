package friendlyrobot.nyc.cupidtest.model

data class UIModel(
    val imageUrl: String,
    val username: String,
    val agePlace: String,
    val match: String,
    val selected: Boolean
)

fun MatchItem.toUIModel() : UIModel {
    val uiModel = UIModel(photo.paths.large,
        username,
        "$age \u2022 $cityName, $stateCode",
        "47% Match", false)
    return uiModel
}

fun DataModel.toUIList() = data.map { it.toUIModel()}