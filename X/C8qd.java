package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.stickers.model.Sticker;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8qd, reason: invalid class name */
/* loaded from: 8qd.class */
public final class C8qd extends 2Yf {
    public View A00;
    public Fragment A01;
    public 1Im A02;
    public C6wd A03;
    public 6tM A04;
    public 96J A05;
    public C6qq A06;
    public 96D A07;
    public List A08;
    public Function1 A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public C8qd() {
        super("StickerPackSectionComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r0.isEmpty() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Q(X.C1qb r302) {
        /*
            r301 = this;
            r0 = r301
            java.util.List r0 = r0.A08
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r303
            if (r0 == 0) goto L1e
            r0 = r303
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L21
        L1e:
            r0 = 0
            r305 = r0
        L21:
            java.lang.Integer r0 = X.0S2.A0C
            r303 = r0
            r0 = r302
            r1 = r303
            r2 = 0
            r3 = r305
            X.2Yg.A0H(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8qd.A0Q(X.1qb):void");
    }

    public void A0T(C1qb c1qb) {
        boolean z = this.A0B;
        List list = this.A08;
        11T.A0F(c1qb, 0);
        if (list == null || list.isEmpty() || !z) {
            return;
        }
        2Yg.A0E(c1qb, 0);
    }

    public void A0Z(2Yy r302, C1qb c1qb, int i, int i2, int i3, long j, boolean z, boolean z2) {
        boolean z3 = this.A0B;
        List list = this.A08;
        11T.A0F(c1qb, 0);
        if (!z3 || z2 || list == null || list.isEmpty()) {
            return;
        }
        2Yg.A0E(c1qb, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (r0.isEmpty() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.2Ys A0d(X.C1qb r302) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8qd.A0d(X.1qb):X.2Ys");
    }

    public Object A0e(1Im r302, Object obj) {
        if (r302.A01 != 239257522) {
            return null;
        }
        C2i6 c2i6 = (C2i6) obj;
        1Iv r0 = r302.A00;
        C8qd c8qd = r0.A01;
        C1qb c1qb = (C1qb) r0.A00;
        Sticker sticker = (Sticker) c2i6.A01;
        int i = c2i6.A00;
        C8qd c8qd2 = c8qd;
        6tM r02 = c8qd2.A04;
        boolean z = c8qd2.A0C;
        96J r03 = c8qd2.A05;
        Fragment fragment = c8qd2.A01;
        View view = c8qd2.A00;
        C6wd c6wd = c8qd2.A03;
        C6qq c6qq = c8qd2.A06;
        1BK.A1J(c1qb, 0, r03);
        11T.A0F(sticker, 9);
        C2hj A0m = 7zL.A0m();
        8Tc A06 = 8Tc.A06(c1qb, sticker);
        C8o4 c8o4 = A06.A01;
        c8o4.A0D = z;
        c8o4.A0C = false;
        A06.A0E(sticker);
        c8o4.A05 = c1qb.A0J() == null ? null : ((C8qd) c1qb.A0J()).A02;
        c8o4.A09 = r03;
        c8o4.A03 = fragment;
        c8o4.A02 = view;
        c8o4.A0B = r03 == 96J.A07 ? 96D.A05 : r03 == 96J.A04 ? 96D.A02 : 96D.A08;
        c8o4.A06 = c6wd;
        c8o4.A08 = r02;
        A06.A2X(i);
        c8o4.A0A = c6qq;
        return 7zM.A0t(A06.A2W(), A0m);
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qd c8qd = (C8qd) r302;
            6tM r0 = this.A04;
            6tM r02 = c8qd.A04;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            Fragment fragment = this.A01;
            Fragment fragment2 = c8qd.A01;
            if (fragment != null) {
                if (!fragment.equals(fragment2)) {
                    return false;
                }
            } else if (fragment2 != null) {
                return false;
            }
            Function1 function1 = this.A09;
            Function1 function12 = c8qd.A09;
            if (function1 != null) {
                if (!function1.equals(function12)) {
                    return false;
                }
            } else if (function12 != null) {
                return false;
            }
            if (this.A0A != c8qd.A0A || this.A0B != c8qd.A0B) {
                return false;
            }
            C6wd c6wd = this.A03;
            C6wd c6wd2 = c8qd.A03;
            if (c6wd != null) {
                if (!c6wd.equals(c6wd2)) {
                    return false;
                }
            } else if (c6wd2 != null) {
                return false;
            }
            C6qq c6qq = this.A06;
            C6qq c6qq2 = c8qd.A06;
            if (c6qq != null) {
                if (!c6qq.equals(c6qq2)) {
                    return false;
                }
            } else if (c6qq2 != null) {
                return false;
            }
            96J r03 = this.A05;
            96J r04 = c8qd.A05;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            List list = this.A08;
            List list2 = c8qd.A08;
            if (list != null) {
                if (!list.equals(list2)) {
                    return false;
                }
            } else if (list2 != null) {
                return false;
            }
            if (this.A0C != c8qd.A0C) {
                return false;
            }
            96D r05 = this.A07;
            96D r06 = c8qd.A07;
            if (r05 != null) {
                if (!r05.equals(r06)) {
                    return false;
                }
            } else if (r06 != null) {
                return false;
            }
            View view = this.A00;
            View view2 = c8qd.A00;
            if (view != null) {
                if (!view.equals(view2)) {
                    return false;
                }
            } else if (view2 != null) {
                return false;
            }
        }
        return true;
    }
}
