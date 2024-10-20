package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.Awg, reason: case insensitive filesystem */
/* loaded from: Awg.class */
public final class C1915Awg extends C1rs {
    public 1Iw A00;
    public C2026Azn A01;
    public final BitSet A02;
    public final String[] A03;

    public C1915Awg(1Iw r302, C2026Azn c2026Azn) {
        super(c2026Azn, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "text"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = c2026Azn;
        this.A00 = r302;
        A18.clear();
    }

    public static void A06(C1915Awg c1915Awg) {
        C1rs.A03(c1915Awg.A02, c1915Awg.A03);
        c1915Awg.A0J();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        A06(this);
        return this.A01;
    }

    public void A2W(int i) {
        this.A01.A00 = super.A02.A0B(i);
        this.A02.set(1);
    }

    public void A2X(int i) {
        this.A01.A03 = 7zL.A12(this, i);
        this.A02.set(2);
    }

    public void A2Y(MigColorScheme migColorScheme) {
        this.A01.A01 = migColorScheme;
        this.A02.set(0);
    }
}
