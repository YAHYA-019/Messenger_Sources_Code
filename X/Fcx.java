package X;

import android.os.Handler;
import java.util.List;

/* loaded from: Fcx.class */
public final class Fcx implements MIM {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ FHh A01;
    public final /* synthetic */ GJj A02;
    public final /* synthetic */ GJj A03;

    public Fcx(Handler handler, FHh fHh, GJj gJj, GJj gJj2) {
        this.A00 = handler;
        this.A03 = gJj;
        this.A01 = fHh;
        this.A02 = gJj2;
    }

    @Override // X.MIM
    public void Bxl(String str, Throwable th, List list) {
        0fH.A0j("BloksPlayIntegrityAttestation", AnonymousClass001.A0Z(th, "Play Integrity Attestation failed with exception: ", AnonymousClass001.A0k()));
        1BL.A1I(list, "Play Integrity Attestation failed with error codes: ", "BloksPlayIntegrityAttestation", AnonymousClass001.A0k());
        this.A00.post(new G1i(this.A01, this.A02));
    }

    @Override // X.MIM
    public void COr(String str, String str2, List list) {
        11T.A0F(str, 0);
        0fH.A0j("BloksPlayIntegrityAttestation", 0Pz.A0W("Play Integrity Attestation succeeded with token: ", str));
        this.A00.post(new G3S(this.A01, this.A03, str));
    }
}
