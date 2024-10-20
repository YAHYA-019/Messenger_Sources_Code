package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Scroller;
import com.facebook.fbui.widget.slidingviewgroup.SlidingViewGroup;
import com.facebook.widget.touch.ViewDragHelper$Callback;
import java.util.Arrays;

/* loaded from: LE4.class */
public class LE4 {
    public float A00;
    public float A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public VelocityTracker A08;
    public View A09;
    public Scroller A0A;
    public Scroller A0B;
    public boolean A0C;
    public float[] A0D;
    public float[] A0E;
    public float[] A0F;
    public float[] A0G;
    public int[] A0H;
    public int[] A0I;
    public int[] A0J;
    public Koq A0K;
    public final ViewGroup A0L;
    public final ViewDragHelper$Callback A0M;
    public int A02 = -1;
    public final Runnable A0N = new Lld(this);

    public LE4(Context context, ViewGroup viewGroup, ViewDragHelper$Callback viewDragHelper$Callback) {
        this.A0L = viewGroup;
        this.A0M = viewDragHelper$Callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A04 = (int) ((7zO.A0I(context).density * 20.0f) + 0.5f);
        this.A07 = viewConfiguration.getScaledTouchSlop();
        this.A00 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A01 = viewConfiguration.getScaledMinimumFlingVelocity();
        Scroller scroller = new Scroller(context);
        this.A0B = scroller;
        this.A0A = scroller;
        this.A0K = new Koq(this);
    }

