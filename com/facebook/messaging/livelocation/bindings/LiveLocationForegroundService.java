package com.facebook.messaging.livelocation.bindings;

import X.05X;
import X.0FI;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BQ;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Fv;
import X.4YU;
import X.4vM;
import X.5HS;
import X.7zL;
import X.7zP;
import X.AbH;
import X.AbL;
import X.AnonymousClass001;
import X.C00i;
import X.C08o;
import X.C10904ux;
import X.C10914uy;
import X.C10924uz;
import X.C15h;
import X.C1F6;
import X.C2rm;
import X.C3o5;
import X.HrX;
import X.HyX;
import X.I08;
import X.IAf;
import X.J5u;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: LiveLocationForegroundService.class */
public class LiveLocationForegroundService extends C2rm {
    public C00i A00;
    public C00i A01;
    public IAf A02;
    public C15h A03;
    public final C00i A05 = 1BQ.A02(115654);
    public final C00i A04 = AbH.A0N();
    public final C00i A06 = 1BQ.A02(66351);

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        I08 i08 = (I08) 4YU.A0p(this.A01);
        Intent A0D = C3o5.A0D(this, LiveLocationForegroundService.class);
        A0D.putExtra("ACTION_EXTRA_KEY", "ACTION_STOP_ALL_SHARING");
        05X r0 = new 05X();
        r0.A0C(A0D);
        PendingIntent A03 = r0.A03(this, 0, 0);
        C10904ux c10904ux = (C10904ux) 1Br.A0B(i08.A06);
        Context context = i08.A00;
        C10914uy A00 = c10904ux.A00(context, null, null, 20009);
        A00.A0L(context.getResources().getString(2131958679));
        A00.A08(A03, context.getResources().getString(2131958680), 7zP.A0S(i08.A07).A00());
        ((C10924uz) A00).A03 = 2;
        A00.A0C(0L);
        Notification A07 = A00.A07();
        11T.A0A(A07);
        ((4vM) 1Br.A0B(i08.A08)).A00(A07, "live_location");
        C08o.A04(A07, this, 20009);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01fa, code lost:
    
        if (r309 != null) goto L45;
     */
    @Override // X.C2rm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A11(android.content.Intent r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.livelocation.bindings.LiveLocationForegroundService.A11(android.content.Intent, int, int):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2rm
    public void A12() {
        int A04 = 0FI.A04(-2072756648);
        super.A12();
        FbUserSession A042 = ((1Fv) this.A06.get()).A04();
        this.A01 = 7zL.A0R(this, 114834);
        this.A00 = 7zL.A0R(this, 49641);
        this.A03 = J5u.A03(this, 19);
        0fH.A0j("LiveLocationForegroundService", "onFbCreate");
        A00();
        C1F6 c1f6 = (C1F6) 1Bn.A0E(this, (1BY) null, 628);
        HrX hrX = new HrX(A042, this);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            IAf iAf = new IAf(c1f6, hrX);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A02 = iAf;
            iAf.A04("initialize", AnonymousClass001.A1Z());
            0FI.A0A(-38906023, A04);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    @Override // X.C2rm
    public void A13() {
        int A04 = 0FI.A04(-1599200683);
        0fH.A0j("LiveLocationForegroundService", "onFbDestroy");
        ((5HS) 4YU.A0p(this.A00)).A01();
        IAf iAf = this.A02;
        if (iAf != null) {
            Handler handler = iAf.A03;
            handler.removeCallbacks(iAf.A08);
            handler.removeCallbacks(iAf.A09);
            IAf.A02(iAf, 0S2.A00);
            iAf.A04("release", AnonymousClass001.A1Z());
            this.A02 = null;
        }
        HyX.A00(this);
        super.A13();
        0FI.A0A(1783698022, A04);
    }
}
