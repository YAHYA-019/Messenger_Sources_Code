package X;

import android.os.StrictMode;
import com.facebook.soloader.SoLoaderULErrorFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;

/* renamed from: X.13i, reason: invalid class name */
/* loaded from: 13i.class */
public class C13i extends C0ib {
    public int A00;
    public final File A01;

    public C13i(File file, int i) {
        this.A01 = file;
        this.A00 = i;
    }

    @Override // X.C0ib
    public void A02(Collection collection) {
        try {
            collection.add(this.A01.getCanonicalPath());
        } catch (IOException e) {
            File file = this.A01;
            android.util.Log.e("SoLoader", 0Pz.A0z("Failed to get canonical path for ", file.getName(), " due to ", e.toString(), ", falling to the absolute one"));
            collection.add(file.getAbsolutePath());
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0SH, java.lang.Object, X.0mf] */
    @Override // X.C0ib
    public String[] A03(String str) {
        File A0A = A0A(str);
        if (A0A == null) {
            return null;
        }
        ?? obj = new Object();
        ((0SH) obj).A00 = A0A;
        FileInputStream A0F = AnonymousClass001.A0F(A0A);
        ((0SH) obj).A01 = A0F;
        ((0SH) obj).A02 = A0F.getChannel();
        try {
            String[] A09 = 0kN.A09((C0mf) obj, str);
            obj.close();
            return A09;
        } catch (Throwable th) {
            try {
                obj.close();
                throw th;
            } catch (Throwable th2) {
                0Ug.A00(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.0SH, java.lang.Object, X.0mf] */
    @Override // X.C0ib
    public int A05(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        File file = this.A01;
        if (C0il.A04 == null) {
            throw AnonymousClass001.A0N("SoLoader.init() not yet called");
        }
        File A0A = A0A(str);
        if (A0A == null) {
            C0l8.A01("SoLoader", 0Pz.A0j(str, " file not found on ", file.getCanonicalPath()));
            return 0;
        }
        String canonicalPath = A0A.getCanonicalPath();
        C0l8.A00("SoLoader", 0Pz.A0j(str, " file found at ", canonicalPath));
        if ((i & 1) != 0 && (this.A00 & 2) != 0) {
            C0l8.A00("SoLoader", 0Pz.A0W(str, " loaded implicitly"));
            return 2;
        }
        if ((this.A00 & 1) != 0) {
            ?? obj = new Object();
            ((0SH) obj).A00 = A0A;
            FileInputStream fileInputStream = new FileInputStream(A0A);
            ((0SH) obj).A01 = fileInputStream;
            ((0SH) obj).A02 = fileInputStream.getChannel();
            try {
                0kN.A03(threadPolicy, (C0mf) obj, str, i);
                obj.close();
            } catch (Throwable th) {
                try {
                    obj.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
        } else {
            C0l8.A00("SoLoader", 0Pz.A0W("Not resolving dependencies for ", str));
        }
        try {
            C0il.A04.load(canonicalPath, i);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            throw SoLoaderULErrorFactory.create(str, e);
        }
    }

    @Override // X.C0ib
    public File A06(String str) {
        return A0A(str);
    }

    @Override // X.C0ib
    public String A07() {
        return "DirectorySoSource";
    }

    @Override // X.C0ib
    public String A08(String str) {
        File A0A = A0A(str);
        if (A0A == null) {
            return null;
        }
        return A0A.getCanonicalPath();
    }

    public File A0A(String str) {
        File file = new File(this.A01, str);
        if (!file.exists()) {
            file = null;
        }
        return file;
    }

    @Override // X.C0ib
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.A01.getCanonicalPath());
        } catch (IOException unused) {
            name = this.A01.getName();
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(A07());
        A0k.append("[root = ");
        A0k.append(name);
        A0k.append(" flags = ");
        A0k.append(this.A00);
        return AnonymousClass001.A0g(A0k, ']');
    }
}
