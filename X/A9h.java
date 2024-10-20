package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;

/* loaded from: A9h.class */
public final class A9h implements 62A {
    public final 1Br A00;
    public final 1Br A01;
    public final 1BP A02;

    public A9h(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A02 = FbInjector.A00;
        this.A00 = 1Lm.A00(7zL.A09(), fbUserSession, 65958);
        this.A01 = 1Bu.A00(67778);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b7, code lost:
    
        if (r307.equals(r305.textSize) == false) goto L17;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.5fq, X.5qu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ X.C5fq A4n(com.facebook.messaging.model.messages.Message r302) {
        /*
            r301 = this;
            X.5qu r0 = new X.5qu
            r303 = r0
            r0 = r303
            r0.<init>()
            r0 = r302
            java.lang.String r0 = X.4YU.A0x(r0)
            r304 = r0
            r0 = r303
            r1 = r304
            r0.A02 = r1
            r0 = r302
            com.google.common.collect.ImmutableMap r0 = r0.A13
            r305 = r0
            r0 = 356(0x164, float:4.99E-43)
            r306 = r0
            r0 = r306
            java.lang.String r0 = X.4YT.A00(r0)
            r304 = r0
            r0 = r305
            r1 = r304
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L3f
            r0 = r307
            int r0 = r0.length()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L4d
        L3f:
            java.lang.String r0 = "emoji_like"
            r304 = r0
            r0 = r305
            r1 = r304
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r307 = r0
        L4d:
            r0 = r301
            X.1Br r0 = r0.A01
            r304 = r0
            r0 = r304
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.5uJ r0 = (X.5uJ) r0
            r308 = r0
            r0 = 0
            r309 = r0
            r0 = 0
            r305 = r0
            r0 = r307
            if (r0 == 0) goto Lc7
            r0 = r307
            int r0 = r0.length()
            r306 = r0
            r0 = r306
            if (r0 <= 0) goto Lc7
            X.5wF r0 = X.5wF.A04
            r310 = r0
            r0 = r310
            java.lang.String r0 = r0.textSize
            r304 = r0
            r0 = r307
            r1 = r304
            boolean r0 = r0.equals(r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto Lba
            X.5wF r0 = X.5wF.A03
            r305 = r0
            r0 = r305
            java.lang.String r0 = r0.textSize
            r304 = r0
            r0 = r307
            r1 = r304
            boolean r0 = r0.equals(r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto Lbe
            X.5wF r0 = X.5wF.A02
            r305 = r0
            r0 = r305
            java.lang.String r0 = r0.textSize
            r304 = r0
            r0 = r307
            r1 = r304
            boolean r0 = r0.equals(r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto Lbe
        Lba:
            r0 = r310
            r305 = r0
        Lbe:
            r0 = r308
            r1 = r305
            int r0 = r0.A00(r1)
            r309 = r0
        Lc7:
            r0 = r303
            r1 = r309
            r0.A00 = r1
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A9h.A4n(com.facebook.messaging.model.messages.Message):X.5fq");
    }

    public boolean BQi(Message message) {
        String A0x;
        C00i c00i = this.A00.A00;
        c00i.get();
        C1q8 A04 = message.A04();
        if ((A04 != C1q8.A0M && A04 != C1q8.A0N && A04 != C1q8.A0A) || (A0x = 4YU.A0x(message)) == null || A0x.length() == 0) {
            return false;
        }
        c00i.get();
        ParticipantInfo participantInfo = message.A0K;
        return (participantInfo == null || participantInfo.A00() == null) ? false : true;
    }
}
