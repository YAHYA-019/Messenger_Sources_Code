package kotlinx.coroutines.android;

import X.11T;
import X.4ZM;
import X.AnonymousClass001;
import X.C4G1;
import X.C4G2;
import X.C4G3;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* loaded from: AndroidDispatcherFactory.class */
public final class AndroidDispatcherFactory {
    public C4G3 createDispatcher(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            throw AnonymousClass001.A0N("The main looper is not available");
        }
        C4G2 c4g2 = 4ZM.A00;
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, mainLooper);
        11T.A0I(invoke, "null cannot be cast to non-null type android.os.Handler");
        return new C4G1((Handler) invoke, null, false);
    }

    public int getLoadPriority() {
        return (-1) >>> 2;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
