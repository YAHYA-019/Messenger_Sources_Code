package X;

/* loaded from: I6w.class */
public abstract class I6w {
    public static long A00;
    public static boolean A01;
    public static final Object A02 = AnonymousClass001.A0R();
    public static final Object A03 = AnonymousClass001.A0R();

    public static long A00(byte[] bArr, int i) {
        long A012 = A01(bArr, i);
        long A013 = A01(bArr, i + 4);
        if (A012 == 0 && A013 == 0) {
            return 0L;
        }
        return ((A012 - 2208988800L) * 1000) + ((A013 * 1000) / 4294967296L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [int] */
    /* JADX WARN: Type inference failed for: r0v50, types: [int] */
    /* JADX WARN: Type inference failed for: r0v54, types: [int] */
    /* JADX WARN: Type inference failed for: r0v58, types: [int] */
    public static long A01(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        if ((b & 128) == 128) {
            b = (b & Byte.MAX_VALUE) + 128;
        }
        if ((b2 & 128) == 128) {
            b2 = (b2 & Byte.MAX_VALUE) + 128;
        }
        if ((b3 & 128) == 128) {
            b3 = (b3 & Byte.MAX_VALUE) + 128;
        }
        if ((b4 & 128) == 128) {
            b4 = (b4 & Byte.MAX_VALUE) + 128;
        }
        return (b << 24) + (b2 << 16) + (b3 << 8) + b4;
    }
}
