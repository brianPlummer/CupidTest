package friendlyrobot.nyc.cupidtest

import friendlyrobot.nyc.cupidtest.model.DataModel
import retrofit2.Response
import retrofit2.http.GET

interface SearchService {
    @GET("matchSample.json")
    suspend fun search () : Response<DataModel>//Call<DataModel>
}
