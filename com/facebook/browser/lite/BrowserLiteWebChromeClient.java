package com.facebook.browser.lite;

import X.09X;
import X.0Em;
import X.0SI;
import X.10D;
import X.4YT;
import X.4YU;
import X.AbE;
import X.AbstractC00603o4;
import X.AbstractC3252Jnp;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass106;
import X.C0w6;
import X.C3244Jng;
import X.DKB;
import X.DKD;
import X.DRY;
import X.JgX;
import X.L0T;
import X.LCd;
import X.ML7;
import X.MNp;
import X.MNq;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.acra.constants.ActionId;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* loaded from: BrowserLiteWebChromeClient.class */
public class BrowserLiteWebChromeClient implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
    public int A00;
    public AlertDialog A01;
    public ContentResolver A02;
    public Intent A03;
    public Uri A04;
    public ValueCallback A05;
    public ValueCallback A06;
    public WebChromeClient.CustomViewCallback A07;
    public FrameLayout A08;
    public VideoView A09;
    public JgX A0A;
    public BrowserLiteProgressBar A0B;
    public MNp A0C;
    public ML7 A0D;
    public AbstractC3252Jnp A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public ValueCallback A0K;
    public WebChromeClient.FileChooserParams A0L;

    /* JADX WARN: Type inference failed for: r0v43, types: [X.0w6, java.lang.Object] */
    private void A00(ValueCallback valueCallback) {
        if (valueCallback != null) {
            ValueCallback valueCallback2 = this.A05;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
                this.A05 = null;
            }
            this.A05 = valueCallback;
            Intent A0A = 4YU.A0A(AnonymousClass000.A00(45));
            try {
                0SI r0 = new 0SI();
                FragmentActivity requireActivity = this.A0A.requireActivity();
                File A01 = r0.A01(requireActivity, null, "webview_tmp_file", ".jpg");
                HashMap hashMap = 10D.A06;
                Uri A05 = 10D.A01(requireActivity, (ProviderInfo) null, (C0w6) new Object()).A05(A01);
                AnonymousClass106.A01(A0A, new Uri[]{A05}, true);
                this.A04 = A05;
                A0A.putExtra("output", A05);
            } catch (IOException unused) {
                LCd.A03("BrowserLiteWebChromeClient", "failed to create secure URI for camera to write to", new Object[0]);
                this.A05 = null;
                this.A04 = null;
            }
            try {
                09X.A00().A04().A09(this.A0A.requireActivity(), A0A, 4);
            } catch (ActivityNotFoundException unused2) {
                LCd.A03("BrowserLiteWebChromeClient", "failed to resolve activity", new Object[0]);
                this.A05 = null;
                this.A04 = null;
            }
        }
    }

    public static void A01(BrowserLiteWebChromeClient browserLiteWebChromeClient, int i) {
        ML7 ml7 = browserLiteWebChromeClient.A0D;
        if (ml7 != null) {
            ml7.setProgress(i);
            MNp mNp = browserLiteWebChromeClient.A0C;
            if (mNp != null) {
                mNp.setProgress(i);
            }
        } else {
            browserLiteWebChromeClient.A0B.setProgress(i);
        }
        for (MNq mNq : browserLiteWebChromeClient.A0F) {
            if (mNq instanceof C3244Jng) {
                C3244Jng c3244Jng = (C3244Jng) mNq;
                if (i == 100) {
                    L0T l0t = c3244Jng.A00;
                    if (l0t != null) {
                        l0t.A00 = AnonymousClass002.A0G();
                    }
                    C3244Jng.A00(c3244Jng);
                }
            }
        }
    }

    public static boolean A02(Activity activity) {
        return AnonymousClass001.A1O(0Em.A00(activity, AbE.A00(0)));
    }

    public static boolean A03(Activity activity) {
        return AnonymousClass001.A1O(0Em.A00(activity, AbstractC00603o4.A00(0))) && AnonymousClass001.A1O(0Em.A00(activity, AbstractC00603o4.A00(2)));
    }

    private boolean A04(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (valueCallback == null || fileChooserParams == null) {
            return false;
        }
        ValueCallback valueCallback2 = this.A05;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
            this.A05 = null;
        }
        this.A05 = valueCallback;
        try {
            this.A0A.startActivityForResult(fileChooserParams.createIntent(), 2);
            return true;
        } catch (ActivityNotFoundException unused) {
            LCd.A03("BrowserLiteWebChromeClient", "failed to resolve activity", new Object[0]);
            this.A05 = null;
            return false;
        }
    }

    public void A05() {
        try {
            FrameLayout frameLayout = this.A08;
            if (frameLayout.getVisibility() != 8) {
                VideoView videoView = this.A09;
                if (videoView != null) {
                    videoView.stopPlayback();
                    this.A09 = null;
                }
                WebChromeClient.CustomViewCallback customViewCallback = this.A07;
                if (customViewCallback != null) {
                    try {
                        customViewCallback.onCustomViewHidden();
                    } catch (Exception unused) {
                    }
                    this.A07 = null;
                }
                frameLayout.setVisibility(8);
                DKD.A0B(this.A0A.requireActivity()).setSystemUiVisibility(8192);
                try {
                    frameLayout.removeAllViews();
                } catch (Exception unused2) {
                    try {
                        frameLayout.removeAllViews();
                    } catch (Exception unused3) {
                    }
                }
            }
            MNp mNp = this.A0C;
            if (mNp != null) {
                mNp.D0U();
            }
        } catch (Throwable unused4) {
        }
    }

    public void A06(int i, int[] iArr) {
        JgX jgX = this.A0A;
        FragmentActivity activity = jgX.getActivity();
        if (i == 3) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    if (Build.VERSION.SDK_INT < 34 || activity == null || !A02(activity)) {
                        return;
                    }
                    Toast.makeText(jgX.A06, 2131951700, 0).show();
                    return;
                }
            }
            A04(this.A0K, this.A0L);
        } else if (i != 4 || !this.A0H || iArr.length <= 0 || iArr[0] != 0) {
            return;
        } else {
            A00(this.A0K);
        }
        this.A0K = null;
        this.A0L = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(X.AbstractC3252Jnp r302, int r303) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteWebChromeClient.A07(X.Jnp, int):void");
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        try {
            A05();
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        try {
            A05();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean onShowFileChooser(AbstractC3252Jnp abstractC3252Jnp, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] strArr;
        int i;
        if (!this.A0J) {
            return A04(valueCallback, fileChooserParams);
        }
        FragmentActivity activity = this.A0A.getActivity();
        if (activity == null) {
            return false;
        }
        boolean isCaptureEnabled = fileChooserParams.isCaptureEnabled();
        boolean z = this.A0I;
        if (z && isCaptureEnabled && 0Em.A00(activity, "android.permission.CAMERA") == 0) {
            A00(valueCallback);
            return true;
        }
        if (this.A0H && z && isCaptureEnabled && 0Em.A00(activity, "android.permission.CAMERA") != 0) {
            strArr = new String[]{"android.permission.CAMERA"};
            i = 4;
        } else {
            if (Build.VERSION.SDK_INT < 33 || this.A0A.A06.getApplicationInfo().targetSdkVersion < 33 ? 0Em.A00(activity, AnonymousClass000.A00(4)) == 0 : A03(activity)) {
                A04(valueCallback, fileChooserParams);
                return true;
            }
            strArr = (Build.VERSION.SDK_INT < 33 || this.A0A.A06.getApplicationInfo().targetSdkVersion < 33) ? new String[]{AnonymousClass000.A00(4)} : new String[]{AbstractC00603o4.A00(0), AbstractC00603o4.A00(2)};
            i = 3;
        }
        DRY.A04(activity, strArr, i);
        this.A0K = valueCallback;
        this.A0L = fileChooserParams;
        return true;
    }

    public void openFileChooser(ValueCallback valueCallback, String str) {
        openFileChooser(valueCallback, str, "");
    }

    public void openFileChooser(ValueCallback valueCallback, String str, String str2) {
        this.A06 = valueCallback;
        Intent A0A = 4YU.A0A(DKB.A00(41));
        A0A.addCategory(4YT.A00(ActionId.ABORTED));
        A0A.setType(str);
        try {
            this.A0A.startActivityForResult(A0A, 1);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
