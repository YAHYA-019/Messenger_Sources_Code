package X;

import android.os.Handler;
import java.util.TimerTask;

/* loaded from: G8e.class */
public final class G8e extends TimerTask {
    public static final String __redex_internal_original_name = "FrescoVitoSlideshowComponentSpec$onMount$timerTask$1";
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Runnable A01;

    public G8e(Handler handler, Runnable runnable) {
        this.A00 = handler;
        this.A01 = runnable;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.A00.post(this.A01);
    }
}
