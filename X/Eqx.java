package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Eqx.class */
public final class Eqx {
    public final FJB A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final F6C A0D;

    public Eqx(Context context) {
        1BQ A02 = 1BQ.A02(16504);
        this.A08 = A02;
        1BQ A0K = AbH.A0K();
        this.A01 = A0K;
        1BQ A0Q = DKG.A0Q();
        this.A0A = A0Q;
        FbUserSession A0D = 4YV.A0D(context);
        F6C f6c = (F6C) 1Hv.A02(context, 82751);
        this.A0D = f6c;
        1BV A0R = 7zL.A0R(context, 98329);
        this.A05 = A0R;
        1BV A0R2 = 7zL.A0R(context, 82741);
        this.A03 = A0R2;
        1BV A0R3 = 7zL.A0R(context, 82742);
        this.A0B = A0R3;
        1BV A0R4 = 7zL.A0R(context, 82739);
        this.A04 = A0R4;
        1BV A0R5 = 7zL.A0R(context, 82738);
        this.A0C = A0R5;
        1BV A0R6 = 7zL.A0R(context, 82737);
        this.A02 = A0R6;
        1BV A0R7 = 7zL.A0R(context, 82740);
        this.A07 = A0R7;
        1HH A0R8 = DKG.A0R(context);
        this.A09 = A0R8;
        1HH A0Q2 = AbF.A0Q(context, 98360);
        this.A06 = A0Q2;
        this.A00 = new FJB(A0D, A0R8, A0Q2, A0R, A0R2, A0R3, A0R4, A0R5, A0R6, A02, A0K, A0R7, A0Q, f6c.A00);
    }
}
