package X;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;

/* renamed from: X.5ae, reason: invalid class name */
/* loaded from: 5ae.class */
public class C5ae extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public ObjectAnimator A03;
    public final Paint A04;
    public final RectF A05 = new RectF();
    public final Property A06;

    public C5ae() {
        Paint paint = new Paint(1);
        this.A04 = paint;
        this.A02 = HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
        this.A00 = 1.0f;
        final Class cls = Float.TYPE;
        this.A06 = new Property(cls) { // from class: X.5af
            @Override // android.util.Property
            public /* bridge */ /* synthetic */ Object get(Object obj) {
                C5ae c5ae = (C5ae) obj;
                11T.A0F(c5ae, 0);
                return Float.valueOf(c5ae.A00);
            }

            @Override // android.util.Property
            public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
                C5ae c5ae = (C5ae) obj;
                float floatValue = ((Number) obj2).floatValue();
                11T.A0F(c5ae, 0);
                c5ae.A00 = floatValue;
            }
        };
        paint.setStyle(Paint.Style.STROKE);
        A00();
    }

    public void A00() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<C5ae, Float>) this.A06, 0.0f, 1.0f);
        11T.A0A(ofFloat);
        this.A03 = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimator = this.A03;
        if (objectAnimator != null) {
            objectAnimator.setDuration(1000L);
            ObjectAnimator objectAnimator2 = this.A03;
            if (objectAnimator2 != null) {
                objectAnimator2.addListener(new GS9(this, 1));
                return;
            }
        }
        11T.A0L("progressAnimator");
        throw 0Q8.createAndThrow();
    }

    public final void A01(float f) {
        Paint paint = this.A04;
        if (Float.compare(paint.getStrokeWidth(), f) != 0) {
            paint.setStrokeWidth(f);
            invalidateSelf();
        }
    }

    public final void A02(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        11T.A0F(canvas, 0);
        canvas.drawArc(this.A05, this.A01, this.A02 * this.A00, false, this.A04);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        11T.A0F(rect, 0);
        super.onBoundsChange(rect);
        float strokeWidth = this.A04.getStrokeWidth() / 2.0f;
        this.A05.set(rect.left + strokeWidth, rect.top + strokeWidth, rect.right - strokeWidth, rect.bottom - strokeWidth);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Paint paint = this.A04;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw AnonymousClass001.A0q("Not supported. Call setRingColor.");
    }
}
