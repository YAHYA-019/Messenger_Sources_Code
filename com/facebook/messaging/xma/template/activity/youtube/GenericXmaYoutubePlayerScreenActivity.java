package com.facebook.messaging.xma.template.activity.youtube;

import X.0Gm;
import X.0fH;
import X.11T;
import X.1BK;
import X.1Bi;
import X.1Br;
import X.1Bu;
import X.1iF;
import X.1tJ;
import X.5W3;
import X.7zK;
import X.7zU;
import X.96H;
import X.AQm;
import X.C00i;
import X.C06c;
import X.C0A2;
import X.C2yk;
import X.C3028Jgr;
import X.C3265JoV;
import X.DKD;
import X.JmA;
import X.KXh;
import X.LRC;
import X.LlF;
import X.MCP;
import android.app.PictureInPictureParams;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Rational;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.model.messages.Message;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* loaded from: GenericXmaYoutubePlayerScreenActivity.class */
public final class GenericXmaYoutubePlayerScreenActivity extends FbFragmentActivity implements MCP {
    public Message A00;
    public C3028Jgr A01;
    public boolean A02;
    public final 1Br A03 = 1Bu.A01(this, 16979);
    public final 5W3 A04 = new C3265JoV(this, 1);

    public static final void A12(Intent intent, Bundle bundle, GenericXmaYoutubePlayerScreenActivity genericXmaYoutubePlayerScreenActivity) {
        Integer num;
        String stringExtra = intent.getStringExtra("arg_video_id");
        if (stringExtra != null) {
            boolean z = false;
            boolean booleanExtra = intent.getBooleanExtra("arg_is_youtube_shorts", false);
            Parcelable parcelableExtra = intent.getParcelableExtra(7zK.A00(83));
            Parcelable.Creator creator = Message.CREATOR;
            11T.A0B(creator);
            genericXmaYoutubePlayerScreenActivity.A00 = (Message) 0Gm.A01(creator, parcelableExtra, Message.class);
            if (bundle != null) {
                z = true;
                num = DKD.A0l(bundle, "saved_arg_timestamp_secs");
            } else {
                num = null;
            }
            A15(genericXmaYoutubePlayerScreenActivity, num, stringExtra, booleanExtra, z);
        }
    }

    public static final void A15(GenericXmaYoutubePlayerScreenActivity genericXmaYoutubePlayerScreenActivity, Integer num, String str, boolean z, boolean z2) {
        C3028Jgr c3028Jgr = (C3028Jgr) new ViewModelProvider((ViewModelStoreOwner) genericXmaYoutubePlayerScreenActivity, (ViewModelProvider.Factory) new LRC(genericXmaYoutubePlayerScreenActivity)).get(C3028Jgr.class);
        if (c3028Jgr != null) {
            c3028Jgr.A03(num, str, new AQm(genericXmaYoutubePlayerScreenActivity, 5), z, z2);
        } else {
            c3028Jgr = null;
        }
        genericXmaYoutubePlayerScreenActivity.A01 = c3028Jgr;
        int i = JmA.A05;
        Bundle A05 = 1BK.A05();
        A05.putString("arg_video_id", str);
        Fragment jmA = new JmA();
        jmA.setArguments(A05);
        C06c A0D = 7zU.A0D(genericXmaYoutubePlayerScreenActivity);
        A0D.A0Q(jmA, "GenericXmaYoutubePlayerScreenFragment", 2131364228);
        A0D.A04();
    }

    public static final void A16(Function1 function1) {
        11T.A0A(((ScheduledExecutorService) 1Bi.A03(16462)).schedule((Runnable) new LlF(new AQm(function1, 6)), 0L, TimeUnit.MILLISECONDS));
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List, com.google.common.collect.ImmutableList, android.app.PictureInPictureParams$Builder] */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.util.Rational, android.app.PictureInPictureParams$Builder] */
    public static final boolean A1D(GenericXmaYoutubePlayerScreenActivity genericXmaYoutubePlayerScreenActivity) {
        C3028Jgr c3028Jgr = genericXmaYoutubePlayerScreenActivity.A01;
        96H r303 = c3028Jgr != null ? (96H) c3028Jgr.A06.getValue() : null;
        C3028Jgr c3028Jgr2 = genericXmaYoutubePlayerScreenActivity.A01;
        int i = 1;
        if ((1 != 0 && 1BK.A1X(1.A08.getValue(), true)) || !KXh.A00(r303)) {
            return false;
        }
        genericXmaYoutubePlayerScreenActivity.getPackageManager();
        if (!"android.software.picture_in_picture".hasSystemFeature("android.software.picture_in_picture")) {
            return false;
        }
        C3028Jgr c3028Jgr3 = genericXmaYoutubePlayerScreenActivity.A01;
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
            return genericXmaYoutubePlayerScreenActivity.enterPictureInPictureMode(actions.setAspectRatio(actions).build());
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
        String queryParameter;
        super.A2y(bundle);
        Boolean bool = null;
        String stringExtra = getIntent().getStringExtra("key_uri");
        if (stringExtra != null) {
            Uri uri = null;
            try {
                uri = C0A2.A03(stringExtra);
            } catch (SecurityException unused) {
            }
            getIntent().putExtra("arg_video_id", uri != null ? uri.getQueryParameter(TraceFieldType.VideoId) : null);
            Intent intent = getIntent();
            if (uri != null && (queryParameter = uri.getQueryParameter("is_shorts")) != null) {
                bool = Boolean.valueOf(Boolean.parseBoolean(queryParameter));
            }
            intent.putExtra("arg_is_youtube_shorts", bool);
        }
        if (this.A02) {
            return;
        }
        this.A02 = true;
        setContentView(2132542095);
        Window window = getWindow();
        if (window != null) {
            C00i c00i = this.A03.A00;
            1tJ.A06(window, ((MigColorScheme) c00i.get()).AZN());
            C2yk.A00(window, ((MigColorScheme) c00i.get()).AZN());
        }
        A12(getIntent(), bundle, this);
        A5D(this.A04);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        11T.A0F(configuration, 1);
        if (!z && getLifecycle().getCurrentState() == Lifecycle.State.CREATED) {
            C3028Jgr c3028Jgr = this.A01;
            if (c3028Jgr != null) {
                c3028Jgr.A00();
            }
            finish();
        }
        super.onPictureInPictureModeChanged(z, configuration);
    }
}
