package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.87o, reason: invalid class name */
/* loaded from: 87o.class */
public final class C87o extends C1rs {
    public 1Iw A00;
    public C87n A01;
    public final BitSet A02;
    public final String[] A03;

    public C87o(1Iw r302, C87n c87n) {
        super(c87n, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "profileUri"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = c87n;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C87n A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(MigColorScheme migColorScheme) {
        this.A01.A01 = migColorScheme;
        this.A02.set(0);
    }

    public void A2Y(CharSequence charSequence) {
        this.A01.A03 = charSequence;
        this.A02.set(1);
    }

    public void A2Z(String str) {
        this.A01.A04 = str;
        this.A02.set(2);
    }
}
