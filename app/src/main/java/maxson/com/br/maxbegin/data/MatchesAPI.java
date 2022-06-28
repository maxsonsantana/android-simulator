package maxson.com.br.maxbegin.data;

import java.util.List;

import maxson.com.br.maxbegin.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesAPI {
    @GET("matches.json")
    public Call<List<Match>> getMatches();
}
