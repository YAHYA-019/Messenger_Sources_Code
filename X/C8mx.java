package X;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;

/* renamed from: X.8mx, reason: invalid class name */
/* loaded from: 8mx.class */
public final class C8mx extends C1rj {
    public static final Rect A08 = new Rect(0, 0, 0, 0);
    public static final RectF A09 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public 1Im A05;
    public CharSequence A06;
    public boolean A07;

    public C8mx() {
        super("ReactionTab");
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), Boolean.valueOf(this.A07), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A04), this.A06};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r316v2 */
    /* JADX WARN: Type inference failed for: r316v3 */
    /* JADX WARN: Type inference failed for: r316v6 */
    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A04;
        int i4 = this.A03;
        CharSequence charSequence = this.A06;
        boolean z = this.A07;
        String A0C = r302.A0C();
        9bW r0 = new 9bW(A0C, this.A07, this.A01);
        Drawable A0E = 7zL.A0E(r302, r0, A0C, 0);
        Drawable drawable = A0E;
        if (A0E == null) {
            boolean z2 = this.A07;
            int i5 = this.A01;
            ?? r316 = 0;
            if (z2) {
                int i6 = 0;
                float[] fArr = new float[8];
                do {
                    fArr[i6] = 49.0f;
                    i6++;
                } while (i6 < 8);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, A09, null));
                shapeDrawable.setPadding(A08);
                shapeDrawable.mutate();
                shapeDrawable.setColorFilter(i5, PorterDuff.Mode.SRC_IN);
                r316 = shapeDrawable;
            }
            r302.A0I(r0, r316 == true ? 1 : 0, A0C, 0);
            drawable = r316;
        }
        11T.A0F(charSequence, 5);
        5B0 r02 = (5B0) 1Bn.A0A(67646);
        3yF A0L = 2KZ.A0L(r302, 0);
        7zL.A1J(A0L);
        A0L.A0L();
        A0L.A0D(drawable);
        7zM.A1N(A0L, r302, C8mx.class, "ReactionTab", AnonymousClass001.A1a(i));
        A0L.A0S();
        A0L.A2u(1);
        A0L.A1B(4.0f);
        A0L.A0G(z);
        A0L.A3A(r02.getTransformation(charSequence, (View) null));
        A0L.A2x(i2);
        A0L.A31(i4);
        A0L.A29(C26z.ALL, 16.0f);
        A0L.A34(2KU.A01(r302.A0D, 0S2.A0N));
        if (i3 > 0) {
            A0L.A0C(i3);
        }
        return A0L.A2W();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.9Q3, java.lang.Object] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Im r0;
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iw r02 = r302.A00.A00;
        View view = ((3xC) obj).A00;
        int A082 = 7zO.A08(r302.A03, 0);
        1BK.A1M(r02, view);
        1LI r03 = r02.A02;
        if (r03 == null || (r0 = ((C8mx) r03).A05) == null) {
            return null;
        }
        ?? obj2 = new Object();
        ((9Q3) obj2).A01 = view;
        ((9Q3) obj2).A00 = A082;
        r0.A00((Object) obj2);
        return null;
    }
}
