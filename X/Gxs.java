package X;

import com.facebook.rsys.networkinfo.gen.NetworkInfoCallback;
import com.facebook.rsys.networkinfo.gen.NetworkInfoProxy;
import java.util.HashMap;
import java.util.Timer;

/* loaded from: Gxs.class */
public final class Gxs extends NetworkInfoProxy implements C3lq, 2Dh {
    public 2DH A00;
    public C03703yt A01;
    public 5YO A02;
    public NetworkInfoCallback A03;
    public Integer A04;
    public int A06;
    public Timer A08;
    public final C01i A0D;
    public final C01i A0E;
    public final C01i A0F;
    public final C01i A0G;
    public final HashMap A0H;
    public final 1Br A0B = 1BK.A0C();
    public final 1Br A09 = 1Bq.A00(16918);
    public final 1Br A0C = 1Bq.A00(49776);
    public final 1Br A0A = 1Bq.A00(115735);
    public String A05 = "unknown";
    public Long A07 = 4YV.A0i();

    public Gxs() {
        C03i c03i = C03i.A02;
        this.A0D = J9t.A00(this, c03i, 49);
        this.A0E = C01g.A00(c03i, new AQV(this, 0));
        this.A0F = C01g.A00(c03i, new AQV(this, 1));
        this.A0G = C01g.A00(c03i, new AQV(this, 2));
        this.A0H = AnonymousClass001.A0u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:299:0x014c, code lost:
    
        if (r0.equals("lte") == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e6 A[Catch: all -> 0x0649, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0002, B:5:0x0007, B:7:0x000c, B:9:0x0015, B:12:0x0021, B:13:0x0026, B:15:0x002d, B:19:0x05d6, B:20:0x05dc, B:21:0x05e3, B:24:0x05f0, B:26:0x05f8, B:32:0x0642, B:39:0x0605, B:40:0x060b, B:42:0x0614, B:44:0x061e, B:45:0x0625, B:47:0x0636, B:49:0x003b, B:53:0x004a, B:55:0x004f, B:59:0x005c, B:62:0x0077, B:64:0x0082, B:67:0x0099, B:72:0x0504, B:74:0x0514, B:75:0x051a, B:77:0x0523, B:79:0x0533, B:80:0x0539, B:82:0x0542, B:84:0x054f, B:86:0x0558, B:87:0x055e, B:89:0x0567, B:91:0x0574, B:93:0x057d, B:94:0x0583, B:96:0x058c, B:98:0x0592, B:100:0x059a, B:101:0x05a1, B:105:0x05b5, B:106:0x05bb, B:108:0x05c3, B:112:0x05d0, B:113:0x04fb, B:117:0x0070, B:118:0x00b6, B:121:0x00c4, B:122:0x00ca, B:126:0x0108, B:128:0x01b6, B:132:0x01c3, B:136:0x01cc, B:138:0x01d5, B:141:0x01e6, B:144:0x01ef, B:146:0x01f9, B:148:0x0202, B:151:0x0213, B:154:0x021c, B:156:0x0226, B:157:0x022c, B:159:0x0235, B:161:0x023e, B:162:0x0244, B:164:0x024d, B:166:0x0253, B:170:0x02bb, B:172:0x02c8, B:176:0x02e1, B:178:0x02ea, B:180:0x02f0, B:182:0x02f8, B:188:0x0312, B:189:0x0319, B:190:0x031f, B:192:0x0328, B:194:0x0331, B:195:0x0338, B:196:0x033e, B:198:0x03bd, B:200:0x03c6, B:202:0x03d4, B:204:0x03de, B:205:0x03e5, B:206:0x03f8, B:207:0x03ff, B:209:0x040d, B:212:0x041b, B:214:0x0423, B:215:0x042a, B:218:0x043b, B:219:0x0441, B:220:0x044a, B:224:0x0481, B:240:0x046f, B:241:0x0478, B:250:0x04c4, B:251:0x04ca, B:253:0x04d3, B:256:0x034a, B:257:0x0351, B:258:0x0357, B:260:0x0360, B:262:0x0369, B:263:0x0370, B:264:0x0376, B:266:0x037f, B:268:0x0388, B:269:0x038f, B:270:0x0395, B:272:0x039e, B:274:0x03a7, B:275:0x03ae, B:276:0x03b4, B:285:0x04e8, B:287:0x0115, B:292:0x012c, B:297:0x0143, B:302:0x0157, B:307:0x016e, B:311:0x0181, B:313:0x018b, B:317:0x019c), top: B:3:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0213 A[Catch: all -> 0x0649, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0002, B:5:0x0007, B:7:0x000c, B:9:0x0015, B:12:0x0021, B:13:0x0026, B:15:0x002d, B:19:0x05d6, B:20:0x05dc, B:21:0x05e3, B:24:0x05f0, B:26:0x05f8, B:32:0x0642, B:39:0x0605, B:40:0x060b, B:42:0x0614, B:44:0x061e, B:45:0x0625, B:47:0x0636, B:49:0x003b, B:53:0x004a, B:55:0x004f, B:59:0x005c, B:62:0x0077, B:64:0x0082, B:67:0x0099, B:72:0x0504, B:74:0x0514, B:75:0x051a, B:77:0x0523, B:79:0x0533, B:80:0x0539, B:82:0x0542, B:84:0x054f, B:86:0x0558, B:87:0x055e, B:89:0x0567, B:91:0x0574, B:93:0x057d, B:94:0x0583, B:96:0x058c, B:98:0x0592, B:100:0x059a, B:101:0x05a1, B:105:0x05b5, B:106:0x05bb, B:108:0x05c3, B:112:0x05d0, B:113:0x04fb, B:117:0x0070, B:118:0x00b6, B:121:0x00c4, B:122:0x00ca, B:126:0x0108, B:128:0x01b6, B:132:0x01c3, B:136:0x01cc, B:138:0x01d5, B:141:0x01e6, B:144:0x01ef, B:146:0x01f9, B:148:0x0202, B:151:0x0213, B:154:0x021c, B:156:0x0226, B:157:0x022c, B:159:0x0235, B:161:0x023e, B:162:0x0244, B:164:0x024d, B:166:0x0253, B:170:0x02bb, B:172:0x02c8, B:176:0x02e1, B:178:0x02ea, B:180:0x02f0, B:182:0x02f8, B:188:0x0312, B:189:0x0319, B:190:0x031f, B:192:0x0328, B:194:0x0331, B:195:0x0338, B:196:0x033e, B:198:0x03bd, B:200:0x03c6, B:202:0x03d4, B:204:0x03de, B:205:0x03e5, B:206:0x03f8, B:207:0x03ff, B:209:0x040d, B:212:0x041b, B:214:0x0423, B:215:0x042a, B:218:0x043b, B:219:0x0441, B:220:0x044a, B:224:0x0481, B:240:0x046f, B:241:0x0478, B:250:0x04c4, B:251:0x04ca, B:253:0x04d3, B:256:0x034a, B:257:0x0351, B:258:0x0357, B:260:0x0360, B:262:0x0369, B:263:0x0370, B:264:0x0376, B:266:0x037f, B:268:0x0388, B:269:0x038f, B:270:0x0395, B:272:0x039e, B:274:0x03a7, B:275:0x03ae, B:276:0x03b4, B:285:0x04e8, B:287:0x0115, B:292:0x012c, B:297:0x0143, B:302:0x0157, B:307:0x016e, B:311:0x0181, B:313:0x018b, B:317:0x019c), top: B:3:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0481 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x040d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x05f0 A[Catch: all -> 0x0649, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0002, B:5:0x0007, B:7:0x000c, B:9:0x0015, B:12:0x0021, B:13:0x0026, B:15:0x002d, B:19:0x05d6, B:20:0x05dc, B:21:0x05e3, B:24:0x05f0, B:26:0x05f8, B:32:0x0642, B:39:0x0605, B:40:0x060b, B:42:0x0614, B:44:0x061e, B:45:0x0625, B:47:0x0636, B:49:0x003b, B:53:0x004a, B:55:0x004f, B:59:0x005c, B:62:0x0077, B:64:0x0082, B:67:0x0099, B:72:0x0504, B:74:0x0514, B:75:0x051a, B:77:0x0523, B:79:0x0533, B:80:0x0539, B:82:0x0542, B:84:0x054f, B:86:0x0558, B:87:0x055e, B:89:0x0567, B:91:0x0574, B:93:0x057d, B:94:0x0583, B:96:0x058c, B:98:0x0592, B:100:0x059a, B:101:0x05a1, B:105:0x05b5, B:106:0x05bb, B:108:0x05c3, B:112:0x05d0, B:113:0x04fb, B:117:0x0070, B:118:0x00b6, B:121:0x00c4, B:122:0x00ca, B:126:0x0108, B:128:0x01b6, B:132:0x01c3, B:136:0x01cc, B:138:0x01d5, B:141:0x01e6, B:144:0x01ef, B:146:0x01f9, B:148:0x0202, B:151:0x0213, B:154:0x021c, B:156:0x0226, B:157:0x022c, B:159:0x0235, B:161:0x023e, B:162:0x0244, B:164:0x024d, B:166:0x0253, B:170:0x02bb, B:172:0x02c8, B:176:0x02e1, B:178:0x02ea, B:180:0x02f0, B:182:0x02f8, B:188:0x0312, B:189:0x0319, B:190:0x031f, B:192:0x0328, B:194:0x0331, B:195:0x0338, B:196:0x033e, B:198:0x03bd, B:200:0x03c6, B:202:0x03d4, B:204:0x03de, B:205:0x03e5, B:206:0x03f8, B:207:0x03ff, B:209:0x040d, B:212:0x041b, B:214:0x0423, B:215:0x042a, B:218:0x043b, B:219:0x0441, B:220:0x044a, B:224:0x0481, B:240:0x046f, B:241:0x0478, B:250:0x04c4, B:251:0x04ca, B:253:0x04d3, B:256:0x034a, B:257:0x0351, B:258:0x0357, B:260:0x0360, B:262:0x0369, B:263:0x0370, B:264:0x0376, B:266:0x037f, B:268:0x0388, B:269:0x038f, B:270:0x0395, B:272:0x039e, B:274:0x03a7, B:275:0x03ae, B:276:0x03b4, B:285:0x04e8, B:287:0x0115, B:292:0x012c, B:297:0x0143, B:302:0x0157, B:307:0x016e, B:311:0x0181, B:313:0x018b, B:317:0x019c), top: B:3:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x063f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.Gxs r301, com.facebook.rsys.networkinfo.gen.NetworkInfoCallback r302) {
        /*
            Method dump skipped, instructions count: 1616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gxs.A00(X.Gxs, com.facebook.rsys.networkinfo.gen.NetworkInfoCallback):void");
    }

    public static final void A01(Object obj, HashMap hashMap, 07E r303, int i) {
        Integer num;
        Integer A00;
        if (!(obj instanceof Integer) || (num = (Integer) obj) == null || (A00 = Hww.A00(num, r303, 0)) == null) {
            return;
        }
        GOn.A1Y(Integer.valueOf(i), hashMap, A00.intValue());
    }

    @Override // X.C3lq
    public void Bnb(5YK r302) {
    }

    @Override // X.C3lq
    public void Bnc(C03703yt c03703yt) {
        synchronized (this) {
            this.A01 = c03703yt;
            NetworkInfoCallback networkInfoCallback = this.A03;
            if (networkInfoCallback != null) {
                A00(this, networkInfoCallback);
            }
        }
    }

    public void Bqw(String str) {
        11T.A0F(str, 0);
        0fH.A0j("OrcaNetworkInfoProxyImpl", 0Pz.A0W("Radio signals: connection type changed to ", str));
        this.A05 = str;
        NetworkInfoCallback networkInfoCallback = this.A03;
        if (networkInfoCallback != null) {
            A00(this, networkInfoCallback);
        }
    }

    @Override // com.facebook.rsys.networkinfo.gen.NetworkInfoProxy
    public void start(NetworkInfoCallback networkInfoCallback) {
        synchronized (this) {
            11T.A0F(networkInfoCallback, 0);
            if (1Br.A06(this.A0B).AZk(36320180485307537L)) {
                stop();
                0fH.A0j("OrcaNetworkInfoProxyImpl", "Radio signals: starting OrcaNetworkInfoProxyImpl...");
                this.A03 = networkInfoCallback;
                this.A00 = ((2Ar) 1Br.A0B(this.A09)).A00();
                this.A02 = ((5YL) 1Br.A0B(this.A0C)).A00();
                2DH r0 = this.A00;
                this.A01 = r0 != null ? (C03703yt) r0.A0N.get() : null;
                C00i c00i = this.A0A.A00;
                this.A05 = ((2D2) c00i.get()).A02;
                this.A07 = 0L;
                A00(this, networkInfoCallback);
                2DH r02 = this.A00;
                if (r02 != null) {
                    r02.A0j(this);
                }
                2D0 r03 = (2D2) c00i.get();
                r03.A01.add(this);
                Bqw(r03.A02);
                Timer timer = new Timer();
                timer.schedule(new J7W(this), 0L, AnonymousClass001.A05(this.A0G.getValue()));
                this.A08 = timer;
            } else {
                0fH.A0j("OrcaNetworkInfoProxyImpl", "Radio signals: MC: orca logging is disabled");
            }
        }
    }

    @Override // com.facebook.rsys.networkinfo.gen.NetworkInfoProxy
    public void stop() {
        synchronized (this) {
            0fH.A0j("OrcaNetworkInfoProxyImpl", "Radio signals: stopping OrcaNetworkInfoProxyImpl...");
            if (this.A03 != null) {
                Timer timer = this.A08;
                if (timer != null) {
                    timer.cancel();
                }
                this.A08 = null;
                this.A02 = null;
                2DH r0 = this.A00;
                if (r0 != null) {
                    r0.A0K.remove(this);
                }
                this.A00 = null;
                ((2D2) 1Br.A0B(this.A0A)).A01.remove(this);
                this.A03 = null;
            }
        }
    }
}
