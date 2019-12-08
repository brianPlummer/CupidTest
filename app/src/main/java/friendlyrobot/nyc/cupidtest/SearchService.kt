package friendlyrobot.nyc.cupidtest

import friendlyrobot.nyc.cupidtest.model.DataModel
import retrofit2.Call
import retrofit2.http.GET

//https://www.okcupid.com/matchSample.json
interface SearchService {
    @GET("matchSample.json")
    fun search () : Call<DataModel>
}
