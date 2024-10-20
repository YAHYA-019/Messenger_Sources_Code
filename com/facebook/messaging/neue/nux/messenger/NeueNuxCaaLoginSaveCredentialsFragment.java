package com.facebook.messaging.neue.nux.messenger;

import X.0FI;
import X.AbG;
import X.FGr;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.messaging.neue.nux.annotations.INeueNuxMilestoneFragment;

/* loaded from: NeueNuxCaaLoginSaveCredentialsFragment.class */
public final class NeueNuxCaaLoginSaveCredentialsFragment extends NuxFragment implements CallerContextable, INeueNuxMilestoneFragment {
    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(380631509);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        Context context = getContext();
        if (context == null || !FGr.A02()) {
            A1e(null, null);
        } else {
            FGr.A00(context);
        }
        0FI.A08(1671427923, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1828948187);
        super/*androidx.fragment.app.Fragment*/.onCreateView(layoutInflater, viewGroup, bundle);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132541651);
        0FI.A08(1121784985, A02);
        return A08;
    }
}
