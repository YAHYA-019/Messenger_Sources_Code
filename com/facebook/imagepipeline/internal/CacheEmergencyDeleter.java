package com.facebook.imagepipeline.internal;

import X.1Bi;
import X.1CO;
import X.1G0;
import X.1G2;
import X.2Ff;
import X.C01s;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: CacheEmergencyDeleter.class */
public final class CacheEmergencyDeleter {
    public static final 1G2 A04;
    public static final 1G2 A05;
    public final 1CO A02 = (1CO) 1Bi.A05(1CO.class, (Class) null);
    public final FbSharedPreferences A03 = (FbSharedPreferences) 1Bi.A05(FbSharedPreferences.class, (Class) null);
    public final 2Ff A01 = (2Ff) 1Bi.A05(2Ff.class, (Class) null);
    public final C01s A00 = (C01s) 1Bi.A05(C01s.class, (Class) null);

    static {
        1G2 A0D = 1G0.A04.A0D("cache_deleter/");
        A05 = A0D;
        A04 = A0D.A0D("last_cache_clean_key");
    }
}
