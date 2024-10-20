package X;

import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.20y, reason: invalid class name */
/* loaded from: 20y.class */
public final class C20y implements 1Uc {
    public final C20w A00;
    public final java.util.Map A01;

    public C20y(C20w c20w, java.util.Map map) {
        this.A01 = map;
        this.A00 = c20w;
    }

    public void onNewNotification(String str, 1Xv r303, java.util.Map map) {
        29E r0;
        AbstractCollection abstractCollection;
        int i;
        if (map != null) {
            Number number = (Number) map.get("MSCStatusUpdateDatabaseIdUserInfoKey");
            Number number2 = (Number) map.get("MSCStatusUpdateSyncStatusUserInfoKey");
            Object obj = map.get("MSCStatusUpdateSyncTimestampMSUserInfoKey");
            Number number3 = (Number) map.get("MSCStatusUpdatePagingProgressCompleteUserInfoKey");
            Number number4 = (Number) map.get("MSCSyncStatusUpdatePagingProgressTotalUserInfoKey");
            number.getClass();
            number2.getClass();
            obj.getClass();
            number3.getClass();
            number4.getClass();
            java.util.Map map2 = this.A01;
            synchronized (map2) {
                if (!map2.containsKey(number)) {
                    map2.put(number, new 29E());
                }
                r0 = (29E) map2.get(number);
                r0.getClass();
            }
            int intValue = number2.intValue();
            synchronized (r0) {
                r0.A02 = intValue;
            }
            if (intValue == 1) {
                synchronized (r0) {
                }
                this.A00.A00(number.intValue(), true);
                return;
            }
            if (intValue != 2) {
                if (intValue == 4) {
                    synchronized (r0) {
                    }
                    this.A00.A00(number.intValue(), false);
                    return;
                }
                return;
            }
            int intValue2 = number3.intValue();
            int intValue3 = number4.intValue();
            synchronized (r0) {
                r0.A05 = true;
                r0.A03 = false;
                System.currentTimeMillis();
                r0.A00 = intValue2;
                r0.A01 = intValue3;
                Set set = r0.A06;
                if (set.isEmpty()) {
                    abstractCollection = null;
                } else {
                    new HashSet(set);
                    set.clear();
                }
            }
            if (abstractCollection != null) {
                Iterator it = abstractCollection.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0Q("onSyncComplete");
                }
            }
            C20w c20w = this.A00;
            int intValue4 = number.intValue();
            C20p c20p = c20w.A00;
            0fH.A0l("MsysSyncStateTracker", 0Pz.A0T("Sync completed. Group=", intValue4));
            if (intValue4 == 1) {
                C20u c20u = c20p.A00;
                29E A00 = c20u != null ? c20u.A00(1) : null;
                int i2 = 0;
                if (A00 != null) {
                    synchronized (A00) {
                        i = A00.A00;
                    }
                    synchronized (A00) {
                        i2 = A00.A01;
                    }
                } else {
                    i = 0;
                }
                0fH.A0l("MsysSyncStateTracker", 0Pz.A0C(i, i2, "Sync completed for MAILBOX. pagingProgress=", " pagingTotal="));
                ((C20t) c20p.A06.A00.get()).A00.A00.get();
                List list = ((C29u) c20p.A05.A00.get()).A00;
                synchronized (list) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((C1gp) it2.next()).C5S(i, i2);
                    }
                }
                C29w c29w = (C29w) c20p.A07.A00.get();
                List list2 = c29w.A02;
                synchronized (list2) {
                    c29w.A00++;
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        it3.next();
                        throw AnonymousClass001.A0Q("onMailboxSyncCompleted");
                    }
                }
            } else {
                ((C20t) c20p.A06.A00.get()).A00.A00.get();
                List list3 = ((C29u) c20p.A05.A00.get()).A00;
                synchronized (list3) {
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        ((C1gp) it4.next()).C9Z(intValue4);
                    }
                }
            }
            C29y c29y = (C29y) c20p.A08.A00.get();
            if (C29y.A00(c29y)) {
                List<1Tw> list4 = c29y.A02;
                Iterator it5 = list4.iterator();
                while (it5.hasNext()) {
                    it5.next();
                    0fH.A0j("MessengerColdStartThreadViewTTRCTracker", "onMsysSyncGroupComplete");
                }
                java.util.Map map3 = c29y.A00;
                if (map3.containsKey(number)) {
                    map3.remove(number);
                    if (map3.isEmpty()) {
                        for (1Tw r02 : list4) {
                            0fH.A0j("MessengerColdStartThreadViewTTRCTracker", "onMsysTTRCQueryComplete");
                            r02.A00("on_msys_sync_group_complete");
                        }
                    }
                }
            }
        }
    }
}
