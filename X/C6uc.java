package X;

/* renamed from: X.6uc, reason: invalid class name */
/* loaded from: 6uc.class */
public final class C6uc implements C6ub {
    public final /* synthetic */ C6ub A00;
    public final /* synthetic */ 6tZ A01;

    public C6uc(C6ub c6ub, 6tZ r303) {
        this.A01 = r303;
        this.A00 = c6ub;
    }

    @Override // X.C6ub
    public 1LI CfM(1Iw r302, Object obj, Object obj2) {
        1LI CfM = this.A00.CfM(r302, obj, obj2);
        if (CfM == null) {
            return null;
        }
        return 6tZ.A01(CfM, r302, this.A01);
    }

    @Override // X.C6ub
    public 1LI CfZ(1Iw r302, Object obj) {
        1LI CfZ = this.A00.CfZ(r302, obj);
        if (CfZ == null) {
            return null;
        }
        return 6tZ.A01(CfZ, r302, this.A01);
    }
}
