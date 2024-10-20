package com.facebook.messaging.business.inboxads.postclick.fragment;

import X.06Z;
import X.0D2;
import X.0FI;
import X.0S2;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1Lo;
import X.1UG;
import X.1iF;
import X.2Ov;
import X.2UZ;
import X.3OQ;
import X.4YU;
import X.4YV;
import X.4Zi;
import X.4oD;
import X.AbF;
import X.AnonymousClass001;
import X.C00i;
import X.C1t3;
import X.C52j;
import X.DKC;
import X.EiH;
import X.EqM;
import X.EqW;
import X.Erm;
import X.Ets;
import X.Evu;
import X.Ezq;
import X.F4H;
import X.F6j;
import X.FKF;
import X.FkF;
import X.IPf;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.messaging.business.inboxads.common.InboxAdsItem;
import com.facebook.messaging.business.inboxads.renderstate.InboxAdsPostclickRenderState;
import java.util.ArrayList;

/* loaded from: InboxAdsPostClickFragment.class */
public class InboxAdsPostClickFragment extends 2Ov {
    public FbUserSession A00;
    public C00i A01;
    public LithoView A02;
    public InboxAdsItem A03;
    public 4Zi A04;
    public InboxAdsPostclickRenderState A05;
    public final C00i A07 = DKC.A0W(this, 100189);
    public final C00i A09 = 1BV.A00(99702);
    public final C00i A08 = AbF.A0S(this, 82164);
    public final C00i A0C = AbF.A0S(this, 99700);
    public final C00i A06 = AbF.A0S(this, 99701);
    public final C00i A0A = 1BV.A00(99703);
    public final C00i A0B = 1BV.A00(98496);

