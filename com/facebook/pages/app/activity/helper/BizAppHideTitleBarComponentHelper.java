package com.facebook.pages.app.activity.helper;

import X.11T;
import X.C4S3;
import android.content.Context;
import android.content.Intent;

/* loaded from: BizAppHideTitleBarComponentHelper.class */
public final class BizAppHideTitleBarComponentHelper extends C4S3 {
    @Override // X.C4S3
    public Intent A00(Context context, Intent intent) {
        11T.A0F(intent, 1);
        Intent putExtra = intent.putExtra("should_hide_title_bar", true);
        11T.A0A(putExtra);
        return putExtra;
    }
}
