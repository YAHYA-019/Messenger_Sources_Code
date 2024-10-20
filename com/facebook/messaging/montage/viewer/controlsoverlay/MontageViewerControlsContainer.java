package com.facebook.messaging.montage.viewer.controlsoverlay;

import X.0FI;
import X.2MR;
import X.7zM;
import X.C2rY;
import X.DKC;
import X.JFL;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import com.facebook.resources.ui.FbFrameLayout;

/* loaded from: MontageViewerControlsContainer.class */
public class MontageViewerControlsContainer extends FbFrameLayout {
    public int A00;
    public View A01;
    public JFL A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public float A07;
    public float A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final int A0E;

    public MontageViewerControlsContainer(Context context) {
        this(context, null);
    }

    public MontageViewerControlsContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MontageViewerControlsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = false;
        this.A07 = -1.0f;
        this.A08 = -1.0f;
        this.A05 = true;
        this.A03 = true;
        Resources resources = getResources();
        this.A0B = resources.getDimensionPixelSize(2132279605);
        this.A0A = resources.getDimensionPixelSize(2132279315);
        this.A09 = resources.getDimensionPixelSize(2132279342);
        this.A0E = (int) Math.pow(ViewConfiguration.get(context).getScaledTouchSlop(), 2.0d);
        this.A0C = DKC.A0A(5);
        this.A0D = DKC.A0A(5);
        this.A00 = 7zM.A02(getContext(), 2MR.A09);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if ((r301.A07 / X.DKC.A02(r301)) < 0.25f) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r301.A07 > (X.DKC.A02(r301) * 0.75f)) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r303 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A02()
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L38
            r0 = r301
            android.content.Context r0 = r0.getContext()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3a
            r0 = r304
            boolean r0 = X.C2rY.A00(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3a
            r0 = r301
            float r0 = X.DKC.A02(r0)
            r1 = 1061158912(0x3f400000, float:0.75)
            float r0 = r0 * r1
            r305 = r0
            r0 = r301
            float r0 = r0.A07
            r306 = r0
            r0 = r306
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r302 = r0
            r0 = r302
            if (r0 <= 0) goto L38
        L36:
            r0 = 1
            r303 = r0
        L38:
            r0 = r303
            return r0
        L3a:
            r0 = r301
            float r0 = r0.A07
            r305 = r0
            r0 = r301
            float r0 = X.DKC.A02(r0)
            r306 = r0
            r0 = r305
            r1 = r306
            float r0 = r0 / r1
            r305 = r0
            r0 = 1048576000(0x3e800000, float:0.25)
            r306 = r0
            r0 = r305
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r302 = r0
            r0 = r302
            if (r0 >= 0) goto L38
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.controlsoverlay.MontageViewerControlsContainer.A00():boolean");
    }

    public void A01(boolean z) {
        ViewPropertyAnimator alpha;
        long j;
        View view = this.A01;
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (z) {
                alpha = animate.alpha(1.0f);
                j = 0;
            } else {
                alpha = animate.alpha(0.0f);
                j = 300;
            }
            alpha.setStartDelay(j).start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r301.A08 != (-1.0f)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02() {
        /*
            r301 = this;
            r0 = r301
            float r0 = r0.A07
            r302 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r303 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L25
            r0 = r301
            float r0 = r0.A08
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L2b
        L25:
            r0 = 1
            r305 = r0
            r0 = 1
            r302 = r0
        L2b:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.controlsoverlay.MontageViewerControlsContainer.A02():boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.A04) {
            if (this.A05) {
                canvas.drawPaint(this.A0C);
            }
            if (this.A03 && A00()) {
                canvas.drawPaint(this.A0D);
            }
        }
        super.dispatchDraw(canvas);
        if (this.A04) {
            int i = 1912602624;
            if (this.A06) {
                i = -1308622848;
            }
            canvas.drawColor(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View] */
    @Override // android.view.View
    public void onFinishInflate() {
        int A06 = 0FI.A06(806012648);
        super.onFinishInflate();
        MontageViewerControlsContainer findViewById = findViewById(2131364484);
        this.A01 = findViewById;
        if (findViewById == null) {
            findViewById = this;
        }
        this.A01 = findViewById;
        0FI.A0C(-709981322, A06);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(2105106695);
        super.onSizeChanged(i, i2, i3, i4);
        if (getWidth() != 0 && getHeight() != 0) {
            float f = i2;
            float[] fArr = {0.0f, this.A0A / f, (i2 - this.A09) / f, 1.0f};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.A0C.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, new int[]{1023410176, 0, 0, 1023410176}, fArr, tileMode));
            Paint paint = this.A0D;
            Context context = getContext();
            paint.setShader(new LinearGradient((context == null || !C2rY.A00(context)) ? 0 : getWidth() - this.A0B, 0.0f, (context == null || !C2rY.A00(context)) ? this.A0B : getWidth(), 0.0f, 1023410176, 0, tileMode));
        }
        0FI.A0C(-457145736, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0227, code lost:
    
        if (r310 != null) goto L51;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.controlsoverlay.MontageViewerControlsContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
