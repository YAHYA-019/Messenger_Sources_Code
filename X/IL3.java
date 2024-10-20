package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.messaging.neue.nux.profilepic.PartialNuxCameraFragment;
import com.facebook.surveyplatform.remix.ui.RemixFooterFragment;
import com.facebook.surveyplatform.remix.ui.RemixSurveyDialogActivity;
import com.facebook.widget.refreshableview.RefreshableViewItem;
import java.util.List;

/* loaded from: IL3.class */
public final class IL3 implements Animation.AnimationListener {
    public final int A00;
    public final Object A01;

    public IL3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Animation animation, Object obj, int i) {
        animation.setAnimationListener(new IL3(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        0D2 r310;
        View view;
        String str;
        switch (this.A00) {
            case 1:
                IL0 il0 = ((IoQ) this.A01).A00;
                DZA dza = (DZA) il0.A01;
                if (dza.getActivity() != null) {
                    1pK r0 = (1pK) il0.A02;
                    if (!r0.A1V() || r0.mView == null) {
                        return;
                    }
                    FragmentActivity activity = dza.getActivity();
                    String str2 = dza.A03;
                    06Z BDe = activity.BDe();
                    List<DZA> A0A = BDe.A0T.A0A();
                    C06c c06c = new C06c(BDe);
                    for (DZA dza2 : A0A) {
                        if (dza2 != null && (dza2 instanceof DZA) && (str = dza2.A03) != null && !str.equals(str2)) {
                            c06c.A0I((Fragment) dza2);
                        }
                    }
                    c06c.A05();
                    activity.BDe().A0t();
                    dza.requireActivity().getWindow().clearFlags(16);
                    if (dza.A02 != null) {
                        ((Evo) dza.A07.get()).A00(dza.A02.A0r(2034962521), (System.nanoTime() - dza.A00) / 1000000, C05a.A00(dza.getActivity()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((AlJ) this.A01).A1Y();
                return;
            case 3:
                view = (View) this.A01;
                view.setVisibility(8);
                return;
            case 4:
                view = ((PartialNuxCameraFragment) this.A01).A05;
                view.setVisibility(8);
                return;
            case 5:
                try {
                    ((RemixFooterFragment) this.A01).A03.A02(HB6.A04);
                } catch (HCx e) {
                    0fH.A12("Survey Remix: ", "%s: Cancelling violated the state machine. %s %s PLEASE FIX.", e, new Object[]{"Survey Remix: ", "You might have cancelled the survey mutiple times.", "We're dismissing the view since we're in an unknown state."});
                }
                r310 = (0D2) this.A01;
                FragmentActivity activity2 = r310.getActivity();
                if (activity2 != null && (activity2 instanceof RemixSurveyDialogActivity)) {
                    activity2.finish();
                }
                r310.A0o();
                return;
            case 6:
                r310 = ((H62) ((H59) this.A01).A05).A01;
                r310.A0o();
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        switch (this.A00) {
            case 0:
                ((GU2) this.A01).A00++;
                return;
            case 7:
                RefreshableViewItem refreshableViewItem = (RefreshableViewItem) this.A01;
                C66h c66h = RefreshableViewItem.A0E;
                Context context = refreshableViewItem.getContext();
                if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                    RefreshableViewItem.A03(refreshableViewItem);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        if (4 - this.A00 == 0) {
            ((PartialNuxCameraFragment) this.A01).A05.setVisibility(0);
        }
    }
}
