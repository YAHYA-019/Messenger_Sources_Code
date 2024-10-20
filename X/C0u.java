package X;

import android.content.res.Resources;
import com.facebook.inject.FbInjector;
import java.util.concurrent.TimeUnit;

/* loaded from: C0u.class */
public final class C0u {
    public final 1BP A00 = FbInjector.A00;

    public final String A00(long j) {
        String string;
        Resources A06;
        int i;
        int i2;
        Object[] objArr;
        Long valueOf;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j);
        long minutes = timeUnit.toMinutes(j - TimeUnit.HOURS.toMillis(hours));
        if (hours > 0) {
            A06 = AbJ.A06();
            if (minutes > 0) {
                i = 2131820635;
                i2 = (int) hours;
                objArr = new Object[]{Long.valueOf(hours), Long.valueOf(minutes)};
                string = A06.getQuantityString(i, i2, objArr);
                11T.A0A(string);
                return string;
            }
            i = 2131820634;
            i2 = (int) hours;
            objArr = new Object[1];
            valueOf = Long.valueOf(hours);
        } else {
            if (minutes <= 0) {
                string = AbJ.A06().getString(2131958693);
                11T.A0A(string);
                return string;
            }
            A06 = AbJ.A06();
            i = 2131820636;
            i2 = (int) minutes;
            objArr = new Object[1];
            valueOf = Long.valueOf(minutes);
        }
        objArr[0] = valueOf;
        string = A06.getQuantityString(i, i2, objArr);
        11T.A0A(string);
        return string;
    }
}
