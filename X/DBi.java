package X;

import android.view.View;
import com.facebook.messaging.rollcall.model.RollCallArgs;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* loaded from: DBi.class */
public final class DBi implements C00l, C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DBi(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    @Override // X.C00m
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                AcO acO = (AcO) this.A01;
                ((83Z) this.A02).A06(acO.A0F, (06Z) this.A03, (String) null, 5SW.A1c.toString(), false, true);
                return 04S.A00;
            case 1:
                AdU.A00((AdU) this.A01, (ByH) this.A03, (ImmutableList) this.A02);
                return null;
            default:
                6MV r0 = (6MV) this.A01;
                View view = (View) this.A02;
                RollCallArgs rollCallArgs = (RollCallArgs) this.A03;
                6MW r02 = r0.A03;
                if (r02 == null || view == null) {
                    return null;
                }
                6F2 r03 = r02.A00;
                ImmutableSet immutableSet = 6F2.A4P;
                r03.A0b.A1m(view, rollCallArgs);
                return null;
        }
    }
}
