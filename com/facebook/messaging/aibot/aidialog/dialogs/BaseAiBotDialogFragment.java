package com.facebook.messaging.aibot.aidialog.dialogs;

import X.06Z;
import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.2Ov;
import X.4YU;
import X.5SW;
import X.5WH;
import X.7zL;
import X.7zN;
import X.7zO;
import X.8CJ;
import X.AnonymousClass201;
import X.C06c;
import X.C0ty;
import X.C1zz;
import X.C2yk;
import X.C5bb;
import X.C9gk;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.aibot.handlers.initparams.OnThreadOpenSendMessageParamsMetadata;
import com.facebook.messaging.msys.thread.componentcreator.threadview.initparams.ThreadViewDisableProfileImgParamsMetadata;
import com.facebook.messaging.msys.thread.componentcreator.threadview.initparams.ThreadViewDisableTitleParamsMetadata;
import com.facebook.messaging.msys.thread.componentcreator.threadview.initparams.ThreadViewQuickReplyTrayParamsMetadata;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: BaseAiBotDialogFragment.class */
public abstract class BaseAiBotDialogFragment extends 2Ov {
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-507714650);
        super.onCreate(bundle);
        A0g(2, 2132608826);
        0FI.A08(2036697203, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v69, types: [androidx.fragment.app.Fragment, com.facebook.messaging.aibot.aidialog.dialogs.AiBotFabDialogFragment] */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentActivity activity;
        Window window;
        float f = 0.0f / 0.0f;
        int A02 = 0FI.A02(2144288432);
        11T.A0F(layoutInflater, 0);
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            float f2 = 0.0f / 0.0f;
            C2yk.A00(window, -1);
        }
        View inflate = layoutInflater.inflate(2132541498, viewGroup, false);
        11T.A0I(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        11T.A0F(inflate, 0);
        View requireViewById = inflate.requireViewById(2131362001);
        11T.A0I(requireViewById, "null cannot be cast to non-null type com.facebook.widget.RoundedCornersFrameLayout");
        int dimensionPixelOffset = 7zO.A0D(this).getDimensionPixelOffset(2132279311);
        C5bb c5bb = new C5bb(0);
        c5bb.CmI(0, 7zL.A01(7zO.A0D(this), 2132279351));
        c5bb.Cte(dimensionPixelOffset);
        DisplayMetrics displayMetrics = 7zO.A0D(this).getDisplayMetrics();
        5WH r0 = new 5WH(requireViewById.getLayoutParams());
        r0.setMargins(0, 0, 0, 10);
        ((ViewGroup.LayoutParams) r0).width = (int) (displayMetrics.widthPixels * 0.94f);
        ((ViewGroup.LayoutParams) r0).height = (int) (displayMetrics.heightPixels * 0.64f);
        requireViewById.setLayoutParams(r0);
        requireViewById.setForeground(c5bb);
        requireViewById.setElevation(4.0f);
        requireViewById.setOutlineProvider(new 8CJ(dimensionPixelOffset, 1));
        06Z A08 = 7zN.A08(this);
        ?? r02 = (AiBotFabDialogFragment) this;
        Bundle bundle2 = r02.mArguments;
        String string = bundle2 != null ? bundle2.getString("message_to_send_on_thread_open") : null;
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        AnonymousClass201 A00 = C1zz.A00();
        A00.A01(ThreadViewDisableProfileImgParamsMetadata.A01, new ThreadViewDisableProfileImgParamsMetadata(true));
        A00.A01(ThreadViewDisableTitleParamsMetadata.A01, new ThreadViewDisableTitleParamsMetadata(true));
        A00.A01(OnThreadOpenSendMessageParamsMetadata.A0C, new OnThreadOpenSendMessageParamsMetadata(null, string, null, null, null, null, null, null, null, null, null, null));
        A00.A01(ThreadViewQuickReplyTrayParamsMetadata.A02, new ThreadViewQuickReplyTrayParamsMetadata(true, null));
        C9gk c9gk = C9gk.A00;
        FbUserSession fbUserSession = r02.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        r02.requireContext();
        Fragment A002 = c9gk.A00(fbUserSession, 5SW.A09, A00, null, C0ty.A00);
        if (A002 != null && (activity = getActivity()) != null && !activity.isFinishing() && !A08.A1U()) {
            C06c A0G = 7zL.A0G(A08);
            A0G.A0Q(A002, 4YU.A15(A002), 2131362001);
            A0G.A0V(4YU.A15(A002));
            A0G.A04();
        }
        0FI.A08(626340745, A02);
        return inflate;
    }
}
