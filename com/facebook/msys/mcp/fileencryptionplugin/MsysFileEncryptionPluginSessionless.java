package com.facebook.msys.mcp.fileencryptionplugin;

import android.net.Uri;
import com.facebook.messenger.msys.filemanager.implementations.FileEncryptionProviderImpl;
import com.facebook.msys.mcf.MsysError;

/* loaded from: MsysFileEncryptionPluginSessionless.class */
public class MsysFileEncryptionPluginSessionless extends Sessionless {
    public static final String TAG = "MsysFileEncryptionPluginSessionless";

    public static MsysError populateGenericError() {
        return new MsysError(TAG, 1, null);
    }

    @Override // com.facebook.msys.mcp.fileencryptionplugin.Sessionless
    public boolean MsysFileEncryptionImpl_MsysFileEncryptionDecryptFile(Uri uri, Uri uri2, long j) {
        return FileEncryptionProviderImpl.nativeDecryptFile(uri.toString(), uri2.toString(), j);
    }

    @Override // com.facebook.msys.mcp.fileencryptionplugin.Sessionless
    public boolean MsysFileEncryptionImpl_MsysFileEncryptionEncryptFile(Uri uri, Uri uri2, long j) {
        if (FileEncryptionProviderImpl.nativeEncryptFile(uri.toString(), uri2.toString(), j)) {
            return true;
        }
        throw populateGenericError();
    }
}
