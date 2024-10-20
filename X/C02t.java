package X;

import android.content.Context;
import java.io.IOException;

/* renamed from: X.02t, reason: invalid class name */
/* loaded from: 02t.class */
public final class C02t {
    public static Boolean A00;

    public static boolean A00(Context context) {
        boolean booleanValue;
        synchronized (C02t.class) {
            if (A00 == null) {
                try {
                    A00 = false;
                    context.getAssets().open("app_modules.json").close();
                    A00 = true;
                } catch (IOException e) {
                    0fH.A0p("AppModuleBuildInfo", "Downloadable metadata not found", e);
                }
            }
            booleanValue = A00.booleanValue();
        }
        return booleanValue;
    }
}
