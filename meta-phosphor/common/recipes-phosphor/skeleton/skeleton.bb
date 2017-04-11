SUMMARY = "Temp placeholder for skeleton function"
DESCRIPTION = "Temp placeholder for skeleton repository"
HOMEPAGE = "http://github.com/openbmc/skeleton"
PR = "r1"

inherit obmc-phosphor-license
inherit obmc-phosphor-systemd
inherit obmc-phosphor-chassis-mgmt
inherit obmc-phosphor-fan-mgmt
inherit obmc-phosphor-flash-mgmt
inherit obmc-phosphor-policy-mgmt
inherit obmc-phosphor-sensor-mgmt
inherit obmc-phosphor-system-mgmt
inherit pythonnative
inherit python-dir

VIRTUAL-RUNTIME_skeleton_workbook ?= ""

DEPENDS += "glib-2.0 i2c-tools systemd python"
RDEPENDS_${PN} += "python-argparse python-json python-subprocess python-compression libsystemd ${VIRTUAL-RUNTIME_skeleton_workbook}"
FOXCONN_BRANCH = "Sthelens-4.7"
SRC_URI += "git://github.com/JasonLuo701/skeleton;branch=${FOXCONN_BRANCH}"

FILES_${PN} += "${PYTHON_SITEPACKAGES_DIR}/*"

# RDEPEND on pflash if the openpower-pflash machine feature is set.
PACKAGECONFIG ??= "${@bb.utils.contains('MACHINE_FEATURES', 'openpower-pflash', 'openpower-pflash', '', d)}"
PACKAGECONFIG[openpower-pflash] = ",,,pflash"

SRCREV = "fcc2944204061d68f46a62f4a3a4cbaaf0a75e11"

S = "${WORKDIR}"

# needed to invoke setuptools
export STAGING_INCDIR
export STAGING_LIBDIR
export BUILD_SYS
export HOST_SYS
export PYTHON_SITEPACKAGES_DIR

do_compile() {
        oe_runmake -C git PYTHON=${PYTHON}
}

do_install() {
        oe_runmake -C git install \
                PYTHON=${PYTHON} \
                DESTDIR=${D} \
                PREFIX=/usr
}
