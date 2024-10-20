package X;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: G5p.class */
public final class G5p implements Runnable {
    public static final String __redex_internal_original_name = "QPLDataNavigationLogger$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 5TY A03;
    public final /* synthetic */ C06474gz A04;

    public G5p(5TY r302, C06474gz c06474gz, int i, long j, long j2) {
        this.A04 = c06474gz;
        this.A03 = r302;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        5TY r0 = this.A03;
        int A00 = C06474gz.A00(r0);
        String str = r0.A03;
        C06474gz c06474gz = this.A04;
        DKC.A0c(c06474gz.A07).markerStart(25821186, A00, "PROPS_NAME", str, this.A02, TimeUnit.MILLISECONDS);
        C06474gz.A03(c06474gz, "prepareForNavigation", A00, this.A01);
        Iterator it = c06474gz.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC06484h1) it.next()).CMo(r0, this.A00);
        }
    }
}
