package com.facebook.messaging.neue.nux.messenger;

import X.0FI;
import X.0S2;
import X.0fH;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1G0;
import X.1G2;
import X.1G3;
import X.1G9;
import X.1LF;
import X.1Lo;
import X.1Ql;
import X.53S;
import X.7zM;
import X.AbF;
import X.AbH;
import X.AbK;
import X.AbstractC00603o4;
import X.C00i;
import X.C09864rq;
import X.C15h;
import X.C1sx;
import X.C1uc;
import X.C5iw;
import X.C6x;
import X.DKC;
import X.DKE;
import X.DKF;
import X.EWf;
import X.Ee5;
import X.EnJ;
import X.Ena;
import X.Ers;
import X.F6W;
import X.FAJ;
import X.FXr;
import X.FkG;
import X.G7K;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.contacts.upload.ContactsUploadRunner;
import com.facebook.litho.LithoView;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.messaging.neue.nux.annotations.INeueNuxMilestoneFragment;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import java.util.Map;

/* loaded from: NeueNuxContactImportFragment.class */
public final class NeueNuxContactImportFragment extends NuxFragment implements CallerContextable, INeueNuxMilestoneFragment {
    public static final RequestPermissionsConfig A0P;
    public static final String[] A0Q = {"android.permission.WRITE_CONTACTS", "android.permission.READ_CONTACTS", "android.permission.GET_ACCOUNTS"};
    public FbUserSession A00;
    public EnJ A01;
    public ContactsUploadRunner A02;
    public C09864rq A03;
    public LithoView A04;
    public FAJ A05;
    public Ena A06;
    public 53S A07;
    public Integer A08;
    public final C00i A0M = 1BV.A00(98419);
    public final C00i A0N = 1BQ.A02(100056);
    public final C00i A0I = 1BQ.A00();
    public final C00i A0L = AbH.A0S();
    public final C00i A0F = 1BQ.A02(100054);
    public final C00i A0G = 1BQ.A02(99896);
    public final C15h A0O = G7K.A01(this, 49);
    public final View.OnClickListener A0B = FXr.A02(this, 95);
    public final View.OnClickListener A0C = FXr.A02(this, 96);
    public final View.OnClickListener A0D = FXr.A02(this, 97);
    public final View.OnClickListener A0E = FXr.A02(this, 98);
    public final Ee5 A0K = new Ee5(this);
    public final C00i A0H = AbF.A0S(this, 100053);
    public final C00i A0J = DKC.A0W(this, 99435);
    public boolean A09 = false;
    public boolean A0A = false;

    static {
        C5iw c5iw = new C5iw();
        c5iw.A00 = 1;
        c5iw.A06 = true;
        A0P = new RequestPermissionsConfig(c5iw);
    }

    private String A03() {
        0fH.A0j("XCCU", EWf.A00(this.A08));
        int intValue = this.A08.intValue();
        String str = intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 4 ? "unknown" : "messenger_internal_tool" : "messenger_ccu_qp" : "settings" : "nux_ci";
        this.A0F.get();
        return str;
    }

