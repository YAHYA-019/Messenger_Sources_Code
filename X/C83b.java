package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.inject.FbInjector;
import java.util.Locale;

/* renamed from: X.83b, reason: invalid class name */
/* loaded from: 83b.class */
public abstract class C83b {
    public static final C1tm A00() {
        Context A00 = FbInjector.A00();
        Locale locale = (Locale) 1Bn.A0B(99932);
        Resources resources = A00.getResources();
        String str = C1tm.A08;
        return new C1tm(resources.getString(2131954430), resources.getString(2131954428), resources.getString(2131954431), resources.getString(2131954429), locale);
    }
}
