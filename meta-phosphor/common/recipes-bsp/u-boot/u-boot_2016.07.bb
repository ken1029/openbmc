require recipes-bsp/u-boot/u-boot.inc

LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
DEPENDS += "dtc-native"

SRCREV = "fbf8433b37d4489f35426c40d15906cdf7c6800e"
SRC_URI = "git://csibmc@csibmc.visualstudio.com:22/G50/_git/u-boot;protocol=ssh;"

PV = "v2016.07+git${SRCPV}"
