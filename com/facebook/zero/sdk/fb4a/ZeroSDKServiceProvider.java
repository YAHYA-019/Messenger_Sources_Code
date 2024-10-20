package com.facebook.zero.sdk.fb4a;

import X.11T;
import X.1Pp;
import X.1Pr;
import X.1Pz;
import X.1Q2;
import X.2BR;
import X.2C8;
import X.3oH;
import X.C00i;
import X.EDw;
import X.EDx;
import X.Eqk;
import X.Fue;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: ZeroSDKServiceProvider.class */
public final class ZeroSDKServiceProvider {
    public 3oH A00;
    public boolean A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final 1Pp A07;
    public final Queue A08;
    public final C00i A09;
    public final C00i A0A;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x03d4, code lost:
    
        if (r0.A01 == false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.GGh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ZeroSDKServiceProvider() {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.sdk.fb4a.ZeroSDKServiceProvider.<init>():void");
    }

    public static void A00(ZeroSDKServiceProvider zeroSDKServiceProvider) {
        synchronized (zeroSDKServiceProvider) {
            3oH r0 = zeroSDKServiceProvider.A00;
            if (r0 != null) {
                r0.AGW();
            }
            zeroSDKServiceProvider.A00 = ((1Q2) zeroSDKServiceProvider.A09.get()).A00(zeroSDKServiceProvider.A07);
            zeroSDKServiceProvider.A01 = false;
        }
    }

    public static void A01(ZeroSDKServiceProvider zeroSDKServiceProvider, boolean z) {
        3oH r0;
        synchronized (zeroSDKServiceProvider) {
            r0 = zeroSDKServiceProvider.A00;
        }
        if (r0 != null) {
            if (((1Pz) zeroSDKServiceProvider.A06.get()).A02() && ((Eqk) r0.getState()).A0A) {
                return;
            }
            C00i c00i = zeroSDKServiceProvider.A0A;
            ImmutableSet A0B = ((2BR) c00i.get()).A0B();
            11T.A0F(A0B, 0);
            Fue fue = new Fue();
            Iterator it = A0B.iterator();
            while (it.hasNext()) {
                fue.A01(it.next());
            }
            1Pr A01 = 2C8.A01(((2BR) c00i.get()).A0A());
            1Pr A012 = 2C8.A01(((2BR) c00i.get()).A0A());
            r0.ANn(z ? new EDw(A01, A012, fue) : new EDx(A01, A012, fue));
        }
    }

    public void A02() {
        boolean z;
        if (this.A01) {
            synchronized (this) {
                if (this.A01) {
                    A00(this);
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                A01(this, false);
                if (this.A00 != null) {
                    Iterator it = this.A08.iterator();
                    while (it.hasNext()) {
                        this.A00.ANn(it.next());
                    }
                }
            }
            this.A08.clear();
        }
    }
}
