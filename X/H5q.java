package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.litho.LithoView;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.widget.CustomRelativeLayout;
import java.util.BitSet;
import java.util.List;

/* loaded from: H5q.class */
public final class H5q extends CustomRelativeLayout implements 7TS {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public AaE A04;
    public JLX A05;
    public boolean A06;
    public 6Tb A07;
    public final ColorDrawable A08;
    public final View A09;
    public final ImageView A0A;
    public final 1Br A0B;
    public final C66i A0C;
    public final QTv A0D;
    public final LithoView A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5q(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A0B = 1Bu.A00(49939);
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        setId(7TS.A00);
        A0C(2132542101);
        this.A0A = (ImageView) DKG.A0B(this, 2131364376);
        View requireViewById = requireViewById(2131364377);
        11T.A0A(requireViewById);
        this.A09 = requireViewById;
        this.A0E = (LithoView) DKG.A0B(this, 2131364375);
        ColorDrawable colorDrawable = new ColorDrawable(7zM.A02(context, 2MR.A0E));
        this.A08 = colorDrawable;
        colorDrawable.setAlpha(0);
        setBackground(colorDrawable);
        C66n qTv = new QTv(this);
        this.A0D = qTv;
        C66i A0W = AbstractC2326GOr.A0W(this.A0B);
        A0W.A09(C66h.A03(45.0d, 7.0d));
        A0W.A06 = true;
        A0W.A0A(qTv);
        this.A0C = A0W;
        setOnTouchListener(Rk4.A00);
    }

    public static void A00(Pair pair, GRS grs, GRD grd) {
        6TI r0 = grd.A0K;
        PlayerOrigin playerOrigin = ((GR4) pair.first).A00;
        grs.A0w(grd.A0E, grd.A0G, (C52j) null, playerOrigin, grd.A05(), r0, grd.A0f, false, false);
    }

