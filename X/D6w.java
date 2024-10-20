package X;

import com.facebook.orca.threadview.ThreadViewActivity;

/* loaded from: D6w.class */
public final class D6w implements Runnable {
    public static final String __redex_internal_original_name = "ThreadViewActivity$3";
    public final /* synthetic */ ThreadViewActivity A00;

    public D6w(ThreadViewActivity threadViewActivity) {
        this.A00 = threadViewActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ThreadViewActivity threadViewActivity = this.A00;
            if (threadViewActivity.A04) {
                super/*com.facebook.base.activity.FbFragmentActivity*/.onBackPressed();
                threadViewActivity.overridePendingTransition(2130772066, 2130772067);
            }
        } catch (Exception e) {
            0fH.A0r("ThreadViewActivity", "Error while processing queued back button operation", e);
        }
    }
}
