package com.facebook.maps;

import X.C4S3;
import android.content.Context;
import android.content.Intent;
import com.facebook.acra.constants.ActionId;

/* loaded from: GenericMapsUriMapHelper.class */
public final class GenericMapsUriMapHelper extends C4S3 {
    @Override // X.C4S3
    public Intent A00(Context context, Intent intent) {
        intent.putExtra("target_fragment", ActionId.APP_DID_ENTER_BACKGROUND);
        return intent;
    }
}
