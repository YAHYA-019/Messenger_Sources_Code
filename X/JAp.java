package X;

import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.PregenerateSdpWrapper;
import kotlin.jvm.functions.Function1;

/* loaded from: JAp.class */
public final class JAp extends C00q implements Function1 {
    public static final JAp A00 = new JAp();

    public JAp() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        long A05 = AnonymousClass001.A05(obj);
        synchronized (PregenerateSdpWrapper.A01) {
            z = PregenerateSdpWrapper.A02;
        }
        int i = 4;
        if (z) {
            i = 5;
        }
        return new PregenerateSdpWrapper(i, A05);
    }
}
