package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.inject.FbInjector;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.4xu, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xu.class */
public final class C11894xu implements 1UN {
    public 1PA A00;
    public final 1I7 A01;
    public final 1Br A02 = 1Bq.A00(99390);
    public final ArrayList A03;
    public final Context A04;

    public C11894xu() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A04 = A00;
        this.A01 = (1I7) 1Hv.A02(A00, 65728);
        this.A03 = new ArrayList();
        ((1UP) 1Bi.A03(66348)).A01(this);
    }

    public final void A00(String str, String str2, Object... objArr) {
        int length = objArr.length;
        0fH.A13(str, str2, Arrays.copyOf(objArr, length));
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%d : %s : %s", Long.valueOf(((C0dp) this.A02.A00.get()).now()), str, str2);
        11T.A0A(formatStrLocaleSafe);
        Object[] copyOf = Arrays.copyOf(objArr, length);
        synchronized (this) {
            ArrayList arrayList = this.A03;
            if (arrayList.size() >= 5000) {
                arrayList.remove(0);
            }
            arrayList.add(StringFormatUtil.formatStrLocaleSafe(formatStrLocaleSafe, Arrays.copyOf(copyOf, copyOf.length)));
        }
    }

    public void AFz() {
        1PA r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
    }
}
