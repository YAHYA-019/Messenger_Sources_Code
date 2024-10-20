package X;

/* renamed from: X.4bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4bn.class */
public final class C04674bn extends AbstractC04694bp {
    public final /* synthetic */ 2HX A00;
    public final /* synthetic */ 4bS A01;

    public C04674bn(2HX r302, 4bS r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    @Override // X.InterfaceC04714br
    public boolean BTb(int i) {
        boolean z = false;
        if (i == 4) {
            z = true;
        }
        return z;
    }

    @Override // X.InterfaceC04714br
    public void CGM(int i, int i2, String str, java.util.Map map) {
        Integer num;
        if (i == 0) {
            num = 0S2.A0C;
        } else if (i == 2) {
            num = 0S2.A01;
        } else {
            if (i != 3) {
                throw 0Pz.A04("Unknown remove reason: ", i);
            }
            num = 0S2.A00;
        }
        4cJ A00 = 4cJ.A00();
        A00.A03 = num;
        2HX r0 = this.A00;
        if (r0 != null) {
            r0.Bwo(A00);
        }
    }
}
