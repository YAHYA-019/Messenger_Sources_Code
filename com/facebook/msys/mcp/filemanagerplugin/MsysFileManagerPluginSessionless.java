package com.facebook.msys.mcp.filemanagerplugin;

import X.0fH;
import X.4YW;
import X.AnonymousClass001;
import X.C0A2;
import android.net.Uri;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.FileManager;
import com.facebook.valueholder.ValueHolder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: MsysFileManagerPluginSessionless.class */
public class MsysFileManagerPluginSessionless extends Sessionless {
    public static final String TAG = "MsysFileManagerPluginSessionless";

    public static String A00(String str, boolean z) {
        StringBuilder A0k = AnonymousClass001.A0k();
        if (str.startsWith("/")) {
            A0k.append("file://");
        }
        A0k.append(str);
        if (z && !str.endsWith("/")) {
            A0k.append("/");
        }
        return A0k.toString();
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public void MsysFileManagerImpl_MsysFileManagerClearURLResourcePropertyCacheFileSize(Uri uri) {
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public List MsysFileManagerImpl_MsysFileManagerCopyContentsOfDirectoryAtURL(Uri uri) {
        if (!FileManager.sInitialized) {
            throw new MsysError("FileManagerInitializationError", 0, null);
        }
        String[] listDirectory = FileManager.listDirectory(uri.toString());
        ArrayList A0s = AnonymousClass001.A0s();
        int length = listDirectory.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0s;
            }
            A0s.add(C0A2.A03(A00(listDirectory[i2], false)));
            i = i2 + 1;
        }
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public boolean MsysFileManagerImpl_MsysFileManagerCopyFile(Uri uri, Uri uri2, ValueHolder valueHolder) {
        if (!FileManager.sInitialized) {
            throw 4YW.A04();
        }
        FileManager.copyFile(uri.toString(), uri2.toString());
        return true;
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public Uri MsysFileManagerImpl_MsysFileManagerCopyHomeDirectoryURL() {
        return null;
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public Uri MsysFileManagerImpl_MsysFileManagerCreateCacheDirectory(String str) {
        if (FileManager.sInitialized) {
            return C0A2.A03(A00(FileManager.createCacheDirectory(str), true));
        }
        throw 4YW.A04();
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public byte[] MsysFileManagerImpl_MsysFileManagerCreateDataWithContentsOfFile(Uri uri, int i, ValueHolder valueHolder) {
        if (!FileManager.sInitialized) {
            throw 4YW.A04();
        }
        uri.getClass();
        return FileManager.readFile(uri.toString());
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public boolean MsysFileManagerImpl_MsysFileManagerCreateDirectory(Uri uri) {
        if (!FileManager.sInitialized) {
            throw 4YW.A04();
        }
        FileManager.createDirectory(uri.toString());
        return true;
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public String MsysFileManagerImpl_MsysFileManagerCreateStringWithContentsOfFile(Uri uri, int i, ValueHolder valueHolder) {
        if (FileManager.sInitialized) {
            return new String(FileManager.readFile(uri.toString()), StandardCharsets.UTF_8);
        }
        throw new MsysError("FileManagerInitializationError", 0, null);
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public Uri MsysFileManagerImpl_MsysFileManagerCreateTemporaryDirectoryURL() {
        if (FileManager.sInitialized) {
            return C0A2.A03(A00(FileManager.mCacheDir.toString(), true));
        }
        0fH.A0k(TAG, "FileManager is not initialized");
        return null;
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public boolean MsysFileManagerImpl_MsysFileManagerDeleteDatabaseFile(Uri uri) {
        return MsysFileManagerImpl_MsysFileManagerDeleteItem(uri);
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public boolean MsysFileManagerImpl_MsysFileManagerDeleteItem(Uri uri) {
        if (!FileManager.sInitialized) {
            throw 4YW.A04();
        }
        FileManager.deleteItem(uri.toString());
        return true;
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public boolean MsysFileManagerImpl_MsysFileManagerItemExists(Uri uri) {
        if (FileManager.sInitialized) {
            return FileManager.itemExists(uri.toString());
        }
        0fH.A0k(TAG, "FileManager is not initialized");
        return false;
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public boolean MsysFileManagerImpl_MsysFileManagerMoveFile(Uri uri, Uri uri2, ValueHolder valueHolder, ValueHolder valueHolder2) {
        if (!FileManager.sInitialized) {
            throw 4YW.A04();
        }
        FileManager.moveFile(uri.toString(), uri2.toString());
        return true;
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public boolean MsysFileManagerImpl_MsysFileManagerWriteDataToFile(byte[] bArr, Uri uri, ValueHolder valueHolder, boolean z) {
        if (!FileManager.sInitialized) {
            throw 4YW.A04();
        }
        FileManager.writeDataToFile(bArr, uri.toString(), z);
        return true;
    }
}
