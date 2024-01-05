package template

import com.kotlindiscord.kord.extensions.ExtensibleBot
import com.kotlindiscord.kord.extensions.utils.env
import dev.kord.common.entity.Snowflake
import template.extensions.QRCodeExtension

val YOUR_SERVER_ID = Snowflake(
	env("TEST_SERVER").toLong()  // Get the test server ID from the env vars or a .env file.
)

private val TOKEN = env("TOKEN")   // Get the bot' token from the env vars or a .env file.

suspend fun main() {
	val bot = ExtensibleBot(TOKEN) {
		chatCommands {
			defaultPrefix = "?"
			enabled = true

			prefix { default ->
				if (guildId == YOUR_SERVER_ID) {
					// For the test server, we use ! as the command prefix
					"!"
				} else {
					// For other servers, we use the configured default prefix
					default
				}
			}
		}

		// Puts "Listening to you" under the bots' username.
		presence {
			this.listening("you")
		}

		extensions {
			add(::QRCodeExtension)
		}
	}

	bot.start()
}
