package com.facebook.messaging.wellbeing.selfremediation.plugins.groupprotections.nuxsecondarydataloadinterface;

import X.11T;
import X.1Bq;
import X.1HG;
import X.6Ja;
import X.6iB;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: GroupProtectionsNuxSecondaryDataLoad.class */
public final class GroupProtectionsNuxSecondaryDataLoad {
    public final ThreadKey A00;
    public final 6iB A01;
    public final 6Ja A02;
    public final FbSharedPreferences A03;
    public final Context A04;

    public GroupProtectionsNuxSecondaryDataLoad(Context context, ThreadKey threadKey, 6iB r304) {
        11T.A0F(context, 1);
        11T.A0F(r304, 2);
        11T.A0F(threadKey, 3);
        this.A04 = context;
        this.A01 = r304;
        this.A00 = threadKey;
        this.A03 = (FbSharedPreferences) 1Bq.A00(33013).get();
        this.A02 = (6Ja) 1HG.A00(context, 67084).get();
    }
}
