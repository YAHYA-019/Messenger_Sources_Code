package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.CancellationException;

/* loaded from: ABl.class */
public final class ABl implements 1K9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 9kV A01;
    public final /* synthetic */ String A02;

    public ABl(9kV r302, String str, int i) {
        this.A01 = r302;
        this.A00 = i;
        this.A02 = str;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        QuickPerformanceLogger A0e = 7zP.A0e(this.A01.A02);
        int i = this.A00;
        int hashCode = this.A02.hashCode();
        short s = 87;
        if (th instanceof CancellationException) {
            s = 4;
        }
        A0e.markerEnd(i, hashCode, s);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C2636Gjo c2636Gjo = (C2636Gjo) obj;
        if (c2636Gjo != null) {
            Object obj2 = c2636Gjo.A01;
            1Br r0 = this.A01.A02;
            if (obj2 == null) {
                7zP.A0e(r0).markerEnd(this.A00, this.A02.hashCode(), (short) 2);
                return;
            }
            C00i c00i = r0.A00;
            QuickPerformanceLogger A0V = 1BK.A0V(c00i);
            int i = this.A00;
            int hashCode = this.A02.hashCode();
            A0V.markerPoint(i, hashCode, obj2.toString(), c2636Gjo.A03);
            1BK.A0V(c00i).markerEnd(i, hashCode, (short) 87);
        }
    }
}
