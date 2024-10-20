package X;

import com.meta.flytrap.attachment.model.AttachmentCounter;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import java.nio.ByteBuffer;

/* loaded from: Ff1.class */
public final class Ff1 implements GHo {
    public static final Ff1 A01 = new Ff1();
    public final 5Yj A00 = 5Yp.A00(GBN.A00, 5Yj.A03);

    @Override // X.GHo
    public /* bridge */ /* synthetic */ int ATH(FI4 fi4, Object obj) {
        int A06 = fi4.A06(this.A00.A01(obj, AttachmentCounter.Companion.serializer((5Yu) BugReportAttachmentMediaSource.A00.getValue())));
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
        return this.A00.A00(A03, KZ3.A00(AttachmentCounter.Companion.serializer((5Yu) BugReportAttachmentMediaSource.A00.getValue())));
    }
}
