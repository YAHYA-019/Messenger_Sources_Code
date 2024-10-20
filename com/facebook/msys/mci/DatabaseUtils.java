package com.facebook.msys.mci;

import X.0fH;
import X.C1jh;
import android.content.Context;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: DatabaseUtils.class */
public class DatabaseUtils {
    public static final DatabaseUtils $redex_init_class = null;

    static {
        C1jh.A00();
    }

    public static boolean copyAssetToFile(Context context, String str, File file) {
        try {
            InputStream open = context.getAssets().open(str, 2);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = open.read(bArr);
                        if (read == -1) {
                            fileOutputStream.close();
                            open.close();
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            0fH.A0x("com.facebook.msys.mci.DatabaseUtils", "Unable to copy asset to a file.", e);
            return false;
        }
    }

    public static native int restoreFromExistingDatabase(SqliteHolder sqliteHolder, String str);
}
