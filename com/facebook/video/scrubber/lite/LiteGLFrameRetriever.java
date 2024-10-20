package com.facebook.video.scrubber.lite;

import X.02W;
import X.0fH;
import X.1BK;
import X.2DX;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0dp;
import X.GOp;
import X.HFK;
import X.HLU;
import X.JGg;
import X.JGh;
import X.JL0;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Looper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: LiteGLFrameRetriever.class */
public final class LiteGLFrameRetriever {
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A06;
    public HLU A07;
    public HFK A09;
    public List A0E;
    public final C0dp A0F;
    public final JGg A0G;
    public final JGh A0H;
    public final ExecutorService A0I;
    public final JL0 A0J;
    public final 2DX A0K;
    public int A00 = 0;
    public boolean A0B = false;
    public boolean A0D = false;
    public boolean A0A = false;
    public boolean A0C = false;
    public volatile MediaCodec A0L = null;
    public LiteCodecOutputSurface A08 = null;
    public MediaExtractor A05 = null;

    public LiteGLFrameRetriever(Uri uri, C0dp c0dp, JL0 jl0, 2DX r305, HLU hlu, JGg jGg, JGh jGh, List list, ExecutorService executorService) {
        long j = -1;
        this.A02 = j;
        this.A04 = j;
        this.A03 = j;
        this.A0E = list;
        this.A06 = uri;
        this.A07 = hlu;
        this.A0I = executorService;
        this.A0F = c0dp;
        this.A0G = jGg;
        this.A0K = r305;
        this.A0J = jl0;
        this.A0H = jGh;
    }

    /* JADX WARN: Finally extract failed */
    private void A00() {
        synchronized (this) {
            if (this.A0L != null) {
                try {
                    try {
                        this.A0L.stop();
                        this.A0L.release();
                    } catch (IllegalStateException e) {
                        0fH.A0r("com.facebook.video.scrubber.lite.LiteGLFrameRetriever", "Oddly, the decoder ran into issues releasing", e);
                    }
                    this.A0L = null;
                } catch (Throwable th) {
                    this.A0L = null;
                    throw th;
                }
            }
        }
    }

