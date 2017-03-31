KBRANCH ?= "dev-4.7-wip"
LINUX_VERSION ?= "4.7"
SRCREV="613f95e9cadcf4371732401e53f2c43b2bbe2119"
KSRC = "git://github.com/ken1029/linux;protocol=git;branch=${KBRANCH}"

require common/recipes-kernel/linux/linux-obmc.inc
