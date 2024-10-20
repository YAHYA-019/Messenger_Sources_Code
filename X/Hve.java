package X;

import android.content.Context;
import android.view.ViewStub;
import android.widget.EditText;
import com.facebook.inject.FbInjector;

/* loaded from: Hve.class */
public final class Hve {
    public static final IFE A00(ViewStub viewStub, EditText editText, JMV jmv, JGc jGc, HBG hbg) {
        11T.A0F(viewStub, 0);
        C1F6 A0F = AbG.A0F(1106);
        I26 i26 = (I26) 1Bn.A0A(115720);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0F);
        try {
            IFE ife = new IFE(viewStub, editText, i26);
            1Bn.A0K();
            FbInjector.A04(A01);
            ife.A04 = jmv;
            ife.A05 = jGc;
            ife.A06 = hbg;
            ife.A08 = null;
            ife.A01 = new HW8(editText);
            return ife;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
