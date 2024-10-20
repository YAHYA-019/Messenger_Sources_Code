package com.mapbox.mapboxsdk.maps.widgets;

import X.0Sk;
import X.0xW;
import X.7zO;
import X.AbH;
import X.C0Ad;
import X.JQy;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.maps.MapboxMap;

/* loaded from: CompassView.class */
public final class CompassView extends ImageView implements Runnable {
    public static final long TIME_FADE_ANIMATION = 500;
    public static final long TIME_MAP_NORTH_ANIMATION = 150;
    public static final long TIME_WAIT_IDLE = 500;
    public MapboxMap.OnCompassAnimationListener compassAnimationListener;
    public 0Sk fadeAnimator;
    public boolean fadeCompassViewFacingNorth;
    public boolean isAnimating;
    public float rotation;

    public CompassView(Context context) {
        super(context);
        this.rotation = 0.0f;
        this.fadeCompassViewFacingNorth = true;
        this.isAnimating = false;
        initialize(context);
    }

    public CompassView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.rotation = 0.0f;
        this.fadeCompassViewFacingNorth = true;
        this.isAnimating = false;
        initialize(context);
    }

    public CompassView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.rotation = 0.0f;
        this.fadeCompassViewFacingNorth = true;
        this.isAnimating = false;
        initialize(context);
    }

    private void initialize(Context context) {
        setEnabled(false);
        AbH.A1J(this, (int) (7zO.A0I(context).density * 48.0f));
    }

    private void notifyCompassAnimationListenerWhenAnimating() {
        if (this.isAnimating) {
            this.compassAnimationListener.onCompassAnimation();
        }
    }

    public void fadeCompassViewFacingNorth(boolean z) {
        this.fadeCompassViewFacingNorth = z;
    }

    public Drawable getCompassImage() {
        return getDrawable();
    }

    public void injectCompassAnimationListener(MapboxMap.OnCompassAnimationListener onCompassAnimationListener) {
        this.compassAnimationListener = onCompassAnimationListener;
    }

    public void isAnimating(boolean z) {
        this.isAnimating = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r0 <= 1.0d) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isFacingNorth() {
        /*
            r301 = this;
            r0 = r301
            float r0 = r0.rotation
            float r0 = java.lang.Math.abs(r0)
            r302 = r0
            r0 = r302
            double r0 = (double) r0
            r303 = r0
            r0 = 4645023210981556224(0x4076700000000000, double:359.0)
            r305 = r0
            r0 = r303
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 >= 0) goto L30
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r308 = r0
            r0 = r303
            r1 = r308
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r310 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r302 = r0
            r0 = r310
            if (r0 > 0) goto L36
        L30:
            r0 = 1
            r307 = r0
            r0 = 1
            r302 = r0
        L36:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.widgets.CompassView.isFacingNorth():boolean");
    }

    public boolean isFadeCompassViewFacingNorth() {
        return this.fadeCompassViewFacingNorth;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (isFacingNorth() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isHidden() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.fadeCompassViewFacingNorth
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r301
            boolean r0 = r0.isFacingNorth()
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 != 0) goto L16
        L14:
            r0 = 0
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.widgets.CompassView.isHidden():boolean");
    }

    public void resetAnimation() {
        0Sk r0 = this.fadeAnimator;
        if (r0 != null) {
            r0.A01();
        }
        this.fadeAnimator = null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isHidden()) {
            this.compassAnimationListener.onCompassAnimationFinished();
            resetAnimation();
            JQy.A19(this);
            0Sk A03 = C0Ad.A03(this);
            A03.A03(0.0f);
            A03.A05(500L);
            this.fadeAnimator = A03;
            A03.A08(new 0xW() { // from class: com.mapbox.mapboxsdk.maps.widgets.CompassView.1
                public void onAnimationEnd(View view) {
                    JQy.A18(CompassView.this);
                    CompassView.this.setVisibility(4);
                    CompassView.this.resetAnimation();
                }
            });
        }
    }

    public void setCompassImage(Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (!z || isHidden()) {
            resetAnimation();
            setAlpha(0.0f);
            i = 4;
        } else {
            resetAnimation();
            setAlpha(1.0f);
            i = 0;
        }
        setVisibility(i);
    }

    public void update(double d) {
        this.rotation = (float) d;
        if (isEnabled()) {
            if (isHidden()) {
                if (getVisibility() == 4 || this.fadeAnimator != null) {
                    return;
                }
                postDelayed(this, 500L);
                return;
            }
            resetAnimation();
            setAlpha(1.0f);
            setVisibility(0);
            notifyCompassAnimationListenerWhenAnimating();
            setRotation(this.rotation);
        }
    }
}
