package X;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.0cD, reason: invalid class name */
/* loaded from: 0cD.class */
public final class C0cD implements 0Qv {
    public Set D6v(Set set) {
        11T.A0F(set, 0);
        ArrayList A1E = C1A3.A1E(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0T1 c0t1 = (C0T1) it.next();
            List list = c0t1.A01;
            ArrayList<Set> A1E2 = C1A3.A1E(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A1E2.add(C08u.A00.A00(new 02C(Base64.encodeToString(((C0T4) it2.next()).A01, 11))));
            }
            ArrayList A1E3 = C1A3.A1E(A1E2);
            for (Set set2 : A1E2) {
                ArrayList A1E4 = C1A3.A1E(set2);
                Iterator it3 = set2.iterator();
                while (it3.hasNext()) {
                    byte[] decode = Base64.decode(((02C) it3.next()).sha256Hash, 11);
                    11T.A0A(decode);
                    C0T1.A00(c0t1, A1E4, 11T.A03(new C0T4(decode, true)));
                }
                A1E3.add(A1E4);
            }
            A1E.add(C1A3.A1F(A1E3));
        }
        ArrayList A1F = C1A3.A1F(A1E);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(A1F);
        linkedHashSet.addAll(set);
        return linkedHashSet;
    }
}
