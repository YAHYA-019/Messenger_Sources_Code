package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Adz, reason: case insensitive filesystem */
/* loaded from: Adz.class */
public final class C1321Adz {
    public final C00i A00 = AbH.A0K();
    public final AdN A01;
    public final ImmutableList A02;
    public final String A03;
    public final DFg A04;

    public C1321Adz(FbUserSession fbUserSession, DFg dFg, ImmutableList immutableList, String str) {
        this.A01 = (AdN) 1Lo.A06(fbUserSession, 84525);
        this.A03 = str;
        this.A02 = immutableList;
        this.A04 = dFg;
    }

    public ImmutableList A00(ByH byH, ImmutableList immutableList) {
        ImmutableList immutableList2 = this.A02;
        if (immutableList2.isEmpty()) {
            AdN adN = this.A01;
            if (adN.A02()) {
                adN.A00(this.A03, "TransformHelper#mutateData no mutate functions");
            }
        } else {
            1Du it = immutableList2.iterator();
            while (it.hasNext()) {
                DFf dFf = (DFf) it.next();
                int size = immutableList.size();
                immutableList = dFf.Ben(immutableList);
                AdN adN2 = this.A01;
                if (adN2.A02()) {
                    adN2.A01(this.A03, "TransformHelper#mutateData after mutation: %s data: %d=>%d", new Object[]{dFf, Integer.valueOf(size), 1BK.A0k(immutableList)});
                }
            }
        }
        ImmutableList D4u = this.A04.D4u(byH, immutableList);
        AdN adN3 = this.A01;
        if (adN3.A02()) {
            adN3.A01(this.A03, "TransformHelper#transformData data: %d views: %d", new Object[]{1BK.A0k(immutableList), 1BK.A0k(D4u)});
        }
        return D4u;
    }
}
