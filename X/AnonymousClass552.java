package X;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextUtils;

/* renamed from: X.552, reason: invalid class name */
/* loaded from: 552.class */
public final class AnonymousClass552 extends C1rj {
    public static final int A0U;
    public static final ColorStateList A0V;
    public static final Typeface A0W;
    public static final Typeface A0X;
    public static final 2K4 A0Y;
    public static final int[] A0Z;
    public static final int[] A0a = {R.attr.fontFamily};
    public static final int[][] A0b;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public ColorStateList A0K;
    public Typeface A0L;
    public Layout.Alignment A0M;
    public TextUtils.TruncateAt A0N;
    public 2KG A0O;
    public 2K4 A0P;
    public CharSequence A0Q;
    public CharSequence A0R;
    public boolean A0S;
    public boolean A0T;

    /* JADX WARN: Type inference failed for: r0v7, types: [int[], int[][]] */
    static {
        Typeface typeface = Typeface.DEFAULT;
        A0W = typeface;
        ?? r0 = {new int[]{0}};
        A0b = r0;
        int[] iArr = {-16777216};
        A0Z = iArr;
        A0V = new ColorStateList(r0, iArr);
        A0U = typeface.getStyle();
        A0X = typeface;
        A0Y = 2K4.A04;
    }

    public AnonymousClass552() {
        super("FigInternalText");
        this.A05 = 0;
        this.A07 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = -1;
        int i = (-1) >>> 1;
        this.A0B = i;
        this.A0C = i;
        this.A0D = -1;
        this.A0E = (-1) << (-1);
        this.A0F = 0;
        this.A0G = -7829368;
        this.A0T = true;
        this.A04 = 1.0f;
        this.A0K = A0V;
        this.A0H = 13;
        this.A0I = A0U;
        this.A0L = A0X;
        this.A0P = A0Y;
    }

    public final Object[] A0k() {
        Object[] objArr = new Object[44];
        2KG r0 = this.A0O;
        Integer valueOf = Integer.valueOf(this.A05);
        Float valueOf2 = Float.valueOf(0.0f);
        System.arraycopy(new Object[]{Float.valueOf(this.A02), Float.valueOf(this.A03), Boolean.valueOf(this.A0T), Float.valueOf(this.A04), null, this.A0R, this.A0M, 0, this.A0K, null, null, Integer.valueOf(this.A0H), Integer.valueOf(this.A0I), Integer.valueOf(this.A0J), null, this.A0L, this.A0P}, 1BK.A1W(new Object[]{false, r0, 0, valueOf, valueOf2, false, this.A0Q, false, this.A0N, Float.valueOf(this.A00), false, Integer.valueOf(this.A06), -1, -1, Integer.valueOf(this.A07), Boolean.valueOf(this.A0S), Integer.valueOf(this.A08), valueOf2, Integer.valueOf(this.A09), Integer.valueOf(this.A0A), Integer.valueOf(this.A0B), Integer.valueOf(this.A0C), Integer.valueOf(this.A0D), Integer.valueOf(this.A0E), Integer.valueOf(this.A0F), Integer.valueOf(this.A0G), Float.valueOf(this.A01)}, objArr) ? 1 : 0, objArr, 27, 17);
        return objArr;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C7g8 c7g8 = (C7g8) 4YU.A0P(r302);
        CharSequence charSequence = this.A0R;
        int i = this.A05;
        TextUtils.TruncateAt truncateAt = this.A0N;
        float f = this.A00;
        int i2 = this.A06;
        int i3 = this.A07;
        boolean z = this.A0S;
        int i4 = this.A08;
        int i5 = this.A09;
        int i6 = this.A0A;
        int i7 = this.A0B;
        int i8 = this.A0C;
        int i9 = this.A0D;
        int i10 = this.A0E;
        int i11 = this.A0F;
        int i12 = this.A0G;
        float f2 = this.A01;
        float f3 = this.A02;
        float f4 = this.A03;
        boolean z2 = this.A0T;
        float f5 = this.A04;
        Layout.Alignment alignment = this.A0M;
        2KG r0 = this.A0O;
        ColorStateList colorStateList = this.A0K;
        int i13 = this.A0H;
        int i14 = this.A0I;
        Typeface typeface = this.A0L;
        2K4 r02 = this.A0P;
        CharSequence charSequence2 = this.A0Q;
        int i15 = c7g8.A01;
        int i16 = c7g8.A00;
        C22a c22a = (C22a) 1Bi.A03(66067);
        if (!TextUtils.isEmpty(charSequence)) {
            charSequence = c22a.BdF(i13, charSequence);
        }
        3yF A0L = 2KZ.A0L(r302, 0);
        A0L.A3B(false);
        A0L.A2t(i);
        2KZ r03 = A0L.A01;
        r03.A00 = 0.0f;
        A0L.A3C(false);
        A0L.A36(truncateAt);
        r03.A01 = f;
        r03.A0A = i2;
        r03.A0B = -1;
        r03.A0C = -1;
        r03.A0D = i3;
        A0L.A3D(z);
        r03.A0E = i4;
        A0L.A2i(0.0f);
        r03.A0F = i5;
        r03.A0G = i6;
        A0L.A2u(i7);
        r03.A0I = i8;
        r03.A0J = i9;
        A0L.A2v(i10);
        r03.A0L = i11;
        A0L.A2w(i12);
        A0L.A2p(f4);
        A0L.A2l(f2);
        A0L.A2n(f3);
        A0L.A3E(z2);
        A0L.A2q(f5);
        r03.A0X = null;
        r03.A0a = null;
        A0L.A3A(charSequence);
        A0L.A35(alignment);
        A0L.A38(r0);
        A0L.A2x(0);
        r03.A0S = colorStateList;
        A0L.A37((2K8) null);
        A0L.A31(i13);
        A0L.A33(i14);
        A0L.A34(typeface);
        A0L.A39(r02);
        A0L.A2A(C26z.TOP, i15);
        A0L.A2A(C26z.BOTTOM, i16);
        r03.A0b = charSequence2;
        return A0L.A2W();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        A00.A03(1iF.class, new 1iF(361562789096680L));
        return A00;
    }

