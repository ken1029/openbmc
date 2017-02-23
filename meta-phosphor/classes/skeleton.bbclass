inherit obmc-phosphor-license
inherit skeleton-rev

HOMEPAGE = "http://github.com/foxconn-bmc-ks/skeleton"

SRC_URI += "${SKELETON_URI}"
S = "${WORKDIR}/git/${SKELETON_DIR}"
