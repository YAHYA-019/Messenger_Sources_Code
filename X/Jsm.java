package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;

/* loaded from: Jsm.class */
public final class Jsm extends 6OU implements 6OY {
    public float A00;
    public float A01;
    public StaticLayout A02;
    public final TextPaint A03;
    public final 5IT A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jsm(5IW r302, 6OQ r303) {
        super(r302, r303);
        11T.A0F(r303, 1);
        String str = r302.A0s;
        if (str == null) {
            throw 1BK.A0h();
        }
        this.A05 = str;
        5IW r0 = ((6OU) this).A04;
        this.A04 = r0.A0r;
        TextPaint textPaint = new TextPaint(1);
        this.A03 = textPaint;
        5Im r02 = r0.A0U;
        textPaint.setColor(r02 != null ? Color.argb(r02.A00, r02.A03, r02.A02, r02.A01) : -16777216);
        A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A00() {
        /*
            Method dump skipped, instructions count: 784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jsm.A00():void");
    }

    public void A08() {
        super.A08();
        A00();
    }

    public void A0A(float f) {
        StaticLayout staticLayout = this.A02;
        if (staticLayout == null) {
            11T.A0L("textLayout");
            throw 0Q8.createAndThrow();
        }
        staticLayout.getPaint().setAlpha(((6OU) this).A01);
    }

    public void A0B(Canvas canvas) {
        canvas.save();
        canvas.translate(this.A00, this.A01);
        StaticLayout staticLayout = this.A02;
        if (staticLayout == null) {
            11T.A0L("textLayout");
            throw 0Q8.createAndThrow();
        }
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public void A0F(RectF rectF) {
        11T.A0F(rectF, 0);
        StaticLayout staticLayout = this.A02;
        if (staticLayout != null) {
            float width = staticLayout.getWidth();
            if (this.A02 != null) {
                rectF.set(0.0f, 0.0f, width, r0.getHeight());
                return;
            }
        }
        11T.A0L("textLayout");
        throw 0Q8.createAndThrow();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        StaticLayout staticLayout = this.A02;
        if (staticLayout == null) {
            11T.A0L("textLayout");
            throw 0Q8.createAndThrow();
        }
        staticLayout.getPaint().setColorFilter(colorFilter);
    }
}
