package X;

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: Ik3.class */
public final class Ik3 implements JJJ {
    public MediaFormat A00;
    public ArrayList A02;
    public LinkedBlockingQueue A04;
    public volatile boolean A07;
    public CountDownLatch A03 = new CountDownLatch(1);
    public IjV A01 = null;
    public volatile boolean A08 = true;
    public LinkedBlockingQueue A05 = new LinkedBlockingQueue();
    public LinkedBlockingQueue A06 = new LinkedBlockingQueue();

    @Override // X.JJJ
    public JN9 AJT() {
        this.A04 = new LinkedBlockingQueue();
        return new Ijx(this);
    }

    @Override // X.JJJ
    public JNR AJi() {
        return new Ik0(this);
    }
}
