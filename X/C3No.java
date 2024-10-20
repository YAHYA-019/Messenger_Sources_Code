package X;

import com.facebook.inject.FbInjector;
import com.facebook.jsi.module.JsiHeapInfo;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.3No, reason: invalid class name */
/* loaded from: 3No.class */
public final class C3No {
    public final Set A00 = 1Bi.A06(280);
    public final C00i A01 = FbInjector.A00;

    public JsiHeapInfo A00() {
        JsiHeapInfo jsiHeapInfo = new JsiHeapInfo();
        Set set = this.A00;
        CountDownLatch countDownLatch = new CountDownLatch(set.size());
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("provideJsiInstrumentation");
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        return jsiHeapInfo;
    }
}
