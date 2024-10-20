package X;

import android.net.Uri;

/* renamed from: X.5nu, reason: invalid class name */
/* loaded from: 5nu.class */
public abstract class C5nu {
    public static final 1G9 A00 = 1NK.A5T.A0F("thread_limits/");

    public static final 1G2 A00(String str, long j) {
        1G2 A0D = A00.A0F(str).A0F("/armadillo").A0D(0Pz.A0K(Uri.encode(String.valueOf(j)), '/'));
        11T.A0A(A0D);
        return A0D;
    }

    public static final 1G2 A01(String str, long j) {
        1G2 A0D = A00.A0F(str).A0F("/open_threads").A0D(0Pz.A0K(Uri.encode(String.valueOf(j)), '/'));
        11T.A0A(A0D);
        return A0D;
    }
}
