package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import kotlin.jvm.functions.Function1;

/* renamed from: X.4l1, reason: invalid class name */
/* loaded from: 4l1.class */
public final /* synthetic */ class C4l1 extends 01I implements 0Be {
    public static final C4l1 A00 = new C4l1();

    public C4l1() {
        super(4, C07804kv.class, "<init>", "<init>(Lcom/facebook/quicklog/QuickPerformanceLogger;ILcom/facebook/xapp/messaging/threadpre/tltv/utils/ThreadPREErrorReporter;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) obj;
        int intValue = ((Number) obj2).intValue();
        C6ia c6ia = (C6ia) obj3;
        11T.A0F(quickPerformanceLogger, 0);
        11T.A0F(c6ia, 2);
        return new C07804kv(quickPerformanceLogger, c6ia, (Function1) obj4, intValue);
    }
}
