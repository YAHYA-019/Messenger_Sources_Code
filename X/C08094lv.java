package X;

import java.util.Random;

/* renamed from: X.4lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4lv.class */
public final class C08094lv implements 0Kr {
    public C04s A00;
    public AnonymousClass046 A01;

    public void CgV(String str, String str2, String str3, int i) {
        AnonymousClass047 ACu = this.A01.ACu("content_resolver", 817892585);
        if (ACu.isSampled()) {
            ACu.A8K("operation", str);
            ACu.A8K("authority", str2);
            ACu.A8I("callsite_id", i);
            ACu.Cmr(new Exception(str3));
            ACu.report();
        }
        1Wz r0 = this.A00;
        if (r0 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("xapp comm to authority '");
            sb.append(str2);
            sb.append("', callID=");
            sb.append(i);
            sb.append(", operation=");
            sb.append(str);
            String A0W = 0Pz.A0W("Callback.onContentResolver\n", sb.toString());
            String num = Integer.toString(i);
            1Wz r02 = r0;
            11T.A0F(A0W, 2);
            if (((2yD) r02.A01.A00.get()).Ai7(37160220254273938L) >= new Random().nextDouble()) {
                3tP.A00((04J) r02.A00.A00.get(), "casd", "XAppCommunicationDetector", A0W, num);
            }
        }
    }
}
