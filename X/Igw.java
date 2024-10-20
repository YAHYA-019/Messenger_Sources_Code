package X;

import android.content.Context;

/* loaded from: Igw.class */
public final class Igw implements GIf {
    public Hgi A00 = new Object();
    public final GPG A01 = (GPG) 1Bn.A0A(116246);

    /* JADX WARN: Type inference failed for: r0v1, types: [X.HFJ, java.lang.Object] */
    @Override // X.GIf
    public HFJ AU6() {
        Integer num = 0S2.A01;
        ?? obj = new Object();
        ((HFJ) obj).A00 = 0S2.A00;
        ((HFJ) obj).A02 = num;
        ((HFJ) obj).A01 = num;
        ((HFJ) obj).A03 = num;
        return obj;
    }

    @Override // X.GIf
    public void D0N(Context context, FHC fhc, boolean z) {
        GPG gpg = this.A01;
        Hgi hgi = this.A00;
        gpg.A00 = hgi;
        if (hgi.A00 == 0) {
            int i = 2132608366;
            if (gpg.A01.ordinal() != 0) {
                i = 0;
            }
            hgi.A00 = i;
        }
        gpg.D0N(context, fhc, z);
    }
}
