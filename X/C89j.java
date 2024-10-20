package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import java.util.Arrays;

/* renamed from: X.89j, reason: invalid class name */
/* loaded from: 89j.class */
public final class C89j extends C1rj {
    public PointF A00;
    public PointF A01;
    public int[] A02;

    public C89j() {
        super("LinearGradient");
    }

    public static C89k A00(1Iw r301) {
        return new C89k(new C89j(), r301);
    }

    public Integer A0m() {
        return 0S2.A01;
    }

    public Object A0n(Context context) {
        return new ShapeDrawable() { // from class: X.80h
            {
                new RectShape();
            }
        };
    }

    public boolean A0q() {
        return true;
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ShapeDrawable shapeDrawable = (ShapeDrawable) obj;
        final int[] iArr = this.A02;
        PointF pointF = this.A01;
        PointF pointF2 = this.A00;
        1BL.A1F(shapeDrawable, iArr);
        if (pointF == null) {
            pointF = new PointF(0.0f, 0.0f);
        }
        if (pointF2 == null) {
            pointF2 = new PointF(0.0f, 1.0f);
        }
        final PointF pointF3 = pointF;
        final PointF pointF4 = pointF2;
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: X.80i
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public Shader resize(int i, int i2) {
                PointF pointF5 = pointF3;
                float f = pointF5.x;
                float f2 = i;
                float f3 = f * f2;
                float f4 = pointF5.y;
                float f5 = i2;
                float f6 = f4 * f5;
                PointF pointF6 = pointF4;
                return new LinearGradient(f3, f6, pointF6.x * f2, pointF6.y * f5, iArr, (float[]) null, Shader.TileMode.CLAMP);
            }
        });
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C89j c89j = (C89j) r302;
            if (!Arrays.equals(this.A02, c89j.A02)) {
                return false;
            }
            PointF pointF = this.A00;
            PointF pointF2 = c89j.A00;
            if (pointF != null) {
                if (!pointF.equals(pointF2)) {
                    return false;
                }
            } else if (pointF2 != null) {
                return false;
            }
            if (!Arrays.equals((float[]) null, (float[]) null)) {
                return false;
            }
            PointF pointF3 = this.A01;
            PointF pointF4 = c89j.A01;
            if (pointF3 != null) {
                if (!pointF3.equals(pointF4)) {
                    return false;
                }
            } else if (pointF4 != null) {
                return false;
            }
        }
        return true;
    }
}
