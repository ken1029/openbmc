SUMMARY = "Phosphor python library"
DESCRIPTION = "Phosphor python library."
HOMEPAGE = "http://github.com/openbmc/pyphosphor"
PR = "r1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

inherit allarch
inherit setuptools

FOXCONN_BRANCH = "foxconn-sthelens"
SRC_URI += "git://github.com/foxconn-bmc-ks/pyphosphor;branch=${FOXCONN_BRANCH}"

SRCREV = "b3384cbea6d71eed9c311c2340571df207c6068f"

S = "${WORKDIR}/git"
