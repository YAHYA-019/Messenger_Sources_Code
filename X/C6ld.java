package X;

import com.facebook.messaging.wellbeing.enforcementfairness.plugins.hintcard.featurelimits.ReadOnlyFeatureLimitHintCardImplementation;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6ld, reason: invalid class name */
/* loaded from: 6ld.class */
public final class C6ld {
    public final C6lb A00;

    public C6ld(C6lb c6lb) {
        this.A00 = c6lb;
    }

    public void A00() {
        C6lc c6lc = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = c6lc.A1L;
        r0.A08("com.facebook.messaging.threadview.plugins.interfaces.hintcard.HintCardInterfaceSpec", "messaging.threadview.hintcard.HintCardInterfaceSpec", "onTearDown", andIncrement);
        try {
            C6lc.A00(c6lc);
            if (!C6lc.A03(c6lc)) {
                r0.A02((Exception) null, "messaging.threadview.hintcard.HintCardInterfaceSpec", "onTearDown", andIncrement);
                return;
            }
            int andIncrement2 = atomicInteger.getAndIncrement();
            try {
                r0.A0A("com.facebook.messaging.wellbeing.enforcementfairness.plugins.hintcard.featurelimits.ReadOnlyFeatureLimitHintCardImplementation", "messaging.wellbeing.enforcementfairness.hintcard.featurelimits.ReadOnlyFeatureLimitHintCardImplementation", "com.facebook.messaging.threadview.plugins.interfaces.hintcard.HintCardInterfaceSpec", andIncrement2, "messaging.threadview.hintcard.HintCardInterfaceSpec", "com.facebook.messaging.wellbeing.enforcementfairness.plugins.WellbeingEnforcementfairnessKillSwitch", "onTearDown");
                try {
                    ReadOnlyFeatureLimitHintCardImplementation readOnlyFeatureLimitHintCardImplementation = c6lc.A0V;
                    List A00 = ReadOnlyFeatureLimitHintCardImplementation.A00(readOnlyFeatureLimitHintCardImplementation, 6BI.A04);
                    if (!ReadOnlyFeatureLimitHintCardImplementation.A03(A00) && !ReadOnlyFeatureLimitHintCardImplementation.A02(readOnlyFeatureLimitHintCardImplementation, A00)) {
                        Bqu bqu = (Bqu) readOnlyFeatureLimitHintCardImplementation.A05.A00.get();
                        CEL cel = (CEL) bqu.A02.get(readOnlyFeatureLimitHintCardImplementation.A0B);
                        if (cel != null) {
                            if (CEL.A00(cel) && cel.A00) {
                                4YV.A0Z(cel.A04.A01).flowEndSuccess(cel.A01);
                                cel.A00 = false;
                            }
                            Bqu bqu2 = cel.A04;
                            String str = cel.A03;
                            java.util.Map map = bqu2.A02;
                            synchronized (map) {
                                map.remove(str);
                            }
                        }
                    }
                    r0.A04((Exception) null, "messaging.wellbeing.enforcementfairness.hintcard.featurelimits.ReadOnlyFeatureLimitHintCardImplementation", "messaging.threadview.hintcard.HintCardInterfaceSpec", "onTearDown", andIncrement2);
                    r0.A02((Exception) null, "messaging.threadview.hintcard.HintCardInterfaceSpec", "onTearDown", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r0.A04((Exception) null, "messaging.wellbeing.enforcementfairness.hintcard.featurelimits.ReadOnlyFeatureLimitHintCardImplementation", "messaging.threadview.hintcard.HintCardInterfaceSpec", "onTearDown", andIncrement2);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.threadview.hintcard.HintCardInterfaceSpec", "onTearDown", andIncrement);
            throw th2;
        }
    }
}
