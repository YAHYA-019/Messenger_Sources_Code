package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: Kqt.class */
public final class Kqt {
    public View A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final Fik A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final String A0B;
    public final java.util.Map A0C;
    public final boolean A0D;
    public final Intent A0E;

    public Kqt(Context context, Intent intent, String str, String str2, boolean z) {
        11T.A0F(context, 1);
        this.A0D = z;
        this.A0B = str2;
        this.A0E = intent;
        this.A07 = 1Bu.A00(116398);
        this.A09 = 1Bu.A00(116397);
        this.A08 = 1Bu.A00(131207);
        this.A0A = 1BK.A0C();
        1Br A00 = 1HG.A00(context, 82045);
        this.A06 = A00;
        1Br.A0C(A00);
        this.A0C = L0h.A00(intent);
        RbC rbC = new RbC(context);
        rbC.A02();
        rbC.A04(QqV.A02);
        rbC.A06(0S2.A01);
        rbC.A05(context.getString(2131951696));
        String string = context.getString(2131951695);
        RP5 rp5 = rbC.A00;
        rp5.A06 = string;
        rp5.A01 = new LuV(this);
        this.A05 = rbC.A01(CallerContext.A0B(str));
        this.A04 = (int) ((-1.0f) * context.getResources().getDimension(2132279332));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x05ff, code lost:
    
        if (X.11T.A0O(r0, r0) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x07b1, code lost:
    
        if ((r0 - r0) < 360000) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A00(android.view.View r302) {
        /*
            Method dump skipped, instructions count: 2090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kqt.A00(android.view.View):boolean");
    }
}
