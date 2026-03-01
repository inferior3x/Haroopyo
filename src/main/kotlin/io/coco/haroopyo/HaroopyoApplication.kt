package io.coco.haroopyo

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class HaroopyoApplication : Application() {
    override fun start(stage: Stage) {
        val shell = FXMLLoader(
            javaClass.getResource("/fxml/ui/ShellPane.fxml")
        ).load<Parent>();

        stage.title = "haroopyo"
        stage.scene = Scene(shell, 1100.0, 800.0)
        stage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(HaroopyoApplication::class.java)
        }
    }
}