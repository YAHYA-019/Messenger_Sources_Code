package X;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: Lbh.class */
public final class Lbh implements C6a9 {
    public final int A00;
    public final long A01 = 6aC.A03.getAndIncrement();
    public final 6DQ A02;
    public final C6aA A03;
    public final MG4 A04;
    public volatile Object A05;

    public Lbh(6D7 r302, 6DQ r303, MG4 mg4, int i) {
        this.A03 = new C6aA(r302);
        this.A02 = r303;
        this.A00 = i;
        this.A04 = mg4;
    }

    @Override // X.C6a9
    public final void AEC() {
    }

    @Override // X.C6a9
    public final void BYQ() {
        C6aA c6aA = this.A03;
        c6aA.A00 = 0L;
        InputStream kLy = new KLy(c6aA, this.A02);
        try {
            if (!((KLy) kLy).A00) {
                ((KLy) kLy).A03.CVO(((KLy) kLy).A04);
                ((KLy) kLy).A00 = true;
            }
            Uri BIM = c6aA.BIM();
            BIM.getClass();
            this.A05 = this.A04.CWe(BIM, kLy);
        } finally {
            try {
                kLy.close();
            } catch (IOException unused) {
            }
        }
    }
}
