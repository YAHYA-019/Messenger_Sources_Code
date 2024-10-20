package com.facebook.messaging.responsiveness.touch.loom;

import X.1Bq;
import X.1Br;
import X.1Od;
import X.2yD;
import X.4ZA;
import X.C00i;
import X.C53y;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: MessengerTouchResponsivenessLoomTracer.class */
public final class MessengerTouchResponsivenessLoomTracer {
    public static final 4ZA A04 = new Object();
    public C53y A00;
    public final 1Br A03 = 1Bq.A00(16520);
    public final 1Br A02 = 1Bq.A00(16385);
    public final 1Br A01 = 1Bq.A00(16616);

    /* JADX WARN: Type inference failed for: r0v36, types: [android.os.Handler, X.53y] */
    public final void A00(final String str, final String str2) {
        C00i c00i = this.A02.A00;
        if (((2yD) c00i.get()).AZk(36318286405382477L)) {
            long Auy = ((2yD) c00i.get()).Auy(36599761381692119L);
            if (Auy >= 0) {
                final QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) this.A03.A00.get();
                final long Auy2 = ((2yD) c00i.get()).Auy(36599761381757656L);
                final 1Od r0 = (1Od) this.A01.A00.get();
                ?? r02 = new Handler(r0, quickPerformanceLogger, str, str2, Auy2) { // from class: X.53y
                    public final long A00;
                    public final 1Od A01;
                    public final QuickPerformanceLogger A02;
                    public final String A03;
                    public final String A04;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(Looper.getMainLooper());
                        11T.A0F(quickPerformanceLogger, 1);
                        11T.A0F(r0, 5);
                        this.A02 = quickPerformanceLogger;
                        this.A00 = Auy2;
                        this.A04 = str;
                        this.A03 = str2;
                        this.A01 = r0;
                    }

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        11T.A0F(message, 0);
                        removeMessages(0);
                        removeMessages(1);
                        int i = message.what;
                        if (i != 0) {
                            if (i == 1) {
                                this.A02.markerEnd(895756640, (short) 2);
                                return;
                            }
                            return;
                        }
                        Object obj = message.obj;
                        11T.A0I(obj, DKB.A00(5));
                        long longValue = ((Number) obj).longValue();
                        1PG r03 = (1PG) 1Bi.A03(66265);
                        QuickPerformanceLogger quickPerformanceLogger2 = this.A02;
                        quickPerformanceLogger2.markerStart(895756640);
                        quickPerformanceLogger2.markerAnnotate(895756640, "marker_start", "start");
                        String str3 = this.A04;
                        11T.A0F(str3, 1);
                        quickPerformanceLogger2.markerAnnotate(895756640, "surface", str3);
                        String str4 = this.A03;
                        String A00 = 1BJ.A00(2052);
                        11T.A0F(str4, 1);
                        quickPerformanceLogger2.markerAnnotate(895756640, A00, str4);
                        quickPerformanceLogger2.markerAnnotate(895756640, "time_since_foreground_millis", longValue);
                        quickPerformanceLogger2.markerAnnotate(895756640, "is_dolphin", r03.A05());
                        quickPerformanceLogger2.markerAnnotate(895756640, "is_app_in_background", this.A01.A0E());
                        sendEmptyMessageDelayed(1, this.A00);
                    }
                };
                this.A00 = r02;
                r02.sendMessageDelayed(r02.obtainMessage(0, Long.valueOf(Auy)), Auy);
            }
        }
    }
}
