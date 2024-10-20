package com.facebook.messaging.highlightstab.xsharelibraries.composer;

import X.06Z;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BM;
import X.4YU;
import X.6RU;
import X.7zR;
import X.94R;
import X.95K;
import X.9De;
import X.9GP;
import X.9Vw;
import X.A4w;
import X.AaX;
import X.AnonymousClass001;
import X.C37r;
import X.C9w2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.highlightstab.xsharelibraries.composer.HighlightsTabBirthdayComposerBottomSheetFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;

/* loaded from: HighlightsTabBirthdayComposerBottomSheetFragment.class */
public final class HighlightsTabBirthdayComposerBottomSheetFragment extends BaseMigBottomSheetDialogFragment {
    public static final 94R A03 = new 94R();
    public FbUserSession A00;
    public LithoView A01;
    public final AaX A02 = new C9w2() { // from class: X.8u9
        public void ABe() {
            HighlightsTabBirthdayComposerBottomSheetFragment.this.A0o();
        }

        public void CM5() {
            HighlightsTabBirthdayComposerBottomSheetFragment.this.A0o();
        }
    };
    public 9Vw composerController;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        LithoView A0M = 7zR.A0M(this);
        this.A01 = A0M;
        return A0M;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37r(70);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(561876322);
        super.onCreate(bundle);
        super.A02 = true;
        this.A00 = 1BM.A01(this);
        0FI.A08(653830376, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-1534912226);
        super.onDestroyView();
        this.A01 = null;
        0FI.A08(-1456112249, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        A1G().A0G(A03);
        LithoView lithoView = this.A01;
        if (lithoView != null) {
            Bundle requireArguments = requireArguments();
            HighlightsFeedContent highlightsFeedContent = (HighlightsFeedContent) requireArguments.getParcelable("feed_content");
            if (highlightsFeedContent == null) {
                throw AnonymousClass001.A0N("feed_content required");
            }
            Context A08 = 4YU.A08(lithoView);
            6RU r0 = new 6RU(A08);
            ThreadKey threadKey = (ThreadKey) requireArguments.getParcelable("thread_key");
            if (threadKey == null) {
                throw AnonymousClass001.A0N("thread_key required");
            }
            Context requireContext = requireContext();
            FbUserSession fbUserSession = this.A00;
            if (fbUserSession != null) {
                06Z parentFragmentManager = getParentFragmentManager();
                FragmentActivity activity = getActivity();
                AaX aaX = this.A02;
                A4w a4w = new A4w(activity, requireContext, parentFragmentManager, fbUserSession, highlightsFeedContent, aaX);
                95K r02 = 95K.A02;
                FbUserSession fbUserSession2 = this.A00;
                if (fbUserSession2 != null) {
                    this.composerController = new 9Vw(A08, this, fbUserSession2, lithoView, highlightsFeedContent, a4w, r02, aaX, threadKey, 9GP.A00, r0, "");
                    return;
                }
            }
            11T.A0L("fbUserSession");
            throw 0Q8.createAndThrow();
        }
    }
}
