package X;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: E4p.class */
public final class E4p extends C6gb {
    public final Lock A04;
    public final Lock A05;
    public final Context A06;
    public final 1Br A07;
    public final ReadWriteLock A08;
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();
    public final List A02 = AnonymousClass001.A0s();
    public final C1qN A00 = new C1qN();
    public final C1qN A01 = new C1qN();

    public E4p(Context context) {
        this.A06 = context;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A08 = reentrantReadWriteLock;
        Lock writeLock = reentrantReadWriteLock.writeLock();
        11T.A0A(writeLock);
        this.A05 = writeLock;
        Lock readLock = reentrantReadWriteLock.readLock();
        11T.A0A(readLock);
        this.A04 = readLock;
        this.A07 = 7zM.A0S();
    }
}
