package X;

import android.net.Uri;

/* renamed from: X.2tu, reason: invalid class name */
/* loaded from: 2tu.class */
public abstract class C2tu {
    public static final Uri A00;
    public static final String A01;

    static {
        String A0W = 0Pz.A0W("com.facebook.appmanager", ".modules");
        A01 = A0W;
        A00 = new Uri.Builder().scheme("content").authority(A0W).build();
    }
}
