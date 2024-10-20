package X;

import android.os.Bundle;

/* renamed from: X.Jey, reason: case insensitive filesystem */
/* loaded from: Jey.class */
public final class C2969Jey extends Kdu {
    public final String A00;

    public C2969Jey(String str, Bundle bundle) {
        super(bundle);
        this.A00 = str;
        if (!KVH.A00(str)) {
            throw AnonymousClass001.A0L("registrationResponseJson must not be empty, and must be a valid JSON");
        }
    }
}
