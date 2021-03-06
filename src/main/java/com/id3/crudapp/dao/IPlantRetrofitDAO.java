package com.id3.crudapp.dao;

import com.id3.crudapp.dto.Plant;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface IPlantRetrofitDAO {

    @GET("/perl/mobile/viewplantsjsonarray.pl")
    Call<List<Plant>> getPlants(@Query("Combined_Name")String combinedName);

}
