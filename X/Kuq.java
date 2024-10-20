package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* loaded from: Kuq.class */
public final class Kuq {
    public final 1GU A00;
    public final List A01 = AnonymousClass001.A0s();
    public final ConcurrentMap A02 = JQx.A13();

    public Kuq(1GU r302) {
        this.A00 = r302;
    }

    public int A00(ThreadKey threadKey) {
        this.A00.AAs();
        return this.A01.indexOf(threadKey.toString());
    }

    public AmX A01(int i) {
        Object obj = this.A01.get(i);
        if (obj != null) {
            return (AmX) this.A02.get(obj);
        }
        return null;
    }

    public AmX A02(ThreadKey threadKey) {
        this.A00.AAs();
        AmX amX = (AmX) this.A02.get(threadKey.toString());
        if (amX != null) {
            Preconditions.checkState(Objects.equal(amX.A03, threadKey));
        }
        return amX;
    }

    public ImmutableList A03() {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            Object obj = this.A02.get(it.next());
            if (obj != null) {
                builder.m11011add(obj);
            }
        }
        return builder.build();
    }

    public void A04(AmX amX, ThreadKey threadKey) {
        this.A00.AAs();
        boolean z = true;
        Preconditions.checkArgument(AnonymousClass001.A1W(amX.A02, threadKey));
        ConcurrentMap concurrentMap = this.A02;
        concurrentMap.put(threadKey.toString(), amX);
        List list = this.A01;
        if (list.indexOf(threadKey.toString()) != 0 && !A07(threadKey, 0)) {
            list.add(0, threadKey.toString());
        }
        if (list.size() != concurrentMap.size()) {
            z = false;
        }
        Preconditions.checkState(z);
    }

    public void A05(ThreadKey threadKey) {
        this.A00.AAs();
        List list = this.A01;
        list.remove(threadKey.toString());
        ConcurrentMap concurrentMap = this.A02;
        concurrentMap.remove(threadKey.toString());
        Preconditions.checkState(AnonymousClass001.A1Q(list.size(), concurrentMap.size()));
    }

    public void A06(ThreadKey threadKey, ThreadKey threadKey2) {
        this.A00.AAs();
        int i = 0;
        while (true) {
            int i2 = i;
            List list = this.A01;
            if (i2 >= list.size()) {
                return;
            }
            if (DKG.A1a(threadKey, 1BK.A14(list, i2))) {
                ConcurrentMap concurrentMap = this.A02;
                Object A12 = DKC.A12(threadKey.toString(), concurrentMap);
                AmX amX = (AmX) A12;
                amX.A02 = threadKey2;
                list.set(i2, threadKey2.toString());
                concurrentMap.remove(threadKey.toString());
                concurrentMap.put(threadKey2.toString(), A12);
                amX.A0Z(threadKey2);
                return;
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r303 >= r301.A02.size()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A07(com.facebook.messaging.model.threadkey.ThreadKey r302, int r303) {
        /*
            r301 = this;
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 < 0) goto L1e
            r0 = r301
            java.util.concurrent.ConcurrentMap r0 = r0.A02
            r305 = r0
            r0 = r305
            int r0 = r0.size()
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r303
            r1 = r306
            if (r0 < r1) goto L24
        L1e:
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
        L24:
            r0 = r307
            com.google.common.base.Preconditions.checkState(r0)
            r0 = r301
            X.1GU r0 = r0.A00
            r0.AAs()
            r0 = r301
            java.util.List r0 = r0.A01
            r308 = r0
            r0 = r302
            java.lang.String r0 = r0.toString()
            r305 = r0
            r0 = r308
            r1 = r305
            int r0 = r0.indexOf(r1)
            r307 = r0
            r0 = r307
            if (r0 < 0) goto L70
            r0 = r307
            r1 = r303
            if (r0 == r1) goto L70
            r0 = r308
            r1 = r307
            java.lang.Object r0 = r0.remove(r1)
            r0 = r302
            java.lang.String r0 = r0.toString()
            r305 = r0
            r0 = r308
            r1 = r303
            r2 = r305
            r0.add(r1, r2)
            r0 = r304
            return r0
        L70:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kuq.A07(com.facebook.messaging.model.threadkey.ThreadKey, int):boolean");
    }
}
