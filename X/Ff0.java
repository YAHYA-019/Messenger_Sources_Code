package X;

import android.os.Parcelable;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import java.nio.ByteBuffer;

/* loaded from: Ff0.class */
public final class Ff0 implements GHo {
    public static final Ff0 A01 = new Ff0();
    public final 5Yj A00 = 5Yp.A00(GBM.A00, 5Yj.A03);

    @Override // X.GHo
    public /* bridge */ /* synthetic */ int ATH(FI4 fi4, Object obj) {
        5Yj r0 = this.A00;
        Parcelable.Creator creator = BugReportAttachment.CREATOR;
        int A06 = fi4.A06(r0.A01(obj, Lvu.A00));
        fi4.A09(1);
        fi4.A0A(0, A06);
        return fi4.A04();
    }

    @Override // X.GHo
    public /* bridge */ /* synthetic */ Object BP4(ByteBuffer byteBuffer, int i) {
        String A03 = FIY.A03(byteBuffer, i, 0);
        if (A03 == null) {
            return null;
        }
        5Yj r0 = this.A00;
        Parcelable.Creator creator = BugReportAttachment.CREATOR;
        return r0.A00(A03, KZ3.A00(Lvu.A00));
    }
}
