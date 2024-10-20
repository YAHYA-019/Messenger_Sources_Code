package X;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.widget.ImageView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5Ay, reason: invalid class name */
/* loaded from: 5Ay.class */
public final class C5Ay extends C1rj {
    public static final Typeface A0J;
    public static final Typeface A0K;
    public static final Layout.Alignment A0L;
    public static final Layout.Alignment A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ColorStateList A06;
    public Typeface A07;
    public Typeface A08;
    public Drawable A09;
    public Layout.Alignment A0A;
    public Layout.Alignment A0B;
    public ImageView.ScaleType A0C;
    public 1LI A0D;
    public 1Im A0E;
    public CharSequence A0F;
    public CharSequence A0G;
    public Integer A0H;
    public List A0I;

    static {
        Typeface typeface = Typeface.DEFAULT;
        A0J = typeface;
        A0K = typeface;
        A0L = Layout.Alignment.ALIGN_NORMAL;
        A0M = Layout.Alignment.ALIGN_CENTER;
    }

    public C5Ay() {
        super("Button");
        this.A0I = Collections.emptyList();
        this.A00 = 16777215;
        this.A02 = -1;
        this.A03 = 1;
        this.A0A = A0M;
        this.A07 = A0K;
        this.A0B = A0L;
        this.A08 = A0J;
    }

