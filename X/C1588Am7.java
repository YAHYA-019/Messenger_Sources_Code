package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.rtc.incall.impl.incoming.IncomingCallButtonsView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.Am7, reason: case insensitive filesystem */
/* loaded from: Am7.class */
public final class C1588Am7 extends 1pK implements JFq {
    public static final String __redex_internal_original_name = "IncomingCallFragment";
    public View A00;
    public LithoView A01;
    public GSP A02;
    public final C01i A04;
    public final C01i A05;
    public final C01i A07;
    public final 1Br A03 = 7zM.A0Y();
    public final C01i A06 = C01g.A01(new J9t(this, 1));

    public C1588Am7() {
        C03i c03i = C03i.A02;
        this.A04 = C01g.A00(c03i, new J9s(this, 49));
        this.A05 = C01g.A01(new J9t(this, 0));
        this.A07 = C01g.A00(c03i, DCi.A00);
    }

    public 1iF A1R() {
        return AbF.A0C(594492937905231L);
    }

    public void A1S(Bundle bundle) {
        IEA.A00((IEA) this.A04.getValue()).markerPoint(16252930, AnonymousClass000.A00(ActionId.END_START_ACTIVITY));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        1LI A2W;
        CpH cpH = (CpH) jdb;
        11T.A0F(cpH, 0);
        boolean z = cpH.A05;
        View view = this.A00;
        if (!z) {
            if (view == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            view.setVisibility(0);
            LithoView lithoView = this.A01;
            if (lithoView == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            lithoView.setVisibility(8);
            return;
        }
        if (view == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        view.setVisibility(8);
        LithoView lithoView2 = this.A01;
        if (lithoView2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        lithoView2.setVisibility(0);
        LithoView lithoView3 = this.A01;
        if (lithoView3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        1Iw r0 = lithoView3.A09;
        2cM A01 = 2cK.A01(r0, (String) null, 0);
        LithoView lithoView4 = this.A01;
        if (lithoView4 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        AvM avM = new AvM(lithoView4.A09, new AzP());
        FbUserSession A09 = 7zV.A09(this, this.A03);
        AzP azP = avM.A01;
        azP.A01 = A09;
        BitSet bitSet = avM.A02;
        bitSet.set(3);
        avM.A0g(0.0f);
        azP.A07 = cpH.A03;
        bitSet.set(9);
        azP.A06 = cpH.A02;
        bitSet.set(8);
        azP.A05 = null;
        bitSet.set(2);
        azP.A04 = cpH.A01;
        bitSet.set(1);
        azP.A08 = cpH.A04;
        bitSet.set(4);
        azP.A0D = false;
        bitSet.set(6);
        azP.A0E = true;
        bitSet.set(7);
        azP.A0A = true;
        bitSet.set(5);
        C01i c01i = this.A05;
        azP.A03 = (MigColorScheme) c01i.getValue();
        bitSet.set(0);
        A01.A2d(avM);
        11T.A0D(r0);
        if (cpH.A06) {
            2KD A012 = 2K3.A01(r0, 0);
            7zP.A1J(A012, cpH.A00);
            A012.A2X();
            A012.A2x((MigColorScheme) c01i.getValue());
            A012.A1C(10.0f);
            A012.A19(20.0f);
            A2W = A012.A2W();
        } else {
            A2W = null;
        }
        1LI A0V = 7zL.A0V(A01, A2W);
        LithoView lithoView5 = this.A01;
        if (lithoView5 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        lithoView5.A0y(A0V);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Context getContext() {
        if (!7zQ.A1a(this.A07)) {
            return super/*androidx.fragment.app.Fragment*/.getContext();
        }
        GSP gsp = this.A02;
        if (gsp == null) {
            Context context = super/*androidx.fragment.app.Fragment*/.getContext();
            if (context != null) {
                String string = requireArguments().getString("local_call_id");
                if (string == null) {
                    throw 1BK.A0h();
                }
                gsp = new GSP(context, string, 1BL.A0Q().AZk(36326360944694792L));
            } else {
                gsp = null;
            }
            this.A02 = gsp;
        }
        return gsp;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1402733732);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132542455, viewGroup, false);
        0FI.A08(-1057515328, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(1205540763);
        AbI.A1X(this.A06);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        0FI.A08(-1619866301, A02);
    }

    public void onDetach() {
        int A02 = 0FI.A02(2107089706);
        this.A02 = null;
        super.onDetach();
        0FI.A08(1659219496, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(897057585);
        super/*androidx.fragment.app.Fragment*/.onPause();
        Bz1 bz1 = (Bz1) 1Br.A0B(((B7j) this.A06.getValue()).A06);
        C8t c8t = bz1.A00;
        if (c8t != null) {
            c8t.A00();
        }
        bz1.A00 = null;
        0FI.A08(-1687675406, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1101356060);
        super/*androidx.fragment.app.Fragment*/.onResume();
        IEA iea = (IEA) this.A04.getValue();
        IEA.A00(iea).markerAnnotate(16252930, "notif_type", "full_screen");
        IEA.A03(iea, 16252930);
        0FI.A08(-1887248382, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(1110866106);
        super/*androidx.fragment.app.Fragment*/.onStart();
        C48 c48 = (C48) 1Br.A0B(((B7j) this.A06.getValue()).A03);
        c48.A00 = 1Br.A01(c48.A02) + 700;
        0FI.A08(1422527363, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = 7zL.A0F(this, 2131362801);
        this.A01 = (LithoView) 7zL.A0F(this, 2131367011);
        AbI.A1S(this, this.A06);
        ((IncomingCallButtonsView) 7zL.A0F(this, 2131364605)).A00 = new Bmb(view, this);
    }
}
