SUMMARY = "Phosphor OpenBMC IPMI daemon"
DESCRIPTION = "Phosphor OpenBMC IPMI router and plugin libraries"
HOMEPAGE = "http://github.com/openbmc/phosphor-host-ipmid"
PR = "r1"

RRECOMMENDS_${PN} += "virtual/obmc-phosphor-host-ipmi-hw"

RRECOMMENDS_${PN} += "${VIRTUAL-RUNTIME_obmc-phosphor-ipmi-parsers}"


inherit obmc-phosphor-license
inherit obmc-phosphor-sdbus-service
inherit obmc-phosphor-c-daemon

TARGET_CFLAGS   += "-fpic"

RDEPENDS_${PN} += "clear-once"
RDEPENDS_${PN} += "settings"
RDEPENDS_${PN} += "network"
SRC_URI += "git://github.com/ken1029/phosphor-host-ipmid"

SRCREV = "176c1c279d71f7999f135d0aebc916d9eb4e9111"

S = "${WORKDIR}/git"
INSTALL_NAME = "ipmid"

do_install() {
        install -m 0755 -d ${D}${libdir}/host-ipmid
        install -m 0755 ${S}/*.so ${D}${libdir}/host-ipmid/

        install -m 0755 -d ${D}${includedir}/host-ipmid
        install -m 0644 ${S}/ipmid-api.h ${D}${includedir}/host-ipmid/
}
