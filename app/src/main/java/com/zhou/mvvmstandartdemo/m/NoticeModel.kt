package com.zhou.mvvmstandartdemo.m

interface NoticeModelInterface {
    fun getNotice(): String
}

class NoticeModel : NoticeModelInterface {
    companion object {
        var seriNum = 0
    }

    override fun getNotice(): String {
        return "假装从数据库获取了一条通知，，，${seriNum++}"
    }
}
