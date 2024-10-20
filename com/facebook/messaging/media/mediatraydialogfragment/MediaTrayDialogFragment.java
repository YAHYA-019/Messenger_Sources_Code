package com.facebook.messaging.media.mediatraydialogfragment;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.7zL;
import X.7zT;
import X.C00m;
import X.Cm7;
import X.Cm8;
import X.Cm9;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource;
import com.facebook.messaging.expandablecomponent.dialogfragment.ExpandableBottomSheetDialogFragment;
import com.facebook.messaging.media.swipeablemediatray.SwipeableMediaTrayContainerView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: MediaTrayDialogFragment.class */
public abstract class MediaTrayDialogFragment extends ExpandableBottomSheetDialogFragment {
    public SwipeableMediaTrayContainerView A00;
    public ThreadKey A01;
    public ThreadSummary A02;
    public C00m A03;
    public FbUserSession A04;

    /* JADX WARN: Multi-variable type inference failed */
    public void A1C() {
        SwipeableMediaTrayContainerView swipeableMediaTrayContainerView = this.A00;
        if (swipeableMediaTrayContainerView != null) {
            ThreadKey threadKey = this.A01;
            if (threadKey != null) {
                FbUserSession fbUserSession = this.A04;
                if (fbUserSession == null) {
                    7zL.A1C();
                    throw 0Q8.createAndThrow();
                }
                swipeableMediaTrayContainerView.A0Z(fbUserSession, threadKey, this.A02);
            }
            swipeableMediaTrayContainerView.A0V().A0E = new Cm8(this);
            ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource = ComposerInitParamsSpec$ComposerLaunchSource.A06;
            swipeableMediaTrayContainerView.A02 = composerInitParamsSpec$ComposerLaunchSource;
            swipeableMediaTrayContainerView.A0V().A0A = composerInitParamsSpec$ComposerLaunchSource;
            Cm7 cm7 = new Cm7(this);
            swipeableMediaTrayContainerView.A04 = cm7;
            swipeableMediaTrayContainerView.A0V().A0C = cm7;
            Cm9 cm9 = new Cm9(this);
            swipeableMediaTrayContainerView.A07 = cm9;
            swipeableMediaTrayContainerView.A0V().A0F = cm9;
            swipeableMediaTrayContainerView.A0Y(getParentFragmentManager());
            swipeableMediaTrayContainerView.A0X();
            swipeableMediaTrayContainerView.A0V().A0X(0S2.A00);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.expandablecomponent.dialogfragment.ExpandableBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1454079802);
        super.onCreate(bundle);
        this.A04 = 7zT.A08(this);
        0FI.A08(-1827397429, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(339592148);
        SwipeableMediaTrayContainerView swipeableMediaTrayContainerView = this.A00;
        if (swipeableMediaTrayContainerView != null) {
            swipeableMediaTrayContainerView.A0W();
        }
        super.onDestroyView();
        this.A00 = null;
        0FI.A08(868759369, A02);
    }
}
