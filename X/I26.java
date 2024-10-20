package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: I26.class */
public final class I26 {
    public String A00;
    public final 1Br A02 = 1BK.A0D();
    public final C0dr A01 = (C0dr) 1Bi.A03(84488);
    public final java.util.Map A03 = AnonymousClass001.A0u();

    private final void A00(HjH hjH) {
        1UG A08 = 1BK.A08(1Br.A02(this.A02), AbstractC00603o4.A00(ActionId.ON_ATTACH_FRAGMENT));
        if (A08.isSampled()) {
            long j = hjH.A04;
            long j2 = hjH.A05;
            double d = j - j2;
            double d2 = j2 - hjH.A06;
            if (j2 <= 0.0d) {
                d = 0.0d;
                d2 = 0.0d;
            }
            A08.A5Z("browsing_time", Double.valueOf(d));
            A08.A6H(TraceFieldType.ContentType, 1BK.A0l(hjH.A00));
            A08.A6H("loaded_result_count", 1BK.A0l(hjH.A02));
            A08.A7R("pigeon_reserved_keyword_module", "content_search");
            String str = hjH.A07;
            11T.A0D(str);
            A08.A7R("query", str);
            A08.A5Z("search_time", Double.valueOf(d2));
            A08.A6H(MRk.A00(73), 1BK.A0l(hjH.A03));
            A08.A6H("total_result_count", 1BK.A0l(hjH.A01));
            A08.BZL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e7, code lost:
    
        A00(r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
    
        if (r311 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I26.A01(int, int):void");
    }
}
