package X;

import android.R;
import android.content.Context;
import android.webkit.JsResult;
import android.webkit.WebView;

/* loaded from: E9W.class */
public final class E9W extends 0jY {
    public final 1Br A00 = 1Bu.A00(67527);
    public final Context A01;

    public E9W(Context context) {
        this.A01 = context;
    }

    public boolean A01(WebView webView, String str, String str2, JsResult jsResult) {
        7zR.A1O(str2, jsResult);
        DR6 A02 = ((C5ic) 1Br.A0B(this.A00)).A02(this.A01);
        A02.A0J(str2);
        A02.A09(FK6.A00(jsResult, 11));
        A02.A0B(FK6.A00(jsResult, 12), R.string.cancel);
        7zN.A13(A02);
        return true;
    }
}
