package X;

import com.facebook.common.callercontext.CallerContextable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cba.class */
public final class Cba implements CallerContextable {
    public static final AtomicInteger A06 = new AtomicInteger(0);
    public static final String __redex_internal_original_name = "MessagesContextThreadLoader";
    public 1BY A00;
    public final C00i A02 = 1BV.A01((1BY) null, 33031);
    public final C00i A01 = AbH.A0G();
    public final C00i A04 = 1BV.A01((1BY) null, 148139);
    public final C00i A03 = 1BQ.A02(85048);
    public final C00i A05 = AbH.A0M();

    public Cba(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r304 > 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.2eH A00(com.facebook.messaging.model.threadkey.ThreadKey r301, X.Cba r302, java.lang.String r303, long r304) {
        /*
            android.os.Bundle r0 = X.1BK.A05()
            r306 = r0
            r0 = r303
            boolean r0 = X.1JF.A0B(r0)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L24
            r0 = 0
            r308 = r0
            r0 = r304
            r1 = r308
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r310 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r311 = r0
            r0 = r310
            if (r0 <= 0) goto L27
        L24:
            r0 = 1
            r307 = r0
        L27:
            r0 = r307
            com.google.common.base.Preconditions.checkArgument(r0)
            com.facebook.messaging.service.model.FetchMessagesContextParams r0 = new com.facebook.messaging.service.model.FetchMessagesContextParams
            r312 = r0
            r0 = r312
            r1 = r301
            r2 = r303
            r3 = r304
            r0.<init>(r1, r2, r3)
            r0 = 412(0x19c, float:5.77E-43)
            java.lang.String r0 = X.1BJ.A00(r0)
            r311 = r0
            r0 = r306
            r1 = r311
            r2 = r312
            r0.putParcelable(r1, r2)
            r0 = r302
            X.00i r0 = r0.A02
            com.facebook.fbservice.ops.BlueServiceOperationFactory r0 = X.4YU.A0L(r0)
            r313 = r0
            java.lang.Class<X.Cba> r0 = X.Cba.class
            com.facebook.common.callercontext.CallerContext r0 = com.facebook.common.callercontext.CallerContext.A06(r0)
            r314 = r0
            r0 = 1304(0x518, float:1.827E-42)
            java.lang.String r0 = X.1BJ.A00(r0)
            r312 = r0
            r0 = r306
            r1 = r314
            r2 = r313
            r3 = r312
            r4 = 1
            X.1IB r0 = X.4YU.A0M(r0, r1, r2, r3, r4)
            r312 = r0
            X.D3h r0 = new X.D3h
            r306 = r0
            r0 = r306
            r1 = r301
            r2 = r302
            r3 = r303
            r4 = r304
            r0.<init>(r1, r2, r3, r4)
            r0 = r302
            X.00i r0 = r0.A01
            r1 = r306
            r2 = r312
            X.2eH r0 = X.4YV.A0b(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cba.A00(com.facebook.messaging.model.threadkey.ThreadKey, X.Cba, java.lang.String, long):X.2eH");
    }
}
