package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8jr, reason: invalid class name */
/* loaded from: 8jr.class */
public final class C8jr extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public 2O4 A03;
    public FbUserSession A04;
    public C2kx A05;
    public C2kf A06;
    public 2YJ A07;
    public 9Wy A08;
    public C95a A09;
    public C9yk A0A;
    public Aa5 A0B;
    public MigColorScheme A0C;
    public java.util.Map A0D;

    public C8jr() {
        super("FriendsTabMontageComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A0C, this.A04, Integer.valueOf(this.A00), this.A07, this.A09, this.A0A, this.A0B, this.A03, this.A0D, this.A05, this.A06, this.A08, Integer.valueOf(this.A01), Integer.valueOf(this.A02)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String valueOf;
        Integer num;
        MigColorScheme migColorScheme = this.A0C;
        C95a c95a = this.A09;
        C9yk c9yk = this.A0A;
        2YJ r0 = this.A07;
        C2kx c2kx = this.A05;
        C2kf c2kf = this.A06;
        2O4 r02 = this.A03;
        int i = this.A02;
        int i2 = this.A01;
        int i3 = this.A00;
        java.util.Map map = this.A0D;
        Aa5 aa5 = this.A0B;
        9Wy r03 = this.A08;
        FbUserSession fbUserSession = this.A04;
        C2ki A00 = C2kV.A00(r302);
        A00.A2f(c2kf);
        7zL.A1K(r302);
        8qD r04 = new 8qD();
        r04.A08 = migColorScheme;
        r04.A05 = c95a;
        r04.A06 = c9yk;
        r04.A03 = r0;
        r04.A01 = i2;
        r04.A00 = i3;
        r04.A09 = map;
        r04.A07 = aa5;
        r04.A04 = r03;
        r04.A02 = fbUserSession;
        A00.A2d(r04);
        int AZc = migColorScheme.AZc();
        C2kV c2kV = A00.A01;
        c2kV.A05 = AZc;
        c2kV.A0Q = Integer.valueOf(migColorScheme.Abp());
        A00.A2e(c2kx);
        A00.A2Z(r02);
        boolean z = true;
        A00.A2h(true);
        C95a c95a2 = C95a.A02;
        boolean A1W = AnonymousClass001.A1W(c95a, c95a2);
        int i4 = 16 - i;
        if (c95a == c95a2) {
            z = false;
        }
        A00.A2j(z);
        float f = 0.0f;
        float f2 = 0.0f;
        if (A1W) {
            f2 = i4;
        }
        C1qo c1qo = ((C1rs) A00).A02;
        c2kV.A02 = c1qo.A02(f2);
        if (A1W) {
            f = i4;
        }
        c2kV.A06 = c1qo.A02(f);
        int ordinal = c95a.ordinal();
        if (ordinal != 1) {
            num = ordinal != 2 ? 0S2.A00 : 0S2.A01;
        } else {
            ImmutableList immutableList = c9yk.A02;
            if (immutableList.size() != 1 || !((MontageBucketPreview) immutableList.get(0)).A0A) {
                valueOf = String.valueOf(immutableList.size());
                A00.A2J(valueOf);
                return A00.A2W();
            }
            num = 0S2.A0C;
        }
        switch (num.intValue()) {
            case 0:
                valueOf = "FEED_LOADING";
                break;
            case 1:
                valueOf = "FEED_LOADED_NO_INVENTORY";
                break;
            default:
                valueOf = "FEED_LOADED_WITH_SELF_STORY";
                break;
        }
        A00.A2J(valueOf);
        return A00.A2W();
    }
}
