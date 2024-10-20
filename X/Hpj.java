package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: Hpj.class */
public final class Hpj {
    public final BroadcastReceiver A00 = new GSL(this);
    public final Context A01;
    public final AudioManager A02;
    public final Handler A03;
    public final HOo A04;
    public volatile boolean A05;

    public Hpj(Context context, AudioManager audioManager, Handler handler, HOo hOo) {
        this.A01 = context.getApplicationContext();
        this.A02 = audioManager;
        this.A04 = hOo;
        this.A03 = handler;
    }

    public void A00() {
        synchronized (this) {
            if (this.A05) {
                try {
                    this.A01.unregisterReceiver(this.A00);
                } catch (Exception e) {
                    if (!e.getMessage().contains("DeadSystemException")) {
                        throw e;
                    }
                }
                this.A05 = false;
            }
        }
    }
}
