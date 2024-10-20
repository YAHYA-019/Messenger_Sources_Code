package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: X.5ed, reason: invalid class name */
/* loaded from: 5ed.class */
public final class C5ed {
    public int A05;
    public int A06;
    public Integer A0C;
    public Integer A0E;
    public boolean A0F;
    public boolean A0G;
    public Context A0H;
    public GestureDetector A0I;
    public Integer A0D = 0S2.A01;
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = 0.0f;
    public float A03 = 0.0f;
    public Integer A0A = null;
    public Integer A0B = 0S2.A00;
    public VelocityTracker A0J = null;
    public int A04 = 0;
    public C5ec A07 = null;
    public C5eb A08 = null;
    public C5ee A09 = null;

    public C5ed(Context context) {
        this.A0I = new GestureDetector(context, new GestureDetector.OnGestureListener() { // from class: X.5ef
            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x0105, code lost:
            
                if (r309 == X.0S2.A01) goto L41;
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x016d A[ORIG_RETURN, RETURN] */
            @Override // android.view.GestureDetector.OnGestureListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onFling(android.view.MotionEvent r302, android.view.MotionEvent r303, float r304, float r305) {
                /*
                    Method dump skipped, instructions count: 367
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5ef.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }
        });
        this.A0H = context;
    }

    private void A00() {
        if (this.A0F) {
            return;
        }
        Context context = this.A0H;
        if (context == null) {
            throw AnonymousClass001.A0N("Init Context must not be null");
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Integer num = this.A0C;
        int intValue = num != null ? num.intValue() : viewConfiguration.getScaledPagingTouchSlop();
        Integer num2 = this.A0E;
        int intValue2 = num2 != null ? num2.intValue() : viewConfiguration.getScaledTouchSlop();
        int scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        int scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0C = Integer.valueOf(intValue);
        this.A0E = Integer.valueOf(intValue2);
        this.A06 = scaledMinimumFlingVelocity;
        this.A05 = scaledMaximumFlingVelocity;
        this.A0F = true;
        this.A0F = true;
        this.A0H = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (java.lang.Math.abs(r301.A03) >= r0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            r301 = this;
            r0 = r301
            r0.A00()
            r0 = r301
            java.lang.Integer r0 = r0.A0E
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L48
            r0 = r302
            int r0 = r0.intValue()
            r303 = r0
        L12:
            r0 = r301
            float r0 = r0.A02
            float r0 = java.lang.Math.abs(r0)
            r304 = r0
            r0 = r303
            float r0 = (float) r0
            r305 = r0
            r0 = r304
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 >= 0) goto L3e
            r0 = r301
            float r0 = r0.A03
            float r0 = java.lang.Math.abs(r0)
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r303 = r0
            r0 = 1
            r306 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 < 0) goto L45
        L3e:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L45:
            r0 = r306
            return r0
        L48:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5ed.A01():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02d6, code lost:
    
        if ((r0 & 1) == 1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r0 != 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0168, code lost:
    
        if ((r302.A04 & 1) == 1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02d9, code lost:
    
        r322 = X.0S2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0190, code lost:
    
        if ((r302.A04 & 2) == 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x032b, code lost:
    
        if ((r302.A04 & 4) == 4) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x032e, code lost:
    
        r322 = X.0S2.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x034c, code lost:
    
        if (X.HHM.A00(r315, r302.A04) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d5, code lost:
    
        if (r304 == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(android.view.MotionEvent r301, X.C5ed r302) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5ed.A02(android.view.MotionEvent, X.5ed):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0143, code lost:
    
        if (r0 == X.0S2.A01) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(android.view.MotionEvent r301, X.C5ed r302) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5ed.A03(android.view.MotionEvent, X.5ed):boolean");
    }

    public void A04() {
        C5eb c5eb;
        if (this.A0B == 0S2.A0C && (c5eb = this.A08) != null) {
            c5eb.Bv0();
        }
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0B = 0S2.A0N;
        VelocityTracker velocityTracker = this.A0J;
        this.A0J = null;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
    }

    public void A05(Integer... numArr) {
        int i;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= numArr.length) {
                return;
            }
            Integer num = numArr[i3];
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 4;
                        break;
                    case 3:
                        i = 8;
                        break;
                    default:
                        i = 1;
                        break;
                }
                this.A04 = i | this.A04;
            }
            i2 = i3 + 1;
        }
    }
}
