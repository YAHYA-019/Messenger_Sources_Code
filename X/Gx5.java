package X;

import com.facebook.rsys.datachannel.gen.DataChannelConfig;
import com.facebook.rsys.datachannel.gen.DataTransportListener;

/* loaded from: Gx5.class */
public final class Gx5 extends DataTransportListener {
    public final /* synthetic */ IFG A00;
    public final /* synthetic */ DataChannelConfig A01;
    public final /* synthetic */ String A02;

    public Gx5(IFG ifg, DataChannelConfig dataChannelConfig, String str) {
        this.A01 = dataChannelConfig;
        this.A00 = ifg;
        this.A02 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0396, code lost:
    
        if (r0.equals("RTC_REMOTE_COMMAND") == false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0212 A[Catch: Exception -> 0x022f, all -> 0x0249, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x022f, blocks: (B:76:0x01b5, B:80:0x01c3, B:83:0x01cf, B:86:0x01e7, B:87:0x01ee, B:88:0x01f5, B:90:0x01fe, B:91:0x0205, B:92:0x020a, B:92:0x020a, B:95:0x0219, B:96:0x021e, B:102:0x0212, B:104:0x01db), top: B:75:0x01b5, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0329 A[Catch: Exception -> 0x04f5, all -> 0x04fa, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x04f5, blocks: (B:134:0x02be, B:135:0x02c3, B:138:0x02f8, B:139:0x02ff, B:140:0x0306, B:141:0x030d, B:142:0x0314, B:143:0x031b, B:146:0x0329, B:147:0x0332, B:149:0x033d, B:156:0x03a3, B:159:0x03af, B:160:0x03b6, B:161:0x03bd, B:162:0x03c4, B:164:0x03cf, B:168:0x03e1, B:171:0x03ed, B:172:0x03f4, B:174:0x03fb, B:176:0x0400, B:178:0x040e, B:179:0x0440, B:180:0x0447, B:181:0x044e, B:183:0x0457, B:185:0x04d7, B:187:0x04de, B:190:0x0419, B:191:0x0420, B:192:0x0427, B:194:0x0435, B:197:0x0466, B:200:0x0472, B:202:0x0479, B:204:0x0487, B:205:0x04b9, B:206:0x04c0, B:207:0x04c7, B:209:0x04d0, B:212:0x0492, B:213:0x0499, B:214:0x04a0, B:216:0x04ae, B:219:0x0354, B:222:0x0360, B:223:0x0367, B:224:0x036e, B:225:0x0375, B:227:0x037e, B:229:0x038d), top: B:133:0x02be, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03af A[Catch: Exception -> 0x04f5, all -> 0x04fa, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x04f5, blocks: (B:134:0x02be, B:135:0x02c3, B:138:0x02f8, B:139:0x02ff, B:140:0x0306, B:141:0x030d, B:142:0x0314, B:143:0x031b, B:146:0x0329, B:147:0x0332, B:149:0x033d, B:156:0x03a3, B:159:0x03af, B:160:0x03b6, B:161:0x03bd, B:162:0x03c4, B:164:0x03cf, B:168:0x03e1, B:171:0x03ed, B:172:0x03f4, B:174:0x03fb, B:176:0x0400, B:178:0x040e, B:179:0x0440, B:180:0x0447, B:181:0x044e, B:183:0x0457, B:185:0x04d7, B:187:0x04de, B:190:0x0419, B:191:0x0420, B:192:0x0427, B:194:0x0435, B:197:0x0466, B:200:0x0472, B:202:0x0479, B:204:0x0487, B:205:0x04b9, B:206:0x04c0, B:207:0x04c7, B:209:0x04d0, B:212:0x0492, B:213:0x0499, B:214:0x04a0, B:216:0x04ae, B:219:0x0354, B:222:0x0360, B:223:0x0367, B:224:0x036e, B:225:0x0375, B:227:0x037e, B:229:0x038d), top: B:133:0x02be, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e7 A[Catch: Exception -> 0x022f, all -> 0x0249, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x022f, blocks: (B:76:0x01b5, B:80:0x01c3, B:83:0x01cf, B:86:0x01e7, B:87:0x01ee, B:88:0x01f5, B:90:0x01fe, B:91:0x0205, B:92:0x020a, B:92:0x020a, B:95:0x0219, B:96:0x021e, B:102:0x0212, B:104:0x01db), top: B:75:0x01b5, outer: #4 }] */
    @Override // com.facebook.rsys.datachannel.gen.DataTransportListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMessage(byte[] r302, java.lang.String r303, java.lang.Long r304) {
        /*
            Method dump skipped, instructions count: 1606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gx5.onMessage(byte[], java.lang.String, java.lang.Long):void");
    }

    @Override // com.facebook.rsys.datachannel.gen.DataTransportListener
    public void onReady() {
    }
}
