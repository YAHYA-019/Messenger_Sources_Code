package com.facebook.secure.intentswitchoff;

import X.08S;
import X.08T;
import X.08U;
import X.1Bi;
import X.1GD;
import X.1Nq;
import X.2yD;
import X.AnonymousClass030;
import X.C00i;
import X.C09h;
import X.C09l;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.inject.FbInjector;
import java.util.Map;

/* loaded from: IntentSwitchOffMobileConfigDI.class */
public final class IntentSwitchOffMobileConfigDI implements AnonymousClass030, 1Nq {
    public Map A00;
    public 08U[] A01;
    public 08T[] A02;
    public final Context A03 = FbInjector.A00();
    public final C00i A04 = 1Bi.A00(16385);

    public static final IntentSwitchOffMobileConfigDI A00() {
        return new IntentSwitchOffMobileConfigDI();
    }

    public static void A01(IntentSwitchOffMobileConfigDI intentSwitchOffMobileConfigDI, String str, String str2, String str3) {
        Context context;
        synchronized (intentSwitchOffMobileConfigDI) {
            context = intentSwitchOffMobileConfigDI.A03;
            intentSwitchOffMobileConfigDI.A01 = 08U.A00(context, str);
        }
        synchronized (intentSwitchOffMobileConfigDI) {
            intentSwitchOffMobileConfigDI.A02 = 08T.A00(str2);
        }
        synchronized (intentSwitchOffMobileConfigDI) {
            intentSwitchOffMobileConfigDI.A00 = 08S.A00(str3);
        }
        08U[] ArZ = intentSwitchOffMobileConfigDI.ArZ();
        08T[] AgG = intentSwitchOffMobileConfigDI.AgG();
        Map Ago = intentSwitchOffMobileConfigDI.Ago();
        synchronized (C09h.class) {
            C09h.A00 = new C09l(Ago, ArZ, AgG);
            SharedPreferences A00 = C09h.A00(context);
            if (A00 == null) {
                Log.w("DefaultSwitchOffs", "Could not write config to file");
            } else {
                A00.edit().putString("last_criteria", str).putString("last_custom_config", str2).putString("last_deeplink_config", str3).apply();
            }
        }
    }

    public String A02() {
        return ((2yD) this.A04.get()).BCy(36873518301970489L);
    }

    public String A03() {
        return ((2yD) this.A04.get()).BCy(36873518302167098L);
    }

    public String A04() {
        return ((2yD) this.A04.get()).BCy(36873840424779985L);
    }

    public int Adi() {
        return 1312;
    }

    @Override // X.AnonymousClass030
    public 08T[] AgG() {
        08T[] r302;
        synchronized (this) {
            r302 = this.A02;
            if (r302 == null) {
                r302 = 08T.A00(A03());
                this.A02 = r302;
            }
        }
        return r302;
    }

    @Override // X.AnonymousClass030
    public Map Ago() {
        Map map;
        synchronized (this) {
            map = this.A00;
            if (map == null) {
                map = 08S.A00(A04());
                this.A00 = map;
            }
        }
        return map;
    }

    @Override // X.AnonymousClass030
    public 08U[] ArZ() {
        08U[] r302;
        synchronized (this) {
            r302 = this.A01;
            if (r302 == null) {
                r302 = 08U.A00(this.A03, A02());
                this.A01 = r302;
            }
        }
        return r302;
    }

    public void BqJ(int i) {
        C00i c00i = this.A04;
        2yD r0 = (2yD) c00i.get();
        1GD r02 = 1GD.A05;
        A01(this, r0.BDB(r02, 36873518301970489L), ((2yD) c00i.get()).BDB(r02, 36873518302167098L), ((2yD) c00i.get()).BDB(r02, 36873840424779985L));
    }

    @Override // X.AnonymousClass030
    public boolean CxK() {
        return ((2yD) this.A04.get()).AZk(2342153899684988360L);
    }

    @Override // X.AnonymousClass030
    public boolean CxM() {
        return ((2yD) this.A04.get()).AZk(36315142488596975L);
    }
}
