package X;

import android.view.View;
import android.view.ViewStub;

/* loaded from: Ezi.class */
public final class Ezi {
    public ViewStub A00;
    public GGX A01;
    public View A02;

    public Ezi(ViewStub viewStub) {
        viewStub.getClass();
        this.A00 = viewStub;
    }

    public View A00() {
        View view;
        synchronized (this) {
            view = this.A02;
            if (view == null) {
                view = this.A00.inflate();
                GGX ggx = this.A01;
                if (ggx != null) {
                    ggx.C1Y(view);
                }
                this.A02 = view;
                this.A01 = null;
                this.A00 = null;
            }
        }
        return view;
    }

    public void A01() {
        synchronized (this) {
            View view = this.A02;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public boolean A02() {
        boolean A1T;
        synchronized (this) {
            A1T = AnonymousClass001.A1T(this.A02);
        }
        return A1T;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r0.getVisibility() != 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            android.view.View r0 = r0.A02     // Catch: java.lang.Throwable -> L1e
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L16
            r0 = r302
            int r0 = r0.getVisibility()     // Catch: java.lang.Throwable -> L1e
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L1a
        L16:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L1a:
            r0 = r301
            monitor-exit(r0)
            r0 = r304
            return r0
        L1e:
            r302 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ezi.A03():boolean");
    }
}
