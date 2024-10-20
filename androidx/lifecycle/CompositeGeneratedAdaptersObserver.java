package androidx.lifecycle;

import X.11T;
import androidx.lifecycle.Lifecycle;

/* loaded from: CompositeGeneratedAdaptersObserver.class */
public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {
    public final GeneratedAdapter[] generatedAdapters;

    public CompositeGeneratedAdaptersObserver(GeneratedAdapter[] generatedAdapterArr) {
        this.generatedAdapters = generatedAdapterArr;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        11T.A0F(lifecycleOwner, 0);
        11T.A0F(event, 1);
        MethodCallsLogger methodCallsLogger = new MethodCallsLogger();
        GeneratedAdapter[] generatedAdapterArr = this.generatedAdapters;
        int length = generatedAdapterArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            generatedAdapterArr[i2].callMethods(lifecycleOwner, event, false, methodCallsLogger);
            i = i2 + 1;
        }
        for (GeneratedAdapter generatedAdapter : this.generatedAdapters) {
            generatedAdapter.callMethods(lifecycleOwner, event, true, methodCallsLogger);
        }
    }
}