    public static void A06(NeueNuxContactImportFragment neueNuxContactImportFragment) {
        FAJ faj = neueNuxContactImportFragment.A05;
        DKF.A1V(faj.A01, 1BJ.A00(1332), EWf.A00(neueNuxContactImportFragment.A08));
        EnJ enJ = neueNuxContactImportFragment.A01;
        C00i c00i = enJ.A02;
        FbSharedPreferences A0R = 1BK.A0R(c00i);
        C00i c00i2 = enJ.A01;
        1LF A0f = DKE.A0f(c00i2);
        1G9 r0 = 1G0.A0B;
        int A03 = 7zM.A03(A0R, A0f.A04(r0, "contacts_upload/continuous_import_upsell_decline_count", true)) + 1;
        1Ql A0V = 1BL.A0V(c00i);
        A0V.CaH(DKE.A0f(c00i2).A04(r0, "contacts_upload/continuous_import_upsell_decline_ms", true), 1BL.A08(enJ.A00));
        A0V.CaE(DKE.A0f(c00i2).A04(r0, "contacts_upload/continuous_import_upsell_decline_count", true), A03);
        if (A03 >= 2) {
            A0V.CaE(DKE.A0f(c00i2).A04(r0, "contacts_upload/continuous_import_upsell_completed_version", true), 1);
        }
        A0V.commit();
        neueNuxContactImportFragment.A1e(null, "nux_contact_import_not_now");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0275, code lost:
    
        if (r301.A03.A02() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r0.A02() == false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [X.2qQ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A07(com.facebook.messaging.neue.nux.messenger.NeueNuxContactImportFragment r301) {
        /*
            Method dump skipped, instructions count: 1451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.neue.nux.messenger.NeueNuxContactImportFragment.A07(com.facebook.messaging.neue.nux.messenger.NeueNuxContactImportFragment):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A08(NeueNuxContactImportFragment neueNuxContactImportFragment, int i) {
        if (neueNuxContactImportFragment.getContext() != null) {
            ((C6x) 1Lo.A04(neueNuxContactImportFragment.getContext(), neueNuxContactImportFragment.A00, (1BY) null, 82347)).A01(i);
        }
    }

    public static void A09(NeueNuxContactImportFragment neueNuxContactImportFragment, String str) {
        if (0S2.A0Y.equals(neueNuxContactImportFragment.A08)) {
            ((Ers) neueNuxContactImportFragment.A0M.get()).A00("contact_importer", str, ((F6W) neueNuxContactImportFragment.A0N.get()).A02);
        }
    }

    private boolean A0A() {
        C15h c15h = this.A0O;
        boolean z = false;
        if (c15h.get() != null) {
            1G2 A01 = 1G3.A01(C1uc.A02, AbH.A1E(c15h));
            C00i c00i = this.A0L;
            z = 1BK.A0R(c00i).AZn(A01, false);
            1Ql A0V = 1BL.A0V(c00i);
            A0V.Cdj(A01);
            A0V.commit();
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int i;
        int A02 = 0FI.A02(1855303068);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        if (0S2.A00.equals(this.A08) && this.A03.A02()) {
            FAJ.A00(this.A05, "contact_import_already_granted", (Map) null);
            ((NuxFragment) this).A01.A02("contact_import", "contact_importer_already_granted");
            A1e(null, "nux_contact_import_auto_skip");
            i = 167613059;
        } else {
            A09(this, "screen_impression");
            A07(this);
            i = 2014233915;
        }
        0FI.A08(i, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Integer num;
        int A02 = 0FI.A02(-392391755);
        this.A04 = AbK.A0O(this);
        Bundle bundle2 = this.mArguments;
        str = "";
        if (bundle2 != null) {
            if ("contact_import_setting_flow".equals(bundle2.containsKey("nux_flow_context") ? this.mArguments.getString("nux_flow_context") : str)) {
                Bundle bundle3 = this.mArguments;
                if (bundle3 != null && "contact_import_setting_flow".equals(bundle3.getString("nux_flow_context", str))) {
                    num = 0S2.A01;
                    this.A08 = num;
                    DKF.A1V(this.A05.A01, AbstractC00603o4.A00(187), EWf.A00(num));
                    ((C1sx) 1Bi.A03(16837)).A01(this, new FkG(this, 0));
                    LithoView lithoView = this.A04;
                    0FI.A08(1329016901, A02);
                    return lithoView;
                }
                num = 0S2.A00;
                this.A08 = num;
                DKF.A1V(this.A05.A01, AbstractC00603o4.A00(187), EWf.A00(num));
                ((C1sx) 1Bi.A03(16837)).A01(this, new FkG(this, 0));
                LithoView lithoView2 = this.A04;
                0FI.A08(1329016901, A02);
                return lithoView2;
            }
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            if ("contact_import_qp_flow".equals(bundle4.containsKey("nux_flow_context") ? this.mArguments.getString("nux_flow_context") : str)) {
                num = 0S2.A0C;
                this.A08 = num;
                DKF.A1V(this.A05.A01, AbstractC00603o4.A00(187), EWf.A00(num));
                ((C1sx) 1Bi.A03(16837)).A01(this, new FkG(this, 0));
                LithoView lithoView22 = this.A04;
                0FI.A08(1329016901, A02);
                return lithoView22;
            }
        }
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            if ("contact_import_connections_tab_flow".equals(bundle5.containsKey("nux_flow_context") ? this.mArguments.getString("nux_flow_context") : str)) {
                num = 0S2.A0N;
                this.A08 = num;
                DKF.A1V(this.A05.A01, AbstractC00603o4.A00(187), EWf.A00(num));
                ((C1sx) 1Bi.A03(16837)).A01(this, new FkG(this, 0));
                LithoView lithoView222 = this.A04;
                0FI.A08(1329016901, A02);
                return lithoView222;
            }
        }
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            if ("ndx_flow_internal".equals(bundle6.containsKey("nux_flow_context") ? this.mArguments.getString("nux_flow_context") : "")) {
                num = 0S2.A0Y;
                this.A08 = num;
                DKF.A1V(this.A05.A01, AbstractC00603o4.A00(187), EWf.A00(num));
                ((C1sx) 1Bi.A03(16837)).A01(this, new FkG(this, 0));
                LithoView lithoView2222 = this.A04;
                0FI.A08(1329016901, A02);
                return lithoView2222;
            }
        }
        num = 0S2.A00;
        this.A08 = num;
        DKF.A1V(this.A05.A01, AbstractC00603o4.A00(187), EWf.A00(num));
        ((C1sx) 1Bi.A03(16837)).A01(this, new FkG(this, 0));
        LithoView lithoView22222 = this.A04;
        0FI.A08(1329016901, A02);
        return lithoView22222;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1121159380);
        super/*androidx.fragment.app.Fragment*/.onPause();
        if (this.A09) {
            this.A0A = true;
        }
        0FI.A08(211675285, A02);
    }
}
