package X;

import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* loaded from: E28.class */
public final class E28 extends C63h {
    public final 1De A00;
    public final C6eZ A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public E28(X.1De r302) {
        /*
            r301 = this;
            r0 = r302
            X.1BY r0 = r0.A00
            r303 = r0
            r0 = 83719(0x14707, float:1.17315E-40)
            r304 = r0
            r0 = 0
            r1 = r303
            r2 = r304
            java.lang.Object r0 = X.1Bn.A0E(r0, r1, r2)
            android.content.Context r0 = (android.content.Context) r0
            r305 = r0
            r0 = r301
            r1 = r305
            r0.<init>(r1)
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = 0
            r1 = r303
            r2 = r304
            java.lang.Object r0 = X.1Bn.A0E(r0, r1, r2)
            android.content.Context r0 = (android.content.Context) r0
            r1 = 84358(0x14986, float:1.18211E-40)
            java.lang.Object r0 = X.7zR.A0o(r0, r1)
            X.6eZ r0 = (X.C6eZ) r0
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E28.<init>(X.1De):void");
    }

    @Override // X.C63h
    public 1LI A05(1Iw r302, 5zD r303, 6Az r304, AnonymousClass622 anonymousClass622, 7Wh r306) {
        ImmutableList A0c;
        AcH A0L;
        int A05 = 7zP.A05(r304, r302, 1);
        MigColorScheme migColorScheme = (MigColorScheme) 7zQ.A12(r302, 16979);
        Dsu dsu = new Dsu(r302, new DxD());
        ArE BEO = r304.BEO();
        ElN elN = null;
        if (BEO != null && (A0c = BEO.A0c(452557152, 2JX.class, 1018294889)) != null && !A0c.isEmpty() && (A0L = BEO.A0L(-436633838, AcH.class, 423528630)) != null) {
            String A0r = BEO.A0r(-573449501);
            CallToAction A00 = AbstractC08734ns.A00(A0L);
            11T.A0I(A0c, "null cannot be cast to non-null type com.google.common.collect.ImmutableList<com.facebook.messaging.graphql.threads.StoryAttachmentTargetInterfaces.InstantGamesLeaderboardUpdateStoryAttachmentFragment.RgfLeaderboardEntries>");
            ImmutableList.Builder A0h = 4YU.A0h();
            1Du it = A0c.iterator();
            while (it.hasNext()) {
                2JY A0P = 7zL.A0P(it);
                String A0j = A0P.A0j();
                String A0r2 = A0P.A0r(178029017);
                int intValue = A0P.getIntValue(3492908);
                String A0r3 = A0P.A0r(109264530);
                boolean booleanValue = A0P.getBooleanValue(-441923862);
                A0P.A0r(-147132913);
                A0h.m11011add((Object) new Eol(A0j, intValue, A0r2, A0r3, booleanValue));
            }
            elN = new ElN(A00, 1Fj.A01(A0h), A0r);
        }
        DxD dxD = dsu.A01;
        dxD.A01 = elN;
        BitSet bitSet = dsu.A02;
        bitSet.set(0);
        dxD.A02 = r306;
        bitSet.set(1);
        dxD.A00 = 3;
        bitSet.set(3);
        dxD.A03 = migColorScheme;
        bitSet.set(A05);
        C1rs.A02(bitSet, dsu.A03);
        dsu.A0J();
        return dxD;
    }
}
