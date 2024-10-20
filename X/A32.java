package X;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: A32.class */
public final class A32 implements AZg {
    public final ACB A00;
    public final FFj A01;
    public final WeakHashMap A02 = new WeakHashMap();

    public A32(ACB acb, FFj fFj) {
        this.A01 = fFj;
        this.A00 = acb;
    }

    @Override // X.AZg
    public /* bridge */ /* synthetic */ void Ccd(View view, Object obj) {
        91F r0 = (91F) obj;
        11T.A0F(r0, 1);
        WeakHashMap weakHashMap = this.A02;
        8Ke r02 = r0.A00;
        FFD ffd = (FFD) weakHashMap.get(r02.A00());
        if (ffd == null) {
            if (r02.A00() != null) {
                String A00 = r02.A00();
                FFD ffd2 = FFD.A05;
                ACB acb = this.A00;
                ArrayList A0s = AnonymousClass001.A0s();
                A0s.add(acb);
                ffd = new FFD(ffd2, r02, (Object) null, A00, A0s);
            } else {
                ffd = FFD.A05;
            }
            11T.A0D(ffd);
            weakHashMap.put(r02.A00(), ffd);
        }
        this.A01.A03(view, ffd);
    }

    @Override // X.AZg
    public void D69(View view) {
        this.A01.A02(view);
    }
}
