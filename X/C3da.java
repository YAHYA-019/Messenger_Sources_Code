package X;

import com.google.common.base.Supplier;
import com.google.common.collect.RegularImmutableSet;

/* renamed from: X.3da, reason: invalid class name */
/* loaded from: 3da.class */
public final class C3da implements Supplier {
    public final int A00;
    public final Object A01;

    public C3da(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // com.google.common.base.Supplier
    public /* bridge */ /* synthetic */ Object get() {
        boolean z;
        switch (this.A00) {
            case 0:
                ((1GY) this.A01).A00.get();
                return RegularImmutableSet.A05;
            case 1:
                return ((1GY) this.A01).A00();
            case 2:
                1GY r0 = (1GY) this.A01;
                1I0 r02 = new 1I0(4);
                r0.A00.get();
                r02.A08(r0.A00());
                r02.A05("en");
                return r02.A07();
            default:
                2TR r03 = (2TR) this.A01;
                0fH.A0A(2TR.class, "waitingForContactSynch");
                if (r03.A0B.A00(C4CK.A02, -1) <= 0) {
                    0fH.A0A(2TR.class, "Waiting for contacts");
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
