package X;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* renamed from: X.49d, reason: invalid class name */
/* loaded from: 49d.class */
public abstract class C49d {
    public boolean A01(int i) {
        if (!(this instanceof C49c)) {
            return !(this instanceof 4PX);
        }
        C49c c49c = (C49c) this;
        try {
            return c49c.A03(i);
        } finally {
            C49c.A00(c49c, i);
        }
    }

    public boolean A02(Bundle bundle, final C49f c49f, final int i) {
        boolean z;
        if (this instanceof C49c) {
            final C49c c49c = (C49c) this;
            C49f c49f2 = new C49f(c49f, c49c, i) { // from class: X.49g
                public final int A00;
                public final C49f A01;
                public final C49c A02;

                {
                    this.A01 = c49f;
                    this.A02 = c49c;
                    this.A00 = i;
                }

                @Override // X.C49f
                public void C2v(boolean z2) {
                    this.A01.C2v(z2);
                    C49c.A00(this.A02, this.A00);
                }
            };
            synchronized (c49c) {
                C49h.A00.A05(0S2.A00, c49c.A00.getResources().getResourceEntryName(i));
            }
            z = c49c.A04(bundle, c49f2, i);
            if (!z) {
                C49c.A00(c49c, i);
                return z;
            }
        } else {
            if (!(this instanceof C4PW)) {
                final 4PX r0 = (4PX) this;
                if (0Gw.A06()) {
                    ((Executor) 1Bi.A03(16457)).execute(new Runnable() { // from class: X.4Wv
                        public static final String __redex_internal_original_name = "TraceUploadRetryJob$1$1";

                        @Override // java.lang.Runnable
                        public void run() {
                            0Gw A00 = 0Gw.A00();
                            0fH.A0j("Profilo/TraceUploadRetryJob", "Triggering upload");
                            A00.A09();
                        }
                    });
                    return false;
                }
                0fH.A0j("Profilo/TraceUploadRetryJob", "Cannot trigger upload. TC is not initialized.");
                return false;
            }
            z = false;
        }
        return z;
    }
}
