package X;

import android.graphics.drawable.Drawable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.composer.theme.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.Iterator;

/* renamed from: X.8qa, reason: invalid class name */
/* loaded from: 8qa.class */
public final class C8qa extends 2Yf {
    public int A00;
    public Drawable A01;
    public Drawable A02;
    public 9W4 A03;
    public ThreadKey A04;
    public C9a1 A05;
    public ThreadThemeInfo A06;
    public ImmutableList A07;

    public C8qa() {
        super("ThemeCustomizationPickerColorSection");
    }

    public void A0T(C1qb c1qb) {
        ThreadThemeInfo threadThemeInfo = this.A06;
        ImmutableList immutableList = this.A07;
        4YV.A1N(c1qb, immutableList);
        if (threadThemeInfo != null) {
            int i = 0;
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    C0s8.A18();
                    throw 0Q8.createAndThrow();
                }
                if (threadThemeInfo.A06 == ((ThreadThemeInfo) next).A06) {
                    2Yg.A0E(c1qb, i);
                    return;
                }
                i = i2;
            }
        }
    }

    public 2Ys A0d(C1qb c1qb) {
        ImmutableList immutableList = this.A07;
        9W4 r0 = this.A03;
        7zT.A1S(c1qb, immutableList, r0);
        2Yr A0l = 7zL.A0l();
        2hP A0I = 2hO.A0I(c1qb);
        A0I.A03();
        String A0D = c1qb.A0D(2131955416);
        A0I.A05(new 8cQ(r0.A0D, A0D, r0.A03, r0.A04, r0.A02, r0.A09));
        A0l.A00(A0I);
        7zQ.A1J(2Yg.A03(c1qb, C8qa.class, "ThemeCustomizationPickerColorSection"), A0l, 7zM.A0s(c1qb, immutableList));
        2Ys r02 = A0l.A00;
        11T.A0A(r02);
        return r02;
    }

    public Object A0e(1Im r302, Object obj) {
        if (r302.A01 != 1463818325) {
            return null;
        }
        1Iv r0 = r302.A00;
        C8qa c8qa = r0.A01;
        1Iw r02 = r0.A00;
        ThreadThemeInfo threadThemeInfo = (ThreadThemeInfo) ((C2i6) obj).A01;
        C8qa c8qa2 = c8qa;
        ThreadThemeInfo threadThemeInfo2 = c8qa2.A06;
        int i = c8qa2.A00;
        Drawable drawable = c8qa2.A01;
        Drawable drawable2 = c8qa2.A02;
        C9a1 c9a1 = c8qa2.A05;
        ThreadKey threadKey = c8qa2.A04;
        1BL.A11(0, r02, drawable, drawable2);
        4YV.A1M(c9a1, 5, threadThemeInfo);
        C2hj A0m = 7zL.A0m();
        8Sb r03 = new 8Sb(r02, new C8kr());
        8Rm r04 = new 8Rm(r02, new C8kx());
        boolean z = false;
        if (threadThemeInfo2 != null && threadThemeInfo2.A06 == threadThemeInfo.A06) {
            z = true;
        }
        C8kx c8kx = r04.A01;
        c8kx.A05 = z;
        BitSet bitSet = r04.A02;
        bitSet.set(0);
        c8kx.A00 = drawable;
        bitSet.set(1);
        c8kx.A01 = drawable2;
        bitSet.set(2);
        c8kx.A04 = threadThemeInfo;
        bitSet.set(5);
        c8kx.A03 = c9a1;
        bitSet.set(3);
        c8kx.A02 = threadKey;
        bitSet.set(4);
        7zP.A15(r04, bitSet, r04.A03);
        r03.A2W(c8kx);
        C8kr c8kr = r03.A01;
        c8kr.A00 = i;
        BitSet bitSet2 = r03.A02;
        bitSet2.set(1);
        C1rs.A00(bitSet2, r03.A03);
        r03.A0J();
        return 7zM.A0t(c8kr, A0m);
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qa c8qa = (C8qa) r302;
            ThreadThemeInfo threadThemeInfo = this.A06;
            ThreadThemeInfo threadThemeInfo2 = c8qa.A06;
            if (threadThemeInfo != null) {
                if (!threadThemeInfo.equals(threadThemeInfo2)) {
                    return false;
                }
            } else if (threadThemeInfo2 != null) {
                return false;
            }
            if (this.A00 != c8qa.A00) {
                return false;
            }
            Drawable drawable = this.A01;
            Drawable drawable2 = c8qa.A01;
            if (drawable != null) {
                if (!drawable.equals(drawable2)) {
                    return false;
                }
            } else if (drawable2 != null) {
                return false;
            }
            Drawable drawable3 = this.A02;
            Drawable drawable4 = c8qa.A02;
            if (drawable3 != null) {
                if (!drawable3.equals(drawable4)) {
                    return false;
                }
            } else if (drawable4 != null) {
                return false;
            }
            9W4 r0 = this.A03;
            9W4 r02 = c8qa.A03;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            C9a1 c9a1 = this.A05;
            C9a1 c9a12 = c8qa.A05;
            if (c9a1 != null) {
                if (!c9a1.equals(c9a12)) {
                    return false;
                }
            } else if (c9a12 != null) {
                return false;
            }
            ImmutableList immutableList = this.A07;
            ImmutableList immutableList2 = c8qa.A07;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
            ThreadKey threadKey = this.A04;
            ThreadKey threadKey2 = c8qa.A04;
            if (threadKey != null) {
                if (!threadKey.equals(threadKey2)) {
                    return false;
                }
            } else if (threadKey2 != null) {
                return false;
            }
        }
        return true;
    }
}
