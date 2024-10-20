package X;

import com.facebook.cameracore.audiograph.AudioPipelineImpl;

/* loaded from: Hr4.class */
public abstract class Hr4 {
    public final int A00;

    public Hr4(int i) {
        02W.A04(AnonymousClass001.A1P(i));
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r305 == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A00() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.GcL
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L61
            r0 = r301
            r303 = r0
            r0 = r301
            X.GcL r0 = (X.GcL) r0
            r303 = r0
            r0 = r303
            java.nio.ByteBuffer r0 = r0.A00
            r304 = r0
            r0 = r304
            java.nio.Buffer r0 = r0.clear()
            boolean r0 = com.facebook.cameracore.audiograph.AudioPipelineImpl.IS_UNIT_TEST     // Catch: java.lang.Throwable -> L57
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2b
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            goto L44
        L2b:
            r0 = r303
            com.facebook.cameracore.audiograph.AudioPipelineImpl r0 = r0.A01     // Catch: java.lang.Throwable -> L57
            r306 = r0
            r0 = r303
            int r0 = r0.A00     // Catch: java.lang.Throwable -> L57
            r302 = r0
            r0 = r306
            r1 = r304
            r2 = r302
            int r0 = r0.processAndPullSpeakerWithByteBuffer(r1, r2)     // Catch: java.lang.Throwable -> L57
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L4f
        L44:
            r0 = r303
            int r0 = r0.A00     // Catch: java.lang.Throwable -> L57
            r302 = r0
            r0 = r304
            r1 = r302
            java.nio.Buffer r0 = r0.position(r1)     // Catch: java.lang.Throwable -> L57
        L4f:
            r0 = r304
            java.nio.Buffer r0 = r0.flip()
            r0 = r305
            return r0
        L57:
            r307 = move-exception
            r0 = r304
            java.nio.Buffer r0 = r0.flip()
            r0 = r307
            throw r0
        L61:
            r0 = r301
            r303 = r0
            r0 = r301
            X.GcK r0 = (X.GcK) r0
            r303 = r0
            boolean r0 = com.facebook.cameracore.audiograph.AudioPipelineImpl.IS_UNIT_TEST
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L72
            r0 = 0
            return r0
        L72:
            r0 = r303
            com.facebook.cameracore.audiograph.AudioPipelineImpl r0 = r0.A01
            r304 = r0
            r0 = r303
            byte[] r0 = r0.A00
            r306 = r0
            r0 = r303
            int r0 = r0.A00
            r302 = r0
            r0 = r304
            r1 = r306
            r2 = r302
            int r0 = r0.processAndPullSpeaker(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hr4.A00():int");
    }

    public int A01() {
        if (this instanceof GcL) {
            GcL gcL = (GcL) this;
            AudioPipelineImpl audioPipelineImpl = gcL.A01;
            audioPipelineImpl.mAudioTrack.getClass();
            return audioPipelineImpl.mAudioTrack.write(gcL.A00, gcL.A00, 0);
        }
        GcK gcK = (GcK) this;
        AudioPipelineImpl audioPipelineImpl2 = gcK.A01;
        audioPipelineImpl2.mAudioTrack.getClass();
        return audioPipelineImpl2.mAudioTrack.write(gcK.A00, 0, gcK.A00);
    }
}
