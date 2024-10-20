package com.facebook.common.activitycleaner;

import X.1BQ;
import X.1G0;
import X.1G2;
import X.1pU;
import X.1vF;
import X.C00i;
import android.app.Activity;
import com.google.common.collect.MapMakerInternalMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: ActivityStackManager.class */
public final class ActivityStackManager {
    public static final 1G2 A08 = 1G0.A02.A0D("user_left_app_at");
    public int A00;
    public long A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final LinkedList A05 = new LinkedList();
    public final Map A06;
    public final C00i A07;

    public ActivityStackManager() {
        1pU r0 = new 1pU();
        r0.A02(MapMakerInternalMap.Strength.A01);
        this.A06 = r0.A00();
        this.A07 = new 1BQ(16511);
        this.A04 = new 1BQ(33013);
        this.A02 = new 1BQ(16616);
        this.A03 = new 1BQ(99390);
        this.A01 = 0L;
    }

    public Activity A00() {
        LinkedList linkedList = this.A05;
        synchronized (linkedList) {
            if (linkedList.isEmpty()) {
                return null;
            }
            return (Activity) ((1vF) linkedList.getLast()).A01.get();
        }
    }

    public void A01() {
        LinkedList linkedList = this.A05;
        synchronized (linkedList) {
            ListIterator listIterator = linkedList.listIterator(0);
            while (listIterator.hasNext()) {
                if (((Activity) ((1vF) listIterator.next()).A01.get()) == null) {
                    listIterator.remove();
                }
            }
            linkedList.size();
        }
        C00i c00i = this.A07;
        c00i.get();
        c00i.get();
    }

    public void A02(Activity activity) {
        LinkedList linkedList = this.A05;
        synchronized (linkedList) {
            Map map = this.A06;
            1vF r0 = (1vF) map.get(activity);
            if (r0 != null) {
                linkedList.remove(r0);
                map.remove(activity);
            }
        }
    }
}
