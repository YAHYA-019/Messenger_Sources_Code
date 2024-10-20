package X;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: G5q.class */
public final class G5q implements Runnable {
    public static final String __redex_internal_original_name = "QPLDataNavigationLogger$4";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 5TY A03;
    public final /* synthetic */ C06474gz A04;

    public G5q(5TY r302, C06474gz c06474gz, int i, int i2, long j) {
        this.A04 = c06474gz;
        this.A03 = r302;
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        5TY r0 = this.A03;
        int A00 = C06474gz.A00(r0);
        String A04 = r0.A04();
        C06474gz c06474gz = this.A04;
        C00i c00i = c06474gz.A07;
        DKC.A0c(c00i).markerAnnotate(25821186, A00, "data_cleanup", "data_cleanup");
        DKC.A0c(c00i).markerEnd(25821186, A00, (short) 4, this.A02, TimeUnit.MILLISECONDS);
        ((C6ur) c06474gz.A06.get()).A00.remove(A04);
        Iterator it = c06474gz.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC06484h1) it.next()).BsX(r0, this.A01, this.A00);
        }
    }
}
