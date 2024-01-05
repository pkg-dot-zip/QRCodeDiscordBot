package template.extensions

class QRHandler {
	companion object {
		fun createQRCodeFor(contents: String): String {
			return "https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=${contents}"
		}
	}
}
