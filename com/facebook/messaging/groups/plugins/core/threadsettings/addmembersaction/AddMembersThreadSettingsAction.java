package com.facebook.messaging.groups.plugins.core.threadsettings.addmembersaction;

import X.1BL;
import X.2MQ;
import X.C8R;
import X.COp;
import X.DJX;
import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: AddMembersThreadSettingsAction.class */
public final class AddMembersThreadSettingsAction {
    public final Context A00;
    public final ThreadKey A01;
    public final DJX A02;
    public final FbUserSession A03;
    public final ThreadSummary A04;
    public final Capabilities A05;

    public AddMembersThreadSettingsAction(Context context, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, Capabilities capabilities) {
        1BL.A1H(context, fbUserSession, threadKey);
        1BL.A1G(capabilities, djx);
        this.A00 = context;
        this.A03 = fbUserSession;
        this.A01 = threadKey;
        this.A04 = threadSummary;
        this.A05 = capabilities;
        this.A02 = djx;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.COp, java.lang.Object] */
    public final C8R A00() {
        ?? obj = new Object();
        COp.A02((COp) obj, this, ActionId.CONTROLLER_INITIATED);
        COp.A01(2MQ.A1V, (COp) obj);
        ((COp) obj).A01 = 2131967125;
        return COp.A00((COp) obj, 2131967124);
    }
}
