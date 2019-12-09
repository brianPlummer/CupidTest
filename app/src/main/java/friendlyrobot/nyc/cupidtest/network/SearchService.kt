package friendlyrobot.nyc.cupidtest.network

import friendlyrobot.nyc.cupidtest.model.DataModel
import retrofit2.Response
import retrofit2.http.GET

interface SearchService {
    @GET("matchSample.json")
    suspend fun search () : Response<DataModel>
}
