package X;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.StateSet;
import java.util.Arrays;

/* renamed from: X.2cn, reason: invalid class name */
/* loaded from: 2cn.class */
public abstract class C2cn {
    public static final int[] A00;
    public static final int[] A01;
    public static final int[] A02;
    public static final int[][] A03;
    public static final Rect A04;
    public static final RectF A05;

    /* JADX WARN: Type inference failed for: r0v7, types: [int[], int[][]] */
    static {
        int[] iArr = {R.attr.state_enabled};
        A01 = iArr;
        A00 = new int[]{-16842910};
        A02 = StateSet.WILD_CARD;
        A03 = new int[]{iArr};
        A04 = new Rect(0, 0, 0, 0);
        A05 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public static RippleDrawable A00(float f, int i, int i2) {
        return C2co.A00(A02(f, i), A02(f, -1), i2);
    }

    public static RippleDrawable A01(float f, int i, int i2, int i3) {
        6Q6 r0 = new 6Q6();
        ShapeDrawable A022 = A02(f, i);
        r0.A01(A022, Integer.valueOf(i3), A00);
        int[] iArr = A01;
        Integer valueOf = Integer.valueOf(i);
        r0.A01(A022, valueOf, iArr);
        r0.A01(A022, valueOf, A02);
        return C2co.A00(r0, A02(f, -1), i2);
    }

    public static ShapeDrawable A02(float f, int i) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, f);
        return A03(fArr, i);
    }

    public static ShapeDrawable A03(float[] fArr, int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, A05, null));
        shapeDrawable.setPadding(A04);
        shapeDrawable.mutate();
        shapeDrawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        return shapeDrawable;
    }
}
