package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.ApB, reason: case insensitive filesystem */
/* loaded from: ApB.class */
public final class C1668ApB extends CfG {
    public final Handler A00;
    public final Runnable A01;

    public C1668ApB(Context context, int i) {
        super(context, i);
        this.A00 = AnonymousClass001.A07();
        this.A01 = new D5A(this);
    }

    public C1668ApB(Context context, String str) {
        super(context, str);
        this.A00 = AnonymousClass001.A07();
        this.A01 = new D5A(this);
    }

    public void ABm() {
        this.A00.postDelayed(this.A01, 500L);
    }

    public void D2v() {
        this.A00.removeCallbacks(this.A01);
        super.D2v();
    }
}
