package X;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* loaded from: Fbb.class */
public final class Fbb implements 4tO {
    public final 0rI A00;
    public final File A01;

    public Fbb(File file) {
        11T.A0F(file, 1);
        this.A01 = file;
        0rI r0 = 0rI.A00;
        11T.A0A(r0);
        this.A00 = r0;
    }

    public static final File A00(String str) {
        Locale locale = Locale.US;
        11T.A0B(locale);
        return 11T.A0P("file://", 1, 4YU.A18(locale, str)) ? DKE.A0n(str) : AnonymousClass001.A0E(str);
    }

    public void AFF() {
    }

    public boolean AHl(Object obj, String str) {
        11T.A0F(str, 0);
        return A00(str).exists();
    }

    public /* bridge */ /* synthetic */ Collection Ak3() {
        0yQ r0 = new 0yQ(this.A01, 0S2.A00);
        ArrayList A0s = AnonymousClass001.A0s();
        19V r02 = new 19V(r0);
        while (r02.hasNext()) {
            A0s.add(new Rlh(this, (File) r02.next()));
        }
        return A0s;
    }

    public 4cS B7j(Object obj, String str) {
        3VS r0;
        String str2;
        boolean A1X = 1BL.A1X(str, obj);
        File A00 = A00(str);
        0fH.A0j("[MP] EncryptedDiskStorage", 0Pz.A16("getResource: ", str, ", resourceFile file exists: ", A00.exists()));
        4cS r310 = null;
        if (A00.exists()) {
            return ((obj instanceof 3VS) && (r0 = (3VS) obj) != null && r0.A00) ? new Fau(DKC.A1a(11T.A02(Uri.fromFile(A00)), C03r.A05)) : new 4cU(A00);
        }
        List A19 = 4YU.A19(str, "/", 0);
        if (1BK.A1Y(A19) && 0CV.A0b((String) 0QD.A0F(A19), "prev.", false)) {
            List A192 = 4YU.A19(str, "/", 0);
            if (1BK.A1Y(A192) && 0CV.A0b((String) 0QD.A0F(A192), "prev.", false)) {
                ArrayList A17 = 1BK.A17(4YU.A19(str, "/", 0));
                String str3 = (String) 0QD.A0F(A17);
                int size = A17.size() - (A1X ? 1 : 0);
                11T.A0D(str3);
                A17.set(size, 0CV.A0X(str3, "prev.", "att."));
                str2 = 4YV.A0t("/", A17, (Function1) null);
            } else {
                str2 = "";
            }
            0fH.A0j("[MP] EncryptedDiskStorage", 0Pz.A0W("getResource: preview file doesn't exist, trying to get full: ", str2));
            r310 = B7j(obj, str2);
        }
        return r310;
    }

    public C7yb BPc(Object obj, String str) {
        return new Fba(this, str);
    }

    public void CZr() {
    }

    public long Cdg(C7yj c7yj) {
        11T.A0F(c7yj, 0);
        4cU B7h = c7yj.B7h();
        11T.A0I(B7h, "null cannot be cast to non-null type com.facebook.binaryresource.FileBinaryResource");
        File file = B7h.A00;
        return file.delete() ? file.length() : -1;
    }

    public long Cdh(String str) {
        11T.A0F(str, 0);
        File A00 = A00(str);
        return A00.delete() ? A00.length() : -1;
    }

    public boolean isExternal() {
        return false;
    }
}
