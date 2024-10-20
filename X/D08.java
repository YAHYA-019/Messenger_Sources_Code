package X;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: D08.class */
public final class D08 implements AZg {
    public final D4s A00;
    public final FFj A01;
    public final WeakHashMap A02 = new WeakHashMap();

    public D08(D4s d4s, FFj fFj) {
        this.A01 = fFj;
        this.A00 = d4s;
    }

    @Override // X.AZg
    public /* bridge */ /* synthetic */ void Ccd(View view, Object obj) {
        BHf bHf = (BHf) obj;
        11T.A0F(bHf, 1);
        WeakHashMap weakHashMap = this.A02;
        CNS cns = bHf.A00;
        FFD ffd = (FFD) weakHashMap.get(BWb.A00(cns));
        if (ffd == null) {
            if (cns == null || BWb.A00(cns) == null) {
                ffd = FFD.A05;
            } else {
                String A00 = BWb.A00(cns);
                FFD ffd2 = FFD.A05;
                D4s d4s = this.A00;
                ArrayList A0s = AnonymousClass001.A0s();
                A0s.add(d4s);
                ffd = new FFD(ffd2, cns, (Object) null, A00, A0s);
            }
            11T.A0D(ffd);
            weakHashMap.put(BWb.A00(cns), ffd);
        }
        this.A01.A03(view, ffd);
    }

    @Override // X.AZg
    public void D69(View view) {
        this.A01.A02(view);
    }
}
