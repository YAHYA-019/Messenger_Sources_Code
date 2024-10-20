package com.facebook.messaging.nativepagereply.plugins.toolstab.toolstabitem.responsiveguideitem;

import X.11T;
import X.7zT;
import X.C8m;
import X.DFS;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ResponsiveGuideToolsTabItem.class */
public final class ResponsiveGuideToolsTabItem {
    public final Context A00;
    public final FbUserSession A01;
    public final C8m A02;
    public final DFS A03;
    public final MigColorScheme A04;

    public ResponsiveGuideToolsTabItem(Context context, FbUserSession fbUserSession, C8m c8m, DFS dfs, MigColorScheme migColorScheme) {
        7zT.A1W(fbUserSession, context, dfs, migColorScheme);
        11T.A0F(c8m, 5);
        this.A01 = fbUserSession;
        this.A00 = context;
        this.A03 = dfs;
        this.A04 = migColorScheme;
        this.A02 = c8m;
    }
}
