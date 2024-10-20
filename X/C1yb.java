package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;

/* renamed from: X.1yb, reason: invalid class name */
/* loaded from: 1yb.class */
public final class C1yb extends C1yc {
    public C15h A00;
    public 1BY A01;
    public final C00i A02;
    public final C00i A03;

    public C1yb(1BO r302, FbUserSession fbUserSession) {
        super((0AC) 1Bi.A03(46), (1Ih) 1Bi.A03(67196), new C3j6(8));
        this.A03 = new 1BQ(66776);
        this.A01 = new 1BY(r302);
        this.A00 = new 3jD(this, 20);
        Integer num = 1Lo.A05;
        this.A02 = new 1MV(fbUserSession, (1BY) null, 33191);
    }

    public static ThreadKey A00(C1yb c1yb, Long l, int i, long j) {
        C1yg A00 = ((C1yf) c1yb.A03.get()).A00(i);
        if (A00 == C1yg.ONE_TO_ONE) {
            return ThreadKey.A0H(j, Long.parseLong(((User) c1yb.A00.get()).A0k.id));
        }
        if (A00 == C1yg.GROUP) {
            return (l == null || l.longValue() != j) ? ThreadKey.A08(j) : ThreadKey.A0E(j);
        }
        if (A00 == C1yg.MARKETPLACE) {
            return ThreadKey.A0A(j);
        }
        if (A00 == C1yg.FOLDER) {
            return ThreadKey.A07(j);
        }
        if (A00 == C1yg.COMMUNITY_CHANNEL) {
            return ThreadKey.A03(j);
        }
        if (A00 == C1yg.COMMUNITY_SUB_THREAD) {
            return ThreadKey.A04(j);
        }
        if (A00 == C1yg.ADVANCED_CRYPTO_ONE_TO_ONE) {
            return ThreadKey.A02(j);
        }
        if (A00 == C1yg.ADVANCED_CRYPTO_GROUP) {
            return ThreadKey.A01(j);
        }
        if (A00 == C1yg.SOCIAL_CHANNEL) {
            return ThreadKey.A06(j);
        }
        if (A00 == C1yg.BROADCAST_CHANNEL) {
            return ThreadKey.A05(j);
        }
        if (A00 == C1yg.AI_BOT) {
            return ThreadKey.A0F(j, Long.parseLong(((User) c1yb.A00.get()).A0k.id));
        }
        if (A00 == C1yg.INTEROP_ONE_TO_ONE) {
            return ThreadKey.A09(j);
        }
        throw AnonymousClass001.A0q(0Pz.A0W("The type unsupported is ", String.valueOf(A00)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        if (r0 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private X.21G A01(com.facebook.messaging.model.threadkey.ThreadKey r302, X.21G r303) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1yb.A01(com.facebook.messaging.model.threadkey.ThreadKey, X.21G):X.21G");
    }

    @Override // X.C1yc
    public ThreadKey A06(C1yd c1yd) {
        int intValue = c1yd.A01().intValue();
        long parseLong = Long.parseLong(c1yd.A02());
        1qW r0 = c1yd.A01;
        return A00(this, ((1qX) r0).mResultSet.getNullableLong(c1yd.A00, 25), intValue, parseLong);
    }

    @Override // X.C1yc
    public 21G A08(C1yd c1yd) {
        return A01(A06(c1yd), super.A08(c1yd));
    }

    @Override // X.C1yc
    public 21G A09(5pK r302, java.util.Map map) {
        return A01(A07(r302), super.A09(r302, map));
    }

    @Override // X.C1yc
    public boolean A0B() {
        return true;
    }
}
