package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.9lv, reason: invalid class name */
/* loaded from: 9lv.class */
public final class C9lv {
    public final 1Br A00 = 1Bq.A00(83605);
    public final 1Br A02 = 1Bu.A00(67808);
    public final 1Br A01 = 1Bu.A00(66207);
    public final 1Br A03 = 1Bu.A00(66208);

    public static final int A00(C9lv c9lv, MigColorScheme migColorScheme) {
        if (AnonymousClass001.A1V(1Br.A0B(c9lv.A00))) {
            return migColorScheme.Ah8();
        }
        return -16089857;
    }

    public static Drawable A01(1Iw r301, C9lv c9lv, MigColorScheme migColorScheme, ThreadThemeInfo threadThemeInfo) {
        int[] A03 = c9lv.A03(migColorScheme, threadThemeInfo);
        Context context = r301.A0D;
        Resources resources = context.getResources();
        return 9kB.A01(A03, C0A8.A00(context, resources.getDimensionPixelSize(R.dimen.mapbox_minimum_scale_span_when_rotating)), C0A8.A00(context, resources.getDimensionPixelSize(2132279349)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008d, code lost:
    
        if (r306 != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int[] A02(X.C9lv r301, com.facebook.messaging.model.threads.ThreadSummary r302, com.facebook.mig.scheme.interfaces.MigColorScheme r303) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9lv.A02(X.9lv, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.mig.scheme.interfaces.MigColorScheme):int[]");
    }

    public final int[] A03(MigColorScheme migColorScheme, ThreadThemeInfo threadThemeInfo) {
        11T.A0H(threadThemeInfo, migColorScheme);
        ImmutableList A06 = ((C5ye) 1Br.A0B(this.A01)).A06(migColorScheme, threadThemeInfo);
        if (A06.isEmpty()) {
            return new int[]{threadThemeInfo.A08};
        }
        int[] A03 = threadThemeInfo.A0m ? 1NS.A03(A06.reverse()) : 1NS.A03(A06);
        11T.A0A(A03);
        return A03;
    }
}
