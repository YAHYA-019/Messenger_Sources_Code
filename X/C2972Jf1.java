package X;

import android.os.Bundle;

/* renamed from: X.Jf1, reason: case insensitive filesystem */
/* loaded from: Jf1.class */
public final class C2972Jf1 extends Kdv {
    public final String A00;
    public final String A01;

    public C2972Jf1(Bundle bundle, String str, String str2) {
        super(bundle);
        this.A00 = str;
        this.A01 = str2;
        if (str2.length() <= 0) {
            throw AnonymousClass001.A0L("password should not be empty");
        }
    }
}
