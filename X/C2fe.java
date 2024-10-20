package X;

import android.net.Uri;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.user.profilepic.PicSquare;
import com.facebook.user.profilepic.PicSquareUrlWithSize;
import com.google.common.base.Objects;

/* renamed from: X.2fe, reason: invalid class name */
/* loaded from: 2fe.class */
public final class C2fe {
    public final String A02;
    public final C00i A01 = new 1BQ(16511);
    public final Boolean A00 = (Boolean) 1Bn.A0A(65895);

    public C2fe() {
        String obj = ((InterfaceC00281am) 1Bn.A0A(83594)).AoA().toString();
        this.A02 = obj.endsWith("/") ? obj : 0Pz.A0J(obj, '/');
    }

    public static int A00(2qZ r301) {
        if (r301.A05 == 2qU.A02) {
            return 167772160;
        }
        return r301.A01;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2qQ, java.lang.Object] */
    public static Uri A01() {
        MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0A(16979);
        ?? obj = new Object();
        ((2qQ) obj).A00 = 2132346821;
        ((2qQ) obj).A01 = 2132346820;
        return C0A2.A03(0Pz.A0T("res:///", AnonymousClass001.A03(migColorScheme.Ci4(obj.A00()))));
    }

    private Uri A02(UserKey userKey, PicSquare picSquare, int i, int i2) {
        if (picSquare == null) {
            return null;
        }
        PicSquareUrlWithSize A00 = picSquare.A00(i2);
        PicSquareUrlWithSize A002 = picSquare.A00(i2 - ((i2 * 25) / 100));
        int i3 = A002.size;
        int abs = Math.abs(i2 - i3);
        int i4 = A00.size;
        if (abs < Math.abs(i2 - i4)) {
            Integer valueOf = Integer.valueOf(i2);
            Integer valueOf2 = Integer.valueOf(i4);
            Integer valueOf3 = Integer.valueOf(i3);
            String str = A002.url;
            if (0fH.A01.BTv(2)) {
                0fH.A0D(C2fe.class, StringFormatUtil.formatStrLocaleSafe("Pick profile image url with tolerable smaller dimensions. RequestPx=%spx, OriginalPx=%spx, SmallerPx=%spx, Uri=%s", valueOf, valueOf2, valueOf3, str));
            }
        } else {
            A002 = A00;
        }
        String str2 = userKey != null ? userKey.id : null;
        Integer valueOf4 = Integer.valueOf(i2);
        Integer valueOf5 = Integer.valueOf(A002.size);
        String str3 = A002.url;
        if (0fH.A01.BTv(2)) {
            0fH.A0D(C2fe.class, StringFormatUtil.formatStrLocaleSafe("Got square profile pic. userId=%s, requestedSize=%spx, returnSize=%spx, url=%s", str2, valueOf4, valueOf5, str3));
        }
        Uri A03 = C0A2.A03(A002.url);
        if (A03.isAbsolute()) {
            return A03;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Invalid PicSquareUri:");
        A0k.append(A002.url);
        if (userKey != null) {
            A0k.append("|user=");
            1BK.A1R(A0k, userKey);
        }
        A0k.append("|tw=");
        A0k.append(i);
        A0k.append("|th=");
        A0k.append(i2);
        1Du it = picSquare.mPicSquareUrlsWithSizes.iterator();
        while (it.hasNext()) {
            PicSquareUrlWithSize picSquareUrlWithSize = (PicSquareUrlWithSize) it.next();
            A0k.append("|url_");
            A0k.append(picSquareUrlWithSize.size);
            A0k.append(":");
            A0k.append(picSquareUrlWithSize.url);
        }
        1BK.A09(this.A01).D0v(C2fe.class.toString(), A0k.toString());
        return null;
    }

    public Uri A03(2qZ r302) {
        UserKey userKey;
        Uri uri = null;
        if (r302 != null) {
            int i = r302.A00;
            if (i != 0) {
                uri = C0A2.A03(0Pz.A0T("res:///", i));
            } else if (r302.A05 == 2qU.A02 || ((userKey = r302.A03) != null && User.A01(userKey.type))) {
                return A01();
            }
        }
        return uri;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        if (r313 == null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.net.Uri A04(X.2qZ r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2fe.A04(X.2qZ, int, int):android.net.Uri");
    }

    public Uri A05(String str, int i, int i2) {
        String str2;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this.A02);
        sb.append(str);
        sb.append("/picture?type=square&width=");
        sb.append(i);
        sb.append("&height=");
        sb.append(i2);
        if (this.A00.booleanValue()) {
            1Ey r0 = (1Ey) 1Bi.A03(65755);
            if (r0.Aue() != ViewerContext.A01) {
                sb.append("&access_token=");
                str2 = r0.Aue().mAuthToken;
                sb.append(Uri.encode(str2));
                return C0A2.A03(sb.toString());
            }
        }
        sb.append("&access_token=");
        str2 = "257931075544071|a19fbd5886d2081430fe02ba9e10ca7d";
        sb.append(Uri.encode(str2));
        return C0A2.A03(sb.toString());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2fe c2fe = (C2fe) obj;
            if (!Objects.equal(this.A00, c2fe.A00) || !Objects.equal(this.A02, c2fe.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 0J6.A00(this.A00, this.A02);
    }
}
