package com.facebook.messaging.sharing;

import X.0EV;
import X.0LS;
import X.1BY;
import X.1Bn;
import X.1JF;
import X.AnonymousClass001;
import X.C0w6;
import X.C1lM;
import X.C4s;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;

/* loaded from: ShareLauncherActivity.class */
public class ShareLauncherActivity extends FbFragmentActivity implements C1lM {
    public static void A12(Intent intent, String str) {
        String stringExtra = intent.getStringExtra(str);
        if (1JF.A0B(stringExtra)) {
            return;
        }
        try {
            intent.putExtra(str, URLDecoder.decode(stringExtra, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("URL decode a string fails. It should never happen", e);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        Intent intent = getIntent();
        if ("SAME_APP".equals(intent.getStringExtra("access_scope"))) {
            intent.putExtra("ShareType", "ShareType.facebookShare");
            intent.putExtra("share_fbid", intent.getStringExtra("fbid"));
            A12(intent, "share_title");
            A12(intent, "share_caption");
            A12(intent, "share_media_url");
        }
        Intent A00 = ((C4s) 1Bn.A0E(this, (1BY) null, 82721)).A00(this, intent);
        if (getIntent().getBooleanExtra("disable_transition", false)) {
            overridePendingTransition(0, 0);
        }
        if (getIntent().getBooleanExtra("extra_should_bcf_return_result", false)) {
            A00.addFlags(33554432);
            A00.putExtra("extra_should_bcf_return_result", true);
        }
        0EV r0 = new 0EV();
        r0.A01();
        if (r0.A00().A02(this, intent, (C0w6) null)) {
            A00.putExtra("extra_private_group_id", getIntent().getStringExtra("extra_private_group_id"));
        }
        0LS.A0A(this, A00);
        finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
    }

    @Override // X.C1lM
    public Map AWe() {
        return AnonymousClass001.A0u();
    }

    public String AWg() {
        return "share_launcher";
    }

    public Long Am7() {
        return null;
    }
}
