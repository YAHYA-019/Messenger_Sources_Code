package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.92s, reason: invalid class name */
/* loaded from: 92s.class */
public final class C92s extends DN9 {
    public float A00;
    public int A01;
    public int A02;
    public 6ON A03;
    public 6ON A04;
    public 6ON A05;
    public 6ON A06;
    public 6ON A07;
    public 6ON A08;
    public 6ON A09;
    public 6ON A0A;
    public boolean A0B;
    public float A0C;
    public final int A0D;
    public final float A0E;

    public C92s(Context context, 6Jq r303, float f) {
        11T.A0F(r303, 1);
        this.A0E = f;
        this.A0B = true;
        this.A0D = C0A8.A00(context, 125.0f);
        r303.A02(AVF.A01(this, 4), new 6Ju[]{6Ju.A0C, 6Ju.A0A, 6Ju.A0B, 6Ju.A09, 6Ju.A07, 6Ju.A08});
    }

    private final void A00(6ON r302) {
        if (r302 != null) {
            this.A0C = 150.0f;
            r302.setBounds(0, 0, 150, (int) ((150.0f * r302.getIntrinsicHeight()) / r302.getIntrinsicWidth()));
            r302.CXT();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        6ON r0;
        6ON r02;
        11T.A0F(canvas, 0);
        if (this.A0B) {
            6ON r305 = this.A08;
            if (r305 != null && (r0 = this.A06) != null) {
                6ON r307 = this.A07;
                if (r307 != null && (r02 = this.A05) != null) {
                    if (7zO.A02(this) >= this.A0D) {
                        r305 = r0;
                        r307 = r02;
                    }
                    if (!r305.equals(this.A0A) || !r307.equals(this.A09)) {
                        6ON r03 = this.A0A;
                        if (r03 != null) {
                            r03.stop();
                        }
                        6ON r04 = this.A09;
                        if (r04 != null) {
                            r04.stop();
                        }
                        this.A0A = r305;
                        this.A09 = r307;
                    }
                    for (Drawable drawable : C0s8.A14(r305, r307)) {
                        int A02 = 7zO.A02(this);
                        this.A02 = A02;
                        this.A01 = (A02 * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth();
                        int A022 = 7zN.A02(this);
                        int i = this.A02;
                        this.A00 = A022 - (i / 2);
                        drawable.setBounds(0, 0, i, this.A01);
                    }
                    r305.CXT();
                    r307.CXT();
                }
            }
            A00(this.A03);
            A00(this.A04);
        }
        this.A0B = false;
        float f = this.A0C / 2.0f;
        float f2 = 0.0f - f;
        int save = canvas.save();
        canvas.translate(f2, f2);
        try {
            6ON r05 = this.A03;
            if (r05 != null) {
                r05.draw(canvas);
            }
            canvas.restoreToCount(save);
            float f3 = this.A0E;
            float f4 = (-f3) * 0.88f;
            float f5 = (f3 * 2.0f) / this.A01;
            float f6 = 1.0f / f5;
            int A01 = 7zT.A01(canvas, this, f5);
            try {
                float f7 = this.A00;
                float f8 = f4 * f6;
                int save2 = canvas.save();
                canvas.translate(f7, f8);
                try {
                    6ON r06 = this.A0A;
                    if (r06 != null) {
                        r06.draw(canvas);
                    }
                    canvas.restoreToCount(save2);
                    canvas.restoreToCount(A01);
                    A01 = 7zT.A01(canvas, this, f5 * (-1.0f));
                    float f9 = this.A00;
                    float height = (f4 - getBounds().height()) * f6;
                    save2 = canvas.save();
                    canvas.translate(f9, height);
                    6ON r07 = this.A09;
                    if (r07 != null) {
                        r07.draw(canvas);
                    }
                    canvas.restoreToCount(save2);
                    canvas.restoreToCount(A01);
                    save = canvas.save();
                    canvas.scale(-1.0f, -1.0f, 0.0f, 0.0f);
                    try {
                        float A023 = (0.0f - 7zO.A02(this)) - f;
                        float height2 = (0.0f - getBounds().height()) - f;
                        save = canvas.save();
                        canvas.translate(A023, height2);
                        6ON r08 = this.A04;
                        if (r08 != null) {
                            r08.draw(canvas);
                        }
                        canvas.restoreToCount(save);
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                } catch (Throwable th2) {
                    canvas.restoreToCount(save2);
                    throw th2;
                }
            } catch (Throwable th3) {
                canvas.restoreToCount(A01);
                throw th3;
            }
        } finally {
        }
    }

    public int getOpacity() {
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBoundsChange(Rect rect) {
        11T.A0F(rect, 0);
        super/*android.graphics.drawable.Drawable*/.onBoundsChange(rect);
        this.A0B = true;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
