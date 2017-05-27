# NTFS-Win7-8-8.1-Vulenerability-check
This program checks for a new vulnebaility in NTFS happens when filename.
$MFT is the name given to one of the special metadata files that are used by Windows' NTFS filesystem. 
The file exists in the root directory of each NTFS volume, 
but the NTFS driver handles it in special ways, and it's hidden from view and inaccessible to most software. 
Attempts to open the file are normally blocked, but in a move reminiscent of the Windows 9x c:\con\con flaw,
if the filename is used as if it were a directory name—for example, trying to open the file c:\$MFT\123—then the NTFS driver takes out a 
lock on the file and never releases it. Every 
subsequent operation sits around waiting for the lock to be released.Forever. 
This blocks any and all other attempts to access the file system, and so every program will start to hang, 
rendering the machine unusable until it is rebooted.
