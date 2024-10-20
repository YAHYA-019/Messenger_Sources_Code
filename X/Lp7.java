package X;

import java.util.Collection;
import java.util.List;

/* loaded from: Lp7.class */
public final class Lp7 implements Runnable {
    public static final String __redex_internal_original_name = "EmojiCompat$ListenerDispatcher";
    public final int A00;
    public final Throwable A01;
    public final List A02;

    public Lp7(Throwable th, Collection collection, int i) {
        0RZ.A03(collection, "initCallbacks cannot be null");
        this.A02 = 1BK.A17(collection);
        this.A00 = i;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.A02;
        int size = list.size();
        int i = 0;
        if (this.A00 != 1) {
            while (i < size) {
                ((KTB) list.get(i)).A01(this.A01);
                i++;
            }
        } else {
            while (i < size) {
                ((KTB) list.get(i)).A00();
                i++;
            }
        }
    }
}
