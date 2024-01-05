package template.extensions

import com.kotlindiscord.kord.extensions.commands.Arguments
import com.kotlindiscord.kord.extensions.commands.converters.impl.string
import com.kotlindiscord.kord.extensions.extensions.Extension
import com.kotlindiscord.kord.extensions.extensions.publicSlashCommand
import com.kotlindiscord.kord.extensions.types.respond
import template.YOUR_SERVER_ID

class QRCodeExtension : Extension() {
	override val name = "qrcode"

	override suspend fun setup() {
		publicSlashCommand(::QRGenSlashArgs) {
			name = "QRGen"
			description = "Generates"

			guild(YOUR_SERVER_ID)  // Otherwise it will take up to an hour to update.

			// Here we send 2 separate messages.
			action {
				// Only contains text, stating what content the QR contains & who requested it.
				respond {
					content = "Creating QR-code for ${arguments.contents} requested by ${event.interaction.user.mention}"
				}

				// Contains the image of the QR. This will embed nicely on Discord.
				respond {
					content = QRHandler.createQRCodeFor(arguments.contents)
				}
			}
		}

		publicSlashCommand {
			name = "QRStop"
			description = "Stops the bot"

			guild(YOUR_SERVER_ID)  // Otherwise it will take up to an hour to update

			action {
				respond {
					content = "${event.interaction.user.mention} stopped the QRBot."
				}

				bot.stop()
			}
		}
	}

	inner class QRGenSlashArgs : Arguments() {
		val contents by string {
			name = "contents"

			description = "String to generate QR code for"
		}
	}
}
