package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1di, reason: invalid class name */
/* loaded from: 1di.class */
public final class C1di extends 1Km {
    public long A00;
    public long A01;
    public long A02;
    public C3Pq A03;
    public L8X A04;
    public L8X A05;
    public L8X A06;
    public L8X A07;
    public L8X A08;
    public L8X A09;
    public L8X A0A;
    public L8X A0B;
    public L8X A0C;
    public L8X A0D;
    public L8X A0E;
    public L8X A0F;
    public L8X A0G;
    public L8X A0H;
    public L8J A0I;
    public L8J A0J;
    public L8J A0K;
    public AtomicInteger A0L;
    public AtomicLong A0M;
    public AtomicLong A0N;
    public boolean A0O;
    public int[] A0P;
    public int[] A0Q;
    public final int A0R;
    public final C00i A0S;
    public final C00i A0T;
    public final C00i A0U;
    public final C00i A0V;
    public final boolean A0W;
    public final boolean A0X;

    public C1di() {
        1BQ r0 = new 1BQ(16385);
        this.A0U = r0;
        1BQ r02 = new 1BQ(84488);
        this.A0V = r02;
        this.A0T = new 1BQ(16511);
        this.A0S = new 1BQ(131353);
        this.A0O = true;
        this.A0R = (int) ((2yD) r0.get()).Auy(36592378334020303L);
        boolean AZl = ((2yD) r0.get()).AZl(36310903357638101L, false);
        this.A0X = AZl;
        boolean AZl2 = ((2yD) r0.get()).AZl(36310903357048274L, false);
        this.A0W = AZl2;
        if (AZl2) {
            this.A0I = new L8J((C0dr) r02.get());
            this.A0J = new L8J((C0dr) r02.get());
            this.A0K = new L8J((C0dr) r02.get());
            this.A03 = new C3Pq();
            int[] iArr = Kcp.A01;
            this.A0B = new L8X(iArr);
            this.A05 = new L8X(iArr);
            this.A0A = new L8X(iArr);
            this.A0H = new L8X(iArr);
            this.A0F = new L8X(iArr);
            this.A0G = new L8X(iArr);
            this.A0C = new L8X(iArr);
            this.A08 = new L8X(iArr);
            this.A0D = new L8X(iArr);
            this.A09 = new L8X(iArr);
            this.A06 = new L8X(iArr);
            this.A04 = new L8X(iArr);
            int[] iArr2 = Kcp.A00;
            this.A0E = new L8X(iArr2);
            this.A07 = new L8X(iArr2);
            this.A0L = new AtomicInteger();
            this.A0N = new AtomicLong(((C0dr) r02.get()).now());
            this.A0M = new AtomicLong();
            if (AZl) {
                this.A0P = new int[]{25952257, 44826634, 44826637, 44826636, 44826635};
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(X.C03b r301, X.C1di r302) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1di.A02(X.03b, X.1di):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C02S Au6() {
        if (!this.A0W) {
            return C02S.A03;
        }
        int[] iArr = this.A0Q;
        if (iArr == null) {
            int[] iArr2 = {44826629, 24444929, 44826629, 44826626, 44826627, 44826625, 3997722};
            if (this.A0X) {
                int[] iArr3 = {iArr2, this.A0P};
                int i = 0;
                for (int i2 = 0; i2 < 2; i2++) {
                    i += iArr3[i2].length;
                }
                iArr2 = new int[i];
                int i3 = 0;
                for (int i4 = 0; i4 < 2; i4++) {
                    Object[] objArr = iArr3[i4];
                    System.arraycopy(objArr, 0, iArr2, i3, objArr.length);
                    i3 += objArr.length;
                }
            }
            String[] split = 1BK.A0N(this.A0U).BCz(36873853310795989L, "").split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            int length = split.length;
            C2wd c2wd = new C2wd(length);
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 >= length) {
                    break;
                }
                String str = split[i6];
                if (!str.trim().isEmpty()) {
                    try {
                        c2wd.A00.A09(Integer.parseInt(str), c2wd);
                    } catch (NumberFormatException e) {
                        1BK.A09(this.A0T).softReport("StallImpactTracker", "Parse error for QPL ids", e);
                    }
                }
                i5 = i6 + 1;
            }
            for (int i7 : iArr2) {
                c2wd.A00.A09(i7, c2wd);
            }
            iArr = c2wd.A00();
            this.A0Q = iArr;
        }
        return new C02S(iArr, null);
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, X.3LB] */
    public void C5i(C03b c03b) {
        L8J l8j;
        3LB A00;
        ?? obj;
        int markerId = c03b.getMarkerId();
        int ArT = c03b.ArT();
        if (markerId == 3997722) {
            this.A0I.A03(false);
            this.A0K.A03(false);
            this.A0J.A03(false);
        } else if (markerId != 44826634) {
            switch (markerId) {
                case 44826625:
                    l8j = this.A0J;
                    l8j.A03(false);
                    break;
                case 44826626:
                    l8j = this.A0I;
                    l8j.A03(false);
                    break;
                case 44826627:
                    C3Pq c3Pq = this.A03;
                    do {
                        A00 = C3Pq.A00(c3Pq);
                        int[] iArr = A00.A01;
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            int length = iArr.length;
                            if (i2 >= length) {
                                break;
                            } else if (iArr[i2] != ArT) {
                                i = i2 + 1;
                            } else if (i2 < 0) {
                                break;
                            } else {
                                obj = new Object();
                                int i3 = length - 1;
                                int[] iArr2 = new int[i3];
                                System.arraycopy(iArr, 0, iArr2, 0, i3);
                                if (i2 < i3) {
                                    iArr2[i2] = iArr[i3];
                                }
                                ((3LB) obj).A01 = iArr2;
                                ((3LB) obj).A00 = A00.A00 + 1;
                            }
                        }
                    } while (!1MG.A00(c3Pq.A00, A00, (Object) obj));
            }
            A02(c03b, this);
        }
        this.A0M.set(0L);
        A02(c03b, this);
    }

    public String getName() {
        return "stall_tracker";
    }
}
