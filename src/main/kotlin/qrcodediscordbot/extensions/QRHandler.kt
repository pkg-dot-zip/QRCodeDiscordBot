package qrcodediscordbot.extensions

import io.ktor.http.*

class QRHandler {
	companion object {
		// Returns a direct link to the generated QR-code image as a string.
		// See https://goqr.me/api/ for usage of the API.
		fun createQRCodeFor(contents: String): String {
			return "https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=${contents.encodeURLQueryComponent()}"
		}
	}
}
