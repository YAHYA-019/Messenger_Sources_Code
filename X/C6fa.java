package X;

import android.text.Editable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6fa, reason: invalid class name */
/* loaded from: 6fa.class */
public final class C6fa {
    public Editable A00;
    public 7IC A01;
    public Integer A02;
    public String A03;
    public java.util.Map A04;
    public int A05;
    public Integer A06;
    public final 6fX A07;
    public final C6fZ A08;

    public C6fa(6fX r302, C6fZ c6fZ) {
        11T.A0F(c6fZ, 1);
        this.A08 = c6fZ;
        this.A07 = r302;
        this.A05 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0558, code lost:
    
        if (r336 != false) goto L100;
     */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object, X.0PI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00(android.text.Editable r302, com.facebook.messaging.model.threadkey.ThreadKey r303, X.6qJ r304) {
        /*
            Method dump skipped, instructions count: 1759
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6fa.A00(android.text.Editable, com.facebook.messaging.model.threadkey.ThreadKey, X.6qJ):void");
    }

    public final void A01(ThreadKey threadKey, 6qJ r303, java.util.Map map) {
        this.A06 = this.A02;
        this.A04 = map;
        if (map == null || map.isEmpty()) {
            this.A02 = null;
            this.A01 = null;
            this.A04 = null;
        } else {
            03Y A00 = r303.A00(threadKey, map);
            Integer num = (Integer) A00.first;
            7IC r0 = (7IC) A00.second;
            this.A02 = num;
            this.A01 = r0;
        }
    }

    public final void A02(CharSequence charSequence, int i, int i2) {
        String str;
        if (this.A02 == null || (str = this.A03) == null || charSequence.equals(str)) {
            return;
        }
        String str2 = this.A03;
        if (str2 == null) {
            11T.A0L("beforeText");
            throw 0Q8.createAndThrow();
        }
        if (i2 + i >= charSequence.length()) {
            int length = charSequence.length();
            int length2 = str2.length();
            int min = Math.min(length, length2);
            while (i < min && 16R.A02(charSequence.charAt(i), str2.charAt(i), true)) {
                i++;
            }
            int i3 = i - 1;
            if (0CU.A0P(charSequence, i3) || 0CU.A0P(str2, i3)) {
                i = i3;
            }
            if (charSequence.length() == length2 && i == charSequence.length()) {
                i = -1;
            }
        }
        this.A05 = i;
    }
}
