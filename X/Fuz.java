package X;

import java.security.GeneralSecurityException;
import java.security.Signature;

/* loaded from: Fuz.class */
public final class Fuz implements GIx {
    public final /* synthetic */ FvF A00;
    public final /* synthetic */ FGo A01;
    public final /* synthetic */ EvH A02;
    public final /* synthetic */ byte[] A03;

    public Fuz(FvF fvF, FGo fGo, EvH evH, byte[] bArr) {
        this.A00 = fvF;
        this.A01 = fGo;
        this.A03 = bArr;
        this.A02 = evH;
    }

    @Override // X.GIx
    public void BkH(Throwable th) {
        this.A02.A00((String) null, th);
    }

    @Override // X.GIx
    public void BkI(RMC rmc) {
        try {
            Signature signature = rmc.A02;
            if (signature == null) {
                signature = FHJ.A01(((DSM) this.A00.A01).A07, this.A01.A03);
            }
            byte[] bArr = this.A03;
            11T.A0F(signature, 0);
            this.A02.A00(EYI.A00(signature, bArr, true), (Throwable) null);
        } catch (GeneralSecurityException e) {
            this.A02.A00((String) null, e);
        } catch (Throwable th) {
            this.A02.A00((String) null, (Throwable) null);
            throw th;
        }
    }
}
