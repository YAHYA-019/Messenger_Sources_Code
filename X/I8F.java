package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: I8F.class */
public final class I8F {
    public final View A00;
    public static final TypeEvaluator A03 = IFy.A00;
    public static final Property A05 = new GTY(5);
    public static final Matrix A04 = new GSU();
    public final java.util.Map A02 = AnonymousClass001.A0u();
    public final java.util.Map A01 = AnonymousClass001.A0u();

    public I8F(View view) {
        this.A00 = view;
    }

    public static final void A00(View view, I8F i8f, boolean z) {
        Matrix matrix;
        ImageView.ScaleType scaleType;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                11T.A0A(childAt);
                A00(childAt, i8f, z);
            }
        }
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Rect A0A = AbstractC2327GOs.A0A(view);
                java.util.Map map = z ? i8f.A02 : i8f.A01;
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0 && (scaleType = imageView.getScaleType()) != null) {
                    int i2 = Ea6.A00[scaleType.ordinal()];
                    if (i2 == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = GOn.A0F();
                        matrix.postScale(DKC.A02(imageView) / drawable2.getIntrinsicWidth(), DKC.A03(imageView) / drawable2.getIntrinsicHeight());
                    } else if (i2 == 2) {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float A02 = DKC.A02(imageView);
                        float f = intrinsicWidth;
                        float f2 = A02 / f;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float A032 = DKC.A03(imageView);
                        float f3 = intrinsicHeight;
                        float max = Math.max(f2, A032 / f3);
                        float f4 = f * max;
                        float f5 = f3 * max;
                        int A042 = GOn.A04(A02 - f4, 2.0f);
                        int A043 = GOn.A04(A032 - f5, 2.0f);
                        matrix = GOn.A0F();
                        matrix.postScale(max, max);
                        matrix.postTranslate(A042, A043);
                    }
                    map.put(view, new HbP(matrix, A0A));
                }
                matrix = new Matrix(imageView.getImageMatrix());
                map.put(view, new HbP(matrix, A0A));
            }
        }
    }

    public final AnimatorSet A01() {
        Property property;
        RiL riL;
        Matrix[] matrixArr;
        A00(this.A00, this, false);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList A0s = AnonymousClass001.A0s();
        java.util.Map map = this.A02;
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            View view = (View) A1B.next();
            HbP hbP = (HbP) map.get(view);
            HbP hbP2 = (HbP) this.A01.get(view);
            if (hbP != null && hbP2 != null) {
                Rect rect = hbP.A01;
                Rect rect2 = hbP2.A01;
                Matrix matrix = hbP.A00;
                Matrix matrix2 = hbP2.A00;
                boolean A1N = AnonymousClass001.A1N(matrix.equals(matrix2) ? 1 : 0);
                if (!rect.equals(rect2) || !A1N) {
                    if (view instanceof ImageView) {
                        ImageView imageView = (ImageView) view;
                        Drawable drawable = imageView.getDrawable();
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                            property = A05;
                            riL = A03;
                            matrixArr = new Matrix[2];
                            matrix2 = A04;
                            matrixArr[0] = matrix2;
                        } else {
                            property = A05;
                            property.set(view, matrix);
                            riL = new RiL();
                            matrixArr = new Matrix[2];
                            matrixArr[0] = matrix;
                        }
                        matrixArr[1] = matrix2;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) riL, (Object[]) matrixArr);
                        11T.A0A(ofObject);
                        A0s.add(ofObject);
                    }
                }
            }
        }
        animatorSet.playTogether(A0s);
        return animatorSet;
    }
}
