package com.rayq.mylibrary

import com.rayq.mylibrary2.MyLibrary2Test

class UploadManager(private val testClass: MyLibrary2Test) {
    fun upload() {
        testClass.test()
    }
}