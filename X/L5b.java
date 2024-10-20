package X;

/* loaded from: L5b.class */
public abstract class L5b {
    public static final LMp A00(MLv mLv) {
        boolean z = true;
        Object[] objArr = new Object[0];
        MHv mHv = LMp.A08;
        if (!mLv.AEg(0)) {
            z = false;
        }
        Object CdA = mLv.CdA();
        if (z || CdA == Ky6.A00) {
            CdA = new C00q(0);
            LNS.A0S(mLv, CdA);
        }
        return (LMp) KUM.A00(mLv, mHv, (C00m) CdA, objArr, 0, 4);
    }

    public static final MLj A01(LMp lMp, MLj mLj) {
        return mLj.D4B(new C2948JeH(KZo.A00, new M8w(lMp, false)));
    }

    public static final MLj A02(LMp lMp, MLj mLj) {
        return mLj.D4B(new C2948JeH(KZo.A00, new M8w(lMp, true)));
    }
}
