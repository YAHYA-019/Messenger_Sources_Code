package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: Ety.class */
public final class Ety {
    public final LinkedHashMap A00;
    public final ReentrantReadWriteLock A01 = new ReentrantReadWriteLock();
    public final int A02;

    public Ety(int i) {
        this.A02 = i;
        this.A00 = new LinkedHashMap(i);
    }

    public final void A00(ELN eln, String str) {
        11T.A0F(str, 0);
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A01;
            reentrantReadWriteLock.writeLock().lock();
            LinkedHashMap linkedHashMap = this.A00;
            if (linkedHashMap.containsKey(str)) {
                linkedHashMap.remove(str);
            }
            linkedHashMap.put(str, eln);
            Iterator A0x = AnonymousClass001.A0x(linkedHashMap);
            while (linkedHashMap.size() > this.A02 && A0x.hasNext()) {
                A0x.next();
                A0x.remove();
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.A01.writeLock().unlock();
            throw th;
        }
    }
}
