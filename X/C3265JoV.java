package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.messaging.msys.thread.xma.youtube.activity.E2EEXmaYoutubePlayerScreenActivity;
import com.facebook.messaging.xma.template.activity.youtube.GenericXmaYoutubePlayerScreenActivity;
import com.facebook.secure.securewebview.SecureWebView;

/* renamed from: X.JoV, reason: case insensitive filesystem */
/* loaded from: JoV.class */
public final class C3265JoV extends 5W3 {
    public final int A00;
    public final Object A01;

    public C3265JoV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean Bke(Activity activity) {
        boolean A15;
        switch (this.A00) {
            case 0:
                A15 = E2EEXmaYoutubePlayerScreenActivity.A15((E2EEXmaYoutubePlayerScreenActivity) this.A01);
                break;
            case 1:
                A15 = GenericXmaYoutubePlayerScreenActivity.A1D((GenericXmaYoutubePlayerScreenActivity) this.A01);
                break;
            default:
                return super.Bke(activity);
        }
        return JQy.A1X(A15 ? 1 : 0);
    }

    public void BtE(Activity activity) {
        if (2 - this.A00 != 0) {
            super/*X.5W4*/.BtE(activity);
            return;
        }
        LEG leg = (LEG) this.A01;
        LEG.A08(leg);
        LEG.A07(leg);
    }

    public void C8u(Activity activity, Intent intent) {
        switch (this.A00) {
            case 0:
                E2EEXmaYoutubePlayerScreenActivity e2EEXmaYoutubePlayerScreenActivity = (E2EEXmaYoutubePlayerScreenActivity) this.A01;
                String stringExtra = intent.getStringExtra("arg_video_id");
                if (stringExtra != null) {
                    E2EEXmaYoutubePlayerScreenActivity.A12(e2EEXmaYoutubePlayerScreenActivity, null, stringExtra, intent.getBooleanExtra("arg_is_youtube_shorts", false), false);
                    return;
                }
                return;
            case 1:
                GenericXmaYoutubePlayerScreenActivity.A12(intent, null, (GenericXmaYoutubePlayerScreenActivity) this.A01);
                return;
            default:
                super.C8u(activity, intent);
                return;
        }
    }

    public void CAw(Activity activity) {
        C3028Jgr c3028Jgr;
        F7a f7a;
        SecureWebView secureWebView;
        switch (this.A00) {
            case 0:
                11T.A0F(activity, 0);
                E2EEXmaYoutubePlayerScreenActivity e2EEXmaYoutubePlayerScreenActivity = (E2EEXmaYoutubePlayerScreenActivity) this.A01;
                if (!e2EEXmaYoutubePlayerScreenActivity.isInPictureInPictureMode()) {
                    c3028Jgr = e2EEXmaYoutubePlayerScreenActivity.A00;
                    break;
                } else {
                    return;
                }
            case 1:
                11T.A0F(activity, 0);
                GenericXmaYoutubePlayerScreenActivity genericXmaYoutubePlayerScreenActivity = (GenericXmaYoutubePlayerScreenActivity) this.A01;
                if (!genericXmaYoutubePlayerScreenActivity.isInPictureInPictureMode()) {
                    c3028Jgr = genericXmaYoutubePlayerScreenActivity.A01;
                    break;
                } else {
                    return;
                }
            default:
                super/*X.5W4*/.CAw(activity);
                return;
        }
        if (c3028Jgr == null || (f7a = c3028Jgr.A00) == null || (secureWebView = f7a.A00) == null) {
            return;
        }
        secureWebView.onPause();
    }

