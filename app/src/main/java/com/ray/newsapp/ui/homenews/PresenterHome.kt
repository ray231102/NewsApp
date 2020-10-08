package com.ray.newsapp.ui.homenews

import com.ray.newsapp.model.Artikel
import com.ray.newsapp.model.Newsmodel
import com.ray.newsapp.network.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@Suppress("UNCHECKED_CAST")
class PresenterHome (model: ConstructorHome.View): ConstructorHome.Presenter {

    var view: ConstructorHome.View? = null

    init {
        view = model
    }

    override fun getDataNews() {
        ApiConfig.create().getNews().enqueue(object : Callback<Newsmodel> {
            override fun onResponse(call: Call<Newsmodel>, response: Response<Newsmodel>) {
                if (response.isSuccessful) {
                    view?.showDataNews(response.body()?.articles as List<Artikel>)
                } else {
                    view?.onFailed(response.toString())
                }
            }

            override fun onFailure(call: Call<Newsmodel>, t: Throwable) {
                view?.onFailed(t.toString())
            }

        })
    }

}