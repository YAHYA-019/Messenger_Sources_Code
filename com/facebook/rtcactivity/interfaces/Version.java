package com.facebook.rtcactivity.interfaces;

import X.AnonymousClass001;
import com.facebook.common.stringformat.StringFormatUtil;

/* loaded from: Version.class */
public class Version {
    public final int major;
    public final int minor;

    public Version(int i, int i2) {
        if (i < 0) {
            throw AnonymousClass001.A0L("Major version must be non-negative");
        }
        if (i2 < 0) {
            throw AnonymousClass001.A0L("Minor version must be non-negative");
        }
        this.major = i;
        this.minor = i2;
    }

    public String toString() {
        return StringFormatUtil.formatStrLocaleSafe("%d.%d", Integer.valueOf(this.major), Integer.valueOf(this.minor));
    }
}
