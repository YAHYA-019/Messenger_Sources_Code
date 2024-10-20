package X;

import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: DFx.class */
public interface DFx {
    ListenableFuture BOK(CallerContext callerContext, ImmutableList immutableList, Executor executor, boolean z);
}
