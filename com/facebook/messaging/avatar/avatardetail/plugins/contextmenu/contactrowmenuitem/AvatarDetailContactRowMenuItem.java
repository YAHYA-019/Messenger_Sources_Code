package com.facebook.messaging.avatar.avatardetail.plugins.contextmenu.contactrowmenuitem;

import X.11T;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: AvatarDetailContactRowMenuItem.class */
public final class AvatarDetailContactRowMenuItem {
    public final Context A00;
    public final ThreadSummary A01;
    public final User A02;

    public AvatarDetailContactRowMenuItem(Context context, ThreadSummary threadSummary, User user) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A01 = threadSummary;
        this.A02 = user;
    }
}
