package X;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.google.common.base.Platform;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: Dzf.class */
public final class Dzf extends C1rj {
    public static final int A0J;
    public static final Typeface A0K;
    public static final Layout.Alignment A0L;
    public static final Layout.Alignment[] A0M;
    public static final TextUtils.TruncateAt[] A0N;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public Typeface A0D;
    public Layout.Alignment A0E;
    public TextUtils.TruncateAt A0F;
    public GMA A0G;
    public GEw A0H;
    public boolean A0I;

    static {
        Typeface typeface = Typeface.DEFAULT;
        A0J = typeface.getStyle();
        A0K = typeface;
        A0L = Layout.Alignment.ALIGN_NORMAL;
        A0M = Layout.Alignment.values();
        A0N = TextUtils.TruncateAt.values();
    }

    public Dzf() {
        super("LinkableTextWithEntitiesComponent");
        this.A01 = (-1) >>> 1;
        this.A02 = (-1) << (-1);
        this.A0I = true;
        this.A00 = 1.0f;
        this.A0E = A0L;
        this.A07 = -16777216;
        this.A08 = -15460317;
        this.A09 = 0;
        this.A0A = 1;
        this.A0B = 13;
        this.A0C = A0J;
        this.A0D = A0K;
    }

    public static SpannableStringBuilder A00(Typeface typeface, CPc cPc, FGw fGw, GMA gma, GEw gEw, int i, int i2, int i3, boolean z) {
        QWO q0i;
        String A0i = ((2JY) gma).A0i();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0i);
        1Du it = gma.B5l().iterator();
        while (it.hasNext()) {
            2JX r0 = (2JX) it.next();
            try {
                Exv A01 = FAi.A01(r0, A0i);
                ArrayList A0s = AnonymousClass001.A0s();
                A0s.add(new ForegroundColorSpan(i));
                A0s.add(new AbsoluteSizeSpan(i2));
                Iterator A1D = DKC.A1D(new JXG(typeface, (String) null), A0s);
                while (A1D.hasNext()) {
                    Object next = A1D.next();
                    int i4 = A01.A01;
                    spannableStringBuilder.setSpan(next, i4, A01.A00 + i4, i3);
                }
                if (z) {
                    if (gEw != null) {
                        q0i = new Q0I(1BL.A0L(r0, -1298275357, 2012351341), gEw);
                    } else {
                        2JX A0L2 = 1BL.A0L(r0, -1298275357, 2012351341);
                        if (A0L2 != null) {
                            String A03 = fGw.A03(A0L2);
                            if (A03 == null) {
                                A03 = A0L2.A0m();
                                if (!Platform.stringIsNullOrEmpty(A03)) {
                                }
                            }
                            q0i = new QWO(cPc, A03, i);
                        }
                    }
                    int i5 = A01.A01;
                    spannableStringBuilder.setSpan(q0i, i5, A01.A00 + i5, i3);
                }
            } catch (ERd e) {
                0fH.A12("LinkableTextWithEntitiesComponentSpec", "Error processing text %s with offset %d and length %d", e, 1BK.A1a(A0i, DKG.A13(r0, -1019779949), r0.getIntValue(-1106363674)));
            }
        }
        return spannableStringBuilder;
    }

    public static QF7 A01(1Iw r301, int i) {
        return new QF7(r301, new Dzf(), i);
    }

    public final Object[] A0k() {
        return new Object[]{AnonymousClass001.A0K(), this.A0F, null, this.A0H, this.A0G, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A04), Integer.valueOf(this.A05), Integer.valueOf(this.A06), Boolean.valueOf(this.A0I), Float.valueOf(this.A00), this.A0E, Integer.valueOf(this.A07), Integer.valueOf(this.A08), Integer.valueOf(this.A09), Integer.valueOf(this.A0A), Integer.valueOf(this.A0B), Integer.valueOf(this.A0C), this.A0D};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2JY r0 = this.A0G;
        GEw gEw = this.A0H;
        TextUtils.TruncateAt truncateAt = this.A0F;
        boolean z = this.A0I;
        Layout.Alignment alignment = this.A0E;
        int i = this.A02;
        int i2 = this.A01;
        float f = this.A00;
        int i3 = this.A07;
        int i4 = this.A08;
        int i5 = this.A0C;
        int i6 = this.A0A;
        int i7 = this.A0B;
        int i8 = this.A09;
        Typeface typeface = this.A0D;
        int i9 = this.A06;
        int i10 = this.A04;
        int i11 = this.A05;
        int i12 = this.A03;
        CPc cPc = (CPc) 1Bi.A03(84955);
        FGw fGw = (FGw) 1Bi.A03(98494);
        r0.getClass();
        r0.A0i().getClass();
        if (i7 == 0) {
            i7 = 4YU.A0E(r302).getDimensionPixelSize(2132279323);
        }
        if (i8 == 0) {
            i8 = i7;
        }
        Typeface create = Typeface.create(typeface, i6);
        5Os A00 = 2KW.A00(r302, 0);
        2KW r02 = A00.A00;
        r02.A0Y = false;
        A00.A2f(A00(create, cPc, fGw, r0, gEw, i4, i8, 18, true));
        A00.A2e(truncateAt);
        r02.A0K = i7;
        r02.A0L = i5;
        A00.A2d(typeface);
        r02.A0O = alignment;
        r02.A0F = i;
        A00.A2Z(i2);
        A00.A2a(i3);
        r02.A05 = f;
        r02.A0b = z;
        r02.A02 = i10;
        r02.A03 = i11;
        r02.A04 = i9;
        r02.A0I = i12;
        r02.A0X = true;
        return A00.A2W();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        7zO.A1Q(A00, 262644498145293L);
        return A00;
    }

    @Override // X.C1rj
    public void A1E(1Iw r302) {
        TextUtils.TruncateAt truncateAt = null;
        Boolean bool = null;
        Float f = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Layout.Alignment alignment = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        TypedArray A02 = r302.A02(0, C53r.A04);
        int indexCount = A02.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = A02.getIndex(i);
            if (index == 0) {
                num5 = Integer.valueOf(A02.getDimensionPixelSize(index, 0));
            } else if (index == 5) {
                int integer = A02.getInteger(index, 0);
                if (integer > 0) {
                    truncateAt = A0N[integer - 1];
                }
            } else if (index == 25) {
                alignment = A0M[A02.getInteger(index, 0)];
            } else if (index == 15) {
                bool = Boolean.valueOf(A02.getBoolean(index, false));
            } else if (index == 11) {
                num2 = DKG.A10(A02, index, -1);
            } else if (index == 10) {
                num3 = DKG.A10(A02, index, -1);
            } else if (index == 3) {
                num4 = DKG.A12(A02, index, 0);
            } else if (index == 1) {
                num6 = DKG.A10(A02, index, 0);
            } else if (index == 21) {
                f = DKG.A0y(A02, index);
            } else if (index == 2) {
                num = DKG.A10(A02, index, 0);
            } else if (index == 17) {
                num8 = Integer.valueOf(A02.getInt(index, 0));
            } else if (index == 18) {
                num9 = Integer.valueOf(A02.getInt(index, 0));
            } else if (index == 19) {
                num7 = Integer.valueOf(A02.getInt(index, 0));
            } else if (index == 16) {
                num10 = DKG.A12(A02, index, 0);
            }
        }
        A02.recycle();
        if (truncateAt != null) {
            this.A0F = truncateAt;
        }
        if (bool != null) {
            this.A0I = bool.booleanValue();
        }
        if (f != null) {
            this.A00 = f.floatValue();
        }
        if (num != null) {
            this.A07 = num.intValue();
        }
        if (num2 != null) {
            this.A02 = num2.intValue();
        }
        if (num3 != null) {
            this.A01 = num3.intValue();
        }
        if (num4 != null) {
            this.A08 = num4.intValue();
        }
        if (num5 != null) {
            this.A0B = num5.intValue();
        }
        if (alignment != null) {
            this.A0E = alignment;
        }
        if (num6 != null) {
            this.A0C = num6.intValue();
        }
        if (num7 != null) {
            this.A06 = num7.intValue();
        }
        if (num8 != null) {
            this.A04 = num8.intValue();
        }
        if (num9 != null) {
            this.A05 = num9.intValue();
        }
        if (num10 != null) {
            this.A03 = num10.intValue();
        }
    }
}
