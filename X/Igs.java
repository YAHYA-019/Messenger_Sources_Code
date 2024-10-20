package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;

/* loaded from: Igs.class */
public final class Igs implements 4rQ {
    public static final Hvv A01 = new Object();
    public final Context A00;

    public Igs(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    public String BXf() {
        return "fs";
    }

    public HashMap CZY() {
        HashMap A0u = AnonymousClass001.A0u();
        Hvv.A00(Environment.getDataDirectory(), "device", A0u);
        try {
            synchronized (0LL.class) {
            }
            11T.A0A(Environment.getExternalStorageDirectory());
            Environment.getExternalStorageState();
            File[] externalFilesDirs = this.A00.getExternalFilesDirs(null);
            11T.A0D(externalFilesDirs);
            for (File file : externalFilesDirs) {
                if (file != null) {
                    String externalStorageState = Environment.getExternalStorageState(file);
                    if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
                        Hvv.A00(file, Environment.isExternalStorageRemovable() ? "sd" : "external", A0u);
                    }
                }
            }
        } catch (Exception e) {
            C0d7.A0B("FsInfoDataProvider", "Failed to measure external fs information", e);
        }
        return A0u;
    }
}
