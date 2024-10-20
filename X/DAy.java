package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* loaded from: DAy.class */
public final class DAy implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DAy(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r308v5 */
    /* JADX WARN: Type inference failed for: r308v6 */
    /* JADX WARN: Type inference failed for: r308v7, types: [java.util.AbstractCollection] */
    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        C5vg c5vg;
        Object A00;
        switch (this.A00) {
            case 0:
                C63l c63l = (C63l) this.A02;
                Set set = C63l.A0B;
                A00 = c63l.A03.A00(c63l.A06, null, ((Cht) this.A01).getIdentifier());
                break;
            case 1:
                List list = (List) this.A02;
                A00 = AbJ.A1B(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A00.add(((Future) it.next()).get());
                }
                break;
            default:
                try {
                    c5vg = (C5vg) this.A01;
                    C5vi c5vi = (C5vi) c5vg.A07.get();
                    1Vd A0K = 7zM.A0K(AbF.A04(c5vi.A00));
                    GraphQlQueryParamSet A0M = 7zL.A0M();
                    A0M.A03("should_fetch_soap_accounts", Boolean.valueOf(AbG.A0o(c5vi.A01).A01()));
                    C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "SOAPAccountsQuery", (String) null, "fbandroid", 1700015032, 0, 582218051L, 582218051L, false, true));
                    AbN.A15(A0L);
                    4YU.A1J(A0L, 267451864570511L);
                    AbstractC08294mh abstractC08294mh = (AbstractC08294mh) AbstractC05474dx.A01(5JX.class, A0K.A09(A0L));
                    2JX r305 = abstractC08294mh != null ? (2JX) abstractC08294mh.A03 : null;
                    synchronized (c5vg) {
                        c5vg.A02 = r305;
                        c5vg.A00 = 1BL.A08(c5vg.A04);
                        if (!1Br.A07(AbG.A0o(c5vg.A09).A01).AZk(36314365100564382L)) {
                            ((1I7) c5vg.A08.get()).CkT("com.facebook.orca.ACTION_SOAP_ACCOUNTS_UPDATED");
                        }
                        c5vg.A03 = null;
                    }
                } catch (5JX e) {
                    c5vg = (C5vg) this.A01;
                    synchronized (c5vg) {
                        c5vg.A03 = null;
                        1BK.A09(c5vg.A06).D0v("SOAPAccountsDataStore", 0Pz.A1B("Fetch SOAP accounts. ", e));
                    }
                }
                return c5vg.A02;
        }
        return A00;
    }
}
