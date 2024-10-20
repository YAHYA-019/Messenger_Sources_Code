package X;

import com.google.common.collect.ImmutableList;

/* loaded from: C3A.class */
public final class C3A {
    public final 1Br A00 = 1Bu.A00(67519);
    public final 1Br A01 = 1Bu.A00(67383);

    public final ImmutableList A00(String str) {
        ImmutableList of;
        if (str == null || 0CU.A0O(str)) {
            of = ImmutableList.of();
        } else {
            ImmutableList A00 = 5UI.A00((5UI) 1Br.A0B(this.A00), str, false);
            ImmutableList.Builder builder = ImmutableList.builder();
            1Du it = A00.iterator();
            while (it.hasNext()) {
                String A002 = ((EsW) 1Br.A0B(this.A01)).A00(AnonymousClass001.A0i(it));
                if (!0CU.A0O(A002)) {
                    builder.m11011add((Object) A002);
                }
            }
            of = builder.build();
        }
        11T.A0A(of);
        return of;
    }
}
