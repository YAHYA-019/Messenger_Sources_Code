package com.facebook.messaging.rtc.incall.impl.root;

import X.0FI;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Br;
import X.1HG;
import X.2OB;
import X.4YU;
import X.5XU;
import X.AnonymousClass001;
import X.C0Cn;
import X.DKC;
import X.GOn;
import X.GTc;
import X.GfR;
import X.GqD;
import X.GqE;
import X.Hnk;
import X.Hsi;
import X.I9M;
import X.Io5;
import X.JQv;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet.DrawerBehavior;
import com.facebook.messaging.rtc.incall.impl.widgets.videoparticipantview.ViEAndroidGLES20ScaledSurfaceView;
import com.facebook.messaging.rtc.incall.impl.widgets.videoparticipantview.ViEAndroidGLES20ScaledVideoViewHolder;
import com.facebook.resources.ui.FbButton;
import com.facebook.widget.CustomFrameLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: RootGestureLayout.class */
public final class RootGestureLayout extends CustomFrameLayout {
    public boolean A00;
    public int A01;
    public final int A02;
    public final 1Br A03;
    public final GestureDetector A04;
    public final GestureDetector A05;
    public final C0Cn A06;

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0Cn, java.lang.Object] */
    public RootGestureLayout(Context context) {
        super(context);
        Context A08 = 4YU.A08(this);
        this.A03 = 1HG.A00(A08, 115775);
        this.A02 = ViewConfiguration.get(A08).getScaledPagingTouchSlop();
        this.A04 = new GestureDetector(A08, (GestureDetector.OnGestureListener) new GfR(this));
        this.A05 = new GestureDetector(A08, (GestureDetector.OnGestureListener) new GTc(this));
        this.A06 = new Object();
        this.A00 = true;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0Cn, java.lang.Object] */
    public RootGestureLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context A08 = 4YU.A08(this);
        this.A03 = 1HG.A00(A08, 115775);
        this.A02 = ViewConfiguration.get(A08).getScaledPagingTouchSlop();
        this.A04 = new GestureDetector(A08, (GestureDetector.OnGestureListener) new GfR(this));
        this.A05 = new GestureDetector(A08, (GestureDetector.OnGestureListener) new GTc(this));
        this.A06 = new Object();
        this.A00 = true;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0Cn, java.lang.Object] */
    public RootGestureLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context A08 = 4YU.A08(this);
        this.A03 = 1HG.A00(A08, 115775);
        this.A02 = ViewConfiguration.get(A08).getScaledPagingTouchSlop();
        this.A04 = new GestureDetector(A08, (GestureDetector.OnGestureListener) new GfR(this));
        this.A05 = new GestureDetector(A08, (GestureDetector.OnGestureListener) new GTc(this));
        this.A06 = new Object();
        this.A00 = true;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0Cn c0Cn = this.A06;
        return c0Cn.A01 | c0Cn.A00;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        boolean z = false;
        if (!this.A00) {
            return false;
        }
        if (((I9M) 1Br.A0B(this.A03)).A06(motionEvent) || (this.A00 && this.A04.onTouchEvent(motionEvent))) {
            z = true;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (i4 > 0) {
            this.A01 = 0;
            return;
        }
        int abs = this.A01 + Math.abs(i4);
        this.A01 = abs;
        if (abs > this.A02) {
            this.A00 = true;
            requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        11T.A0H(view, view2);
        this.A06.A01 = i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        11T.A0F(view2, 1);
        if (!(view2 instanceof RecyclerView)) {
            return false;
        }
        this.A00 = false;
        this.A01 = 0;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        11T.A0F(view, 0);
        this.A00 = true;
        this.A06.A01 = 0;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        Integer num;
        PointF A00;
        DrawerBehavior drawerBehavior;
        WeakReference weakReference;
        View A0G;
        View A0H;
        5XU r0;
        int A05 = 0FI.A05(938919651);
        11T.A0F(motionEvent, 0);
        I9M i9m = (I9M) 1Br.A0B(this.A03);
        i9m.A01 = true;
        Iterator it = i9m.A03.iterator();
        while (it.hasNext()) {
            GqD gqD = ((Io5) it.next()).A02;
            if (!i9m.A02.contains(gqD)) {
                if (!(gqD instanceof GqE)) {
                    if ((gqD instanceof GqD) && (weakReference = (drawerBehavior = gqD.A00).A0A) != null && (A0G = DKC.A0G(weakReference)) != null && (A0H = GOn.A0H(A0G)) != null) {
                        Hsi hsi = drawerBehavior.A0M;
                        A0H.getLocationInWindow(GOn.A1b());
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.setLocation(motionEvent.getX() - r0[0], motionEvent.getY() - r0[1]);
                        if (hsi.A00(A0G, obtain) && (r0 = drawerBehavior.A08) != null && r0.A03 != 0) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    ViEAndroidGLES20ScaledSurfaceView viEAndroidGLES20ScaledSurfaceView = ((GqE) gqD).A00;
                    ScaleGestureDetector scaleGestureDetector = viEAndroidGLES20ScaledSurfaceView.A04;
                    if (scaleGestureDetector == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    scaleGestureDetector.onTouchEvent(motionEvent);
                    GestureDetector gestureDetector = viEAndroidGLES20ScaledSurfaceView.A03;
                    if (gestureDetector == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    gestureDetector.onTouchEvent(motionEvent);
                    int actionMasked = motionEvent.getActionMasked();
                    boolean z2 = false;
                    if (actionMasked != 0) {
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked == 5) {
                                    PointF A002 = GqE.A00(motionEvent);
                                    if (A002 != null) {
                                        float f = A002.x;
                                        float f2 = A002.y;
                                        PointF pointF = viEAndroidGLES20ScaledSurfaceView.A09;
                                        pointF.x = f;
                                        pointF.y = f2;
                                        num = 0S2.A01;
                                    }
                                } else if (actionMasked == 6) {
                                    num = 0S2.A0C;
                                }
                                viEAndroidGLES20ScaledSurfaceView.A06 = num;
                            } else {
                                Integer num2 = viEAndroidGLES20ScaledSurfaceView.A06;
                                Integer num3 = 0S2.A01;
                                if (num2 == num3) {
                                    PointF A003 = GqE.A00(motionEvent);
                                    if (A003 != null) {
                                        if (viEAndroidGLES20ScaledSurfaceView.A00 > 1.01f) {
                                            float A02 = DKC.A02(viEAndroidGLES20ScaledSurfaceView);
                                            float A03 = DKC.A03(viEAndroidGLES20ScaledSurfaceView);
                                            float f3 = A003.x;
                                            PointF pointF2 = viEAndroidGLES20ScaledSurfaceView.A09;
                                            float f4 = f3 - pointF2.x;
                                            float f5 = A003.y - pointF2.y;
                                            RectF rectF = new RectF(0.0f, 0.0f, A02, A03);
                                            viEAndroidGLES20ScaledSurfaceView.getMatrix().mapRect(rectF);
                                            if (rectF.width() > A02) {
                                                if (f4 > 0.0f) {
                                                    float f6 = rectF.left;
                                                    if (f6 + f4 > 0.0f) {
                                                        f4 = -f6;
                                                    }
                                                }
                                                if (f4 < 0.0f) {
                                                    float f7 = rectF.right;
                                                    if (f7 + f4 < A02) {
                                                        f4 = A02 - f7;
                                                    }
                                                }
                                            }
                                            if (rectF.height() > A03) {
                                                float f8 = rectF.top;
                                                if (f8 > 0.0f) {
                                                    f5 = -f8;
                                                }
                                                float f9 = rectF.bottom;
                                                if (f9 < A03) {
                                                    f5 = A03 - f9;
                                                }
                                            }
                                            float f10 = A003.x;
                                            float f11 = A003.y;
                                            pointF2.x = f10;
                                            pointF2.y = f11;
                                            float f12 = viEAndroidGLES20ScaledSurfaceView.A01 + f4;
                                            viEAndroidGLES20ScaledSurfaceView.A01 = f12;
                                            float f13 = viEAndroidGLES20ScaledSurfaceView.A02 + f5;
                                            viEAndroidGLES20ScaledSurfaceView.A02 = f13;
                                            float f14 = viEAndroidGLES20ScaledSurfaceView.A00;
                                            viEAndroidGLES20ScaledSurfaceView.setTranslationX(f12 * f14);
                                            viEAndroidGLES20ScaledSurfaceView.setTranslationY(f13 * f14);
                                            Hnk hnk = viEAndroidGLES20ScaledSurfaceView.A05;
                                            if (hnk != null) {
                                                float f15 = viEAndroidGLES20ScaledSurfaceView.A00;
                                                ViEAndroidGLES20ScaledVideoViewHolder viEAndroidGLES20ScaledVideoViewHolder = hnk.A01;
                                                Handler handler = viEAndroidGLES20ScaledVideoViewHolder.getHandler();
                                                Runnable runnable = viEAndroidGLES20ScaledVideoViewHolder.A08;
                                                handler.removeCallbacks(runnable);
                                                viEAndroidGLES20ScaledVideoViewHolder.getHandler().postDelayed(runnable, 1000L);
                                                2OB r02 = viEAndroidGLES20ScaledVideoViewHolder.A03;
                                                if (r02 == null) {
                                                    throw AnonymousClass001.A0N("Required value was null.");
                                                }
                                                r02.setText(1BK.A0v(viEAndroidGLES20ScaledVideoViewHolder.getContext(), String.valueOf((int) (f15 * 100.0f)), 2131968290));
                                                if (viEAndroidGLES20ScaledVideoViewHolder.A04 && viEAndroidGLES20ScaledVideoViewHolder.A05) {
                                                    JQv jQv = viEAndroidGLES20ScaledVideoViewHolder.A01;
                                                    if (jQv == null) {
                                                        throw AnonymousClass001.A0N("Required value was null.");
                                                    }
                                                    if (((ViEAndroidGLES20ScaledSurfaceView) jQv).A00 > 1.01f) {
                                                        FbButton fbButton = viEAndroidGLES20ScaledVideoViewHolder.A02;
                                                        if (fbButton == null) {
                                                            throw AnonymousClass001.A0N("Required value was null.");
                                                        }
                                                        fbButton.setVisibility(8);
                                                        2OB r03 = viEAndroidGLES20ScaledVideoViewHolder.A03;
                                                        if (r03 == null) {
                                                            throw AnonymousClass001.A0N("Required value was null.");
                                                        }
                                                        r03.setVisibility(0);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (1Br.A07(viEAndroidGLES20ScaledSurfaceView.A0B).AZk(36312080179793760L) && (A00 = GqE.A00(motionEvent)) != null) {
                                    float f16 = A00.x;
                                    float f17 = A00.y;
                                    PointF pointF3 = viEAndroidGLES20ScaledSurfaceView.A09;
                                    pointF3.x = f16;
                                    pointF3.y = f17;
                                    viEAndroidGLES20ScaledSurfaceView.A06 = num3;
                                }
                            }
                            z = true;
                            break;
                        }
                        if (viEAndroidGLES20ScaledSurfaceView.A06 == 0S2.A0C) {
                            num = 0S2.A00;
                            viEAndroidGLES20ScaledSurfaceView.A06 = num;
                        }
                        Hnk hnk2 = viEAndroidGLES20ScaledSurfaceView.A05;
                        if (hnk2 != null) {
                            if (viEAndroidGLES20ScaledSurfaceView.A06 != 0S2.A00) {
                                z2 = true;
                            }
                            hnk2.A00(z2);
                        }
                        z = true;
                        break;
                    }
                    continue;
                }
            }
        }
        z = false;
        i9m.A01 = false;
        I9M.A00(i9m);
        I9M.A01(i9m);
        if (z) {
            i = -1193887970;
        } else {
            this.A05.onTouchEvent(motionEvent);
            this.A04.onTouchEvent(motionEvent);
            i = 1254500417;
        }
        0FI.A0B(i, A05);
        return true;
    }
}
