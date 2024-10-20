package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import java.util.concurrent.TimeUnit;

/* renamed from: X.66p, reason: invalid class name */
/* loaded from: 66p.class */
public final class C66p implements CallerContextable {
    public static final String __redex_internal_original_name = "ImageUriRequestManager";
    public 1BY A00;
    public final C1ko A03;
    public final C00i A02 = new 1BV((1BY) null, 83719);
    public final C00i A01 = new 1BQ(16458);
    public final C00i A04 = new 1BQ(16385);

    public C66p(1BO r302) {
        this.A00 = new 1BY(r302);
        C1k8 c1k8 = new C1k8();
        c1k8.A05(C1Ur.A00((1CO) r0.get(), 36, 36591931656044740L), TimeUnit.HOURS);
        this.A03 = c1k8.A02();
    }

    public 2FT A00(CallerContext callerContext, String str, String str2, int i) {
        String str3;
        if (callerContext == null) {
            str3 = null;
        } else {
            str3 = callerContext.A04;
            if (str3 == null) {
                str3 = "unknown";
            }
        }
        CallerContext A0A = CallerContext.A0A(C66p.class, "download_image_info", str3);
        C30G c30g = new C30G(63);
        c30g.A03("fbid", str);
        c30g.A06("img_size", i);
        c30g.A03("media_type", str2);
        C3sa A00 = C3sa.A00(c30g);
        A00.A01 = A0A;
        4YU.A1J(A00, 1031146860621337L);
        Context A04 = 1BK.A04(this.A02);
        C00s.A00();
        1Vd A0D = 1VX.A0D(A04);
        4YU.A1J(A00, 1031146860621337L);
        return 2FP.A01(new ABa(this, 1), A0D.A09(A00));
    }
}
