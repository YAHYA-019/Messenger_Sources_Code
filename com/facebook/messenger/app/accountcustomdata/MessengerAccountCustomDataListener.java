package com.facebook.messenger.app.accountcustomdata;

import X.1BQ;
import X.1HN;
import X.A1t;
import X.C00i;
import X.C15h;
import X.G7G;
import com.facebook.inject.FbInjector;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: MessengerAccountCustomDataListener.class */
public final class MessengerAccountCustomDataListener {
    public ScheduledFuture A00;
    public boolean A01 = false;
    public final C00i A04 = new 1BQ(33013);
    public final C00i A02 = new 1BQ(49342);
    public final C00i A03 = FbInjector.A00;
    public final C00i A08 = new 1BQ(16462);
    public final Runnable A09 = new Runnable() { // from class: X.4tq
        public static final String __redex_internal_original_name = "MessengerAccountCustomDataListener$3";

        /* JADX WARN: Removed duplicated region for block: B:62:0x0115 A[Catch: all -> 0x018f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0007, B:5:0x000c, B:6:0x0013, B:7:0x0018, B:8:0x001d, B:9:0x0022, B:11:0x002e, B:13:0x0035, B:14:0x003c, B:16:0x0042, B:17:0x0047, B:18:0x004f, B:20:0x0055, B:21:0x005c, B:25:0x0070, B:29:0x007b, B:30:0x0081, B:31:0x0088, B:32:0x008d, B:33:0x0095, B:36:0x00a3, B:37:0x00ab, B:38:0x00b0, B:39:0x00b8, B:40:0x00bf, B:41:0x00c6, B:43:0x00cd, B:52:0x00eb, B:53:0x00f0, B:54:0x00f7, B:54:0x00f7, B:56:0x00fb, B:57:0x0103, B:59:0x0109, B:62:0x0115, B:63:0x011a, B:65:0x0120, B:66:0x0124, B:67:0x012c, B:70:0x013a, B:71:0x0142, B:72:0x0147, B:73:0x014f, B:74:0x0156, B:75:0x015d, B:77:0x0166, B:79:0x016d, B:80:0x0175, B:82:0x017e, B:48:0x00e0, B:93:0x0188), top: B:3:0x0007 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 404
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC10534tq.run():void");
        }
    };
    public final C00i A05 = new 1BQ(16594);
    public final C15h A07 = new G7G(this, 17);
    public final 1HN A06 = new A1t(this, 4);

    public static void A00(MessengerAccountCustomDataListener messengerAccountCustomDataListener) {
        synchronized (messengerAccountCustomDataListener) {
            ScheduledFuture scheduledFuture = messengerAccountCustomDataListener.A00;
            if (scheduledFuture != null && !scheduledFuture.isCancelled() && !messengerAccountCustomDataListener.A00.isDone()) {
                messengerAccountCustomDataListener.A00.cancel(false);
            }
            messengerAccountCustomDataListener.A00 = ((ScheduledExecutorService) messengerAccountCustomDataListener.A08.get()).schedule(messengerAccountCustomDataListener.A09, LocationComponentOptions.STALE_STATE_DELAY_MS, TimeUnit.MILLISECONDS);
        }
    }
}
