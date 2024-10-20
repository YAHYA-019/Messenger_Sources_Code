package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.Aek, reason: case insensitive filesystem */
/* loaded from: Aek.class */
public final class HandlerC1344Aek extends Handler {
    public final /* synthetic */ D1g A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1344Aek(Looper looper, D1g d1g) {
        super(looper);
        this.A00 = d1g;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.Bo0, java.lang.Object] */
    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i != -791613427) {
            if (i == -559038737) {
                D1g d1g = this.A00;
                synchronized (d1g.A05) {
                    Handler handler = d1g.A02;
                    if (handler != null) {
                        handler.getLooper().quit();
                        d1g.A02 = null;
                    }
                }
                return;
            }
            return;
        }
        Bta bta = (Bta) message.obj;
        try {
            try {
                bta.A02 = this.A00.A04(bta.A03);
            } catch (Exception e) {
                bta.A02 = new Object();
                0fH.A0w("AbstractCustomFilter", "An exception occurred during performFiltering()!", e);
            }
            D1g d1g2 = this.A00;
            Message obtainMessage = d1g2.A01.obtainMessage(i);
            obtainMessage.obj = bta;
            obtainMessage.sendToTarget();
            d1g2.A05(bta.A02, bta.A03);
            synchronized (d1g2.A05) {
                Handler handler2 = d1g2.A02;
                if (handler2 != null) {
                    d1g2.A02.sendMessageDelayed(handler2.obtainMessage(-559038737), 3000L);
                }
            }
        } catch (Throwable th) {
            D1g d1g3 = this.A00;
            Message obtainMessage2 = d1g3.A01.obtainMessage(i);
            obtainMessage2.obj = bta;
            obtainMessage2.sendToTarget();
            d1g3.A05(bta.A02, bta.A03);
            throw th;
        }
    }
}