    private void A01(RectF rectF) {
        if (this.A0B) {
            return;
        }
        02W.A04(1BK.A1V(Looper.myLooper(), Looper.getMainLooper()));
        Uri uri = this.A06;
        File A11 = GOp.A11(uri);
        if (!A11.canRead()) {
            throw AnonymousClass002.A0C(A11, "Unable to read ", AnonymousClass001.A0k());
        }
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.A05 = mediaExtractor;
        try {
            mediaExtractor.setDataSource(A11.toString());
            MediaExtractor mediaExtractor2 = this.A05;
            int trackCount = mediaExtractor2.getTrackCount();
            int i = 0;
            while (true) {
                if (i >= trackCount) {
                    i = -1;
                    break;
                } else if (mediaExtractor2.getTrackFormat(i).getString("mime").startsWith("video/")) {
                    break;
                } else {
                    i++;
                }
            }
            this.A01 = i;
            if (i < 0) {
                throw AnonymousClass001.A0T(AnonymousClass001.A0Z(A11, "No video track found in ", AnonymousClass001.A0k()));
            }
            this.A05.selectTrack(i);
            MediaFormat trackFormat = this.A05.getTrackFormat(this.A01);
            trackFormat.setInteger("max-input-size", 0);
            LiteCodecOutputSurface liteCodecOutputSurface = this.A08;
            if (liteCodecOutputSurface != null) {
                liteCodecOutputSurface.A00();
            }
            if (this.A08 == null) {
                2DX r0 = this.A0K;
                JL0 jl0 = this.A0J;
                HFK hfk = this.A09;
                if (hfk == null) {
                    hfk = this.A0H.ARd(uri);
                    this.A09 = hfk;
                }
                this.A08 = new LiteCodecOutputSurface(rectF, jl0, r0, hfk, this.A0E);
            }
            String string = trackFormat.getString("mime");
            try {
                A00();
                this.A0L = MediaCodec.createDecoderByType(string);
                this.A0L.configure(trackFormat, this.A08.A01, (MediaCrypto) null, 0);
                this.A0L.start();
                this.A0B = true;
            } catch (IOException e) {
                throw AnonymousClass002.A0C(e, "Unable to determine decoder: ", AnonymousClass001.A0k());
            }
        } catch (IOException e2) {
            throw AnonymousClass002.A0C(e2, "Unable to set the data source: ", AnonymousClass001.A0k());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0487, code lost:
    
        if (r324 == X.0S2.A0C) goto L184;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0813 A[Catch: IllegalStateException -> 0x08a6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x08a6, blocks: (B:13:0x0102, B:15:0x0108, B:16:0x010d, B:17:0x0114, B:18:0x011b, B:19:0x0122, B:21:0x0131, B:24:0x013f, B:25:0x0145, B:26:0x014c, B:27:0x0151, B:28:0x0157, B:30:0x015c, B:33:0x0171, B:40:0x02ac, B:43:0x02be, B:45:0x02d9, B:47:0x02e1, B:48:0x02e5, B:48:0x02e5, B:52:0x02f3, B:55:0x0301, B:58:0x030c, B:61:0x0317, B:65:0x033c, B:67:0x0342, B:68:0x0347, B:70:0x034e, B:71:0x0354, B:74:0x0360, B:76:0x036d, B:80:0x0381, B:81:0x0388, B:82:0x038d, B:84:0x0397, B:85:0x039d, B:86:0x03a3, B:87:0x03aa, B:89:0x03b5, B:91:0x03c9, B:92:0x03ce, B:92:0x03ce, B:94:0x046d, B:96:0x047b, B:99:0x0493, B:101:0x04a2, B:111:0x04d5, B:113:0x04dc, B:114:0x04e1, B:118:0x04f0, B:120:0x04f7, B:122:0x04fd, B:129:0x0530, B:134:0x0544, B:136:0x054e, B:138:0x0558, B:139:0x0579, B:141:0x0587, B:202:0x0593, B:203:0x0599, B:205:0x05a2, B:236:0x063f, B:239:0x0649, B:240:0x0650, B:242:0x0656, B:243:0x065b, B:244:0x0662, B:245:0x0669, B:246:0x0670, B:247:0x0677, B:249:0x0689, B:251:0x0698, B:253:0x069f, B:255:0x06a6, B:257:0x06ad, B:258:0x06b2, B:259:0x06b9, B:260:0x06c0, B:261:0x06c7, B:263:0x06d8, B:265:0x06df, B:266:0x06e6, B:269:0x06f4, B:270:0x06fd, B:272:0x0708, B:275:0x071f, B:277:0x0728, B:278:0x072e, B:280:0x0736, B:282:0x073c, B:283:0x0741, B:285:0x0747, B:286:0x074c, B:287:0x0753, B:289:0x075b, B:290:0x0760, B:291:0x0767, B:293:0x0772, B:295:0x0779, B:297:0x0782, B:298:0x0789, B:300:0x0791, B:302:0x0798, B:304:0x07a2, B:307:0x0860, B:308:0x0867, B:310:0x0880, B:312:0x088a, B:314:0x0895, B:315:0x089c, B:190:0x08a5, B:148:0x05b0, B:156:0x07b5, B:157:0x07bc, B:159:0x07d0, B:161:0x07d6, B:164:0x07de, B:167:0x07e8, B:170:0x07f2, B:172:0x07f8, B:173:0x07fe, B:174:0x0804, B:175:0x080a, B:199:0x05d9, B:320:0x0574, B:323:0x05e8, B:324:0x0560, B:325:0x0566, B:326:0x056c, B:326:0x056c, B:329:0x03de, B:330:0x03e4, B:331:0x03eb, B:335:0x03fc, B:336:0x0402, B:337:0x0409, B:338:0x0410, B:339:0x0416, B:340:0x041d, B:342:0x0436, B:344:0x043c, B:346:0x044a, B:348:0x044f, B:350:0x0457, B:352:0x045d, B:353:0x0462, B:354:0x0468, B:354:0x0468, B:356:0x03d6, B:178:0x0813, B:186:0x082c, B:188:0x0836, B:359:0x019e, B:362:0x01a9, B:363:0x01af, B:364:0x01b5, B:366:0x01ba, B:368:0x01c0, B:371:0x01ca, B:372:0x01d0, B:374:0x01d8, B:376:0x01e2, B:378:0x01e9, B:380:0x0208, B:381:0x020f, B:383:0x021c, B:385:0x0222, B:386:0x0227, B:388:0x022f, B:392:0x024b, B:395:0x0251, B:400:0x0272, B:402:0x0278, B:403:0x027d, B:405:0x0285, B:414:0x0851), top: B:12:0x0102 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0593 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x080e A[EDGE_INSN: B:358:0x080e->B:176:0x080e BREAK  A[LOOP:0: B:51:0x02ed->B:199:0x05d9, LOOP_LABEL: LOOP:0: B:51:0x02ed->B:199:0x05d9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0301 A[Catch: IllegalStateException -> 0x08a6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x08a6, blocks: (B:13:0x0102, B:15:0x0108, B:16:0x010d, B:17:0x0114, B:18:0x011b, B:19:0x0122, B:21:0x0131, B:24:0x013f, B:25:0x0145, B:26:0x014c, B:27:0x0151, B:28:0x0157, B:30:0x015c, B:33:0x0171, B:40:0x02ac, B:43:0x02be, B:45:0x02d9, B:47:0x02e1, B:48:0x02e5, B:48:0x02e5, B:52:0x02f3, B:55:0x0301, B:58:0x030c, B:61:0x0317, B:65:0x033c, B:67:0x0342, B:68:0x0347, B:70:0x034e, B:71:0x0354, B:74:0x0360, B:76:0x036d, B:80:0x0381, B:81:0x0388, B:82:0x038d, B:84:0x0397, B:85:0x039d, B:86:0x03a3, B:87:0x03aa, B:89:0x03b5, B:91:0x03c9, B:92:0x03ce, B:92:0x03ce, B:94:0x046d, B:96:0x047b, B:99:0x0493, B:101:0x04a2, B:111:0x04d5, B:113:0x04dc, B:114:0x04e1, B:118:0x04f0, B:120:0x04f7, B:122:0x04fd, B:129:0x0530, B:134:0x0544, B:136:0x054e, B:138:0x0558, B:139:0x0579, B:141:0x0587, B:202:0x0593, B:203:0x0599, B:205:0x05a2, B:236:0x063f, B:239:0x0649, B:240:0x0650, B:242:0x0656, B:243:0x065b, B:244:0x0662, B:245:0x0669, B:246:0x0670, B:247:0x0677, B:249:0x0689, B:251:0x0698, B:253:0x069f, B:255:0x06a6, B:257:0x06ad, B:258:0x06b2, B:259:0x06b9, B:260:0x06c0, B:261:0x06c7, B:263:0x06d8, B:265:0x06df, B:266:0x06e6, B:269:0x06f4, B:270:0x06fd, B:272:0x0708, B:275:0x071f, B:277:0x0728, B:278:0x072e, B:280:0x0736, B:282:0x073c, B:283:0x0741, B:285:0x0747, B:286:0x074c, B:287:0x0753, B:289:0x075b, B:290:0x0760, B:291:0x0767, B:293:0x0772, B:295:0x0779, B:297:0x0782, B:298:0x0789, B:300:0x0791, B:302:0x0798, B:304:0x07a2, B:307:0x0860, B:308:0x0867, B:310:0x0880, B:312:0x088a, B:314:0x0895, B:315:0x089c, B:190:0x08a5, B:148:0x05b0, B:156:0x07b5, B:157:0x07bc, B:159:0x07d0, B:161:0x07d6, B:164:0x07de, B:167:0x07e8, B:170:0x07f2, B:172:0x07f8, B:173:0x07fe, B:174:0x0804, B:175:0x080a, B:199:0x05d9, B:320:0x0574, B:323:0x05e8, B:324:0x0560, B:325:0x0566, B:326:0x056c, B:326:0x056c, B:329:0x03de, B:330:0x03e4, B:331:0x03eb, B:335:0x03fc, B:336:0x0402, B:337:0x0409, B:338:0x0410, B:339:0x0416, B:340:0x041d, B:342:0x0436, B:344:0x043c, B:346:0x044a, B:348:0x044f, B:350:0x0457, B:352:0x045d, B:353:0x0462, B:354:0x0468, B:354:0x0468, B:356:0x03d6, B:178:0x0813, B:186:0x082c, B:188:0x0836, B:359:0x019e, B:362:0x01a9, B:363:0x01af, B:364:0x01b5, B:366:0x01ba, B:368:0x01c0, B:371:0x01ca, B:372:0x01d0, B:374:0x01d8, B:376:0x01e2, B:378:0x01e9, B:380:0x0208, B:381:0x020f, B:383:0x021c, B:385:0x0222, B:386:0x0227, B:388:0x022f, B:392:0x024b, B:395:0x0251, B:400:0x0272, B:402:0x0278, B:403:0x027d, B:405:0x0285, B:414:0x0851), top: B:12:0x0102 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.2EU A02(float r302, int r303) {
        /*
            Method dump skipped, instructions count: 2243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.scrubber.lite.LiteGLFrameRetriever.A02(float, int):X.2EU");
    }

    public void A03() {
        A00();
        MediaExtractor mediaExtractor = this.A05;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.A05 = null;
        }
        this.A0B = false;
        LiteCodecOutputSurface liteCodecOutputSurface = this.A08;
        if (liteCodecOutputSurface != null) {
            liteCodecOutputSurface.A00();
            this.A08 = null;
        }
        this.A0D = false;
        this.A0B = false;
    }
}
