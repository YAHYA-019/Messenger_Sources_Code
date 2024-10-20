package X;

/* renamed from: X.9wx, reason: invalid class name */
/* loaded from: 9wx.class */
public final class C9wx implements AY2 {
    public final /* synthetic */ 8Gu A00;

    public C9wx(8Gu r302) {
        this.A00 = r302;
    }

    @Override // X.AY2
    public void BmC() {
        LEG leg = this.A00.A03;
        if (leg == null) {
            11T.A0L("surfaceHelper");
            throw 0Q8.createAndThrow();
        }
        leg.A0D();
    }
}
