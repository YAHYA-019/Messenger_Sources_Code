package X;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* renamed from: X.66b, reason: invalid class name */
/* loaded from: 66b.class */
public class C66b implements 2IE {
    public String A00;
    public long A01;
    public 5Et A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final long A06;
    public final boolean A07;

    public C66b(5Et r302, String str, String str2, int i, boolean z, boolean z2) {
        this.A06 = SystemClock.uptimeMillis();
        this.A07 = z;
        this.A04 = str2;
        this.A02 = r302;
        this.A03 = str;
        this.A00 = null;
        this.A05 = z2;
        this.A01 = i;
    }

    public C66b(Hbl hbl) {
        this.A06 = SystemClock.uptimeMillis();
        this.A07 = false;
        this.A04 = hbl.A01;
        this.A02 = hbl.A00;
        this.A03 = "image/jpeg";
        this.A00 = null;
        this.A05 = false;
        this.A01 = 0L;
    }

    public void CE3(String str, String str2, String str3) {
    }

    public void CE5(String str, String str2, java.util.Map map) {
        5Et r0;
        if (!str2.equals("NetworkFetchProducer") || TextUtils.isEmpty(this.A00) || (r0 = this.A02) == null) {
            return;
        }
        r0.A05(this.A00, (List) null, 5, 505);
        r0.A03(5, this.A00);
    }

    public void CE7(String str, String str2, Throwable th, java.util.Map map) {
        5Et r0;
        if ((this instanceof C66v) || !str2.equals("NetworkFetchProducer") || TextUtils.isEmpty(this.A00) || (r0 = this.A02) == null) {
            return;
        }
        String str3 = this.A00;
        th.getMessage();
        11T.A0F(str3, 1);
        r0.A01.A01(5, str3);
    }

    public void CE9(String str, String str2, java.util.Map map) {
        5Et r0;
        if ((this instanceof C66v) || !str2.equals("NetworkFetchProducer") || TextUtils.isEmpty(this.A00) || (r0 = this.A02) == null) {
            return;
        }
        r0.A05(this.A00, (List) null, 5, 51);
        r0.A03(5, this.A00);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CEB(java.lang.String r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66b.CEB(java.lang.String, java.lang.String):void");
    }

    public void CGn(String str) {
    }

    public void CGx(2Dp r302, String str, Throwable th, boolean z) {
        if (this instanceof C66v) {
            11T.A0F(r302, 0);
            11T.A0F(th, 2);
            H5u h5u = ((C66v) this).A00;
            h5u.A01 = new GnG(th.getMessage(), false);
            H5u.A01(h5u);
            ThreadKey threadKey = h5u.A0E;
            if (threadKey == null || threadKey.A0z()) {
                C3Pw c3Pw = (C3Pw) 1Br.A0B(h5u.A08);
                Uri uri = r302.A05;
                11T.A0A(uri);
                1Br.A0C(c3Pw.A00);
                String queryParameter = uri.getQueryParameter("rl");
                if (queryParameter != null && Integer.parseInt(queryParameter) != 2) {
                    return;
                }
            }
            ((1GU) 1Bi.A03(16458)).Ciz(new IqW(h5u));
        }
    }

    public void CH5(2Dp r302, Object obj, String str, boolean z) {
    }

    public void CH7(2Dp r302, String str, boolean z) {
    }

    public void CS7(String str, String str2, boolean z) {
    }

    public boolean ChK(String str) {
        return false;
    }
}
