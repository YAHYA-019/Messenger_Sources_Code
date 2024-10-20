package X;

/* loaded from: J7G.class */
public final class J7G extends Thread {
    public static final String __redex_internal_original_name = "AndroidVideoDecoder$1";
    public final /* synthetic */ J6T A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7G(J6T j6t) {
        super("AndroidVideoDecoder.outputThread");
        this.A00 = j6t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0591, code lost:
    
        r0 = (r0 + 1) / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0596, code lost:
    
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x059c, code lost:
    
        if (r0 != 0) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x05a7, code lost:
    
        r326 = (r0 + 1) / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x05ad, code lost:
    
        r0 = r318 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x05b1, code lost:
    
        r0 = r318 * r0;
        r0 = r318 * r0;
        r0 = r0 * r326;
        r0 = r0 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x05d6, code lost:
    
        r0 = ((r0 * r0) / 2) + r0;
        r0 = r0 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x05e0, code lost:
    
        r338 = org.webrtc.JavaI420Buffer.A00(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x05ed, code lost:
    
        r0.limit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x05f8, code lost:
    
        r0.position(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0628, code lost:
    
        org.webrtc.YuvHelper.nativeCopyPlane(r0.slice(), r318, r338.getDataY(), r338.getStrideY(), r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0633, code lost:
    
        r0.limit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x063b, code lost:
    
        r0.position(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0643, code lost:
    
        r0 = r0.slice();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0648, code lost:
    
        r0 = r338.getDataU();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x064f, code lost:
    
        r0 = r338.getStrideU();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0656, code lost:
    
        r0 = r326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0670, code lost:
    
        org.webrtc.YuvHelper.nativeCopyPlane(r0, r0, r0, r0, r0, r326);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0685, code lost:
    
        if (r0 != 1) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0688, code lost:
    
        r0 = r0 + ((r326 - 1) * r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x06a1, code lost:
    
        r0.limit(r0 + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x06a9, code lost:
    
        r0.position(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x06b1, code lost:
    
        r0 = r338.getDataU();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x06bf, code lost:
    
        r0.position(r0 * r326);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x06ce, code lost:
    
        r0.put(r0.slice());
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x06da, code lost:
    
        r0.limit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x06e2, code lost:
    
        r0.position(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x06e9, code lost:
    
        r0 = r0.slice();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x06ee, code lost:
    
        r0 = r338.getDataV();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x06f5, code lost:
    
        r0 = r338.getStrideV();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x070a, code lost:
    
        org.webrtc.YuvHelper.nativeCopyPlane(r0, r0, r0, r0, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0713, code lost:
    
        if (r0 != 1) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x079e, code lost:
    
        r0.A09.A00.releaseOutputBuffer(r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x07c7, code lost:
    
        r0 = new org.webrtc.VideoFrame(r338, r327, r0.presentationTimeUs * 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x07d2, code lost:
    
        if (r0.A0T == false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x07e4, code lost:
    
        r0.A0D.onDecodedFrame(r0, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x07ec, code lost:
    
        r0.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x07f8, code lost:
    
        org.webrtc.Logging.w("AndroidVideoDecoder", "deliverByteFrame. callback expired");
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0741, code lost:
    
        r0 = r0 + (r0 * (r326 - 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x075b, code lost:
    
        r0.limit(r0 + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0763, code lost:
    
        r0.position(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x076a, code lost:
    
        r0 = r338.getDataV();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0778, code lost:
    
        r0.position(r0 * r326);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0786, code lost:
    
        r0.put(r0.slice());
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x067a, code lost:
    
        r326 = r0 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0739, code lost:
    
        r338 = new org.webrtc.NV12Buffer(r0, r0, r0, r318, r0).toI420();
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0507, code lost:
    
        org.webrtc.Logging.e("AndroidVideoDecoder", X.0Pz.A0T("Insufficient output buffer size: ", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x07ff, code lost:
    
        r313 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0410, code lost:
    
        r0 = r0.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0416, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0418, code lost:
    
        r0 = r0.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x041d, code lost:
    
        r0 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0424, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0426, code lost:
    
        r0 = r0.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x042d, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0434, code lost:
    
        if (r0.A08 == null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0437, code lost:
    
        r302 = r0.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x043c, code lost:
    
        r317 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x044a, code lost:
    
        r302.A00.releaseOutputBuffer(r0, r317);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0451, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x045d, code lost:
    
        r0.A0A.A02(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0463, code lost:
    
        r0 = r0.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0482, code lost:
    
        r0.A08.post(new X.SCh(r0, r327));
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x049c, code lost:
    
        r0.A08 = new X.Hcp(r320, r0.presentationTimeUs);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04a1, code lost:
    
        r302 = r0.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04a5, code lost:
    
        r317 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04ab, code lost:
    
        r313 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04b3, code lost:
    
        r313 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x03d5, code lost:
    
        if (r321 != null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x03ef, code lost:
    
        r320 = java.lang.Integer.valueOf((int) (android.os.SystemClock.elapsedRealtime() - r321.A01));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03fb, code lost:
    
        r327 = r321.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0402, code lost:
    
        r0.A0G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x040d, code lost:
    
        if (r0.A0A == null) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04ba, code lost:
    
        r0 = r0.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04c2, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04c4, code lost:
    
        r0 = r0.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x04c9, code lost:
    
        r0 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x04cf, code lost:
    
        r318 = r0.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x04d5, code lost:
    
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x04dc, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04df, code lost:
    
        r0 = r0.size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04f7, code lost:
    
        if (r0 >= (((r0 * r0) * 3) / 2)) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0521, code lost:
    
        if (r0 >= (((r318 * r0) * 3) / 2)) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0527, code lost:
    
        if (r0 != r0) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x052e, code lost:
    
        if (r318 <= r0) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x053f, code lost:
    
        r318 = (r0 * 2) / (r0 * 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x055a, code lost:
    
        r0 = r0.A09.A00.getOutputBuffers()[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0561, code lost:
    
        X.AbstractC2326GOr.A0t(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0568, code lost:
    
        r0 = r0.slice();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x057b, code lost:
    
        if (r0.A00 != 19) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0586, code lost:
    
        if ((r318 % 2) != 0) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0819, code lost:
    
        new java.lang.AssertionError(X.0Pz.A0T("Stride is not divisible by two: ", r318));
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 2195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J7G.run():void");
    }
}
