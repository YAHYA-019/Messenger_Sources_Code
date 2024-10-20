package com.facebook.bugreporter.activity.chooser;

import X.0FI;
import X.1BK;
import X.1BQ;
import X.1iF;
import X.2Ov;
import X.4YV;
import X.5TL;
import X.AnonymousClass001;
import X.C00i;
import X.DKF;
import X.DKG;
import X.DKH;
import X.DKS;
import X.DMV;
import X.DPY;
import X.Ezd;
import X.F6w;
import X.F8e;
import X.FH6;
import X.FK6;
import X.NAi;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: ChooserFragment.class */
public class ChooserFragment extends 2Ov {
    public Intent A00;
    public F6w A01;
    public DPY A02;
    public FH6 A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public NAi A07;
    public Long A08;
    public String A09;
    public final C00i A0A = 1BQ.A02(49736);
    public final C00i A0B = 1BQ.A02(100321);

    public ChooserFragment() {
        Boolean A0K = AnonymousClass001.A0K();
        this.A06 = A0K;
        this.A05 = 1BK.A0d();
        this.A04 = A0K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        DKS dks = new DKS(getContext());
        dks.A06(2131953546);
        DPY dpy = this.A02;
        FK6 A00 = FK6.A00(this, 3);
        F8e f8e = dks.A01;
        f8e.A0B = dpy;
        f8e.A04 = A00;
        DMV A0I = dks.A0I();
        onViewCreated(this.mView, null);
        return A0I;
    }

    public 1iF A17() {
        return DKG.A0F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x006f, code lost:
    
        if (r302 != null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            r301 = this;
            r0 = 784724748(0x2ec5f30c, float:9.0016966E-11)
            int r0 = X.0FI.A02(r0)
            r303 = r0
            r0 = r301
            r1 = r302
            super.onCreate(r1)
            r0 = 100320(0x187e0, float:1.40578E-40)
            java.lang.Object r0 = X.1Bn.A0A(r0)
            X.FH6 r0 = (X.FH6) r0
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A03 = r1
            r0 = r301
            r1 = 99942(0x18666, float:1.40049E-40)
            java.lang.Object r0 = X.7zO.A0l(r0, r1)
            android.content.Intent r0 = (android.content.Intent) r0
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A00 = r1
            r0 = 148035(0x24243, float:2.07441E-40)
            java.lang.Object r0 = X.1Bn.A0A(r0)
            X.NAi r0 = (X.NAi) r0
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A07 = r1
            r0 = r301
            android.os.Bundle r0 = r0.requireArguments()
            r305 = r0
            r0 = 552(0x228, float:7.74E-43)
            r306 = r0
            r0 = r306
            java.lang.String r0 = X.4YT.A00(r0)
            r304 = r0
            r0 = r305
            r1 = r304
            java.util.ArrayList r0 = r0.getParcelableArrayList(r1)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            r305 = r0
            X.DPY r0 = new X.DPY
            r304 = r0
            r0 = r304
            r0.<init>()
            r0 = r304
            r1 = r305
            r0.A00 = r1
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r302
            if (r0 != 0) goto L72
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r302 = r0
            r0 = r302
            if (r0 == 0) goto Lb3
        L72:
            java.lang.String r0 = "local_bug_report_id"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.containsKey(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L96
            r0 = r302
            r1 = r305
            long r0 = r0.getLong(r1)
            r307 = r0
            r0 = r307
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A08 = r1
        L96:
            java.lang.String r0 = "client_server_join_key"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.containsKey(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lb3
            r0 = r302
            r1 = r305
            java.lang.String r0 = r0.getString(r1)
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A09 = r1
        Lb3:
            r0 = -1563680315(0xffffffffa2cc21c5, float:-5.5330066E-18)
            r1 = r303
            X.0FI.A08(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bugreporter.activity.chooser.ChooserFragment.onCreate(android.os.Bundle):void");
    }

    public void onStop() {
        int A02 = 0FI.A02(-1590147944);
        super/*X.0D2*/.onStop();
        if (this.A05.booleanValue()) {
            if (this.A08 == null || this.A09 == null) {
                ((5TL) this.A0A.get()).A0C(this.A01);
            } else {
                5TL r0 = (5TL) this.A0A.get();
                long longValue = this.A08.longValue();
                r0.A0D(this.A01, this.A09, longValue);
            }
        } else if (this.A06.booleanValue() && this.A08 != null) {
            boolean booleanValue = this.A04.booleanValue();
            Ezd A0G = DKF.A0G(this.A0B);
            long longValue2 = this.A08.longValue();
            if (booleanValue) {
                UserFlowLogger A0Z = 4YV.A0Z(A0G.A00);
                A0Z.flowEndCancel(DKH.A06(A0Z, longValue2), "bug_report_menu_cancelled");
            } else {
                UserFlowLogger A0Z2 = 4YV.A0Z(A0G.A00);
                A0Z2.flowEndSuccess(DKH.A06(A0Z2, longValue2));
            }
        }
        0FI.A08(-880497012, A02);
    }
}
