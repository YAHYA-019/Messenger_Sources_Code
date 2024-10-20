package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.BitSet;

/* loaded from: Dub.class */
public final class Dub extends C1rs {
    public DzO A00;
    public 1Iw A01;
    public final BitSet A02;
    public final String[] A03;

    public Dub(DzO dzO, 1Iw r303) {
        super(dzO, r303, 0, 0);
        this.A03 = new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A00 = dzO;
        this.A01 = r303;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ C1rs A2T(1Im r302) {
        A2a(r302);
        return this;
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public DzO A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A00;
    }

    public void A2X(int i) {
        this.A00.A01 = super.A02.A0B(i);
    }

    public void A2Y(int i) {
        this.A00.A03 = super.A02.A0D(i);
    }

    public void A2Z(int i) {
        this.A00.A00 = i;
        this.A02.set(0);
    }

    public void A2a(1Im r302) {
        this.A00.A02 = r302;
    }
}
