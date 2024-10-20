package X;

import android.os.Process;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* loaded from: J7I.class */
public final class J7I extends Thread {
    public static final String __redex_internal_original_name = "SimpleFileLogger$LoggerThread";
    public final BlockingQueue A00;
    public final /* synthetic */ IQX A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7I(IQX iqx) {
        super("LoggerThread");
        this.A01 = iqx;
        this.A00 = new ArrayBlockingQueue(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, true);
        start();
    }

    public static void A00(J7I j7i) {
        Hyi hyi = null;
        do {
            try {
                hyi = (Hyi) j7i.A00.take();
            } catch (InterruptedException unused) {
            }
        } while (hyi == null);
        IQX.A03(j7i.A01, hyi.A02, hyi.A01, hyi.A00);
        synchronized (Hyi.class) {
            ArrayList arrayList = Hyi.A03;
            if (arrayList.size() < 100) {
                hyi.A00 = -1;
                hyi.A02 = null;
                hyi.A01 = null;
                arrayList.add(hyi);
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            A00(this);
        }
    }
}
