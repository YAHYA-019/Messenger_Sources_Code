package X;

import com.facebook.common.callercontext.CallerContext;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: In3.class */
public final class In3 implements 2fS {
    public final /* synthetic */ CallerContext A00;
    public final /* synthetic */ 2Dp A01;
    public final /* synthetic */ C66Y A02;
    public final /* synthetic */ 66X A03;
    public final /* synthetic */ String A04;

    public In3(CallerContext callerContext, 2Dp r303, C66Y c66y, 66X r305, String str) {
        this.A03 = r305;
        this.A01 = r303;
        this.A00 = callerContext;
        this.A02 = c66y;
        this.A04 = str;
    }

    public ListenableFuture ADN() {
        66X r0 = this.A03;
        2Dp r02 = this.A01;
        CallerContext callerContext = this.A00;
        C66Y c66y = this.A02;
        String str = this.A04;
        2IA A02 = 2IA.A02(r02);
        A02.A0B = C2r8.DISK_CACHE;
        1OW A0B = ((2Ff) c66y.A00.A01.get()).A0B(A02.A04(), callerContext);
        HhO hhO = new HhO(callerContext, r02, c66y, r0, str);
        H7K h7k = new H7K(A0B);
        A0B.D3K(new IQw(h7k, hhO), 1JU.A01);
        return h7k;
    }
}