    public void CHo(Activity activity) {
        C3028Jgr c3028Jgr;
        F7a f7a;
        SecureWebView secureWebView;
        switch (this.A00) {
            case 0:
                11T.A0F(activity, 0);
                c3028Jgr = ((E2EEXmaYoutubePlayerScreenActivity) this.A01).A00;
                break;
            case 1:
                11T.A0F(activity, 0);
                c3028Jgr = ((GenericXmaYoutubePlayerScreenActivity) this.A01).A01;
                break;
            default:
                super/*X.5W4*/.CHo(activity);
                return;
        }
        if (c3028Jgr == null || (f7a = c3028Jgr.A00) == null || (secureWebView = f7a.A00) == null) {
            return;
        }
        secureWebView.onResume();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void CMe(Activity activity) {
        C3028Jgr c3028Jgr;
        F7a f7a;
        SecureWebView secureWebView;
        switch (this.A00) {
            case 0:
                11T.A0F(activity, 0);
                E2EEXmaYoutubePlayerScreenActivity e2EEXmaYoutubePlayerScreenActivity = (E2EEXmaYoutubePlayerScreenActivity) this.A01;
                c3028Jgr = e2EEXmaYoutubePlayerScreenActivity.A00;
                if (c3028Jgr != null) {
                    if (7zR.A1X(c3028Jgr.A05.getValue())) {
                        String str = c3028Jgr.A01;
                        if (str != null) {
                            E2EEXmaYoutubePlayerScreenActivity.A12(e2EEXmaYoutubePlayerScreenActivity, (Integer) c3028Jgr.A07.getValue(), str, c3028Jgr.A03, c3028Jgr.A04);
                            return;
                        }
                        11T.A0L("_videoId");
                        throw 0Q8.createAndThrow();
                    }
                    f7a = c3028Jgr.A00;
                    if (f7a != null || (secureWebView = f7a.A00) == null) {
                        return;
                    }
                    secureWebView.onResume();
                    return;
                }
                return;
            case 1:
                11T.A0F(activity, 0);
                GenericXmaYoutubePlayerScreenActivity genericXmaYoutubePlayerScreenActivity = (GenericXmaYoutubePlayerScreenActivity) this.A01;
                c3028Jgr = genericXmaYoutubePlayerScreenActivity.A01;
                if (c3028Jgr != null) {
                    if (7zR.A1X(c3028Jgr.A05.getValue())) {
                        String str2 = c3028Jgr.A01;
                        if (str2 != null) {
                            GenericXmaYoutubePlayerScreenActivity.A15(genericXmaYoutubePlayerScreenActivity, (Integer) c3028Jgr.A07.getValue(), str2, c3028Jgr.A03, c3028Jgr.A04);
                            return;
                        }
                        11T.A0L("_videoId");
                        throw 0Q8.createAndThrow();
                    }
                    f7a = c3028Jgr.A00;
                    if (f7a != null) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                LEG leg = (LEG) this.A01;
                leg.A0E();
                LEG.A06(leg);
                return;
        }
    }

    public void CNe(Activity activity) {
        C3028Jgr c3028Jgr;
        Object value;
        F7a f7a;
        SecureWebView secureWebView;
        Object value2;
        F7a f7a2;
        SecureWebView secureWebView2;
        switch (this.A00) {
            case 0:
                11T.A0F(activity, 0);
                E2EEXmaYoutubePlayerScreenActivity e2EEXmaYoutubePlayerScreenActivity = (E2EEXmaYoutubePlayerScreenActivity) this.A01;
                C3028Jgr c3028Jgr2 = e2EEXmaYoutubePlayerScreenActivity.A00;
                if (c3028Jgr2 != null && (f7a = c3028Jgr2.A00) != null && (secureWebView = f7a.A00) != null) {
                    secureWebView.onPause();
                }
                C3028Jgr c3028Jgr3 = e2EEXmaYoutubePlayerScreenActivity.A00;
                if (c3028Jgr3 == null || (value = c3028Jgr3.A06.getValue()) == null || value == 96H.A07) {
                    c3028Jgr = e2EEXmaYoutubePlayerScreenActivity.A00;
                    break;
                } else {
                    return;
                }
                break;
            case 1:
                11T.A0F(activity, 0);
                GenericXmaYoutubePlayerScreenActivity genericXmaYoutubePlayerScreenActivity = (GenericXmaYoutubePlayerScreenActivity) this.A01;
                C3028Jgr c3028Jgr4 = genericXmaYoutubePlayerScreenActivity.A01;
                if (c3028Jgr4 != null && (f7a2 = c3028Jgr4.A00) != null && (secureWebView2 = f7a2.A00) != null) {
                    secureWebView2.onPause();
                }
                C3028Jgr c3028Jgr5 = genericXmaYoutubePlayerScreenActivity.A01;
                if (c3028Jgr5 == null || (value2 = c3028Jgr5.A06.getValue()) == null || value2 == 96H.A07) {
                    c3028Jgr = genericXmaYoutubePlayerScreenActivity.A01;
                    break;
                } else {
                    return;
                }
                break;
            default:
                LEG leg = (LEG) this.A01;
                leg.A0C();
                LEG.A0A(leg, "activity_stop");
                LEG.A05(leg);
                return;
        }
        if (c3028Jgr != null) {
            c3028Jgr.A00();
        }
    }

    public void CTL(Activity activity) {
        switch (this.A00) {
            case 0:
                E2EEXmaYoutubePlayerScreenActivity.A15((E2EEXmaYoutubePlayerScreenActivity) this.A01);
                return;
            case 1:
                GenericXmaYoutubePlayerScreenActivity.A1D((GenericXmaYoutubePlayerScreenActivity) this.A01);
                return;
            default:
                super.CTL(activity);
                return;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C3028Jgr c3028Jgr;
        Number number;
        switch (this.A00) {
            case 0:
                c3028Jgr = ((E2EEXmaYoutubePlayerScreenActivity) this.A01).A00;
                break;
            case 1:
                c3028Jgr = ((GenericXmaYoutubePlayerScreenActivity) this.A01).A01;
                break;
            default:
                super.onSaveInstanceState(bundle);
                return;
        }
        if (c3028Jgr == null || (number = (Number) c3028Jgr.A07.getValue()) == null) {
            return;
        }
        bundle.putInt("saved_arg_timestamp_secs", number.intValue());
    }
}
