package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.LithoView;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;
import com.facebook.messaging.montage.viewer.controlsoverlay.MontageViewerControlsContainer;
import com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView;

/* renamed from: X.Gbx, reason: case insensitive filesystem */
/* loaded from: Gbx.class */
public abstract class AbstractC2395Gbx extends 1pK implements JLj, JKA, 2Ob {
    public static final String __redex_internal_original_name = "StoryCardPageFragment";
    public long A00;
    public long A01;
    public MontageViewerFragment A02;
    public HGD A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final Runnable A07 = new Ir8(this);

    /* JADX WARN: Multi-variable type inference failed */
    private final void A08() {
        Handler A1Y;
        if (getContext() == null || (A1Y = A1Y()) == null) {
            return;
        }
        A1Y.removeCallbacks(this.A07);
    }

    public void A1O(boolean z, boolean z2) {
        super.A1O(z, z2);
        this.A06 = z;
        if (z) {
            7zU.A1P(this);
            return;
        }
        this.A00 = 0L;
        this.A01 = 0L;
        A08();
        MontageProgressIndicatorView A1d = A1d();
        if (A1d != null) {
            A1d.A01();
        }
    }

    public long A1X() {
        return 6000L;
    }

    public Handler A1Y() {
        1BS r0 = ((C2803Gog) this).A0A;
        if (r0 == null) {
            return null;
        }
        if (!(r0 instanceof 1BS) || r0.isInitialized()) {
            return 4YU.A0G((C00i) r0);
        }
        return null;
    }

    public View A1Z() {
        return ((C2803Gog) this).A00;
    }

    public C0dp A1a() {
        return (C0dp) ((C2803Gog) this).A09.get();
    }

    public HmK A1b() {
        return (HmK) ((C2803Gog) this).A0D.get();
    }

    public MontageViewerControlsContainer A1c() {
        return ((C2803Gog) this).A04;
    }

    public MontageProgressIndicatorView A1d() {
        return ((C2803Gog) this).A05;
    }

    public void A1e() {
        if (this.A05) {
            return;
        }
        this.A05 = true;
        this.A00 += A1a().now() - this.A01;
        A08();
        MontageProgressIndicatorView A1d = A1d();
        if (A1d != null) {
            GOo.A1H(A1d);
        }
        A1f();
    }

    public void A1f() {
    }

    public void A1g() {
    }

    public void A1h(long j) {
        if (j >= 0 && this.A05 && this.A06) {
            this.A01 = A1a().now();
            this.A05 = false;
            A08();
            MontageProgressIndicatorView A1d = A1d();
            if (A1d != null) {
                A1d.A05(j);
                Handler A1Y = A1Y();
                if (A1Y != null) {
                    A1Y.postDelayed(this.A07, j);
                }
            }
            A1g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Gog, androidx.fragment.app.Fragment] */
    public void A1i(View view) {
        ?? r0 = (C2803Gog) this;
        r0.A04 = (MontageViewerControlsContainer) 7zL.A0F((Fragment) r0, 2131368390);
        r0.A05 = (MontageProgressIndicatorView) 7zL.A0F((Fragment) r0, 2131366709);
        r0.A02 = (LithoView) 7zL.A0F((Fragment) r0, 2131368392);
        r0.A00 = 7zL.A0F((Fragment) r0, 2131363049);
    }

    public void A1j(HGD hgd) {
        A1b().A00("toolbar_click_close_button");
        hgd.A01();
    }

    public boolean ADo(MotionEvent motionEvent) {
        return true;
    }

    @Override // X.JLj
    public void BrD(Throwable th) {
    }

    @Override // X.JLj
    public void BrE() {
    }

    @Override // X.JLj
    public void BrH() {
        HGD hgd;
        if (!this.A06 || (hgd = this.A03) == null) {
            return;
        }
        hgd.A05(this);
    }

    @Override // X.JLj
    public void BrI() {
        HGD hgd = this.A03;
        if (hgd != null) {
            hgd.A02();
        }
    }

    @Override // X.JLj
    public void BrJ() {
    }

    public void CnF(int i) {
    }

    public void CnG(Drawable drawable) {
    }

    public void D7g(float f) {
        MontageProgressIndicatorView A1d = A1d();
        if (A1d != null) {
            A1d.A03(07C.A01(f, 0.0f, 1.0f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(954618799);
        super/*androidx.fragment.app.Fragment*/.onPause();
        A1e();
        0FI.A08(765061400, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1958950124);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A00 = 0L;
        this.A05 = true;
        if (this.A06) {
            7zU.A1P(this);
        }
        0FI.A08(1751363144, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        A1i(view);
        MontageProgressIndicatorView A1d = A1d();
        if (A1d != null) {
            A1d.setPosition(0, 1);
            A1d.A04(A1X());
            A1d.A01();
        }
        View A1Z = A1Z();
        if (A1Z != null) {
            IKE.A01(A1Z, this, ActionId.MISSED_EVENT);
        }
        MontageViewerControlsContainer A1c = A1c();
        if (A1c != null) {
            A1c.A02 = new IXK(this, 3);
        }
    }
}
