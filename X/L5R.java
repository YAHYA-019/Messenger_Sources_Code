package X;

import android.graphics.RectF;
import android.text.Layout;
import java.util.List;

/* loaded from: L5R.class */
public final class L5R {
    public final float A00;
    public final float A01;
    public final long A02;
    public final L7o A03;
    public final Ktn A04;
    public final List A05;

    public L5R(L7o l7o, Ktn ktn, long j) {
        float A04;
        this.A04 = ktn;
        this.A03 = l7o;
        this.A02 = j;
        List list = l7o.A04;
        this.A00 = list.isEmpty() ? 0.0f : ((Kth) 1BK.A0r(list)).A06.Ama();
        if (list.isEmpty()) {
            A04 = 0.0f;
        } else {
            Kth kth = (Kth) 0QD.A0F(list);
            LAI lai = kth.A06.A01;
            int i = lai.A05 - 1;
            A04 = lai.A06 + (lai.A07 != null ? lai.A04(i) - r0.ascent : lai.A09.getLineBaseline(i)) + kth.A01;
        }
        this.A01 = A04;
        this.A05 = l7o.A05;
    }

    public static final int A00(List list, int i) {
        int i2;
        int size = list.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 > size) {
                i2 = -(i3 + 1);
                break;
            }
            i2 = (i3 + size) >>> 1;
            Kth kth = (Kth) list.get(i2);
            if (kth.A05 <= i) {
                if (kth.A04 > i) {
                    break;
                }
                i3 = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return i2;
    }

    public final int A01(float f) {
        List list = this.A03.A04;
        int i = 0;
        if (f > 0.0f) {
            if (f < ((Kth) 0QD.A0F(list)).A00) {
                int size = list.size() - 1;
                int i2 = 0;
                while (true) {
                    if (i2 > size) {
                        i = -(i2 + 1);
                        break;
                    }
                    i = (i2 + size) >>> 1;
                    Kth kth = (Kth) list.get(i);
                    if (kth.A01 <= f) {
                        if (kth.A00 > f) {
                            break;
                        }
                        i2 = i + 1;
                    } else {
                        size = i - 1;
                    }
                }
            } else {
                i = JQy.A0I(list);
            }
        }
        Kth kth2 = (Kth) list.get(i);
        if (kth2.A04 - kth2.A05 == 0) {
            return kth2.A03;
        }
        LPk lPk = kth2.A06;
        float f2 = f - kth2.A01;
        LAI lai = lPk.A01;
        return lai.A09.getLineForVertical(((int) f2) - lai.A06) + kth2.A03;
    }

    public final int A02(int i) {
        L7o l7o = this.A03;
        Kth kth = (Kth) l7o.A04.get(i >= l7o.A03.A00.length() ? JQy.A0I(l7o.A04) : i < 0 ? 0 : A00(l7o.A04, i));
        LPk lPk = kth.A06;
        int i2 = kth.A05;
        return lPk.A01.A09.getLineForOffset(07C.A02(i, i2, kth.A04) - i2) + kth.A03;
    }

    public final int A03(int i) {
        Kth A00 = L7o.A00(this, i);
        LPk lPk = A00.A06;
        return lPk.A01.A09.getLineStart(i - A00.A03) + A00.A05;
    }