    public static void A01(GRS grs, GRD grd, 6Tb r303) {
        Float f;
        if (!r303.A00.A0B() || (f = grd.A0P) == null) {
            return;
        }
        grs.A11(C52j.A14, f.floatValue());
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03fd A[Catch: all -> 0x05e3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x05e3, blocks: (B:15:0x00b0, B:16:0x00b5, B:20:0x00cb, B:28:0x00dd, B:29:0x00e4, B:30:0x00eb, B:31:0x00f2, B:33:0x00f9, B:34:0x00fe, B:37:0x010a, B:40:0x0116, B:41:0x011d, B:42:0x0124, B:44:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x013f, B:51:0x0146, B:52:0x014b, B:55:0x015c, B:58:0x016f, B:59:0x0176, B:60:0x017d, B:61:0x0184, B:68:0x01ef, B:69:0x01f6, B:70:0x01fd, B:72:0x0204, B:74:0x020b, B:75:0x0210, B:76:0x0217, B:77:0x021d, B:78:0x0224, B:79:0x022b, B:83:0x023b, B:85:0x0244, B:86:0x024a, B:88:0x0251, B:91:0x03af, B:92:0x03b4, B:94:0x03bd, B:96:0x03c3, B:98:0x03a9, B:100:0x03c8, B:101:0x03cd, B:102:0x03d3, B:104:0x03dd, B:106:0x03e5, B:107:0x03ea, B:108:0x03f1, B:111:0x03fd, B:114:0x0407, B:115:0x040e, B:118:0x0418, B:120:0x0420, B:123:0x0427, B:125:0x042d, B:126:0x0432, B:128:0x0439, B:131:0x0445, B:134:0x044f, B:136:0x0457, B:138:0x045e, B:140:0x0464, B:142:0x046b, B:145:0x0477, B:148:0x0483, B:152:0x048e, B:158:0x04a2, B:161:0x05df, B:163:0x05e2, B:165:0x04a5, B:167:0x04ab, B:169:0x04b0, B:177:0x04c3, B:179:0x04c5, B:180:0x04ca, B:181:0x04d0, B:182:0x04d5, B:183:0x04dc, B:184:0x04e3, B:185:0x04ea, B:186:0x04f1, B:187:0x04f8, B:188:0x04ff, B:189:0x0506, B:192:0x0510, B:193:0x0516, B:195:0x052b, B:197:0x053b, B:199:0x054b, B:201:0x055d, B:203:0x0567, B:205:0x056e, B:206:0x0572, B:208:0x0577, B:210:0x0582, B:212:0x025d, B:213:0x0264, B:214:0x026b, B:216:0x0274, B:218:0x027b, B:219:0x0280, B:220:0x0287, B:222:0x028e, B:224:0x0295, B:225:0x029a, B:226:0x02a1, B:227:0x02a7, B:228:0x02ae, B:229:0x02b5, B:233:0x02c5, B:235:0x02ce, B:236:0x02d4, B:238:0x02db, B:241:0x02e5, B:243:0x02eb, B:244:0x02f0, B:246:0x02f9, B:248:0x0301, B:250:0x0307, B:251:0x030c, B:252:0x0313, B:254:0x031c, B:256:0x0323, B:257:0x0328, B:258:0x032f, B:260:0x0336, B:262:0x033d, B:263:0x0342, B:264:0x0349, B:265:0x034f, B:266:0x0356, B:267:0x035d, B:271:0x036d, B:273:0x0376, B:274:0x037c, B:276:0x0383, B:279:0x038d, B:281:0x0393, B:282:0x0398, B:284:0x03a1, B:285:0x018e, B:288:0x019a, B:289:0x01a0, B:293:0x01ae, B:295:0x01b4, B:297:0x01bb, B:156:0x049d, B:171:0x04b2, B:174:0x04be), top: B:14:0x00b0, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0445 A[Catch: all -> 0x05e3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x05e3, blocks: (B:15:0x00b0, B:16:0x00b5, B:20:0x00cb, B:28:0x00dd, B:29:0x00e4, B:30:0x00eb, B:31:0x00f2, B:33:0x00f9, B:34:0x00fe, B:37:0x010a, B:40:0x0116, B:41:0x011d, B:42:0x0124, B:44:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x013f, B:51:0x0146, B:52:0x014b, B:55:0x015c, B:58:0x016f, B:59:0x0176, B:60:0x017d, B:61:0x0184, B:68:0x01ef, B:69:0x01f6, B:70:0x01fd, B:72:0x0204, B:74:0x020b, B:75:0x0210, B:76:0x0217, B:77:0x021d, B:78:0x0224, B:79:0x022b, B:83:0x023b, B:85:0x0244, B:86:0x024a, B:88:0x0251, B:91:0x03af, B:92:0x03b4, B:94:0x03bd, B:96:0x03c3, B:98:0x03a9, B:100:0x03c8, B:101:0x03cd, B:102:0x03d3, B:104:0x03dd, B:106:0x03e5, B:107:0x03ea, B:108:0x03f1, B:111:0x03fd, B:114:0x0407, B:115:0x040e, B:118:0x0418, B:120:0x0420, B:123:0x0427, B:125:0x042d, B:126:0x0432, B:128:0x0439, B:131:0x0445, B:134:0x044f, B:136:0x0457, B:138:0x045e, B:140:0x0464, B:142:0x046b, B:145:0x0477, B:148:0x0483, B:152:0x048e, B:158:0x04a2, B:161:0x05df, B:163:0x05e2, B:165:0x04a5, B:167:0x04ab, B:169:0x04b0, B:177:0x04c3, B:179:0x04c5, B:180:0x04ca, B:181:0x04d0, B:182:0x04d5, B:183:0x04dc, B:184:0x04e3, B:185:0x04ea, B:186:0x04f1, B:187:0x04f8, B:188:0x04ff, B:189:0x0506, B:192:0x0510, B:193:0x0516, B:195:0x052b, B:197:0x053b, B:199:0x054b, B:201:0x055d, B:203:0x0567, B:205:0x056e, B:206:0x0572, B:208:0x0577, B:210:0x0582, B:212:0x025d, B:213:0x0264, B:214:0x026b, B:216:0x0274, B:218:0x027b, B:219:0x0280, B:220:0x0287, B:222:0x028e, B:224:0x0295, B:225:0x029a, B:226:0x02a1, B:227:0x02a7, B:228:0x02ae, B:229:0x02b5, B:233:0x02c5, B:235:0x02ce, B:236:0x02d4, B:238:0x02db, B:241:0x02e5, B:243:0x02eb, B:244:0x02f0, B:246:0x02f9, B:248:0x0301, B:250:0x0307, B:251:0x030c, B:252:0x0313, B:254:0x031c, B:256:0x0323, B:257:0x0328, B:258:0x032f, B:260:0x0336, B:262:0x033d, B:263:0x0342, B:264:0x0349, B:265:0x034f, B:266:0x0356, B:267:0x035d, B:271:0x036d, B:273:0x0376, B:274:0x037c, B:276:0x0383, B:279:0x038d, B:281:0x0393, B:282:0x0398, B:284:0x03a1, B:285:0x018e, B:288:0x019a, B:289:0x01a0, B:293:0x01ae, B:295:0x01b4, B:297:0x01bb, B:156:0x049d, B:171:0x04b2, B:174:0x04be), top: B:14:0x00b0, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0477 A[Catch: all -> 0x05e3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x05e3, blocks: (B:15:0x00b0, B:16:0x00b5, B:20:0x00cb, B:28:0x00dd, B:29:0x00e4, B:30:0x00eb, B:31:0x00f2, B:33:0x00f9, B:34:0x00fe, B:37:0x010a, B:40:0x0116, B:41:0x011d, B:42:0x0124, B:44:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x013f, B:51:0x0146, B:52:0x014b, B:55:0x015c, B:58:0x016f, B:59:0x0176, B:60:0x017d, B:61:0x0184, B:68:0x01ef, B:69:0x01f6, B:70:0x01fd, B:72:0x0204, B:74:0x020b, B:75:0x0210, B:76:0x0217, B:77:0x021d, B:78:0x0224, B:79:0x022b, B:83:0x023b, B:85:0x0244, B:86:0x024a, B:88:0x0251, B:91:0x03af, B:92:0x03b4, B:94:0x03bd, B:96:0x03c3, B:98:0x03a9, B:100:0x03c8, B:101:0x03cd, B:102:0x03d3, B:104:0x03dd, B:106:0x03e5, B:107:0x03ea, B:108:0x03f1, B:111:0x03fd, B:114:0x0407, B:115:0x040e, B:118:0x0418, B:120:0x0420, B:123:0x0427, B:125:0x042d, B:126:0x0432, B:128:0x0439, B:131:0x0445, B:134:0x044f, B:136:0x0457, B:138:0x045e, B:140:0x0464, B:142:0x046b, B:145:0x0477, B:148:0x0483, B:152:0x048e, B:158:0x04a2, B:161:0x05df, B:163:0x05e2, B:165:0x04a5, B:167:0x04ab, B:169:0x04b0, B:177:0x04c3, B:179:0x04c5, B:180:0x04ca, B:181:0x04d0, B:182:0x04d5, B:183:0x04dc, B:184:0x04e3, B:185:0x04ea, B:186:0x04f1, B:187:0x04f8, B:188:0x04ff, B:189:0x0506, B:192:0x0510, B:193:0x0516, B:195:0x052b, B:197:0x053b, B:199:0x054b, B:201:0x055d, B:203:0x0567, B:205:0x056e, B:206:0x0572, B:208:0x0577, B:210:0x0582, B:212:0x025d, B:213:0x0264, B:214:0x026b, B:216:0x0274, B:218:0x027b, B:219:0x0280, B:220:0x0287, B:222:0x028e, B:224:0x0295, B:225:0x029a, B:226:0x02a1, B:227:0x02a7, B:228:0x02ae, B:229:0x02b5, B:233:0x02c5, B:235:0x02ce, B:236:0x02d4, B:238:0x02db, B:241:0x02e5, B:243:0x02eb, B:244:0x02f0, B:246:0x02f9, B:248:0x0301, B:250:0x0307, B:251:0x030c, B:252:0x0313, B:254:0x031c, B:256:0x0323, B:257:0x0328, B:258:0x032f, B:260:0x0336, B:262:0x033d, B:263:0x0342, B:264:0x0349, B:265:0x034f, B:266:0x0356, B:267:0x035d, B:271:0x036d, B:273:0x0376, B:274:0x037c, B:276:0x0383, B:279:0x038d, B:281:0x0393, B:282:0x0398, B:284:0x03a1, B:285:0x018e, B:288:0x019a, B:289:0x01a0, B:293:0x01ae, B:295:0x01b4, B:297:0x01bb, B:156:0x049d, B:171:0x04b2, B:174:0x04be), top: B:14:0x00b0, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(X.H5q r301) {
        /*
            Method dump skipped, instructions count: 1534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H5q.A02(X.H5q):void");
    }

    public final void A0D() {
        GRD grd;
        6Tb r0 = this.A07;
        ViewGroup viewGroup = null;
        if (r0 == null) {
            11T.A0L("videoStateManager");
            throw 0Q8.createAndThrow();
        }
        Pair pair = (Pair) r0.A0F.peekLast();
        if (pair != null) {
            grd = (GRD) pair.second;
            if (grd != null) {
                viewGroup = grd.A03();
            }
        } else {
            grd = null;
        }
        JLX jlx = this.A05;
        if (jlx != null) {
            jlx.Bl9(grd);
        }
        if (viewGroup != null) {
            int[] A1b = GOn.A1b();
            viewGroup.getLocationInWindow(A1b);
            int i = A1b[0];
            int i2 = A1b[1];
            if (i != 0 || i2 != 0) {
                this.A0D.A00 = false;
                this.A00 = i;
                this.A01 = i2;
                this.A0A.setVisibility(4);
                this.A0C.A07(0.0d);
            }
        }
        this.A0D.A00 = true;
        this.A0A.setVisibility(4);
        this.A0C.A07(0.0d);
    }

    public final void A0E(C5j5 c5j5, PlayerOrigin playerOrigin, 6Tb r304, AaE aaE, 6TI r306, JLX jlx, List list) {
        int A05 = 7zP.A05(list, playerOrigin, 0);
        11T.A0F(r304, 4);
        11T.A0F(c5j5, 6);
        this.A04 = aaE;
        this.A07 = r304;
        this.A05 = jlx;
        LithoView lithoView = this.A0E;
        GR8 gr8 = new GR8(lithoView.A09, new 88K());
        QUd qUd = new QUd();
        88K r0 = gr8.A01;
        r0.A05 = qUd;
        BitSet bitSet = gr8.A02;
        bitSet.set(1);
        r0.A06 = new H1W(jlx, this);
        r0.A03 = playerOrigin;
        bitSet.set(3);
        r0.A02 = 6TN.A09;
        r0.A09 = list;
        bitSet.set(0);
        r0.A0B = true;
        bitSet.set(5);
        r0.A07 = r306;
        bitSet.set(4);
        bitSet.set(A05);
        r0.A01 = c5j5;
        r0.A00 = aaE.getAspectRatio();
        bitSet.set(6);
        r0.A0D = true;
        lithoView.A0x(gr8.A2W());
        this.A06 = false;
    }

    public void onBackPressed() {
        this.A0A.callOnClick();
    }
}
