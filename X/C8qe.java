package X;

import android.graphics.drawable.Drawable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.ui.emoji.model.Emoji;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8qe, reason: invalid class name */
/* loaded from: 8qe.class */
public final class C8qe extends 2Yf {
    public int A00;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public FbUserSession A04;
    public 2Yf A05;
    public Emoji A06;
    public AYg A07;
    public 8JF A08;
    public String A09;
    public boolean A0A;

    public C8qe() {
        super("QuickReactionsPickerSectionWithAvatar");
    }

    public void A0T(C1qb c1qb) {
        11T.A0F(c1qb, 0);
        2Yg.A0E(c1qb, 1);
    }

    public void A0X(2Yv r302, 2Yv r303) {
        8pS r0 = (8pS) r302;
        8pS r02 = (8pS) r303;
        r02.A01 = r0.A01;
        r02.A00 = r0.A00;
    }

    public void A0a(C1qb c1qb) {
        8pS r0 = ((2Yf) this).A03;
        Emoji emoji = this.A06;
        8JF r02 = this.A08;
        FbUserSession fbUserSession = this.A04;
        7zS.A16(0, c1qb, r02, fbUserSession);
        C0ty c0ty = C0ty.A00;
        C9h2.A00(fbUserSession, r02.A00, new A4r(1Bq.A00(46), c1qb, emoji, r02), c0ty);
        r0.A00 = c0ty;
        r0.A01 = true;
    }

    public 2Ys A0d(C1qb c1qb) {
        8pS r0 = ((2Yf) this).A03;
        AYg aYg = this.A07;
        int i = this.A00;
        Drawable drawable = this.A03;
        Drawable drawable2 = this.A02;
        int i2 = this.A01;
        2Yf r02 = this.A05;
        boolean z = this.A0A;
        String str = this.A09;
        List list = r0.A00;
        boolean z2 = r0.A01;
        11T.A0F(c1qb, 0);
        1BL.A11(1, aYg, drawable, drawable2);
        7zS.A18(6, r02, str, list);
        2Yr A0l = 7zL.A0l();
        if (z2) {
            int i3 = 1;
            do {
                2hP A0I = 2hO.A0I(c1qb);
                8TN A00 = C8m2.A00(c1qb);
                A00.A2X();
                C9gg.A00(C9hj.A04, A00, i3);
                2lQ r03 = 2lO.A02;
                7zS.A1M(A00, 7zT.A0I((2lO) null, 6.0d), 0S2.A00, C1ro.CENTER, 0);
                A00.A0C(i);
                A00.A1L(i);
                A0I.A05(A00.A2W());
                A0I.A01.A04 = Integer.valueOf(i2);
                A0l.A01(A0I.A02());
                i3++;
            } while (i3 < 13);
        } else if (1BK.A1Y(list)) {
            if (!str.equals("")) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object obj : list) {
                    8Nz r04 = (8Nz) obj;
                    if (11T.A0O(r04.sticker.emoji.A07(), str) || 0CU.A0T(r04.sticker.label, str, false)) {
                        A0s.add(obj);
                    }
                }
                list = A0s;
            }
            if (1BK.A1Y(list)) {
                8qR r05 = new 8qR();
                r05.A03 = aYg;
                r05.A01 = drawable;
                r05.A02 = drawable2;
                r05.A04 = list;
                r05.A00 = i2;
                A0l.A01(r05);
            }
        }
        if (!z) {
            2hP A0I2 = 2hO.A0I(c1qb);
            3yF A0L = 2KZ.A0L(c1qb, 0);
            A0L.A3A(c1qb.A0D(2131956392));
            A0L.A2x(-7829368);
            2lQ r06 = 2lO.A02;
            7zS.A1K(A0L, (2lO) null, 0S2.A04, 7zQ.A0B());
            A0I2.A05(A0L.A2W());
            A0I2.A03();
            A0l.A01(A0I2.A02());
        }
        return 7zO.A0Y(A0l, r02);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yf A0g(boolean z) {
        C8qe c8qe = (C8qe) super.A0g(z);
        2Yf r0 = c8qe.A05;
        c8qe.A05 = r0 != null ? r0.A0g(false) : null;
        if (!z) {
            ((2Yf) c8qe).A03 = new Object();
        }
        return c8qe;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qe c8qe = (C8qe) r302;
            8JF r0 = this.A08;
            8JF r02 = c8qe.A08;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            2Yf r03 = this.A05;
            if (r03 != null) {
                if (!r03.A0i(c8qe.A05, r03.A0B)) {
                    return false;
                }
            } else if (c8qe.A05 != null) {
                return false;
            }
            FbUserSession fbUserSession = this.A04;
            FbUserSession fbUserSession2 = c8qe.A04;
            if (fbUserSession != null) {
                if (!fbUserSession.equals(fbUserSession2)) {
                    return false;
                }
            } else if (fbUserSession2 != null) {
                return false;
            }
            if (this.A00 != c8qe.A00) {
                return false;
            }
            AYg aYg = this.A07;
            AYg aYg2 = c8qe.A07;
            if (aYg != null) {
                if (!aYg.equals(aYg2)) {
                    return false;
                }
            } else if (aYg2 != null) {
                return false;
            }
            Drawable drawable = this.A02;
            Drawable drawable2 = c8qe.A02;
            if (drawable != null) {
                if (!drawable.equals(drawable2)) {
                    return false;
                }
            } else if (drawable2 != null) {
                return false;
            }
            if (this.A0A != c8qe.A0A) {
                return false;
            }
            String str = this.A09;
            String str2 = c8qe.A09;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            Emoji emoji = this.A06;
            Emoji emoji2 = c8qe.A06;
            if (emoji != null) {
                if (!emoji.equals(emoji2)) {
                    return false;
                }
            } else if (emoji2 != null) {
                return false;
            }
            Drawable drawable3 = this.A03;
            Drawable drawable4 = c8qe.A03;
            if (drawable3 != null) {
                if (!drawable3.equals(drawable4)) {
                    return false;
                }
            } else if (drawable4 != null) {
                return false;
            }
            if (this.A01 != c8qe.A01) {
                return false;
            }
        }
        return true;
    }
}
