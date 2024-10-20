package com.facebook.msys.mcp.devicebackupplugin;

import X.1BY;
import X.7zL;
import X.C00i;
import android.net.Uri;
import com.facebook.inject.FbInjector;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.DeviceBackup;

/* loaded from: MsysDeviceBackupPluginSessionless.class */
public class MsysDeviceBackupPluginSessionless extends Sessionless {
    public static final String TAG = "MsysDeviceBackupPluginSessionless";
    public 1BY _UL_mInjectionContext;
    public final C00i mDeviceBackup = 7zL.A0R(FbInjector.A00(), 68318);

    @Override // com.facebook.msys.mcp.devicebackupplugin.Sessionless
    public String MsysDeviceBackupImpl_MsysDeviceBackupCreateContentHash(String str) {
        return null;
    }

    @Override // com.facebook.msys.mcp.devicebackupplugin.Sessionless
    public boolean MsysDeviceBackupImpl_MsysDeviceBackupFileToDevice(Uri uri, String str) {
        if (((DeviceBackup) this.mDeviceBackup.get()).backupFile(uri.toString(), str)) {
            return true;
        }
        throw new MsysError(TAG, 5, null);
    }
}
