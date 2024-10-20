package X;

import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.bugreporter.activity.bugreport.BugReportFragment;

/* loaded from: Fzh.class */
public final class Fzh implements Runnable {
    public static final String __redex_internal_original_name = "BugReportFragment$8";
    public final /* synthetic */ BugReportFragment A00;

    public Fzh(BugReportFragment bugReportFragment) {
        this.A00 = bugReportFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        Window window;
        FragmentActivity activity = this.A00.getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.clearFlags(128);
    }
}
