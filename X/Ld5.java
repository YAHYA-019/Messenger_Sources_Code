package X;

/* loaded from: Ld5.class */
public final class Ld5 implements MIv {
    public final MIv[] A00;

    public Ld5(MIv... mIvArr) {
        this.A00 = mIvArr;
    }

    @Override // X.MIv
    public final MCw DCI(Class cls) {
        int i = 0;
        do {
            MIv mIv = this.A00[i];
            if (mIv.DCT(cls)) {
                return mIv.DCI(cls);
            }
            i++;
        } while (i < 2);
        throw AnonymousClass001.A0q("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // X.MIv
    public final boolean DCT(Class cls) {
        boolean z = false;
        int i = 0;
        while (true) {
            if (!this.A00[i].DCT(cls)) {
                i++;
                if (i >= 2) {
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        return z;
    }
}
