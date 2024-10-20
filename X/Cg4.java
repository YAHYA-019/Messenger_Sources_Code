package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.service.model.AddAdminsToGroupParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cg4.class */
public final class Cg4 implements 1Ro {
    public static final String __redex_internal_original_name = "AddAdminsToGroupMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        AddAdminsToGroupParams addAdminsToGroupParams = (AddAdminsToGroupParams) obj;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("t_%d/admins", 4YU.A0l(addAdminsToGroupParams.A00));
        ArrayList A0s = AnonymousClass001.A0s();
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = addAdminsToGroupParams.A01.iterator();
        while (it.hasNext()) {
            AbK.A1Q(builder, it);
        }
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("admin_ids", builder.build().toString()), A0s);
        AbF.A1Q(A0C, "addAdminsToGroup");
        return AbN.A0D(A0C, formatStrLocaleSafe, A0s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r0.A0O() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object B7m(X.AnonymousClass439 r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r302
            X.24X r0 = X.AbH.A0w(r0)
            r304 = r0
            java.lang.String r0 = "success"
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.A0Z(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L33
            r0 = r304
            r1 = r305
            X.24X r0 = r0.A0D(r1)
            r307 = r0
            r0 = r307
            java.lang.Class r0 = r0.getClass()
            r0 = r307
            boolean r0 = r0.A0O()
            r306 = r0
            r0 = 1
            r308 = r0
            r0 = r306
            if (r0 != 0) goto L39
        L33:
            r0 = 0
            r308 = r0
            r0 = 0
            r305 = r0
        L39:
            com.facebook.messaging.service.model.AddAdminsToGroupResult r0 = new com.facebook.messaging.service.model.AddAdminsToGroupResult
            r307 = r0
            r0 = r307
            r1 = r308
            r0.<init>(r1)
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cg4.B7m(X.439, java.lang.Object):java.lang.Object");
    }
}
