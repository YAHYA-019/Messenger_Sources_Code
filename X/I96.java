package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: I96.class */
public final class I96 {
    public static final java.util.Map A05 = 1BK.A1D("ig4a_media_accuracy_dyn_sampling", "gk:ig4a_media_accuracy_dyn_sampling");
    public final Hrp A00;
    public final File A01;
    public final String A02;
    public final String A03;
    public final Set A04 = 7zL.A15();

    public I96(Hrp hrp, File file, String str) {
        this.A03 = str;
        this.A00 = hrp;
        this.A01 = AnonymousClass001.A0D(file, "media_accuracy");
        this.A02 = 0Pz.A0J(str, '_');
    }

    public static final File A00(I96 i96, String str) {
        File file = i96.A01;
        if (!file.exists()) {
            file.mkdir();
        }
        File A0D = AnonymousClass001.A0D(file, str);
        0fH.A0j("MediaAccuracyCapture", 0Pz.A0W("Getting file: ", A0D.getCanonicalPath()));
        return A0D;
    }

    public final List A01(String str) {
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2 = null;
        try {
            File file = this.A01;
            String[] list = file.list(new Inw(this, 2));
            if (list != null) {
                arrayList = AnonymousClass001.A0s();
                for (String str2 : list) {
                    List A0M = 0CU.A0M(0CU.A0B("_ready.png", 0CU.A0A(this.A02, str2)), new String[]{"_"}, 2);
                    if (A0M.size() != 2) {
                        1BK.A1Q("Invalid snapshot file name: ", str2, "MediaAccuracyCapture");
                        z = false;
                    } else {
                        Long A0f = 0CW.A0f(1BK.A14(A0M, 0));
                        if (A0f != null) {
                            long longValue = A0f.longValue();
                            String str3 = (String) A0M.get(1);
                            String str4 = this.A03;
                            String canonicalPath = AnonymousClass001.A0D(file, str2).getCanonicalPath();
                            Integer num = 11T.A0O(str3, str4) ? 0S2.A0C : 0S2.A01;
                            11T.A0D(canonicalPath);
                            new GjE(true, num, str4, str3, canonicalPath, "image/x-png", str, longValue);
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        arrayList.add(z);
                    }
                }
            } else {
                arrayList = null;
            }
        } catch (Throwable th) {
            arrayList = new 0DV(th);
        }
        Throwable A00 = 0DU.A00(arrayList);
        if (A00 == null) {
            arrayList2 = arrayList;
        } else {
            this.A00.A01(0S2.A00, null, null, null, null, null, A00, null, null);
        }
        List list2 = arrayList2;
        if (list2 == null) {
            list2 = C0ty.A00;
        }
        return list2;
    }

    public final void A02() {
        try {
            File file = this.A01;
            String[] list = file.list();
            11T.A0A(list);
            for (String str : list) {
                String canonicalPath = AnonymousClass001.A0D(file, str).getCanonicalPath();
                11T.A0A(canonicalPath);
                A03(canonicalPath);
            }
        } catch (Throwable th) {
            new 0DV(th);
        }
    }

    public final void A03(String str) {
        0DV r305;
        11T.A0F(str, 0);
        try {
            boolean delete = AnonymousClass001.A0E(str).delete();
            if (delete) {
                1BK.A1Q("Deleted file ", str, "MediaAccuracyCapture");
            } else {
                1BK.A1Q("Failed to delete file ", str, "MediaAccuracyCapture");
            }
            r305 = Boolean.valueOf(delete);
        } catch (Throwable th) {
            r305 = new 0DV(th);
        }
        Throwable A00 = 0DU.A00(r305);
        if (A00 != null) {
            0fH.A0p("MediaAccuracyCapture", 0Pz.A0W("Failed to delete file ", str), A00);
            this.A00.A01(0S2.A00, null, null, null, null, null, A00, 1BK.A1D("file_name", str), null);
        }
    }
}
