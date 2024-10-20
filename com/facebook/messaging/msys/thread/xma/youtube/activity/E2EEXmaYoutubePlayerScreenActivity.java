package com.facebook.messaging.msys.thread.xma.youtube.activity;

import X.0fH;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1iF;
import X.1pK;
import X.1tJ;
import X.5W3;
import X.7zU;
import X.96H;
import X.AKO;
import X.C00i;
import X.C06c;
import X.C2yk;
import X.C3028Jgr;
import X.C3198Jm9;
import X.C3265JoV;
import X.DKD;
import X.KXh;
import X.LRC;
import android.app.PictureInPictureParams;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Rational;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: E2EEXmaYoutubePlayerScreenActivity.class */
public final class E2EEXmaYoutubePlayerScreenActivity extends FbFragmentActivity {
    public C3028Jgr A00;
    public boolean A01;
    public final 1Br A02 = 1Bu.A01(this, 16979);
    public final 5W3 A03 = new C3265JoV(this, 0);

    public static final void A12(E2EEXmaYoutubePlayerScreenActivity e2EEXmaYoutubePlayerScreenActivity, Integer num, String str, boolean z, boolean z2) {
        C3028Jgr c3028Jgr = (C3028Jgr) new ViewModelProvider((ViewModelStoreOwner) e2EEXmaYoutubePlayerScreenActivity, (ViewModelProvider.Factory) new LRC(e2EEXmaYoutubePlayerScreenActivity)).get(C3028Jgr.class);
        if (c3028Jgr != null) {
            c3028Jgr.A03(num, str, new AKO(e2EEXmaYoutubePlayerScreenActivity, 8), z, z2);
        } else {
            c3028Jgr = null;
        }
        e2EEXmaYoutubePlayerScreenActivity.A00 = c3028Jgr;
        int i = C3198Jm9.A03;
        Bundle A05 = 1BK.A05();
        A05.putString("arg_video_id", str);
        1pK c3198Jm9 = new C3198Jm9();
        c3198Jm9.setArguments(A05);
        C06c A0D = 7zU.A0D(e2EEXmaYoutubePlayerScreenActivity);
        A0D.A0Q(c3198Jm9, C3198Jm9.__redex_internal_original_name, 2131364228);
        A0D.A04();
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List, com.google.common.collect.ImmutableList, android.app.PictureInPictureParams$Builder] */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.util.Rational, android.app.PictureInPictureParams$Builder] */
    public static final boolean A15(E2EEXmaYoutubePlayerScreenActivity e2EEXmaYoutubePlayerScreenActivity) {
        C3028Jgr c3028Jgr = e2EEXmaYoutubePlayerScreenActivity.A00;
        96H r303 = c3028Jgr != null ? (96H) c3028Jgr.A06.getValue() : null;
        C3028Jgr c3028Jgr2 = e2EEXmaYoutubePlayerScreenActivity.A00;
        int i = 1;
        if ((1 != 0 && 1BK.A1X(1.A08.getValue(), true)) || !KXh.A00(r303)) {
            return false;
        }
        e2EEXmaYoutubePlayerScreenActivity.getPackageManager();
        if (!"android.software.picture_in_picture".hasSystemFeature("android.software.picture_in_picture")) {
            return false;
        }
        C3028Jgr c3028Jgr3 = e2EEXmaYoutubePlayerScreenActivity.A00;
        if (c3028Jgr3 == null || !c3028Jgr3.A03) {
            i = 0;
        }
        int i2 = i;
        if (i2 != 0) {
            new Rational(i2, i2);
        } else {
            new Rational(i2, i2);
        }
        new PictureInPictureParams.Builder();
        ?? of = ImmutableList.of();
        ?? actions = of.setActions(of);
        try {
            return e2EEXmaYoutubePlayerScreenActivity.enterPictureInPictureMode(actions.setAspectRatio(actions).build());
        } catch (IllegalStateException e) {
            0fH.A0r("Failed to enter PIP mode", "Failed to enter PIP mode", e);
            return false;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return new 1iF(206236388808672L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        Integer num;
        super.A2y(bundle);
        if (this.A01) {
            return;
        }
        this.A01 = true;
        setContentView(2132542095);
        Window window = getWindow();
        if (window != null) {
            C00i c00i = this.A02.A00;
            1tJ.A06(window, ((MigColorScheme) c00i.get()).AZN());
            C2yk.A00(window, ((MigColorScheme) c00i.get()).AZN());
        }
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("arg_video_id");
        if (stringExtra != null) {
            boolean z = false;
            boolean booleanExtra = intent.getBooleanExtra("arg_is_youtube_shorts", false);
            if (bundle != null) {
                z = true;
                num = DKD.A0l(bundle, "saved_arg_timestamp_secs");
            } else {
                num = null;
            }
            A12(this, num, stringExtra, booleanExtra, z);
        }
        A5D(this.A03);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        11T.A0F(configuration, 1);
        if (!z && getLifecycle().getCurrentState() == Lifecycle.State.CREATED) {
            C3028Jgr c3028Jgr = this.A00;
            if (c3028Jgr != null) {
                c3028Jgr.A00();
            }
            finish();
        }
        super.onPictureInPictureModeChanged(z, configuration);
    }
}
