package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: X.Jik, reason: case insensitive filesystem */
/* loaded from: Jik.class */
public final class C3082Jik extends KTD {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public String A08;
    public int[] A09;
    public final Matrix A0A;
    public final Matrix A0B;
    public final ArrayList A0C;

    public C3082Jik() {
        this.A0B = GOn.A0F();
        this.A0C = AnonymousClass001.A0s();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        this.A0A = GOn.A0F();
        this.A08 = null;
    }

    /* JADX WARN: Type inference failed for: r304v3, types: [X.Jim, X.Jin] */
    public C3082Jik(C04r c04r, C3082Jik c3082Jik) {
        AbstractC3085Jin abstractC3085Jin;
        this.A0B = GOn.A0F();
        this.A0C = AnonymousClass001.A0s();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        Matrix A0F = GOn.A0F();
        this.A0A = A0F;
        this.A08 = null;
        this.A02 = c3082Jik.A02;
        this.A00 = c3082Jik.A00;
        this.A01 = c3082Jik.A01;
        this.A03 = c3082Jik.A03;
        this.A04 = c3082Jik.A04;
        this.A05 = c3082Jik.A05;
        this.A06 = c3082Jik.A06;
        this.A09 = c3082Jik.A09;
        String str = c3082Jik.A08;
        this.A08 = str;
        this.A07 = c3082Jik.A07;
        if (str != null) {
            c04r.put(str, this);
        }
        A0F.set(c3082Jik.A0A);
        ArrayList arrayList = c3082Jik.A0C;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C3082Jik) {
                this.A0C.add(new C3082Jik(c04r, (C3082Jik) obj));
            } else {
                if (obj instanceof C3084Jim) {
                    C3084Jim c3084Jim = (C3084Jim) obj;
                    ?? abstractC3085Jin2 = new AbstractC3085Jin(c3084Jim);
                    abstractC3085Jin2.A03 = 0.0f;
                    abstractC3085Jin2.A01 = 1.0f;
                    abstractC3085Jin2.A00 = 1.0f;
                    abstractC3085Jin2.A06 = 0.0f;
                    abstractC3085Jin2.A04 = 1.0f;
                    abstractC3085Jin2.A05 = 0.0f;
                    abstractC3085Jin2.A07 = Paint.Cap.BUTT;
                    abstractC3085Jin2.A08 = Paint.Join.MITER;
                    abstractC3085Jin2.A02 = 4.0f;
                    abstractC3085Jin2.A0B = c3084Jim.A0B;
                    abstractC3085Jin2.A0A = c3084Jim.A0A;
                    abstractC3085Jin2.A03 = c3084Jim.A03;
                    abstractC3085Jin2.A01 = c3084Jim.A01;
                    abstractC3085Jin2.A09 = c3084Jim.A09;
                    abstractC3085Jin2.A01 = ((AbstractC3085Jin) c3084Jim).A01;
                    abstractC3085Jin2.A00 = c3084Jim.A00;
                    abstractC3085Jin2.A06 = c3084Jim.A06;
                    abstractC3085Jin2.A04 = c3084Jim.A04;
                    abstractC3085Jin2.A05 = c3084Jim.A05;
                    abstractC3085Jin2.A07 = c3084Jim.A07;
                    abstractC3085Jin2.A08 = c3084Jim.A08;
                    abstractC3085Jin2.A02 = c3084Jim.A02;
                    abstractC3085Jin = abstractC3085Jin2;
                } else {
                    if (!(obj instanceof C3083Jil)) {
                        throw AnonymousClass001.A0N("Unknown object in the tree!");
                    }
                    abstractC3085Jin = new AbstractC3085Jin((AbstractC3085Jin) obj);
                }
                this.A0C.add(abstractC3085Jin);
                String str2 = abstractC3085Jin.A02;
                if (str2 != null) {
                    c04r.put(str2, abstractC3085Jin);
                }
            }
        }
    }

    public static void A00(C3082Jik c3082Jik) {
        Matrix matrix = c3082Jik.A0A;
        matrix.reset();
        matrix.postTranslate(-c3082Jik.A00, -c3082Jik.A01);
        matrix.postScale(c3082Jik.A03, c3082Jik.A04);
        matrix.postRotate(c3082Jik.A02, 0.0f, 0.0f);
        matrix.postTranslate(c3082Jik.A05 + c3082Jik.A00, c3082Jik.A06 + c3082Jik.A01);
    }

    public String getGroupName() {
        return this.A08;
    }

    public Matrix getLocalMatrix() {
        return this.A0A;
    }

    public float getPivotX() {
        return this.A00;
    }

    public float getPivotY() {
        return this.A01;
    }

    public float getRotation() {
        return this.A02;
    }

    public float getScaleX() {
        return this.A03;
    }

    public float getScaleY() {
        return this.A04;
    }

    public float getTranslateX() {
        return this.A05;
    }

    public float getTranslateY() {
        return this.A06;
    }

    public void setPivotX(float f) {
        if (f != this.A00) {
            this.A00 = f;
            A00(this);
        }
    }

    public void setPivotY(float f) {
        if (f != this.A01) {
            this.A01 = f;
            A00(this);
        }
    }

    public void setRotation(float f) {
        if (f != this.A02) {
            this.A02 = f;
            A00(this);
        }
    }

    public void setScaleX(float f) {
        if (f != this.A03) {
            this.A03 = f;
            A00(this);
        }
    }

    public void setScaleY(float f) {
        if (f != this.A04) {
            this.A04 = f;
            A00(this);
        }
    }

    public void setTranslateX(float f) {
        if (f != this.A05) {
            this.A05 = f;
            A00(this);
        }
    }

    public void setTranslateY(float f) {
        if (f != this.A06) {
            this.A06 = f;
            A00(this);
        }
    }
}
