package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.Awa, reason: case insensitive filesystem */
/* loaded from: Awa.class */
public final class C1909Awa extends C1rs {
    public 1Iw A00;
    public B0r A01;
    public final BitSet A02;
    public final String[] A03;

    public C1909Awa(1Iw r302, B0r b0r) {
        super(b0r, r302, 0, 0);
        this.A03 = new String[]{"buttonText", "colorScheme", "isButtonEnabled", "isTincanMode", "listener", "showTincan", "titleText"};
        BitSet A18 = 1BK.A18(7);
        this.A02 = A18;
        this.A01 = b0r;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public B0r A2V() {
        7zP.A16(this, this.A02, this.A03);
        return this.A01;
    }

    public void A2X() {
        this.A02.set(5);
    }

    public void A2Y(DI6 di6) {
        this.A01.A00 = di6;
        this.A02.set(4);
    }

    public void A2Z(MigColorScheme migColorScheme) {
        this.A01.A01 = migColorScheme;
        this.A02.set(1);
    }

    public void A2a(CharSequence charSequence) {
        this.A01.A03 = charSequence;
        this.A02.set(0);
    }

    public void A2b(CharSequence charSequence) {
        this.A01.A04 = charSequence;
        this.A02.set(6);
    }

    public void A2c(boolean z) {
        this.A01.A06 = z;
        this.A02.set(2);
    }

    public void A2d(boolean z) {
        this.A01.A07 = z;
        this.A02.set(3);
    }
}
