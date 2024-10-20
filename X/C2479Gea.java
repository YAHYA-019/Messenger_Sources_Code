package X;

import com.facebook.messaging.media.loader.LocalMediaLoaderParams;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.AbstractCollection;

/* renamed from: X.Gea, reason: case insensitive filesystem */
/* loaded from: Gea.class */
public final class C2479Gea extends 1RM {
    public final LocalMediaLoaderParams A00;
    public final /* synthetic */ IQR A01;

    public C2479Gea(IQR iqr, LocalMediaLoaderParams localMediaLoaderParams) {
        this.A01 = iqr;
        this.A00 = localMediaLoaderParams;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        IQR iqr = this.A01;
        LocalMediaLoaderParams localMediaLoaderParams = this.A00;
        HaR haR = (HaR) iqr.A06.get();
        int size = abstractCollection.size();
        QuickPerformanceLogger quickPerformanceLogger = haR.A01;
        quickPerformanceLogger.markerAnnotate(5505085, "final_count", String.valueOf(size));
        quickPerformanceLogger.markerEnd(5505085, (short) 2);
        2TV r0 = iqr.A00;
        if (r0 != null) {
            r0.C9D(localMediaLoaderParams, abstractCollection);
            iqr.A00.C4X(localMediaLoaderParams, abstractCollection);
        }
    }

    public void A03(Throwable th) {
        IQR iqr = this.A01;
        LocalMediaLoaderParams localMediaLoaderParams = this.A00;
        ((HaR) iqr.A06.get()).A01.markerDrop(5505085);
        2TV r0 = iqr.A00;
        if (r0 != null) {
            r0.C47(localMediaLoaderParams, th);
        }
    }
}
