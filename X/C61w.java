package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Locale;

/* renamed from: X.61w, reason: invalid class name */
/* loaded from: 61w.class */
public final class C61w implements C61x {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;

    public C61w(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A00 = fbUserSession;
        this.A02 = 1Bq.A00(16504);
        this.A01 = 1Bu.A00(68348);
        this.A03 = 1Bq.A00(16822);
    }

    @Override // X.C61x
    public boolean AXS(Message message, Capabilities capabilities) {
        ThreadKey threadKey;
        if (message.A1V == null || 1JF.A0B(message.A0F().A00) || C1q7.A0p(message) || ((C1q7) this.A03.A00.get()).A0w(message)) {
            return false;
        }
        C00i c00i = this.A01.A00;
        if (((C5jj) c00i.get()).A00().contains(BKI())) {
            return false;
        }
        ParticipantInfo participantInfo = message.A0K;
        if (11T.A0O(participantInfo != null ? participantInfo.A00() : null, this.A00.A02) || (threadKey = message.A0V) == null) {
            return false;
        }
        if ((!threadKey.A18() && !threadKey.A15()) || !capabilities.A00.get(196)) {
            return false;
        }
        C5jj c5jj = (C5jj) c00i.get();
        return c5jj.A01() && ((2yD) c5jj.A00.A00.get()).AZr(1GD.A05, 36325003733782784L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (AXS(r302, r303) == false) goto L8;
     */
    @Override // X.C61x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AxE(com.facebook.messaging.model.messages.Message r302, com.facebook.xapp.messaging.capability.vector.Capabilities r303, boolean r304) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = 2
            r305 = r0
            r0 = r303
            r1 = r305
            X.11T.A0F(r0, r1)
            r0 = r304
            if (r0 == 0) goto L2e
            r0 = r301
            r1 = r302
            boolean r0 = r0.BNj(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2e
            r0 = r301
            r1 = r302
            r2 = r303
            boolean r0 = r0.AXS(r1, r2)
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 != 0) goto L31
        L2e:
            r0 = 0
            r305 = r0
        L31:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61w.AxE(com.facebook.messaging.model.messages.Message, com.facebook.xapp.messaging.capability.vector.Capabilities, boolean):boolean");
    }

    @Override // X.C61x
    public String BKI() {
        Locale A05 = ((1GS) this.A02.A00.get()).A05();
        11T.A0A(A05);
        String obj = A05.toString();
        11T.A0A(obj);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0075, code lost:
    
        if (r0.equals(((X.1GS) r0.get()).A07(X.02E.A00(r0))) == false) goto L8;
     */
    @Override // X.C61x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BNj(com.facebook.messaging.model.messages.Message r302) {
        /*
            r301 = this;
            r0 = r302
            java.lang.String r0 = r0.A1p
            r303 = r0
            r0 = r302
            com.facebook.secure.secrettypes.SecretString r0 = r0.A0G()
            java.lang.String r0 = r0.A00
            r304 = r0
            r0 = r304
            boolean r0 = X.1JF.A0A(r0)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L78
            r0 = r303
            if (r0 == 0) goto L78
            r0 = r301
            X.1Br r0 = r0.A02
            X.00i r0 = r0.A00
            r306 = r0
            r0 = r306
            java.lang.Object r0 = r0.get()
            X.1GS r0 = (X.1GS) r0
            r307 = r0
            r0 = r306
            java.lang.Object r0 = r0.get()
            X.1GS r0 = (X.1GS) r0
            java.util.Locale r0 = r0.A05()
            r304 = r0
            r0 = r304
            X.11T.A0A(r0)
            r0 = r307
            r1 = r304
            java.util.Locale r0 = r0.A07(r1)
            r308 = r0
            r0 = r308
            X.11T.A0A(r0)
            r0 = r306
            java.lang.Object r0 = r0.get()
            X.1GS r0 = (X.1GS) r0
            r307 = r0
            r0 = r303
            java.util.Locale r0 = X.02E.A00(r0)
            r304 = r0
            r0 = r307
            r1 = r304
            java.util.Locale r0 = r0.A07(r1)
            r304 = r0
            r0 = r308
            r1 = r304
            boolean r0 = r0.equals(r1)
            r309 = r0
            r0 = 1
            r305 = r0
            r0 = r309
            if (r0 != 0) goto L7d
        L78:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L7d:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61w.BNj(com.facebook.messaging.model.messages.Message):boolean");
    }

    @Override // X.C61x
    public boolean CWj(Message message, 2Sh r303) {
        C61n c61n;
        return (r303 == null || (c61n = (C61n) r303.A01((String) null, C61n.class)) == null || !c61n.A00(message.A1V)) ? false : true;
    }
}
