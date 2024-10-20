package X;

import com.facebook.messaging.integrity.frx.model.FeedbackSubmissionResult;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.stickers.model.Sticker;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: D48.class */
public final class D48 implements 1K9 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public D48(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0070, code lost:
    
        if (r306 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFailure(java.lang.Throwable r302) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D48.onFailure(java.lang.Throwable):void");
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        2JY A0B;
        QuickPerformanceLogger A0e;
        int hashCode;
        short s;
        switch (this.A00) {
            case 0:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                if (abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null || (A0B = 1BK.A0B((2JY) obj2, 2JX.class, 952877858, 1664378235)) == null) {
                    0fH.A0k(CEh.A09, "Empty result from server");
                    return;
                }
                CEh cEh = (CEh) this.A01;
                1G9 r0 = CEh.A06;
                1Ql putBoolean = 1BL.A0V(cEh.A04).putBoolean(CEh.A07, !A0B.A0K(-120851836, 2JX.class, 1528071977).getBooleanValue(-2115215734));
                putBoolean.CaL(CEh.A06, this.A02);
                putBoolean.CaH(CEh.A08, 1BL.A09(cEh.A05));
                putBoolean.commit();
                return;
            case 1:
                3MN r02 = (3MN) obj;
                B2q.A0A(((Bzx) this.A01).A00, r02 != null ? r02.A03 : "", this.A02);
                return;
            case 2:
                3MN r03 = (3MN) obj;
                B2c.A0C((B2c) this.A01, r03 != null ? r03.A03 : "", this.A02);
                return;
            case 3:
                FeedbackSubmissionResult feedbackSubmissionResult = (FeedbackSubmissionResult) obj;
                if (feedbackSubmissionResult != null) {
                    CQ2 cq2 = (CQ2) this.A01;
                    cq2.A09.A03("report_completed");
                    CQ2.A03(cq2, feedbackSubmissionResult, (ImmutableList) null, this.A02);
                    return;
                }
                return;
            case 4:
                C25e c25e = (C25e) obj;
                11T.A0F(c25e, 0);
                1FX r04 = (1FX) this.A01;
                long parseLong = Long.parseLong(this.A02);
                AnonymousClass261 anonymousClass261 = c25e.A00;
                1FV A0j = 4YU.A0j();
                AnonymousClass206 anonymousClass206 = anonymousClass261.A0A;
                Czj A00 = Czj.A00(anonymousClass261, A0j, 3);
                1Um AQV = anonymousClass206.mMailboxApiHandleMetaProvider.AQV(2);
                MailboxFutureImpl A0Q = 1BK.A0Q(AQV, A00);
                1Um.A02(AQV, new Czf(anonymousClass206, A0Q, 1, parseLong), A0Q, false);
                r04.setFuture(A0j);
                return;
            case 5:
                IFc iFc = (IFc) ((CP1) this.A01).A04.get();
                String str = this.A02;
                AbN.A1G(iFc, "link_revoked", str);
                4zI.A03.A05("VideoChatLinksAnalyticsLogger", "Event: %s. url: %s.", new Object[]{"link_revoked", str});
                return;
            case 6:
                CMK.A00((CMK) this.A01, (C1323Ae1) obj);
                return;
            case 7:
                if (AnonymousClass001.A1V(obj)) {
                    CGR cgr = (CGR) ((CHY) this.A01).A06.get();
                    long parseLong2 = Long.parseLong(this.A02);
                    String A002 = CGF.A01.A00(0S2.A00);
                    JSONObject A12 = AnonymousClass001.A12();
                    CGR.A00(cgr, (String) null, A12, new String[]{"com.facebook.katana", "com.facebook.lite"});
                    1UG A08 = 1BK.A08(1BK.A07(cgr.A01), 1BJ.A00(1888));
                    if (A08.isSampled()) {
                        AbO.A0Y(A08, Long.valueOf(parseLong2), A12, A002);
                        CBL.A00(A08, cgr.A00);
                        A08.A0A("is_app_enabled_in_oxygen");
                        A08.BZL();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                C1282Acm c1282Acm = (C1282Acm) obj;
                C1279Acj c1279Acj = (C1279Acj) this.A01;
                boolean AZk = 1Br.A07(c1279Acj.A02).AZk(2342167347227348585L);
                String str2 = this.A02;
                if (AZk) {
                    c1279Acj.A04(c1282Acm, str2);
                    C1279Acj.A02(c1279Acj, str2);
                    return;
                } else {
                    C1279Acj.A02(c1279Acj, str2);
                    c1279Acj.A04(c1282Acm, str2);
                    return;
                }
            default:
                C2636Gjo c2636Gjo = (C2636Gjo) obj;
                if (c2636Gjo != null) {
                    Object obj3 = c2636Gjo.A01;
                    I5H i5h = (I5H) this.A01;
                    CkF ckF = (CkF) 1Br.A0B(i5h.A01);
                    if (obj3 != null) {
                        String str3 = this.A02;
                        ckF.A02(str3, obj3.toString());
                        A0e = 7zP.A0e(i5h.A04);
                        hashCode = str3.hashCode();
                        s = 87;
                    } else {
                        String str4 = this.A02;
                        AbstractCollection abstractCollection = (AbstractCollection) c2636Gjo.A02;
                        ArrayList A0z = 1BL.A0z(abstractCollection);
                        Iterator it = abstractCollection.iterator();
                        while (it.hasNext()) {
                            A0z.add(((Sticker) it.next()).A0F);
                        }
                        if (CkF.A01()) {
                            CkF.A00(new C1785AsJ(0S2.A00, str4, null, A0z, 16, 1Br.A00(ckF.A00)), ckF);
                        }
                        A0e = 7zP.A0e(i5h.A04);
                        hashCode = str4.hashCode();
                        s = 2;
                    }
                    A0e.markerEnd(625161889, hashCode, s);
                    return;
                }
                return;
        }
    }
}
