package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.2pl, reason: invalid class name */
/* loaded from: 2pl.class */
public final class C2pl implements C2pm {
    public final Context A00;
    public final C1u4 A01;
    public final 1Br A02;
    public final Integer A03;

    public C2pl(Context context, C1u4 c1u4, Integer num) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A01 = c1u4;
        this.A03 = num;
        this.A02 = 1Bq.A00(16839);
    }

    @Override // X.C2pm
    public Drawable Chr(C2po c2po) {
        11T.A0F(c2po, 0);
        if (!(c2po instanceof C2pn)) {
            throw AnonymousClass001.A0L("Failed requirement.");
        }
        C1u3 c1u3 = ((C2pn) c2po).A00;
        Integer num = this.A03;
        Drawable drawable = num == null ? this.A00.getDrawable(((C1u2) this.A02.A00.get()).A04(c1u3, this.A01)) : ((C1u2) 1Br.A0B(this.A02)).A09(c1u3, this.A01, num.intValue());
        if (drawable != null) {
            return drawable;
        }
        throw 1BK.A0e();
    }
}
