package com.facebook.messaging.business.notificationmessages.notificationmessagetopics.fragment;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.2Ov;
import X.7zQ;
import X.AbJ;
import X.AbM;
import X.B9R;
import X.C06c;
import X.DR6;
import X.Rig;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: NotificationMessageTopicsDialogFragment.class */
public final class NotificationMessageTopicsDialogFragment extends 2Ov {
    public View A00;
    public ThreadKey A01;

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ Dialog A0n(Bundle bundle) {
        Context requireContext = requireContext();
        View inflate = LayoutInflater.from(requireContext).inflate(2132542596, (ViewGroup) null);
        11T.A0A(inflate);
        this.A00 = inflate;
        DR6 A02 = 7zQ.A0l().A02(requireContext);
        View view = this.A00;
        if (view == null) {
            11T.A0L("itemView");
            throw 0Q8.createAndThrow();
        }
        A02.A0I(view);
        A02.A0G(Rig.A00, getString(2131962249));
        return A02.A04();
    }

    public void onActivityCreated(Bundle bundle) {
        Window window;
        int A02 = 0FI.A02(-1181367628);
        super.onActivityCreated(bundle);
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        0FI.A08(884149928, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1048642956);
        View view = this.A00;
        if (view == null) {
            11T.A0L("itemView");
            throw 0Q8.createAndThrow();
        }
        0FI.A08(1973665032, A02);
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        Parcelable parcelable = requireArguments().getParcelable("arg_thread_key");
        if (parcelable == null) {
            throw 1BK.A0h();
        }
        ThreadKey threadKey = (ThreadKey) parcelable;
        this.A01 = threadKey;
        if (threadKey == null) {
            AbM.A17();
            throw 0Q8.createAndThrow();
        }
        Bundle A05 = 1BK.A05();
        A05.putParcelable("THREAD_KEY", threadKey);
        A05.putInt("ENTRY_POINT", 3);
        Fragment b9r = new B9R();
        b9r.setArguments(A05);
        C06c A09 = AbJ.A09(this);
        A09.A0M(b9r, 2131366017);
        C06c.A00(A09, false);
    }
}
