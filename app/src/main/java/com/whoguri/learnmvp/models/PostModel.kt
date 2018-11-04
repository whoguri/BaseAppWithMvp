package com.whoguri.learnmvp.models

class PostModel(private val postListener: PostListener)  {
    var list:ArrayList<String>?=null
    fun getPosts(){
        list=ArrayList()
        list?.add("1")
        postListener.onPostResponse(list!!)
    }
    interface PostListener{
        fun onPostResponse(list: ArrayList<String>)
    }
}