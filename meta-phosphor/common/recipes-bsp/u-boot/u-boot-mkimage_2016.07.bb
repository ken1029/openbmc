SUMMARY = "U-Boot bootloader image creation tool"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
SECTION = "bootloader"

DEPENDS = "openssl"

SRCREV = "7d16525ba8ce491942d04a4e6c0f6289ab553c8d"
UBRANCH = "foxconn-v2016.07-aspeed-openbmc"
SRC_URI = "git://git@github.com/foxconn-bmc-ks/u-boot.git;branch=${UBRANCH};protocol=https"

PV = "v2016.07+git${SRCPV}"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = 'CROSS_COMPILE="${TARGET_PREFIX}" CC="${CC} ${CFLAGS} ${LDFLAGS}" STRIP=true V=1'

do_compile () {
	oe_runmake sandbox_defconfig
	oe_runmake cross_tools NO_SDL=1
}

do_install () {
	install -d ${D}${bindir}
	install -m 0755 tools/mkimage ${D}${bindir}/uboot-mkimage
	ln -sf uboot-mkimage ${D}${bindir}/mkimage
}

BBCLASSEXTEND = "native nativesdk"
