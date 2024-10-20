package X;

import android.content.Context;
import android.view.TextureView;
import android.view.View;

/* loaded from: Gub.class */
public final class Gub extends Ht4 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Ht4 A02;
    public final /* synthetic */ IDE A03;

    public Gub(View view, Ht4 ht4, IDE ide, int i) {
        this.A03 = ide;
        this.A00 = i;
        this.A01 = view;
        this.A02 = ht4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r313v3, types: [java.lang.Object, X.RtX] */
    @Override // X.Ht4
    public /* bridge */ /* synthetic */ void A04(Object obj) {
        ICm iCm;
        JGD jgd;
        JGD jgd2;
        JNQ jnq;
        ID3.A01("ConcurrentFrontBackController", "Disconnection completed successfully");
        IDE ide = this.A03;
        ICm iCm2 = ide.A04;
        if (iCm2 == null) {
            int i = this.A00;
            View view = this.A01;
            ID3.A01("ConcurrentFrontBackController", "Creating auxiliary instance");
            ICm iCm3 = ide.A0D;
            JNQ jnq2 = iCm3.A0N;
            Context context = jnq2.getContext();
            if (view != null) {
                jnq = view instanceof TextureView ? new Ieh(view, jnq2) : new Ieg(view, jnq2);
            } else {
                ?? obj2 = new Object();
                ((RtX) obj2).A02 = context;
                ((RtX) obj2).A01 = jnq2.getWidth();
                ((RtX) obj2).A00 = jnq2.getHeight();
                jnq = obj2;
            }
            HJc hJc = iCm3.A0P;
            String str = iCm3.A0D;
            H9N h9n = iCm3.A0K;
            int i2 = 1;
            if (i == 1) {
                i2 = 0;
            }
            iCm2 = new ICm(context, h9n, iCm3.A05, iCm3.A06, jnq, hJc, iCm3.A0Q, str, i2, iCm3.A0F, true);
            iCm3.A0C = iCm2;
            Object obj3 = iCm3.A08;
            if (obj3 == null) {
                obj3 = new Object();
            }
            iCm2.A08(obj3);
            iCm2.A07 = (JOV) ICm.A00(iCm3).AUY(JOV.A0T);
            ide.A04 = iCm2;
            iCm2.A0N.Cvi(false);
        }
        if (this.A00 == 1) {
            iCm = ide.A0D;
            jgd = ide.A0A;
            jgd2 = ide.A09;
        } else {
            iCm = iCm2;
            jgd = ide.A09;
            iCm2 = ide.A0D;
            jgd2 = ide.A0A;
        }
        GuV guV = new GuV(this, 20);
        ID3.A01("ConcurrentFrontBackController", "Opening concurrent cameras");
        iCm.A0M.CVp(new Guc(jgd, jgd2, guV, iCm, iCm2, ide), ide.A0F, 1);
    }
}
