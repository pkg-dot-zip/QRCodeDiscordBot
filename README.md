<p align="center">
  <a href="https://github.com/pkg-dot-zip/QRCodeDiscordBot/" rel="noopener">
 <img width=200px height=200px src="https://avatars.githubusercontent.com/u/52533705?v=4" alt="Project logo"></a>
</p>

<h3 align="center">QRCodeDiscordBot</h3>

<div align="center">

  [![Stars](https://img.shields.io/github/stars/pkg-dot-zip/QRCodeDiscordBot.svg)](https://github.com/pkg-dot-zip/QRCodeDiscordBot/stargazers)
  [![GitHub Issues](https://img.shields.io/github/issues/pkg-dot-zip/QRCodeDiscordBot.svg)](https://github.com/pkg-dot-zip/QRCodeDiscordBot/issues)
  [![GitHub Pull Requests](https://img.shields.io/github/issues-pr/pkg-dot-zip/QRCodeDiscordBot.svg)](https://github.com/pkg-dot-zip/QRCodeDiscordBot/pulls)
  [![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

---

<p align="center"> A QR-code generating Discord bot written in Kotlin using <a href=""https://github.com/kordlib/kord>Kord</a>.
    <br> 
</p>

## 📝 Table of Contents
- [About](#about)
- [Getting Started](#getting_started)
- [Usage](#usage)
- [Built Using](#built_using)
- [Authors](#authors)

## 🧐 About <a name = "about"></a>
**QRCodeDiscordBot** is a [Discord](https://discord.com/) bot for generating QR-codes, programmed in [Kotlin](https://kotlinlang.org/) using [Kord](https://github.com/kordlib/kord). I created this because of my unwarranted love for QR-codes & Kotlin, while also wanting to learn how to create Discord bots due to the increasing demand of these bots. The bot itself is quite simple; everything was setup and running in an hour. 

You need to run this bot yourself, since I don't host it anywhere. Fortunately, this is a very simple task.

## 🏁 Getting Started <a name = "getting_started"></a>
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
What things you need to install the software. If you are a developer already you probably have these components installed.

- An IDE for Kotlin development. I used IntelliJ Ultimate Edition _(2023.3.2)_, and recommend you use [IntelliJ](https://www.jetbrains.com/idea/download/?section=windows) as well.
- Java installed. This project targets version 17 on the JVM.

### Installing
A step by step series of examples that tell you how to get a development env running.

1. Enable the developer mode for you account in your Discord application (this can also be done on mobile). 
2. Go to the [developer portal](https://discord.com/developers/applications).
3. Create a new application. Make sure to name the bot appropriately.
4. Navigate to the “Bot” tab to configure it.
5. Create a ".env" file in the top of the project directory.
6. Put variables for _TEST_SERVER_ & _TOKEN_. _TEST_SERVER_ being your server's ID & _TOKEN_ being your bot's token from your developer portal. If this step confuses you check out [this](https://github.com/Kord-Extensions/template) page.
7. Run the project.

## 🎈 Usage <a name="usage"></a>
Use _/qrgen [CONTENTS]_ to generate a QR-code of the given content.

Use _/qrstop_ to stop the bot.

## ⛏️ Built Using <a name = "built_using"></a>
- [Kotlin](https://kotlinlang.org/) - Language used to program the bot in
- [Kord](https://github.com/kordlib/kord) - Modularized implementation of the Discord API
- [Kord Essentials Template](https://github.com/Kord-Extensions/template/) - Template used
- [QR code API](https://goqr.me/api/) - API used for retrieving QR-codes

## ✍️ Authors <a name = "authors"></a>
- [@OnsPetruske](https://github.com/pkg-dot-zip) - Idea & Initial work

See also the list of [contributors](https://github.com/pkg-dot-zip/QRCodeDiscordBot/contributors) who participated in this project.
