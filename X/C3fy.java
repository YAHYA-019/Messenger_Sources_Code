package X;

import com.facebook.xanalytics.XAnalyticsNative;
import com.facebook.xanalytics.provider.NativeXAnalyticsProvider;

/* renamed from: X.3fy, reason: invalid class name */
/* loaded from: 3fy.class */
public final class C3fy implements Runnable {
    public static final String __redex_internal_original_name = "NativeXAnalyticsProvider$2";
    public final /* synthetic */ NativeXAnalyticsProvider A00;

    public C3fy(NativeXAnalyticsProvider nativeXAnalyticsProvider) {
        this.A00 = nativeXAnalyticsProvider;
    }

    @Override // java.lang.Runnable
    public void run() {
        0fH.A0j(NativeXAnalyticsProvider.A07, "Timed Flush");
        XAnalyticsNative xAnalyticsNative = this.A00.A03;
        xAnalyticsNative.flush();
        xAnalyticsNative.kickOffUpload();
    }
}
