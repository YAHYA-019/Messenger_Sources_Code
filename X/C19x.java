package X;

import android.text.TextUtils;
import java.util.LinkedList;

/* renamed from: X.19x, reason: invalid class name */
/* loaded from: 19x.class */
public final class C19x {
    public final AnonymousClass161 A00;

    public C19x(AnonymousClass161 anonymousClass161) {
        this.A00 = anonymousClass161;
    }

    public void A00(String str, String str2) {
        A01("failures", new String[]{str, str2}, 1L);
    }

    public void A01(String str, String[] strArr, long j) {
        LinkedList linkedList = new LinkedList();
        int length = strArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                AnonymousClass161 anonymousClass161 = this.A00;
                C15r c15r = new C15r(str, j);
                c15r.A01 = linkedList;
                anonymousClass161.A00(c15r);
                return;
            }
            String str2 = strArr[i2];
            if (!TextUtils.isEmpty(str2)) {
                linkedList.add(str2);
            }
            i = i2 + 1;
        }
    }
}
