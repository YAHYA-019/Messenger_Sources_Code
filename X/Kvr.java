package X;

import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.dextricks.DalvikInternals;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: Kvr.class */
public abstract class Kvr {
    public static final void A00(MLv mLv, MLj mLj, MCG mcg, KOa kOa, C00m c00m, int i, int i2, boolean z) {
        L3k l3k;
        float f;
        float f2;
        long j;
        KOD kod;
        LNS lns;
        long j2;
        C00m c00m2 = c00m;
        boolean z2 = z;
        KOa kOa2 = kOa;
        MLj mLj2 = mLj;
        11T.A0F(mcg, 0);
        mLv.D2B(1122391431);
        int A0B = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? JR0.A0B(JR1.A1X(mLv, mcg, i & 8) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            A0B |= 48;
        } else if ((i & 48) == 0) {
            A0B |= JR1.A0G(mLv, mLj2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            A0B |= 384;
        } else if ((i & 384) == 0) {
            A0B |= JR1.A0H(mLv, kOa2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            A0B |= 3072;
        } else if ((i & 3072) == 0) {
            A0B |= JR1.A0M(mLv, z2);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            A0B |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            A0B |= JR0.A08(mLv.AEk(c00m2) ? 1 : 0);
        }
        if ((A0B & 9363) == 9362 && mLv.BBC()) {
            mLv.D0o();
        } else {
            if (i3 != 0) {
                mLj2 = MLj.A00;
            }
            if (i4 != 0) {
                kOa2 = KOa.A08;
            }
            if (i5 != 0) {
                z2 = true;
            }
            if (i6 != 0) {
                c00m2 = M2X.A00;
            }
            KOa kOa3 = KOa.A0A;
            if (kOa2 == kOa3 || kOa2 == KOa.A0D || kOa2 == KOa.A0G || kOa2 == KOa.A04) {
                l3k = null;
            } else {
                if (z2) {
                    switch (kOa2.ordinal()) {
                        case 0:
                        case 10:
                            mLv.D2A(-1964971199);
                            lns = (LNS) mLv;
                            j2 = LNS.A06(lns, KaV.A00).A0L;
                            break;
                        case 1:
                        case 11:
                            mLv.D2A(-1964967675);
                            lns = (LNS) mLv;
                            j2 = LNS.A06(lns, KaV.A00).A08;
                            break;
                        case 2:
                        case 6:
                        case 9:
                        case 12:
                            mLv.D2A(-1964963608);
                            LNS.A0P((LNS) mLv, false);
                            throw AnonymousClass001.A0N("Unreachable");
                        case 3:
                            mLv.D2A(-1964961539);
                            lns = (LNS) mLv;
                            j2 = LNS.A06(lns, KaV.A00).A0e;
                            break;
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 13:
                        case 14:
                            mLv.D2A(-1964953885);
                            lns = (LNS) mLv;
                            j2 = LNS.A06(lns, KaV.A00).A0P;
                            break;
                        default:
                            mLv.D2A(-1965231436);
                            LNS.A0P((LNS) mLv, false);
                            throw 1BK.A1F();
                    }
                    LNS.A0P(lns, false);
                } else {
                    j2 = LNS.A06((LNS) mLv, KaV.A00).A0P;
                }
                l3k = new L3k(j2);
            }
            int ordinal = kOa2.ordinal();
            switch (ordinal) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    f = 10.0f;
                    break;
                case 7:
                case 8:
                case 9:
                    f = 100.0f;
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    f = 15.0f;
                    break;
                default:
                    throw 1BK.A1F();
            }
            LNN lnn = new LNN(f);
            MLj A00 = KUP.A00(mLj2, new LOT(lnn, lnn, lnn, lnn));
            if (l3k != null) {
                A00 = A00.D4B(KTt.A00(MLj.A00, KZd.A00, l3k.A00));
            }
            switch (ordinal) {
                case 7:
                case 8:
                case 9:
                    f2 = 32.0f;
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    f2 = 48.0f;
                    break;
                default:
                    f2 = 36.0f;
                    break;
            }
            MLj A01 = L5c.A01(KTw.A00(A00.D4B(new UnspecifiedConstraintsElement(f2)), c00m2, z2), 16.0f, 0.0f);
            MKQ A002 = Kws.A00(L7E.A02, mLv, Kz0.A00, 54);
            LNS lns2 = (LNS) mLv;
            int i7 = lns2.A02;
            MRT A04 = LNS.A04(lns2);
            MLj A012 = KvE.A01(mLv, A01);
            LNS.A0J(mLv, lns2, Kyy.A00);
            L5d.A01(mLv, A002, A04);
            Function2 function2 = Kyy.A01;
            if (lns2.A0K || !JR1.A1W(mLv, i7)) {
                JR0.A18(mLv, function2, i7);
            }
            L5d.A00(mLv, A012);
            if (mcg instanceof Jtf) {
                mLv.D2A(777985654);
                Jtf jtf = (Jtf) mcg;
                String str = jtf.A01;
                AbstractC2837Jau abstractC2837Jau = KaX.A00;
                LDZ.A02(mLv, (MLj) null, (L4D) null, ((KmQ) LNS.A08(lns2, abstractC2837Jau)).A01, str, (Function1) null, 3, 0, 0, 1, 12582912, 0, 1890, kOa2.A00(mLv, z2), false);
                String str2 = jtf.A00;
                if (str2 != null && str2.length() != 0) {
                    if (kOa2 == KOa.A08 || kOa2 == KOa.A09 || kOa2 == kOa3 || kOa2 == KOa.A07 || kOa2 == KOa.A0B || kOa2 == KOa.A0C || kOa2 == KOa.A0D || kOa2 == KOa.A0E || kOa2 == KOa.A0F || kOa2 == KOa.A0G) {
                        throw AnonymousClass001.A0N("Subtitle only supported for Large button variants");
                    }
                    if (kOa2 != KOa.A02 && kOa2 != KOa.A03 && kOa2 != KOa.A04 && kOa2 != KOa.A05 && kOa2 != KOa.A06) {
                        throw 1BK.A1F();
                    }
                    LDZ.A02(mLv, (MLj) null, (L4D) null, ((KmQ) LNS.A08(lns2, abstractC2837Jau)).A02, str2, (Function1) null, 3, 0, 0, 1, 12582912, 0, 1890, kOa2.A00(mLv, z2), false);
                }
            } else if (mcg instanceof LWX) {
                mLv.D2A(717854104);
                MLj A013 = L5c.A01(MLj.A00, RXk.A00, 0.0f);
                if (z2) {
                    switch (ordinal) {
                        case 0:
                        case 1:
                        case 10:
                        case 11:
                            mLv.D2A(-2103033999);
                            j = LNS.A06(lns2, KaV.A00).A03;
                            break;
                        case 2:
                        case 6:
                        case 9:
                        case 12:
                            mLv.D2A(-2103029489);
                            j = LNS.A06(lns2, KaV.A00).A0Q;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        default:
                            mLv.D2A(-2103020883);
                            j = LNS.A06(lns2, KaV.A00).A0M;
                            break;
                    }
                    LNS.A0P(lns2, false);
                } else {
                    j = LNS.A06(lns2, KaV.A00).A0Q;
                }
                switch (ordinal) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        kod = KOD.A03;
                        break;
                    default:
                        kod = KOD.A02;
                        break;
                }
                KWf.A00(mLv, A013, kod, (Float) null, 0, 4, j);
            } else {
                mLv.D2A(778864008);
            }
            LNS.A0P(lns2, false);
            LNS.A0P(lns2, true);
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M7H(mcg, mLj2, kOa2, c00m2, i, i2, 0, z2);
        }
    }

