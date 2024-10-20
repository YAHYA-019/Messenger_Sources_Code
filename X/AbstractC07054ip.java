package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.4ip, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ip.class */
public abstract class AbstractC07054ip implements InterfaceC07034in {
    public void A00(Matrix matrix, Rect rect, float f, float f2, float f3, float f4, int i, int i2) {
        float min;
        float f5;
        float height;
        float f6;
        float f7;
        float height2;
        float f8;
        float f9;
        float f10;
        float f11;
        float max;
        float f12;
        if (this instanceof C07134ix) {
            f8 = 0.5f;
            f6 = rect.left;
            if (f4 > f3) {
                max = (rect.width() - (i * f4)) * 0.5f;
                f6 += max;
                f9 = rect.top;
                f3 = f4;
            } else {
                f12 = rect.top;
                f7 = (rect.height() - (i2 * f3)) * 0.5f;
                f9 = f7 + f12;
            }
        } else {
            if (this instanceof C07094it) {
                f3 = Math.min(f3, f4);
            } else if (this instanceof C07124iw) {
                f3 = Math.min(Math.min(f3, f4), 1.0f);
            } else {
                if (!(this instanceof C07144iy)) {
                    if (this instanceof 7dA) {
                        f5 = rect.left;
                        height = rect.top;
                        matrix.setScale(f3, f3);
                    } else {
                        if (this instanceof C07074ir) {
                            f8 = 0.5f;
                            f6 = rect.left + ((rect.width() - (i * f4)) * 0.5f);
                            f9 = rect.top;
                            matrix.setScale(f4, f4);
                            f10 = (int) (f6 + f8);
                            f11 = f9 + f8;
                            matrix.postTranslate(f10, (int) f11);
                        }
                        if (this instanceof C07044io) {
                            f5 = rect.left;
                            height = rect.top;
                            matrix.setScale(f3, f4);
                        } else if (this instanceof C07064iq) {
                            f6 = rect.left;
                            f7 = rect.top;
                            height2 = rect.height() - (i2 * f3);
                            f8 = 0.5f;
                            f12 = height2 * f8;
                            f9 = f7 + f12;
                        } else {
                            if (this instanceof C07084is) {
                                min = Math.min(f3, f4);
                                f5 = rect.left;
                                height = rect.top;
                            } else {
                                if (this instanceof C07104iu) {
                                    min = Math.min(f3, f4);
                                    f5 = rect.left + (rect.width() - (i * min));
                                } else {
                                    if (!(this instanceof C07154iz)) {
                                        matrix.setTranslate((int) (rect.left + ((rect.width() - i) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i2) * 0.5f) + 0.5f));
                                        return;
                                    }
                                    min = Math.min(f3, f4);
                                    f5 = rect.left;
                                }
                                height = rect.top + (rect.height() - (i2 * min));
                            }
                            matrix.setScale(min, min);
                        }
                    }
                    f10 = (int) (f5 + 0.5f);
                    f11 = height + 0.5f;
                    matrix.postTranslate(f10, (int) f11);
                }
                f8 = 0.5f;
                if (f4 > f3) {
                    float f13 = i * f4;
                    f6 = rect.left;
                    max = Math.max(Math.min((rect.width() * 0.5f) - (f * f13), 0.0f), rect.width() - f13);
                    f6 += max;
                    f9 = rect.top;
                    f3 = f4;
                } else {
                    f6 = rect.left;
                    float f14 = i2 * f3;
                    f9 = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f14), 0.0f), rect.height() - f14) + rect.top;
                }
            }
            f8 = 0.5f;
            f6 = rect.left + ((rect.width() - (i * f3)) * 0.5f);
            f7 = rect.top;
            height2 = rect.height() - (i2 * f3);
            f12 = height2 * f8;
            f9 = f7 + f12;
        }
        matrix.setScale(f3, f3);
        f10 = (int) (f6 + f8);
        f11 = f9 + f8;
        matrix.postTranslate(f10, (int) f11);
    }

    @Override // X.InterfaceC07034in
    public Matrix BGs(Matrix matrix, Rect rect, float f, float f2, int i, int i2) {
        A00(matrix, rect, f, f2, rect.width() / i, rect.height() / i2, i, i2);
        return matrix;
    }
}
