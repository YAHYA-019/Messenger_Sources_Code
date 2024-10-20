package X;

import java.io.ByteArrayInputStream;

/* loaded from: D01.class */
public final class D01 implements DIF {
    public D10 A00;
    public final 29T A01 = new 29S();

    public boolean BSN() {
        return AnonymousClass001.A1T(this.A00);
    }

    public /* bridge */ /* synthetic */ Object CZS() {
        return this.A00;
    }

    public void CsP(String str, byte[] bArr) {
        29T r0 = this.A01;
        29X r02 = 29W.A02;
        2An B5O = r0.B5O(new 29W(new ByteArrayInputStream(bArr)));
        try {
            4Z3.A00(B5O);
            B5O.A0K();
            Long l = null;
            while (true) {
                C29Q A0E = B5O.A0E();
                byte b = A0E.A00;
                if (b == 0) {
                    B5O.A0M();
                    this.A00 = new D10(l);
                    return;
                } else if (A0E.A03 == 1 && b == 10) {
                    l = AbI.A13(B5O);
                } else {
                    C3P2.A00(B5O, b);
                }
            }
        } catch (2LA e) {
            0fH.A0s("TimeSyncMqttResponseProcessorCallback", "setPayload failed", e);
        }
    }
}
