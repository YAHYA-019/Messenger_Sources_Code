package X;

import com.facebook.messaging.inbox.units.StaticUnitConfig;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3xf.class */
public final class C03223xf extends 2UP {
    public final long A00;
    public final long A01;
    public final C46x A02;
    public final ThreadSummary A03;
    public final HeterogeneousMap A04;
    public final ImmutableList A05;
    public final String A06;

    public C03223xf(StaticUnitConfig staticUnitConfig, C46x c46x, ThreadSummary threadSummary, HeterogeneousMap heterogeneousMap, String str, List list, long j, long j2) {
        super((C2gu) null, staticUnitConfig);
        this.A02 = c46x;
        this.A03 = threadSummary;
        this.A05 = ImmutableList.copyOf((Collection) list);
        this.A06 = str;
        this.A00 = j;
        this.A01 = j2;
        this.A04 = heterogeneousMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r301.A00 > r301.A01) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03() {
        /*
            r301 = this;
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A05
            r302 = r0
            r0 = r302
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L28
            r0 = r301
            long r0 = r0.A00
            r304 = r0
            r0 = r301
            long r0 = r0.A01
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r308
            if (r0 <= 0) goto L2a
        L28:
            r0 = 1
            r303 = r0
        L2a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03223xf.A03():boolean");
    }

    public 2hJ AsW() {
        return this.A02.itemType;
    }

    public String BKC() {
        return this.A02.inboxItemViewType;
    }

    public boolean BVb(2UR r302) {
        boolean z = false;
        if (r302 instanceof C03223xf) {
            C03223xf c03223xf = (C03223xf) r302;
            if (c03223xf.A02 == this.A02 && c03223xf.A03() == A03() && c03223xf.A05.equals(this.A05) && c03223xf.A03 == this.A03 && c03223xf.A00 == this.A00 && c03223xf.A01 == this.A01 && c03223xf.A04 == this.A04) {
                z = true;
            }
        }
        return z;
    }
}
