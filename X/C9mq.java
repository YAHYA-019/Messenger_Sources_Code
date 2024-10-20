package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.9mq, reason: invalid class name */
/* loaded from: 9mq.class */
public abstract class C9mq {
    public static final java.util.Map A00 = AnonymousClass001.A0u();
    public static final java.util.Map A01 = AnonymousClass001.A0u();
    public static final ReentrantReadWriteLock A02 = new ReentrantReadWriteLock();

    public static ReentrantReadWriteLock.ReadLock A00(Object obj) {
        11T.A0F(obj, 0);
        ReentrantReadWriteLock.ReadLock readLock = A02.readLock();
        11T.A0A(readLock);
        readLock.lock();
        return readLock;
    }

    public static final void A01(String str) {
        ReentrantReadWriteLock.ReadLock A002 = A00(str);
        try {
            QS2 qs2 = (9AK) A00.get(str);
            if (qs2 != null) {
                QS2 qs22 = qs2;
                GJj gJj = qs22.A00;
                FEK.A00(((9AK) qs22).A00, DKc.A01, gJj);
            }
        } finally {
            A002.unlock();
        }
    }

    public static final void A02(String str) {
        ReentrantReadWriteLock.ReadLock A002 = A00(str);
        try {
            QS2 qs2 = (9AK) A00.get(str);
            if (qs2 != null) {
                QS2 qs22 = qs2;
                GJj gJj = qs22.A01;
                FEK.A00(((9AK) qs22).A00, DKc.A01, gJj);
            }
        } finally {
            A002.unlock();
        }
    }

    public static final void A03(String str) {
        ReentrantReadWriteLock.ReadLock A002 = A00(str);
        try {
            QS2 qs2 = (9AK) A00.get(str);
            if (qs2 != null) {
                QS2 qs22 = qs2;
                GJj gJj = qs22.A02;
                FEK.A00(((9AK) qs22).A00, DKc.A01, gJj);
            }
        } finally {
            A002.unlock();
        }
    }

    public static final void A04(String str) {
        ReentrantReadWriteLock.ReadLock A002 = A00(str);
        try {
            QS2 qs2 = (9AK) A00.get(str);
            if (qs2 != null) {
                QS2 qs22 = qs2;
                GJj gJj = qs22.A03;
                FEK.A00(((9AK) qs22).A00, DKc.A01, gJj);
            }
        } finally {
            A002.unlock();
        }
    }
}
