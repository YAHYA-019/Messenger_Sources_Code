package X;

import com.google.common.base.Function;

/* loaded from: Imo.class */
public final /* synthetic */ class Imo implements Function {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 5V3 A01;
    public final /* synthetic */ HAo A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ byte[] A05;

    public /* synthetic */ Imo(5V3 r302, HAo hAo, Long l, byte[] bArr, long j, boolean z) {
        this.A01 = r302;
        this.A00 = j;
        this.A05 = bArr;
        this.A02 = hAo;
        this.A03 = l;
        this.A04 = z;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        5V3 r0 = this.A01;
        long j = this.A00;
        byte[] bArr = this.A05;
        HAo hAo = this.A02;
        Long l = this.A03;
        boolean z = this.A04;
        IFQ ifq = (IFQ) obj;
        C00j.A05("onMultiwayMessage.run", 478684621);
        try {
            r0.A0D.get();
            if (j < -99 || j > 500000) {
                j = -94;
            }
            ifq.A0E(hAo, l, bArr, j, z);
            C00j.A01(-1361374586);
            return null;
        } catch (Throwable th) {
            C00j.A01(-660413273);
            throw th;
        }
    }
}
