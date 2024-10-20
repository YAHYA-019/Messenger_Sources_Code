package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.4Il, reason: invalid class name */
/* loaded from: 4Il.class */
public abstract class C4Il {
    public 4JF A00;
    public List A01;
    public Executor A03;
    public Executor A04;
    public boolean A05;
    public final java.util.Map A07;
    public final java.util.Map A0A;
    public volatile 4KI A0B;
    public final C4J6 A06 = new C4J6(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    public java.util.Map A02 = new LinkedHashMap();
    public final ReentrantReadWriteLock A08 = new ReentrantReadWriteLock();
    public final ThreadLocal A09 = new ThreadLocal();

    public C4Il() {
        java.util.Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        11T.A0A(synchronizedMap);
        this.A0A = synchronizedMap;
        this.A07 = new LinkedHashMap();
    }

    public static final void A00(C4Il c4Il) {
        c4Il.A05();
        4KH BL3 = c4Il.A03().BL3();
        c4Il.A06.A04(BL3);
        SQLiteDatabase sQLiteDatabase = BL3.A00;
        if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
            C01m.A02(sQLiteDatabase, 532084787);
        } else {
            C01m.A01(sQLiteDatabase, 688438778);
        }
    }

    public static final void A01(C4Il c4Il) {
        c4Il.A03().BL3().AQJ();
        if (c4Il.A03().BL3().A00.inTransaction()) {
            return;
        }
        C4J6 c4j6 = c4Il.A06;
        if (c4j6.A06.compareAndSet(false, true)) {
            Executor executor = c4j6.A02.A03;
            if (executor == null) {
                11T.A0L("internalQueryExecutor");
                throw 0Q8.createAndThrow();
            }
            executor.execute(c4j6.A04);
        }
    }

    public Cursor A02(4KE r302) {
        A05();
        A06();
        return A03().BL3().CaQ(r302);
    }

    public 4JF A03() {
        4JF r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        11T.A0L("internalOpenHelper");
        throw 0Q8.createAndThrow();
    }

    public Object A04(Callable callable) {
        A07();
        try {
            Object call = callable.call();
            A08();
            return call;
        } finally {
            A01(this);
        }
    }

    public void A05() {
        if (!this.A05 && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw AnonymousClass001.A0N("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void A06() {
        if (!A03().BL3().A00.inTransaction() && this.A09.get() != null) {
            throw AnonymousClass001.A0N("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void A07() {
        A05();
        A00(this);
    }

    public void A08() {
        A03().BL3().A00.setTransactionSuccessful();
    }
}
