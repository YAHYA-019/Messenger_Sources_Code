package X;

import kotlin.jvm.functions.Function1;

/* loaded from: JAs.class */
public final class JAs extends C00q implements Function1 {
    public static final JAs A00 = new JAs();

    public JAs() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (r0 != null) goto L24;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            X.8LW r0 = X.7zO.A0e(r0)
            r303 = r0
            r0 = r303
            java.lang.Class<com.facebook.rsys.call.gen.CallModel> r1 = com.facebook.rsys.call.gen.CallModel.class
            java.lang.Object r0 = r0.A00(r1)
            com.facebook.rsys.call.gen.CallModel r0 = (com.facebook.rsys.call.gen.CallModel) r0
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto Lbe
            r0 = r304
            java.util.ArrayList r0 = r0.remoteParticipants
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lbe
            r0 = r304
            java.util.Iterator r0 = r0.iterator()
            r306 = r0
        L25:
            r0 = r306
            boolean r0 = r0.hasNext()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lb8
            r0 = r306
            java.lang.Object r0 = r0.next()
            r308 = r0
            r0 = r308
            r304 = r0
            r0 = r308
            com.facebook.rsys.call.gen.CallParticipant r0 = (com.facebook.rsys.call.gen.CallParticipant) r0
            java.lang.String r0 = r0.userId
            r303 = r0
            java.lang.String r0 = "0"
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = X.11T.A0O(r0, r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L25
        L57:
            r0 = r308
            com.facebook.rsys.call.gen.CallParticipant r0 = (com.facebook.rsys.call.gen.CallParticipant) r0
            r308 = r0
            r0 = r308
            if (r0 == 0) goto Lbe
            r0 = r308
            com.facebook.rsys.call.gen.ParticipantMediaState r0 = r0.mediaState
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lbe
            r0 = r304
            java.util.ArrayList r0 = r0.audioStreams
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lbe
            r0 = r304
            java.util.Iterator r0 = r0.iterator()
            r306 = r0
        L7c:
            r0 = r306
            boolean r0 = r0.hasNext()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lbe
            r0 = r306
            java.lang.Object r0 = r0.next()
            r308 = r0
            r0 = r308
            r304 = r0
            r0 = r308
            com.facebook.rsys.audio.gen.AudioStream r0 = (com.facebook.rsys.audio.gen.AudioStream) r0
            r304 = r0
            r0 = r304
            int r0 = r0.type
            r309 = r0
            r0 = 9
            r307 = r0
            r0 = r309
            r1 = r307
            if (r0 != r1) goto L7c
            r0 = r308
            if (r0 == 0) goto Lbe
        Lb2:
            r0 = r305
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        Lb8:
            r0 = 0
            r308 = r0
            goto L57
        Lbe:
            r0 = 0
            r305 = r0
            goto Lb2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JAs.invoke(java.lang.Object):java.lang.Object");
    }
}
