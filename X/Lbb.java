package X;

import android.net.LocalSocket;
import android.net.Uri;
import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: Lbb.class */
public final class Lbb implements 6D6 {
    public long A00;
    public long A01;
    public 6DQ A02;
    public 5M9 A03;
    public DataInputStream A04;
    public LocalSocket A05;
    public OutputStream A06;
    public java.util.Map A07;
    public boolean A08;
    public final java.util.Map A09 = AnonymousClass001.A0u();
    public final int A0A;
    public final int A0B;
    public final 6D1 A0C;
    public final HeroPlayerSetting A0D;
    public final String A0E;
    public final AtomicReference A0F;
    public static final AtomicInteger A0H = new AtomicInteger();
    public static final Pattern A0G = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    public Lbb(6D1 r302, HeroPlayerSetting heroPlayerSetting, 5M9 r304, String str, AtomicReference atomicReference, int i) {
        this.A03 = r304;
        this.A0E = str;
        this.A0A = i;
        this.A0B = heroPlayerSetting.predictiveDashReadTimeoutMs;
        this.A0D = heroPlayerSetting;
        this.A0F = atomicReference;
        this.A0C = r302;
    }

    public static String A00(String str, Object obj) {
        return AnonymousClass001.A0Z(obj, ": ", AnonymousClass001.A0o(str));
    }

