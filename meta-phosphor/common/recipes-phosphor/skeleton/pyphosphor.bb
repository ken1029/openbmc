SUMMARY = "Phosphor python library"
DESCRIPTION = "Phosphor python library."
HOMEPAGE = "http://github.com/openbmc/pyphosphor"
PR = "r1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

inherit allarch
inherit setuptools

#FOXCONN_BRANCH = "foxconn-sthelens"
#SRC_URI += "git://github.com/foxconn-bmc-ks/pyphosphor;branch=${FOXCONN_BRANCH}"
SRC_URI += "git://csibmc@csibmc.visualstudio.com:22/G50/_git/pyphosphor;protocol=ssh;"

SRCREV = "29ce8796cf66d65d2def8d520bd76a9e64cbf306"

S = "${WORKDIR}/git"
