package X;

import com.facebook.common.stringformat.StringFormatUtil;
import org.json.JSONObject;

/* loaded from: G2w.class */
public final class G2w implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverWebViewBase$evaluate$1";
    public final /* synthetic */ E9Z A00;
    public final /* synthetic */ JSONObject A01;

    public G2w(E9Z e9z, JSONObject jSONObject) {
        this.A01 = jSONObject;
        this.A00 = e9z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.evaluateJavascript(StringFormatUtil.formatStrLocaleSafe("e = new Event('message');e.data = %s;window.dispatchEvent(e);", this.A01), null);
    }
}
