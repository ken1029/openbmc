SUMMARY = "Settings DBUS object"
DESCRIPTION = "Settings DBUS object"
HOMEPAGE = "http://github.com/openbmc/phosphor-settingsd"
PR = "r1"

inherit obmc-phosphor-license
inherit obmc-phosphor-systemd

RDEPENDS_${PN} += "python-dbus python-pygobject"

FOXCONN_BRANCH = "foxconn-sthelens"
SRC_URI += "git://github.com/Sthelens-4.7/phosphor-settingsd;branch=${FOXCONN_BRANCH}"

SRCREV = "fcc2944204061d68f46a62f4a3a4cbaaf0a75e11"

S = "${WORKDIR}/git"

do_install() {
        install -d ${D}/${sbindir}
        install ${S}/settings_file.py ${D}/${sbindir}
        install ${S}/settings_manager.py ${D}/${sbindir}
}

