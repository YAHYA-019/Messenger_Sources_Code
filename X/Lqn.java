package X;

import androidx.work.impl.WorkDatabase;
import com.facebook.acra.constants.ActionId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: Lqn.class */
public final /* synthetic */ class Lqn implements Runnable {
    public static final String __redex_internal_original_name = "WorkerUpdater$$ExternalSyntheticLambda2";
    public final /* synthetic */ JRe A00;
    public final /* synthetic */ JRg A01;
    public final /* synthetic */ 4IU A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C00m A04;

    public /* synthetic */ Lqn(JRe jRe, JRg jRg, 4IU r304, String str, C00m c00m) {
        this.A02 = r304;
        this.A03 = str;
        this.A01 = jRg;
        this.A04 = c00m;
        this.A00 = jRe;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v188, types: [java.lang.UnsupportedOperationException] */
    /* JADX WARN: Type inference failed for: r0v508, types: [java.lang.UnsupportedOperationException] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        IllegalArgumentException th;
        C14o A1F;
        IllegalStateException A0N;
        4IU r0 = this.A02;
        String str2 = this.A03;
        JRg jRg = this.A01;
        C00m c00m = this.A04;
        JRe jRe = this.A00;
        7zR.A1O(jRg, c00m);
        WorkDatabase workDatabase = r0.A04;
        4JS A0E = workDatabase.A0E();
        ArrayList BKz = A0E.BKz(str2);
        if (BKz.size() <= 1) {
            KTU ktu = (KTU) 0QD.A0E(BKz);
            if (ktu != null) {
                String str3 = ktu.A01;
                C4Kf BKy = A0E.BKy(str3);
                if (BKy == null) {
                    A0N = AnonymousClass001.A0N(0Pz.A0z("WorkSpec with ", str3, ", that matches a name \"", str2, "\", wasn't found"));
                    jRg.A00(new C3101Jj8(A0N));
                }
                if (BKy.A06 == 0) {
                    str = "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.";
                } else {
                    if (ktu.A00 != C4Kb.CANCELLED) {
                        C4Kf c4Kf = jRe.A00;
                        C4Kb c4Kb = c4Kf.A0E;
                        String str4 = c4Kf.A0I;
                        String str5 = c4Kf.A0H;
                        C4Kc c4Kc = c4Kf.A0C;
                        C4Kc c4Kc2 = c4Kf.A0D;
                        long j = c4Kf.A05;
                        long j2 = c4Kf.A06;
                        long j3 = c4Kf.A04;
                        C4Ke c4Ke = c4Kf.A0B;
                        int i = c4Kf.A02;
                        Integer num = c4Kf.A0F;
                        long j4 = c4Kf.A03;
                        long j5 = c4Kf.A07;
                        long j6 = c4Kf.A08;
                        long j7 = c4Kf.A0A;
                        boolean z = c4Kf.A0J;
                        Integer num2 = c4Kf.A0G;
                        int i2 = c4Kf.A01;
                        int i3 = c4Kf.A0K;
                        long j8 = c4Kf.A09;
                        int i4 = c4Kf.A00;
                        int i5 = c4Kf.A0L;
                        11T.A0F(str3, 0);
                        11T.A0F(str5, 3);
                        11T.A0F(c4Kc, 4);
                        11T.A0F(c4Kc2, 5);
                        11T.A0F(c4Ke, 9);
                        C4Kf c4Kf2 = new C4Kf(c4Ke, c4Kc, c4Kc2, c4Kb, num, num2, str3, str4, str5, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, z);
                        try {
                            C4Ji c4Ji = r0.A03;
                            11T.A0A(c4Ji);
                            11T.A0A(r0.A02);
                            List list = r0.A07;
                            11T.A0A(list);
                            Set set = jRe.A01;
                            String str6 = c4Kf2.A0M;
                            C4Kf BKy2 = workDatabase.A0E().BKy(str6);
                            if (BKy2 != null) {
                                if (!BKy2.A0E.A00()) {
                                    try {
                                        if (AnonymousClass001.A1N((BKy2.A06 > 0L ? 1 : (BKy2.A06 == 0L ? 0 : -1))) ^ AnonymousClass001.A1N((c4Kf2.A06 > 0L ? 1 : (c4Kf2.A06 == 0L ? 0 : -1)))) {
                                            M6G m6g = M6G.A00;
                                            th = AnonymousClass001.A0q(0Pz.A0z("Can't update ", (String) m6g.invoke(BKy2), " Worker to ", (String) m6g.invoke(c4Kf2), " Worker. Update operation must preserve worker's type."));
                                        } else {
                                            boolean A05 = c4Ji.A05(str6);
                                            if (!A05) {
                                                Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    ((C4Jn) it.next()).ADz(str6);
                                                }
                                            }
                                            workDatabase.A07();
                                            4KU A0E2 = workDatabase.A0E();
                                            4JU A0F = workDatabase.A0F();
                                            C4Kb c4Kb2 = BKy2.A0E;
                                            int i6 = BKy2.A02;
                                            long j9 = BKy2.A07;
                                            int i7 = BKy2.A0K + 1;
                                            int i8 = BKy2.A01;
                                            long j10 = BKy2.A09;
                                            int i9 = BKy2.A00;
                                            String str7 = c4Kf2.A0I;
                                            String str8 = c4Kf2.A0H;
                                            C4Kc c4Kc3 = c4Kf2.A0C;
                                            C4Kc c4Kc4 = c4Kf2.A0D;
                                            long j11 = c4Kf2.A05;
                                            long j12 = c4Kf2.A06;
                                            long j13 = c4Kf2.A04;
                                            C4Ke c4Ke2 = c4Kf2.A0B;
                                            Integer num3 = c4Kf2.A0F;
                                            long j14 = c4Kf2.A03;
                                            long j15 = c4Kf2.A08;
                                            long j16 = c4Kf2.A0A;
                                            boolean z2 = c4Kf2.A0J;
                                            Integer num4 = c4Kf2.A0G;
                                            int i10 = c4Kf2.A0L;
                                            11T.A0F(str8, 3);
                                            11T.A0F(c4Kc3, 4);
                                            11T.A0F(c4Kc4, 5);
                                            11T.A0F(c4Ke2, 9);
                                            if (c4Kf2.A00 == 1) {
                                                j10 = c4Kf2.A09;
                                                i9++;
                                            }
                                            4KU r02 = A0E2;
                                            C4Il c4Il = r02.A02;
                                            c4Il.A06();
                                            c4Il.A07();
                                            try {
                                                C4P0 c4p0 = r02.A01;
                                                4KS A00 = c4p0.A00();
                                                try {
                                                    A00.ACG(1, str6);
                                                    A00.ACB(2, C4Ka.A00(c4Kb2));
                                                    A00.ACG(3, str7);
                                                    A00.ACG(4, str8);
                                                    byte[] A01 = C4Kc.A01(c4Kc3);
                                                    if (A01 == null) {
                                                        A00.ACC(5);
                                                    } else {
                                                        A00.AC5(5, A01);
                                                    }
                                                    byte[] A012 = C4Kc.A01(c4Kc4);
                                                    if (A012 == null) {
                                                        A00.ACC(6);
                                                    } else {
                                                        A00.AC5(6, A012);
                                                    }
                                                    A00.ACB(7, j11);
                                                    A00.ACB(8, j12);
                                                    A00.ACB(9, j13);
                                                    A00.ACB(10, i6);
                                                    int intValue = num3.intValue();
                                                    int i11 = 0;
                                                    if (intValue != 0) {
                                                        i11 = 1;
                                                        if (intValue != 1) {
                                                            A1F = 1BK.A1F();
                                                            throw A1F;
                                                        }
                                                    }
                                                    A00.ACB(11, i11);
                                                    A00.ACB(12, j14);
                                                    A00.ACB(13, j9);
                                                    A00.ACB(14, j15);
                                                    A00.ACB(15, j16);
                                                    A00.ACB(16, z2 ? 1L : 0L);
                                                    int intValue2 = num4.intValue();
                                                    int i12 = 0;
                                                    if (intValue2 != 0) {
                                                        i12 = 1;
                                                        if (intValue2 != 1) {
                                                            A1F = 1BK.A1F();
                                                            throw A1F;
                                                        }
                                                    }
                                                    A00.ACB(17, i12);
                                                    A00.ACB(18, i8);
                                                    A00.ACB(19, i7);
                                                    A00.ACB(20, j10);
                                                    A00.ACB(21, i9);
                                                    A00.ACB(22, i10);
                                                    A00.ACB(23, C4Ka.A01(c4Ke2.A02));
                                                    A00.ACB(24, c4Ke2.A05 ? 1L : 0L);
                                                    A00.ACB(25, c4Ke2.A06 ? 1L : 0L);
                                                    A00.ACB(26, c4Ke2.A04 ? 1L : 0L);
                                                    A00.ACB(27, c4Ke2.A07 ? 1L : 0L);
                                                    A00.ACB(28, c4Ke2.A01);
                                                    A00.ACB(29, c4Ke2.A00);
                                                    A00.AC5(30, C4Ka.A07(c4Ke2.A03));
                                                    A00.ACG(31, str6);
                                                    A00.ARM();
                                                    c4Il.A08();
                                                    C4Il.A01(c4Il);
                                                    C4Ko c4Ko = (C4Ko) A0F;
                                                    C4Il c4Il2 = c4Ko.A01;
                                                    c4Il2.A06();
                                                    4KB r03 = c4Ko.A02;
                                                    4KS A002 = r03.A00();
                                                    A002.ACG(1, str6);
                                                    c4Il2.A07();
                                                    try {
                                                        A002.ARM();
                                                        c4Il2.A08();
                                                        C4Il.A01(c4Il2);
                                                        r03.A02(A002);
                                                        A0F.BPj(str6, set);
                                                        if (!A05) {
                                                            A0E2.Bcd(str6, -1);
                                                            workDatabase.A0D().AMb(str6);
                                                        }
                                                        workDatabase.A08();
                                                        C4Il.A01(workDatabase);
                                                        if (!A05) {
                                                            4KZ.A00(workDatabase, list);
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        C4Il.A01(c4Il2);
                                                        r03.A02(A002);
                                                        throw th;
                                                    }
                                                } finally {
                                                    c4p0.A02(A00);
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                C4Il.A01(c4Il);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        C4Il.A01(workDatabase);
                                    }
                                }
                                jRg.A00(JRi.A01);
                                return;
                            }
                            th = 1BL.A0f("Worker with ", str6, 7zK.A00(ActionId.HEADER_DATA_LOADED));
                            throw th;
                        } catch (Throwable th5) {
                            jRg.A00(new C3101Jj8(th5));
                            return;
                        }
                    }
                    A0E.AMb(str3);
                }
            }
            c00m.invoke();
            return;
        }
        str = "Can't apply UPDATE policy to the chains of work.";
        A0N = AnonymousClass001.A0q(str);
        jRg.A00(new C3101Jj8(A0N));
    }
}
