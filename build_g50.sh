#!/bin/bash

REPO_DIR=`pwd`
TEMPLATECONF=$REPO_DIR/meta-openbmc-machines/meta-microsoft/meta-g50/conf/
source $REPO_DIR/oe-init-build-env
touch conf/sanity.conf
bitbake obmc-phosphor-image
