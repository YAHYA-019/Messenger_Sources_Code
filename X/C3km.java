package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.3km, reason: invalid class name */
/* loaded from: 3km.class */
public final class C3km extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3km(Object obj, Object obj2, int i) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        4dB r305;
        Object obj2;
        Function2 function2;
        Object obj3;
        switch (this.A00) {
            case 0:
                11T.A0F(obj, 0);
                KYx.A00(DKB.A00(26), AnonymousClass001.A0Z(obj, "getDeviceConfig: linkedDeviceConfig=", AnonymousClass001.A0k()));
                function2 = (Function2) this.A02;
                obj3 = this.A01;
                11T.A0D(obj3);
                function2.invoke(obj, obj3);
                return 04S.A00;
            case 1:
                11T.A0F(obj, 0);
                KYx.A00(DKB.A00(26), AnonymousClass001.A0Z(obj, "getDeviceConfig: linkedDeviceConfig=", AnonymousClass001.A0k()));
                function2 = (Function2) this.A02;
                obj3 = this.A01;
                function2.invoke(obj, obj3);
                return 04S.A00;
            case 2:
                Throwable th = (Throwable) obj;
                C3e5 c3e5 = (C3e5) this.A01;
                if (th == null) {
                    Object A0B = ((4cZ) this.A02).A0B();
                    if (!(!(A0B instanceof C2a6))) {
                        throw AnonymousClass001.A0N("This job has not completed yet");
                    }
                    if (A0B instanceof C2s6) {
                        throw ((C2s6) A0B).A00;
                    }
                    c3e5.A01.set(C2a4.A00(A0B));
                } else {
                    boolean z = th instanceof CancellationException;
                    SettableFuture settableFuture = c3e5.A01;
                    if (z) {
                        settableFuture.set(new 3K8((CancellationException) th));
                    } else if (settableFuture.setException(th)) {
                        c3e5.A00 = true;
                    }
                }
                return 04S.A00;
            case 3:
                r305 = (4dB) this.A01;
                obj2 = null;
                r305.D5h(obj2);
                return 04S.A00;
            case 4:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 4dB.A01;
                r305 = (4dB) this.A01;
                obj2 = null;
                atomicReferenceFieldUpdater.set(r305, null);
                r305.D5h(obj2);
                return 04S.A00;
            case 5:
                r305 = (4dB) this.A02;
                obj2 = this.A01;
                r305.D5h(obj2);
                return 04S.A00;
            default:
                11T.A0F(obj, 0);
                return new GAd(14, obj, this.A01, this.A02);
        }
    }
}
