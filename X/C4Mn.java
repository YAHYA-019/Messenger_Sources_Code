package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.4Mn, reason: invalid class name */
/* loaded from: 4Mn.class */
public final class C4Mn extends 2QB {
    public 1PA A00;
    public final 1Br A03 = 1Bu.A00(67397);
    public final 1Br A01 = 1Bq.A00(16458);
    public final 1Br A02 = 1Bu.A00(82621);
    public final C4Mo A04 = new C4Mo(this);

    public void A06() {
        if (((5dC) this.A02.A00.get()).A00()) {
            Context A00 = FbInjector.A00();
            11T.A0A(A00);
            1P9 r0 = new 1P9((1I7) 1Hv.A02(A00, 65728));
            r0.A05(new 4WH(this, 2), "com.facebook.orca.ACTION_FOLDER_COUNTS_UPDATED");
            1PA A02 = r0.A02();
            this.A00 = A02;
            A02.A00();
            9UR r02 = (9UR) 1Br.A0B(this.A03);
            C4Mo c4Mo = this.A04;
            11T.A0F(c4Mo, 0);
            r02.A00.A00(new C4Vw(c4Mo, 0));
        }
    }

    public void A07() {
        1PA r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
    }
}
