package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.composer.quickreply.logging.type.QuickReplyLoggingType;
import com.facebook.messaging.model.platformmetadata.types.quickreply.QuickReplyItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* loaded from: B20.class */
public final class B20 extends 2Yf {
    public 06Z A00;
    public FbUserSession A01;
    public C0dr A02;
    public 8B8 A03;
    public AeA A04;
    public ThreadKey A05;
    public 63D A06;
    public MigColorScheme A07;
    public ImmutableList A08;
    public String A09;
    public boolean A0A;

    public B20() {
        super("QuickReplyListSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        FbUserSession fbUserSession = this.A01;
        MigColorScheme migColorScheme = this.A07;
        ImmutableList immutableList = this.A08;
        06Z r0 = this.A00;
        ThreadKey threadKey = this.A05;
        63D r02 = this.A06;
        boolean z = this.A0A;
        8B8 r03 = this.A03;
        AeA aeA = this.A04;
        String str = this.A09;
        C0dr c0dr = this.A02;
        11T.A0F(c1qb, 0);
        1BL.A1H(fbUserSession, migColorScheme, immutableList);
        11T.A0F(r02, 6);
        11T.A0F(r03, 9);
        11T.A0F(aeA, 10);
        11T.A0F(c0dr, 12);
        2Yr A0l = 7zL.A0l();
        int size = immutableList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                2Ys r04 = A0l.A00;
                11T.A0A(r04);
                return r04;
            }
            QuickReplyItem quickReplyItem = (QuickReplyItem) immutableList.get(i2);
            2hP A0I = 2hO.A0I(c1qb);
            2cM A00 = 2cK.A00(c1qb);
            AeC aeC = new AeC(c1qb, new AeB());
            AeB aeB = aeC.A01;
            aeB.A02 = fbUserSession;
            BitSet bitSet = aeC.A02;
            bitSet.set(3);
            aeB.A0A = migColorScheme;
            bitSet.set(1);
            aeB.A07 = quickReplyItem;
            bitSet.set(5);
            aeB.A09 = r02;
            bitSet.set(7);
            aeB.A04 = r03;
            bitSet.set(10);
            aeB.A06 = aeA;
            bitSet.set(12);
            aeB.A08 = threadKey;
            bitSet.set(13);
            aeB.A01 = r0;
            bitSet.set(4);
            aeB.A00 = i2;
            bitSet.set(9);
            aeB.A0D = false;
            bitSet.set(6);
            aeB.A0C = z;
            bitSet.set(2);
            aeB.A05 = QuickReplyLoggingType.A04;
            bitSet.set(11);
            aeB.A03 = c0dr;
            bitSet.set(8);
            aeB.A0B = str;
            bitSet.set(0);
            AbM.A1L(aeC, bitSet, aeC.A03);
            A00.A2e(aeB);
            A00.A1A(4.0f);
            A0I.A05(A00.A00);
            A0l.A00(A0I);
            i = i2 + 1;
        }
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            B20 b20 = (B20) r302;
            String str = this.A09;
            String str2 = b20.A09;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            MigColorScheme migColorScheme = this.A07;
            MigColorScheme migColorScheme2 = b20.A07;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            if (this.A0A != b20.A0A) {
                return false;
            }
            FbUserSession fbUserSession = this.A01;
            FbUserSession fbUserSession2 = b20.A01;
            if (fbUserSession != null) {
                if (!fbUserSession.equals(fbUserSession2)) {
                    return false;
                }
            } else if (fbUserSession2 != null) {
                return false;
            }
            06Z r0 = this.A00;
            06Z r02 = b20.A00;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            ImmutableList immutableList = this.A08;
            ImmutableList immutableList2 = b20.A08;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
            63D r03 = this.A06;
            63D r04 = b20.A06;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            C0dr c0dr = this.A02;
            C0dr c0dr2 = b20.A02;
            if (c0dr != null) {
                if (!c0dr.equals(c0dr2)) {
                    return false;
                }
            } else if (c0dr2 != null) {
                return false;
            }
            8B8 r05 = this.A03;
            8B8 r06 = b20.A03;
            if (r05 != null) {
                if (!r05.equals(r06)) {
                    return false;
                }
            } else if (r06 != null) {
                return false;
            }
            AeA aeA = this.A04;
            AeA aeA2 = b20.A04;
            if (aeA != null) {
                if (!aeA.equals(aeA2)) {
                    return false;
                }
            } else if (aeA2 != null) {
                return false;
            }
            ThreadKey threadKey = this.A05;
            ThreadKey threadKey2 = b20.A05;
            if (threadKey != null) {
                if (!threadKey.equals(threadKey2)) {
                    return false;
                }
            } else if (threadKey2 != null) {
                return false;
            }
        }
        return true;
    }
}
