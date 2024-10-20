package X;

import com.facebook.messaging.business.plugins.suggestedreply.model.ReplyEntry;
import com.facebook.messaging.nativepagereply.savedreplies.model.SavedReplyItem;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Amv, reason: case insensitive filesystem */
/* loaded from: Amv.class */
public final class C1614Amv extends 1RM {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C1614Amv(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    private void A05(String str) {
        COd cOd;
        ImmutableList build;
        ArrayList A17 = 1BK.A17(((CNh) this.A02).A02());
        if (A17.isEmpty()) {
            cOd = (COd) this.A01;
            if (cOd.A07.isEmpty()) {
                return;
            } else {
                build = ImmutableList.of();
            }
        } else {
            ImmutableList.Builder A0h = 4YU.A0h();
            Iterator it = A17.iterator();
            while (it.hasNext()) {
                SavedReplyItem savedReplyItem = (SavedReplyItem) it.next();
                String A00 = COe.A00(savedReplyItem.A0B, str);
                String str2 = savedReplyItem.A0A;
                String str3 = savedReplyItem.A06;
                String str4 = savedReplyItem.A07;
                String str5 = savedReplyItem.A0C;
                C1pq.A08("messageBody", A00);
                A0h.m11011add((Object) new ReplyEntry(BKs.A02, null, str3, str4, null, A00, str2, null, "SAVED_REPLY", str5, 2131966508));
            }
            cOd = (COd) this.A01;
            build = A0h.build();
        }
        cOd.A07 = build;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x06a1, code lost:
    
        if (r310 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0bc6, code lost:
    
        if (r353 == null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0bd3, code lost:
    
        r0 = X.1BK.A0B(r306, X.2JX.class, -1697892844, 659367457);
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0bec, code lost:
    
        if (r0 == null) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0bef, code lost:
    
        r0 = r0.A0c(872773068, X.2JX.class, -1713488903);
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0c08, code lost:
    
        if (r0 == null) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0c0b, code lost:
    
        r0 = X.C1A3.A1E(r0);
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0c23, code lost:
    
        if (r0.hasNext() == false) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0c26, code lost:
    
        r0 = X.7zL.A0P(r0).A0r(715085080);
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0c3d, code lost:
    
        if (r0 == null) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0c40, code lost:
    
        r0 = X.C0A2.A00(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0c4b, code lost:
    
        if (r0 == null) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0c4e, code lost:
    
        r0.add(new X.BcK(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x145f, code lost:
    
        r306 = X.AnonymousClass001.A0s();
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x1473, code lost:
    
        if (r0.hasNext() == false) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x1476, code lost:
    
        r0 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x1480, code lost:
    
        if (r0 == null) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x1483, code lost:
    
        r306.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x1493, code lost:
    
        r0 = X.AbG.A0y(X.4YU.A0h(), r306);
        X.11T.A0D(r0);
        X.11T.A0D(r0);
        X.11T.A0D(r353);
        X.11T.A0D(r0);
        ((X.BcH) r301.A02).A00.A06.A00(new X.Byp(r338, r0, r0, r353, r0, r332, r336, r340, r339, r337, r341, r349, r350, r342), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x14f1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x148e, code lost:
    
        r306 = com.google.common.collect.ImmutableList.of();
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0bd0, code lost:
    
        if (r306 == null) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x08c0, code lost:
    
        if (r306 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x08b5, code lost:
    
        if (r306 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x08aa, code lost:
    
        if (r306 != null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x089f, code lost:
    
        if (r306 != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0894, code lost:
    
        if (r306 != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0889, code lost:
    
        if (r306 != null) goto L114;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0baf  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x1025  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x105d  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x1073  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x10e5  */
    /* JADX WARN: Removed duplicated region for block: B:462:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x1345  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x1397  */
    /* JADX WARN: Type inference failed for: r0v1196, types: [X.0w6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v435, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v751, types: [X.0w6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r307v26 */
    /* JADX WARN: Type inference failed for: r307v64 */
    /* JADX WARN: Type inference failed for: r307v65 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 6588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1614Amv.A02(java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(java.lang.Throwable r302) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1614Amv.A03(java.lang.Throwable):void");
    }
}
