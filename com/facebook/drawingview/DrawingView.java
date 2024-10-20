package com.facebook.drawingview;

import X.0FI;
import X.0Pz;
import X.0fH;
import X.1BK;
import X.2DX;
import X.2EU;
import X.AbF;
import X.AnonymousClass524;
import X.C1oo;
import X.DKC;
import X.DKD;
import X.DKI;
import X.FYE;
import X.G8a;
import X.GJn;
import X.S78;
import X.S79;
import X.S7A;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.acra.util.JavaProcFileReader;
import com.facebook.drawingview.model.DrawPoint;
import com.facebook.drawingview.model.Stroke;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: DrawingView.class */
public class DrawingView extends View {
    public static final HashMap A0V = new G8a(0);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public Bitmap A08;
    public Canvas A09;
    public Paint A0A;
    public PorterDuff.Mode A0B;
    public VelocityTracker A0C;
    public 2EU A0D;
    public 2EU A0E;
    public GJn A0F;
    public Stroke A0G;
    public 2DX A0H;
    public LinkedList A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public int A0M;
    public int A0N;
    public Paint A0O;
    public Integer A0P;
    public final float A0Q;
    public final Runnable A0R;
    public final Runnable A0S;
    public final Runnable A0T;
    public final Queue A0U;

    public DrawingView(Context context) {
        this(context, null);
    }

