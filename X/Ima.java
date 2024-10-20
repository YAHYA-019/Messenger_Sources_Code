package X;

import com.google.common.base.Function;

/* loaded from: Ima.class */
public final class Ima implements Function {
    public final /* synthetic */ IfG A00;
    public final /* synthetic */ boolean A01;

    public Ima(IfG ifG, boolean z) {
        this.A00 = ifG;
        this.A01 = z;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        IXv iXv = (JNm) obj;
        if (iXv == null) {
            return null;
        }
        iXv.A00.APJ(this.A01);
        11T.A0A(1hM.A01);
        return null;
    }
}
