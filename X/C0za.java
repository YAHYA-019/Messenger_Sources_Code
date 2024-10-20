package X;

/* renamed from: X.0za, reason: invalid class name */
/* loaded from: 0za.class */
public abstract class C0za {
    public static final long A00(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? (07C.A04(j, -4611686018427387903L, 4611686018427387903L) << 1) + 1 : (j * 1000000) << 1;
    }

    public static final long A01(0zY r301, int i) {
        long j = i;
        return r301.compareTo(0zY.A08) <= 0 ? 0zY.A07.timeUnit.convert(j, r301.timeUnit) << 1 : A02(r301, j);
    }

    public static final long A02(0zY r301, long j) {
        11T.A0F(r301, 1);
        0zY r0 = 0zY.A07;
        long convert = r301.timeUnit.convert(4611686018426999999L, r0.timeUnit);
        return ((-convert) > j || j > convert) ? (07C.A04(0zY.A05.timeUnit.convert(j, r301.timeUnit), -4611686018427387903L, 4611686018427387903L) << 1) + 1 : r0.timeUnit.convert(j, r301.timeUnit) << 1;
    }
}
