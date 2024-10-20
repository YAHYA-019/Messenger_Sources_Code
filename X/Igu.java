package X;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.common.dextricks.OdexSchemeArtTurbo;
import com.mapbox.mapboxsdk.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: Igu.class */
public final class Igu implements 4rQ {
    public static final String[] A02 = {"base.odex", "base.vdex", "base.art", "base.oat"};
    public static final String[] A03 = {"arm", BuildConfig.CPU_FILTERS, "x86", "x86_64"};
    public final Context A00;
    public final String[] A01;

    public Igu(Context context, String[] strArr) {
        1BL.A1F(context, strArr);
        this.A00 = context;
        this.A01 = strArr;
    }

    public String BXf() {
        return "code";
    }

    public HashMap CZY() {
        File absoluteFile;
        HashMap A0u = AnonymousClass001.A0u();
        Context context = this.A00;
        File A0E = AnonymousClass001.A0E(context.getPackageCodePath());
        4sL h0n = new H0N(4sJ.A01(A0E));
        A0u.put("apk", h0n);
        File parentFile = A0E.getParentFile();
        if (parentFile != null) {
            try {
                absoluteFile = parentFile.getCanonicalFile();
            } catch (IOException unused) {
                absoluteFile = parentFile.getAbsoluteFile();
            }
            11T.A0A(absoluteFile);
            H0N h0n2 = new H0N(4sJ.A01(absoluteFile));
            4sL r304 = new 4sL(0L, 0L, 0L);
            File A0D = AnonymousClass001.A0D(absoluteFile, OdexSchemeArtTurbo.OREO_ODEX_DIR);
            String[] strArr = A03;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= 4) {
                    break;
                }
                File A0D2 = AnonymousClass001.A0D(A0D, strArr[i2]);
                for (String str : this.A01) {
                    try {
                        int length = str.length() - 1;
                        int i3 = 0;
                        boolean z = false;
                        while (i3 <= length) {
                            int i4 = length;
                            if (!z) {
                                i4 = i3;
                            }
                            boolean A1U = GOp.A1U(11T.A00(str.charAt(i4), 32));
                            if (z) {
                                if (!A1U) {
                                    break;
                                }
                                length--;
                            } else if (A1U) {
                                i3++;
                            } else {
                                z = true;
                            }
                        }
                        4sL A01 = 4sJ.A01(AnonymousClass001.A0D(A0D2, GOq.A0z(length, i3, str)));
                        if (A01.A02 != 0) {
                            r304 = r304.A00(A01);
                            A0u.put(0Pz.A0W("<oat_dir>/", str), new H0N(A01));
                        }
                    } catch (Exception unused2) {
                    }
                }
                i = i2 + 1;
            }
            H0N h0n3 = new H0N(r304);
            A0u.put("extra", h0n3);
            h0n = new H0N(h0n2.A00(h0n3));
        }
        long j = -1;
        StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (storageStatsManager != null && applicationInfo != null) {
            try {
                StorageStats queryStatsForUid = storageStatsManager.queryStatsForUid(applicationInfo.storageUuid, applicationInfo.uid);
                11T.A0A(queryStatsForUid);
                j = queryStatsForUid.getAppBytes();
            } catch (IOException | SecurityException unused3) {
            }
        }
        if (j < 0) {
            A0u.put("code", h0n);
            return A0u;
        }
        A0u.put("bf_measurement", h0n);
        A0u.put("code", new 4sL(j, j, h0n.A01));
        return A0u;
    }
}
