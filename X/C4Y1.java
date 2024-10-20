package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function2;

/* renamed from: X.4Y1, reason: invalid class name */
/* loaded from: 4Y1.class */
public final /* synthetic */ class C4Y1 extends 01I implements Function2 {
    public static final C4Y1 A00 = new C4Y1();

    public C4Y1() {
        super(2, 4GB.class, 4YT.A00(1026), "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        4GC r0 = (4GC) obj2;
        int i = 4GB.A01;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 45B.A01;
        C4G6 c4g6 = r0.A00;
        11T.A0D(c4g6);
        return new 4GC(c4g6, r0, 0, longValue);
    }
}
