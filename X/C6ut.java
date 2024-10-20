package X;

import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.6ut, reason: invalid class name */
/* loaded from: 6ut.class */
public final class C6ut implements 2pC {
    public final AaO A00;

    public C6ut(AaO aaO) {
        this.A00 = aaO;
    }

    public /* bridge */ /* synthetic */ 1LI AMJ(1LI r302, 1Iw r303, Object obj, Object obj2) {
        6Ku r0 = (6Ku) obj;
        11T.A0F(r302, 1);
        11T.A0F(r0, 2);
        if (!(r0 instanceof C6ru)) {
            return r302;
        }
        AnonymousClass690 anonymousClass690 = ((C6ru) r0).A01;
        int i = anonymousClass690.A01;
        HeterogeneousMap A00 = anonymousClass690.A00();
        11T.A0A(A00);
        return new 8ZO(r302, this.A00, A00, i);
    }
}
