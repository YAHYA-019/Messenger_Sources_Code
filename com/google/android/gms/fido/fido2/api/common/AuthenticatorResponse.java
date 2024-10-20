package com.google.android.gms.fido.fido2.api.common;

import X.Kje;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: AuthenticatorResponse.class */
public abstract class AuthenticatorResponse extends AbstractSafeParcelable {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Kje] */
    public static Kje A00(Kje kje, Object obj, String str) {
        ?? obj2 = new Object();
        kje.A00 = obj2;
        obj2.A01 = obj;
        obj2.A02 = str;
        return obj2;
    }
}
