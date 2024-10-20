package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.bloks.messenger.activity.MSGBloksActivity;
import com.facebook.messaging.integrity.frx.model.FRXEvidencePrompt;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.integrity.frx.model.ProactiveWarningParams;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;

/* loaded from: Cjd.class */
public final class Cjd implements AXl {
    public final /* synthetic */ 06Z A00;
    public final /* synthetic */ DDz A01;
    public final /* synthetic */ DFB A02;
    public final /* synthetic */ FRXParams A03;
    public final /* synthetic */ 6Iq A04;
    public final /* synthetic */ User A05;

    public Cjd(06Z r302, DDz dDz, DFB dfb, FRXParams fRXParams, 6Iq r306, User user) {
        this.A04 = r306;
        this.A03 = fRXParams;
        this.A05 = user;
        this.A00 = r302;
        this.A01 = dDz;
        this.A02 = dfb;
    }

    /* JADX WARN: Type inference failed for: r0v107, types: [com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v67, types: [com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment, androidx.fragment.app.Fragment, java.lang.Object] */
    @Override // X.AXl
    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        Long A14;
        FeedbackReportFragment feedbackReportFragment;
        6Iq r0 = this.A04;
        FRXParams fRXParams = this.A03;
        User user = this.A05;
        06Z r02 = this.A00;
        DDz dDz = this.A01;
        DFB dfb = this.A02;
        String str = fRXParams.A0C;
        boolean z = fRXParams.A0F;
        MigColorScheme migColorScheme = fRXParams.A06;
        C5yl c5yl = fRXParams.A09;
        FRXEvidencePrompt fRXEvidencePrompt = fRXParams.A01;
        Integer num = fRXParams.A0B;
        boolean z2 = fRXParams.A0G;
        C5yq c5yq = fRXParams.A00;
        Message message = fRXParams.A03;
        String str2 = fRXParams.A0D;
        UserKey userKey = fRXParams.A08;
        ProactiveWarningParams proactiveWarningParams = fRXParams.A02;
        boolean z3 = fRXParams.A0H;
        boolean z4 = fRXParams.A0I;
        boolean z5 = fRXParams.A0J;
        ThreadKey threadKey = fRXParams.A04;
        FRXParams fRXParams2 = new FRXParams(c5yq, fRXEvidencePrompt, proactiveWarningParams, message, threadKey, fRXParams.A05, migColorScheme, user, userKey, c5yl, (ImmutableList) obj, num, str, str2, AbF.A1E(fRXParams.A0E), z, z2, z3, z4, z5, fRXParams.A0K);
        Bundle A05 = 1BK.A05();
        A05.putParcelable("frx_params_key", fRXParams2);
        ?? feedbackReportFragment2 = new FeedbackReportFragment();
        feedbackReportFragment2.setArguments(A05);
        r0.A00 = feedbackReportFragment2;
        String A00 = C01e.A00(feedbackReportFragment2.getClass());
        11T.A0A(A00);
        if (dfb != null && (feedbackReportFragment = r0.A00) != null) {
            feedbackReportFragment.A0D = dfb;
        }
        if (dDz != null) {
            ?? r03 = r0.A00;
            if (r03 == 0) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            r03.A01 = dDz;
            ((MSGBloksActivity) dDz).A00.Czy((Fragment) r03, A00);
        } else {
            FeedbackReportFragment feedbackReportFragment3 = r0.A00;
            if (feedbackReportFragment3 != null) {
                feedbackReportFragment3.A0m(r02, A00);
            }
        }
        if (threadKey != null && (A14 = AbF.A14(threadKey)) != null) {
            ClY clY = new ClY(r0, A14, 3);
            FeedbackReportFragment feedbackReportFragment4 = r0.A00;
            if (feedbackReportFragment4 != null) {
                feedbackReportFragment4.A0t.add(clY);
            }
            if (r0.A00 == null) {
                0fH.A0o("FRXFragmentLauncher", 4YT.A00(556));
            }
        }
        r0.A01 = false;
    }
}
