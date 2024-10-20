package X;

import com.facebook.pages.bizapp.config.model.BizAppConfigNode;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.6ga, reason: invalid class name */
/* loaded from: 6ga.class */
public abstract class C6ga extends C6gb {
    public final Lock A03;
    public final 1Br A04;
    public final Lock A05;
    public final ReadWriteLock A06;
    public final List A02 = new ArrayList();
    public final C1qN A01 = new C1qN();
    public final C1qN A00 = new C1qN();

    public C6ga() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A06 = reentrantReadWriteLock;
        Lock writeLock = reentrantReadWriteLock.writeLock();
        11T.A0A(writeLock);
        this.A03 = writeLock;
        Lock readLock = reentrantReadWriteLock.readLock();
        11T.A0A(readLock);
        this.A05 = readLock;
        this.A04 = 1Bq.A00(16520);
    }

    public final Object A01(long j) {
        Object obj;
        A02();
        try {
            Lock lock = this.A05;
            lock.lock();
            Integer num = (Integer) this.A01.get(Long.valueOf(j));
            if (num != null) {
                int intValue = num.intValue();
                List list = this.A02;
                if (intValue < list.size()) {
                    obj = list.get(intValue);
                    lock.unlock();
                    return obj;
                }
            }
            obj = null;
            lock.unlock();
            return obj;
        } catch (Throwable th) {
            this.A05.unlock();
            throw th;
        }
    }

    public void A02() {
        ImmutableList immutableList;
        int i;
        List list = this.A02;
        if (list.isEmpty()) {
            C6gc c6gc = (C6gc) 1Bn.A0A(66724);
            C00j.A05("BizAppConfigDiskStorageUtils.getConfigNodesFromDiskStorage", -1373876130);
            try {
                11T.A0F(c6gc, 0);
                String[] A00 = C6gh.A00(((C6gg) c6gc.A01.getValue()).A00.getString("cached_presence_id_list", (String) null));
                int length = A00.length;
                int i2 = 0;
                if (length == 0) {
                    immutableList = null;
                    i = 368620213;
                } else {
                    long[] jArr = new long[length];
                    do {
                        jArr[i2] = Long.parseLong(A00[i2]);
                        i2++;
                    } while (i2 < length);
                    int i3 = 0;
                    ImmutableList.Builder builder = new ImmutableList.Builder();
                    do {
                        BizAppConfigNode A01 = C7ug.A01(c6gc, jArr[i3]);
                        if (A01 != null) {
                            builder.m11011add((Object) A01);
                        }
                        i3++;
                    } while (i3 < length);
                    immutableList = builder.build();
                    i = 1547957246;
                }
                C00j.A01(i);
                if (immutableList == null || immutableList.isEmpty()) {
                    return;
                }
                try {
                    Lock lock = this.A03;
                    lock.lock();
                    list.clear();
                    C1qN c1qN = this.A01;
                    c1qN.clear();
                    C1qN c1qN2 = this.A00;
                    c1qN2.clear();
                    int size = immutableList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        Object obj = immutableList.get(i4);
                        list.add(obj);
                        Integer valueOf = Integer.valueOf(i4);
                        BizAppConfigNode bizAppConfigNode = (BizAppConfigNode) obj;
                        11T.A0F(bizAppConfigNode, 0);
                        c1qN.put(Long.valueOf(bizAppConfigNode.A00), valueOf);
                        Integer valueOf2 = Integer.valueOf(i4);
                        BizAppConfigNode bizAppConfigNode2 = (BizAppConfigNode) obj;
                        11T.A0F(bizAppConfigNode2, 0);
                        c1qN2.put(Long.valueOf(bizAppConfigNode2.A01), valueOf2);
                    }
                    lock.unlock();
                    A00();
                } catch (Throwable th) {
                    this.A03.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                C00j.A01(64123606);
                throw th2;
            }
        }
    }
}
