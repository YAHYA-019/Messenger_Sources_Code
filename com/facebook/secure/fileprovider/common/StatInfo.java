package com.facebook.secure.fileprovider.common;

import X.AnonymousClass001;

/* loaded from: StatInfo.class */
public class StatInfo {
    public long device;
    public long inode;
    public int ownerGid;
    public int ownerUid;

    public StatInfo(int i, int i2, long j, long j2) {
        this.ownerUid = i;
        this.ownerGid = i2;
        this.inode = j;
        this.device = j2;
    }

    public static StatInfo newInstance(int i, int i2, long j, long j2) {
        return new StatInfo(i, i2, j, j2);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Stat{ownerUid=");
        A0k.append(this.ownerUid);
        A0k.append(",ownerGid=");
        A0k.append(this.ownerGid);
        A0k.append(",inode=");
        A0k.append(this.inode);
        A0k.append(",device=");
        A0k.append(this.device);
        return AnonymousClass001.A0d("}", A0k);
    }
}
