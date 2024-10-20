package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.5d4, reason: invalid class name */
/* loaded from: 5d4.class */
public final class C5d4 {
    public 5dU A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 2OV A0E;
    public final C5d5 A0F;
    public final C4Mm A0G;
    public final Set A0H;

    public C5d4(Context context) {
        final int i = 1;
        11T.A0F(context, 1);
        this.A01 = context;
        this.A0H = new LinkedHashSet();
        this.A03 = 1Bq.A00(67398);
        this.A0D = 1Bq.A00(67269);
        this.A09 = 1Bq.A00(66550);
        this.A0B = 1Bq.A00(67602);
        this.A0C = 1Bq.A00(66267);
        1Br A00 = 1Bq.A00(66351);
        this.A07 = A00;
        FbUserSession A04 = ((1Fv) A00.A00.get()).A04();
        this.A02 = A04;
        this.A0F = (C5d5) 1Lm.A05(context, A04, 81937);
        this.A0G = (C4Mm) 1Lm.A05(context, A04, 67931);
        this.A04 = 1Lm.A00(context, A04, 83214);
        this.A06 = 1Bq.A00(66481);
        this.A05 = 1Bq.A00(68470);
        this.A08 = 1Bq.A00(83664);
        this.A0A = 1Bu.A00(66548);
        this.A0E = new 2OV(this, i) { // from class: X.31u
            public final int A00;
            public final Object A01;

            {
                this.A00 = i;
                this.A01 = this;
            }

            public final void Bkl() {
                if (this.A00 != 0) {
                    Iterator it = ((C5d4) this.A01).A0H.iterator();
                    while (it.hasNext()) {
                        2QA.A00(((2QD) it.next()).A00);
                    }
                } else {
                    C5dR c5dR = ((5dJ) this.A01).A00;
                    if (c5dR != null) {
                        c5dR.A00();
                    }
                }
            }
        };
    }
}
