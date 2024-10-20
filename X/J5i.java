package X;

import android.content.Context;
import com.facebook.video.exoserviceclient.FbVpsController;

/* loaded from: J5i.class */
public final class J5i implements C15h {
    public final int A00;
    public final Object A01;

    public J5i(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.5L3] */
    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        int i;
        switch (this.A00) {
            case 0:
                return C03653yo.A00((Context) this.A01);
            case 1:
                return new HZy((Context) this.A01);
            case 2:
                return new Hlk((Context) this.A01);
            case 3:
                i = 16879;
                return 1Bn.A0A(i);
            case 4:
                i = 99943;
                return 1Bn.A0A(i);
            case 5:
                5L2 r0 = (5L2) 1Br.A0B(((FbVpsController) this.A01).A0I);
                ?? obj = new Object();
                ((5L3) obj).A00 = r0;
                return obj;
            default:
                i = 33097;
                if (1Br.A07(((6V6) this.A01).A0D).AZk(36310675734528924L)) {
                    i = 33096;
                }
                return 1Bn.A0A(i);
        }
    }
}
