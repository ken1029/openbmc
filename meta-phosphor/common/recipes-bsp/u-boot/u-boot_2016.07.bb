require recipes-bsp/u-boot/u-boot.inc

LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
DEPENDS += "dtc-native"

SRCREV = "fa3e3baca251f483763160a291b7d9f05ef540f6"
UBRANCH = "v2016.07-aspeed-openbmc"
SRC_URI = "git://git@github.com/ken1029/u-boot.git;branch=${UBRANCH};protocol=https"

PV = "v2016.07+git${SRCPV}"
