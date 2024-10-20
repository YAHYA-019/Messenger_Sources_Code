package X;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: Enn.class */
public final class Enn {
    public final Lock A00;
    public final 1Br A01;
    public final Lock A02;
    public final ReadWriteLock A03;

    public Enn() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A03 = reentrantReadWriteLock;
        this.A00 = reentrantReadWriteLock.writeLock();
        this.A02 = reentrantReadWriteLock.readLock();
        this.A01 = AbG.A0M();
    }
}
