package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;

/* loaded from: Ej6.class */
public final class Ej6 {
    public final Eou A00;
    public final QuickPerformanceLogger A01;

    public Ej6() {
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        this.A01 = qPLInstance;
        this.A00 = new Eou(qPLInstance);
    }
}
