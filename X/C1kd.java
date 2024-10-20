package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1kd, reason: invalid class name */
/* loaded from: 1kd.class */
public abstract class C1kd {
    public static final C1kd[] A00 = {new C2zr(0), new C2zr(1), new C2zr(2), new C2zr(3), new C2zr(4), new C2zr(5), new C2zr(6), new C2zr(7)};

    /* JADX INFO: Fake field, exist only in values array */
    C1kd EF6;

    public C1kd(String str, int i) {
    }

    public static void A00(C1kk c1kk, C1kk c1kk2) {
        c1kk2.ClW(c1kk.AV1());
        C1kk B4Z = c1kk.B4Z();
        B4Z.Crf(c1kk2);
        c1kk2.CtK(B4Z);
        C1kk AzA = c1kk.AzA();
        c1kk2.Crf(AzA);
        AzA.CtK(c1kk2);
        2FK r0 = 2FK.A01;
        c1kk.Crf(r0);
        c1kk.CtK(r0);
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [X.1kk, X.3zN, X.2FJ] */
    public C1kk A01(C1kf c1kf, C1kk c1kk, Object obj, int i) {
        switch (((C2zr) this).A00) {
            case 0:
                return new 2FJ(c1kk, obj, i);
            case 1:
                ?? r0 = new 2FJ(c1kk, obj, i);
                r0.A02 = Long.MAX_VALUE;
                2FK r02 = 2FK.A01;
                r0.A00 = r02;
                r0.A01 = r02;
                return r0;
            case 2:
                2FJ r03 = new 2FJ(c1kk, obj, i);
                ((5Wv) r03).A02 = Long.MAX_VALUE;
                2FK r04 = 2FK.A01;
                ((5Wv) r03).A00 = r04;
                ((5Wv) r03).A01 = r04;
                return r03;
            case 3:
                2FJ r05 = new 2FJ(c1kk, obj, i);
                ((2FI) r05).A04 = Long.MAX_VALUE;
                2FK r06 = 2FK.A01;
                ((2FI) r05).A00 = r06;
                ((2FI) r05).A02 = r06;
                ((2FI) r05).A05 = Long.MAX_VALUE;
                ((2FI) r05).A01 = r06;
                ((2FI) r05).A03 = r06;
                return r05;
            case 4:
                return new C3jv(c1kk, obj, c1kf.keyReferenceQueue, i);
            case 5:
                C3jv c3jv = new C3jv(c1kk, obj, c1kf.keyReferenceQueue, i);
                ((3CO) c3jv).A02 = Long.MAX_VALUE;
                2FK r07 = 2FK.A01;
                ((3CO) c3jv).A00 = r07;
                ((3CO) c3jv).A01 = r07;
                return c3jv;
            case 6:
                C3jv c3jv2 = new C3jv(c1kk, obj, c1kf.keyReferenceQueue, i);
                ((3CP) c3jv2).A02 = Long.MAX_VALUE;
                2FK r08 = 2FK.A01;
                ((3CP) c3jv2).A00 = r08;
                ((3CP) c3jv2).A01 = r08;
                return c3jv2;
            default:
                C3jv c3jv3 = new C3jv(c1kk, obj, c1kf.keyReferenceQueue, i);
                ((3CQ) c3jv3).A04 = Long.MAX_VALUE;
                2FK r09 = 2FK.A01;
                ((3CQ) c3jv3).A00 = r09;
                ((3CQ) c3jv3).A02 = r09;
                ((3CQ) c3jv3).A05 = Long.MAX_VALUE;
                ((3CQ) c3jv3).A01 = r09;
                ((3CQ) c3jv3).A03 = r09;
                return c3jv3;
        }
    }
}
