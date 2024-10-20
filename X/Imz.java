package X;

import com.google.common.base.Predicate;

/* loaded from: Imz.class */
public final class Imz implements Predicate {
    public final int A00;
    public final Object A01;

    public Imz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        if (((X.1Mu) r301.A01).AHm(r0.getKey(), r0.getValue()) != false) goto L8;
     */
    @Override // com.google.common.base.Predicate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ boolean apply(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r303
            switch(r0) {
                case 0: goto L5f;
                case 1: goto L57;
                default: goto L1c;
            }
        L1c:
            r0 = r302
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L50
            r0 = r301
            java.lang.Object r0 = r0.A01
            X.1Mu r0 = (X.1Mu) r0
            r304 = r0
            r0 = r302
            java.lang.Object r0 = r0.getKey()
            r305 = r0
            r0 = r302
            java.lang.Object r0 = r0.getValue()
            r306 = r0
            r0 = r304
            r1 = r305
            r2 = r306
            boolean r0 = r0.AHm(r1, r2)
            r307 = r0
            r0 = 1
            r303 = r0
            r0 = r307
            if (r0 == 0) goto L55
        L50:
            r0 = 0
            r303 = r0
            r0 = 0
            r306 = r0
        L55:
            r0 = r303
            return r0
        L57:
            r0 = r302
            com.facebook.messaging.rtc.links.api.VideoChatLinkRingableParticipant r0 = (com.facebook.messaging.rtc.links.api.VideoChatLinkRingableParticipant) r0
            boolean r0 = r0.A03
            return r0
        L5f:
            r0 = r302
            com.facebook.messaging.rtc.links.api.VideoChatLinkRingableParticipant r0 = (com.facebook.messaging.rtc.links.api.VideoChatLinkRingableParticipant) r0
            r302 = r0
            r0 = r301
            java.lang.Object r0 = r0.A01
            X.IAC r0 = (X.IAC) r0
            X.00i r0 = r0.A04
            java.lang.Object r0 = r0.get()
            X.1XZ r0 = (X.1XZ) r0
            r305 = r0
            r0 = r302
            com.facebook.user.model.User r0 = r0.A00
            com.facebook.user.model.UserKey r0 = r0.A0k
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.BX3(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Imz.apply(java.lang.Object):boolean");
    }
}
