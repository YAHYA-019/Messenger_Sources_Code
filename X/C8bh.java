package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.8bh, reason: invalid class name */
/* loaded from: 8bh.class */
public final class C8bh extends 1LH {
    public final C06974ih A02;
    public final String A03;
    public final String A04;
    public final float A00 = 200.0f;
    public final String A05 = "profile_picture_preview";
    public final CallerContext A01 = CallerContext.A0B("ConfirmProfilePictureComponent");

    public C8bh(String str, String str2) {
        this.A04 = str;
        this.A03 = str2;
        C07004ik A0J = 7zR.A0J();
        A0J.A0J = true;
        this.A02 = 7zL.A0L(A0J);
    }

    /* JADX WARN: Type inference failed for: r0v53, types: [X.0w6, java.lang.Object] */
    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        String str = this.A04;
        if (str == null || str.length() == 0) {
            8TN A00 = C8m2.A00(c2k5.A05);
            A00.A2a(95U.A02);
            C9gg.A00(C9hj.A04, A00, 0);
            A00.A0L();
            float f = this.A00;
            A00.A0z(f);
            A00.A0l(f);
            return A00.A2W();
        }
        C1ro c1ro = C1ro.CENTER;
        2lQ r0 = 2lO.A02;
        float f2 = this.A00;
        long A07 = 7zL.A07(f2);
        Integer num = 0S2.A0N;
        5BG r307 = null;
        2lO A0L = 4YV.A0L(4YV.A0K(4YV.A0K((2lO) null, num, A07), 0S2.A0j, A07), 0S2.A1G, new AeI(this, 3), 1);
        String str2 = this.A03;
        if (str2 != null) {
            A0L = 7zR.A0Q(A0L, num, str2);
        }
        2lO A0L2 = 4YV.A0L(A0L, 0S2.A0D, this.A05, 1);
        C2sn A0L3 = 7zR.A0L(c2k5);
        Uri A002 = C0A2.A00(new Object(), str);
        if (A002 != null) {
            5BH A01 = 5BG.A01(A0L3.A00);
            A01.A1y(c1ro);
            A01.A0p(f2);
            A01.A0n(f2);
            A01.A0V();
            A01.A2Z(this.A02);
            A01.A2X(A002);
            r307 = 7zO.A0P(A01, this.A01);
        }
        A0L3.A00(r307);
        return C2so.A0J(A0L3, c2k5, A0L2);
    }
}
