package X;

import androidx.lifecycle.LifecycleOwner;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;

/* loaded from: AHx.class */
public final class AHx implements 0zU {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C9ma A01;

    public AHx(C9ma c9ma, float f) {
        this.A01 = c9ma;
        this.A00 = f;
    }

    public /* bridge */ /* synthetic */ Object emit(Object obj, 0DR r303) {
        LithoView lithoView;
        int ordinal;
        03Y r0 = (03Y) obj;
        9lF r02 = (9lF) r0.first;
        float A00 = 7zM.A00(r0.second);
        C9ma c9ma = this.A01;
        9lF r03 = c9ma.A04;
        if ((((r03 != null ? r03.A01 : null) == 96E.A03 && ((ordinal = r02.A01.ordinal()) == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4)) || (r03 != null && (r03.A0A != r02.A0A || r03.A0B != r02.A0B))) && (lithoView = c9ma.A02) != null) {
            lithoView.performHapticFeedback(1);
        }
        c9ma.A04 = r02;
        float f = 100.0f;
        if (this.A00 < 100.0f) {
            f = 50.0f;
            if (A00 > 0.0f) {
                f = 50.0f + (A00 * 50.0f);
            }
        }
        LithoView lithoView2 = c9ma.A02;
        if (lithoView2 != null) {
            CallerContext callerContext = 8hL.A0B;
            8DP r04 = (8DP) c9ma.A0X.getValue();
            LifecycleOwner viewLifecycleOwner = c9ma.A0B.getViewLifecycleOwner();
            C94f c94f = c9ma.A05;
            if (c94f == null) {
                11T.A0L("viewDataBridge");
                throw 0Q8.createAndThrow();
            }
            boolean A002 = ((9Wm) 1Br.A0B(c9ma.A0F)).A00();
            C00i c00i = c9ma.A0G.A00;
            lithoView2.A0x(new 8hL(viewLifecycleOwner, 7zQ.A0m(c9ma.A0I), r02, c94f, r04, f, 2yD.A00(1Br.A07(((2hT) c00i.get()).A00), 36607913229492111L), 1Br.A07(((2hT) c00i.get()).A00).Auy(36607913229361038L), A002));
        }
        return 04S.A00;
    }
}
