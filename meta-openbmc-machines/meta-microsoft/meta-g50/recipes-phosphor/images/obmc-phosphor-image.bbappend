inherit extrausers

EXTRA_USERS_PARAMS = " \
  useradd -ou 0 -d /home/root -G sudo,root -p 'gzW59equAcJAg' sysadmin; \
  useradd -ou 0 -d /home/sshuser -G sudo,root -p 'gzW59equAcJAg' sshuser; \
  usermod -L root; \
  "
OBMC_IMAGE_EXTRA_INSTALL_append = " oob-ipmid"
