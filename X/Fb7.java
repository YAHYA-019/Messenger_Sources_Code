package X;

import kotlin.jvm.functions.Function1;

/* loaded from: Fb7.class */
public final class Fb7 implements GHZ {
    public final /* synthetic */ FHh A00;
    public final /* synthetic */ GJj A01;
    public final /* synthetic */ GJj A02;
    public final /* synthetic */ java.util.Map A03;

    public Fb7(FHh fHh, GJj gJj, GJj gJj2, java.util.Map map) {
        this.A00 = fHh;
        this.A03 = map;
        this.A02 = gJj;
        this.A01 = gJj2;
    }

    public void COo(EoK eoK) {
        String str;
        String str2;
        FHh fHh;
        FHh fHh2 = this.A00;
        java.util.Map map = this.A03;
        GJj gJj = this.A02;
        GJj gJj2 = this.A01;
        FEV fev = gJj == null ? null : new FEV(fHh2, gJj);
        if (gJj2 != null) {
            new FEV(fHh2, gJj2);
        }
        FyG fyG = fHh2.A03;
        if (fyG == null) {
            str = "BloksAsyncAction";
            str2 = "Async action executed with a null Context";
        } else {
            Object A00 = FEK.A00(FAv.A00(eoK, fyG, map), DKM.A08(fyG), eoK.A02.AIE(fHh2.A02, null));
            if (fev == null) {
                return;
            }
            DKc A06 = DKM.A06(DKM.A02(A00), fyG);
            Function1 function1 = fev.A03;
            if (function1 != null) {
                function1.invoke(A06);
                return;
            }
            GJj gJj3 = fev.A01;
            if (gJj3 != null && (fHh = fev.A00) != null) {
                FEK.A00(fHh, A06, gJj3);
                return;
            } else {
                str = "BloksCallback";
                str2 = "An attempt to invoke an invalid callback";
            }
        }
        FGT.A02(str, str2);
    }

    public void onFailure(Throwable th) {
        FHh fHh = this.A00;
        FGT.A00(fHh.A03, "MSGBloksAsyncActionWithDataManifestV2Implementation", "Failed to fetch action payload", th);
        FEK.A00(fHh, DKc.A01, this.A01);
    }
}