    public final L5L A04(int i) {
        float A01;
        float A012;
        L7o l7o = this.A03;
        if (i < 0 || i >= l7o.A03.A00.A00.length()) {
            throw JR1.A0l("offset(", ") is out of bounds [0, ", i, l7o.A03.A00.length());
        }
        List list = l7o.A04;
        Kth kth = (Kth) list.get(A00(list, i));
        LPk lPk = kth.A06;
        int i2 = kth.A05;
        int A02 = 07C.A02(i, i2, kth.A04) - i2;
        LPk lPk2 = lPk;
        if (A02 < 0 || A02 >= lPk2.A03.length()) {
            throw JR1.A0l("offset(", ") is out of bounds [0,", A02, lPk2.A03.length());
        }
        LAI lai = lPk2.A01;
        Layout layout = lai.A09;
        int lineForOffset = layout.getLineForOffset(A02);
        float A04 = lai.A04(lineForOffset);
        float A03 = lai.A03(lineForOffset);
        boolean A1Q = AnonymousClass001.A1Q(layout.getParagraphDirection(lineForOffset), 1);
        boolean isRtlCharAt = layout.isRtlCharAt(A02);
        if (A1Q) {
            if (isRtlCharAt) {
                A012 = LAI.A01(lai, A02, false);
                A01 = LAI.A01(lai, A02 + 1, true);
            } else {
                A01 = LAI.A00(lai, A02, false);
                A012 = LAI.A00(lai, A02 + 1, true);
            }
        } else if (isRtlCharAt) {
            A012 = LAI.A00(lai, A02, false);
            A01 = LAI.A00(lai, A02 + 1, true);
        } else {
            A01 = LAI.A01(lai, A02, false);
            A012 = LAI.A01(lai, A02 + 1, true);
        }
        RectF rectF = new RectF(A01, A04, A012, A03);
        return new L5L(rectF.left, rectF.top, rectF.right, rectF.bottom).A02(KvH.A00(0.0f, kth.A01));
    }

    public final LOR A05(int i, int i2) {
        L7o l7o = this.A03;
        if (i < 0 || i > i2 || i2 > l7o.A03.A00.A00.length()) {
            throw AnonymousClass001.A0L(0Pz.A0y("Start(", ") or End(", ") is out of range [0..", "), or start > end!", i, i2, l7o.A03.A00.A00.length()));
        }
        LOR A00 = LOR.A00();
        if (i != i2) {
            List list = l7o.A04;
            long A002 = KUx.A00(i, i2);
            int A0C = JQz.A0C(A002);
            int A0I = JR0.A0I(A002);
            int i3 = A0C;
            if (A0C > A0I) {
                i3 = A0I;
            }
            int size = list.size();
            for (int A003 = A00(list, i3); A003 < size; A003++) {
                Kth kth = (Kth) list.get(A003);
                int i4 = kth.A05;
                int i5 = A0I;
                if (A0C > A0I) {
                    i5 = A0C;
                }
                if (i4 >= i5) {
                    break;
                }
                if (kth.A05 != kth.A04) {
                    M3j.A00(A00, 1, kth, i2, i);
                }
            }
        }
        return A00;
    }

    public final Integer A06(int i) {
        L7o l7o = this.A03;
        if (i >= 0) {
            Lie lie = l7o.A03.A00;
            if (i <= lie.A00.length()) {
                int length = lie.length();
                List list = l7o.A04;
                Kth kth = (Kth) list.get(i == length ? JQy.A0I(list) : A00(list, i));
                LPk lPk = kth.A06;
                int i2 = kth.A05;
                int A02 = 07C.A02(i, i2, kth.A04) - i2;
                Layout layout = lPk.A01.A09;
                return layout.getParagraphDirection(layout.getLineForOffset(A02)) == 1 ? 0S2.A00 : 0S2.A01;
            }
        }
        throw AnonymousClass001.A0L(0Pz.A0b("offset(", ") is out of bounds [0, ", ']', i, l7o.A03.A00.length()));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof L5R)) {
                return false;
            }
            L5R l5r = (L5R) obj;
            if (!11T.A0O(this.A04, l5r.A04) || !11T.A0O(this.A03, l5r.A03) || this.A02 != l5r.A02 || this.A00 != l5r.A00 || this.A01 != l5r.A01 || !11T.A0O(this.A05, l5r.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A05, 1BL.A00(1BL.A00(AnonymousClass002.A02(this.A02, AnonymousClass002.A05(this.A03, 1BL.A03(this.A04))), this.A00), this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TextLayoutResult(layoutInput=");
        A0k.append(this.A04);
        A0k.append(", multiParagraph=");
        A0k.append(this.A03);
        A0k.append(", size=");
        long j = this.A02;
        A0k.append((Object) 0Pz.A0B(JQz.A0C(j), JR0.A0I(j), " x "));
        A0k.append(", firstBaseline=");
        A0k.append(this.A00);
        A0k.append(", lastBaseline=");
        A0k.append(this.A01);
        A0k.append(", placeholderRects=");
        return AnonymousClass002.A0K(this.A05, A0k);
    }
}
