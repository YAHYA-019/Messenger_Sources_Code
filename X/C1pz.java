package X;

import com.facebook.common.memory.leaklistener.core.KeyedWeakReference;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.1pz, reason: invalid class name */
/* loaded from: 1pz.class */
public final class C1pz {
    public C1pw A00;
    public ScheduledFuture A03;
    public final ScheduledExecutorService A06;
    public final Runnable A05 = new Runnable() { // from class: X.1q0
        public static final String __redex_internal_original_name = "MemoryLeakHelper$1";

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:7:0x01f5
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                Method dump skipped, instructions count: 505
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1q0.run():void");
        }
    };
    public boolean A04 = false;
    public WeakHashMap A02 = new WeakHashMap();
    public C0dr A01 = RealtimeSinceBootClock.A00;

    public C1pz(C1pw c1pw, ScheduledExecutorService scheduledExecutorService) {
        this.A06 = scheduledExecutorService;
        this.A00 = c1pw;
    }

    public static void A00(C1pz c1pz, Object obj, java.util.Map map) {
        synchronized (c1pz) {
            WeakHashMap weakHashMap = c1pz.A02;
            if (weakHashMap.containsKey(obj)) {
                0fH.A0S(C1pz.class, "Already tracking %s ?", new Object[]{obj.toString()});
            } else {
                0fH.A07(C1pz.class, obj.toString(), "Tracking %s ");
                weakHashMap.put(obj, new KeyedWeakReference(obj, c1pz.A01.now(), map, null));
            }
        }
    }
}
