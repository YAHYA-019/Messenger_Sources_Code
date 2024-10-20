package X;

import java.util.Random;

/* renamed from: X.07y, reason: invalid class name */
/* loaded from: 07y.class */
public abstract class C07y {
    public static final C07z A00 = new Object();
    public static final C07y A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.07z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.07y] */
    static {
        Integer num = AnonymousClass080.A00;
        A01 = (num == null || num.intValue() >= 34) ? new Object() : new AnonymousClass082() { // from class: X.081
            public final AnonymousClass083 A00 = new ThreadLocal() { // from class: X.083
                @Override // java.lang.ThreadLocal
                public /* bridge */ /* synthetic */ Object initialValue() {
                    return new Random();
                }
            };

            @Override // X.AnonymousClass082
            public Random A0C() {
                Object obj = get();
                11T.A0A(obj);
                return (Random) obj;
            }
        };
    }

    public abstract double A00();

    public double A01(double d, double d2) {
        double A002;
        if (d2 <= d) {
            Double valueOf = Double.valueOf(d);
            Double valueOf2 = Double.valueOf(d2);
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Random range is empty: [");
            A0k.append(valueOf);
            AnonymousClass001.A1H(A0k);
            A0k.append(valueOf2);
            throw AnonymousClass001.A0L(AnonymousClass001.A0d(").", A0k));
        }
        double d3 = d2 - d;
        if (!Double.isInfinite(d3) || Double.isInfinite(d) || Double.isNaN(d) || Double.isInfinite(d2) || Double.isNaN(d2)) {
            A002 = d + (A00() * d3);
        } else {
            double A003 = A00() * ((d2 / 2.0d) - (d / 2.0d));
            A002 = d + A003 + A003;
        }
        if (A002 >= d2) {
            A002 = Math.nextAfter(d2, (-1.0d) / 0.0d);
        }
        return A002;
    }

    public abstract float A02();

    public abstract int A03();

    public abstract int A04(int i);

    public abstract int A05(int i);

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (((-r0) & r0) == r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        r0 = A03() >>> 1;
        r307 = r0 % r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (((r0 - r307) + (r0 - 1)) < 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A06(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07y.A06(int, int):int");
    }

    public abstract long A07();

    public long A08(long j) {
        return A09(0L, 1000L);
    }

    public long A09(long j, long j2) {
        long A07;
        long j3;
        int A03;
        if (j2 <= j) {
            Long valueOf = Long.valueOf(j);
            Long valueOf2 = Long.valueOf(j2);
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Random range is empty: [");
            A0k.append(valueOf);
            AnonymousClass001.A1H(A0k);
            A0k.append(valueOf2);
            throw AnonymousClass001.A0L(AnonymousClass001.A0d(").", A0k));
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    A03 = A04(31 - Integer.numberOfLeadingZeros(i));
                } else {
                    if (i2 != 1) {
                        j3 = (A04(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (A03() & 4294967295L);
                        return j + j3;
                    }
                    A03 = A03();
                }
                j3 = A03 & 4294967295L;
                return j + j3;
            }
            do {
                A07 = A07() >>> 1;
                j3 = A07 % j4;
            } while ((A07 - j3) + (j4 - 1) < 0);
            return j + j3;
        }
        while (true) {
            long A072 = A07();
            if (j <= A072 && A072 < j2) {
                return A072;
            }
        }
    }

    public abstract boolean A0A();

    public abstract byte[] A0B(byte[] bArr);
}
