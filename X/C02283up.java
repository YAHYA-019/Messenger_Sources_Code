package X;

import android.content.Context;
import android.os.Build;
import com.facebook.inject.FbInjector;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.3up, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3up.class */
public final class C02283up {
    public static final C02293uq A03 = new Object();
    public Function1 A00;
    public Function2 A01;
    public volatile C02323ut A02;

    public C02283up() {
        C02293uq c02293uq = A03;
        this.A01 = new C02303ur(c02293uq);
        this.A00 = new C02313us(c02293uq);
    }

    public static final Integer A00(C02323ut c02323ut) {
        int i = c02323ut.A02;
        if (i == 0) {
            return 0S2.A00;
        }
        double d = i;
        double d2 = c02323ut.A01 / d;
        double d3 = c02323ut.A00 / d;
        return (Math.abs(d2 - 2.0d) >= 0.2d || d3 < 1.05d) ? (Math.abs(d2 - 1.0d) >= 0.2d || d3 > 0.95d) ? 0S2.A0N : 0S2.A01 : 0S2.A0C;
    }

    /* JADX WARN: Type inference failed for: r302v2, types: [X.3ut, java.lang.Object] */
    public final C02323ut A01() {
        C02323ut c02323ut = this.A02;
        C02323ut c02323ut2 = c02323ut;
        if (c02323ut == null) {
            Context A00 = FbInjector.A00();
            Function1 function1 = this.A00;
            11T.A0D(A00);
            Object invoke = function1.invoke(A00);
            ?? obj = new Object();
            Function2 function2 = this.A01;
            obj.A02 = ((Number) function2.invoke(invoke, "က")).intValue();
            obj.A01 = ((Number) function2.invoke(invoke, "က္က")).intValue();
            obj.A00 = ((Number) function2.invoke(invoke, "၎")).intValue();
            obj.A03 = Build.VERSION.SDK_INT;
            this.A02 = obj;
            c02323ut2 = obj;
        }
        return c02323ut2;
    }
}
