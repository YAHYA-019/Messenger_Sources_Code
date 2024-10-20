package X;

import android.os.Handler;
import com.google.android.exoplayer2.util.Util;

/* loaded from: LaR.class */
public final class LaR implements C6at {
    public C7ys A00;
    public boolean A01;
    public final 6ZM A02;
    public final /* synthetic */ LaS A03;

    public LaR(LaS laS, 6ZM r303) {
        this.A03 = laS;
        this.A02 = r303;
    }

    @Override // X.C6at
    public void release() {
        Handler handler = this.A03.A01;
        handler.getClass();
        Util.A0J(handler, new Runnable() { // from class: X.Llo
            public static final String __redex_internal_original_name = "DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                LaR laR = LaR.this;
                if (laR.A01) {
                    return;
                }
                C7ys c7ys = laR.A00;
                if (c7ys != null) {
                    c7ys.Cch(laR.A02);
                }
                laR.A03.A0A.remove(laR);
                laR.A01 = true;
            }
        });
    }
}
