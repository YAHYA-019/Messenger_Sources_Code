package X;

import android.app.Dialog;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import kotlin.jvm.functions.Function1;

/* loaded from: Fww.class */
public final class Fww implements GJ2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Fww(C2125Dee c2125Dee, C00m c00m, Function1 function1) {
        this.A00 = 0;
        this.A03 = c2125Dee;
        this.A02 = c00m;
        this.A01 = function1;
    }

    public Fww(F99 f99, C00m c00m, C00m c00m2, int i) {
        this.A00 = i;
        this.A03 = f99;
        this.A02 = c00m;
        this.A01 = c00m2;
    }

    @Override // X.GJ2
    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                ((Dialog) this.A03).dismiss();
                7zL.A1T(this.A01, th);
                Ea1.A00 = false;
                return;
            case 3:
                ((F99) this.A03).A05.invoke(new FZe(this.A01, 3));
                return;
            default:
                F99 f99 = (F99) this.A03;
                QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) 7T1.A00.get();
                11T.A0A(quickPerformanceLogger);
                if (th != null) {
                    quickPerformanceLogger.markerAnnotate(2293785, TraceFieldType.FailureReason, th.getMessage());
                }
                quickPerformanceLogger.markerEnd(2293785, (short) 3);
                f99.A04.invoke();
                7zL.A1R(this.A01);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.GJ2
    public void onSuccess() {
        C00m c00m;
        switch (this.A00) {
            case 0:
                ((Dialog) this.A03).dismiss();
                7zL.A1R(this.A02);
                Ea1.A00 = false;
                return;
            case 1:
            default:
                ((F99) this.A03).A04.invoke();
                c00m = (C00m) this.A02;
                c00m.invoke();
                return;
            case 2:
                ((F99) this.A03).A04.invoke();
                7zL.A1R(this.A02);
                04J r0 = F3h.A00;
                return;
            case 3:
                ((F99) this.A03).A04.invoke();
                c00m = (C00m) this.A02;
                if (c00m == null) {
                    return;
                }
                c00m.invoke();
                return;
        }
    }
}
