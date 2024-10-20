package X;

import android.content.Context;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.state.gen.State;
import com.google.common.base.Strings;

/* loaded from: Fjm.class */
public final class Fjm implements 2JM {
    public final int A00;
    public final Object A01;

    public Fjm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public String BGe() {
        switch (this.A00) {
            case 0:
                return "CoplayDrawerPluginPresenter";
            case 1:
                return "ScreenSharingDrawerPluginRsysPresenter";
            default:
                return "CoplayContainerPresenter";
        }
    }

    public void C7K(2JS r302) {
        switch (this.A00) {
            case 0:
                11T.A0F(r302, 0);
                E1q e1q = (E1q) this.A01;
                2JQ r0 = State.CONVERTER;
                11T.A0B(r0);
                Object A02 = r302.A02(r0);
                Object[] objArr = new Object[0];
                if (A02 == null) {
                    throw new RuntimeException(Strings.lenientFormat("expected a non-null reference", objArr));
                }
                if (((State) A02).callState == 4) {
                    Context context = e1q.A00;
                    ((EzE) 1Lm.A05(context, 4YV.A0F(context), 99470)).A00 = null;
                    return;
                }
                return;
            case 1:
                E1p.A00((E1p) this.A01);
                return;
            default:
                11T.A0F(r302, 0);
                E1r e1r = (E1r) this.A01;
                2JQ r02 = CallModel.CONVERTER;
                11T.A0B(r02);
                if (IFr.A0A((CallModel) r302.A02(r02), true).size() < 2) {
                    e1r.A0f(null);
                }
                2JQ r03 = State.CONVERTER;
                11T.A0B(r03);
                Object A022 = r302.A02(r03);
                Object[] objArr2 = new Object[0];
                if (A022 == null) {
                    throw new RuntimeException(Strings.lenientFormat("expected a non-null reference", objArr2));
                }
                if (((State) A022).callState == 4) {
                    ((FAb) 1Br.A0B(e1r.A0I)).A01();
                    return;
                }
                return;
        }
    }
}
