package X;

/* loaded from: L5l.class */
public abstract /* synthetic */ class L5l {
    public static float A00(MNh mNh, long j) {
        if (LCI.A01(j) == 4294967296L) {
            return mNh.D4T(mNh.D4L(j));
        }
        throw AnonymousClass001.A0N("Only Sp can convert to Px");
    }

    public static int A01(MNh mNh, float f) {
        float D4T = mNh.D4T(f);
        return Float.isInfinite(D4T) ? (-1) >>> 1 : Math.round(D4T);
    }

    public static long A02(MNh mNh, long j) {
        if (j != 9205357640488583168L) {
            return KvJ.A00(mNh.D4T(DKH.A00(j)), mNh.D4T(JR1.A02(j)));
        }
        return 9205357640488583168L;
    }
}
