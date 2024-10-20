package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.List;

/* renamed from: X.842, reason: invalid class name */
/* loaded from: 842.class */
public final class AnonymousClass842 {
    public final 1Br A01 = 1BK.A0C();
    public final 1Br A00 = 7zM.A0N();
    public final 1Br A02 = 1Bq.A00(66347);

    public static final 1CO A00(AnonymousClass842 anonymousClass842) {
        return 1Br.A06(anonymousClass842.A01);
    }

    public final long A01() {
        return 1Br.A06(this.A01).Auy(36602428556121921L);
    }

    public final 2MQ A02() {
        int A00 = C1Ur.A00(1Br.A06(this.A01), 0, 36602428558808902L);
        return A00 != 1 ? A00 != 2 ? 2MQ.A32 : 2MQ.A1Y : 2MQ.A2X;
    }

    public final List A03() {
        String BDB = 1Br.A06(this.A01).BDB(1GD.A07, 36883903534794162L);
        11T.A0A(BDB);
        return C13m.A1A(4YU.A19(BDB, ", ", 0));
    }

    public final boolean A04() {
        return 1Br.A06(this.A01).AZk(36320953583026031L);
    }

    public final boolean A05() {
        return 1Br.A06(this.A01).AZk(36320953582960494L);
    }

    public final boolean A06() {
        return 1Br.A06(this.A01).AZk(36320953581977442L);
    }

    public final boolean A07(ThreadKey threadKey) {
        1CO A06;
        long j;
        Boolean valueOf = threadKey != null ? Boolean.valueOf(threadKey.A0z()) : null;
        boolean z = false;
        if (!7zR.A1X(valueOf)) {
            if (1BK.A1X(valueOf, false)) {
                A06 = 1Br.A06(this.A01);
                j = 36320953582960494L;
            }
            return z;
        }
        A06 = 1Br.A06(this.A01);
        j = 36320953583091568L;
        z = A06.AZk(j);
        return z;
    }

    public final boolean A08(ThreadKey threadKey, Capabilities capabilities) {
        11T.A0F(capabilities, 0);
        if (((1Wa) 1Br.A0B(this.A02)).A00() || !4YU.A1Y(capabilities, ActionId.PRIVACY_VIOLATION)) {
            return false;
        }
        1Br r0 = this.A01;
        if (1Br.A06(r0).AZk(36320953579355987L)) {
            return threadKey == null || !threadKey.A1A() || 1Br.A06(r0).AZk(36320953582370662L);
        }
        return false;
    }

    public final boolean A09(ThreadKey threadKey, Capabilities capabilities) {
        11T.A0F(capabilities, 0);
        if (!4YU.A1Y(capabilities, ActionId.PRIVACY_VIOLATION)) {
            return false;
        }
        1Br r0 = this.A01;
        if (1Br.A06(r0).AZk(36320953580797787L)) {
            return threadKey == null || !threadKey.A1A() || 1Br.A06(r0).AZk(36320953582370662L);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (X.1Br.A06(r301.A01).AZk(36320953581125469L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0A(com.facebook.xapp.messaging.capability.vector.Capabilities r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            r1 = 149(0x95, float:2.09E-43)
            boolean r0 = X.4YU.A1Y(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L35
            r0 = r301
            X.1Br r0 = r0.A01
            r303 = r0
            r0 = r303
            X.1CO r0 = X.1Br.A06(r0)
            r305 = r0
            r0 = 36320953581125469(0x8109b7001b3f5d, double:3.0328555252202005E-306)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r308 = r0
            r0 = 1
            r304 = r0
            r0 = r308
            if (r0 != 0) goto L39
        L35:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L39:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass842.A0A(com.facebook.xapp.messaging.capability.vector.Capabilities):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (X.1Br.A07(r301.A00).AZk(72340168526531831L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0B(boolean r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L25
            r0 = r301
            X.1Br r0 = r0.A00
            r303 = r0
            r0 = r303
            X.2yD r0 = X.1Br.A07(r0)
            r304 = r0
            r0 = 72340168526531831(0x101010000040cf7, double:7.74859720529525E-304)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 != 0) goto L2a
        L25:
            r0 = 0
            r308 = r0
            r0 = 0
            r303 = r0
        L2a:
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass842.A0B(boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (X.1Br.A07(r301.A00).AZk(72340168526269683L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0C(boolean r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 != 0) goto L25
            r0 = r301
            X.1Br r0 = r0.A00
            r303 = r0
            r0 = r303
            X.2yD r0 = X.1Br.A07(r0)
            r304 = r0
            r0 = 72340168526269683(0x101010000000cf3, double:7.748597204870845E-304)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 != 0) goto L2a
        L25:
            r0 = 0
            r308 = r0
            r0 = 0
            r303 = r0
        L2a:
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass842.A0C(boolean):boolean");
    }
}
