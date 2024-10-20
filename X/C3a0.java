package X;

import androidx.fragment.app.Fragment;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.ThreadViewParams;

/* renamed from: X.3a0, reason: invalid class name */
/* loaded from: 3a0.class */
public final class C3a0 implements DIz {
    public boolean A00;
    public 7F8 A01;
    public final 2Oe A02;
    public final 7Si A03;

    public C3a0(2Oe r302) {
        11T.A0F(r302, 1);
        this.A02 = r302;
        7Si r0 = new 7Si(this);
        this.A03 = r0;
        r302.AQN(new 7CD(r0));
    }

    @Override // X.DIz
    public void AFv(5SW r302) {
    }

    @Override // X.DIz
    public ThreadKey BF7() {
        return this.A02.threadKey;
    }

    @Override // X.DIz
    public Fragment BFQ() {
        return this.A02;
    }

    @Override // X.DIz
    public void BO5() {
        this.A02.AQN(7Ax.A02);
    }

    @Override // X.DIz
    public boolean BRG() {
        return !this.A00;
    }

    @Override // X.DIz
    public boolean Bkd() {
        return this.A02.Bkd();
    }

    @Override // X.DIz
    public void CMz() {
    }

    @Override // X.DIz
    public void CQ7() {
    }

    @Override // X.DIz
    public void CQI() {
    }

    @Override // X.DIz
    public void Cn5(final 7QG r302) {
        if (r302 == null) {
            this.A01 = null;
            return;
        }
        7F8 r0 = new 7F8() { // from class: X.3co
            public final void C74(ThreadKey threadKey, C5fv c5fv) {
                r302.A00(threadKey);
            }
        };
        this.A01 = r0;
        this.A02.AQN(new 7CA(r0));
    }

    @Override // X.DIz
    public void Cqc(final C1C c1c) {
        this.A02.threadViewFragmentListener = new C3lG() { // from class: X.3Zd
        };
    }

    @Override // X.DIz
    public void CuZ(boolean z) {
        2Oe r0 = this.A02;
        r0.AQN(7Al.A03);
        r0.AQN(7As.A02);
        C6s5 c6s5 = r0.threadViewCreator;
        if (c6s5 == null) {
            11T.A0L("threadViewCreator");
            throw 0Q8.createAndThrow();
        }
        c6s5.A0P = true;
        LithoView lithoView = c6s5.A0A;
        if (lithoView != null) {
            lithoView.setImportantForAccessibility(0);
        }
    }

    @Override // X.DIz
    public void CvK(ThreadViewParams threadViewParams) {
    }

    @Override // X.DIz
    public void DAf(boolean z) {
    }
}