    private void A01() {
        OutputStream outputStream = this.A06;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
        this.A06 = null;
        DataInputStream dataInputStream = this.A04;
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (IOException unused2) {
            }
        }
        this.A04 = null;
        try {
            LocalSocket localSocket = this.A05;
            if (localSocket != null) {
                localSocket.close();
            }
        } catch (Exception unused3) {
        }
        this.A05 = null;
    }

    public static void A02(Lbb lbb, Object obj, String str) {
        lbb.A03(A00(str, obj));
    }

    private void A03(String str) {
        OutputStream outputStream = this.A06;
        if (outputStream != null) {
            outputStream.write(0Pz.A0W(str, HttpRequestMultipart.LINE_FEED).getBytes());
        }
    }

    public void A7c(5M9 r302) {
        r302.getClass();
        this.A03 = r302;
    }

    public void AEa(byte b, boolean z) {
    }

    public java.util.Map B7n() {
        return this.A07;
    }

    public Uri BIM() {
        6DQ r0 = this.A02;
        if (r0 != null) {
            return r0.A06;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x018d, code lost:
    
        if (r326 >= 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01cb, code lost:
    
        if (r0 != 0) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x033f A[Catch: IOException -> 0x09f7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x09f7, blocks: (B:78:0x0296, B:80:0x02a0, B:83:0x02ac, B:85:0x02b4, B:87:0x02ba, B:88:0x02bf, B:90:0x02c7, B:92:0x02cd, B:93:0x02d2, B:94:0x02d9, B:96:0x02e0, B:97:0x02e6, B:98:0x02ec, B:100:0x02f6, B:102:0x0300, B:104:0x030a, B:106:0x0311, B:110:0x032f, B:112:0x0335, B:115:0x033f, B:119:0x0353, B:121:0x0359, B:126:0x0368, B:129:0x0373, B:130:0x037a, B:134:0x038b, B:136:0x0395, B:139:0x03a4, B:141:0x03aa, B:143:0x03b1, B:163:0x03fc, B:165:0x0402, B:166:0x0407, B:168:0x040e, B:170:0x041f, B:172:0x0429, B:174:0x0433, B:175:0x043a, B:177:0x0444, B:179:0x044a, B:183:0x0459, B:184:0x0460, B:185:0x0467, B:186:0x046e, B:188:0x0478, B:190:0x0482, B:192:0x048c, B:194:0x0496, B:195:0x049c, B:196:0x04a3, B:197:0x04aa, B:199:0x04b4, B:202:0x04c3, B:203:0x04c9, B:204:0x04d0, B:205:0x04d7, B:207:0x04e1, B:209:0x04ea, B:210:0x04f1, B:211:0x04f7, B:212:0x04fe, B:213:0x0505, B:215:0x050f, B:217:0x0519, B:218:0x051f, B:219:0x0526, B:220:0x052d, B:222:0x0537, B:224:0x053d, B:225:0x0542, B:226:0x0549, B:230:0x055a, B:231:0x0561, B:233:0x056b, B:235:0x0571, B:239:0x0580, B:240:0x0586, B:243:0x0592, B:246:0x059e, B:249:0x05ae, B:252:0x05bd, B:255:0x05c9, B:259:0x05ea, B:261:0x05f4, B:263:0x0601, B:264:0x0609, B:265:0x0611, B:267:0x061d, B:269:0x062a, B:270:0x0632, B:271:0x063a, B:272:0x0641, B:274:0x0649, B:279:0x065f, B:280:0x0667, B:281:0x066f, B:283:0x0679, B:287:0x05e0, B:290:0x0683, B:291:0x0688, B:291:0x0688, B:293:0x068d, B:296:0x0698, B:300:0x09d6, B:302:0x09f6, B:305:0x06bb, B:306:0x06c1, B:310:0x06ce, B:313:0x06d9, B:315:0x06e2, B:317:0x06ee, B:318:0x06f5, B:323:0x0709, B:325:0x0714, B:329:0x0723, B:330:0x072a, B:332:0x0733, B:333:0x073a, B:334:0x0741, B:335:0x074c, B:337:0x0757, B:342:0x0767, B:409:0x09ed, B:415:0x0319), top: B:77:0x0296 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0373 A[Catch: IOException -> 0x09f7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x09f7, blocks: (B:78:0x0296, B:80:0x02a0, B:83:0x02ac, B:85:0x02b4, B:87:0x02ba, B:88:0x02bf, B:90:0x02c7, B:92:0x02cd, B:93:0x02d2, B:94:0x02d9, B:96:0x02e0, B:97:0x02e6, B:98:0x02ec, B:100:0x02f6, B:102:0x0300, B:104:0x030a, B:106:0x0311, B:110:0x032f, B:112:0x0335, B:115:0x033f, B:119:0x0353, B:121:0x0359, B:126:0x0368, B:129:0x0373, B:130:0x037a, B:134:0x038b, B:136:0x0395, B:139:0x03a4, B:141:0x03aa, B:143:0x03b1, B:163:0x03fc, B:165:0x0402, B:166:0x0407, B:168:0x040e, B:170:0x041f, B:172:0x0429, B:174:0x0433, B:175:0x043a, B:177:0x0444, B:179:0x044a, B:183:0x0459, B:184:0x0460, B:185:0x0467, B:186:0x046e, B:188:0x0478, B:190:0x0482, B:192:0x048c, B:194:0x0496, B:195:0x049c, B:196:0x04a3, B:197:0x04aa, B:199:0x04b4, B:202:0x04c3, B:203:0x04c9, B:204:0x04d0, B:205:0x04d7, B:207:0x04e1, B:209:0x04ea, B:210:0x04f1, B:211:0x04f7, B:212:0x04fe, B:213:0x0505, B:215:0x050f, B:217:0x0519, B:218:0x051f, B:219:0x0526, B:220:0x052d, B:222:0x0537, B:224:0x053d, B:225:0x0542, B:226:0x0549, B:230:0x055a, B:231:0x0561, B:233:0x056b, B:235:0x0571, B:239:0x0580, B:240:0x0586, B:243:0x0592, B:246:0x059e, B:249:0x05ae, B:252:0x05bd, B:255:0x05c9, B:259:0x05ea, B:261:0x05f4, B:263:0x0601, B:264:0x0609, B:265:0x0611, B:267:0x061d, B:269:0x062a, B:270:0x0632, B:271:0x063a, B:272:0x0641, B:274:0x0649, B:279:0x065f, B:280:0x0667, B:281:0x066f, B:283:0x0679, B:287:0x05e0, B:290:0x0683, B:291:0x0688, B:291:0x0688, B:293:0x068d, B:296:0x0698, B:300:0x09d6, B:302:0x09f6, B:305:0x06bb, B:306:0x06c1, B:310:0x06ce, B:313:0x06d9, B:315:0x06e2, B:317:0x06ee, B:318:0x06f5, B:323:0x0709, B:325:0x0714, B:329:0x0723, B:330:0x072a, B:332:0x0733, B:333:0x073a, B:334:0x0741, B:335:0x074c, B:337:0x0757, B:342:0x0767, B:409:0x09ed, B:415:0x0319), top: B:77:0x0296 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0319 A[Catch: IOException -> 0x09f7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x09f7, blocks: (B:78:0x0296, B:80:0x02a0, B:83:0x02ac, B:85:0x02b4, B:87:0x02ba, B:88:0x02bf, B:90:0x02c7, B:92:0x02cd, B:93:0x02d2, B:94:0x02d9, B:96:0x02e0, B:97:0x02e6, B:98:0x02ec, B:100:0x02f6, B:102:0x0300, B:104:0x030a, B:106:0x0311, B:110:0x032f, B:112:0x0335, B:115:0x033f, B:119:0x0353, B:121:0x0359, B:126:0x0368, B:129:0x0373, B:130:0x037a, B:134:0x038b, B:136:0x0395, B:139:0x03a4, B:141:0x03aa, B:143:0x03b1, B:163:0x03fc, B:165:0x0402, B:166:0x0407, B:168:0x040e, B:170:0x041f, B:172:0x0429, B:174:0x0433, B:175:0x043a, B:177:0x0444, B:179:0x044a, B:183:0x0459, B:184:0x0460, B:185:0x0467, B:186:0x046e, B:188:0x0478, B:190:0x0482, B:192:0x048c, B:194:0x0496, B:195:0x049c, B:196:0x04a3, B:197:0x04aa, B:199:0x04b4, B:202:0x04c3, B:203:0x04c9, B:204:0x04d0, B:205:0x04d7, B:207:0x04e1, B:209:0x04ea, B:210:0x04f1, B:211:0x04f7, B:212:0x04fe, B:213:0x0505, B:215:0x050f, B:217:0x0519, B:218:0x051f, B:219:0x0526, B:220:0x052d, B:222:0x0537, B:224:0x053d, B:225:0x0542, B:226:0x0549, B:230:0x055a, B:231:0x0561, B:233:0x056b, B:235:0x0571, B:239:0x0580, B:240:0x0586, B:243:0x0592, B:246:0x059e, B:249:0x05ae, B:252:0x05bd, B:255:0x05c9, B:259:0x05ea, B:261:0x05f4, B:263:0x0601, B:264:0x0609, B:265:0x0611, B:267:0x061d, B:269:0x062a, B:270:0x0632, B:271:0x063a, B:272:0x0641, B:274:0x0649, B:279:0x065f, B:280:0x0667, B:281:0x066f, B:283:0x0679, B:287:0x05e0, B:290:0x0683, B:291:0x0688, B:291:0x0688, B:293:0x068d, B:296:0x0698, B:300:0x09d6, B:302:0x09f6, B:305:0x06bb, B:306:0x06c1, B:310:0x06ce, B:313:0x06d9, B:315:0x06e2, B:317:0x06ee, B:318:0x06f5, B:323:0x0709, B:325:0x0714, B:329:0x0723, B:330:0x072a, B:332:0x0733, B:333:0x073a, B:334:0x0741, B:335:0x074c, B:337:0x0757, B:342:0x0767, B:409:0x09ed, B:415:0x0319), top: B:77:0x0296 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ac A[Catch: IOException -> 0x09f7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x09f7, blocks: (B:78:0x0296, B:80:0x02a0, B:83:0x02ac, B:85:0x02b4, B:87:0x02ba, B:88:0x02bf, B:90:0x02c7, B:92:0x02cd, B:93:0x02d2, B:94:0x02d9, B:96:0x02e0, B:97:0x02e6, B:98:0x02ec, B:100:0x02f6, B:102:0x0300, B:104:0x030a, B:106:0x0311, B:110:0x032f, B:112:0x0335, B:115:0x033f, B:119:0x0353, B:121:0x0359, B:126:0x0368, B:129:0x0373, B:130:0x037a, B:134:0x038b, B:136:0x0395, B:139:0x03a4, B:141:0x03aa, B:143:0x03b1, B:163:0x03fc, B:165:0x0402, B:166:0x0407, B:168:0x040e, B:170:0x041f, B:172:0x0429, B:174:0x0433, B:175:0x043a, B:177:0x0444, B:179:0x044a, B:183:0x0459, B:184:0x0460, B:185:0x0467, B:186:0x046e, B:188:0x0478, B:190:0x0482, B:192:0x048c, B:194:0x0496, B:195:0x049c, B:196:0x04a3, B:197:0x04aa, B:199:0x04b4, B:202:0x04c3, B:203:0x04c9, B:204:0x04d0, B:205:0x04d7, B:207:0x04e1, B:209:0x04ea, B:210:0x04f1, B:211:0x04f7, B:212:0x04fe, B:213:0x0505, B:215:0x050f, B:217:0x0519, B:218:0x051f, B:219:0x0526, B:220:0x052d, B:222:0x0537, B:224:0x053d, B:225:0x0542, B:226:0x0549, B:230:0x055a, B:231:0x0561, B:233:0x056b, B:235:0x0571, B:239:0x0580, B:240:0x0586, B:243:0x0592, B:246:0x059e, B:249:0x05ae, B:252:0x05bd, B:255:0x05c9, B:259:0x05ea, B:261:0x05f4, B:263:0x0601, B:264:0x0609, B:265:0x0611, B:267:0x061d, B:269:0x062a, B:270:0x0632, B:271:0x063a, B:272:0x0641, B:274:0x0649, B:279:0x065f, B:280:0x0667, B:281:0x066f, B:283:0x0679, B:287:0x05e0, B:290:0x0683, B:291:0x0688, B:291:0x0688, B:293:0x068d, B:296:0x0698, B:300:0x09d6, B:302:0x09f6, B:305:0x06bb, B:306:0x06c1, B:310:0x06ce, B:313:0x06d9, B:315:0x06e2, B:317:0x06ee, B:318:0x06f5, B:323:0x0709, B:325:0x0714, B:329:0x0723, B:330:0x072a, B:332:0x0733, B:333:0x073a, B:334:0x0741, B:335:0x074c, B:337:0x0757, B:342:0x0767, B:409:0x09ed, B:415:0x0319), top: B:77:0x0296 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long CVO(X.6DQ r302) {
        /*
            Method dump skipped, instructions count: 2625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lbb.CVO(X.6DQ):long");
    }

    public /* synthetic */ void Cw5() {
    }

    public void cancel() {
    }

    public void close() {
        A01();
        if (this.A08) {
            this.A08 = false;
            5M9 r0 = this.A03;
            if (r0 != null) {
                6DQ r304 = this.A02;
                6DQ r02 = 6DQ.A0B;
                if (r304 == null) {
                    r304 = 6DQ.A0B;
                }
                r0.CRY(this, r304, true);
            }
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3;
        try {
            long j = this.A01;
            long j2 = -1;
            if (j != j2) {
                i2 = (int) Math.min(i2, j - this.A00);
            }
            if (i2 != 0) {
                DataInputStream dataInputStream = this.A04;
                if (dataInputStream != null) {
                    i3 = dataInputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.A00 += i3;
                        5M9 r0 = this.A03;
                        if (r0 != null) {
                            6DQ r318 = this.A02;
                            6DQ r02 = 6DQ.A0B;
                            if (r318 == null) {
                                r318 = 6DQ.A0B;
                            }
                            r0.Bm3(this, r318, i3, true);
                            return i3;
                        }
                        return i3;
                    }
                }
                long j3 = this.A01;
                if (j3 != j2 && j3 != this.A00) {
                    throw new EOFException();
                }
            }
            i3 = -1;
            return i3;
        } catch (IOException e) {
            6DQ r325 = this.A02;
            if (r325 == null) {
                r325 = new 6DQ(Uri.EMPTY, 0, -1);
            }
            throw new 6Db(r325, e, 2000, 2);
        }
    }
}
