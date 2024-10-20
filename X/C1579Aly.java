package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.polling.PollingInputParams;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;

/* renamed from: X.Aly, reason: case insensitive filesystem */
/* loaded from: Aly.class */
public final class C1579Aly extends 1pK implements AaW, DF4, DF3 {
    public static final String __redex_internal_original_name = "PollExtensionFragment";
    public FbUserSession A00;
    public ThreadSummary A01;
    public PollingInputParams A02;
    public 6Je A04;
    public ThreadViewColorScheme A05;
    public String A06;
    public final C00i A07 = 1BQ.A02(82008);
    public final C00i A09 = 1BV.A00(67674);
    public final C00i A08 = 1BQ.A00();
    public boolean A03 = false;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0170, code lost:
    
        if (r0.AXy() == X.0S2.A0C) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x021e, code lost:
    
        if (X.AbF.A1X(r0) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(X.C1579Aly r301, java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1579Aly.A03(X.Aly, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x004c, code lost:
    
        if (X.4YU.A1Y(r0.A01(r0, r0, r0.A0n, r0, (com.facebook.user.model.User) null, (X.2Sh) null), 87) == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A06() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4f
            r0 = r301
            X.00i r0 = r0.A09
            java.lang.Object r0 = r0.get()
            X.5Hr r0 = (X.5Hr) r0
            r302 = r0
            r0 = r301
            android.content.Context r0 = r0.requireContext()
            r303 = r0
            r0 = r301
            com.facebook.auth.usersession.FbUserSession r0 = r0.A00
            r304 = r0
            r0 = r304
            java.lang.Class r0 = r0.getClass()
            r0 = r301
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A01
            r305 = r0
            r0 = r305
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r306 = r0
            r0 = r302
            r1 = r303
            r2 = r304
            r3 = r306
            r4 = r305
            r5 = 0
            r6 = 0
            com.facebook.xapp.messaging.capability.vector.Capabilities r0 = r0.A01(r1, r2, r3, r4, r5, r6)
            r303 = r0
            r0 = r303
            r1 = 87
            boolean r0 = X.4YU.A1Y(r0, r1)
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 != 0) goto L54
        L4f:
            r0 = 0
            r308 = r0
            r0 = 0
            r302 = r0
        L54:
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1579Aly.A06():boolean");
    }

    public 1iF A1R() {
        return AbF.A0C(303710824046315L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A00 = 1BL.A0G(this);
    }

    public void BiL() {
    }

    public void BiM() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Bkd() {
        if (!"voting".equals(this.A06) || getChildFragmentManager().A0U() <= 1) {
            return false;
        }
        getChildFragmentManager().A0w();
        return true;
    }

    public void BlA() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.DF4
    public void CQW(ThreadViewColorScheme threadViewColorScheme) {
        this.A05 = threadViewColorScheme;
        for (C05w c05w : getChildFragmentManager().A0T.A0A()) {
            if (c05w instanceof DF4) {
                ((DF4) c05w).CQW(threadViewColorScheme);
            }
        }
    }

    public void CSS() {
        Bkd();
    }

    @Override // X.DF3
    public void CmU(6Je r302) {
        this.A04 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        ThreadViewColorScheme threadViewColorScheme;
        super.onAttachFragment(fragment);
        if (fragment instanceof DF3) {
            ((DF3) fragment).CmU(this.A04);
        }
        if ((fragment instanceof DF4) && (threadViewColorScheme = this.A05) != null) {
            ((DF4) fragment).CQW(threadViewColorScheme);
        }
        if (fragment instanceof C2390Gbs) {
            C2390Gbs c2390Gbs = (C2390Gbs) fragment;
            c2390Gbs.A03 = new BgM(this);
            c2390Gbs.A07 = new D63(this);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1905522287);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542045);
        0FI.A08(49872084, A02);
        return A08;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("active_poll_fragment", this.A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        this.A02 = (PollingInputParams) AbG.A07(bundle2, "polling_params");
        this.A06 = bundle != null ? bundle.getString("active_poll_fragment") : null;
        CaE.A02(this, ((C5xl) 1Bi.A03(67528)).ASY(this.A02.A01), ActionId.ABORTED);
    }
}
