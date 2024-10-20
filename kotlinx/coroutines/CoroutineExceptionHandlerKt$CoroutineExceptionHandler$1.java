package kotlinx.coroutines;

import X.0DC;
import X.0DE;
import X.G7R;
import kotlin.jvm.functions.Function2;

/* loaded from: CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1.class */
public final class CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1 extends 0DC implements CoroutineExceptionHandler {
    public final /* synthetic */ Function2 $handler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1(Function2 function2, G7R g7r) {
        super(g7r);
        this.$handler = function2;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(0DE r302, Throwable th) {
        this.$handler.invoke(r302, th);
    }
}
