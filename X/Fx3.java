package X;

import com.facebook.litho.ComponentTree;

/* loaded from: Fx3.class */
public final class Fx3 implements GJ4 {
    public FWq A00;
    public ComponentTree A01;
    public C2iw A02;

    @Override // X.GJ4
    public CharSequence BEo(DLQ dlq) {
        if (dlq == null) {
            throw AnonymousClass001.A0L("Receiving null BloksModel");
        }
        int i = dlq.A05;
        if (i != 13717) {
            if (i == 13732) {
                return 8oZ.A01(this.A02);
            }
            throw 0Pz.A04("Unsupported MDS input style id: ", i);
        }
        C2ko A0G = 1LI.A0G(this.A02, -33316469);
        if (A0G == null) {
            return null;
        }
        return (CharSequence) A0G.A00(new Object(), AnonymousClass001.A1Z());
    }

    @Override // X.GJ4
    public void CvF(DLQ dlq, CharSequence charSequence) {
        11T.A0F(charSequence, 1);
        if (dlq == null) {
            throw AnonymousClass001.A0L("Receiving null BloksModel");
        }
        int i = dlq.A05;
        if (i == 13447) {
            8oE.A01(this.A02, charSequence);
            return;
        }
        if (i == 13717) {
            8oX.A0L(this.A02, charSequence);
        } else if (i == 13732) {
            8oZ.A0M(this.A02, charSequence);
        } else {
            if (i != 13850) {
                throw 0Pz.A04("Unknown MDS input style id: ", i);
            }
            7zT.A1J(1LI.A0G(this.A02, 1490785800), charSequence);
        }
    }
}
