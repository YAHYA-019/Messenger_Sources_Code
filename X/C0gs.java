package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.0gs, reason: invalid class name */
/* loaded from: 0gs.class */
public final class C0gs extends 1AE implements C0jm {
    public boolean A00;
    public final ArrayList A01;

    public C0gs(Context context, String str, boolean z) {
        super(context, str, z);
        ArrayList A0s = AnonymousClass001.A0s();
        this.A01 = A0s;
        this.A00 = false;
        A0s.add(new C0ge(context, AnonymousClass001.A0B(context), str, "^lib/([^/]+)/([^/]+\\.so)$"));
        if (context.getApplicationInfo().splitSourceDirs == null) {
            return;
        }
        try {
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return;
                }
                C0ge c0ge = new C0ge(context, new File(strArr[i2]), str, "^lib/([^/]+)/([^/]+\\.so)$");
                C0l4 c0l4 = new C0l4(c0ge, c0ge);
                try {
                    boolean z2 = c0l4.A03().length != 0;
                    c0l4.close();
                    if (z2) {
                        android.util.Log.w("BackupSoSource", 0Pz.A0W("adding backup source from split: ", c0ge.toString()));
                        this.A01.add(c0ge);
                    }
                    i = i2 + 1;
                } catch (Throwable th) {
                    try {
                        c0l4.close();
                    } catch (Throwable th2) {
                        0Ug.A00(th, th2);
                    }
                    throw th;
                }
            }
        } catch (IOException e) {
            android.util.Log.w("BackupSoSource", "failed to read split apks", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int A05(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        if (this.A00) {
            return super/*X.13i*/.A05(threadPolicy, str, i);
        }
        return 0;
    }

    public String A07() {
        return "BackupSoSource";
    }

    public void A09(int i) {
        if ((i & 8) == 0) {
            super.A09(i);
            this.A00 = true;
        }
    }

    public C0h1 A0B() {
        return new C0h1() { // from class: X.1Ay
            @Override // X.C0h1
            public void A01(File file) {
                Iterator it = C0gs.this.A01.iterator();
                while (it.hasNext()) {
                    C0ge c0ge = (C0ge) it.next();
                    C0l4 c0l4 = new C0l4(c0ge, c0ge);
                    try {
                        c0l4.A01(file);
                        c0l4.close();
                    } catch (Throwable th) {
                        try {
                            c0l4.close();
                            throw th;
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                            throw th;
                        }
                    }
                }
            }

            @Override // X.C0h1
            public C0h3[] A02() {
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it = C0gs.this.A01.iterator();
                while (it.hasNext()) {
                    C0ge c0ge = (C0ge) it.next();
                    C0l4 c0l4 = new C0l4(c0ge, c0ge);
                    try {
                        A0s.addAll(Arrays.asList(c0l4.A02()));
                        c0l4.close();
                    } catch (Throwable th) {
                        try {
                            c0l4.close();
                            throw th;
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                            throw th;
                        }
                    }
                }
                return (C0h3[]) A0s.toArray(new C0h3[A0s.size()]);
            }
        };
    }

    public byte[] A0C() {
        byte[] marshall;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 3);
            Context context = ((1AE) this).A01;
            PackageManager packageManager = context.getPackageManager();
            int i = 0;
            if (packageManager != null) {
                try {
                    i = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                }
            }
            obtain.writeInt(i);
            ArrayList arrayList = this.A01;
            obtain.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                obtain.writeByteArray(((C0ge) it.next()).A0C());
            }
            String str = context.getApplicationInfo().sourceDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                marshall = obtain.marshall();
            } else {
                File canonicalFile = AnonymousClass001.A0E(str).getCanonicalFile();
                if (canonicalFile.exists()) {
                    obtain.writeByte((byte) 2);
                    obtain.writeString(canonicalFile.getPath());
                    obtain.writeLong(canonicalFile.lastModified());
                    marshall = obtain.marshall();
                } else {
                    obtain.writeByte((byte) 1);
                    marshall = obtain.marshall();
                }
            }
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public C0h3[] A0D() {
        C0ge c0ge = (C0ge) this.A01.get(0);
        C0l4 c0l4 = new C0l4(c0ge, c0ge);
        try {
            C0h3[] A02 = c0l4.A02();
            c0l4.close();
            return A02;
        } catch (Throwable th) {
            try {
                c0l4.close();
                throw th;
            } catch (Throwable th2) {
                0Ug.A00(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0jm
    public C0ib Cbf(Context context) {
        1AE c0gs = new C0gs(context, this.A01.getName(), true);
        try {
            c0gs.A09(0);
            return c0gs;
        } catch (IOException unused) {
            throw AnonymousClass001.A0U(c0gs);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String name;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BackupSoSource");
        A0k.append("[root = ");
        File file = this.A01;
        try {
            name = file.getCanonicalPath();
        } catch (IOException unused) {
            name = file.getName();
        }
        A0k.append(name);
        A0k.append(" flags = ");
        A0k.append(this.A00);
        A0k.append(" apks = ");
        A0k.append(this.A01.toString());
        return AnonymousClass001.A0d("]", A0k);
    }
}
