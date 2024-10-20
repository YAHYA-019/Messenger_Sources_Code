package X;

import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: Cqv.class */
public final class Cqv implements DHR {
    public final 1Br A00 = AbG.A0S();

    private final ArrayList A00() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.m11012add((Object[]) new 53N[]{53N.A05, 53N.A0Q});
        ImmutableList build = builder.build();
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new CHu(ClientDataSourceIdentifier.A06, build));
        if (!AbL.A0N(this.A00).AZk(36321322949624029L)) {
            A0s.add(new CHu(ClientDataSourceIdentifier.A07, build));
        }
        return A0s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r302.A00 != X.53M.A0I) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ADX(X.C5n r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            X.BLs r0 = r0.A01
            r304 = r0
            X.BLs r0 = X.BLs.A01
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L29
            r0 = r302
            X.53M r0 = r0.A00
            r306 = r0
            X.53M r0 = X.53M.A0I
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            r1 = r304
            if (r0 == r1) goto L2e
        L29:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L2e:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cqv.ADX(X.C5n):boolean");
    }

    public C91 AJH(C5n c5n) {
        C83 c83;
        ImmutableList copyOf;
        11T.A0F(c5n, 0);
        if (AbL.A0N(this.A00).AZk(36321322949624029L)) {
            ImmutableList.Builder builder = ImmutableList.builder();
            CHu.A00(ClientDataSourceIdentifier.A0K, builder, (ImmutableList) null);
            builder.addAll(A00());
            c83 = new C83();
            copyOf = builder.build();
        } else {
            c83 = new C83();
            copyOf = ImmutableList.copyOf((Collection) 0QD.A0O(A00(), C0s8.A14(new CHu(ClientDataSourceIdentifier.A0m, (ImmutableList) null), new CHu(ClientDataSourceIdentifier.A0G, (ImmutableList) null))));
        }
        c83.A00(copyOf);
        c83.A01(c5n.A02);
        return new C91(c83);
    }
}
