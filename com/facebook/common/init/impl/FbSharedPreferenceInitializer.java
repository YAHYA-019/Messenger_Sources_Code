package com.facebook.common.init.impl;

import X.0fH;
import X.1Bq;
import X.1Br;
import X.AnonymousClass001;

/* loaded from: FbSharedPreferenceInitializer.class */
public final class FbSharedPreferenceInitializer {
    public final 1Br A01 = 1Bq.A00(33013);
    public final 1Br A02 = 1Bq.A00(33016);
    public final 1Br A00 = 1Bq.A00(66729);

    public static final boolean A00(Object obj, String str, long j) {
        Object A0Y;
        String str2;
        boolean z = true;
        if (obj != null && !(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                A0Y = AnonymousClass001.A0Y(obj);
                str2 = "Unsupported type %s for %s";
            } else if (j > 0) {
                int length = ((String) obj).length();
                if (length > j) {
                    A0Y = Integer.valueOf(length);
                    str2 = "Oversize value (length=%d) for %s";
                }
            }
            0fH.A0d(A0Y, str, "FbSharedPreferencesStartupCache", str2);
            z = false;
        }
        return z;
    }
}
