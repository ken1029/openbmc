SUMMARY = "Phosphor python library"
DESCRIPTION = "Phosphor python library."
HOMEPAGE = "http://github.com/openbmc/pyphosphor"
PR = "r1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

inherit allarch
inherit setuptools

SRC_URI += "git://csibmc@csibmc.visualstudio.com:22/G50/_git/pyphosphor;protocol=ssh;"

SRCREV = "234d1d3fb5f9af2c6cd14fd520584f0a2ae97b2b"

S = "${WORKDIR}/git"
