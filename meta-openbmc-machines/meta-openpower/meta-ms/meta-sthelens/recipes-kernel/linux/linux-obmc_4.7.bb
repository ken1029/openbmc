KBRANCH ?= "dev-4.7-wip"
LINUX_VERSION ?= "4.7"
SRCREV="988cb3d6ec50689b4e8a6985bebc084486d772b2"
KSRC = "git://github.com/ken1029/linux;protocol=git;branch=${KBRANCH}"

require common/recipes-kernel/linux/linux-obmc.inc
