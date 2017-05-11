require recipes-bsp/u-boot/u-boot.inc

LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
DEPENDS += "dtc-native"

SRCREV = "7d16525ba8ce491942d04a4e6c0f6289ab553c8d"
SRC_URI = "git://csibmc@csibmc.visualstudio.com:22/G50/_git/u-boot;protocol=ssh;"

PV = "v2016.07+git${SRCPV}"
