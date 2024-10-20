package X;

import java.lang.ref.Reference;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: E46.class */
public final class E46 extends FAd {
    public static final E46 A01 = new E46(new WeakHashMap());
    public final WeakHashMap A00;

    public E46(WeakHashMap weakHashMap) {
        this.A00 = weakHashMap;
    }

    public Eik A01(FyG fyG, String str, String str2) {
        DLQ dlq;
        Eik eik = null;
        if (str != null) {
            DLQ dlq2 = FJ6.A02(fyG).A06;
            WeakHashMap weakHashMap = this.A00;
            AbstractMap abstractMap = (AbstractMap) weakHashMap.get(dlq2);
            if (abstractMap != null) {
                Reference reference = (Reference) abstractMap.get(str);
                if (reference != null) {
                    dlq = (DLQ) reference.get();
                }
            } else {
                HashMap A0u = AnonymousClass001.A0u();
                weakHashMap.put(dlq2, A0u);
                DLQ[] dlqArr = new DLQ[1];
                dlq2.A0I(new S5k(this, new Fxc(str), A0u, dlqArr));
                dlq = dlqArr[0];
            }
            if (dlq != null) {
                eik = new Eik(dlq, fyG);
            }
        }
        return eik;
    }

    public boolean A07(EtA etA, FyG fyG, String str, String str2) {
        Eik A012;
        boolean z = false;
        if (str != null && (A012 = A01(fyG, str, str2)) != null) {
            A012.A00.A0I(new S5j(A012, this, etA));
            z = true;
        }
        return z;
    }

    public final void A09(FyG fyG, Runnable runnable) {
        if (!FJ5.A09()) {
            FJ5.A07(new SDJ(this, fyG, runnable));
            return;
        }
        try {
            try {
                ((FAd) this).A00++;
                A06(FJ6.A02(fyG), "doUpdates");
                runnable.run();
            } catch (Exception e) {
                FwX.A00(fyG).BM7(e, FJ3.A08(fyG));
            }
        } finally {
            A03();
        }
    }
}
