package X;

import com.facebook.browser.liteclient.report.BrowserRapidReportingHostActivity;

/* loaded from: Fzd.class */
public final class Fzd implements Runnable {
    public static final String __redex_internal_original_name = "BrowserRapidReportingHostActivity$1";
    public final /* synthetic */ BrowserRapidReportingHostActivity A00;

    public Fzd(BrowserRapidReportingHostActivity browserRapidReportingHostActivity) {
        this.A00 = browserRapidReportingHostActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.finish();
    }
}
