package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.8eh, reason: invalid class name */
/* loaded from: 8eh.class */
public final class C8eh extends 1LH {
    public final FbUserSession A00;
    public final 2O4 A01;
    public final C2kx A02;
    public final C2kf A03;
    public final 8Kw A04;
    public final 9Wy A05;
    public final C9kr A06;
    public final 95Z A07;
    public final Aa6 A08;
    public final 8Kh A09;
    public final DJb A0A;
    public final C95p A0B;
    public final 8Kl A0C;
    public final MigColorScheme A0D;
    public final AZg A0E;
    public final ImmutableList A0F;
    public final boolean A0G;

    public C8eh(2O4 r302, FbUserSession fbUserSession, C2kx c2kx, C2kf c2kf, 8Kw r306, 9Wy r307, C9kr c9kr, 95Z r309, Aa6 aa6, 8Kh r311, DJb dJb, C95p c95p, 8Kl r314, MigColorScheme migColorScheme, AZg aZg, ImmutableList immutableList, boolean z) {
        7zT.A1W(migColorScheme, c95p, r309, r314);
        1BL.A1G(dJb, immutableList);
        7zS.A18(7, c9kr, c2kx, c2kf);
        11T.A0F(r307, 11);
        7zP.A1Q(r306, 12, fbUserSession);
        11T.A0F(r311, 16);
        11T.A0F(aa6, 17);
        this.A0D = migColorScheme;
        this.A0B = c95p;
        this.A07 = r309;
        this.A0C = r314;
        this.A0A = dJb;
        this.A0F = immutableList;
        this.A06 = c9kr;
        this.A02 = c2kx;
        this.A03 = c2kf;
        this.A01 = r302;
        this.A05 = r307;
        this.A04 = r306;
        this.A0G = z;
        this.A00 = fbUserSession;
        this.A0E = aZg;
        this.A09 = r311;
        this.A08 = aa6;
    }

    public 1LI A0s(C2k5 c2k5) {
        String str;
        String str2;
        Object[] A1b;
        String str3;
        1Iw A0X = 7zL.A0X(c2k5);
        C2ki A00 = C2kV.A00(A0X);
        A00.A2f(this.A03);
        7zL.A1K(A0X);
        8qG r0 = new 8qG();
        r0.A00 = this.A00;
        MigColorScheme migColorScheme = this.A0D;
        r0.A0A = migColorScheme;
        r0.A09 = this.A0C;
        r0.A07 = this.A0A;
        C95p c95p = this.A0B;
        r0.A08 = c95p;
        r0.A0B = this.A0E;
        95Z r02 = this.A07;
        r0.A04 = r02;
        ImmutableList immutableList = this.A0F;
        r0.A0C = immutableList;
        C9kr c9kr = this.A06;
        r0.A03 = c9kr;
        r0.A02 = this.A05;
        r0.A01 = this.A04;
        r0.A06 = this.A09;
        r0.A05 = this.A08;
        A00.A2d(r0);
        int AZc = migColorScheme.AZc();
        C2kV c2kV = A00.A01;
        c2kV.A05 = AZc;
        c2kV.A0Q = Integer.valueOf(migColorScheme.Abp());
        A00.A2e(this.A02);
        A00.A2Z(this.A01);
        A00.A2h(true);
        boolean z = this.A0G;
        A00.A2j(z);
        boolean A1b2 = 7zM.A1b(immutableList);
        int ordinal = r02.ordinal();
        switch ((ordinal != 1 ? ordinal != 2 ? 0S2.A00 : 0S2.A0N : A1b2 ? 0S2.A0C : 0S2.A01).intValue()) {
            case 0:
                str = "LOADING";
                break;
            case 1:
                str = "LOADED_NO_INVENTORY";
                break;
            case 2:
                str = "LOADED_WITH_INVENTORY";
                break;
            default:
                str = MessageAvailabilityResponseId$Companion.NOT_AVAILABLE;
                break;
        }
        int ordinal2 = c95p.ordinal();
        switch ((ordinal2 != 1 ? ordinal2 != 2 ? 0S2.A00 : 0S2.A01 : 0S2.A0C).intValue()) {
            case 0:
                str2 = "LOADING";
                break;
            case 1:
                str2 = "LOADED_NO_INVENTORY";
                break;
            default:
                str2 = "LOADED_WITH_INVENTORY";
                break;
        }
        A00.A2J(0Pz.A0W(str, str2));
        7zR.A1B(A00, new DDq(c2k5, this, 19));
        if (!z) {
            C2kV A2W = A00.A2W();
            11T.A0D(A2W);
            return A2W;
        }
        if (immutableList.isEmpty()) {
            A1b = new Object[]{3yH.A09(c2k5, 2131957062)};
            str3 = "%s";
        } else {
            A1b = AnonymousClass001.A1b(3yH.A09(c2k5, 2131957062), immutableList.size());
            str3 = "%s (%d)";
        }
        String A0w = 7zO.A0w(str3, A1b);
        11T.A0D(A0w);
        1Iw AeS = c2k5.AeS();
        ArrayList A0s = AnonymousClass001.A0s();
        11T.A0F(AeS, 1);
        C5yw A0b = 7zN.A0b(AeS, true);
        A0b.A2Y();
        C9zj.A04(A0b, c9kr, 17);
        A0b.A2f(A0w);
        A0b.A2i(false);
        A0b.A2b(migColorScheme);
        A0s.add(A0b.A2V());
        A0s.add(A00.A2W());
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0s, false);
    }
}
