package androidx.window.layout.adapter.extensions;

import X.11T;
import X.7zL;
import X.C06i;
import X.HtB;
import X.I0v;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: MulticastConsumer.class */
public final class MulticastConsumer implements C06i, Consumer {
    public HtB A00;
    public final Context A03;
    public final ReentrantLock A02 = new ReentrantLock();
    public final Set A01 = 7zL.A15();

    public MulticastConsumer(Context context) {
        this.A03 = context;
    }

    public final void A00(C06i c06i) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            HtB htB = this.A00;
            if (htB != null) {
                c06i.accept(htB);
            }
            this.A01.add(c06i);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.C06i, androidx.window.extensions.core.util.function.Consumer
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        11T.A0F(windowLayoutInfo, 0);
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            HtB A00 = I0v.A00.A00(this.A03, windowLayoutInfo);
            this.A00 = A00;
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((C06i) it.next()).accept(A00);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
