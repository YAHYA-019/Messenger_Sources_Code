package X;

import com.facebook.inject.FbInjector;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.GradientBackground;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;
import java.io.IOException;

/* renamed from: X.5ye, reason: invalid class name */
/* loaded from: 5ye.class */
public final class C5ye {
    public final 1BP A03 = FbInjector.A00;
    public final 1Br A02 = 1Bu.A00(67808);
    public final 1Br A01 = 1Bq.A00(66869);
    public final 1Br A00 = 1Bq.A00(66444);

    public static final int A00(MigColorScheme migColorScheme, ThreadThemeInfo threadThemeInfo) {
        int i;
        11T.A0F(migColorScheme, 1);
        return (threadThemeInfo == null || (i = threadThemeInfo.A0O) == 0) ? migColorScheme.BDl() : i;
    }

    public static final 7Gu A01(ThreadThemeInfo threadThemeInfo) {
        int i;
        int i2;
        if (threadThemeInfo == null || (i = threadThemeInfo.A0B) == 0 || (i2 = threadThemeInfo.A0A) == 0) {
            return null;
        }
        return new 7Gu(i, i2);
    }

    public static final 7Gu A02(ThreadThemeInfo threadThemeInfo) {
        int i;
        int i2;
        if (threadThemeInfo == null || (i = threadThemeInfo.A0G) == 0 || (i2 = threadThemeInfo.A0F) == 0) {
            return null;
        }
        return new 7Gu(i, i2);
    }

    public final int A03(MigColorScheme migColorScheme, ThreadThemeInfo threadThemeInfo) {
        int i;
        int i2;
        if (threadThemeInfo != null && (i2 = threadThemeInfo.A05) != 0) {
            return i2;
        }
        ImmutableList A06 = A06(migColorScheme, threadThemeInfo);
        int size = A06.size();
        if (size > 0) {
            int i3 = size - 1;
            Number number = (Number) A06.get(i3);
            if (number == null || number.intValue() != 0) {
                Object obj = A06.get(i3);
                11T.A0A(obj);
                return ((Number) obj).intValue();
            }
        }
        return (threadThemeInfo == null || (i = threadThemeInfo.A08) == 0) ? migColorScheme.Ah8() : i;
    }

    public final int A04(MigColorScheme migColorScheme, ThreadThemeInfo threadThemeInfo) {
        int i;
        Number number;
        int i2;
        11T.A0F(migColorScheme, 2);
        if (threadThemeInfo != null && (i2 = threadThemeInfo.A0P) != 0) {
            return i2;
        }
        ImmutableList A06 = A06(migColorScheme, threadThemeInfo);
        if (!(!A06.isEmpty()) || ((number = (Number) A06.get(0)) != null && number.intValue() == 0)) {
            return (threadThemeInfo == null || (i = threadThemeInfo.A08) == 0) ? migColorScheme.Ah8() : i;
        }
        Object obj = A06.get(0);
        11T.A0A(obj);
        return ((Number) obj).intValue();
    }

    public final GradientBackground A05(ThreadThemeInfo threadThemeInfo) {
        GradientBackground gradientBackground;
        if (threadThemeInfo != null) {
            7Yk r0 = (7Yk) this.A01.A00.get();
            C01i c01i = r0.A02;
            java.util.Map map = (java.util.Map) c01i.getValue();
            Long valueOf = Long.valueOf(threadThemeInfo.A0T);
            gradientBackground = (GradientBackground) map.get(valueOf);
            if (gradientBackground == null) {
                String str = threadThemeInfo.A0h;
                if (str != null && !0CU.A0O(str)) {
                    try {
                        GradientBackground gradientBackground2 = (GradientBackground) ((AnonymousClass244) r0.A01.A00.get()).A0V(str, GradientBackground.class);
                        if (gradientBackground2 != null) {
                            ((java.util.Map) c01i.getValue()).put(valueOf, gradientBackground2);
                            return gradientBackground2;
                        }
                    } catch (IOException e) {
                        1Br.A04(r0.A00).softReport("GradientBackgroundCache", 0Pz.A0W("Failed to deserialize gradient background: ", str), e);
                    }
                }
            }
            return gradientBackground;
        }
        gradientBackground = null;
        return gradientBackground;
    }

    public final ImmutableList A06(MigColorScheme migColorScheme, ThreadThemeInfo threadThemeInfo) {
        11T.A0F(migColorScheme, 2);
        if (threadThemeInfo == null) {
            2xJ r0 = 2Gs.A00;
            threadThemeInfo = 2xJ.A00;
        }
        2xJ r02 = 2Gs.A00;
        ImmutableList of = (threadThemeInfo.A0S != 3259963564026002L || ((C5yd) this.A02.A00.get()).A01()) ? (11T.A0O(threadThemeInfo, 2xJ.A00) && ((C5yd) this.A02.A00.get()).A01()) ? ImmutableList.of((Object) Integer.valueOf(migColorScheme.B5V()), (Object) Integer.valueOf(migColorScheme.AZc())) : threadThemeInfo.A0a : ImmutableList.of();
        11T.A0A(of);
        return of;
    }
}
