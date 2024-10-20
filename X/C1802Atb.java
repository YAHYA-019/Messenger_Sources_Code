package X;

import java.util.BitSet;

/* renamed from: X.Atb, reason: case insensitive filesystem */
/* loaded from: Atb.class */
public final class C1802Atb extends C1rs {
    public 1Iw A00;
    public C2023Azk A01;
    public final BitSet A02;
    public final String[] A03;

    public C1802Atb(1Iw r302, C2023Azk c2023Azk) {
        super(c2023Azk, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "hasLoginIdValidationError", "hasPasswordValidationError", "headerNumber", "headerTransparencyRenderedListener", "lastValidationError", "loginFieldEnabled", "loginStyle", "showRegistrationOption", "showSavePasswordOption", "stateContainer"};
        BitSet A18 = 1BK.A18(11);
        this.A02 = A18;
        this.A01 = c2023Azk;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A1A(this, this.A02, this.A03);
        return this.A01;
    }
}
