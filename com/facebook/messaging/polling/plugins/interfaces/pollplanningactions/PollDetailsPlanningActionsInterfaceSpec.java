package com.facebook.messaging.polling.plugins.interfaces.pollplanningactions;

import X.0Q8;
import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: PollDetailsPlanningActionsInterfaceSpec.class */
public abstract class PollDetailsPlanningActionsInterfaceSpec {
    public Context context;
    public FbUserSession fbUserSession;
    public String pollId;
    public ThreadKey threadKey;
    public View view;

    public PollDetailsPlanningActionsInterfaceSpec() {
        throw 0Q8.createAndThrow();
    }

    public abstract MenuDialogItem createDialogItem();

    public abstract String getPollId();

    public abstract boolean onClick();

    public abstract void setPollId(String str);
}
