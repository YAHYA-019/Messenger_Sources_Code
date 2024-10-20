package com.google.android.gms.common.api.internal;

import X.0FI;
import X.2A2;
import X.2A4;
import X.2A6;
import X.2A9;
import X.2Bg;
import X.2Bi;
import X.AnonymousClass283;
import X.KdD;
import X.MQg;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.AccountAccessor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* loaded from: zact.class */
public final class zact extends zac implements 2A4, 2A6 {
    public static final AnonymousClass283 A07 = KdD.A00;
    public 2Bi A00;
    public MQg A01;
    public final Context A02;
    public final Handler A03;
    public final AnonymousClass283 A04;
    public final 2A9 A05;
    public final Set A06;

    public zact(Context context, Handler handler, 2A9 r304) {
        AnonymousClass283 anonymousClass283 = A07;
        int A03 = 0FI.A03(-184067704);
        this.A02 = context;
        this.A03 = handler;
        this.A05 = r304;
        this.A06 = r304.A05;
        this.A04 = anonymousClass283;
        0FI.A09(385056328, A03);
    }

    public final void Bqg(Bundle bundle) {
        int A03 = 0FI.A03(1516191761);
        this.A01.DBc(this);
        0FI.A09(395332081, A03);
    }

    public final void Bqs(ConnectionResult connectionResult) {
        int A03 = 0FI.A03(1024919413);
        this.A00.DBf(connectionResult);
        0FI.A09(1631099790, A03);
    }

    public final void Bqv(int i) {
        int A03 = 0FI.A03(1807558776);
        2Bg r0 = this.A00;
        2A2 r02 = (2A2) r0.A05.A09.get(r0.A04);
        if (r02 != null) {
            if (r02.A02) {
                r02.A0B(new ConnectionResult(17));
            } else {
                r02.Bqv(i);
            }
        }
        0FI.A09(1839042446, A03);
    }

    @Override // com.google.android.gms.signin.internal.zae
    public final void DBZ(final zak zakVar) {
        int A03 = 0FI.A03(1139740329);
        this.A03.post(new Runnable() { // from class: X.4X7
            public static final String __redex_internal_original_name = "zacr";

            @Override // java.lang.Runnable
            public final void run() {
                zact zactVar = zact.this;
                zak zakVar2 = zakVar;
                ConnectionResult connectionResult = zakVar2.A01;
                if (connectionResult.A01 == 0) {
                    zav zavVar = zakVar2.A02;
                    AbstractC00481b7.A02(zavVar);
                    connectionResult = zavVar.A02;
                    if (connectionResult.A01 == 0) {
                        2Bg r0 = zactVar.A00;
                        IBinder iBinder = zavVar.A01;
                        IAccountAccessor A00 = iBinder == null ? null : AccountAccessor.A00(iBinder);
                        Set set = zactVar.A06;
                        2Bg r02 = r0;
                        if (A00 == null || set == null) {
                            android.util.Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            r02.DBf(new ConnectionResult(4));
                        } else {
                            r02.A00 = A00;
                            r02.A01 = set;
                            if (r02.A02) {
                                r02.A03.B6q(A00, set);
                            }
                        }
                        zactVar.A01.disconnect();
                    }
                    android.util.Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(String.valueOf(connectionResult))), new Exception());
                }
                zactVar.A00.DBf(connectionResult);
                zactVar.A01.disconnect();
            }
        });
        0FI.A09(111042279, A03);
    }
}
