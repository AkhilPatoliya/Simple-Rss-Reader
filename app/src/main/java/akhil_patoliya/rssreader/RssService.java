package akhil_patoliya.rssreader;

import akhil_patoliya.rsslibrary.RssFeed;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Service for RSS
 */

public interface RssService {

    /**
     * No baseUrl defined. Each RSS Feed will be consumed by it's Url
     * @param url RSS Feed Url
     * @return Retrofit Call
     */
    @GET
    Call<RssFeed> getRss(@Url String url);
}
