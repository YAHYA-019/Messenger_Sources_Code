package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.attachments.VideoAttachmentData;

/* renamed from: X.642, reason: invalid class name */
/* loaded from: 642.class */
public final class AnonymousClass642 extends C1rj {
    public 5zD A00;
    public 7X9 A01;
    public AnonymousClass622 A02;
    public boolean[] A03;

    public AnonymousClass642() {
        super("DownloadButtonWrapper");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A03, this.A02, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String A0u;
        7Y5 A00 = r302.A06().A00();
        AnonymousClass622 anonymousClass622 = this.A02;
        7X9 r0 = this.A01;
        5zD r02 = this.A00;
        7Y7 r03 = A00.A01;
        7Y8 r04 = A00.A00;
        boolean[] zArr = A00.A03;
        66H[] r05 = A00.A02;
        66I r06 = (66I) 1Bi.A03(49956);
        FbUserSession A002 = C54z.A00(r302);
        Context context = r302.A0D;
        AnonymousClass640 anonymousClass640 = (AnonymousClass640) 1Lo.A04(context, A002, (1BY) null, 65879);
        r04.A00 = r302;
        if (r05 != null) {
            for (66H r07 : r05) {
                r07.A01 = r302;
            }
        }
        1LI ACr = r0.ACr(r04, r03);
        1LI ACj = r0.ACj(r04, r03);
        1LI ACw = r0.ACw(r04, r03, r05, zArr, ACr != null, ACj != null);
        2cL r310 = null;
        if (r03 == 7Y7.A05 && anonymousClass640.A04(anonymousClass622)) {
            Resources resources = context.getResources();
            if (anonymousClass622.A03()) {
                A0u = resources.getQuantityString(2131820593, anonymousClass622.A0Q.size());
            } else {
                VideoAttachmentData videoAttachmentData = anonymousClass622.A02;
                if (videoAttachmentData != null) {
                    A0u = 4YU.A0u(resources, r06.A01(videoAttachmentData.A06), 2131955912);
                }
            }
            2cM A01 = 2cK.A01(r302, (String) null, 0);
            A01.A0c();
            A01.A27(C26z.ALL, 0.0f);
            A01.A2c();
            A01.A2b();
            A01.A2T(1LI.A06(r302, AnonymousClass642.class, "DownloadButtonWrapper"));
            2KD A003 = 2K3.A00(r302);
            A003.A2x(r02.Axg());
            A003.A2z(A0u);
            A003.A2i();
            A003.A2a();
            A003.A16(18.0f);
            A003.A1I(2132345092);
            A003.A2e();
            A01.A2d(A003);
            r310 = A01.A00;
        }
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        A012.A2e(ACw);
        A012.A2e(r310);
        1LI r305 = A012.A00;
        if (ACr != null || ACj != null) {
            2cM A013 = 2cK.A01(r302, (String) null, 0);
            A013.A2e(ACr);
            A013.A2e(r305);
            A013.A2e(ACj);
            r305 = A013.A00;
        }
        return r305;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        4YU.A0P(r302.A00.A00).A00.A00(7Y7.A02);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.7Y8] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.66H] */
    /* JADX WARN: Type inference failed for: r305v0 */
    /* JADX WARN: Type inference failed for: r305v1 */
    /* JADX WARN: Type inference failed for: r305v2 */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        int length;
        7Y5 r0 = (7Y5) r303;
        boolean[] zArr = null;
        66H[] r305 = 0;
        boolean[] zArr2 = this.A03;
        1Bn.A0A(50223);
        7Y7 r02 = 7Y7.A01;
        ?? obj = new Object();
        ((7Y8) obj).A00 = r302;
        if (zArr2 != null && (length = zArr2.length) > 0) {
            zArr = zArr2;
            r305 = new 66H[length];
            int i = 0;
            do {
                ?? obj2 = new Object();
                ((66H) obj2).A01 = r302;
                ((66H) obj2).A00 = i;
                r305[i] = obj2;
                i++;
            } while (i < length);
        }
        r0.A01 = r02;
        r0.A00 = obj;
        r0.A03 = zArr;
        r0.A02 = r305;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
