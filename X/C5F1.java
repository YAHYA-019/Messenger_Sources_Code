package X;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.facebook.inject.FbInjector;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;

/* renamed from: X.5F1, reason: invalid class name */
/* loaded from: 5F1.class */
public final class C5F1 {
    public long A00;
    public final ContentObserver A01;
    public final Handler A02;
    public final 1I7 A03;
    public final 1Br A04;
    public final 1Br A05 = 1Bq.A00(84488);
    public final Runnable A06;
    public final Context A07;

    public C5F1() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A07 = A00;
        this.A04 = 1HG.A00(A00, 100181);
        this.A03 = (1I7) 1Hv.A02(A00, 65728);
        final Handler handler = (Handler) 1Bn.A0A(16453);
        this.A02 = handler;
        this.A06 = new 5F2(this);
        this.A01 = new ContentObserver(handler) { // from class: X.5F3
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                0fH.A0j("SmsContactsChangedHandler", "System contact changes detected");
                C5F1 c5f1 = this;
                long j = c5f1.A00;
                C0dr c0dr = (C0dr) c5f1.A05.A00.get();
                if (j == 0) {
                    c5f1.A00 = c0dr.now();
                } else if (c0dr.now() - c5f1.A00 >= LocationComponentOptions.STALE_STATE_DELAY_MS) {
                    return;
                }
                Handler handler2 = handler;
                Runnable runnable = c5f1.A06;
                handler2.removeCallbacks(runnable);
                handler2.postDelayed(runnable, 5000L);
            }
        };
    }
}
