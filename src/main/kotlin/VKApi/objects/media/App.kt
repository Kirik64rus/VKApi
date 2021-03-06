package VKApi.objects.media

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by bigz on 22.05.17.
 */

data class App(@JsonProperty("id") val id: Int,
               @JsonProperty("name") val name: String,
               @JsonProperty("photo_130") val photo130: String,
               @JsonProperty("photo_604") val photo_604: String):Media