    private void A00() {
        VelocityTracker velocityTracker = this.A08;
        float f = this.A00;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.A08.getXVelocity(this.A02);
        float f2 = this.A01;
        int i = (Math.abs(xVelocity) > f2 ? 1 : (Math.abs(xVelocity) == f2 ? 0 : -1));
        float yVelocity = this.A08.getYVelocity(this.A02);
        float abs = Math.abs(yVelocity);
        if (abs < f2) {
            f = 0.0f;
        } else if (abs <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        A05(this, f);
    }

    private void A01(int i) {
        float[] fArr = this.A0D;
        if (fArr == null || fArr.length <= i) {
            return;
        }
        fArr[i] = 0.0f;
        this.A0E[i] = 0.0f;
        this.A0F[i] = 0.0f;
        this.A0G[i] = 0.0f;
        this.A0J[i] = 0;
        this.A0H[i] = 0;
        this.A0I[i] = 0;
        this.A06 = ((1 << i) ^ (-1)) & this.A06;
    }

    private void A02(int i, float f, float f2) {
        float[] fArr = this.A0D;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.A0E;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.A0F;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.A0G;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.A0J;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.A0H;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.A0I;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.A0D = fArr2;
            fArr = fArr2;
            this.A0E = fArr3;
            this.A0F = fArr4;
            this.A0G = fArr5;
            this.A0J = iArr;
            this.A0H = iArr2;
            this.A0I = iArr3;
        }
        this.A0F[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.A0E;
        this.A0G[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.A0J;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.A0L;
        int left = viewGroup.getLeft();
        int i5 = this.A04;
        int i6 = AnonymousClass001.A1R(i3, left + i5) ? 1 : 0;
        if (i4 < viewGroup.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > viewGroup.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > viewGroup.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.A06 |= 1 << i;
    }

    private void A03(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= pointerCount) {
                return;
            }
            int pointerId = motionEvent.getPointerId(i2);
            if (A07(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.A0F[pointerId] = x;
                this.A0G[pointerId] = y;
            }
            i = i2 + 1;
        }
    }

    public static void A04(SlidingViewGroup slidingViewGroup, float f) {
        LE4 le4 = slidingViewGroup.A07;
        View childAt = slidingViewGroup.getChildAt(0);
        le4.A09 = childAt;
        le4.A0C = true;
        le4.A0M.A00(childAt, -f);
        le4.A0C = false;
        if (le4.A03 == 1) {
            le4.A0D(0);
        }
    }

    public static void A05(LE4 le4, float f) {
        le4.A0C = true;
        le4.A0M.A00(le4.A09, f);
        le4.A0C = false;
        if (le4.A03 == 1) {
            le4.A0D(0);
        }
    }

    public static void A06(LE4 le4, int i, int i2, int i3) {
        int left = le4.A09.getLeft();
        int top = le4.A09.getTop();
        if (i2 != 0) {
            le4.A09.offsetLeftAndRight(-left);
        }
        if (i3 != 0) {
            ViewDragHelper$Callback viewDragHelper$Callback = le4.A0M;
            View view = le4.A09;
            if (!(viewDragHelper$Callback instanceof Jwg)) {
                SlidingViewGroup slidingViewGroup = ((Jwb) viewDragHelper$Callback).A00;
                if (slidingViewGroup.A0F != null) {
                    int height = slidingViewGroup.getHeight();
                    MFG mfg = null;
                    MFG mfg2 = null;
                    for (MFG mfg3 : slidingViewGroup.A0F) {
                        if (mfg == null) {
                            mfg = mfg3;
                        } else {
                            int B3v = mfg3.B3v(view, height);
                            if (B3v >= mfg2.B3v(view, height)) {
                                if (B3v > mfg.B3v(view, height)) {
                                    mfg = mfg3;
                                }
                            }
                        }
                        mfg2 = mfg3;
                    }
                    int B3v2 = mfg == null ? i : slidingViewGroup.A0E ? mfg.B3v(view, height) : height - slidingViewGroup.A01;
                    int B3v3 = mfg2 == null ? i : mfg2.B3v(view, height);
                    KMK kmk = slidingViewGroup.A06;
                    int max = Math.max(B3v3, Math.min(B3v2, kmk instanceof C3284Jpf ? height - i : i + view.getMeasuredHeight()));
                    if (!slidingViewGroup.A0E) {
                        slidingViewGroup.postInvalidate();
                    }
                    i = kmk instanceof C3284Jpf ? height - max : max - view.getMeasuredHeight();
                }
            }
            le4.A09.offsetTopAndBottom(i - top);
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        le4.A0M.A01(le4.A09, i);
    }

    private boolean A07(int i) {
        if (((1 << i) & this.A06) != 0) {
            return true;
        }
        android.util.Log.e("ViewDragHelper", 0Pz.A0d(4YT.A00(642), 4YT.A00(478), i));
        return false;
    }

    private boolean A08(View view, int i) {
        if (view == this.A09 && this.A02 == i) {
            return true;
        }
        if (view == null) {
            return false;
        }
        this.A02 = i;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0L;
        if (parent == viewGroup) {
            this.A09 = view;
            this.A02 = i;
            A0D(1);
            return true;
        }
        0fH.A14("ViewDragHelper", "The passed in childView (%s).", new Object[]{view});
        0fH.A14("ViewDragHelper", "The parent of the childView (%s).", new Object[]{view.getParent()});
        int childCount = viewGroup.getChildCount();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= childCount) {
                break;
            }
            0fH.A14("ViewDragHelper", "The child of the parentView at index:%d (%s).", new Object[]{Integer.valueOf(i3), viewGroup.getChildAt(i3)});
            i2 = i3 + 1;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        A0k.append(viewGroup);
        throw AnonymousClass002.A0D(")", A0k);
    }

    public static boolean A09(LE4 le4, int i, int i2, int i3, int i4) {
        int i5 = i4;
        int i6 = i3;
        int i7 = i2;
        int left = le4.A09.getLeft();
        int top = le4.A09.getTop();
        int i8 = -left;
        int i9 = i - top;
        if (i8 == 0 && i9 == 0) {
            le4.A0B.abortAnimation();
            le4.A0D(0);
            return false;
        }
        if (i4 < 0) {
            int i10 = (int) le4.A01;
            int i11 = (int) le4.A00;
            int i12 = i11;
            int abs = Math.abs(i7);
            if (abs < i10) {
                i7 = 0;
            } else if (abs > i11) {
                if (i7 <= 0) {
                    i12 = -i11;
                }
                i7 = i12;
            }
            int abs2 = Math.abs(i6);
            if (abs2 < i10) {
                i6 = 0;
            } else if (abs2 > i11) {
                if (i6 <= 0) {
                    i11 = -i11;
                }
                i6 = i11;
            }
            int abs3 = Math.abs(i8);
            int abs4 = Math.abs(i9);
            int abs5 = Math.abs(i7);
            int abs6 = Math.abs(i6);
            int i13 = abs5 + abs6;
            float f = abs3;
            float f2 = abs3 + abs4;
            float f3 = f2;
            if (i7 != 0) {
                f = abs5;
                f2 = i13;
            }
            float f4 = f / f2;
            float f5 = abs4;
            if (i6 != 0) {
                f5 = abs6;
                f3 = i13;
            }
            float f6 = f5 / f3;
            ViewDragHelper$Callback viewDragHelper$Callback = le4.A0M;
            int i14 = 0;
            ViewGroup viewGroup = le4.A0L;
            int width = viewGroup.getWidth();
            if (i8 != 0) {
                i14 = Math.min(JQz.A0A(abs3, width, width / 2, i7, 0), 600);
            }
            int height = (viewDragHelper$Callback instanceof Jwb ? ((Jwb) viewDragHelper$Callback).A00 : ((Jwg) viewDragHelper$Callback).A00).getHeight();
            int width2 = viewGroup.getWidth();
            i5 = (int) ((i14 * f4) + ((i9 == 0 ? 0 : Math.min(JQz.A0A(abs4, width2, width2 / 2, i6, height), 600)) * f6));
        }
        le4.A0B.startScroll(left, top, i8, i9, i5);
        le4.A05 = top + i9;
        le4.A0D(2);
        return true;
    }

    public int A0A(int i) {
        this.A0B.abortAnimation();
        int i2 = (-1) << (-1);
        int i3 = (-1) >>> 1;
        this.A0B.fling(0, 0, 0, i, i2, i3, i2, i3);
        int finalY = this.A0B.getFinalY();
        this.A0B.abortAnimation();
        return finalY;
    }

    public void A0B() {
        A0C();
        if (this.A03 == 2) {
            this.A0B.getCurrX();
            this.A0B.getCurrY();
            this.A0B.abortAnimation();
            this.A0B.getCurrX();
            this.A0M.A01(this.A09, this.A0B.getCurrY());
        }
        A0D(0);
    }

    public void A0C() {
        this.A02 = -1;
        float[] fArr = this.A0D;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A0E, 0.0f);
            Arrays.fill(this.A0F, 0.0f);
            Arrays.fill(this.A0G, 0.0f);
            Arrays.fill(this.A0J, 0);
            Arrays.fill(this.A0H, 0);
            Arrays.fill(this.A0I, 0);
            this.A06 = 0;
        }
        VelocityTracker velocityTracker = this.A08;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A08 = null;
        }
    }

    public void A0D(int i) {
        SlidingViewGroup slidingViewGroup;
        View A0V;
        KTY kty;
        if (this.A03 != i) {
            this.A03 = i;
            ViewDragHelper$Callback viewDragHelper$Callback = this.A0M;
            if (!(viewDragHelper$Callback instanceof Jwb) || (A0V = JQx.A0V((slidingViewGroup = ((Jwb) viewDragHelper$Callback).A00))) == null || !A0V.isLaidOut() || (kty = slidingViewGroup.A04) == null) {
                if (i != 0) {
                    return;
                }
            } else {
                if (i != 0) {
                    if (i != 1) {
                        kty.A02(A0V, slidingViewGroup.A03);
                        return;
                    } else {
                        kty.A00(A0V);
                        return;
                    }
                }
                MFG A01 = SlidingViewGroup.A01(slidingViewGroup);
                slidingViewGroup.A03 = A01;
                slidingViewGroup.A04.A03(A0V, A01);
            }
            this.A09 = null;
        }
    }

    public void A0E(int i, int i2) {
        if (!this.A0C) {
            throw AnonymousClass001.A0N("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        A09(this, i, (int) this.A08.getXVelocity(this.A02), (int) this.A08.getYVelocity(this.A02), i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x011d, code lost:
    
        if (r301.A02 == (-1)) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE4.A0F(android.view.MotionEvent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b8, code lost:
    
        if (r301.A0B.isFinished() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0G() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE4.A0G():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ee, code lost:
    
        if (r316 == r301.A09) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x028b, code lost:
    
        A08(r316, r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0288, code lost:
    
        if (r301.A03 == 2) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0H(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE4.A0H(android.view.MotionEvent):boolean");
    }
}
