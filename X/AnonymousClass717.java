package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.717, reason: invalid class name */
/* loaded from: 717.class */
public abstract class AnonymousClass717 {
    public static final void A00(C5nC c5nC, C6qu c6qu) {
        C6qv c6qv = c6qu.A00;
        final 2Of AbO = c6qv.AbO();
        final AnonymousClass718 anonymousClass718 = new AnonymousClass718(c6qv.AWp(), c5nC);
        C6rN c6rN = ((6rM) c6qu.A06).A0S;
        final MigColorScheme Ad3 = c6rN.Ad3();
        final 1Va Akk = c6qv.Akk();
        final AnonymousClass713 anonymousClass713 = (AnonymousClass713) c6rN.B64().getValue();
        c6qu.A07.add(new AnonymousClass715(anonymousClass718, Ad3, AbO, Akk, anonymousClass713) { // from class: X.719
            public final 1Br A00;
            public final AnonymousClass718 A01;
            public final MigColorScheme A02;
            public final 2Of A03;
            public final 1Va A04;
            public final AnonymousClass713 A05;

            {
                11T.A0F(AbO, 1);
                11T.A0F(Ad3, 3);
                11T.A0F(Akk, 4);
                11T.A0F(anonymousClass713, 5);
                this.A03 = AbO;
                this.A01 = anonymousClass718;
                this.A02 = Ad3;
                this.A04 = Akk;
                this.A05 = anonymousClass713;
                this.A00 = 1Bq.A00(16385);
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0078, code lost:
            
                if (r0 != false) goto L10;
             */
            @Override // X.AnonymousClass715
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public X.1LI AdF(X.1LI r302, X.C1qb r303, X.C5j5 r304, X.5vW r305, java.util.List r306, int r307) {
                /*
                    Method dump skipped, instructions count: 384
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass719.AdF(X.1LI, X.1qb, X.5j5, X.5vW, java.util.List, int):X.1LI");
            }

            @Override // X.AnonymousClass715
            public boolean BQh(5vW r302) {
                5vV r0 = (5vV) r302;
                5vU r02 = r0.A01;
                Capabilities capabilities = r02.A00;
                C5fv c5fv = r0.A00;
                7Hg r03 = (7Hg) r02.A01.A00(7Hg.A01);
                if (!capabilities.A00.get(ActionId.LEGACY_MARKER) || !this.A01.A00(c5fv) || (c5fv instanceof 5gP)) {
                    return false;
                }
                if ((c5fv instanceof C5n6) && ((2yD) this.A00.A00.get()).AZk(36326468317370008L)) {
                    return false;
                }
                if (c5fv instanceof 5gC) {
                    if (c5fv.AxW(C5v4.A00) == null) {
                        return false;
                    }
                }
                return r03 == null || r03.A00 == 7Jy.A04;
            }
        });
    }
}
