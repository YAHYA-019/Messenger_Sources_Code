package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.emoji.model.Emoji;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.R;
import java.util.BitSet;

/* renamed from: X.8le, reason: invalid class name */
/* loaded from: 8le.class */
public final class C8le extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public FbUserSession A06;
    public 1LI A07;
    public 1LI A08;
    public ThreadKey A09;
    public 9OP A0A;
    public Emoji A0B;
    public 8JF A0C;
    public AYj A0D;
    public AZl A0E;
    public 7HC A0F;
    public ImmutableList A0G;
    public boolean A0H;
    public boolean A0I;

    public C8le() {
        super("EmojiCustomizationPickerComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A0C, this.A07, this.A0E, this.A03, this.A0D, this.A0G, Boolean.valueOf(this.A0H), this.A06, Integer.valueOf(this.A00), this.A0A, this.A04, Boolean.valueOf(this.A0I), this.A0F, Integer.valueOf(this.A01), this.A0B, this.A05, Integer.valueOf(this.A02), this.A09, this.A08};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8le c8le = (C8le) super.A0l();
        1LI r304 = null;
        c8le.A07 = 7zO.A0S(c8le.A07);
        1LI r0 = c8le.A08;
        if (r0 != null) {
            r304 = r0.A0l();
        }
        c8le.A08 = r304;
        return c8le;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r0 = this.A07;
        boolean z = this.A0H;
        int i = this.A01;
        boolean z2 = this.A0I;
        Drawable drawable = this.A04;
        1LI r309 = this.A08;
        final String A0C = r302.A0C();
        final int i2 = this.A00;
        Object obj = new Object(A0C, i2) { // from class: X.9at
            public final int A00;
            public final String A01;

            {
                this.A01 = A0C;
                this.A00 = i2;
            }

            public boolean equals(Object obj2) {
                if (this != obj2) {
                    if (obj2 == null || !(obj2 instanceof C9at)) {
                        return false;
                    }
                    C9at c9at = (C9at) obj2;
                    if (!11T.A0O(this.A01, c9at.A01) || this.A00 != c9at.A00) {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode() {
                return 7zS.A04(this, this.A01, Integer.valueOf(this.A00));
            }
        };
        ColorStateList colorStateList = (ColorStateList) r302.A0B(obj, A0C, 0);
        if (colorStateList == null) {
            colorStateList = new ColorStateList(7zS.A1b(), new int[]{this.A00});
            r302.A0I(obj, colorStateList, A0C, 0);
        }
        final String A0C2 = r302.A0C();
        final int i3 = this.A02;
        Object obj2 = new Object(A0C2, i3) { // from class: X.9au
            public final int A00;
            public final String A01;

            {
                this.A01 = A0C2;
                this.A00 = i3;
            }

            public boolean equals(Object obj3) {
                if (this != obj3) {
                    if (obj3 == null || !(obj3 instanceof C9au)) {
                        return false;
                    }
                    C9au c9au = (C9au) obj3;
                    if (!11T.A0O(this.A01, c9au.A01) || this.A00 != c9au.A00) {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode() {
                return 7zS.A04(this, this.A01, Integer.valueOf(this.A00));
            }
        };
        ColorStateList colorStateList2 = (ColorStateList) r302.A0B(obj2, A0C2, 1);
        if (colorStateList2 == null) {
            colorStateList2 = new ColorStateList(7zS.A1b(), new int[]{this.A02});
            r302.A0I(obj2, colorStateList2, A0C2, 1);
        }
        11T.A0F(r0, 1);
        1BL.A1G(drawable, r309);
        8RT r02 = new 8RT(r302, new 8lA());
        8lA r03 = r02.A01;
        r03.A03 = r0.A0l();
        BitSet bitSet = r02.A02;
        bitSet.set(0);
        r03.A02 = drawable;
        bitSet.set(2);
        r03.A06 = 1LI.A0A(r302, C8le.class, "EmojiCustomizationPickerComponent", -143478346);
        if (z) {
            2cM A0L = 7zN.A0L(r309, r302);
            C1rq A01 = C1rg.A01(r302, null, 0);
            2lQ r04 = 2lO.A02;
            C1qo c1qo = r302.A0E;
            C5z7.A00(A01, 7zT.A0R((2lO) null, 9221401712017801216L | c1qo.A06(2132279327), c1qo.A06(R.dimen.mapbox_four_dp) | 9221401712017801216L));
            8OF A012 = 8oR.A01(r302);
            8Be r05 = new 8Be(7zL.A0A(r302), 30.0f, i, 0, 1);
            8oR r06 = A012.A01;
            r06.A06 = r05;
            r06.A00 = 2132345291;
            r06.A04 = colorStateList;
            A012.A2W(new 8YN(0S2.A0J, 0S2.A0C, 0S2.A0Q));
            8oR r07 = A012.A01;
            r07.A0I = false;
            r07.A05 = colorStateList2;
            1Im A04 = 1LI.A04(r302, C8le.class, "EmojiCustomizationPickerComponent");
            8oR r08 = A012.A01;
            r08.A0A = A04;
            r08.A02 = 2131955404;
            A012.A0J();
            A01.A2f(A012.A01);
            7zL.A1I(A0L, A01);
            r309 = A0L.A00;
        }
        r03.A05 = 7zQ.A0T(r309);
        bitSet.set(3);
        r03.A04 = 7zL.A0Y().A0l();
        bitSet.set(1);
        if (z2) {
            r03.A00 = 60;
            r03.A01 = 2132279646;
        }
        C1rs.A02(bitSet, r02.A03);
        r02.A0J();
        return r03;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0380, code lost:
    
        if (r310 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0234  */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A15(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8le.A15(X.1Im, java.lang.Object):java.lang.Object");
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        8pU r0 = (8pU) r303;
        ImmutableList immutableList = this.A0G;
        11T.A0F(immutableList, 3);
        r0.A00 = immutableList;
        r0.A01 = "";
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
