package com.facebook.messaging.reactions.plugins.reactionsactionsdrawer.contextmenu;

import X.7zP;
import X.9KE;
import android.content.Context;
import com.facebook.litho.LithoView;
import com.facebook.messaging.dialog.MenuDialogParams;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ReactionsContextMenuPresenter.class */
public final class ReactionsContextMenuPresenter {
    public LithoView A00;
    public final int A01;
    public final Context A02;
    public final MenuDialogParams A03;
    public final ThreadSummary A04;
    public final 9KE A05;
    public final boolean A06;

    public ReactionsContextMenuPresenter(Context context, MenuDialogParams menuDialogParams, ThreadSummary threadSummary, 9KE r305, int i, boolean z) {
        7zP.A1L(context, 1, r305);
        this.A02 = context;
        this.A03 = menuDialogParams;
        this.A06 = z;
        this.A04 = threadSummary;
        this.A01 = i;
        this.A05 = r305;
    }
}
