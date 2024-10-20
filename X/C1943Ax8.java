package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Ax8, reason: case insensitive filesystem */
/* loaded from: Ax8.class */
public final class C1943Ax8 extends 1LH {
    public final BlB A00;
    public final MigColorScheme A01;
    public final String A02;

    public C1943Ax8(BlB blB, MigColorScheme migColorScheme, String str) {
        11T.A0F(migColorScheme, 1);
        this.A01 = migColorScheme;
        this.A00 = blB;
        this.A02 = str;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2sn A0U = 7zQ.A0U(c2k5.A05);
        1Iw AeS = A0U.AeS();
        String A0w = 7zT.A0w(AeS.A0D, A0U, 2131955971);
        8Ll r0 = new 8Ll(C1u3.A2c, (CharSequence) null, 3yH.A09(A0U, 2131955969), (String) null, 10);
        C1u3 c1u3 = C1u3.A1n;
        String str = this.A02;
        8NK r02 = new 8NK(new 8Lf(CZD.A00(this, 100), CZD.A00(this, ActionId.ON_VIEW_CREATED_END), AbJ.A1A(3yH.A09(A0U, 2131955967)), 3yH.A09(A0U, 2131955978)), (1LI) null, (9Di) null, A0w, (CharSequence) null, (CharSequence) null, 0, 0, C0s8.A14(r0, new 8Ll(c1u3, (CharSequence) null, str == null ? 3yH.A09(A0U, 2131955976) : 3yH.A0A(A0U, str, 2131955970), (String) null, 10)), true, true);
        8Tn A00 = C8nn.A00(AeS);
        A00.A2a(this.A01);
        A00.A2Z(r02);
        A00.A2X();
        A0U.A00(A00.A2W());
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false);
    }
}
