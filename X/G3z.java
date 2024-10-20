package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableList;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: G3z.class */
public final class G3z implements Runnable {
    public static final String __redex_internal_original_name = "NTAsyncActionController$4";
    public final /* synthetic */ FyG A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public G3z(FyG fyG, List list, List list2) {
        this.A01 = list;
        this.A00 = fyG;
        this.A02 = list2;
    }

    @Override // java.lang.Runnable
    public void run() {
        GL7 A0n;
        HashSet A1E;
        for (Object obj : this.A01) {
            FyG A00 = EWp.A00(this.A00, "asyncControllerSuccess");
            F6R f6r = new F6R();
            f6r.A03 = 4YU.A15(obj);
            HashMap A0u = AnonymousClass001.A0u();
            FFX A04 = FJ3.A04(A00);
            java.util.Map map = A04.A01;
            Iterator A1B = 1BK.A1B(map);
            while (A1B.hasNext()) {
                Object next = A1B.next();
                String A0b = AnonymousClass001.A0b(next, map);
                if (A0b == null) {
                    E47 A002 = FJ3.A00(A00, "NTState");
                    if (A002 != null) {
                        LinkedList linkedList = ((FAd) A002).A01;
                        synchronized (linkedList) {
                            A1E = AbF.A1E(linkedList);
                        }
                        Iterator it = A1E.iterator();
                        while (it.hasNext()) {
                            FyG fyG = (FyG) ((Reference) it.next()).get();
                            if (fyG != null && FJ3.A04(fyG) != A04) {
                                A0b = AnonymousClass001.A0b(next, FJ3.A04(fyG).A01);
                                if (A0b != null) {
                                }
                            }
                        }
                        FAo.A00(A00, AnonymousClass001.A0L(StringFormatUtil.formatStrLocaleSafe("Cannot find state given the Client Defined State name %s.", next)));
                    } else {
                        continue;
                    }
                }
                GKG A003 = FFX.A00(A04, A00, A0b);
                if (A003 instanceof Fkj) {
                    A0u.put(next, A003);
                }
            }
            if (!A0u.isEmpty()) {
                f6r.A04 = A0u;
            }
            FI5.A05(F26.A01(f6r, FJ3.A03(A00).A01, ImmutableList.of(obj), A00), A00);
            List A03 = FJ3.A03(A00).A03();
            if (!A03.isEmpty() && (A0n = DKC.A0n(A03, 0)) != null) {
                this.A02.add(A0n);
                FJ9.A0A(A0n, A00);
            }
        }
    }
}
