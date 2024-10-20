package X;

import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.bugreporter.activity.bugreport.BugReportFragment;

/* loaded from: Fzg.class */
public final class Fzg implements Runnable {
    public static final String __redex_internal_original_name = "BugReportFragment$7";
    public final /* synthetic */ BugReportFragment A00;

    public Fzg(BugReportFragment bugReportFragment) {
        this.A00 = bugReportFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        Window window;
        FragmentActivity activity = this.A00.getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.addFlags(128);
    }
}
