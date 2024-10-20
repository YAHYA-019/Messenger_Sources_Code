package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3oo, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3oo.class */
public final class C00803oo {
    public java.util.Map A00 = new HashMap();
    public final List A01 = new ArrayList();
    public final 1vL A02;
    public final C00i A03;
    public final C00i A04;

    public C00803oo(1vL r302, C00i c00i, C00i c00i2) {
        this.A02 = r302;
        this.A04 = c00i;
        this.A03 = c00i2;
    }

    public static String A00(Integer num) {
        String str;
        switch (num.intValue()) {
            case 1:
                str = "TOGGLE_PAID_TO_FREE";
                break;
            case 2:
                str = "OPEN_UPSELL_SCREEN";
                break;
            case 3:
                str = "OPEN_CARRIER_PAGE";
                break;
            case 4:
                str = "OPEN_TOOLTIP_DIALOG";
                break;
            case 5:
                str = "OPEN_SWITCH_MODE_PAGE_EXPERIMENT";
                break;
            default:
                str = "TOGGLE_FREE_TO_PAID";
                break;
        }
        return str.toLowerCase(Locale.US);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149 A[Catch: all -> 0x044b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:5:0x0007, B:6:0x000c, B:7:0x0013, B:8:0x0018, B:9:0x001d, B:10:0x0025, B:12:0x004b, B:13:0x0050, B:15:0x0059, B:18:0x0064, B:19:0x0068, B:23:0x00b0, B:25:0x00b6, B:27:0x00c2, B:30:0x00cc, B:31:0x00d3, B:35:0x00e5, B:38:0x00f0, B:40:0x00fb, B:44:0x010b, B:47:0x0117, B:49:0x011f, B:53:0x012f, B:56:0x013b, B:59:0x0149, B:61:0x0153, B:66:0x0163, B:70:0x0172, B:72:0x017c, B:77:0x018c, B:81:0x019b, B:83:0x01a5, B:94:0x044a, B:108:0x01fe, B:111:0x0209, B:113:0x0214, B:116:0x021f, B:118:0x022a, B:122:0x0239, B:123:0x023f, B:124:0x0244, B:127:0x024f, B:129:0x025a, B:133:0x0269, B:134:0x026f, B:135:0x0274, B:138:0x027f, B:140:0x028a, B:144:0x0299, B:146:0x02a0, B:150:0x02af, B:151:0x02b5, B:154:0x02c0, B:156:0x02cb, B:159:0x02d6, B:162:0x02e1, B:163:0x02e5, B:166:0x02f0, B:167:0x02f6, B:168:0x02fe, B:170:0x030e, B:172:0x0317, B:173:0x031e, B:174:0x0326, B:176:0x0337, B:177:0x033e, B:180:0x034a, B:181:0x034e, B:182:0x0354, B:183:0x035c, B:185:0x0368, B:187:0x0370, B:190:0x037b, B:191:0x0380, B:192:0x0387, B:193:0x038f, B:198:0x03a5, B:200:0x03b8, B:202:0x041c, B:203:0x03c1, B:204:0x03c8, B:205:0x03ce, B:206:0x03d6, B:208:0x03e7, B:209:0x03ee, B:211:0x03fa, B:212:0x0400, B:215:0x040b, B:216:0x0412, B:218:0x0428, B:221:0x0433, B:85:0x043a, B:87:0x0441), top: B:3:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172 A[Catch: all -> 0x044b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:5:0x0007, B:6:0x000c, B:7:0x0013, B:8:0x0018, B:9:0x001d, B:10:0x0025, B:12:0x004b, B:13:0x0050, B:15:0x0059, B:18:0x0064, B:19:0x0068, B:23:0x00b0, B:25:0x00b6, B:27:0x00c2, B:30:0x00cc, B:31:0x00d3, B:35:0x00e5, B:38:0x00f0, B:40:0x00fb, B:44:0x010b, B:47:0x0117, B:49:0x011f, B:53:0x012f, B:56:0x013b, B:59:0x0149, B:61:0x0153, B:66:0x0163, B:70:0x0172, B:72:0x017c, B:77:0x018c, B:81:0x019b, B:83:0x01a5, B:94:0x044a, B:108:0x01fe, B:111:0x0209, B:113:0x0214, B:116:0x021f, B:118:0x022a, B:122:0x0239, B:123:0x023f, B:124:0x0244, B:127:0x024f, B:129:0x025a, B:133:0x0269, B:134:0x026f, B:135:0x0274, B:138:0x027f, B:140:0x028a, B:144:0x0299, B:146:0x02a0, B:150:0x02af, B:151:0x02b5, B:154:0x02c0, B:156:0x02cb, B:159:0x02d6, B:162:0x02e1, B:163:0x02e5, B:166:0x02f0, B:167:0x02f6, B:168:0x02fe, B:170:0x030e, B:172:0x0317, B:173:0x031e, B:174:0x0326, B:176:0x0337, B:177:0x033e, B:180:0x034a, B:181:0x034e, B:182:0x0354, B:183:0x035c, B:185:0x0368, B:187:0x0370, B:190:0x037b, B:191:0x0380, B:192:0x0387, B:193:0x038f, B:198:0x03a5, B:200:0x03b8, B:202:0x041c, B:203:0x03c1, B:204:0x03c8, B:205:0x03ce, B:206:0x03d6, B:208:0x03e7, B:209:0x03ee, B:211:0x03fa, B:212:0x0400, B:215:0x040b, B:216:0x0412, B:218:0x0428, B:221:0x0433, B:85:0x043a, B:87:0x0441), top: B:3:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019b A[Catch: all -> 0x044b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:5:0x0007, B:6:0x000c, B:7:0x0013, B:8:0x0018, B:9:0x001d, B:10:0x0025, B:12:0x004b, B:13:0x0050, B:15:0x0059, B:18:0x0064, B:19:0x0068, B:23:0x00b0, B:25:0x00b6, B:27:0x00c2, B:30:0x00cc, B:31:0x00d3, B:35:0x00e5, B:38:0x00f0, B:40:0x00fb, B:44:0x010b, B:47:0x0117, B:49:0x011f, B:53:0x012f, B:56:0x013b, B:59:0x0149, B:61:0x0153, B:66:0x0163, B:70:0x0172, B:72:0x017c, B:77:0x018c, B:81:0x019b, B:83:0x01a5, B:94:0x044a, B:108:0x01fe, B:111:0x0209, B:113:0x0214, B:116:0x021f, B:118:0x022a, B:122:0x0239, B:123:0x023f, B:124:0x0244, B:127:0x024f, B:129:0x025a, B:133:0x0269, B:134:0x026f, B:135:0x0274, B:138:0x027f, B:140:0x028a, B:144:0x0299, B:146:0x02a0, B:150:0x02af, B:151:0x02b5, B:154:0x02c0, B:156:0x02cb, B:159:0x02d6, B:162:0x02e1, B:163:0x02e5, B:166:0x02f0, B:167:0x02f6, B:168:0x02fe, B:170:0x030e, B:172:0x0317, B:173:0x031e, B:174:0x0326, B:176:0x0337, B:177:0x033e, B:180:0x034a, B:181:0x034e, B:182:0x0354, B:183:0x035c, B:185:0x0368, B:187:0x0370, B:190:0x037b, B:191:0x0380, B:192:0x0387, B:193:0x038f, B:198:0x03a5, B:200:0x03b8, B:202:0x041c, B:203:0x03c1, B:204:0x03c8, B:205:0x03ce, B:206:0x03d6, B:208:0x03e7, B:209:0x03ee, B:211:0x03fa, B:212:0x0400, B:215:0x040b, B:216:0x0412, B:218:0x0428, B:221:0x0433, B:85:0x043a, B:87:0x0441), top: B:3:0x0002, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(X.C00803oo r301) {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00803oo.A01(X.3oo):void");
    }

    public void A02() {
        synchronized (this) {
            A01(this);
            Iterator it = this.A01.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("onZeroRatingStateChanged");
            }
        }
    }
}
