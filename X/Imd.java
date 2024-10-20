package X;

import com.google.common.base.Function;

/* loaded from: Imd.class */
public final class Imd implements Function {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IfG A01;
    public final /* synthetic */ String A02;

    public Imd(IfG ifG, String str, int i) {
        this.A01 = ifG;
        this.A00 = i;
        this.A02 = str;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        IXv iXv = (JNm) obj;
        if (iXv == null) {
            return null;
        }
        int i = this.A00;
        String str = this.A02;
        IXv iXv2 = iXv;
        if ("Cancelled delayed group call".equals(str) || "Cancelled group call from safety warning interstitial".equals(str)) {
            iXv2.A07.A0j(iXv2, str, (String) null, i, false);
        }
        iXv2.A00.AQ3(i, str);
        11T.A0A(1hM.A01);
        return null;
    }
}
