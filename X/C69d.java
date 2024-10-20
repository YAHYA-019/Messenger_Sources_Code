package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.69d, reason: invalid class name */
/* loaded from: 69d.class */
public final class C69d {
    public int A00;
    public Paint A01;
    public final float A02;
    public final int A03;
    public final int A04;

    public C69d(Context context) {
        Resources resources = context.getResources();
        this.A04 = resources.getDimensionPixelSize(R.dimen.mapbox_four_dp);
        this.A03 = resources.getDimensionPixelSize(2132279309);
        this.A02 = resources.getDimensionPixelSize(2132279309);
        this.A00 = context.getColor(2132214411);
    }

    public void A00(Canvas canvas, boolean z) {
        if (z) {
            if (this.A01 == null) {
                this.A01 = new Paint(5);
            }
            int width = canvas.getWidth();
            int i = this.A03;
            float f = width - i;
            float f2 = i;
            float f3 = this.A04;
            float f4 = this.A02;
            float f5 = f3 + (f4 / 2.0f);
            Paint paint = this.A01;
            if (paint != null) {
                paint.setStrokeWidth(f4);
                this.A01.setStyle(Paint.Style.STROKE);
                float f6 = 0.0f / 0.0f;
                this.A01.setColor(-1);
                canvas.drawCircle(f, f2, f5, this.A01);
                this.A01.setStyle(Paint.Style.FILL);
                this.A01.setColor(this.A00);
                canvas.drawCircle(f, f2, f3, this.A01);
            }
        }
    }
}
