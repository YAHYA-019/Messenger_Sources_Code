package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.0zj, reason: invalid class name */
/* loaded from: 0zj.class */
public enum C0zj {
    A08("ROOT_PATH", "root-path", false),
    A07("FILES_PATH", "files-path", true),
    A03("CACHE_PATH", "cache-path", true),
    A06("EXTERNAL_PATH", "external-path", false),
    A05("EXTERNAL_FILES_PATH", "external-files-path", false),
    A04("EXTERNAL_CACHE_PATH", "external-cache-path", false);

    public final int mCaskConfigId;
    public final boolean mIsPrivate;
    public final String mTagName;
    public static final File A01 = AnonymousClass001.A0E("/");
    public static final HashMap A00 = AnonymousClass001.A0u();

    static {
        for (C0zj c0zj : values()) {
            A00.put(c0zj.mTagName, c0zj);
        }
    }

    C0zj(String str, String str2, boolean z) {
        this.mTagName = str2;
        this.mIsPrivate = z;
        this.mCaskConfigId = r303;
    }

    public File A00(Context context) {
        0OT r0 = 0OT.$redex_init_class;
        switch (this) {
            case A08:
                return A01;
            case A07:
                return context.getFilesDir();
            case A03:
                return context.getCacheDir();
            case A06:
                return Environment.getExternalStorageDirectory();
            case A05:
                return context.getExternalFilesDir(null);
            case A04:
                return context.getExternalCacheDir();
            default:
                return null;
        }
    }
}