    public static final void A01(MLv mLv, MLj mLj, KOa kOa, String str, C00m c00m, int i, int i2, boolean z) {
        C00m c00m2 = c00m;
        boolean z2 = z;
        KOa kOa2 = kOa;
        MLj mLj2 = mLj;
        11T.A0F(str, 0);
        mLv.D2B(779017119);
        int A0F = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? JR1.A0F(mLv, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            A0F |= 48;
        } else if ((i & 48) == 0) {
            A0F |= JR1.A0G(mLv, mLj2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            A0F |= 384;
        } else if ((i & 384) == 0) {
            A0F |= JR1.A0H(mLv, kOa2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            A0F |= 3072;
        } else if ((i & 3072) == 0) {
            A0F |= JR1.A0M(mLv, z2);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            A0F |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            A0F |= JR0.A08(mLv.AEk(c00m2) ? 1 : 0);
        }
        if ((A0F & 9363) == 9362 && mLv.BBC()) {
            mLv.D0o();
        } else {
            if (i3 != 0) {
                mLj2 = MLj.A00;
            }
            if (i4 != 0) {
                kOa2 = KOa.A08;
            }
            if (i5 != 0) {
                z2 = true;
            }
            if (i6 != 0) {
                c00m2 = M2W.A00;
            }
            A00(mLv, mLj2, new Jtf(str, null), kOa2, c00m2, (A0F & ActionId.MISSED_EVENT) | (A0F & 896) | (A0F & 7168) | (A0F & 57344), 0, z2);
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M7I(kOa2, c00m2, mLj2, str, i, i2, 0, z2);
        }
    }
}
