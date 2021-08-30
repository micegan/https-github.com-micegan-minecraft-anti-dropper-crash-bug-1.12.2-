# https-github.com-micegan-minecraft-anti-dropper-crash-bug-1.12.2-
Plugin, that prevents server crash on powering dispenser with shulker full of items or blocks. 1.12.2 only, minecraft
This plugin breaks any dispenser, that was placed at building hight limit if it was placed upwards (Faced up) or any dispenser that situated on Y = 0 position if the dispenser is faced down, the easiest way to prevent such a minecraft bug.

Url on Spigot: https://www.spigotmc.org/resources/1-12-2-anti-dispenser-server-crash.89724/

How does this minecraft 1.12.2 bug works?
Shulker box is putted inside of dispenser, in case if dspenser is situated on height limit on Y axis or 0 on Y axis (Coordinates) it should cost a massive damage to the 1.12.2 server, as server tries to place shulker box block on top of the dispenser, which is higher than world height limit, this bug works only for 1.12.2 version.
