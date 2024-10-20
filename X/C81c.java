package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.inject.FbInjector;

/* renamed from: X.81c, reason: invalid class name */
/* loaded from: 81c.class */
public final class C81c {
    public final 1Br A01 = 1Bq.A00(99805);
    public final 1Br A02 = 1Bq.A00(83273);
    public final 1BP A00 = FbInjector.A00;

    public final String A00(long j) {
        Resources resources;
        int i;
        Object[] objArr;
        long round = Math.round(j / 1000.0d);
        int i2 = (int) (round / 3600);
        long j2 = round % 3600;
        long j3 = 60;
        int i3 = (int) (j2 / j3);
        int i4 = (int) (j2 % j3);
        if (i2 > 0) {
            resources = 7zL.A09().getResources();
            i = 2131967885;
            objArr = new Object[]{StringFormatUtil.formatStrLocaleSafe("%d", AnonymousClass001.A1a(i2)), StringFormatUtil.formatStrLocaleSafe("%02d", AnonymousClass001.A1a(i3)), StringFormatUtil.formatStrLocaleSafe("%02d", AnonymousClass001.A1a(i4))};
        } else {
            Context context = FbInjector.A03;
            11T.A0A(context);
            resources = context.getResources();
            i = 2131967886;
            objArr = new Object[]{StringFormatUtil.formatStrLocaleSafe("%d", Integer.valueOf(i3)), StringFormatUtil.formatStrLocaleSafe("%02d", Integer.valueOf(i4))};
        }
        String string = resources.getString(i, objArr);
        11T.A0A(string);
        return string;
    }
}
