package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: X.872, reason: invalid class name */
/* loaded from: 872.class */
public class AnonymousClass872 extends GestureDetector.SimpleOnGestureListener {
    public View A00;
    public Integer A01;
    public String A02;
    public final AYy A03;
    public final Function1 A04;

    public AnonymousClass872(AYy aYy, Function1 function1) {
        this.A03 = aYy;
        this.A04 = function1;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        String str;
        Integer num;
        View view = this.A00;
        boolean z = false;
        if (view != null && (str = this.A02) != null && (num = this.A01) != null) {
            if (!this.A03.CLg(view, str, num.intValue())) {
                this.A04.invoke(view);
            }
            this.A00 = null;
            this.A02 = null;
            this.A01 = null;
            z = true;
        }
        return z;
    }
}
