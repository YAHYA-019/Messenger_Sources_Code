package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.4kg, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4kg.class */
public final class C07704kg extends AbstractC07494k1 implements InterfaceC07554k7 {
    public static final AnonymousClass207 A0H;
    public 6mO A00;
    public 6mL A01;
    public boolean A02;
    public boolean A03;
    public final FbUserSession A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final ThreadKey A0E;
    public volatile boolean A0G;
    public final 1Br A0D = 1Bq.A00(66693);
    public final 1Br A09 = 1Bq.A00(66295);
    public final 1HN A0F = new A1t(this, 2);

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A0H = new AnonymousClass207(6Ku.class, "ProactiveWarningOpenMessagingDataSource");
    }

    public C07704kg(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A0E = threadKey;
        this.A04 = fbUserSession;
        this.A06 = 1Bu.A01(context, 16979);
        this.A0C = 1Bu.A01(context, 85013);
        this.A08 = 1Lm.A00(context, fbUserSession, 68478);
        this.A0A = 1Bu.A01(context, 82763);
        this.A05 = 1Bu.A01(context, 67894);
        this.A0B = 1Bu.A01(context, 68480);
        this.A07 = 1Bu.A01(context, 68479);
    }

    public static final void A00(C07704kg c07704kg) {
        synchronized (c07704kg) {
            87D r0 = (87D) c07704kg.A0B.A00.get();
            if (r0.A00 != null) {
                r0.A00 = null;
                ((C2j0) r0.A01.A00.get()).A03(r0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x005c, code lost:
    
        if (r0.A02(r0, r0, 1) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(X.C07704kg r301, com.facebook.messaging.model.threadkey.ThreadKey r302) {
        /*
            r0 = r301
            X.1Br r0 = r0.A0C
            X.00i r0 = r0.A00
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.6QI r0 = (X.6QI) r0
            r304 = r0
            r0 = r302
            java.lang.String r0 = r0.A0u()
            r305 = r0
            r0 = r305
            X.11T.A0A(r0)
            r0 = r301
            com.facebook.auth.usersession.FbUserSession r0 = r0.A04
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r304
            r1 = r306
            r2 = r305
            r3 = 0
            boolean r0 = r0.A02(r1, r2, r3)
            r308 = r0
            r0 = 1
            r309 = r0
            r0 = r308
            if (r0 != 0) goto L5f
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.6QI r0 = (X.6QI) r0
            r304 = r0
            r0 = r302
            java.lang.String r0 = r0.A0u()
            r305 = r0
            r0 = r305
            X.11T.A0A(r0)
            r0 = r304
            r1 = r306
            r2 = r305
            r3 = r309
            boolean r0 = r0.A02(r1, r2, r3)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L62
        L5f:
            r0 = 1
            r307 = r0
        L62:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07704kg.A01(X.4kg, com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    @Override // X.InterfaceC07554k7
    public AnonymousClass207 Asi() {
        return A0H;
    }

    @Override // X.InterfaceC07544k6
    public void Cgt(int i) {
        if (i != 1) {
            5Vk.A01(C2sa.A00, CallerContext.A0B("OpFetchThreadSummary"), (5Vk) this.A0A.A00.get(), this.A0E, true, false).A02(new 7Vg(this));
        }
    }
}
