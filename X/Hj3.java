package X;

import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: Hj3.class */
public final class Hj3 {
    public GSR A00;
    public HFd A01;
    public Future A02;
    public final ContentResolver A03;
    public final AudioManager A04;
    public final JLv A05;
    public final ExecutorService A06;

    public Hj3(Context context, AudioManager audioManager, HFd hFd, JLv jLv, ExecutorService executorService) {
        this.A04 = audioManager;
        this.A05 = jLv;
        ContentResolver contentResolver = context.getContentResolver();
        11T.A0A(contentResolver);
        this.A03 = contentResolver;
        this.A01 = hFd;
        this.A06 = executorService;
    }
}
