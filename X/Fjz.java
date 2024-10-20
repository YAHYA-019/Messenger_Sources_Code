package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.fxcal.fxdecal.FxDecalActivity;
import com.facebook.messaging.fxcal.identity.FxImActivity;
import com.facebook.messaging.fxcal.identity.model.AccountProfileModel;
import com.facebook.messaging.fxcal.identity.model.FxImScreenContentModel;
import com.facebook.messaging.fxcal.linking.FxCalLinkingActivity;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: Fjz.class */
public final class Fjz implements C5ww {
    public final int A00;
    public final Object A01;

    public Fjz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v158, types: [androidx.fragment.app.Fragment, X.E1T] */
    @Override // X.C5ww
    public final void onClick(View view) {
        2aH A0y;
        C8v1 c8v1;
        int i;
        Context context;
        Intent A0D;
        1Iw r309;
        String str;
        String A0r;
        String A0r2;
        switch (this.A00) {
            case 0:
                Edl edl = ((Dux) this.A01).A00;
                A0y = 7zN.A0y();
                c8v1 = edl.A00;
                i = 45;
                2aK.A03((Integer) null, (0DE) null, new AJd(c8v1, null, i), A0y, 3);
                return;
            case 1:
                Edl edl2 = ((Dux) this.A01).A00;
                A0y = 7zN.A0y();
                c8v1 = edl2.A00;
                i = 43;
                2aK.A03((Integer) null, (0DE) null, new AJd(c8v1, null, i), A0y, 3);
                return;
            case 2:
                Edl edl3 = ((Dux) this.A01).A00;
                A0y = 7zN.A0y();
                c8v1 = edl3.A00;
                i = 41;
                2aK.A03((Integer) null, (0DE) null, new AJd(c8v1, null, i), A0y, 3);
                return;
            case 3:
                Edl edl4 = ((Dux) this.A01).A00;
                A0y = 7zN.A0y();
                c8v1 = edl4.A00;
                i = 42;
                2aK.A03((Integer) null, (0DE) null, new AJd(c8v1, null, i), A0y, 3);
                return;
            case 4:
                Edl edl5 = ((Dux) this.A01).A00;
                A0y = 7zN.A0y();
                c8v1 = edl5.A00;
                i = 44;
                2aK.A03((Integer) null, (0DE) null, new AJd(c8v1, null, i), A0y, 3);
                return;
            case 5:
                E1Q e1q = (E1Q) this.A01;
                if (e1q.getContext() != null) {
                    Bundle A05 = 1BK.A05();
                    A05.putParcelableArrayList("profile_list", 1JW.A02(1BK.A17(e1q.A02)));
                    2JX r0 = e1q.A01;
                    String str2 = "";
                    if (r0 == null) {
                        A0r = str2;
                        A0r2 = str2;
                    } else {
                        A0r = r0.A0r(-1314539185);
                        A0r2 = r0.A0r(648108463);
                        str2 = r0.A0r(-1496673235);
                    }
                    A05.putParcelable("screen_content", new FxImScreenContentModel(str2, null, null, null, null, null, null, A0r, A0r2, null, null, false, true, E1Q.A07(e1q)));
                    Context context2 = e1q.getContext();
                    FbFragmentActivity fbFragmentActivity = new FbFragmentActivity();
                    context2.getClass();
                    Intent putExtra = C3o5.A0D(context2, fbFragmentActivity.getClass()).putExtra("surface", "photo_selector");
                    A05.putString("surface", "photo_selector");
                    putExtra.putExtras(A05);
                    0LS.A05(putExtra, e1q, 1);
                    return;
                }
                return;
            case 6:
                E1S e1s = ((Edm) this.A01).A00;
                boolean A08 = E1S.A08(e1s.A02);
                FHk A0T = DKF.A0T(e1s.A0C);
                if (A08) {
                    FHk.A03(A0T, "avt_edit_pressed", "im_settings", (String) null, (java.util.Map) null);
                } else {
                    FHk.A03(A0T, "avt_create_pressed", "im_settings", (String) null, (java.util.Map) null);
                }
                Context context3 = e1s.getContext();
                FHv fHv = (FHv) e1s.A08.get();
                EqJ eqJ = new EqJ();
                eqJ.A04 = "edit_button";
                eqJ.A07 = "avatar_editor";
                fHv.A05(context3, new ExJ(eqJ));
                return;
            case 7:
                Eok eok = (Eok) this.A01;
                2JX r02 = eok.A00;
                if (r02 != null) {
                    String A0r3 = r02.A0r(1840918971);
                    if (1JF.A0B(A0r3)) {
                        return;
                    }
                    try {
                        Uri A03 = C0A2.A03(A0r3);
                        if (A03 != null) {
                            E1N e1n = eok.A02;
                            FHk.A03(DKF.A0T(e1n.A06), "name_change_webview_shown", "im_settings", eok.A03, (java.util.Map) null);
                            ((FIu) ((EiN) e1n.A04.get()).A01.get()).A08(eok.A01.A0D, A03);
                            return;
                        }
                        return;
                    } catch (SecurityException unused) {
                        return;
                    }
                }
                return;
            case 8:
                Context context4 = ((Eok) this.A01).A01.A0D;
                FbFragmentActivity fbFragmentActivity2 = new FbFragmentActivity();
                context4.getClass();
                0LS.A0A(context4, C3o5.A0D(context4, fbFragmentActivity2.getClass()).putExtra("surface", "photo_setting"));
                return;
            case 9:
                Eok eok2 = (Eok) this.A01;
                Bundle A052 = 1BK.A05();
                A052.putInt("avatar_present", eok2.A02.A02 ? 1 : 0);
                Context context5 = eok2.A01.A0D;
                FbFragmentActivity fbFragmentActivity3 = new FbFragmentActivity();
                context5.getClass();
                Intent putExtra2 = C3o5.A0D(context5, fbFragmentActivity3.getClass()).putExtra("surface", "avatar_setting");
                putExtra2.putExtras(A052);
                0LS.A04(context5, putExtra2, A052);
                return;
            case 10:
                E1K e1k = ((Edp) this.A01).A00;
                AccountProfileModel accountProfileModel = e1k.A01;
                FxDecalActivity.A12(e1k, accountProfileModel.A09, accountProfileModel.A0B, 3);
                return;
            case 11:
            case 12:
                context = ((1Iw) this.A01).A0D;
                A0D = C3o5.A0D(context, FxImActivity.class);
                DKE.A1C(context, A0D);
                return;
            case 13:
                r309 = (1Iw) this.A01;
                context = r309.A0D;
                A0D = C3o5.A0D(context, FxCalLinkingActivity.class);
                A0D.putExtra("FXCAL_FLOW", "MESSENGER_SETTINGS");
                DKE.A1C(context, A0D);
                return;
            case 14:
                ?? r03 = ((Edv) this.A01).A00;
                String str3 = r03.A03;
                Bundle A053 = 1BK.A05();
                if (str3 != null) {
                    A053.putString("account_type", str3);
                }
                E1R e1r = new E1R();
                e1r.setArguments(A053);
                F8U f8u = new F8U(r03.requireActivity());
                f8u.A06 = AnonymousClass001.A0X(e1r);
                f8u.A05 = e1r;
                f8u.A08 = true;
                f8u.A00 = 2130772065;
                f8u.A01 = 2130772071;
                f8u.A03 = 2130772064;
                f8u.A04 = 2130772072;
                F8U.A00(f8u, 0S2.A01);
                return;
            case 15:
                r309 = ((RFY) this.A01).A00;
                context = r309.A0D;
                A0D = C3o5.A0D(context, FxCalLinkingActivity.class);
                A0D.putExtra("FXCAL_FLOW", "MESSENGER_SETTINGS");
                DKE.A1C(context, A0D);
                return;
            case 16:
                11T.A0F(view, 0);
                1vD.A00(view).Czz(new E21(), 0S2.A01, E21.__redex_internal_original_name);
                return;
            case 17:
                C1972Ay1 c1972Ay1 = (C1972Ay1) this.A01;
                Edx edx = c1972Ay1.A00;
                boolean z = !c1972Ay1.A05;
                E21 e21 = edx.A00;
                if (e21.A00 == null) {
                    str = "shareContactPrivacyControlLogger";
                } else {
                    Eq1 eq1 = e21.A01;
                    if (eq1 != null) {
                        if (!eq1.A01) {
                            C21S.A00(eq1.A04, (1Uj) 1Br.A0B(eq1.A02));
                            eq1.A01 = true;
                        }
                        22Y r04 = (22Y) 1Br.A0B(eq1.A03);
                        MailboxFeature mailboxFeature = (MailboxFeature) 1Br.A0B(r04.A00);
                        PrivacyContext A00 = ((AnonymousClass224) 1Br.A0B(r04.A01)).A00("461672704902838");
                        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
                        MailboxFutureImpl mailboxFutureImpl2 = new MailboxFutureImpl(AQV);
                        1Um.A01(AQV, new IbP(1, mailboxFeature, mailboxFutureImpl, A00, mailboxFutureImpl2, z), mailboxFutureImpl, mailboxFutureImpl2);
                        return;
                    }
                    str = "contactCardPreferenceManager";
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            default:
                return;
        }
    }
}
