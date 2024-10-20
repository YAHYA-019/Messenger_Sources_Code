package com.facebook.msys.mcp.devicebackupplugin;

import android.net.Uri;

/* loaded from: Sessionless.class */
public abstract class Sessionless {
    private String MsysDeviceBackupImpl_MsysDeviceBackupCreateContentHashJNI(String str) {
        return null;
    }

    private boolean MsysDeviceBackupImpl_MsysDeviceBackupFileToDeviceJNI(Uri uri, String str) {
        return MsysDeviceBackupImpl_MsysDeviceBackupFileToDevice(uri, str);
    }

    public abstract String MsysDeviceBackupImpl_MsysDeviceBackupCreateContentHash(String str);

    public abstract boolean MsysDeviceBackupImpl_MsysDeviceBackupFileToDevice(Uri uri, String str);
}
