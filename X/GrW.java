package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Arrays;
import java.util.List;

/* loaded from: GrW.class */
public final class GrW extends Gqk implements 1HN {
    public List A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final FbUserSession A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final IY8 A0M;
    public final JGM A0N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrW(Context context, FbUserSession fbUserSession, String str) {
        super(str);
        1BL.A1F(fbUserSession, context);
        this.A04 = fbUserSession;
        this.A03 = context;
        this.A0C = 1Bu.A01(context, 114936);
        this.A07 = 1Bu.A01(context, 82592);
        this.A0A = 1BK.A0C();
        this.A06 = 1BK.A0E();
        this.A05 = GOn.A0a(context, fbUserSession);
        this.A0B = 1Lm.A00(context, fbUserSession, 114855);
        this.A0I = GOn.A0T(context, fbUserSession);
        this.A09 = 1Lm.A00(context, fbUserSession, 67965);
        this.A08 = 1Lm.A00(context, fbUserSession, 85218);
        this.A0G = GOn.A0W(context, fbUserSession);
        this.A0F = 1Bu.A01(context, 115692);
        this.A0D = GOn.A0U(context, fbUserSession);
        this.A0E = 1Bq.A00(115629);
        this.A0H = 1Bq.A00(115627);
        this.A0K = 1Bu.A01(context, 82386);
        this.A0L = 1Bu.A01(context, 115693);
        this.A0J = 1Lm.A00(context, fbUserSession, 82385);
        this.A00 = C0ty.A00;
        this.A01 = 1Br.A09(this.A06).AZn(51K.A09, HxF.A00(this.A0E).AZk(2342169937092630405L));
        this.A0N = new If4(this, 1);
        this.A0M = IY8.A01(this, 11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r302 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final X.C1788AsM A00() {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A0H
            r302 = r0
            r0 = r302
            boolean r0 = X.I29.A00(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto La8
            r0 = 115727(0x1c40f, float:1.62168E-40)
            r304 = r0
            r0 = r301
            android.content.Context r0 = r0.A03
            r1 = r304
            java.lang.Object r0 = X.1Bu.A06(r0, r1)
            X.Gw0 r0 = (X.Gw0) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2a
            r0 = r302
            X.HBP r0 = X.JOT.A00(r0)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L2e
        L2a:
            X.HBP r0 = X.HBP.A03
            r302 = r0
        L2e:
            r0 = r302
            int r0 = r0.ordinal()
            r304 = r0
            r0 = r304
            r1 = 0
            if (r0 == r1) goto La0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 == r1) goto L98
            r0 = 2
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 == r1) goto L90
            r0 = 3
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto Lb8
            r0 = 2131967983(0x7f133fef, float:1.9572848E38)
            r305 = r0
        L51:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r302 = r0
            r0 = r301
            r1 = r302
            r2 = 2131964941(0x7f13340d, float:1.9566678E38)
            java.lang.String r0 = A08(r0, r1, r2)
            r306 = r0
            java.lang.Integer r0 = X.0S2.A0C
            r307 = r0
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r302 = r0
            r0 = r301
            r1 = r302
            r2 = r305
            java.lang.String r0 = A08(r0, r1, r2)
            r308 = r0
            X.2MQ r0 = X.2MQ.A0N
            r309 = r0
            X.AsM r0 = new X.AsM
            r310 = r0
            r0 = r310
            r1 = r309
            r2 = r307
            r3 = 0
            r4 = r306
            r5 = r308
            r6 = 48
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r310
            return r0
        L90:
            r0 = 2131967981(0x7f133fed, float:1.9572844E38)
            r305 = r0
            goto L51
        L98:
            r0 = 2131967984(0x7f133ff0, float:1.957285E38)
            r305 = r0
            goto L51
        La0:
            r0 = 2131967982(0x7f133fee, float:1.9572846E38)
            r305 = r0
            goto L51
        La8:
            r0 = r301
            X.1Br r0 = r0.A05
            X.JOT r0 = X.GOq.A0r(r0)
            X.HBP r0 = r0.AfZ()
            r302 = r0
            goto L2e
        Lb8:
            X.14o r0 = X.1BK.A1F()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrW.A00():X.AsM");
    }

    private final C1788AsM A01() {
        if (!((2QO) 1Lm.A05(this.A03, this.A04, 99977)).A0S) {
            return null;
        }
        return new C1788AsM(null, 0S2.A08, null, A08(this, new Object[0], 2131964948), null, 60, false);
    }

    private final C1788AsM A02() {
        if (!HxF.A00(this.A0E).AZk(36326927878870916L)) {
            return null;
        }
        return new C1788AsM(null, 0S2.A0E, null, A08(this, new Object[0], 2131964952), A08(this, new Object[0], 2131964951), 40, this.A01);
    }

    private final C1788AsM A03() {
        if (!HxF.A00(this.A0E).AZk(36323547739605654L)) {
            return null;
        }
        return new C1788AsM(null, 0S2.A0D, null, A08(this, AnonymousClass001.A1Z(), 2131964954), null, 44, this.A02);
    }

    public static final String A08(GrW grW, Object[] objArr, int i) {
        return AbG.A17(((JPM) GS2.A05(grW)).getContext(), Arrays.copyOf(objArr, 0), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r302v3 */
    /* JADX WARN: Type inference failed for: r302v5 */
    /* JADX WARN: Type inference failed for: r302v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A09(X.GrW r301) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GrW.A09(X.GrW):void");
    }

    public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        11T.A0F(r303, 1);
        GyU gyU = (GyU) 1Br.A0B(this.A0K);
        1G1 r0 = this.A04;
        11T.A0F(r0, 0);
        if (11T.A0O(1G9.A05(gyU.A04, r0.A02).A08(), r303.A08())) {
            A09(this);
        }
    }
}