    public static 7ZL A00(1Iw r301) {
        C5Ay c5Ay = new C5Ay();
        C1rs c1rs = new C1rs(c5Ay, r301, 0, 0);
        ((7ZL) c1rs).A00 = c5Ay;
        ((7ZL) c1rs).A01 = r301;
        return c1rs;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r311 == null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.5B3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.1LI A01(android.content.res.ColorStateList r301, android.graphics.Typeface r302, android.text.Layout.Alignment r303, X.1Iw r304, java.lang.CharSequence r305, int r306, int r307, int r308) {
        /*
            r0 = r304
            r309 = r0
            r0 = r304
            X.1LI r0 = r0.A02
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L21
            r0 = r310
            X.5Ay r0 = (X.C5Ay) r0
            r310 = r0
            r0 = r310
            X.1Im r0 = r0.A0E
            r311 = r0
            r0 = r311
            if (r0 != 0) goto L42
        L21:
            java.lang.Class<X.5Ay> r0 = X.C5Ay.class
            r312 = r0
            java.lang.Integer r0 = X.0S2.A00
            r313 = r0
            java.lang.String r0 = "Button"
            r314 = r0
            r0 = 1369209929(0x519c7c49, float:8.401251E10)
            r315 = r0
            r0 = r309
            r1 = r312
            r2 = r313
            r3 = r314
            r4 = 0
            r5 = r315
            X.1Im r0 = X.1LI.A02(r0, r1, r2, r3, r4, r5)
            r311 = r0
        L42:
            r0 = r305
            if (r0 != 0) goto L4b
            java.lang.String r0 = ""
            r305 = r0
        L4b:
            X.5B3 r0 = new X.5B3
            r310 = r0
            r0 = r310
            r0.<init>()
            r0 = r310
            r1 = r305
            r0.A06 = r1
            r0 = r310
            r1 = r306
            r0.A02 = r1
            r0 = r310
            r1 = r307
            r0.A01 = r1
            r0 = r310
            r1 = r302
            r0.A04 = r1
            r0 = r310
            r1 = r303
            r0.A05 = r1
            r0 = r310
            r1 = r301
            r0.A03 = r1
            r0 = r310
            r1 = r308
            r0.A00 = r1
            r0 = r311
            r1 = r310
            java.lang.Object r0 = r0.A00(r1)
            X.1rs r0 = (X.C1rs) r0
            r311 = r0
            r0 = r311
            if (r0 != 0) goto L96
            r0 = 0
            return r0
        L96:
            r0 = r311
            r0.A0H()
            r0 = r311
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.A0k(r1)
            r0 = r311
            X.1LI r0 = r0.A2V()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5Ay.A01(android.content.res.ColorStateList, android.graphics.Typeface, android.text.Layout$Alignment, X.1Iw, java.lang.CharSequence, int, int, int):X.1LI");
    }

    public final Object[] A0k() {
        return new Object[]{this.A0I, Integer.valueOf(this.A00), this.A06, 1BK.A0d(), Integer.valueOf(this.A01), this.A0D, this.A09, this.A0H, Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A0C, null, this.A0F, this.A0A, Integer.valueOf(this.A04), this.A07, this.A0G, this.A0B, Integer.valueOf(this.A05), this.A08};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C5Ay c5Ay = (C5Ay) super.A0l();
        c5Ay.A0D = 4YV.A0J(c5Ay.A0D);
        return c5Ay;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        StateListDrawable stateListDrawable;
        C2cq c2cq;
        Drawable drawable = this.A09;
        1LI r305 = this.A0D;
        CharSequence charSequence = this.A0G;
        CharSequence charSequence2 = this.A0F;
        int i = this.A03;
        int i2 = this.A00;
        Integer num = this.A0H;
        ColorStateList colorStateList = this.A06;
        int i3 = this.A02;
        Layout.Alignment alignment = this.A0B;
        Layout.Alignment alignment2 = this.A0A;
        int i4 = this.A05;
        int i5 = this.A04;
        Typeface typeface = this.A08;
        Typeface typeface2 = this.A07;
        int i6 = this.A01;
        ImageView.ScaleType scaleType = this.A0C;
        List list = this.A0I;
        if (list == null || list.isEmpty()) {
            stateListDrawable = null;
        } else {
            stateListDrawable = new StateListDrawable();
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                Ekz ekz = (Ekz) list.get(i7);
                stateListDrawable.addState(new int[]{ekz.A02}, new 8Bc(ekz.A01, 0, 15, ekz.A00, 0, false));
            }
        }
        if (drawable != null) {
            int intValue = num == null ? i2 : num.intValue();
            Drawable drawable2 = drawable;
            if (colorStateList != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable2 = constantState.newDrawable(4YU.A0E(r302)).mutate();
                }
                drawable2.setTintList(colorStateList);
            } else if (intValue != 16777215) {
                drawable2 = C1uu.A00(r302.A0D.getResources(), drawable, intValue);
            }
            c2cq = C2cp.A00(r302, 0);
            c2cq.A2a(drawable2);
            c2cq.A2b(scaleType);
            c2cq.A0k(0.0f);
            c2cq.A0H();
            if (i3 >= 0) {
                c2cq.A0C(i3);
                c2cq.A1L(i3);
            }
        } else if (r305 != null) {
            c2cq = C2dB.A00(r302);
            c2cq.A2X(r305);
        } else {
            c2cq = null;
        }
        1LI A01 = A01(colorStateList, typeface, alignment, r302, charSequence, i4, i, i2);
        if (i5 != 0) {
            i4 = i5;
        }
        1LI A012 = A01(colorStateList, typeface2, alignment2, r302, charSequence2, i4, 1, i2);
        if ((A01 != null || A012 != null) && c2cq != null) {
            c2cq.A2A(C26z.END, i6);
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(charSequence)) {
            C2cd.A07(charSequence, sb, true);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            C2cd.A07(charSequence2, sb, true);
        }
        C1rq A013 = C1rg.A01(r302, null, 0);
        A013.A0k(0.0f);
        A013.A2g(C1ro.FLEX_START);
        C1ro c1ro = C1ro.CENTER;
        A013.A2h(c1ro);
        A013.A2i(C1rp.CENTER);
        if (c2cq != null) {
            r305 = c2cq.A2V();
        }
        A013.A2f(r305);
        if (A012 != null) {
            2cM A014 = 2cK.A01(r302, (String) null, 0);
            A014.A2e(A01);
            2dD A00 = C2dB.A00(r302);
            A00.A2X(A012);
            A00.A17(2.0f);
            A014.A2e(A00.A2W());
            A014.A2g(c1ro);
            A014.A0H();
            A01 = A014.A00;
        }
        A013.A2f(A01);
        A013.A0D(stateListDrawable);
        A013.A0F((drawable == null || !TextUtils.isEmpty(charSequence)) ? "android.widget.Button" : "android.widget.ImageView");
        A013.A2Q(true);
        A013.A2S(sb.toString());
        A013.A0K();
        return A013.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        3yF r306 = null;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == 1369209929) {
            5B3 r0 = (5B3) obj;
            1Iw r02 = r302.A00.A00;
            CharSequence charSequence = r0.A06;
            int i2 = r0.A02;
            int i3 = r0.A01;
            Typeface typeface = r0.A04;
            Layout.Alignment alignment = r0.A05;
            ColorStateList colorStateList = r0.A03;
            int i4 = r0.A00;
            if (TextUtils.isEmpty(charSequence)) {
                r306 = null;
            } else {
                r306 = 2KZ.A0L(r02, 0);
                r306.A3C(false);
                r306.A3A(charSequence);
                r306.A31(i2);
                boolean z = true;
                if (i3 != 1) {
                    z = false;
                }
                r306.A3D(z);
                r306.A2u(i3);
                r306.A34(typeface);
                r306.A35(alignment);
                r306.A36(TextUtils.TruncateAt.END);
                r306.A3E(false);
                if (colorStateList != null) {
                    r306.A01.A0S = colorStateList;
                    return r306;
                }
                if (i4 != 16777215) {
                    r306.A2x(i4);
                    return r306;
                }
            }
        }
        return r306;
    }
}
