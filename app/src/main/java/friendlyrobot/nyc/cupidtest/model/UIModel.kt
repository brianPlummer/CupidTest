package friendlyrobot.nyc.cupidtest.model

data class UIModel(
    val imageUrl: String,
    val username: String,
    val agePlace: String,
    val match: String
)

fun MatchItem.toUIModel() : UIModel {
    val uiModel = UIModel(photo.paths.medium,
        username,
        "$age \u2022 $cityName, $stateCode",
        "47% Match")
    return uiModel
}

fun DataModel.toUIList() = data.map { it.toUIModel()}