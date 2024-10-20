package X;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Random;

/* renamed from: X.5Hi, reason: invalid class name */
/* loaded from: 5Hi.class */
public final class C5Hi {
    public final C00653oY A01 = (C00653oY) 1Bi.A03(32769);
    public final C00i A00 = new 1BQ(16511);
    public final Random A02 = new SecureRandom();

    public static HashMap A00(String str) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("media_type", str);
        A0u.put(7zK.A00(90), String.valueOf(0.05d));
        A0u.put("num_types", String.valueOf(0S2.A00(3).length));
        return A0u;
    }
}
