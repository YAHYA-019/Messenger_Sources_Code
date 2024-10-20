package X;

import android.net.Uri;
import com.facebook.xapp.messaging.threadview.model.video.VideoAttachment;

/* renamed from: X.5lq, reason: invalid class name */
/* loaded from: 5lq.class */
public final class C5lq implements C5lk {
    public static final C5lq A00 = new Object();

    @Override // X.C5lk
    public /* bridge */ /* synthetic */ C5fq A4s(C5pu c5pu, 4lD r303, C5to c5to, int i) {
        Integer nullableInteger;
        11T.A0F(r303, 0);
        1qX r0 = (1qX) r303;
        if (r0.mResultSet.getString(i, 57) == null || (nullableInteger = r0.mResultSet.getNullableInteger(i, 41)) == null || nullableInteger.intValue() != 2 || r0.mResultSet.getString(i, 48) == null) {
            return null;
        }
        C5w8 c5w8 = new C5w8();
        Uri A02 = ((5wX) 1Bi.A03(67176)).A02(r303, i);
        if (A02 == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        6AF r02 = new 6AF();
        String string = r0.mResultSet.getString(i, 57);
        if (string == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        r02.A01(string);
        r02.A0C = A02;
        Integer nullableInteger2 = r0.mResultSet.getNullableInteger(i, 47);
        if (nullableInteger2 == null) {
            nullableInteger2 = -1;
        }
        r02.A06 = nullableInteger2.intValue();
        Integer nullableInteger3 = r0.mResultSet.getNullableInteger(i, 46);
        if (nullableInteger3 == null) {
            nullableInteger3 = -1;
        }
        r02.A03 = nullableInteger3.intValue();
        r02.A0D = C48g.VIDEO_ATTACHMENT;
        c5w8.A00 = new VideoAttachment(r02);
        return c5w8;
    }
}
