package X;

import java.util.Iterator;

/* loaded from: FxI.class */
public final class FxI implements GJ5 {
    public static final FxI A00 = new Object();

    public static final C2820Jac A00() {
        Object obj = G8P.A00.get();
        if (obj != null) {
            return (C2820Jac) obj;
        }
        throw 1BK.A0h();
    }

    public static final void A01(String str) {
        boolean A03;
        FHF A0i = DKD.A0i();
        if (A0i != null) {
            EzT ezT = A0i.A01;
            Esd esd = ezT.A05;
            C2818Jaa c2818Jaa = esd.A00;
            synchronized (c2818Jaa) {
                A03 = c2818Jaa.A03(str);
            }
            if (A03) {
                return;
            }
            esd.A00(str, null);
            ezT.A03.A01(new EHc(str, (Object) null));
        }
    }

    @Override // X.GJ5
    public void A52(String str) {
        11T.A0F(str, 0);
        A00().A0A(str);
        A01(str);
    }

    @Override // X.GJ5
    public void A5E(Iterable iterable) {
        A00().A09(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A01(AnonymousClass001.A0i(it));
        }
    }
}
