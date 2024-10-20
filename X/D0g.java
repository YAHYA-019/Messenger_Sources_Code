package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;

/* loaded from: D0g.class */
public final class D0g implements C54k {
    public final C00i A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;

    public D0g(FbUserSession fbUserSession) {
        1MV A09 = AbF.A09(fbUserSession, 99269);
        1MV r0 = new 1MV(fbUserSession, 99268);
        1MV r02 = new 1MV(fbUserSession, 99262);
        1MV r03 = new 1MV(fbUserSession, 99253);
        1MV r04 = new 1MV(fbUserSession, 85113);
        1MV r05 = new 1MV(fbUserSession, 85130);
        1MV r06 = new 1MV(fbUserSession, 85129);
        this.A01 = new 1MV(fbUserSession, 99261);
        this.A03 = r05;
        this.A07 = r02;
        this.A06 = r03;
        this.A04 = r04;
        this.A00 = r0;
        this.A05 = A09;
        this.A02 = r06;
    }

    @Override // X.C54k
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public D0c AoX(BI6 bi6) {
        C00i c00i;
        int i = bi6.setField_;
        switch (i) {
            case 1:
                c00i = this.A01;
                break;
            case 2:
                c00i = this.A07;
                break;
            case 3:
            case 4:
            case 5:
                c00i = this.A03;
                break;
            case 6:
                c00i = this.A06;
                break;
            case 7:
            case 8:
                c00i = this.A04;
                break;
            case 9:
                c00i = this.A02;
                break;
            case 10:
                c00i = this.A00;
                break;
            case 11:
                c00i = this.A05;
                break;
            default:
                throw AnonymousClass001.A0T(StringFormatUtil.formatStrLocaleSafe("Unsupported payment delta type: %s", Integer.valueOf(i)));
        }
        return (D0c) c00i.get();
    }

    @Override // X.C54k
    public /* bridge */ /* synthetic */ String AhK(Object obj) {
        BPD A00 = BPD.A00(((D0w) obj).setField_);
        if (A00 == null) {
            return null;
        }
        return A00.name();
    }
}
