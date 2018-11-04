package com.whoguri.learnmvp.ui.home

interface HomeView {
    fun exit()
    fun showSearch()
    fun showPost(list: ArrayList<String>)
}