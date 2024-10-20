package X;

import com.facebook.common.dextricks.stats.ClassLoadingStats;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0sL, reason: invalid class name */
/* loaded from: 0sL.class */
public final class C0sL extends ClassLoadingStats {
    public final AtomicInteger A00 = new AtomicInteger();
    public final AtomicInteger A01 = new AtomicInteger();
    public final AtomicInteger A02 = new AtomicInteger();
    public final AtomicInteger A03 = new AtomicInteger();

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public void decrementDexFileQueries() {
        this.A02.decrementAndGet();
    }

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public int getClassLoadsAttempted() {
        return this.A00.get();
    }

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public int getClassLoadsFailed() {
        return this.A01.get();
    }

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public int getDexFileQueries() {
        return this.A02.get();
    }

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public int getIncorrectDfaGuesses() {
        return this.A03.get();
    }

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public int getLocatorAssistedClassLoads() {
        return 0;
    }

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public void incrementClassLoadsAttempted() {
        this.A00.incrementAndGet();
    }

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public void incrementClassLoadsFailed() {
        this.A01.incrementAndGet();
    }

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public void incrementDexFileQueries(int i) {
        this.A02.addAndGet(i);
    }

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public void incrementIncorrectDfaGuesses() {
        this.A03.incrementAndGet();
    }
}
