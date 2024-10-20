package androidx.lifecycle;

import X.2aI;
import X.C00m;
import X.C2a2;
import kotlin.jvm.functions.Function2;

/* loaded from: BlockRunner.class */
public final class BlockRunner {
    public final Function2 block;
    public C2a2 cancellationJob;
    public final CoroutineLiveData liveData;
    public final C00m onDone;
    public C2a2 runningJob;
    public final 2aI scope;
    public final long timeoutInMs = 5000;

    public BlockRunner(CoroutineLiveData coroutineLiveData, Function2 function2, long j, 2aI r306, C00m c00m) {
        this.liveData = coroutineLiveData;
        this.block = function2;
        this.scope = r306;
        this.onDone = c00m;
    }
}