    @Override // X.C1rj
    public void A1E(1Iw r302) {
        66W A00 = 66W.A00();
        66W A002 = 66W.A00();
        66W A003 = 66W.A00();
        66W A004 = 66W.A00();
        66W A005 = 66W.A00();
        66W A006 = 66W.A00();
        66W A007 = 66W.A00();
        66W A008 = 66W.A00();
        66W A009 = 66W.A00();
        66W A0010 = 66W.A00();
        66W A0011 = 66W.A00();
        66W A0012 = 66W.A00();
        66W A0013 = 66W.A00();
        66W A0014 = 66W.A00();
        66W A0015 = 66W.A00();
        66W A0016 = 66W.A00();
        66W A0017 = 66W.A00();
        66W A0018 = 66W.A00();
        66W A0019 = 66W.A00();
        66W A0020 = 66W.A00();
        66W A0021 = 66W.A00();
        66W A0022 = 66W.A00();
        66W A0023 = 66W.A00();
        66W A0024 = 66W.A00();
        66W A0025 = 66W.A00();
        66W A0026 = 66W.A00();
        C6ok.A02(r302, A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, 66W.A00());
        A0014.A00 = -16751407;
        TypedArray A02 = r302.A02(0, A0a);
        String string = A02.getString(0);
        A02.recycle();
        Typeface A0027 = RWQ.A00(r302.A0D, string);
        Object obj = A00.A00;
        if (obj != null) {
            this.A0N = (TextUtils.TruncateAt) obj;
        }
        Object obj2 = A002.A00;
        if (obj2 != null) {
            this.A00 = ((Number) obj2).floatValue();
        }
        Object obj3 = A003.A00;
        if (obj3 != null) {
            this.A0T = AnonymousClass001.A1V(obj3);
        }
        Object obj4 = A004.A00;
        if (obj4 != null) {
            this.A04 = ((Number) obj4).floatValue();
        }
        Object obj5 = A005.A00;
        if (obj5 != null) {
            this.A0E = AnonymousClass001.A03(obj5);
        }
        Object obj6 = A006.A00;
        if (obj6 != null) {
            this.A0B = AnonymousClass001.A03(obj6);
        }
        Object obj7 = A007.A00;
        if (obj7 != null) {
            this.A0D = AnonymousClass001.A03(obj7);
        }
        Object obj8 = A008.A00;
        if (obj8 != null) {
            this.A0A = AnonymousClass001.A03(obj8);
        }
        Object obj9 = A009.A00;
        if (obj9 != null) {
            this.A0F = AnonymousClass001.A03(obj9);
        }
        Object obj10 = A0010.A00;
        if (obj10 != null) {
            this.A0C = AnonymousClass001.A03(obj10);
        }
        Object obj11 = A0011.A00;
        if (obj11 != null) {
            this.A0S = AnonymousClass001.A1V(obj11);
        }
        Object obj12 = A0012.A00;
        if (obj12 != null) {
            this.A0R = (CharSequence) obj12;
        }
        Object obj13 = A0013.A00;
        if (obj13 != null) {
            this.A0K = (ColorStateList) obj13;
        }
        Object obj14 = A0014.A00;
        if (obj14 != null) {
            this.A09 = AnonymousClass001.A03(obj14);
        }
        Object obj15 = A0015.A00;
        if (obj15 != null) {
            this.A06 = AnonymousClass001.A03(obj15);
        }
        Object obj16 = A0016.A00;
        if (obj16 != null) {
            this.A0H = AnonymousClass001.A03(obj16);
        }
        Object obj17 = A0017.A00;
        if (obj17 != null) {
            this.A0O = (2KG) obj17;
        }
        Object obj18 = A0018.A00;
        if (obj18 != null) {
            this.A05 = AnonymousClass001.A03(obj18);
        }
        Object obj19 = A0019.A00;
        if (obj19 != null) {
            this.A07 = AnonymousClass001.A03(obj19);
        }
        Object obj20 = A0020.A00;
        if (obj20 != null) {
            this.A08 = AnonymousClass001.A03(obj20);
        }
        Object obj21 = A0021.A00;
        if (obj21 != null) {
            this.A0I = AnonymousClass001.A03(obj21);
        }
        Object obj22 = A0022.A00;
        if (obj22 != null) {
            this.A03 = ((Number) obj22).floatValue();
        }
        Object obj23 = A0023.A00;
        if (obj23 != null) {
            this.A01 = ((Number) obj23).floatValue();
        }
        Object obj24 = A0024.A00;
        if (obj24 != null) {
            this.A02 = ((Number) obj24).floatValue();
        }
        Object obj25 = A0025.A00;
        if (obj25 != null) {
            this.A0G = AnonymousClass001.A03(obj25);
        }
        Object obj26 = A0026.A00;
        if (obj26 != null) {
            this.A0P = (2K4) obj26;
        }
        if (A0027 != null) {
            this.A0L = A0027;
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C7g8 c7g8 = (C7g8) r303;
        int i = this.A0J;
        int[] A00 = F3m.A00(this.A0L, this.A0H);
        int i2 = A00[2];
        Integer valueOf = Integer.valueOf(i - A00[1]);
        Integer valueOf2 = Integer.valueOf(-i2);
        c7g8.A01 = valueOf.intValue();
        c7g8.A00 = valueOf2.intValue();
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
