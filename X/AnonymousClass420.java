package X;

import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.420, reason: invalid class name */
/* loaded from: 420.class */
public final class AnonymousClass420 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Rect[] A04;
    public final String[] A05;
    public final C5e5[][] A06;

    public AnonymousClass420(String str, String str2, Rect[] rectArr, String[] strArr, C5e5[][] c5e5Arr, int i) {
        this.A01 = str;
        String queryParameter = Uri.parse(str).getQueryParameter("v");
        this.A02 = TextUtils.isEmpty(queryParameter) ? "unknown" : queryParameter;
        this.A03 = str2;
        this.A04 = rectArr;
        this.A00 = i;
        this.A05 = strArr;
        this.A06 = c5e5Arr;
    }
}
