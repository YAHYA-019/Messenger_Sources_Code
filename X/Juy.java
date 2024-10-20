package X;

import android.os.Process;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: Juy.class */
public final class Juy extends 1LV {
    public final /* synthetic */ Kim A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Juy(Kim kim, String[] strArr) {
        super(strArr);
        this.A00 = kim;
    }

    public void A02(JSi jSi) {
        Object obj;
        Object obj2;
        WeakReference weakReference;
        if (!2JB.A03()) {
            Kim kim = this.A00;
            int myTid = Process.myTid();
            ConcurrentHashMap concurrentHashMap = kim.A01;
            Integer valueOf = Integer.valueOf(myTid);
            if (concurrentHashMap.containsKey(valueOf)) {
                return;
            }
            concurrentHashMap.put(valueOf, 7zL.A14(Thread.currentThread()));
            return;
        }
        Kim kim2 = this.A00;
        String str = jSi.A03;
        int hashCode = str.hashCode();
        if (hashCode == -1695461095) {
            obj = "Litho.TreeFuture.Get";
        } else {
            if (hashCode == -1019213806) {
                if (!str.equals("Litho.TreeFuture.Wait") || (obj2 = jSi.A04.get("waiting-on")) == null || (weakReference = (WeakReference) kim2.A01.get(obj2)) == null) {
                    return;
                }
                C0v3.A00 = weakReference;
                Kks kks = new Kks(jSi);
                Kd0.A03 = kks;
                if (kim2.A02) {
                    kim2.A00.postDelayed(new Lmv(kks, weakReference), 4500L);
                    return;
                }
                return;
            }
            if (hashCode != -351073398) {
                return;
            } else {
                obj = "Litho.TreeFuture.Resume";
            }
        }
        if (str.equals(obj)) {
            C0v3.A00 = null;
            Kks kks2 = Kd0.A03;
            if (kks2 != null) {
                Kd0.A03 = null;
                long uptimeMillis = SystemClock.uptimeMillis();
                kks2.A00 = uptimeMillis;
                Kd0.A01++;
                long j = Kd0.A02;
                long j2 = 0;
                if (uptimeMillis != 0) {
                    j2 = uptimeMillis - kks2.A03;
                }
                Kd0.A02 = j + j2;
                if (j2 > 1000) {
                    int i = Kd0.A00;
                    if (i == 0) {
                        Kd0.A04.removeFirst();
                    } else {
                        Kd0.A00 = i - 1;
                    }
                    Kd0.A04.add(kks2);
                }
            }
        }
    }
}
