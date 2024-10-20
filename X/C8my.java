package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* renamed from: X.8my, reason: invalid class name */
/* loaded from: 8my.class */
public final class C8my extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public 1Im A06;
    public 2KE A07;
    public ImmutableList A08;
    public static final int A0A = C1u7.A0D.Ato();
    public static final 2KE A0C = 2KE.A0E;
    public static final int A0B = C1u7.A07.Ato();
    public static final int A09 = C1u7.A08.Ato();

    public C8my() {
        super("M4RowSelectorComponent");
        this.A01 = A09;
        this.A02 = A0A;
        this.A03 = A0B;
        this.A04 = -1;
        this.A05 = -1;
        this.A07 = A0C;
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A08, Integer.valueOf(this.A04), Integer.valueOf(this.A05), this.A07};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        ImmutableList immutableList = this.A08;
        int i = this.A00;
        int i2 = this.A03;
        int i3 = this.A02;
        int i4 = this.A05;
        2KE r0 = this.A07;
        String A0C2 = r302.A0C();
        int i5 = this.A01;
        int i6 = this.A04;
        9bE r02 = new 9bE(A0C2, i5, i6);
        Drawable A0E = 7zL.A0E(r302, r02, A0C2, 0);
        Drawable drawable = A0E;
        if (A0E == null) {
            int i7 = this.A01;
            float f = 0.0f / 0.0f;
            if (i6 == -1) {
                i6 = 4YU.A0E(r302).getDimensionPixelSize(2132279303);
            }
            float[] fArr = new float[8];
            Arrays.fill(fArr, i6);
            GradientDrawable A0B2 = 7zU.A0B(fArr);
            A0B2.setColor(i7);
            r302.A0I(r02, A0B2, A0C2, 0);
            drawable = A0B2;
        }
        7zP.A1L(immutableList, 1, r0);
        C1rq A00 = C1rg.A00(r302);
        A00.A0R();
        int size = immutableList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C77r c77r = (C77r) immutableList.get(i8);
            boolean A1Q = AnonymousClass001.A1Q(i8, i);
            C2yv A002 = 2KF.A00(r302);
            7zL.A1J(A002);
            2KG r03 = 2KG.A01;
            2KF r04 = A002.A01;
            r04.A0H = r03;
            A002.A0L();
            r04.A0P = true;
            A002.A0D(A1Q ? drawable : null);
            A002.A2T(1LI.A0C(r302, C8my.class, "M4RowSelectorComponent", new Object[]{c77r.A02}, 17368593));
            r04.A0E = TextUtils.TruncateAt.END;
            A002.A0R();
            A002.A1L(i4 != -1 ? 0 : 4YU.A0E(r302).getDimensionPixelOffset(2132279333));
            r04.A08 = 1;
            int i9 = i2;
            if (A1Q) {
                i9 = i3;
            }
            A002.A2X(i9);
            r04.A0N = 7zL.A12(A002, c77r.A01);
            A002.A02.set(0);
            r04.A0J = 2KK.A03(r0);
            r04.A0K = 2KK.A04(r0);
            r04.A0I = 2K4.A03;
            A00.A2f(A002.A2W());
        }
        return A00.A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        7zO.A1Q(A00, 4184783114973475L);
        return A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Im r0;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 17368593) {
            return null;
        }
        1Iw r02 = r302.A00.A00;
        6Sh r03 = (6Sh) r302.A03[0];
        11T.A0F(r02, 0);
        1LI r04 = r02.A02;
        if (r04 == null || (r0 = ((C8my) r04).A06) == null) {
            return null;
        }
        7zR.A1E(r0, r03);
        return null;
    }
}
