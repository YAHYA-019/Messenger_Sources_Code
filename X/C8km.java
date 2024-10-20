package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.litho.LithoView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8km, reason: invalid class name */
/* loaded from: 8km.class */
public final class C8km extends C1rj {
    public Drawable A00;
    public 6yQ A01;
    public 9MO A02;
    public AYp A03;
    public ImmutableList A04;
    public Set A05;
    public Function1 A06;
    public boolean A07;
    public boolean A08;

    public C8km() {
        super("ReactionsPickerCollectionComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A06, this.A03, this.A04, Boolean.valueOf(this.A07), this.A00, this.A02, this.A05, Boolean.valueOf(this.A08)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Drawable drawable = this.A00;
        boolean z = this.A07;
        final String A0C = r302.A0C();
        final 6yQ r0 = this.A01;
        Object obj = new Object(r0, A0C) { // from class: X.9b2
            public final 6yQ A00;
            public final String A01;

            {
                this.A01 = A0C;
                this.A00 = r0;
            }

            public boolean equals(Object obj2) {
                if (this != obj2) {
                    if (obj2 == null || !(obj2 instanceof C9b2)) {
                        return false;
                    }
                    C9b2 c9b2 = (C9b2) obj2;
                    if (!11T.A0O(this.A01, c9b2.A01)) {
                        return false;
                    }
                    6yQ r02 = this.A00;
                    6yQ r03 = c9b2.A00;
                    if (r02 != null) {
                        if (!r02.equals(r03)) {
                            return false;
                        }
                    } else if (r03 != null) {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode() {
                return 7zS.A04(this, this.A01, this.A00);
            }
        };
        8Be A0E = 7zL.A0E(r302, obj, A0C, 0);
        if (A0E == null) {
            6yQ r02 = this.A01;
            11T.A0F(r02, 1);
            Context A0A = 7zL.A0A(r302);
            A0E = new 8Be(A0A, 30.0f, r02.B9h(A0A), 0, 1);
            r302.A0I(obj, A0E, A0C, 0);
        }
        String A0C2 = r302.A0C();
        9aU r03 = new 9aU(A0C2);
        ColorStateList colorStateList = (ColorStateList) r302.A0B(r03, A0C2, 1);
        if (colorStateList == null) {
            colorStateList = new ColorStateList(7zS.A1b(), new int[]{-3355444});
            r302.A0I(r03, colorStateList, A0C2, 1);
        }
        final String A0C3 = r302.A0C();
        final 6yQ r04 = this.A01;
        Object obj2 = new Object(r04, A0C3) { // from class: X.9b3
            public final 6yQ A00;
            public final String A01;

            {
                this.A01 = A0C3;
                this.A00 = r04;
            }

            public boolean equals(Object obj3) {
                if (this != obj3) {
                    if (obj3 == null || !(obj3 instanceof C9b3)) {
                        return false;
                    }
                    C9b3 c9b3 = (C9b3) obj3;
                    if (!11T.A0O(this.A01, c9b3.A01)) {
                        return false;
                    }
                    6yQ r05 = this.A00;
                    6yQ r06 = c9b3.A00;
                    if (r05 != null) {
                        if (!r05.equals(r06)) {
                            return false;
                        }
                    } else if (r06 != null) {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode() {
                return 7zS.A04(this, this.A01, this.A00);
            }
        };
        ColorStateList colorStateList2 = (ColorStateList) r302.A0B(obj2, A0C3, 2);
        if (colorStateList2 == null) {
            6yQ r05 = this.A01;
            11T.A0F(r05, 1);
            colorStateList2 = new ColorStateList(7zS.A1b(), new int[]{r05.AjS(7zL.A0A(r302))});
            r302.A0I(obj2, colorStateList2, A0C3, 2);
        }
        11T.A0F(drawable, 1);
        8RT r06 = new 8RT(r302, new 8lA());
        2AW A0Y = 7zL.A0Y();
        8lA r307 = r06.A01;
        r307.A03 = A0Y.A0l();
        BitSet bitSet = r06.A02;
        bitSet.set(0);
        r307.A00 = 60;
        r307.A02 = drawable;
        bitSet.set(2);
        r307.A06 = 1LI.A0A(r302, C8km.class, "ReactionsPickerCollectionComponent", -143478346);
        r307.A05 = 7zL.A0Y().A0l();
        bitSet.set(3);
        r307.A04 = 7zL.A0Y().A0l();
        bitSet.set(1);
        C1rs.A02(bitSet, r06.A03);
        r06.A0J();
        if (z) {
            2cM A01 = 2cK.A01(r302, (String) null, 0);
            C1rq A012 = C1rg.A01(r302, null, 0);
            2lQ r07 = 2lO.A02;
            long A0A2 = 7zP.A0A();
            C5z7.A00(A012, 7zT.A0R(4YV.A0K((2lO) null, 0S2.A04, A0A2), 7zQ.A07(), 7zP.A08()));
            8OF A013 = 8oR.A01(r302);
            8oR r08 = A013.A01;
            r08.A06 = A0E;
            r08.A00 = 2132345291;
            1Im A09 = 1LI.A09(r302, C8km.class, "ReactionsPickerCollectionComponent", 1017201426);
            8oR r09 = A013.A01;
            r09.A09 = A09;
            r09.A04 = colorStateList;
            A013.A2W(new 8YN(0S2.A0J, 0S2.A0C, 0S2.A0Q));
            A013.A01.A0I = false;
            1Im A04 = 1LI.A04(r302, C8km.class, "ReactionsPickerCollectionComponent");
            8oR r010 = A013.A01;
            r010.A0A = A04;
            r010.A05 = colorStateList2;
            r010.A02 = 2131965570;
            A013.A0J();
            A012.A2f(A013.A01);
            A01.A2d(A012);
            r307 = 7zL.A0V(A01, r307);
        }
        return r307;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        BottomSheetBehavior bottomSheetBehavior;
        switch (r302.A01) {
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -143478346:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                1Iw r03 = r0.A00;
                9bP r04 = ((9M7) obj).A00;
                C8km c8km = (C8km) r02;
                6yQ r05 = c8km.A01;
                Function1 function1 = c8km.A06;
                AYp aYp = c8km.A03;
                Set set = c8km.A05;
                boolean z = c8km.A08;
                ImmutableList immutableList = c8km.A04;
                boolean A1X = 1BL.A1X(r03, r05);
                7zT.A1U(function1, aYp, set);
                4YV.A1M(immutableList, 6, r04);
                8RU r06 = new 8RU(r03, new C8ks());
                C8ks c8ks = r06.A01;
                c8ks.A00 = (int) (Resources.getSystem().getDisplayMetrics().heightPixels * 0.85d);
                BitSet bitSet = r06.A02;
                bitSet.set(0);
                7zL.A1K(r03);
                8qT r07 = new 8qT();
                r07.A00 = r04.A01;
                r07.A01 = r05;
                r07.A05 = function1;
                r07.A02 = aYp;
                r07.A04 = set;
                r07.A06 = z;
                r07.A03 = immutableList;
                c8ks.A02 = r07;
                bitSet.set(A1X ? 1 : 0);
                c8ks.A01 = r04.A02;
                bitSet.set(2);
                C1rs.A03(bitSet, r06.A03);
                r06.A0J();
                return c8ks;
            case 378110312:
                1Is r08 = r302.A00.A01;
                String str = ((C9Mz) obj).A01;
                9MO r09 = ((C8km) r08).A02;
                1BL.A1F(r09, str);
                C9lz c9lz = r09.A00;
                c9lz.A0B = true;
                LithoView lithoView = c9lz.A02;
                if (lithoView == null) {
                    11T.A0L("customEmojiPickerView");
                    throw 0Q8.createAndThrow();
                }
                String A13 = 4YU.A13(str);
                if (A13 == null) {
                    A13 = "";
                }
                c9lz.A03(lithoView, A13);
                return null;
            case 1017201426:
                1Is r010 = r302.A00.A01;
                boolean z2 = ((C5r6) obj).A01;
                9MO r011 = ((C8km) r010).A02;
                11T.A0F(r011, 1);
                if (!z2 || (bottomSheetBehavior = r011.A00.A05) == null) {
                    return null;
                }
                bottomSheetBehavior.A0B(3);
                return null;
            default:
                return null;
        }
    }
}
