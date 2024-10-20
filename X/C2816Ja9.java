package X;

import android.content.Context;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: X.Ja9, reason: case insensitive filesystem */
/* loaded from: Ja9.class */
public final class C2816Ja9 extends ContentFrameLayout {
    public final /* synthetic */ 6QN A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2816Ja9(Context context, 6QN r303) {
        super(context, null);
        this.A00 = r303;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (super.dispatchKeyEvent(r302) != false) goto L6;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r302) {
        /*
            r301 = this;
            r0 = r301
            X.6QN r0 = r0.A00
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.A0f(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L1f
            r0 = r301
            r1 = r302
            boolean r0 = super.dispatchKeyEvent(r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L21
        L1f:
            r0 = 1
            r304 = r0
        L21:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2816Ja9.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                6QN r0 = this.A00;
                r0.A0c(r0.A0X(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(C53a.A00(getContext(), i));
    }
}
