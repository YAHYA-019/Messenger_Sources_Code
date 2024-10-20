package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.2kr, reason: invalid class name */
/* loaded from: 2kr.class */
public final class C2kr extends Drawable implements Drawable.Callback, C2ks, C2kt {
    public Drawable A00;
    public C2jj A01;
    public boolean A02;

    private final void A00(boolean z, boolean z2) {
        Drawable drawable = this.A00;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        try {
            drawable.setVisible(z, z2);
        } catch (NullPointerException unused) {
        }
    }

    public final void A01() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            A00(false, false);
            drawable.setCallback(null);
        }
        this.A00 = null;
        this.A01 = null;
        this.A02 = false;
    }

    public final void A02(int i, int i2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public final void A03(Drawable drawable, C2jj c2jj) {
        Drawable drawable2 = this.A00;
        if (drawable2 != drawable) {
            boolean z = false;
            if (drawable2 != null) {
                A00(false, false);
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                A00(isVisible(), false);
                drawable.setCallback(this);
            } else {
                drawable = null;
            }
            this.A00 = drawable;
            this.A01 = c2jj;
            if ((c2jj != null && c2jj.A00) || (drawable instanceof InsetDrawable)) {
                z = true;
            }
            this.A02 = z;
            invalidateSelf();
        }
    }

    @Override // X.C2ks
    public boolean CR6(View view, MotionEvent motionEvent) {
        Rect bounds = getBounds();
        11T.A0A(bounds);
        int x = ((int) motionEvent.getX()) - bounds.left;
        int y = ((int) motionEvent.getY()) - bounds.top;
        Drawable drawable = this.A00;
        if (drawable == null) {
            throw 1BK.A0e();
        }
        drawable.setHotspot(x, y);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (getBounds().contains((int) r302.getX(), (int) r302.getY()) == false) goto L8;
     */
    @Override // X.C2ks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Cxj(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A00
            r303 = r0
            r0 = r303
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3b
            r0 = r302
            int r0 = r0.getActionMasked()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L3b
            r0 = r301
            android.graphics.Rect r0 = r0.getBounds()
            r305 = r0
            r0 = r302
            float r0 = r0.getX()
            int r0 = (int) r0
            r306 = r0
            r0 = r302
            float r0 = r0.getY()
            int r0 = (int) r0
            r304 = r0
            r0 = r305
            r1 = r306
            r2 = r304
            boolean r0 = r0.contains(r1, r2)
            r306 = r0
            r0 = 1
            r304 = r0
            r0 = r306
            if (r0 != 0) goto L3f
        L3b:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L3f:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2kr.Cxj(android.view.MotionEvent):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        11T.A0F(canvas, 0);
        Drawable drawable = this.A00;
        if (drawable != null) {
            Rect bounds = getBounds();
            11T.A0A(bounds);
            int save = canvas.save();
            canvas.translate(bounds.left, bounds.top);
            if (this.A02) {
                canvas.clipRect(0, 0, bounds.width(), bounds.height());
            }
            C2jj c2jj = this.A01;
            if (c2jj != null) {
                canvas.concat(c2jj);
            }
            drawable.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            throw 1BK.A0e();
        }
        Drawable current = drawable.getCurrent();
        11T.A0A(current);
        return current;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        11T.A0F(rect, 0);
        Drawable drawable = this.A00;
        return drawable != null && drawable.getPadding(rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r302 == null) goto L6;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int[] getState() {
        /*
            r301 = this;
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L12
            r0 = r302
            int[] r0 = r0.getState()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L16
        L12:
            r0 = 0
            int[] r0 = new int[r0]
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2kr.getState():int[]");
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.A00;
        return drawable != null && drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.A00;
        return drawable != null && drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        11T.A0F(runnable, 1);
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        11T.A0F(iArr, 0);
        Drawable drawable = this.A00;
        return drawable != null && drawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        A00(z, z2);
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        11T.A0F(runnable, 1);
        unscheduleSelf(runnable);
    }
}
