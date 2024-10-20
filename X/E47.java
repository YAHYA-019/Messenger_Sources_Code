package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: E47.class */
public final class E47 extends FAd {
    public int A00;
    public final HashMap A02 = AnonymousClass001.A0u();
    public int A01 = 0;

    public static Eik A00(E47 e47, FyG fyG, String str, int i) {
        GL7 A01 = FJ3.A03(fyG).A01(fyG, i);
        if (A01 != null) {
            return new Eik(A01, fyG);
        }
        FyG fyG2 = (FyG) FyG.A02(fyG, 2131366025);
        if (fyG2 != null) {
            return A00(e47, fyG2, str, i);
        }
        Eik eik = null;
        if (str == null) {
            FJ3.A01(fyG).A02.A02.get();
        }
        LinkedList linkedList = ((FAd) e47).A01;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                FyG fyG3 = (FyG) ((WeakReference) it.next()).get();
                if (fyG3 == null) {
                    it.remove();
                } else {
                    GL7 A012 = FJ3.A03(fyG3).A01(fyG3, i);
                    if (A012 != null) {
                        new Eik(A012, fyG3);
                        break;
                    }
                }
            }
        }
        return eik;
    }

    public void A08(0Jt r302, GL7 gl7, FyG fyG, List list, int i) {
        DKD.A1L(fyG);
        A06(FJ3.A02(fyG), "nt_foreachref_reconcile_keyed_children");
        String id = gl7.getId();
        id.getClass();
        FJ3.A02(fyG).A01.A00(new Rt1(r302, id, list, i));
    }

    public final void A09(FyG fyG, Runnable runnable) {
        if (!FJ5.A09()) {
            FJ5.A07(new SDF(this, fyG, runnable));
            return;
        }
        try {
            try {
                ((FAd) this).A00++;
                runnable.run();
            } catch (Exception e) {
                FwX.A00(fyG).BM7(e, FJ3.A08(fyG));
            }
        } finally {
            A03();
        }
    }

    public void A0A(FyG fyG, String str, String str2, List list) {
        Eik A01 = A01(fyG, str, str2);
        if (A01 != null) {
            FyG fyG2 = A01.A01;
            DKD.A1L(fyG2);
            A06(FJ3.A02(fyG2), "nt_action_append_children");
            FxY A02 = FJ3.A02(fyG2);
            if (str == null) {
                throw AnonymousClass001.A0q("Only implemented in LtRModelMutator.");
            }
            A02.A01.A00(new Rt2(fyG2, 0S2.A00, str, list));
        }
    }

    public void A0B(FyG fyG, String str, String str2, List list) {
        Eik A01 = A01(fyG, str, str2);
        if (A01 != null) {
            FyG fyG2 = A01.A01;
            DKD.A1L(fyG2);
            A06(FJ3.A02(fyG2), "nt_action_prepend_children");
            FJ3.A02(fyG2).A01.A00(new Rt2(fyG2, 0S2.A01, str, list));
        }
    }

    public GL7 A0C(FyG fyG, String str, int i) {
        Eik A00 = A00(this, fyG, 0Pz.A0W("UTS.templateForClientId.", str), i);
        if (A00 == null) {
            return null;
        }
        return A00.A00;
    }
}
