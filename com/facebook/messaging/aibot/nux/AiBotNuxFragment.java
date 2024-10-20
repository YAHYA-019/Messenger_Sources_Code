package com.facebook.messaging.aibot.nux;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Iw;
import X.1pI;
import X.1pN;
import X.1vD;
import X.2cK;
import X.2cM;
import X.2dU;
import X.3vU;
import X.6Bw;
import X.6KV;
import X.7zL;
import X.7zO;
import X.7zR;
import X.7zS;
import X.7zT;
import X.82O;
import X.8Tn;
import X.ACo;
import X.AV1;
import X.AnonymousClass001;
import X.BOj;
import X.C00m;
import X.C5yv;
import X.C5yw;
import X.C77c;
import X.C8nn;
import X.C9zj;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.io.Serializable;

/* loaded from: AiBotNuxFragment.class */
public class AiBotNuxFragment extends SlidingSheetFullScreenDialogFragment implements 1pN {
    public C77c A00;
    public MigColorScheme A01;
    public C00m A02;
    public 6KV A03;
    public LithoView A04;
    public 3vU A05;

    public void A10() {
        super.A10();
        AnonymousClass001.A07().postDelayed(new ACo(this), 300L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BOj A1D() {
        Bundle bundle = this.mArguments;
        BOj bOj = null;
        Serializable serializable = bundle != null ? bundle.getSerializable("AiBotNuxFragment.entry_point") : null;
        if (serializable instanceof BOj) {
            bOj = (BOj) serializable;
        }
        return bOj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Bkd() {
        3vU r0 = this.A05;
        if (r0 == null) {
            11T.A0L("logger");
            throw 0Q8.createAndThrow();
        }
        3vU.A06(A1D(), r0, "cancel", 11);
        A0o();
        View view = this.mView;
        if (view != null) {
            1pI A00 = 1vD.A00(view);
            if (A00.BVa()) {
                A00.CeH("AiBotNuxFragment");
            }
        }
        Bundle bundle = this.mArguments;
        if (bundle != null && bundle.getBoolean("AiBotNuxFragment.finish_activity_on_picker_close")) {
            7zR.A14(this);
        }
        C00m c00m = this.A02;
        if (c00m != null) {
            c00m.invoke();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ThreadKey threadKey;
        int A02 = 0FI.A02(1028344282);
        this.A01 = 7zS.A0j(this);
        C77c c77c = (C77c) 7zO.A0l(this, 68283);
        11T.A0F(c77c, 0);
        this.A00 = c77c;
        this.A05 = (3vU) 1Bn.A0A(68258);
        this.A04 = new LithoView(requireContext(), (AttributeSet) null);
        6KV A00 = ((82O) 1Bn.A0A(65571)).A00(requireContext());
        this.A03 = A00;
        A00.A02();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (threadKey = (ThreadKey) bundle2.getParcelable("AiBotNuxFragment.thread_key")) != null) {
            2dU.A01((6Bw) null, new PRELoggingEvent(1BK.A01(threadKey)));
        }
        LithoView lithoView = this.A04;
        if (lithoView != null) {
            0FI.A08(1275294976, A02);
            return lithoView;
        }
        IllegalStateException A0h = 1BK.A0h();
        0FI.A08(-1311800575, A02);
        throw A0h;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-1821741662);
        super.onDestroyView();
        this.A04 = null;
        6KV r0 = this.A03;
        if (r0 == null) {
            11T.A0L("viewOrientationLockHelper");
            throw 0Q8.createAndThrow();
        }
        r0.A05(-1);
        0FI.A08(1192349138, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        ThreadKey threadKey;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.mView;
        if (view2 != null) {
            7zT.A13(view2.getContext(), view2);
        }
        LithoView lithoView = this.A04;
        if (lithoView != null) {
            1Iw r0 = lithoView.A09;
            MigColorScheme migColorScheme = this.A01;
            String str = "colorScheme";
            if (migColorScheme != null) {
                MigColorScheme.A00(lithoView, migColorScheme);
                2cM A00 = 2cK.A00(r0);
                11T.A0D(r0);
                C5yw A002 = C5yv.A00(r0);
                MigColorScheme migColorScheme2 = this.A01;
                if (migColorScheme2 != null) {
                    A002.A2b(migColorScheme2);
                    C9zj.A04(A002, this, 10);
                    A002.A2i(false);
                    A00.A2e(A002.A2V());
                    8Tn A003 = C8nn.A00(r0);
                    MigColorScheme migColorScheme3 = this.A01;
                    if (migColorScheme3 != null) {
                        A003.A2a(migColorScheme3);
                        C77c c77c = this.A00;
                        if (c77c != null) {
                            3vU r02 = this.A05;
                            str = "logger";
                            if (r02 != null) {
                                A003.A2Y(c77c.A0A(A1D(), r0, migColorScheme3, r02, AV1.A00(this, 26)));
                                lithoView.A0y(7zL.A0V(A00, A003.A2W()));
                                3vU r03 = this.A05;
                                if (r03 != null) {
                                    r03.A0E(A1D());
                                    Bundle bundle2 = this.mArguments;
                                    if (bundle2 == null || (threadKey = (ThreadKey) bundle2.getParcelable("AiBotNuxFragment.thread_key")) == null) {
                                        return;
                                    }
                                    2dU.A01((6Bw) null, new PRELoggingEvent(1BK.A01(threadKey)));
                                    return;
                                }
                            }
                        } else {
                            str = "aiBotNuxUtils";
                        }
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }
}
