#JumpGo Browser [![Build Status](https://travis-ci.org/JTechMe/JumpGo.svg)](https://travis-ci.org/JTechMe/JumpGo)
####Finally! Out of the beta!
#![](ic_launcher_small.png)
####Download
* [Download APK from here](https://github.com/JTechMe/JumpGo/releases)

* [Download from Google Play](https://play.google.com/store/apps/details?id=com.jtechme.jumpgo)

####Master Branch
* [![Build Status](https://travis-ci.org/JTechMe/JumpGo.svg?branch=master)](https://travis-ci.org/JTechMe/JumpGo)

####Dev Branch
* [![Build Status](https://travis-ci.org/JTechMe/JumpGo.svg?branch=dev)](https://travis-ci.org/JTechMe/JumpGo)

####Features
* Bookmarks

* History

* Multiple search engines (Google, Bing, Yahoo, StartPage, DuckDuckGo, etc.)

* Incognito mode

* Follows Google design guidelines

* Unique utilization of navigation drawer for tabs

* Google search suggestions

* Orbot Proxy support and I2P support

## 2016 Development Checklist
- [x] Android N
 - [x] Multi-Window support
- [x] Update hosts.txt
- [ ] Add JumpGo Login
- [ ] Hidden Game Mode
- [x] Add Shortcuts to Launcher
 - [x] Add permission to manifest
 - [x] Add shortcut functionality to BrowserActivity
 - [x] Add strings
- [ ] Add Theme Creator
- [ ] Option to backup Bookmarks to Drive
 - [ ] Add Google login API
 - [ ] Add functionality

####Permissions

* ````INTERNET````: For accessing the web

* ````WRITE_EXTERNAL_STORAGE````: For downloading files from the browser

* ````READ_EXTERNAL_STORAGE````: For downloading files from the browser

* ````ACCESS_FINE_LOCATION````: For sites like Google Maps, it is disabled by default in settings and displays a pop-up asking if a site may use your location when it is enabled

* ````ACCESS_NETWORK_STATE````: Required for the WebView to function by some OEM versions of WebKit

####The Code
* Please contribute code back if you can. The code isn't perfect.
* Please add translations/translation fixes as you see need

####Contributing
* Contributions are always welcome
* If you want a feature and can code, feel free to fork and add the change yourself and make a pull request
* PLEASE use the ````dev```` branch when contributing as the ````master```` branch is supposed to be for stable builds. I will not reject your pull request if you make it on master, but it will annoy me and make my life harder.
  * Find the ````dev```` branch at [https://github.com/JTechMe/JumpGo/tree/dev](https://github.com/JTechMe/JumpGo/tree/dev)
* Code Style
    * Standard Java camel case
    * Member variables are preceded with an 'm'
    * Use 4 spaces instead of a tab (\t)

####Setting Up the Project
Due to the inclusion of the netcipher library for Orbot proxy support, importing the project will show you some errors. To fix this, first run the following git command in your project folder (NOTE: You need the git command installed to use this):
````
git submodule update --init --recursive
````
Once you run that command, the IDE should automatically import netcipher and a couple submodules in as separate projects. Than you need to set the netcipher library project as a libary of the browser project however your IDE makes you do that. Once those steps are done, the project should be all set up and ready to go. [Please read this tutorial for more information on git submodules](http://www.vogella.com/tutorials/Git/article.html#submodules)

####License
JumpGo Project
````
Copyright 2015 Josiah Horton

JumpGo Project Family

   This Source Code Form is subject to the terms of the 
   General Open Control License, v. 1.0. If a copy of the GOC 
   was not distributed with this file, You can obtain one at 
   
   https://github.com/JTechMe/GOC-General-Open-Control-Licence-v1.0/
````
Lightning Browser
````
Copyright 2014 Anthony Restaino

Lightning Browser

   This Source Code Form is subject to the terms of the 
   Mozilla Public License, v. 2.0. If a copy of the MPL 
   was not distributed with this file, You can obtain one at 
   
   http://mozilla.org/MPL/2.0/
````
This application is derived from the Lightning Browser source code found at [https://github.com/anthonycr/Lightning-Browser](https://github.com/anthonycr/Lightning-Browser). Changes made to this repo are intended for the JumpGo Browser but can be coppied to the Lightning Browser dev branch at [https://github.com/anthonycr/Lightning-Browser/tree/dev](https://github.com/anthonycr/Lightning-Browser/tree/dev) if requested.

If you have any questions regarding the open-source license, please contact me at [jtechme.org@gmail.com](jtechme.org@gmail.com)
