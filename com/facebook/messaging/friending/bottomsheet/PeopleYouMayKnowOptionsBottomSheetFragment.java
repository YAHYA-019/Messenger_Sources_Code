package com.facebook.messaging.friending.bottomsheet;

import X.1BM;
import X.1Lm;
import X.2VN;
import X.2ZG;
import android.content.Context;
import com.facebook.mig.bottomsheet.MigActionMenuDialogFragment;
import java.util.Iterator;

/* loaded from: PeopleYouMayKnowOptionsBottomSheetFragment.class */
public final class PeopleYouMayKnowOptionsBottomSheetFragment extends MigActionMenuDialogFragment {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(Context context, PeopleYouMayKnowOptionsBottomSheetFragment peopleYouMayKnowOptionsBottomSheetFragment) {
        2ZG r0 = (2ZG) 1Lm.A05(context, 1BM.A01(peopleYouMayKnowOptionsBottomSheetFragment), 33213);
        r0.A05 = true;
        Iterator it = r0.A0A.iterator();
        while (it.hasNext()) {
            ((2VN) it.next()).C2T();
        }
    }
}
