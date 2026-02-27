package io.coco.haroopyo

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.stage.Stage

class HaroopyoApplication : Application() {
    override fun start(stage: Stage) {
        stage.title = "haroopyo"
        stage.scene = Scene(Label("Haroopyo OK"), 400.0, 200.0)
        stage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(HaroopyoApplication::class.java)
        }
    }
}