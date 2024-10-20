package X;

import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableMap;

/* loaded from: F4d.class */
public final class F4d {
    public static final ImmutableMap A01;
    public final C00i A00 = FbInjector.A00;

    static {
        ImmutableMap.Builder A0c = 1BK.A0c();
        A0c.put("USD", 2131427338);
        A0c.put("PHP", 2131427352);
        A0c.put("EUR", 2131427350);
        A0c.put("THB", 2131427365);
        A0c.put("GBP", 2131427358);
        A01 = AbG.A10(A0c, "PEN", 2131427340);
    }
}
