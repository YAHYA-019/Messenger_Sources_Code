package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.4gR, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4gR.class */
public final class C06234gR implements 1iL {
    public final Object A00;
    public final Object A01;

    public C06234gR(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        this.A00 = fbSharedPreferences;
        this.A01 = r303;
    }

    public Object get() {
        return Boolean.valueOf(((FbSharedPreferences) this.A00).AZn((1G2) this.A01, false));
    }
}
