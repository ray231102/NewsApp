package com.ray.newsapp.ui.homenews

import com.ray.newsapp.model.Artikel

interface ConstructorHome {

    interface View {

        fun onFailed(message: String)

        fun showDataNews(dataItemNews: List<Artikel>)

    }

    interface Presenter {

        fun getDataNews()

    }

}