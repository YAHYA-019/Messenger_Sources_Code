package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.771, reason: invalid class name */
/* loaded from: 771.class */
public final class AnonymousClass771 {
    public View A00;
    public 5vW A01;
    public boolean A02;
    public final GestureDetector A03;
    public final boolean A04;
    public final boolean A05;

    public AnonymousClass771(final Context context, final 74E r303, final 7Tg r304, final C75c c75c, boolean z, boolean z2) {
        11T.A0F(context, 1);
        this.A05 = z;
        this.A04 = z2;
        this.A03 = new 66G(context, new GestureDetector.SimpleOnGestureListener() { // from class: X.774
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                AnonymousClass771 anonymousClass771 = this;
                5vW r0 = anonymousClass771.A01;
                if (r0 == null) {
                    return false;
                }
                C75c c75c2 = c75c;
                if (c75c2 == null || !c75c2.A01(r0)) {
                    anonymousClass771.A01 = null;
                    anonymousClass771.A00 = null;
                    return false;
                }
                c75c2.A00(r0);
                anonymousClass771.A01 = null;
                anonymousClass771.A00 = null;
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                View view;
                11T.A0F(motionEvent, 0);
                AnonymousClass771 anonymousClass771 = this;
                5vW r0 = anonymousClass771.A01;
                if (r0 == null || (view = anonymousClass771.A00) == null) {
                    return;
                }
                7Tg r02 = r304;
                if (r02 != null && r02.BQh(r0)) {
                    r02.C5J(context, motionEvent, view, r0);
                }
                anonymousClass771.A01 = null;
                anonymousClass771.A00 = null;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                View view;
                74E r0;
                AnonymousClass771 anonymousClass771 = this;
                5vW r02 = anonymousClass771.A01;
                if (r02 == null || (view = anonymousClass771.A00) == null) {
                    return false;
                }
                if ((anonymousClass771.A05 && !anonymousClass771.A02) || (r0 = r303) == null || !r0.BQh(r02)) {
                    anonymousClass771.A01 = null;
                    anonymousClass771.A00 = null;
                    return false;
                }
                r0.BoE(context, view, r02);
                anonymousClass771.A01 = null;
                anonymousClass771.A00 = null;
                return true;
            }
        });
    }

    public final boolean A00(MotionEvent motionEvent, View view, 5vW r304) {
        boolean z = true;
        11T.A0F(r304, 1);
        this.A01 = r304;
        this.A00 = view;
        if (this.A05 && motionEvent.getAction() == 0) {
            this.A02 = true;
        } else {
            z = this.A03.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 3) {
                this.A01 = null;
                this.A00 = null;
                return z;
            }
        }
        return z;
    }
}
