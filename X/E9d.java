package X;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import java.util.HashMap;
import org.json.JSONException;

/* loaded from: E9d.class */
public final class E9d extends C0gl implements C0h8 {
    public EoT A00;

    @Override // X.C0gl
    public void A04(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.A04(webView, webResourceRequest, webResourceError);
        EoT eoT = this.A00;
        if (eoT != null) {
            int errorCode = webResourceError.getErrorCode();
            String charSequence = webResourceError.getDescription().toString();
            String obj = webResourceRequest.getUrl().toString();
            DLQ dlq = eoT.A04;
            GJj A08 = dlq.A08();
            if (A08 != null) {
                HashMap A0u = AnonymousClass001.A0u();
                A0u.put("domain", obj);
                AnonymousClass001.A1A("code", A0u, errorCode);
                A0u.put("description", charSequence);
                FAv.A01(dlq, eoT.A03, DKM.A08(A0u), A08);
            }
        }
    }

    @Override // X.C0gl
    public void A05(WebView webView, String str) {
        super.A05(webView, str);
        EoT eoT = this.A00;
        if (eoT != null) {
            DLQ dlq = eoT.A04;
            String A0t = DKD.A0t(dlq, "", 38);
            String A0t2 = DKD.A0t(dlq, "", 41);
            if ("POST".equals(DKE.A0v(dlq, "")) && !"".equals(A0t2) && str.contains("<html> <head>  <script> function post(input) { var sourceURI = input['inlineUrl'];var params = input['bodyParams'];var method = \"POST\"; var form = document.createElement(\"form\"); form.setAttribute(\"method\", method);   form.setAttribute(\"action\", sourceURI); var jsonObj = JSON.parse(params);for(var key in jsonObj) { if(jsonObj.hasOwnProperty(key)) { var hiddenField = document.createElement(\"input\");   hiddenField.setAttribute(\"type\", \"hidden\");    hiddenField.setAttribute(\"name\", key);      hiddenField.setAttribute(\"value\", jsonObj[key]);          form.appendChild(hiddenField); } } document.body.appendChild(form);form.submit(); }   </script>  </head> <body></body> </html>")) {
                try {
                    eoT.A01.evaluateJavascript(String.format("post(%s)", AnonymousClass001.A12().put("inlineUrl", A0t).put("bodyParams", A0t2).toString()), null);
                } catch (JSONException e) {
                    FGT.A03("json exception body params needs to be in json format", e);
                }
            }
            EkX ekX = eoT.A02;
            ekX.A01 = str;
            if (ekX.A02) {
                ekX.A00.A01(eoT.A01.canGoBack());
            }
            GJj AlB = dlq.AlB(52);
            if (AlB != null) {
                FAv.A01(dlq, eoT.A03, DKM.A07(DKM.A00(), str, 0), AlB);
            }
        }
    }

    @Override // X.C0gl
    public void A06(WebView webView, String str, Bitmap bitmap) {
        super.A06(webView, str, bitmap);
        EoT eoT = this.A00;
        if (eoT != null) {
            DLQ dlq = eoT.A04;
            GJj AlB = dlq.AlB(51);
            if (AlB != null) {
                FAv.A01(dlq, eoT.A03, DKM.A08(str), AlB);
            }
            if (F2Z.A00(dlq, 44, true)) {
                GJj A07 = dlq.A07();
                EkX ekX = eoT.A02;
                if (!str.equals(ekX.A01) && A07 != null) {
                    FAv.A01(dlq, eoT.A03, DKM.A08(str), A07);
                }
                GJj AlB2 = dlq.AlB(48);
                if (str.equals(ekX.A01) || AlB2 == null) {
                    return;
                }
                DKM A02 = DKM.A02(str);
                FyG fyG = eoT.A03;
                A02.A0J(fyG, 1);
                DKM.A0D(dlq, fyG, A02, AlB2);
            }
        }
    }

    @Override // X.C0h8
    public boolean ANy(WebView webView, String str) {
        EoT eoT = this.A00;
        if (eoT == null) {
            return false;
        }
        DLQ dlq = eoT.A04;
        if (F2Z.A00(dlq, 44, true)) {
            return false;
        }
        GJj A07 = dlq.A07();
        EkX ekX = eoT.A02;
        if (!str.equals(ekX.A01) && A07 != null) {
            FAv.A01(dlq, eoT.A03, DKM.A08(str), A07);
        }
        GJj AlB = dlq.AlB(48);
        if (str.equals(ekX.A01) || AlB == null) {
            return false;
        }
        DKM A02 = DKM.A02(str);
        FyG fyG = eoT.A03;
        A02.A0J(fyG, 1);
        DKM.A0D(dlq, fyG, A02, AlB);
        return false;
    }
}