    public 1iF A17() {
        return AbF.A0C(2429843100654746L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        int A02 = 0FI.A02(-901104483);
        this.A00 = 1BL.A0G(this);
        Context requireContext = requireContext();
        if (bundle != null && 1BK.A0K().AZk(36317642164547157L)) {
            bundle = ((3OQ) this.A0B.get()).A00(requireContext, bundle);
        }
        super.onCreate(bundle);
        this.A01 = 1BQ.A02(99704);
        A0g(2, 2132608328);
        if (!1BK.A0K().AZk(36317642164547157L)) {
            parcelable = this.mArguments.getParcelable("data");
        } else if (bundle == null || !bundle.containsKey("data")) {
            Bundle bundle2 = this.mArguments;
            bundle2.getClass();
            parcelable = (InboxAdsItem) bundle2.getParcelable("data");
            if (parcelable != null) {
                Bundle bundle3 = this.mArguments;
                bundle3.remove("data");
                setArguments(bundle3);
            }
        } else {
            parcelable = (InboxAdsItem) bundle.getParcelable("data");
        }
        parcelable.getClass();
        this.A03 = (InboxAdsItem) parcelable;
        InboxAdsPostclickRenderState inboxAdsPostclickRenderState = (InboxAdsPostclickRenderState) this.mArguments.getParcelable("renderState");
        this.A05 = inboxAdsPostclickRenderState;
        inboxAdsPostclickRenderState.getClass();
        C00i c00i = this.A09;
        EqW eqW = (EqW) c00i.get();
        InboxAdsData inboxAdsData = this.A03.A00;
        eqW.A01 = getContext();
        eqW.A02 = inboxAdsData;
        eqW.A03 = 1BK.A0d();
        eqW.A05 = AnonymousClass001.A0v();
        eqW.A06 = AnonymousClass001.A0v();
        C00i c00i2 = this.A0C;
        EqM eqM = (EqM) c00i2.get();
        Context context = getContext();
        06Z r0 = this.mFragmentManager;
        InboxAdsData inboxAdsData2 = this.A03.A00;
        Erm erm = new Erm(this);
        eqM.A00 = context;
        eqM.A01 = r0;
        eqM.A02 = inboxAdsData2;
        eqM.A03 = erm;
        F6j f6j = (F6j) this.A06.get();
        InboxAdsData inboxAdsData3 = this.A03.A00;
        InboxAdsPostclickRenderState inboxAdsPostclickRenderState2 = this.A05;
        EqM eqM2 = (EqM) c00i2.get();
        FbUserSession fbUserSession = this.A00;
        fbUserSession.getClass();
        Ezq ezq = new Ezq(fbUserSession, new F4H(eqM2), eqM2);
        Evu evu = new Evu((EqW) c00i.get());
        FbUserSession fbUserSession2 = this.A00;
        f6j.A07 = this;
        f6j.A02 = inboxAdsData3;
        f6j.A05 = inboxAdsPostclickRenderState2;
        f6j.A06 = new FkF(f6j, 1);
        ((C1t3) 1Lo.A04((Context) null, fbUserSession2, f6j.A00, 33086)).A00(f6j.A06);
        f6j.A03 = ezq;
        f6j.A04 = evu;
        ((EiH) this.A0A.get()).A00 = AnonymousClass001.A1T(4oD.A00(this.A03.A00).A06);
        0FI.A08(-501614861, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1805792484);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(2132542152, viewGroup);
        this.A02 = (LithoView) inflate.requireViewById(2131366627);
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null) {
            dialog.setOnKeyListener(new FKF(this, 3));
            if (dialog.getWindow() != null && this.A05.A06) {
                dialog.getWindow().setSoftInputMode(2);
                dialog.getWindow().setSoftInputMode(16);
            }
        }
        F6j f6j = (F6j) this.A06.get();
        f6j.A01 = this.A02;
        F6j.A00(f6j);
        0FI.A08(585597346, A02);
        return inflate;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-2102544610);
        F6j f6j = (F6j) this.A06.get();
        FbUserSession fbUserSession = this.A00;
        fbUserSession.getClass();
        f6j.A03 = null;
        ((C1t3) 1Lo.A04((Context) null, fbUserSession, f6j.A00, 33086)).A01(f6j.A06);
        f6j.A06 = null;
        f6j.A01 = null;
        f6j.A07 = null;
        EqM eqM = (EqM) this.A0C.get();
        eqM.A03 = null;
        eqM.A01 = null;
        eqM.A00 = null;
        IPf iPf = (IPf) ((EiH) this.A0A.get()).A01.get();
        synchronized (iPf) {
            iPf.A01 = 0;
        }
        this.A04 = null;
        super.onDestroy();
        0FI.A08(2026004356, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        String str;
        int A02 = 0FI.A02(-1818873758);
        EqW eqW = (EqW) this.A09.get();
        2UZ r0 = (2UZ) eqW.A08.get();
        InboxAdsData inboxAdsData = eqW.A02;
        long A09 = 1BL.A09(eqW.A07) - eqW.A00;
        Integer num = eqW.A04;
        ArrayList A17 = 1BK.A17(eqW.A05);
        ArrayList A172 = 1BK.A17(eqW.A06);
        boolean booleanValue = eqW.A03.booleanValue();
        int i = 4YU.A0B(eqW.A01).screenWidthDp;
        int i2 = 4YU.A0B(eqW.A01).screenHeightDp;
        1UG A08 = 1BK.A08(1BK.A07(r0.A03), 1BJ.A00(1428));
        if (A08.isSampled()) {
            A08.A6H("ad_position", 1BK.A0l(4oD.A00(inboxAdsData).A01));
            A08.A7R("client_token", inboxAdsData.A0F);
            A08.A6H("time_on_screen", Long.valueOf(A09));
            switch (num.intValue()) {
                case 0:
                    str = "AD_CLICK";
                    break;
                case 1:
                    str = "CLOSE";
                    break;
                case 2:
                    str = "HIDE";
                    break;
                default:
                    str = "PAUSE";
                    break;
            }
            A08.A7R("exit_reason", str);
            r0.A02.get();
            11T.A0A(inboxAdsData.A07());
            A08.A0C(1BJ.A00(522));
            A08.A7h("postclick_visible_first_render", A17);
            A08.A7h("postclick_visible_during_session", A172);
            A08.A5H("postclick_user_did_scroll", Boolean.valueOf(booleanValue));
            A08.A6H("device_screen_height", 1BK.A0l(i2));
            A08.A6H("device_screen_width", 1BK.A0l(i));
            A08.BZL();
        }
        EiH eiH = (EiH) this.A0A.get();
        C52j c52j = C52j.A2Z;
        if (eiH.A00) {
            ((IPf) eiH.A01.get()).A00(c52j);
        }
        Ets ets = (Ets) this.A01.get();
        String str2 = this.A03.A00.A0F;
        if (ets.A00 != 0 && (str2 == null || str2.equals(ets.A01))) {
            4YV.A0Z(ets.A02).flowEndSuccess(ets.A00);
            ets.A00 = 0L;
        }
        super/*androidx.fragment.app.Fragment*/.onPause();
        0FI.A08(2013404272, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-2051778484);
        super/*androidx.fragment.app.Fragment*/.onResume();
        EqW eqW = (EqW) this.A09.get();
        eqW.A04 = 0S2.A0N;
        eqW.A00 = 1BL.A09(eqW.A07);
        ((Ets) this.A01.get()).A00("postclick_render_complete", this.A03.A00.A0F);
        0FI.A08(-1663116522, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSaveInstanceState(Bundle bundle) {
        if (1BK.A0K().AZk(36317642164547157L)) {
            bundle.putParcelable("data", this.A03);
            ((3OQ) this.A0B.get()).A01(requireContext(), bundle, "data");
        }
        super/*X.0D2*/.onSaveInstanceState(bundle);
    }
}
