package X;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.5im, reason: invalid class name */
/* loaded from: 5im.class */
public final class C5im implements C1ph {
    public final C00i A03 = new 1BQ(32848);
    public final C00i A00 = new 1BV(16430);
    public final C00i A02 = new 1BQ(131273);
    public final C1pl A04 = new C1pl() { // from class: X.5in
        @Override // X.C1pl
        public void A03(long j) {
            C5im c5im = C5im.this;
            4YU.A0G(c5im.A00).postAtFrontOfQueue(c5im.A01);
        }
    };
    public final Runnable A01 = new Runnable() { // from class: X.5io
        public static final String __redex_internal_original_name = "TTRCDialogListener$2";

        @Override // java.lang.Runnable
        public void run() {
            C47o c47o = (C47o) 1Bi.A03(32914);
            c47o.A01 = ((C0dr) c47o.A04.get()).now();
            C47o.A00(c47o);
            MessageQueue myQueue = Looper.myQueue();
            MessageQueue.IdleHandler idleHandler = c47o.A02;
            myQueue.removeIdleHandler(idleHandler);
            Looper.myQueue().addIdleHandler(idleHandler);
        }
    };

    @Override // X.C1ph
    public void Bth(2Ov r302) {
    }

    @Override // X.C1ph
    public void Btk(2Ov r302) {
        View view;
        if (r302 == null || (view = r302.mView) == null) {
            ((C62l) this.A02.get()).CXz(this.A04);
        } else {
            final View rootView = view.getRootView();
            rootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.5ip
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    C5im c5im = this;
                    Handler handler = (Handler) c5im.A00.get();
                    rootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    handler.postAtFrontOfQueue(c5im.A01);
                }
            });
        }
    }

    @Override // X.C1ph
    public void CR0(MotionEvent motionEvent) {
        this.A03.get();
    }

    @Override // X.C1ph
    public void onActivityResult(int i, int i2, Intent intent) {
    }
}
