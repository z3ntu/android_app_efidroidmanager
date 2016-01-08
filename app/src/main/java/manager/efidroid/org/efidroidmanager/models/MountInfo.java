package manager.efidroid.org.efidroidmanager.models;

import java.util.List;

import manager.efidroid.org.efidroidmanager.types.MountEntry;

public class MountInfo {
    private final List<MountEntry> mMountEntries;

    public MountInfo(List<MountEntry> mountEntries) {
        mMountEntries = mountEntries;
    }

    public MountEntry getByMajorMinor(int major, int minor) {
        for(MountEntry mountEntry : mMountEntries) {
            if(mountEntry.getMajor()==major && mountEntry.getMinor()==minor && mountEntry.getRoot().equals("/")) {
                return mountEntry;
            }
        }

        return null;
    }
}
