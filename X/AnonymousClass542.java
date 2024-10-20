package X;

import android.os.Looper;
import android.view.Choreographer;
import com.google.common.base.Preconditions;

/* renamed from: X.542, reason: invalid class name */
/* loaded from: 542.class */
public final class AnonymousClass542 {
    public 5VN A00;
    public C53z A01 = null;
    public boolean A02;
    public final C01s A03;
    public final boolean A04;

    public AnonymousClass542(C01s c01s, Boolean bool) {
        this.A04 = bool.booleanValue();
        this.A03 = c01s;
    }

    private void A00() {
        if (this.A02) {
            return;
        }
        this.A02 = true;
        boolean z = this.A04;
        Choreographer choreographer = Choreographer.getInstance();
        5VM r305 = z ? new 5VM(choreographer, this.A03, this) : new LVc(choreographer, this);
        5VN r0 = this.A00;
        if (r0 != null) {
            r0.ANJ(this);
        }
        this.A00 = r305;
    }

    public void A01() {
        boolean z = false;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        }
        Preconditions.checkState(z, "this operation must run on UI thread");
        A00();
        this.A00.ANJ(this);
    }

    public void A02() {
        boolean z = false;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        }
        Preconditions.checkState(z, "this operation must run on UI thread");
        A00();
        this.A00.APE(this);
    }
}
