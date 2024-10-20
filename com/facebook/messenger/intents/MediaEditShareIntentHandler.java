package com.facebook.messenger.intents;

import X.0LS;
import X.1BY;
import X.1Bn;
import X.C00i;
import X.GOo;
import X.Hsr;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: MediaEditShareIntentHandler.class */
public class MediaEditShareIntentHandler extends FbFragmentActivity {
    public Hsr A00;
    public final C00i A01 = GOo.A0J();

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        super.A2x(intent);
        finish();
        Intent intent2 = new Intent(intent);
        intent2.setComponent(new ComponentName(this, (Class<?>) MediaEditShareIntentHandler.class));
        intent2.setSelector(null);
        0LS.A0A(this, intent2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cd, code lost:
    
        if (r0.startsWith(r310) != false) goto L43;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messenger.intents.MediaEditShareIntentHandler.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        this.A00 = (Hsr) 1Bn.A0E(this, (1BY) null, 115949);
    }
}
