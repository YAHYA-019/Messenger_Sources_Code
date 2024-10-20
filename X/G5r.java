package X;

import android.content.Context;
import com.facebook.secure.securewebview.SecureWebView;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONObject;

/* loaded from: G5r.class */
public final class G5r implements Runnable {
    public static final String __redex_internal_original_name = "GenericXmaYoutubePlayerWebviewController$loadYoutubeWebview$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ F7a A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public G5r(Context context, F7a f7a, String str, int i, boolean z) {
        this.A02 = f7a;
        this.A01 = context;
        this.A03 = str;
        this.A04 = z;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F7a f7a = this.A02;
        Context context = this.A01;
        String str = this.A03;
        boolean z = this.A04;
        int i = this.A00;
        F7a.A00(f7a);
        SecureWebView secureWebView = f7a.A00;
        if (secureWebView != null) {
            secureWebView.onResume();
        }
        SecureWebView secureWebView2 = f7a.A00;
        if (secureWebView2 != null) {
            String str2 = null;
            try {
                InputStream openRawResource = context.getResources().openRawResource(2131886117);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C1te.A00(openRawResource, byteArrayOutputStream);
                str2 = new String(byteArrayOutputStream.toByteArray());
                if (openRawResource != null) {
                    openRawResource.close();
                }
            } catch (IOException e) {
                0fH.A0s("GenericXmaYoutubePlayerWebviewController", "failed loading youtube html", e);
                if (str2 == null) {
                    return;
                }
            }
            JSONObject put = AnonymousClass001.A12().put("videoId", str).put("playerVars", AnonymousClass001.A12().put("rel", 0).put("cc_load_policy", 1).put("fs", 0).put("origin", "https://www.messenger.com").put("enablejsapi", 1).put("modestbranding", 1).put("start", i)).put("events", AnonymousClass001.A12().put("onReady", "onPlayerReady").put("onStateChange", "onPlayerStateChange")).put(Property.ICON_TEXT_FIT_HEIGHT, "100%").put(Property.ICON_TEXT_FIT_WIDTH, "100%");
            11T.A0A(put);
            secureWebView2.loadDataWithBaseURL("https://www.youtube.com", 0CV.A0W(0CV.A0W(str2, "<<INJECTED_SKIP_AUTOPLAY>>", z ? "true" : "false"), "<<INJECTED_PLAYER_INIT_PARAMS>>", 11T.A02(put)), "text/html", "UTF-8", "https://www.youtube.com");
        }
    }
}
