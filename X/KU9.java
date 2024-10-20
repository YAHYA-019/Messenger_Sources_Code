package X;

/* loaded from: KU9.class */
public abstract class KU9 {
    public static final void A00(MJL mjl, MLv mLv, Object obj, Object obj2, int i, int i2) {
        mLv.D2B(1439843069);
        int A0F = (i2 & 6) == 0 ? JR1.A0F(mLv, mjl) | i2 : i2;
        if ((i2 & 48) == 0) {
            A0F |= JR1.A0G(mLv, obj);
        }
        if ((i2 & 384) == 0) {
            int i3 = 128;
            if (mLv.AEg(i)) {
                i3 = 256;
            }
            A0F |= i3;
        }
        if ((i2 & 3072) == 0) {
            A0F |= JR1.A0I(mLv, obj2);
        }
        if ((A0F & 1171) == 1170 && mLv.BBC()) {
            mLv.D0o();
        } else {
            ((MHu) obj).A3Y(mLv, obj2, 9Al.A00(mLv, new AVV(i, 2, obj2, mjl), 980966366), 48);
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M78(mjl, obj, obj2, i, i2, 0);
        }
    }
}
