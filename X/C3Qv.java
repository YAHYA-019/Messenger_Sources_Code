package X;

import android.os.Looper;
import android.view.Window;
import androidx.lifecycle.LiveData;
import java.util.Iterator;

/* renamed from: X.3Qv, reason: invalid class name */
/* loaded from: 3Qv.class */
public final class C3Qv {
    public Window A00;
    public Integer A01;
    public Integer A02;
    public final java.util.Map A04 = 1BK.A1C();
    public final 1Br A03 = 1Bu.A00(84230);

    private final void A00(Integer num) {
        Window window;
        if (11T.A0O(this.A02, num)) {
            return;
        }
        this.A02 = num;
        if (num == null || (window = this.A00) == null) {
            return;
        }
        1Br.A0C(this.A03);
        1tJ.A04(window, num.intValue());
    }

    public final void A01(Window window, int i, int i2) {
        this.A00 = window;
        boolean z = !0AT.A02(i);
        boolean z2 = !0AT.A02(i2);
        int i3 = 256;
        if (z) {
            i3 = 8448;
        }
        if (z2) {
            i3 |= 16;
        }
        A00(Integer.valueOf(i3));
        C00i c00i = this.A03.A00;
        c00i.get();
        C2yk.A00(window, i2);
        this.A01 = Integer.valueOf(i);
        Window window2 = this.A00;
        if (window2 != null) {
            Iterator A1B = 1BK.A1B(this.A04);
            if (A1B.hasNext()) {
                A1B.next();
                if (A1B.hasNext()) {
                    throw AnonymousClass001.A0Q("ordinal");
                }
            }
            Integer num = this.A01;
            if (num != null) {
                c00i.get();
                int intValue = num.intValue();
                1tJ.A06(window2, intValue);
                boolean A02 = 0AT.A02(intValue);
                int i4 = 8192;
                if (A02) {
                    i4 = 0;
                }
                Integer num2 = this.A02;
                if (num2 != null) {
                    i4 = num2.intValue();
                }
                int i5 = i4 | 8192;
                if (A02) {
                    i5 = i4 & (-8193);
                }
                A00(Integer.valueOf(i5));
            }
            C6sy c6sy = (C6sy) 1Bi.A03(67328);
            if (!((2Qs) 1Br.A0B(c6sy.A00)).A00()) {
                0fH.A0j("SystemBarThemeColorsProviderImpl", "status bar color override ignored -- SystemBarUiController is not enabled");
                return;
            }
            boolean A0O = 11T.A0O(Looper.myLooper(), Looper.getMainLooper());
            LiveData liveData = (LiveData) c6sy.A01.getValue();
            if (A0O) {
                liveData.setValue(null);
            } else {
                liveData.postValue(null);
            }
        }
    }
}
