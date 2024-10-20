package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.interstitial.api.InterstitialNUXFetchResult;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.Aro, reason: case insensitive filesystem */
/* loaded from: Aro.class */
public final class C1754Aro extends 2vU implements 2vV, C7y4 {
    public static final ImmutableList A0A = ImmutableList.of((Object) new InterstitialTrigger(331, (String) null));
    public Context A00;
    public 1PA A01;
    public boolean A02;
    public 1BY A03;
    public final 1I7 A04;
    public final Bbd A09 = (Bbd) 1Bi.A03(82719);
    public final C00i A06 = AbH.A0S();
    public final C00i A05 = 1BQ.A01();
    public final C02333uu A08 = (C02333uu) 1Bi.A03(131080);
    public final C00i A07 = 1BV.A01((1BY) null, 67500);

    public C1754Aro(1BO r302) {
        Context A03 = AbI.A03((1BY) null);
        this.A00 = A03;
        this.A04 = (1I7) 1Hv.A02(A03, 65728);
        this.A03 = 7zL.A0Q(r302);
    }

    private 1G2 A00(FbUserSession fbUserSession) {
        1G1 r0 = (1G1) fbUserSession;
        if (r0.A07) {
            1BK.A09(this.A05).D0v("location_setting_resurrection_on_login_fetch_user_id_fail", "Cannot fetch logged in user id");
            return null;
        }
        return 1G3.A01(RXn.A02, r0.A02);
    }

    public Class AlT() {
        return InterstitialNUXFetchResult.class;
    }

    public Class Ao7() {
        return C2x8.class;
    }

    public String Arn() {
        return "3931";
    }

    public C4Hx BC9(InterstitialTrigger interstitialTrigger) {
        CLi cLi;
        Integer num;
        C00i c00i = this.A07;
        CLi cLi2 = (CLi) c00i.get();
        Integer num2 = 0S2.A00;
        CLi.A01(cLi2, num2, num2, true);
        if (A00(4YV.A0C(this.A00)) == null || !(!1BK.A0R(this.A06).AZn(r0, false))) {
            cLi = (CLi) c00i.get();
            num = 0S2.A01;
        } else {
            boolean z = true;
            CLi.A01((CLi) c00i.get(), num2, 0S2.A01, true);
            Integer A03 = this.A08.A03();
            num = 0S2.A0N;
            if (A03 == num) {
                z = false;
            }
            cLi = (CLi) c00i.get();
            if (z) {
                CLi.A01(cLi, num2, num, true);
                return C4Hx.A02;
            }
        }
        CLi.A01(cLi, num2, num, false);
        return C4Hx.A03;
    }

    public ImmutableList BHB() {
        return A0A;
    }

    @Override // X.C7y4
    public void CX6(Context context, InterstitialTrigger interstitialTrigger, Object obj) {
        if (AnonymousClass016.A00(context, Activity.class) == null) {
            1BK.A09(this.A05).D11("OnLoginLocationUpsellInterstitialController", "Needed an Activity object but this controller did not run within an activity");
            return;
        }
        1P9 r0 = new 1P9(this.A04);
        D0U.A01(r0, this, RXn.A04, 1);
        D0U.A01(r0, this, RXn.A05, 0);
        1PA A02 = r0.A02();
        this.A01 = A02;
        A02.A00();
        CLi.A01((CLi) this.A07.get(), 0S2.A00, 0S2.A15, true);
        0fH.A0j("OnLoginLocationUpsellInterstitialController", "LS RES NUX launching consent config");
        Bbd bbd = this.A09;
        Boolean valueOf = Boolean.valueOf(this.A02);
        Bundle A05 = 1BK.A05();
        if (!TextUtils.isEmpty("login_newsfeed")) {
            A05.putString(Property.SYMBOL_Z_ORDER_SOURCE, "login_newsfeed");
        }
        if (!TextUtils.isEmpty("location_service_nux")) {
            A05.putString("entry_point", "location_service_nux");
        }
        if (!TextUtils.isEmpty(null)) {
            AbF.A1I(A05, (String) null);
        }
        if (!TextUtils.isEmpty(null)) {
            A05.putString("unit_id", null);
        }
        if (valueOf != null) {
            A05.putBoolean("location_service_always", valueOf.booleanValue());
        }
        if (!TextUtils.isEmpty(null)) {
            A05.putString("format", null);
        }
        ((CPc) bbd.A00.get()).A03(context, A05, C1ic.A05);
        1G2 A00 = A00(4YV.A0D(context));
        if (A00 != null) {
            1Ql.A03(A00, this.A06.get(), true);
        }
    }

    public /* bridge */ /* synthetic */ void CYj(Parcelable parcelable) {
    }

    public /* bridge */ /* synthetic */ void CYk(Object obj) {
        TreeJNI treeJNI = (TreeJNI) obj;
        if (treeJNI != null) {
            this.A02 = treeJNI.getBooleanValue(-2086453735);
        }
    }
}
