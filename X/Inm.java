package X;

import com.facebook.messaging.montage.model.art.EffectItem;
import java.util.List;

/* loaded from: Inm.class */
public final class Inm implements GJB {
    public final /* synthetic */ int A00;
    public final /* synthetic */ I5A A01;
    public final /* synthetic */ GWo A02;
    public final /* synthetic */ Integer A03;

    public Inm(I5A i5a, GWo gWo, Integer num, int i) {
        this.A02 = gWo;
        this.A01 = i5a;
        this.A00 = i;
        this.A03 = num;
    }

    public void onFailure(Throwable th) {
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Exq exq = (Exq) obj;
        11T.A0F(exq, 0);
        List list = exq.A00;
        if (list.isEmpty()) {
            return;
        }
        EzX ezX = (EzX) 0QD.A0D(list);
        GWo gWo = this.A02;
        I5A i5a = this.A01;
        int i = this.A00;
        EffectItem A01 = i5a.A01();
        Integer num = this.A03;
        String str = ezX.A05;
        DKE.A0K(gWo.A0I).post(new J3t(GOo.A0H(gWo), i5a, A01, null, gWo, num, str, i));
    }
}
