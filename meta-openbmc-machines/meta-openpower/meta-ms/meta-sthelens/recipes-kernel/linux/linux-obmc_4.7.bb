KBRANCH ?= "foxconn-sthelens-4.7"
LINUX_VERSION ?= "4.7"
SRCREV="ad6f155e7b922d3f278337d7618dd88b2dc6e6f3"
KSRC = "git://github.com/foxconn-bmc-ks/linux;protocol=git;branch=${KBRANCH}"

require common/recipes-kernel/linux/linux-obmc.inc
