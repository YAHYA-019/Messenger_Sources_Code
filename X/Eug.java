package X;

import android.content.Context;
import android.os.Handler;
import java.util.HashMap;

/* loaded from: Eug.class */
public final class Eug {
    public Handler A00;
    public Runnable A01;
    public boolean A02 = false;
    public final C00i A03;

    public Eug(Context context) {
        this.A03 = DKG.A0R(context);
    }

    public void A00(int i) {
        if (!this.A02) {
            FIT A0c = DKF.A0c(this.A03);
            if (!A0c.A04) {
                HashMap A0u = AnonymousClass001.A0u();
                A0u.put("heartbeat_interval", String.valueOf(i));
                A0c.A0J("heartbeat", A0u);
            }
        }
        if (this.A01 == null) {
            this.A01 = new SBo(this, i);
        }
        Handler handler = this.A00;
        if (handler == null) {
            handler = new Handler();
            this.A00 = handler;
        }
        handler.postDelayed(this.A01, i * 1000);
    }
}
