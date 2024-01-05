package qrcodediscordbot

import com.kotlindiscord.kord.extensions.ExtensibleBot
import com.kotlindiscord.kord.extensions.utils.env
import dev.kord.common.entity.Snowflake
import qrcodediscordbot.extensions.QRCodeExtension

val YOUR_SERVER_ID = Snowflake(
	env("TEST_SERVER").toLong()  // Get the test server ID from the env vars or a .env file.
)

private val TOKEN = env("TOKEN")   // Get the bot' token from the env vars or a .env file.

suspend fun main() {
	val bot = ExtensibleBot(TOKEN) {
		// Puts "Listening to you" under the bots' username.
		presence {
			this.listening("you")
		}

		extensions {
			// Contains the commands of the bot.
			add(::QRCodeExtension)
		}
	}

	bot.start()
}
