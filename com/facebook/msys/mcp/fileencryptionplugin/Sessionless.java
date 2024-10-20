package com.facebook.msys.mcp.fileencryptionplugin;

import android.net.Uri;

/* loaded from: Sessionless.class */
public abstract class Sessionless {
    private boolean MsysFileEncryptionImpl_MsysFileEncryptionDecryptFileJNI(Uri uri, Uri uri2, long j) {
        return MsysFileEncryptionImpl_MsysFileEncryptionDecryptFile(uri, uri2, j);
    }

    private boolean MsysFileEncryptionImpl_MsysFileEncryptionEncryptFileJNI(Uri uri, Uri uri2, long j) {
        return MsysFileEncryptionImpl_MsysFileEncryptionEncryptFile(uri, uri2, j);
    }

    public abstract boolean MsysFileEncryptionImpl_MsysFileEncryptionDecryptFile(Uri uri, Uri uri2, long j);

    public abstract boolean MsysFileEncryptionImpl_MsysFileEncryptionEncryptFile(Uri uri, Uri uri2, long j);
}
