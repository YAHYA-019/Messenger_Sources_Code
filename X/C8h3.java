package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import java.io.File;
import java.net.URI;

/* renamed from: X.8h3, reason: invalid class name */
/* loaded from: 8h3.class */
public final class C8h3 extends 1LH {
    public static final CallerContext A07 = CallerContext.A0B("ExternalShareThumbnailComponent");
    public static final C06974ih A08;
    public final 1Im A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Uri A05;
    public final Integer A06;

    static {
        C07004ik A00 = C06984ii.A00();
        ((C07014il) A00).A04 = 5BJ.A01(25.0f, 0.0f, 0.0f, 25.0f);
        A00.A03(2132345116);
        A08 = 7zL.A0L(A00);
    }

    public C8h3(Uri uri, 1Im r303, Integer num, int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A04 = i2;
        this.A05 = uri;
        this.A06 = num;
        this.A00 = r303;
        this.A01 = i3;
        this.A02 = i4;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1BQ A00 = 1BQ.A00();
        Integer num = this.A06;
        if (num == 0S2.A0C && ((2yD) A00.get()).AZk(36324737445744644L)) {
            2lQ r0 = 2lO.A02;
            long A09 = 7zQ.A09();
            2lO A0O = 7zT.A0O(4YV.A0K(4YV.A0K((2lO) null, 0S2.A01, A09), 0S2.A00, A09), 18.0d);
            C2sn A0L = 7zR.A0L(c2k5);
            7DF A002 = 7DD.A00(A0L.A00);
            A002.A2W(36.0f);
            A002.A01.A00 = -12303292;
            A002.A0J();
            return 7zM.A0k(A002.A01, A0L, c2k5, A0O);
        }
        Integer num2 = 0S2.A01;
        if (num == num2 && ((2yD) A00.get()).AZk(36324737445744644L)) {
            Drawable A082 = 4YV.A0I().A08(C1u3.A2S, this.A04);
            2lQ r02 = 2lO.A02;
            long A092 = 7zQ.A09();
            return 7zT.A0m(A082, c2k5.A05, 7zR.A0R(7zT.A0O(4YV.A0K(4YV.A0K((2lO) null, num2, A092), 0S2.A00, A092), 18.0d), AVF.A01(this, 25), 1));
        }
        Uri uri = this.A05;
        long length = uri == null ? 0L : new File(new URI(uri.toString())).length();
        5BH A0B = 7zN.A0B(uri, c2k5.A05);
        A0B.A0C(length < ((long) 100) ? 0 : this.A01);
        A0B.A1L(this.A02);
        A0B.A2P(true);
        A0B.A2b(A07);
        A0B.A2Z(A08);
        A0B.A1H(this.A03);
        return 7zL.A0K(A0B);
    }
}
