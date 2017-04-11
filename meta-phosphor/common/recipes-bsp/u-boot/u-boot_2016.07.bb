require recipes-bsp/u-boot/u-boot.inc

LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
DEPENDS += "dtc-native"

SRCREV = "fd33e5a5e1fd50d2aee6172e7cece5a0c7d7f685"
UBRANCH = "v2016.07-aspeed-openbmc"
SRC_URI = "git://git@github.com/ken1029/u-boot.git;branch=${UBRANCH};protocol=https"

PV = "v2016.07+git${SRCPV}"
