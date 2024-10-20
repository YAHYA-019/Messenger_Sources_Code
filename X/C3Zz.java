package X;

import android.app.Activity;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.ThreadViewParams;

/* renamed from: X.3Zz, reason: invalid class name */
/* loaded from: 3Zz.class */
public final class C3Zz implements DIz {
    public final 2OZ A00;

    public C3Zz(2OZ r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    @Override // X.DIz
    public void AFv(5SW r302) {
        11T.A0F(r302, 0);
        2OZ r0 = this.A00;
        if (r0.A0H != null) {
            if (r0.A0Y != r302) {
                r0.A0Y = r302;
                5Sy r02 = r0.A0b;
                if (r02 != null) {
                    r02.A03(r302);
                }
            }
            r0.A0H = null;
            r0.A0V = null;
            r0.A0U = null;
            r0.A0J = null;
            2OZ.A0P(r0, "thread_view_clear");
            if (r0.A0q) {
                r0.A1Y();
            }
            r0.A0c.A1l(true, true, false);
        }
    }

    @Override // X.DIz
    public ThreadKey BF7() {
        return this.A00.A0H;
    }

    @Override // X.DIz
    public Fragment BFQ() {
        return this.A00;
    }

    @Override // X.DIz
    public void BO5() {
        Window window;
        2OZ r0 = this.A00;
        06V r02 = r0.mHost;
        if (r02 != null) {
            r0.A0u = false;
            r0.A0w = false;
            Object A04 = r02.A04();
            if (!(A04 instanceof Activity) || (window = ((Activity) A04).getWindow()) == null) {
                return;
            }
            window.setSoftInputMode(2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0.A0b.A23() != false) goto L6;
     */
    @Override // X.DIz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BRG() {
        /*
            r301 = this;
            r0 = r301
            X.2OZ r0 = r0.A00
            X.6F2 r0 = r0.A0c
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1c
            r0 = r302
            X.6QS r0 = r0.A0b
            boolean r0 = r0.A23()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            r304 = r0
        L1e:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Zz.BRG():boolean");
    }

    @Override // X.DIz
    public boolean Bkd() {
        return this.A00.Bkd();
    }

    @Override // X.DIz
    public void CMz() {
        6F2 r0 = this.A00.A0c;
        if (r0 != null) {
            ((6NE) r0.A3J.get()).A02(true);
        }
    }

    @Override // X.DIz
    public void CQ7() {
        this.A00.A1Y();
    }

    @Override // X.DIz
    public void CQI() {
        this.A00.A1Z();
    }

    /* JADX WARN: Type inference failed for: r303v4, types: [X.6RZ, java.lang.Object] */
    @Override // X.DIz
    public void Cn5(7QG r302) {
        2OZ r0 = this.A00;
        r0.A0N = r302;
        6F2 r02 = r0.A0c;
        if (r02 != null) {
            r02.A0j = r302;
            6QS r03 = r02.A0b;
            if (r03 != null) {
                6RZ r303 = r03.A08;
                6RZ r3032 = r303;
                if (r303 == null) {
                    ?? obj = new Object();
                    r03.A08 = obj;
                    r3032 = obj;
                }
                r3032.A00 = r302;
            }
        }
    }

    @Override // X.DIz
    public void Cqc(C1C c1c) {
        this.A00.A0b = new BFM(c1c, 0);
    }

    @Override // X.DIz
    public void CuZ(boolean z) {
        this.A00.A1b(true);
    }

    @Override // X.DIz
    public void CvK(ThreadViewParams threadViewParams) {
        this.A00.A1a(threadViewParams);
    }

    @Override // X.DIz
    public void DAf(boolean z) {
        2OZ r0 = this.A00;
        r0.A0w = z;
        2OZ.A0J(r0);
    }
}
