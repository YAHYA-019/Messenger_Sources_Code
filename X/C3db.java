package X;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;

/* renamed from: X.3db, reason: invalid class name */
/* loaded from: 3db.class */
public final class C3db implements Supplier {
    public final int A00;
    public final Object A01;

    public C3db(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        if (2 - this.A00 == 0) {
            return Integer.valueOf(((5TE) this.A01).A04.A01());
        }
        2TR r0 = (2TR) this.A01;
        C00j.A05("getTopPhoneContacts", -1386779344);
        try {
            ImmutableList A00 = ((CIM) r0.A0J.get()).A00();
            0fH.A07(2TR.class, 1BK.A0k(A00), "loaded %d top phone contacts");
            C00j.A01(-813291165);
            return A00;
        } catch (Throwable th) {
            C00j.A01(-1295831213);
            throw th;
        }
    }
}
