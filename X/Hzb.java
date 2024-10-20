package X;

import android.os.Message;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: Hzb.class */
public final class Hzb {
    public volatile IET A06;
    public final Object A02 = AnonymousClass001.A0R();
    public final ConcurrentLinkedQueue A05 = new ConcurrentLinkedQueue();
    public final BlockingDeque A04 = new LinkedBlockingDeque();
    public boolean A01 = false;
    public boolean A00 = false;
    public final Thread A03 = new SG6(this);

    public static void A00(Message message, Hzb hzb) {
        int i = message.what;
        if (i == 8 || i == 9) {
            hzb.A04.addFirst(message);
        } else {
            hzb.A04.addLast(message);
        }
    }
}
