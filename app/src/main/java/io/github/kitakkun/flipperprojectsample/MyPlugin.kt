package io.github.kitakkun.flipperprojectsample

import com.facebook.flipper.core.FlipperConnection
import com.facebook.flipper.core.FlipperPlugin

class MyPlugin : FlipperPlugin {
    private var connection: FlipperConnection? = null

    override fun getId(): String = "my-plugin"

    override fun onConnect(connection: FlipperConnection?) {
        this.connection = connection
        this.connection?.send("connect", "\"接続されたよ！\"")
    }

    override fun onDisconnect() {
        connection = null
    }

    override fun runInBackground() = false
}
