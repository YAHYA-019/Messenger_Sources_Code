package X;

import java.util.ArrayList;

/* loaded from: Fha.class */
public final class Fha implements 1Ro {
    public static final String __redex_internal_original_name = "FbW3CGraphApi$createDemaskMethod$1";
    public final /* synthetic */ FvL A00;
    public final /* synthetic */ String A01;

    public Fha(FvL fvL, String str) {
        this.A00 = fvL;
        this.A01 = str;
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        boolean z;
        8Lu r0 = (8Lu) obj;
        11T.A0F(r0, 0);
        FvL fvL = this.A00;
        Qme A03 = fvL.A03(this.A01);
        DqF dqF = (DqF) r0.A00;
        String str = dqF.A01;
        String str2 = dqF.A04;
        ArrayList A01 = FvL.A01(fvL);
        FvL.A02("device_key_pub", A03.A00(), A01);
        F9p f9p = (F9p) r0.A01;
        FvL.A02("encryption_key_pub", f9p.A00(), A01);
        byte[] encoded = f9p.A01.getPublic().getEncoded();
        11T.A0A(encoded);
        FvL.A02("encryption_key_signature", A03.A02(encoded), A01);
        if (str2 != null) {
            FvL.A02("csc_token", str, A01);
            FvL.A02("platform_trust_token", str2, A01);
            z = false;
        } else {
            z = true;
            FvL.A02("csc", str, A01);
        }
        String A04 = ((1Oe) 1Br.A0B(fvL.A04)).A04(C1fe.A11);
        if (A04 != null) {
            FvL.A02("family_device_id", A04, A01);
        }
        return EVQ.A00("autofill", dqF.A02, A01, z);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        24X A01;
        24X A0D;
        String A0H;
        F9p f9p;
        8Lu r0 = (8Lu) obj;
        return (anonymousClass439 == null || (A01 = anonymousClass439.A01()) == null || (A0D = A01.A0D("encrypted_card_number")) == null || (A0H = A0D.A0H()) == null || r0 == null || (f9p = (F9p) r0.A01) == null) ? "" : f9p.A01(A0H);
    }
}
