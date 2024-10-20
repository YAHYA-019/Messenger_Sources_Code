package X;

import android.text.TextUtils;
import com.facebook.locationsharing.core.models.LiveLocationSession;

/* renamed from: X.GbB, reason: case insensitive filesystem */
/* loaded from: GbB.class */
public final class C2374GbB extends 7VY {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C2374GbB(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        LiveLocationSession liveLocationSession = (LiveLocationSession) obj;
        if (this.A00 != 0) {
            if (liveLocationSession == null) {
                ((JOe) this.A02).onSuccess();
                return;
            }
            RlX rlX = (RlX) this.A01;
            rlX.A00.D2u(new RlT((JOe) this.A02, rlX, liveLocationSession), liveLocationSession);
            return;
        }
        LiveLocationSession liveLocationSession2 = (LiveLocationSession) this.A02;
        if (liveLocationSession2.equals(liveLocationSession)) {
            return;
        }
        if (liveLocationSession == null) {
            ((C7V8) this.A01).A00();
        } else if (TextUtils.equals(liveLocationSession2.A04, liveLocationSession.A04) || (HHd.A00(liveLocationSession2) && liveLocationSession.A06)) {
            ((7VW) this.A01).A00.D8W(new IM4(this, 0), liveLocationSession2);
        }
    }

    public void onError(Throwable th) {
        if (this.A00 != 0) {
            ((5fS) this.A02).onError(th);
        } else {
            ((C7V8) this.A01).A03(th);
        }
    }
}
