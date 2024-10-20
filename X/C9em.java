package X;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.StateSet;
import java.util.Arrays;

/* renamed from: X.9em, reason: invalid class name */
/* loaded from: 9em.class */
public abstract class C9em {
    public static final Rect A00;
    public static final RectF A01;
    public static final int[][] A02;
    public static final int[] A03;
    public static final int[] A04;

    /* JADX WARN: Type inference failed for: r0v5, types: [int[], int[][]] */
    static {
        int[] iArr = {R.attr.state_enabled};
        A03 = iArr;
        A04 = StateSet.WILD_CARD;
        A02 = new int[]{iArr};
        A00 = new Rect(0, 0, 0, 0);
        A01 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public static ShapeDrawable A00(float f, int i) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, A01, null));
        shapeDrawable.setPadding(A00);
        shapeDrawable.mutate();
        shapeDrawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        return shapeDrawable;
    }
}
