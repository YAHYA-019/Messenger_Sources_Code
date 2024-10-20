package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.interstitial.api.InterstitialNUXFetchResult;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.Arn, reason: case insensitive filesystem */
/* loaded from: Arn.class */
public final class C1753Arn extends 2vU implements 2vV, C7y4 {
    public ImmutableList A00;
    public 1BY A01;
    public static final ImmutableList A0A = ImmutableList.of((Object) new InterstitialTrigger(331, (String) null));
    public static final 1G2 A09 = 1G3.A01(1G0.A04, "on_login_bg_dialog_seen");
    public final Bbd A08 = (Bbd) 1Bi.A03(82719);
    public final C00i A04 = AbH.A0S();
    public final C00i A02 = 1BQ.A01();
    public final C00i A07 = AbH.A0T();
    public final C00i A03 = 1BQ.A02(131080);
    public final C00i A05 = 7zN.A0D(67500);
    public final C00i A06 = 1BQ.A00();

    public C1753Arn(1BO r302) {
        this.A01 = 7zL.A0Q(r302);
    }

    public Class AlT() {
        return InterstitialNUXFetchResult.class;
    }

    public Class Ao7() {
        return C2x8.class;
    }

    public String Arn() {
        return "6849";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C4Hx BC9(com.facebook.interstitial.triggers.InterstitialTrigger r302) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1753Arn.BC9(com.facebook.interstitial.triggers.InterstitialTrigger):X.4Hx");
    }

    public ImmutableList BHB() {
        return A0A;
    }

    @Override // X.C7y4
    public void CX6(Context context, InterstitialTrigger interstitialTrigger, Object obj) {
        Bundle A05;
        CPc cPc;
        String str;
        if (AnonymousClass016.A00(context, Activity.class) == null) {
            1BK.A09(this.A02).D11("OnLoginBGLocationUpsellInterstitialController", "Needed an Activity object but this controller did not run within an activity");
            return;
        }
        boolean z = true;
        CLi.A01((CLi) this.A05.get(), 0S2.A01, 0S2.A15, true);
        1G1 A0D = 4YV.A0D(context);
        String A0z = AbJ.A0z(this.A07);
        ImmutableList immutableList = this.A00;
        if (immutableList != null) {
            z = !immutableList.contains(A0z);
        }
        if (z) {
            Bbd bbd = this.A08;
            A05 = 1BK.A05();
            if (!TextUtils.isEmpty("login_newsfeed")) {
                A05.putString(Property.SYMBOL_Z_ORDER_SOURCE, "login_newsfeed");
            }
            if (!TextUtils.isEmpty("bg_resurrection")) {
                A05.putString("entry_point", "bg_resurrection");
            }
            if (!TextUtils.isEmpty(null)) {
                AbF.A1I(A05, (String) null);
            }
            if (!TextUtils.isEmpty(null)) {
                A05.putString("unit_id", null);
            }
            A05.putBoolean("location_storage", true);
            A05.putBoolean("background_collection", true);
            if (!TextUtils.isEmpty(null)) {
                A05.putString("format", null);
            }
            cPc = (CPc) bbd.A00.get();
            str = C1ic.A00;
        } else {
            if (!1BK.A0N(this.A06).AZk(36310714380256239L)) {
                return;
            }
            Bbd bbd2 = this.A08;
            A05 = 1BK.A05();
            if (!TextUtils.isEmpty("login_newsfeed")) {
                A05.putString(Property.SYMBOL_Z_ORDER_SOURCE, "login_newsfeed");
            }
            if (!TextUtils.isEmpty("bg_resurrection_ls_fallback")) {
                A05.putString("entry_point", "bg_resurrection_ls_fallback");
            }
            if (!TextUtils.isEmpty(null)) {
                AbF.A1I(A05, (String) null);
            }
            if (!TextUtils.isEmpty(null)) {
                A05.putString("unit_id", null);
            }
            A05.putBoolean("location_service_always", true);
            if (!TextUtils.isEmpty(null)) {
                A05.putString("format", null);
            }
            cPc = (CPc) bbd2.A00.get();
            str = C1ic.A05;
        }
        cPc.A03(context, A05, str);
        1G2 r0 = A09;
        1G1 r02 = A0D;
        if (r02.A07) {
            1BK.A09(this.A02).D0v("android_background_location_resurrection_on_login_fetch_user_id_fail", "Cannot fetch logged in user id");
            return;
        }
        1G2 A01 = 1G3.A01(r0, r02.A02);
        if (A01 != null) {
            1Ql.A03(A01, this.A04.get(), true);
        }
    }

    public /* bridge */ /* synthetic */ void CYj(Parcelable parcelable) {
    }

    public /* bridge */ /* synthetic */ void CYk(Object obj) {
        2JY r0 = (2JY) obj;
        if (r0 != null) {
            this.A00 = r0.A0Z(85784434);
        }
    }
}
