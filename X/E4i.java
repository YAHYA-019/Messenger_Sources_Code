package X;

import android.content.Context;
import android.content.ServiceConnection;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: E4i.class */
public final class E4i extends Ezw {
    public final Context A00;
    public final ServiceConnection A01;
    public final F3I A02;
    public final RGW A03;
    public final ROv A04;
    public final GJQ A05;
    public final AtomicReference A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E4i(Context context, ROv rOv) {
        super(context, rOv, "digital_turbine_store");
        String packageName = context.getPackageName();
        11T.A0A(packageName);
        GFL gfl = rOv.A03;
        F3I f3i = F3I.A00;
        QQH qqh = new QQH(f3i, gfl, packageName);
        11T.A0F(f3i, 4);
        this.A00 = context;
        this.A04 = rOv;
        this.A05 = qqh;
        this.A02 = f3i;
        super.A00 = 0;
        this.A03 = new RGW(this);
        this.A06 = new AtomicReference();
        this.A01 = new Riy(this);
    }

    public static final void A00(E4i e4i) {
        e4i.A02(Qom.A04, QpZ.A06, "FAILED_INSTALL", EQg.A04.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6 A[Catch: SecurityException -> 0x00c6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x00c6, blocks: (B:3:0x000d, B:4:0x0012, B:6:0x001c, B:7:0x0023, B:9:0x002c, B:10:0x0032, B:12:0x0039, B:15:0x0043, B:16:0x0049, B:19:0x0052, B:22:0x005b, B:25:0x0064, B:27:0x006c, B:29:0x0073, B:31:0x007c, B:33:0x0088, B:35:0x0093, B:38:0x00a6, B:40:0x00ab, B:42:0x00b0, B:43:0x00b5, B:45:0x00bb, B:47:0x00c0), top: B:2:0x000d }] */
    @Override // X.Ezw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A07() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E4i.A07():boolean");
    }
}
