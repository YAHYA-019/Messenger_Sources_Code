package com.facebook.messaging.aibot.aiplugins.search.dialog;

import X.0D2;
import X.0FI;
import X.0Pz;
import X.0Q8;
import X.0S2;
import X.0SE;
import X.11T;
import X.1AK;
import X.1BV;
import X.1Fj;
import X.1Iw;
import X.1LI;
import X.1cU;
import X.2K3;
import X.2KD;
import X.2RH;
import X.2XL;
import X.2XO;
import X.2cK;
import X.2cM;
import X.2kW;
import X.2kZ;
import X.4YU;
import X.55Y;
import X.7zM;
import X.7zN;
import X.7zR;
import X.7zU;
import X.8OH;
import X.9yY;
import X.AnonymousClass001;
import X.AnonymousClass557;
import X.C02A;
import X.C0A2;
import X.C1rg;
import X.C1rq;
import X.C2ke;
import X.C2kk;
import X.C5id;
import X.C76;
import X.C8m6;
import X.C9yp;
import X.DGJ;
import X.GBp;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.messaging.aibot.aiplugins.search.dialog.AISearchSourceBottomSheetDialogFragment;
import com.facebook.messaging.aibot.aiplugins.search.models.AISearchSource;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: AISearchSourceBottomSheetDialogFragment.class */
public final class AISearchSourceBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public String A00;
    public List A01;
    public String A02;

    public AISearchSourceBottomSheetDialogFragment() {
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
    }

    public static final void A05(1Iw r301, String str) {
        1BV A00 = 1BV.A00(68729);
        1AK r0 = new 1AK(new 0SE("android.intent.action.VIEW"), 0S2.A0N);
        try {
            Uri A03 = C0A2.A03(str);
            if (A03 == null || !11T.A0O(A03.getScheme(), "https")) {
                return;
            }
            Context context = r301.A0D;
            if (r0.BXk(context, A03)) {
                return;
            }
            C76 c76 = (C76) A00.get();
            11T.A0A(context);
            c76.A01(context, A03, C5id.A0h);
        } catch (SecurityException unused) {
        }
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        return new DGJ() { // from class: X.9z5
            public 1LI AJE(1Iw r3022, MigColorScheme migColorScheme) {
                1BK.A1M(r3022, migColorScheme);
                C1rq A01 = C1rg.A01(r3022, null, 0);
                C1ro c1ro = C1ro.CENTER;
                A01.A1y(c1ro);
                C1rq A0Q = 7zN.A0Q(r3022, 0);
                2KD A012 = 2K3.A01(r3022, 0);
                2Ov r0 = AISearchSourceBottomSheetDialogFragment.this;
                7zQ.A1V(A012, r0.getString(2131952593));
                A012.A2X();
                A012.A0R();
                A012.A2x(migColorScheme);
                7zN.A1T(A0Q, A012);
                A0Q.A2c();
                A0Q.A2h(c1ro);
                A0Q.A0l(44.0f);
                4YU.A1L(A0Q, 2RH.A03);
                7zL.A1M(A0Q, A01);
                C1rq A013 = C1rg.A01(r3022, null, 0);
                A013.A1z(AnonymousClass255.RTL);
                A013.A1F(6.0f);
                A013.A27(C26z.END, 8.0f);
                A013.A0c();
                A013.A0e();
                8Tl A06 = 8Tl.A06(r3022, migColorScheme);
                7zR.A1A(A06, AV1.A00(r0, 6));
                A013.A2e(A06);
                7zL.A1M(A013, A01);
                return A01.A00;
            }
        };
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String str;
        11T.A0F(r302, 0);
        1BV A0G = 7zU.A0G(r302, 16979);
        2kW r0 = new 2kW();
        r0.A07 = new 2kZ(new 2XL((C02A) null, (C2kk) null, (2XO) null, (Boolean) null, (Integer) null, 2.0f, 0, 0, false, false, false, false, false, true), (1cU) null, (Integer) null, false, false);
        C2ke A00 = r0.A00();
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A0j(1.0f);
        8OH A002 = C8m6.A00(r302);
        7zM.A1O(A002, 7zN.A0W(A0G));
        A002.A0j(1.0f);
        A002.A0k(1.0f);
        A002.A0e();
        MigColorScheme A0W = 7zN.A0W(A0G);
        ImmutableList.Builder A0h = 4YU.A0h();
        LightColorScheme.A00();
        2RH r02 = 2RH.A03;
        55Y r03 = new 55Y(A0W, 0, 0, r02.A00(), r02.A00());
        A0h.m11011add((Object) r03);
        boolean AZk = 7zR.A0U().A00.AZk(72341379707179622L);
        List<AISearchSource> list = this.A01;
        if (list == null) {
            str = "aiSearchSources";
        } else {
            for (AISearchSource aISearchSource : list) {
                AnonymousClass557 A0V = 7zU.A0V(A0W);
                A0V.A08(aISearchSource.A03);
                A0V.A01();
                A0V.A01 = new 9yY(0, r302, aISearchSource, this);
                String str2 = aISearchSource.A02;
                String str3 = aISearchSource.A00;
                if (str2 == null || str3 == null || !AZk) {
                    A0V.A07(str2);
                } else {
                    A0V.A04 = new C9yp(str2, 11T.A03(str3));
                }
                A0h.m11011add((Object) A0V.A00());
                if (!AZk) {
                    A0h.m11011add((Object) r03);
                }
            }
            A002.A2W(1Fj.A01(A0h));
            A002.A01.A01 = A00;
            A002.A0J();
            A01.A2e(A002.A01);
            String str4 = this.A02;
            str = "querySource";
            C1rq c1rq = null;
            if (str4 != null) {
                if (str4.length() > 0) {
                    c1rq = C1rg.A01(r302, null, 0);
                    2KD A012 = 2K3.A01(r302, 0);
                    String str5 = this.A02;
                    if (str5 != null) {
                        A012.A2z(0Pz.A0L(str5, '\"', '\"'));
                        A012.A2i();
                        A012.A2x(7zN.A0W(A0G));
                        A012.A0W();
                        A012.A2d();
                        c1rq.A2e(A012);
                    }
                }
                A01.A2d(c1rq);
                7zR.A1A(A01, new GBp(r302, this, 24));
                return A01.A00;
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(-40215085);
        super.onCreate(bundle);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("AI_SOURCES_LIST");
        if (parcelableArrayList != null) {
            this.A01 = parcelableArrayList;
            String string = requireArguments().getString("AI_SOURCES_QUERY");
            if (string != null) {
                this.A02 = string;
                String string2 = requireArguments().getString("AI_SOURCES_QUERY_URL");
                if (string2 != null) {
                    this.A00 = string2;
                    0FI.A08(-768865177, A02);
                    return;
                } else {
                    A0N = AnonymousClass001.A0N("Required value was null.");
                    i = 221188692;
                }
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = -1771305894;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -1405932963;
        }
        0FI.A08(i, A02);
        throw A0N;
    }
}
