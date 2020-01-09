package org.autojs.autojsm.network.api

import kotlinx.coroutines.Deferred
import org.autojs.autojsm.network.entity.topic.Category
import org.autojs.autojsm.network.entity.topic.Topic
import retrofit2.http.GET
import retrofit2.http.Path

interface TopicApi {

    @GET("/api/category/{cid}")
    fun getCategory(@Path("cid") cid: Long): Deferred<Category>

    @GET("/api/topic/{tid}")
    fun getTopic(@Path("tid") pid: Long): Deferred<Topic>


}