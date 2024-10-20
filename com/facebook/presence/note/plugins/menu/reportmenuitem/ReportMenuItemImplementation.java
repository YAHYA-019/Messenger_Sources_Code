package com.facebook.presence.note.plugins.menu.reportmenuitem;

import X.06Z;
import X.1BL;
import android.content.Context;
import com.facebook.user.model.User;

/* loaded from: ReportMenuItemImplementation.class */
public final class ReportMenuItemImplementation {
    public final Context A00;
    public final 06Z A01;
    public final User A02;

    public ReportMenuItemImplementation(Context context, 06Z r303, User user) {
        1BL.A1H(context, user, r303);
        this.A00 = context;
        this.A02 = user;
        this.A01 = r303;
    }
}
