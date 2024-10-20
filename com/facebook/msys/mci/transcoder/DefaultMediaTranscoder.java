package com.facebook.msys.mci.transcoder;

import X.0OO;
import X.0OP;
import X.0Pz;
import X.0fH;
import X.0gF;
import X.11T;
import X.1BK;
import X.4YV;
import X.AKf;
import X.AKu;
import X.AnonymousClass001;
import X.C01s;
import X.C02013tp;
import X.C3Sm;
import X.G9L;
import X.GOo;
import X.GtO;
import X.GtS;
import X.GtU;
import X.GtV;
import X.H3d;
import X.HF8;
import X.HFF;
import X.HWg;
import X.Hcb;
import X.Hhl;
import X.HiS;
import X.Hk3;
import X.Hkk;
import X.I2n;
import X.I6J;
import X.I7L;
import X.IEQ;
import X.IFs;
import X.IjN;
import X.IsT;
import X.JGx;
import X.JIC;
import X.N1C;
import X.N1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import com.facebook.msys.mci.MediaTranscoder;
import com.facebook.msys.mci.TranscodeGifCompletionCallback;
import com.facebook.msys.mci.TranscodeImageCompletionCallback;
import com.facebook.msys.mci.TranscodeVideoCompletionCallback;
import com.facebook.msys.mci.VideoSizeEstimatorCompletionCallback;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: DefaultMediaTranscoder.class */
public class DefaultMediaTranscoder implements MediaTranscoder {
    public static MediaTranscoder A0F;
    public final Context A00;
    public final C3Sm A01;
    public final IEQ A02;
    public final Hkk A03;
    public final H3d A04;
    public final HFF A05;
    public final JGx A06 = new IjN();
    public final C01s A07;
    public final JIC A08;
    public final HWg A09;
    public final Hcb A0A;
    public final HF8 A0B;
    public final ExecutorService A0C;
    public final boolean A0D;
    public final boolean A0E;

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, X.H3d] */
    /* JADX WARN: Type inference failed for: r312v1, types: [java.lang.Object, X.Hcb] */
    public DefaultMediaTranscoder(Context context, C01s c01s, JIC jic, C3Sm c3Sm, IEQ ieq, Hkk hkk, HWg hWg, HFF hff, ExecutorService executorService) {
        this.A0C = executorService;
        this.A00 = context;
        this.A05 = hff;
        this.A03 = hkk;
        this.A08 = jic;
        this.A01 = c3Sm;
        this.A02 = ieq;
        this.A07 = c01s;
        Hcb hcb = null;
        N1D n1d = hkk.A06;
        N1C n1c = hkk.A07;
        boolean z = hkk.A0Y;
        ?? obj = new Object();
        obj.A02 = null;
        obj.A00 = n1d;
        obj.A01 = n1c;
        obj.A03 = z;
        this.A04 = obj;
        boolean z2 = hkk.A0K;
        this.A0B = (z2 || hkk.A0M || hkk.A0L) ? hkk.A08 : null;
        if (z2 || hkk.A0M || hkk.A0L) {
            double d = hkk.A01;
            List list = hkk.A00;
            11T.A0F(list, 2);
            ?? obj2 = new Object();
            obj2.A00 = 1.0d;
            obj2.A00 = d;
            obj2.A01 = list;
            hcb = obj2;
        }
        this.A0A = hcb;
        this.A09 = hWg;
        this.A0D = hkk.A0V;
        this.A0E = hkk.A0W;
    }

    public static Hhl A00(Map map) {
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        if (map != null) {
            if (map.containsKey("TARGET_IMAGE_SIZE_LIMIT")) {
                try {
                    Integer.parseInt(AnonymousClass001.A0b("TARGET_IMAGE_SIZE_LIMIT", map));
                } catch (NumberFormatException unused) {
                }
            }
            if (map.containsKey("REMOVE_PII")) {
                map.get("REMOVE_PII");
            }
            if (map.containsKey("ENABLE_RESCALE_ON_ROTATE")) {
                z = AnonymousClass001.A1V(map.get("ENABLE_RESCALE_ON_ROTATE"));
            }
            if (map.containsKey("IS_PREVIEW")) {
                z2 = AnonymousClass001.A1V(map.get("IS_PREVIEW"));
            }
            if (map.containsKey("ENABLE_IMAGE_TRANSCODER_IN_MEMORY_CACHE")) {
                map.get("ENABLE_IMAGE_TRANSCODER_IN_MEMORY_CACHE");
            }
            if (map.containsKey("IS_HD")) {
                z3 = AnonymousClass001.A1V(map.get("IS_HD"));
            }
            if (map.containsKey("TRACE_ID")) {
                str = AnonymousClass001.A0b("TRACE_ID", map);
            }
            if (map.containsKey("IS_ARMADILLO")) {
                z4 = AnonymousClass001.A1V(map.get("IS_ARMADILLO"));
            }
        }
        return new Hhl(str, z4, z3, z2, z);
    }

    public static HashMap A01(Hhl hhl, I2n i2n) {
        HashMap A0u = AnonymousClass001.A0u();
        if (i2n != null) {
            A0u.put("ORIGINAL_WIDTH", 1BK.A0l(i2n.A03));
            A0u.put("ORIGINAL_HEIGHT", 1BK.A0l(i2n.A01));
            A0u.put("ORIGINAL_FILE_SIZE", Long.valueOf(i2n.A07));
            A0u.put("TRANSCODED_WIDTH", 1BK.A0l(i2n.A06));
            A0u.put("TRANSCODED_HEIGHT", 1BK.A0l(i2n.A04));
            A0u.put("TRANSCODED_FILE_SIZE", Long.valueOf(i2n.A08));
            A0u.put("COMPRESSION_QUALITY", 1BK.A0l(i2n.A05));
            A0u.put("IS_HD", Long.valueOf(4YV.A03(hhl.A02 ? 1 : 0)));
        }
        return A0u;
    }

    public static void A02(TranscodeVideoCompletionCallback transcodeVideoCompletionCallback, DefaultMediaTranscoder defaultMediaTranscoder, Throwable th, int i, int i2) {
        C01s c01s = defaultMediaTranscoder.A07;
        if (c01s != null) {
            c01s.D0y("DefaultMediaTranscoderVideoTranscodeFailure", "Exception while transcoding video", 100, th);
        }
        GOo.A1I(new GtS(transcodeVideoCompletionCallback, defaultMediaTranscoder, th, i, i2));
    }

    private void A03(Exception exc, String str) {
        C3Sm c3Sm = this.A01;
        if (c3Sm != null) {
            C3Sm.A00(c3Sm, new AKf(exc, c3Sm, str, 11));
        }
    }

    public static boolean A04(HiS hiS) {
        Double d = hiS.A02;
        if (d != null && d.doubleValue() >= 0.0d) {
            return true;
        }
        Double d2 = hiS.A01;
        return d2 != null && d2.doubleValue() >= 0.0d;
    }

    public Bitmap decodeBitmap(String str, double d, double d2) {
        String path;
        C3Sm c3Sm;
        G9L aKf;
        Integer valueOf;
        Integer valueOf2;
        Bitmap bitmap = null;
        if (str != null) {
            try {
                path = I6J.A02(str).getPath();
            } catch (IOException | IllegalArgumentException | SecurityException e) {
                0fH.A14("DefaultMediaTranscoder", "decodeBitmap: Error parsing inputFileURL: %s, Exception %s", new Object[]{str, e});
                A03(e, str);
                return null;
            }
        } else {
            path = null;
        }
        int min = Math.min((int) d, (-1) >>> 1);
        int min2 = Math.min((int) d2, (-1) >>> 1);
        if (path == null) {
            A03(null, null);
            throw AnonymousClass001.A0N("decodeBitmap: At least one of input params should be not null");
        }
        try {
            int A00 = 0OP.A00(0OO.A00(new IFs(path).A0W(1)));
            Bitmap decodeFile = BitmapFactory.decodeFile(path);
            if (decodeFile == null) {
                0fH.A14("DefaultMediaTranscoder", "decodeBitmap: Error converting to bitmap: %s.", new Object[]{str});
                C3Sm c3Sm2 = this.A01;
                if (c3Sm2 != null) {
                    C3Sm.A00(c3Sm2, new AKu(c3Sm2, null, path, -1, -1, -1, -1));
                }
                throw AnonymousClass001.A0N("decodeBitmap: Bitmap decoding fail");
            }
            c3Sm = this.A01;
            Bitmap A01 = IEQ.A01(decodeFile, c3Sm, A00);
            int width = A01.getWidth();
            int height = A01.getHeight();
            if (height > min2 || width > min) {
                int i = min * height;
                int i2 = min2 * width;
                if (i < i2) {
                    min2 = i / width;
                } else {
                    min = i2 / height;
                }
                valueOf = Integer.valueOf(min);
                valueOf2 = Integer.valueOf(min2);
            } else {
                valueOf = Integer.valueOf(width);
                valueOf2 = Integer.valueOf(height);
            }
            Pair create = Pair.create(valueOf, valueOf2);
            Number number = (Number) create.first;
            int intValue = number.intValue();
            Number number2 = (Number) create.second;
            int intValue2 = number2.intValue();
            0fH.A0Y(Integer.valueOf(width), Integer.valueOf(height), number, number2, "DefaultMediaTranscoder", "decodeBitmap: Resizing image %s x %s => %s x %s");
            try {
                0gF.A00(A01);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(A01, intValue, intValue2, true);
                if (createScaledBitmap == null) {
                    try {
                        0fH.A0k("DefaultMediaTranscoder", "decodeBitmap: bitmap scaling returned null");
                        if (c3Sm != null) {
                            C3Sm.A00(c3Sm, new G9L(c3Sm, intValue, (Object) null, intValue2, 0));
                            return createScaledBitmap;
                        }
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        bitmap = createScaledBitmap;
                        0fH.A0r("DefaultMediaTranscoder", "decodeBitmap: invalid dimensions passed to bitmap scaling - ", e);
                        if (c3Sm != null) {
                            aKf = new G9L(c3Sm, intValue, e, intValue2, 0);
                            C3Sm.A00(c3Sm, aKf);
                        }
                        return bitmap;
                    }
                }
                return createScaledBitmap;
            } catch (IllegalArgumentException e3) {
                e = e3;
            }
        } catch (IOException e4) {
            0fH.A14("DefaultMediaTranscoder", "decodeBitmap: Error getting rotation: %s, Exception %s", new Object[]{str, e4});
            c3Sm = this.A01;
            if (c3Sm != null) {
                aKf = new AKf(e4, c3Sm, path, 10);
                C3Sm.A00(c3Sm, aKf);
            }
            return bitmap;
        }
    }

    @Override // com.facebook.msys.mci.MediaTranscoder
    public void estimateVideoSize(String str, long j, Double d, Double d2, VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback) {
        GOo.A1I(new GtU(videoSizeEstimatorCompletionCallback, this, d, d2, str, j));
    }

    public int getImageTranscodeQuality(Bitmap bitmap, Map map) {
        if (bitmap == null) {
            0fH.A0k("DefaultMediaTranscoder", "getImageTranscodeQuality: Image bitmap is null");
            return 0;
        }
        Hhl A00 = A00(map);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z = A00.A02;
        int A002 = IEQ.A00(Boolean.valueOf(z), height, width);
        if (z) {
            A002 = Math.max(A002, this.A03.A02);
        }
        0fH.A0g(Integer.valueOf(A002), "DefaultMediaTranscoder", "getImageTranscodeQuality: Quality calculated %d");
        return A002;
    }

    @Override // com.facebook.msys.mci.MediaTranscoder
    public void reportTranscodeFailure(int i) {
        String A0T = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0Pz.A0T("Transcode failure code: ", i) : "MCDMediaSendJobFailedTranscodeDueToMissingVideo" : "MCDMediaSendJobFailedTranscodeDueToMissingImage" : "MCDMediaSendJobFailedFileTooLarge" : "MCDMediaSendJobFailedTranscodingVideo";
        C01s c01s = this.A07;
        if (c01s != null) {
            c01s.D0w("DefaultMediaTranscoderVideoTranscodeFailure", A0T, 100);
        }
    }

    @Override // com.facebook.msys.mci.MediaTranscoder
    public void transcodeGif(String str, TranscodeGifCompletionCallback transcodeGifCompletionCallback) {
        GOo.A1I(new GtO(transcodeGifCompletionCallback, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c9, code lost:
    
        if (r0 == X.0S2.A0C) goto L18;
     */
    @Override // com.facebook.msys.mci.MediaTranscoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] transcodeImage(java.lang.String r302, double r303, double r305, java.lang.String r307, java.util.Map r308) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.transcoder.DefaultMediaTranscoder.transcodeImage(java.lang.String, double, double, java.lang.String, java.util.Map):byte[]");
    }

    @Override // com.facebook.msys.mci.MediaTranscoder
    public void transcodeImageV2(String str, double d, double d2, double d3, double d4, String str2, Map map, TranscodeImageCompletionCallback transcodeImageCompletionCallback) {
        String path;
        Object obj;
        if (str != null) {
            try {
                path = I6J.A02(str).getPath();
                obj = "File URL";
            } catch (IOException | IllegalArgumentException | SecurityException e) {
                0fH.A14("DefaultMediaTranscoder", "transcodeImageV2: Error parsing inputFileURL: %s, Exception %s", new Object[]{str, e});
                GOo.A1I(new GtV(transcodeImageCompletionCallback, this, e, 0.0d, 0.0d, 0.0d, 0.0d));
                return;
            }
        } else {
            path = null;
            obj = "Invalid";
        }
        IEQ ieq = this.A02;
        0fH.A0a(obj, "BitmapImageTranscoder", "None", "DefaultMediaTranscoder", "transcodeImageV2: %s request. Using %s transcoder (fallback: %s)");
        Hkk hkk = this.A03;
        int min = Math.min((int) d, (-1) >>> 1);
        int min2 = Math.min((int) d2, (-1) >>> 1);
        int min3 = Math.min((int) d3, 600);
        int min4 = Math.min((int) d4, 600);
        Hhl A00 = A00(map);
        this.A0C.execute(new IsT(new Hk3(ieq, A00, new I7L(transcodeImageCompletionCallback, A00, this, str2), hkk, path, str2, new C02013tp(), min2, min, min4, min3)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(64:269|270|271|272|273|274|275|276|277|278|(57:280|281|282|283|284|285|286|287|288|289|290|291|292|293|294|(3:296|297|298)|489|300|301|302|303|304|305|306|(1:308)|309|(1:311)|312|(1:314)|315|(1:317)|318|(1:320)|321|(1:323)|324|325|326|327|328|329|330|(1:332)|333|(1:335)|336|(1:338)|339|340|341|342|343|344|345|(1:347)(1:482)|348|(6:352|353|354|355|356|(15:358|359|360|361|362|363|364|(9:368|369|370|(18:385|386|(1:388)|389|390|(1:392)|393|(2:395|396)(2:452|453)|397|(1:451)(38:403|404|405|406|407|408|409|410|411|412|413|414|415|416|417|418|419|420|421|422|423|424|425|426|427|428|429|430|431|432|433|434|435|436|437|438|439|440)|441|442|443|444|445|446|447|448)(1:377)|378|(3:380|381|382)(1:384)|383|366|365)|454|455|456|457|458|459|(6:463|464|465|466|467|(21:469|470|471|472|473|474|475|47|(2:51|(1:53)(1:54))|55|(2:61|(15:63|64|65|66|67|68|69|70|71|72|73|74|75|76|77))|94|(9:96|(1:98)|99|(6:102|(6:111|112|113|114|115|(1:119))|104|(2:106|107)(2:109|110)|108|100)|122|123|(2:126|124)|127|128)(1:254)|129|(2:131|(4:133|(7:137|(4:140|(2:142|143)(2:145|(2:147|148)(1:149))|144|138)|150|151|(1:153)(2:156|(1:158))|154|155)|159|155)(2:160|(1:162)))|163|(1:165)(1:253)|166|(1:168)|169|(4:211|(13:213|(1:215)|216|(1:218)|219|(1:221)|222|(1:224)|225|(1:227)|228|(1:230)|231)(13:234|(1:236)|237|(1:239)|240|(1:242)|243|(1:245)|246|(1:248)|249|(1:251)|252)|232|233)(8:175|(1:177)(1:192)|178|(1:191)(1:182)|183|(2:185|(1:187)(1:188))|189|190))(4:476|477|478|479)))))|491|492|286|287|288|289|290|291|292|293|294|(0)|489|300|301|302|303|304|305|306|(0)|309|(0)|312|(0)|315|(0)|318|(0)|321|(0)|324|325|326|327|328|329|330|(0)|333|(0)|336|(0)|339|340|341|342|343|344|345|(0)(0)|348|(7:350|352|353|354|355|356|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        if ((r331 ? r0.A0L : r0.A0M) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x05c3, code lost:
    
        if (r0.equals("WIFI") != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x06f1, code lost:
    
        r333 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0701, code lost:
    
        X.0fH.A0r("MsgrClientSideJarvisHelper", "Failed to prepare the Reward features, Exception msg: %s", r333);
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0707, code lost:
    
        r331 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0e8d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0fb0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0fc7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x102a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x10d2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x11ba  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x12ba  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x13ba  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x1284  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0e56  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0739 A[Catch: RuntimeException -> 0x0ac8, TRY_ENTER, TRY_LEAVE, TryCatch #9 {RuntimeException -> 0x0ac8, blocks: (B:256:0x0496, B:259:0x04a6, B:263:0x04b6, B:266:0x04c2, B:340:0x0713, B:342:0x071e, B:344:0x072d, B:347:0x0739, B:354:0x0757, B:355:0x075e, B:358:0x076c, B:359:0x0771, B:361:0x077b, B:363:0x0782, B:365:0x078c, B:368:0x079a, B:369:0x07a3, B:372:0x07b6, B:374:0x07d1, B:385:0x07e5, B:389:0x0803, B:396:0x0825, B:405:0x0864, B:406:0x086b, B:408:0x0886, B:409:0x088d, B:411:0x08a1, B:413:0x08ac, B:415:0x08bb, B:417:0x08d0, B:419:0x08e4, B:421:0x08ef, B:423:0x08fe, B:425:0x0913, B:426:0x091a, B:428:0x0925, B:430:0x0930, B:432:0x0945, B:434:0x0953, B:436:0x095e, B:438:0x0969, B:440:0x0988, B:442:0x09c9, B:443:0x09cf, B:445:0x09da, B:447:0x09e3, B:453:0x083a, B:455:0x0a11, B:457:0x0a1a, B:458:0x0a21, B:464:0x0a46, B:466:0x0a5b, B:470:0x0a85, B:471:0x0a8c, B:472:0x0a93, B:474:0x0aa6, B:477:0x0ab7, B:479:0x0ac0, B:486:0x0701, B:498:0x067a, B:325:0x0685, B:326:0x068a, B:327:0x0691, B:329:0x069a, B:270:0x04d2, B:271:0x04d9, B:273:0x04f4, B:286:0x056e, B:287:0x0575, B:288:0x057e, B:289:0x0585, B:291:0x0595, B:293:0x059e, B:297:0x05b1, B:300:0x05ce, B:301:0x05d5, B:302:0x05de, B:303:0x05e5, B:305:0x05f1, B:495:0x055f, B:276:0x050f, B:277:0x0516, B:280:0x0522, B:281:0x0527, B:282:0x052e, B:284:0x053d), top: B:255:0x0496, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x076c A[Catch: RuntimeException -> 0x0ac8, Exception -> 0x14d5, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x14d5, blocks: (B:354:0x0757, B:355:0x075e, B:358:0x076c, B:359:0x0771, B:361:0x077b, B:363:0x0782, B:365:0x078c, B:368:0x079a, B:369:0x07a3, B:372:0x07b6, B:374:0x07d1, B:385:0x07e5, B:389:0x0803, B:396:0x0825, B:442:0x09c9, B:443:0x09cf, B:445:0x09da, B:447:0x09e3, B:453:0x083a, B:455:0x0a11, B:457:0x0a1a, B:458:0x0a21), top: B:353:0x0757 }] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0baa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0c48  */
    /* JADX WARN: Type inference failed for: r0v297, types: [X.N3b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v855, types: [X.Hqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v867, types: [X.JLT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v873, types: [X.JKb, java.lang.Object] */
    @Override // com.facebook.msys.mci.MediaTranscoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void transcodeVideo(java.lang.String r302, com.facebook.msys.mci.VideoEdits r303, long r304, long r306, com.facebook.msys.mci.TranscodeVideoCompletionCallback r308) {
        /*
            Method dump skipped, instructions count: 5337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.transcoder.DefaultMediaTranscoder.transcodeVideo(java.lang.String, com.facebook.msys.mci.VideoEdits, long, long, com.facebook.msys.mci.TranscodeVideoCompletionCallback):void");
    }
}
