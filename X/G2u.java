package X;

import com.facebook.common.stringformat.StringFormatUtil;
import org.json.JSONObject;

/* loaded from: G2u.class */
public final class G2u implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverWebView$4";
    public final /* synthetic */ E9a A00;
    public final /* synthetic */ JSONObject A01;

    public G2u(E9a e9a, JSONObject jSONObject) {
        this.A00 = e9a;
        this.A01 = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.evaluateJavascript(StringFormatUtil.formatStrLocaleSafe("e = new Event('message');e.data = %s;window.dispatchEvent(e);", this.A01), null);
    }
}
