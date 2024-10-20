package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.CompositionInfo;
import com.google.common.base.Preconditions;
import java.lang.ref.WeakReference;

/* loaded from: I1l.class */
public final class I1l {
    public HEr A00;
    public String A01;

    public static String A00(C00i c00i) {
        return ((I1l) c00i.get()).A01;
    }

    public CompositionInfo A01(HFw hFw, BaseItem baseItem) {
        Integer num = 0S2.A0u;
        Integer num2 = 0S2.A0N;
        HEr hEr = this.A00;
        if (hEr != null) {
            WeakReference weakReference = hEr.A00;
            if (weakReference.get() != null) {
                IQ1 iq1 = (IQ1) weakReference.get();
                CallerContext callerContext = IQ1.A1m;
                num = iq1.A1C.A0N();
            }
            WeakReference weakReference2 = this.A00.A00;
            if (weakReference2.get() != null) {
                num2 = JOC.A00((IQ1) weakReference2.get()) ? 0S2.A01 : 0S2.A00;
            }
        }
        int indexOf = hFw.A01.indexOf(baseItem);
        String str = hFw.A00.A01;
        I2u i2u = new I2u();
        i2u.A0D = baseItem.A09;
        i2u.A0B = num;
        i2u.A0C = num2;
        Preconditions.checkArgument(1BL.A1S(indexOf));
        i2u.A00 = indexOf;
        i2u.A0I = str;
        return new CompositionInfo(i2u);
    }
}
