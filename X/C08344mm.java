package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: X.4mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4mm.class */
public final class C08344mm {
    public static final 7uJ A01 = new Object();
    public final Context A00;

    public C08344mm() {
        Context context = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);
        11T.A0F(context, 1);
        this.A00 = context;
    }

    private final PackageInfo A00() {
        Context context = this.A00;
        if (context.getPackageName() == null) {
            0fH.A0k("MetaInfReaderBase", "Package Name is null");
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getPackageInfo(context.getPackageName(), 0);
            }
            throw new IllegalStateException("Required value was null.");
        } catch (PackageManager.NameNotFoundException e) {
            0fH.A0s("MetaInfReaderBase", "PackageManager couldn't fetch info", e);
            return null;
        }
    }

    public static final String A01(C08344mm c08344mm) {
        String str;
        Object[] objArr;
        String str2;
        PackageInfo A00 = c08344mm.A00();
        if (A00 == null) {
            str = "MetaInfReaderBase";
            objArr = new Object[]{c08344mm.A00.getPackageName()};
            str2 = "packageInfo is null for: %s";
        } else {
            ApplicationInfo applicationInfo = A00.applicationInfo;
            if (applicationInfo != null) {
                return applicationInfo.publicSourceDir;
            }
            str = "MetaInfReaderBase";
            objArr = new Object[]{c08344mm.A00.getPackageName()};
            str2 = "applicationInfo is null for: %s";
        }
        0fH.A14(str, str2, objArr);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e6, code lost:
    
        if (r308 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e9, code lost:
    
        r308 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f7, code lost:
    
        r0 = r308.getNextEntry();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0100, code lost:
    
        if (r0 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0103, code lost:
    
        r0 = r0.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010c, code lost:
    
        if (r0 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0119, code lost:
    
        if (r0.equals(r302) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0123, code lost:
    
        X.0fH.A0g(r302, "MetaInfReaderBase", "found %s in zip");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x018f, code lost:
    
        r307 = X.1BK.A0h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:
    
        r305 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
    
        X.0fH.A0s("MetaInfReaderBase", "Threw entry reading zip", r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013c, code lost:
    
        r308.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0140, code lost:
    
        r308 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.util.zip.ZipInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A02(X.C08344mm r301, java.lang.String r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08344mm.A02(X.4mm, java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x019e, code lost:
    
        if (0 == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        if (r309 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0184, code lost:
    
        r309.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019a, code lost:
    
        return r305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0173, code lost:
    
        if (r309 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0181, code lost:
    
        if (r309 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0151, code lost:
    
        if (r309 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0135, code lost:
    
        if (r309 == null) goto L5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A03(boolean r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08344mm.A03(boolean, boolean):java.lang.String");
    }
}
