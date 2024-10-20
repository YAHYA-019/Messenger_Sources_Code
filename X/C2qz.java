package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Patterns;
import com.facebook.common.util.StringLocaleUtil;
import com.google.common.base.Objects;
import com.google.common.base.Platform;
import java.util.List;

/* renamed from: X.2qz, reason: invalid class name */
/* loaded from: 2qz.class */
public final class C2qz extends Drawable implements Drawable.Callback {
    public int A00;
    public Path A01;
    public C2qa A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final Paint A07;
    public final RectF A08;
    public final Rect A09;

    public C2qz() {
        this.A02 = C2qa.ONE_LETTER;
        Paint paint = new Paint();
        this.A07 = paint;
        paint.setFlags(1);
        paint.setTextAlign(Paint.Align.CENTER);
        this.A09 = new Rect();
        this.A08 = new RectF();
    }

    public C2qz(Context context, AttributeSet attributeSet, int i) {
        this();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2p, i, 0);
        this.A02 = C2qa.values()[obtainStyledAttributes.getInt(2, 0)];
        int color = obtainStyledAttributes.getColor(1, context.getColor(2132213991));
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, C0A8.A05(context.getResources(), 2132279515));
        obtainStyledAttributes.recycle();
        this.A07.setColor(color);
        this.A07.setTextSize(dimensionPixelSize);
        A01(this);
    }

    public static String A00(C2qa c2qa, String str) {
        if (c2qa != C2qa.TWO_LETTER) {
            return C28o.A01(str);
        }
        String str2 = C28o.A01;
        String str3 = null;
        if (!1JF.A0B(str)) {
            String trim = str.trim();
            if (!1JF.A0B(trim) && !Patterns.PHONE.matcher(trim).matches()) {
                List A08 = 1JF.A08(trim, ' ');
                int size = A08.size();
                StringBuilder A0l = AnonymousClass001.A0l(2);
                A0l.appendCodePoint(C28o.A00((String) 1BK.A0r(A08)));
                if (size > 1) {
                    A0l.appendCodePoint(C28o.A00(1BK.A14(A08, size - 1)));
                }
                str3 = A0l.toString();
            }
        }
        return str3;
    }

    public static void A01(C2qz c2qz) {
        String str = c2qz.A03;
        if (Platform.stringIsNullOrEmpty(str)) {
            c2qz.A09.setEmpty();
        } else {
            c2qz.A07.getTextBounds(str, 0, str.length(), c2qz.A09);
        }
    }

    public void A02() {
        this.A04 = null;
        this.A05 = false;
        if (null != this.A03) {
            this.A03 = null;
            A01(this);
            invalidateSelf();
        }
    }

    public boolean A03(String str) {
        if (!Objects.equal(this.A04, str)) {
            this.A04 = str;
            String upperCaseLocaleSafe = StringLocaleUtil.toUpperCaseLocaleSafe(A00(this.A02, str));
            if (!Objects.equal(upperCaseLocaleSafe, this.A03)) {
                this.A03 = upperCaseLocaleSafe;
                A01(this);
                invalidateSelf();
            }
        }
        return AnonymousClass001.A1T(this.A03);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        String str = this.A03;
        boolean z = !Platform.stringIsNullOrEmpty(str);
        Rect bounds = getBounds();
        canvas.save();
        Path path = this.A01;
        if (path != null) {
            canvas.clipPath(path);
        }
        if (this.A05) {
            if (z || this.A06) {
                Paint paint = this.A07;
                int color = paint.getColor();
                paint.setColor(this.A00);
                RectF rectF = this.A08;
                rectF.set(bounds);
                canvas.drawOval(rectF, paint);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(0.0f);
                paint.setColor(0);
                canvas.drawOval(rectF, paint);
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(color);
            }
            canvas.restore();
        }
        if (z) {
            C0k4.A00(str);
            canvas.drawText(str, bounds.exactCenterX(), bounds.exactCenterY() + (this.A09.height() / 2), this.A07);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A01(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
