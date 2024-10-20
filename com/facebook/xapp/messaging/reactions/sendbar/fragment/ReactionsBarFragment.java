package com.facebook.xapp.messaging.reactions.sendbar.fragment;

import X.0FI;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1iF;
import X.2Of;
import X.2Ov;
import X.5vW;
import X.6KV;
import X.6vE;
import X.74V;
import X.74Y;
import X.7HH;
import X.82O;
import X.9Ma;
import X.9Ur;
import X.APs;
import X.AYs;
import X.C00m;
import X.C5j5;
import android.os.Bundle;
import com.facebook.quicklog.reliability.CancelReason;

/* loaded from: ReactionsBarFragment.class */
public final class ReactionsBarFragment extends 2Ov {
    public 6KV A00;
    public C5j5 A01;
    public 74Y A02;
    public 2Of A04;
    public 7HH A05;
    public AYs A06;
    public 9Ur A07;
    public 5vW A08;
    public 6vE A09;
    public boolean A0B;
    public boolean A0C;
    public ReactionsBarParams A0D;
    public final ReactionsBarFragment A0G = this;
    public 74V A03 = new Object();
    public final 1Br A0F = 1Bu.A00(65571);
    public C00m A0A = APs.A00;
    public final 1Br A0E = 1Bq.A00(82579);

    public 1iF A17() {
        return new 1iF(195771409088126L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int i;
        ReactionsBarParams reactionsBarParams;
        int A02 = 0FI.A02(-2026574792);
        super.onCreate(bundle);
        this.A00 = ((82O) 1Br.A0B(this.A0F)).A00(getActivity());
        A0g(2, 2132606976);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (reactionsBarParams = (ReactionsBarParams) bundle2.getParcelable("reaction_bar_params")) == null) {
            0fH.A0o("ReactionsBarFragment", "ReactionsBarFragment was instantiated without required arguments.");
            A0p();
            i = -401388928;
        } else {
            this.A0D = reactionsBarParams;
            this.A0C = reactionsBarParams.A09;
            int intValue = reactionsBarParams.A03.intValue();
            if ((intValue == 3 || intValue == 1) && (this.A02 == null || this.A01 == null || this.A08 == null)) {
                A0p();
            }
            i = 530231135;
        }
        0FI.A08(i, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x057d, code lost:
    
        if (r0 == X.0S2.A00) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r302, android.view.ViewGroup r303, android.os.Bundle r304) {
        /*
            Method dump skipped, instructions count: 1614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.xapp.messaging.reactions.sendbar.fragment.ReactionsBarFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroy() {
        int A02 = 0FI.A02(687087665);
        super.onDestroy();
        if (this.A0C) {
            6KV r0 = this.A00;
            if (r0 == null) {
                11T.A0L("viewOrientationLockHelper");
                throw 0Q8.createAndThrow();
            }
            r0.A05(-1);
        }
        0FI.A08(-1753734481, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-860029299);
        super.onDestroyView();
        9Ma r0 = (9Ma) 1Br.A0B(this.A0E);
        long j = 9Ma.A01;
        if (j != 0) {
            r0.A00.flowEndCancel(j, CancelReason.USER_CANCELLED);
            9Ma.A01 = 0L;
        }
        0FI.A08(-240712451, A02);
    }
}
