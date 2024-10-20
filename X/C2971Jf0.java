package X;

import android.os.Bundle;

/* renamed from: X.Jf0, reason: case insensitive filesystem */
/* loaded from: Jf0.class */
public final class C2971Jf0 extends Kdv {
    public final String A00;

    public C2971Jf0(String str, Bundle bundle) {
        super(bundle);
        this.A00 = str;
        if (!KVH.A00(str)) {
            throw AnonymousClass001.A0L("authenticationResponseJson must not be empty, and must be a valid JSON");
        }
    }
}
