package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.facebook.messaging.dma.ui.MsplitContactExportWebviewLauncher;

/* loaded from: E9c.class */
public final class E9c extends C0gl implements C0h8 {
    public final /* synthetic */ MsplitContactExportWebviewLauncher A00;

    public E9c(MsplitContactExportWebviewLauncher msplitContactExportWebviewLauncher) {
        this.A00 = msplitContactExportWebviewLauncher;
    }

    @Override // X.C0gl
    public void A05(WebView webView, String str) {
        11T.A0H(webView, str);
        ProgressBar progressBar = this.A00.A00;
        if (progressBar == null) {
            11T.A0L("loadingIndicator");
            throw 0Q8.createAndThrow();
        }
        progressBar.setVisibility(8);
        super.A05(webView, str);
    }

    @Override // X.C0gl
    public void A06(WebView webView, String str, Bitmap bitmap) {
        1BK.A1M(webView, str);
        MsplitContactExportWebviewLauncher msplitContactExportWebviewLauncher = this.A00;
        ProgressBar progressBar = msplitContactExportWebviewLauncher.A00;
        if (progressBar == null) {
            11T.A0L("loadingIndicator");
            throw 0Q8.createAndThrow();
        }
        progressBar.setVisibility(0);
        super.A06(webView, str, bitmap);
        if (0CU.A0T(str, "https://m.facebook.com/msplit/export-contact-completed/", false)) {
            Uri A0C = 7zU.A0C(str);
            msplitContactExportWebviewLauncher.A04 = String.valueOf(A0C.getQueryParameter("nonce"));
            msplitContactExportWebviewLauncher.A05 = String.valueOf(A0C.getQueryParameter("msplit_zippy_id"));
        }
    }

    @Override // X.C0h8
    public boolean ANy(WebView webView, String str) {
        11T.A0F(str, 1);
        if (!0CU.A0T(str, "https://m.facebook.com/msplit/close-webview/", false)) {
            return false;
        }
        MsplitContactExportWebviewLauncher msplitContactExportWebviewLauncher = this.A00;
        Uri.Builder authority = new Uri.Builder().scheme("fb-messenger-secure").authority(AbstractC00603o4.A00(557));
        String str2 = msplitContactExportWebviewLauncher.A04;
        String str3 = "nonce";
        if (str2 != null) {
            Uri.Builder appendQueryParameter = authority.appendQueryParameter(str3, str2);
            String str4 = msplitContactExportWebviewLauncher.A05;
            if (str4 != null) {
                Intent A09 = 4YU.A09(4YU.A0F(11T.A02(AbM.A0A(appendQueryParameter, "msplit_zippy_id", str4))));
                A09.setFlags(268435456);
                0LS.A0A(msplitContactExportWebviewLauncher, A09);
                msplitContactExportWebviewLauncher.finish();
                return true;
            }
            str3 = "zippyDbId";
        }
        11T.A0L(str3);
        throw 0Q8.createAndThrow();
    }
}
