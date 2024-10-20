package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.concurrent.TimeoutException;

/* renamed from: X.Adx, reason: case insensitive filesystem */
/* loaded from: Adx.class */
public final class C1319Adx implements DIV {
    public final C00i A00 = 1BQ.A01();
    public final java.util.Map A01;
    public static final String A03 = StringFormatUtil.formatStrLocaleSafe("SearchDataSourceLoadFailure:%s", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
    public static final String A02 = StringFormatUtil.formatStrLocaleSafe("SearchDataSourceLoadFailure:%s", "error");
    public static final String A04 = StringFormatUtil.formatStrLocaleSafe("SearchDataSourceLoadFailure:%s", "unknown");

    public C1319Adx(java.util.Map map) {
        this.A01 = map;
    }

    public void C4B(DIW diw, Exception exc, Object obj) {
        String str;
        String str2;
        String Aus = ((C4zn) this.A01.get(diw)).Aus();
        if (Aus == null) {
            0fH.A14("DataSourceLoadFailureLoggingCallback", "No section type in map for data source! %s", new Object[]{diw});
            return;
        }
        boolean z = exc instanceof TimeoutException;
        if (z) {
            str = A03;
            str2 = "Data Source (%s) load timed out";
        } else if (exc != null) {
            str = A02;
            str2 = "Data Source (%s) load failed with error";
        } else {
            str = A04;
            str2 = "Data Source (%s) load failed with unknown error";
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str2, Aus);
        0fH.A0r(str, formatStrLocaleSafe, exc);
        if (z) {
            return;
        }
        C01s A09 = 1BK.A09(this.A00);
        0BS A01 = 0BR.A01(str, formatStrLocaleSafe);
        A01.A04 = exc;
        A09.D0u(new 0BR(A01));
    }

    public void CHk(BOx bOx, DIW diw, ByH byH, Integer num, Object obj, String str, int i, boolean z) {
    }

    public void CJa(ByH byH, Object obj) {
    }

    public void CKt(DIW diw, ByH byH, Object obj) {
    }
}
