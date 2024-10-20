package com.facebook.messaging.highlightstab.xsharelibraries.composer;

import X.06Z;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BM;
import X.6RU;
import X.8uA;
import X.95K;
import X.9Vw;
import X.A4w;
import X.AaX;
import X.AnonymousClass001;
import X.C00m;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.highlightstab.xsharelibraries.composer.common.BaseHTBottomSheetDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import kotlin.jvm.functions.Function2;

/* loaded from: HighlightsTabComposerBottomSheetFragment.class */
public final class HighlightsTabComposerBottomSheetFragment extends BaseHTBottomSheetDialogFragment {
    public LithoView A00;
    public 6RU A01;
    public C00m A02;
    public Function2 A03;
    public final AaX A04 = new 8uA(this);
    public 9Vw composerController;

    public void onDestroyView() {
        int A02 = 0FI.A02(448367057);
        super.onDestroyView();
        this.A00 = null;
        this.A02 = null;
        0FI.A08(-178012667, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.highlightstab.xsharelibraries.composer.common.BaseHTBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        LithoView lithoView = this.A00;
        if (lithoView == null) {
            return;
        }
        Bundle requireArguments = requireArguments();
        HighlightsFeedContent highlightsFeedContent = (HighlightsFeedContent) requireArguments.getParcelable("feed_content");
        if (highlightsFeedContent == null) {
            throw AnonymousClass001.A0N("feed_content required");
        }
        FbUserSession A01 = 1BM.A01(this);
        Context requireContext = requireContext();
        6RU r0 = this.A01;
        if (r0 == null) {
            11T.A0L("composerContext");
            throw 0Q8.createAndThrow();
        }
        ThreadKey threadKey = (ThreadKey) requireArguments.getParcelable("thread_key");
        if (threadKey == null) {
            throw AnonymousClass001.A0N("thread_key required");
        }
        Context requireContext2 = requireContext();
        06Z parentFragmentManager = getParentFragmentManager();
        FragmentActivity activity = getActivity();
        AaX aaX = this.A04;
        A4w a4w = new A4w(activity, requireContext2, parentFragmentManager, A01, highlightsFeedContent, aaX);
        95K r02 = 95K.A03;
        String string = requireArguments.getString("initial_text");
        if (string == null) {
            throw AnonymousClass001.A0N("initial_text required");
        }
        this.composerController = new 9Vw(requireContext, this, A01, lithoView, highlightsFeedContent, a4w, r02, aaX, threadKey, (NavigationTrigger) null, r0, string);
    }
}
