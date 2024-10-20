package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.4Fy, reason: invalid class name */
/* loaded from: 4Fy.class */
public final class C4Fy extends 44R {
    public final 1Br A00;
    public final Context A01;
    public final 1De A02;

    public C4Fy(1De r302) {
        this.A02 = r302;
        Context context = (Context) 1Bn.A0G(r302.A00, 83719);
        this.A01 = context;
        this.A00 = 1HG.A00(context, 65926);
    }

    public boolean A04(QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        Context context;
        PackageManager packageManager;
        C4Hr c4Hr = (C4Hr) this.A00.A00.get();
        FbSharedPreferences fbSharedPreferences = ((C4Hs) c4Hr).A01;
        1G2 r0 = C4Hs.A02;
        if (fbSharedPreferences.AZn(r0, false) && ((2yD) c4Hr.A00.A00.get()).AZr(1GD.A05, 36322388098565607L)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 33) {
            if (!((2yD) c4Hr.A00.A00.get()).AZr(1GD.A05, 2342165397312194022L)) {
                return false;
            }
            fbSharedPreferences.edit().putBoolean(r0, true).commit();
            return false;
        }
        if (fbSharedPreferences.AZn(C4Hs.A03, false) || (packageManager = (context = ((C4Hs) c4Hr).A00).getPackageManager()) == null) {
            return false;
        }
        C2tt A00 = new C2te(context, packageManager).A00();
        if (!0S2.A0Y.equals(A00.A02) || !A00.A06 || !A00.A05) {
            return false;
        }
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(AnonymousClass000.A00(247), 1BJ.A00(1174)));
        if (componentEnabledSetting == 1 || componentEnabledSetting == 0) {
            return "com.facebook.katana".equals(context.getPackageName()) || new C2te(context, packageManager).A01(20);
        }
        return false;
    }
}
