package X;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import java.io.File;
import java.util.Collection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.0tm, reason: invalid class name */
/* loaded from: 0tm.class */
public final class C0tm extends C0ib implements C0jm {
    public final String A00;

    public C0tm(String str) {
        if (TextUtils.isEmpty(str)) {
            throw AnonymousClass001.A0L("DoppelgangerSoSource:empty apk path");
        }
        this.A00 = str;
    }

    @Override // X.C0ib
    public void A02(Collection collection) {
        collection.add(0Pz.A0W(this.A00, "!/assets/force-store/lib/"));
    }

    @Override // X.C0ib
    public int A05(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        if (C0il.A04 == null) {
            throw AnonymousClass001.A0N("SoLoader.init() not yet called");
        }
        String str2 = this.A00;
        ZipFile zipFile = new ZipFile(str2);
        try {
            ZipEntry entry = zipFile.getEntry(0Pz.A0W("assets/force-store/lib/", str));
            if (entry == null) {
                android.util.Log.w("DoppelgangerSoSource:", 0Pz.A0j(str, " does not exist in ", str2));
                zipFile.close();
                return 0;
            }
            0Xj r0 = new 0Xj(entry, zipFile);
            try {
                0kN.A03(threadPolicy, r0, str, i);
                r0.close();
                zipFile.close();
                C0il.A04.load(A08(str), i | 4);
                android.util.Log.w("DoppelgangerSoSource:", 0Pz.A0j(str, " found on ", str2));
                return 1;
            } finally {
            }
        } catch (Throwable th) {
            try {
                zipFile.close();
                throw th;
            } finally {
                0Ug.A00(th, th);
            }
        }
    }

    @Override // X.C0ib
    public File A06(String str) {
        ZipFile zipFile = new ZipFile(this.A00);
        try {
            if (zipFile.getEntry(0Pz.A0W("assets/force-store/lib/", str)) == null) {
                zipFile.close();
                return null;
            }
            zipFile.close();
            return AnonymousClass001.A0E(A08(str));
        } catch (Throwable th) {
            try {
                zipFile.close();
                throw th;
            } catch (Throwable th2) {
                0Ug.A00(th, th2);
                throw th;
            }
        }
    }

    @Override // X.C0ib
    public String A07() {
        return "DoppelgangerSoSource";
    }

    @Override // X.C0ib
    public String A08(String str) {
        return 0Pz.A0j(this.A00, "!/", 0Pz.A0W("assets/force-store/lib/", str));
    }

    @Override // X.C0jm
    public C0ib Cbf(Context context) {
        String str = this.A00;
        String name = AnonymousClass001.A0E(str).getName();
        String[] strArr = context.getApplicationInfo().splitSourceDirs;
        if (strArr != null) {
            for (String str2 : strArr) {
                if (str.equals(str2)) {
                    return this;
                }
                if (str2.endsWith(name)) {
                    android.util.Log.w("DoppelgangerSoSource:", 0Pz.A0v("Recovering, previous path: ", str, "; new path: ", str2));
                    return new C0tm(str2);
                }
            }
        }
        throw AnonymousClass001.A0T("Could not recover - split apk was removed");
    }

    @Override // X.C0ib
    public String toString() {
        return 0Pz.A0l("DoppelgangerSoSource", this.A00, "]", '[');
    }
}
