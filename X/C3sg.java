package X;

import java.util.ArrayList;

/* renamed from: X.3sg, reason: invalid class name */
/* loaded from: 3sg.class */
public interface C3sg {
    public static final C3sg A00 = new C3sg() { // from class: X.3si
        @Override // X.C3sg
        public String B5f(C3sa c3sa, 4cQ r303) {
            ArrayList arrayList = new ArrayList();
            2Jf r0 = c3sa.A0K;
            String[] transientParametersForQueryNameHash = 2tS.A01(r0.A07).getTransientParametersForQueryNameHash(r0.A0B);
            int length = transientParametersForQueryNameHash.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return r303.A00(r0.A00, r0, arrayList);
                }
                arrayList.add(transientParametersForQueryNameHash[i2]);
                i = i2 + 1;
            }
        }
    };

    String B5f(C3sa c3sa, 4cQ r2);
}
