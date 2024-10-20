package X;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;

/* renamed from: X.069, reason: invalid class name */
/* loaded from: 069.class */
public final class AnonymousClass069 implements Runnable, 06A, ViewTreeObserver.OnDrawListener {
    public static final String __redex_internal_original_name = "ComponentActivity$ReportFullyDrawnExecutorImpl";
    public Runnable A00;
    public boolean A01;
    public final long A02 = SystemClock.uptimeMillis() + 10000;
    public final /* synthetic */ ComponentActivity A03;

    public AnonymousClass069(ComponentActivity componentActivity) {
        this.A03 = componentActivity;
    }

    public void A41() {
        ComponentActivity componentActivity = this.A03;
        componentActivity.getWindow().getDecorView().removeCallbacks(this);
        componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    public void D91(View view) {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    public void execute(Runnable runnable) {
        11T.A0F(runnable, 0);
        this.A00 = runnable;
        View decorView = this.A03.getWindow().getDecorView();
        11T.A0A(decorView);
        if (!this.A01) {
            decorView.postOnAnimation(new 0Q1(this));
        } else if (11T.A0O(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        ComponentActivity componentActivity;
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
            this.A00 = null;
            componentActivity = this.A03;
            if (!componentActivity.A1E().A01()) {
                return;
            } else {
                this.A01 = false;
            }
        } else {
            if (SystemClock.uptimeMillis() <= this.A02) {
                return;
            }
            this.A01 = false;
            componentActivity = this.A03;
        }
        componentActivity.getWindow().getDecorView().post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A03.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
