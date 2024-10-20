package X;

import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ih.class */
public final class C06974ih extends C06984ii {
    public static C06974ih A0Q;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final ColorFilter A05;
    public final PointF A06;
    public final PointF A07;
    public final Drawable A08;
    public final Drawable A09;
    public final Drawable A0A;
    public final Drawable A0B;
    public final Drawable A0C;
    public final InterfaceC07034in A0D;
    public final InterfaceC07034in A0E;
    public final InterfaceC07034in A0F;
    public final InterfaceC06244gU A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    static {
        C07004ik c07004ik = new C07004ik();
        InterfaceC07034in interfaceC07034in = InterfaceC07034in.A02;
        c07004ik.A0E = interfaceC07034in;
        c07004ik.A0F = interfaceC07034in;
        c07004ik.A0D = interfaceC07034in;
        ((AbstractC07024im) c07004ik).A00 = 2rC.A02;
        A0Q = new C06974ih(c07004ik);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06974ih(C07004ik c07004ik) {
        super(c07004ik);
        11T.A0F(c07004ik, 1);
        this.A0I = c07004ik.A0I;
        this.A03 = c07004ik.A03;
        this.A0B = c07004ik.A0B;
        this.A0E = c07004ik.A0E;
        this.A07 = c07004ik.A07;
        this.A0P = c07004ik.A0O;
        this.A04 = c07004ik.A04;
        this.A0C = c07004ik.A0C;
        this.A0F = c07004ik.A0F;
        this.A0H = c07004ik.A0H;
        this.A00 = c07004ik.A00;
        this.A0D = c07004ik.A0D;
        this.A06 = c07004ik.A06;
        this.A09 = c07004ik.A09;
        this.A0M = c07004ik.A0L;
        this.A05 = c07004ik.A05;
        this.A02 = c07004ik.A02;
        this.A0A = c07004ik.A0A;
        this.A08 = c07004ik.A08;
        this.A0L = c07004ik.A0P;
        this.A01 = c07004ik.A01;
        this.A0J = c07004ik.A0J;
        this.A0K = c07004ik.A0K;
        this.A0G = c07004ik.A0G;
        this.A0N = c07004ik.A0M;
        this.A0O = c07004ik.A0N;
    }

    @Override // X.C06984ii
    public C46q A02() {
        C46q A02 = super.A02();
        C46q.A00(A02, this.A0I, "placeholderColor");
        A02.A01("placeholderRes", this.A03);
        C46q.A00(A02, this.A0B, "placeholderDrawable");
        C46q.A00(A02, this.A0E, "placeholderScaleType");
        C46q.A00(A02, this.A07, "placeholderFocusPoint");
        A02.A02("placeholderApplyRoundingOptions", this.A0P);
        A02.A01("progressRes", this.A04);
        C46q.A00(A02, this.A0C, "progressDrawable");
        C46q.A00(A02, this.A0F, "progressScaleType");
        C46q.A00(A02, this.A0H, "errorColor");
        A02.A01("errorRes", this.A00);
        C46q.A00(A02, this.A0D, "errorScaleType");
        C46q.A00(A02, this.A06, "errorFocusPoint");
        C46q.A00(A02, this.A09, "errorDrawable");
        A02.A02("errorApplyRoundingOptions", this.A0M);
        C46q.A00(A02, this.A05, "actualImageColorFilter");
        A02.A01("overlayRes", this.A02);
        C46q.A00(A02, this.A0A, "overlayDrawable");
        C46q.A00(A02, this.A08, "backgroundDrawable");
        A02.A02("resizeToViewport", this.A0L);
        A02.A02("autoPlay", this.A0J);
        A02.A02("autoStop", this.A0K);
        A02.A02("mPerfMediaRemountInstrumentationFix", false);
        A02.A01("fadeDurationMs", this.A01);
        C46q.A00(A02, this.A0G, "customDrawableFactory");
        return A02;
    }

    @Override // X.C06984ii
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !11T.A0O(getClass(), obj.getClass())) {
            return false;
        }
        C06974ih c06974ih = (C06974ih) obj;
        if (!11T.A0O(this.A0I, c06974ih.A0I) || this.A03 != c06974ih.A03 || !C2qv.A01(this.A0B, c06974ih.A0B) || !C2qv.A01(this.A0E, c06974ih.A0E) || !C2qv.A01(this.A07, c06974ih.A07) || this.A0P != c06974ih.A0P || !11T.A0O(this.A0H, c06974ih.A0H) || this.A00 != c06974ih.A00 || !C2qv.A01(this.A0D, c06974ih.A0D) || !C2qv.A01(this.A06, c06974ih.A06) || this.A0M != c06974ih.A0M || this.A02 != c06974ih.A02 || !C2qv.A01(this.A0A, c06974ih.A0A)) {
            return false;
        }
        Drawable drawable = this.A09;
        Drawable drawable2 = c06974ih.A09;
        if (C2qv.A01(drawable, drawable2) && this.A04 == c06974ih.A04 && this.A0C == c06974ih.A0C && this.A0F == c06974ih.A0F && C2qv.A01(this.A05, c06974ih.A05) && this.A0L == c06974ih.A0L && this.A01 == c06974ih.A01 && this.A0J == c06974ih.A0J && this.A0K == c06974ih.A0K && C2qv.A01(this.A0G, c06974ih.A0G) && drawable == drawable2) {
            return A03(c06974ih);
        }
        return false;
    }

    @Override // X.C06984ii, X.AbstractC06994ij
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Integer num = this.A0I;
        int i = 0;
        int intValue = (((hashCode + (num != null ? num.intValue() : 0)) * 31) + this.A03) * 31;
        Drawable drawable = this.A0B;
        int hashCode2 = (intValue + (drawable != null ? drawable.hashCode() : 0)) * 31;
        InterfaceC07034in interfaceC07034in = this.A0E;
        int hashCode3 = (hashCode2 + (interfaceC07034in != null ? interfaceC07034in.hashCode() : 0)) * 31;
        PointF pointF = this.A07;
        int hashCode4 = (((hashCode3 + (pointF != null ? pointF.hashCode() : 0)) * 31) + (this.A0P ? 1 : 0)) * 31;
        Integer num2 = this.A0H;
        int intValue2 = (((hashCode4 + (num2 != null ? num2.intValue() : 0)) * 31) + this.A00) * 31;
        InterfaceC07034in interfaceC07034in2 = this.A0D;
        int hashCode5 = (intValue2 + (interfaceC07034in2 != null ? interfaceC07034in2.hashCode() : 0)) * 31;
        PointF pointF2 = this.A06;
        int hashCode6 = (hashCode5 + (pointF2 != null ? pointF2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.A09;
        int hashCode7 = (((((hashCode6 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31) + (this.A0M ? 1 : 0)) * 31) + this.A02) * 31;
        Drawable drawable3 = this.A0A;
        int hashCode8 = (hashCode7 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31;
        Drawable drawable4 = this.A08;
        int hashCode9 = (hashCode8 + (drawable4 != null ? drawable4.hashCode() : 0)) * 31;
        Drawable drawable5 = this.A0C;
        int hashCode10 = (hashCode9 + (drawable5 != null ? drawable5.hashCode() : 0)) * 31;
        InterfaceC07034in interfaceC07034in3 = this.A0F;
        int hashCode11 = (hashCode10 + (interfaceC07034in3 != null ? interfaceC07034in3.hashCode() : 0)) * 31;
        ColorFilter colorFilter = this.A05;
        int hashCode12 = (((((((((((hashCode11 + (colorFilter != null ? colorFilter.hashCode() : 0)) * 31) + (this.A0L ? 1 : 0)) * 31) + this.A01) * 31) + (this.A0J ? 1 : 0)) * 31) + (this.A0K ? 1 : 0)) * 31 * 31) + this.A04) * 31;
        InterfaceC06244gU interfaceC06244gU = this.A0G;
        if (interfaceC06244gU != null) {
            i = interfaceC06244gU.hashCode();
        }
        return hashCode12 + i;
    }

    @Override // X.C06984ii
    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImageOptions{");
        A0k.append(A02());
        return AnonymousClass001.A0f(A0k);
    }
}
