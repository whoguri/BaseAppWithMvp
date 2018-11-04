package com.whoguri.learnmvp.ui.home

import com.whoguri.learnmvp.models.PostModel

class HomePresenter(private var homeView: HomeView?) : PostModel.PostListener {
    override fun onPostResponse(list: ArrayList<String>) {
        homeView?.showPost(list)
    }

    val postModel = PostModel(this)
    fun getPost() {
        postModel.getPosts()
    }
    fun destroy(){
        homeView=null
    }
}