    public DrawingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0A = DKC.A09();
        this.A0B = PorterDuff.Mode.SRC_OVER;
        this.A0I = AbF.A1F();
        this.A0L = true;
        this.A0U = AbF.A1F();
        this.A0Q = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A0R = new S78(this);
        this.A0T = new S79(this);
        this.A0S = new S7A(this);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C1oo.A0h);
        this.A02 = obtainStyledAttributes.getDimension(1, 12.0f);
        this.A05 = obtainStyledAttributes.getColor(0, context2.getColor(2132214411));
        obtainStyledAttributes.recycle();
        this.A0A.setAntiAlias(true);
        this.A0A.setColor(this.A05);
        DKC.A1L(this.A0A);
        this.A0A.setStrokeJoin(Paint.Join.ROUND);
        this.A0A.setStrokeWidth(this.A02);
        this.A0A.setStrokeCap(Paint.Cap.ROUND);
        DKD.A19(this.A0A, this.A0B);
        Paint A0A = DKC.A0A(4);
        this.A0O = A0A;
        A0A.setAntiAlias(true);
        this.A0O.setFilterBitmap(true);
    }

    public static Canvas A00(DrawingView drawingView) {
        2EU r0;
        if (drawingView.A09 == null || ((r0 = drawingView.A0D) != null && !r0.A0A())) {
            drawingView.A02();
        }
        return drawingView.A09;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PEN_STROKE";
            case 2:
                return "PEN_SCRIBBLE";
            case 3:
                return "PEN_DOWN_IDLE";
            case 4:
                return "PEN_UP";
            default:
                return "PEN_DOWN";
        }
    }

    private void A02() {
        boolean z;
        int i;
        Bitmap createBitmap;
        Bitmap bitmap = this.A08;
        if (bitmap != null) {
            bitmap.recycle();
            z = true;
        } else {
            z = false;
        }
        int i2 = this.A0N;
        if (i2 == 0 || (i = this.A0M) == 0) {
            return;
        }
        try {
            2DX r0 = this.A0H;
            if (r0 != null) {
                2EU A04 = r0.A04(i2, i);
                this.A0D = A04;
                createBitmap = (Bitmap) A04.A09();
            } else {
                createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            }
            this.A08 = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            this.A09 = canvas;
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        } catch (OutOfMemoryError unused) {
            GJn gJn = this.A0F;
            if (gJn != null) {
                gJn.CAN(this.A0N, this.A0M, z);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.drawingview.model.DrawPoint, com.facebook.drawingview.model.DrawLine, java.lang.Object, com.facebook.drawingview.model.DrawQuad] */
    private void A03(float f, float f2, float f3, float f4) {
        if (A00(this) != null) {
            float f5 = this.A03;
            float f6 = this.A04;
            float f7 = this.A02;
            int i = this.A05;
            PorterDuff.Mode mode = this.A0B;
            ?? obj = new Object();
            obj.mX = f3;
            obj.mY = f4;
            obj.mStrokeWidth = f7;
            obj.mColour = i;
            obj.mXfermode = mode;
            obj.mPreviousX = f5;
            obj.mPreviousY = f6;
            obj.mControlX = f;
            obj.mControlY = f2;
            DKI.A0b(this, (DrawPoint) obj, f3, f4);
        }
    }

    public static void A04(DrawingView drawingView) {
        if (A00(drawingView) != null) {
            Iterator it = drawingView.A0I.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((Stroke) it.next()).mDrawPoints.iterator();
                while (it2.hasNext()) {
                    ((DrawPoint) it2.next()).A00(A00(drawingView), drawingView.A0A, drawingView);
                }
            }
        }
    }

    public static void A05(DrawingView drawingView, Integer num) {
        Runnable runnable;
        Integer num2 = drawingView.A0P;
        if (num != num2) {
            0fH.A0j("DrawingView", 0Pz.A0v("DrawingAudioState: ", num2 != null ? A01(num2) : "null", JavaProcFileReader.LS_SYMLINK_ARROW, A01(num)));
            int intValue = num.intValue();
            if (intValue != 0) {
                long j = 50;
                if (intValue == 1) {
                    drawingView.removeCallbacks(drawingView.A0R);
                    drawingView.removeCallbacks(drawingView.A0T);
                    runnable = drawingView.A0S;
                } else if (intValue == 2) {
                    drawingView.removeCallbacks(drawingView.A0R);
                    drawingView.removeCallbacks(drawingView.A0S);
                    runnable = drawingView.A0T;
                } else if (intValue != 3) {
                    drawingView.removeCallbacks(drawingView.A0R);
                } else {
                    drawingView.A0J = false;
                    drawingView.A0K = true;
                }
                drawingView.postDelayed(runnable, j);
            }
            drawingView.A0P = num;
        }
    }

    public float getStrokeWidth() {
        return this.A02;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        if (this.A0I.isEmpty() || (bitmap = this.A08) == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.A08, 0.0f, 0.0f, this.A0O);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!AnonymousClass524.A00(getContext())) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            i = 2;
        } else {
            if (actionMasked != 9) {
                if (actionMasked == 10) {
                    i = 1;
                }
                return onTouchEvent(motionEvent);
            }
            i = 0;
        }
        motionEvent.setAction(i);
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("DrawingView_super_state_key"));
            this.A02 = bundle.getFloat("stroke_width_key");
            this.A05 = bundle.getInt("stroke_color_key");
            PorterDuff.Mode mode = (PorterDuff.Mode) A0V.get(bundle.getString("strokes_xfermode_key"));
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_OVER;
            }
            this.A0B = mode;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("strokes_key");
            if (parcelableArrayList != null) {
                this.A0I.addAll(parcelableArrayList);
            }
            if (this.A0I.isEmpty()) {
                return;
            }
            this.A0N = bundle.getInt("bitmap_width");
            this.A0M = bundle.getInt("bitmap_height");
            if (this.A08 == null) {
                A02();
            }
            getViewTreeObserver().addOnGlobalLayoutListener(new FYE(this, 2));
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("DrawingView_super_state_key", onSaveInstanceState);
        A05.putFloat("stroke_width_key", this.A02);
        A05.putInt("stroke_color_key", this.A05);
        A05.putInt("bitmap_width", this.A0N);
        A05.putInt("bitmap_height", this.A0M);
        A05.putString("strokes_xfermode_key", this.A0B.name());
        if (this.A0L) {
            A05.putParcelableArrayList("strokes_key", 1BK.A17(this.A0I));
        }
        return A05;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int A06 = 0FI.A06(-860786481);
        if (i == 0 || i2 == 0) {
            i5 = 177898903;
        } else {
            int abs = Math.abs(i - i3);
            int abs2 = Math.abs(i2 - i4);
            if (abs > 1 || abs2 > 1) {
                this.A0M = i2;
                this.A0N = i;
                A02();
                A04(this);
            }
            i5 = -86275804;
        }
        0FI.A0C(i5, A06);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0202 A[LOOP:0: B:52:0x01eb->B:54:0x0202, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a1 A[EDGE_INSN: B:55:0x02a1->B:56:0x02a1 BREAK  A[LOOP:0: B:52:0x01eb->B:54:0x0202], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0342 A[LOOP:1: B:66:0x0331->B:68:0x0342, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0220  */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, com.facebook.drawingview.model.Stroke] */
    /* JADX WARN: Type inference failed for: r0v57, types: [com.facebook.drawingview.model.DrawPoint, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [com.facebook.drawingview.model.DrawPoint, com.facebook.drawingview.model.DrawLine, java.lang.Object] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 1503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawingview.DrawingView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setStrokeWidth(float f) {
        this.A02 = f;
        this.A0A.setStrokeWidth(f);
    }
}
