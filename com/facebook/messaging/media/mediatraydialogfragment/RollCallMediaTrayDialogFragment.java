package com.facebook.messaging.media.mediatraydialogfragment;

import X.0FI;
import X.0Gm;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1iF;
import X.AbF;
import X.C98M;
import X.H4t;
import X.IDF;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.media.swipeablemediatray.SwipeableMediaTrayContainerView;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.rollcall.model.RollCallArgs;
import java.io.Serializable;

/* loaded from: RollCallMediaTrayDialogFragment.class */
public final class RollCallMediaTrayDialogFragment extends MediaTrayDialogFragment {
    public C98M A00;
    public String A01;
    public String A02;

    public 1iF A17() {
        return AbF.A0C(1060323827715574L);
    }

    @Override // com.facebook.messaging.media.mediatraydialogfragment.MediaTrayDialogFragment
    public void A1C() {
        String str;
        super.A1C();
        SwipeableMediaTrayContainerView swipeableMediaTrayContainerView = ((MediaTrayDialogFragment) this).A00;
        if (swipeableMediaTrayContainerView != null) {
            String str2 = this.A01;
            if (str2 == null) {
                str = "rollCallId";
            } else {
                String str3 = this.A02;
                C98M c98m = this.A00;
                if (c98m == null) {
                    str = "rollCallEntryPoint";
                } else {
                    H4t A0V = swipeableMediaTrayContainerView.A0V();
                    A0V.A0R = str2;
                    A0V.A0S = str3;
                    A0V.A04 = c98m;
                    IDF idf = swipeableMediaTrayContainerView.A06;
                    if (idf != null) {
                        idf.A09 = false;
                        swipeableMediaTrayContainerView.A0V().A0X(0S2.A01);
                        return;
                    }
                    str = "swipeableMediaTrayHeaderController";
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.media.mediatraydialogfragment.MediaTrayDialogFragment, com.facebook.messaging.expandablecomponent.dialogfragment.ExpandableBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-831490094);
        super.onCreate(bundle);
        RollCallArgs rollCallArgs = (RollCallArgs) requireArguments().getParcelable("roll_call_args");
        if (rollCallArgs == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-2054150765, A02);
            throw A0h;
        }
        ((MediaTrayDialogFragment) this).A01 = rollCallArgs.A00;
        this.A01 = rollCallArgs.A01;
        this.A02 = rollCallArgs.A02;
        Serializable serializable = requireArguments().getSerializable("roll_call_entrypoint");
        11T.A0I(serializable, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.MsgRollCallCreationEntryPoint");
        this.A00 = (C98M) serializable;
        Parcelable parcelable = requireArguments().getParcelable("thread_summary");
        Parcelable.Creator creator = ThreadSummary.CREATOR;
        11T.A0B(creator);
        ((MediaTrayDialogFragment) this).A02 = (ThreadSummary) 0Gm.A01(creator, parcelable, ThreadSummary.class);
        0FI.A08(-241749152, A02);
    }
}
