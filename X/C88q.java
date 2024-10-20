package X;

import android.net.Uri;
import com.facebook.common.util.TriState;
import com.facebook.forker.Process;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.model.messages.Message;
import com.google.common.base.Objects;
import java.util.BitSet;
import java.util.concurrent.Executor;

/* renamed from: X.88q, reason: invalid class name */
/* loaded from: 88q.class */
public final class C88q extends C1rj {
    public 06Z A00;
    public VideoAttachmentData A01;
    public Message A02;
    public C62q A03;
    public 7Y7 A04;
    public AnonymousClass622 A05;
    public boolean A06;

    public C88q() {
        super("ThreadViewVideoComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r306 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(X.1Iw r301, com.facebook.messaging.attachments.VideoAttachmentData r302, X.C64T r303, X.89S r304, boolean r305, boolean r306) {
        /*
            r0 = 1
            r307 = r0
            r0 = r302
            if (r0 == 0) goto L3b
            r0 = r302
            com.facebook.ui.media.attachments.model.MediaResource r0 = r0.A0I
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L3b
        L12:
            r0 = 0
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L38
        L1a:
            r0 = 0
            r308 = r0
        L1d:
            r0 = r304
            r1 = r308
            r0.A00 = r1
            r0 = r308
            if (r0 == 0) goto L38
            r0 = r304
            java.util.concurrent.Executor r0 = r0.A02
            r309 = r0
            r0 = r308
            r1 = r304
            r2 = r309
            r0.D3K(r1, r2)
        L38:
            r0 = r307
            return r0
        L3b:
            r0 = r305
            if (r0 == 0) goto L12
            r0 = r306
            if (r0 != 0) goto L38
            r0 = r302
            if (r0 == 0) goto L1a
            r0 = r302
            android.net.Uri r0 = r0.A0F
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L1a
            r0 = r301
            android.content.Context r0 = r0.A0D
            r310 = r0
            r0 = r303
            X.1Br r0 = r0.A01
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.2Ff r0 = (X.2Ff) r0
            r311 = r0
            r0 = r309
            X.2IA r0 = X.2IA.A01(r0)
            r309 = r0
            X.2r8 r0 = X.C2r8.DISK_CACHE
            r308 = r0
            r0 = r309
            r1 = r308
            r0.A0B = r1
            r0 = r309
            X.2Dp r0 = r0.A04()
            r308 = r0
            r0 = r311
            r1 = r308
            r2 = r310
            X.1OW r0 = r0.A0B(r1, r2)
            r308 = r0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88q.A00(X.1Iw, com.facebook.messaging.attachments.VideoAttachmentData, X.64T, X.89S, boolean, boolean):boolean");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A05, this.A03, this.A04, this.A02, Boolean.valueOf(this.A06), this.A01};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C89q c89q = (C89q) 4YU.A0P(r302);
        Message message = this.A02;
        boolean z = this.A06;
        VideoAttachmentData videoAttachmentData = this.A01;
        C62q c62q = this.A03;
        06Z r0 = this.A00;
        AnonymousClass622 anonymousClass622 = this.A05;
        7Y7 r02 = this.A04;
        6cL r03 = c89q.A03;
        89S r04 = c89q.A02;
        Uri uri = c89q.A00;
        TriState triState = c89q.A01;
        boolean z2 = c89q.A06;
        C64T c64t = (C64T) 1Lo.A04(r302.A0D, 1BL.A0F(), (1BY) null, 67933);
        r03.A01 = message;
        r03.A00 = videoAttachmentData;
        r04.A01 = r302;
        Uri uri2 = videoAttachmentData != null ? videoAttachmentData.A0F : null;
        boolean equal = Objects.equal(uri2, uri);
        boolean A00 = A00(r302, videoAttachmentData, c64t, r04, z, equal);
        boolean z3 = false;
        if (A00 && !equal) {
            if (r302.A02 != null) {
                4YV.A1F(r302, uri2, Process.WAIT_RESULT_STOPPED);
            }
            TriState triState2 = TriState.UNSET;
            if (r302.A02 != null) {
                4YV.A1F(r302, triState2, -2147483645);
            }
            if (r302.A02 != null) {
                4YV.A1F(r302, false, Process.WAIT_RESULT_RUNNING);
            }
        } else if (z2) {
            A00 = false;
        } else if (equal && triState.isSet()) {
            A00 = !triState.asBoolean();
        }
        87G r05 = new 87G(r302, new 6An());
        6An r06 = r05.A01;
        r06.A03 = message;
        BitSet bitSet = r05.A02;
        bitSet.set(2);
        r06.A02 = videoAttachmentData;
        bitSet.set(5);
        r06.A07 = anonymousClass622;
        r06.A04 = c62q;
        bitSet.set(1);
        r06.A01 = r0;
        bitSet.set(0);
        r06.A06 = r03;
        bitSet.set(6);
        if (A00 && r02 == null) {
            z3 = true;
        }
        r06.A08 = z3;
        bitSet.set(3);
        r06.A05 = r02;
        r06.A00 = new 89U(r302);
        bitSet.set(4);
        7zS.A1J(r05, r302, C88q.class, "ThreadViewVideoComponent");
        r05.A1u(1LI.A09(r302, C88q.class, "ThreadViewVideoComponent", 2003752247));
        7zP.A16(r05, bitSet, r05.A03);
        return r06;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        Message message;
        boolean z;
        switch (r302.A01) {
            case -1932591986:
                1Iv r0 = r302.A00;
                ((C88q) r0.A01).A03.CU5(((C89q) 4YU.A0P(r0.A00)).A03);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 1803022739:
                1Iv r02 = r302.A00;
                1Is r03 = r02.A01;
                1Iw r04 = r02.A00;
                C88q c88q = (C88q) r03;
                C89q c89q = (C89q) r04.A07(4YU.A0P(r04));
                C62q c62q = c88q.A03;
                AnonymousClass622 anonymousClass622 = c88q.A05;
                6cL r05 = c89q.A03;
                Boolean bool = c89q.A04;
                c62q.CU6(r05);
                if (!bool.booleanValue() || (message = r05.A01) == null) {
                    return null;
                }
                c62q.C1l(message, anonymousClass622);
                Boolean A0K = AnonymousClass001.A0K();
                if (r04.A02 != null) {
                    4YV.A1F(r04, A0K, -2147483644);
                }
                Boolean A0d = 1BK.A0d();
                if (r04.A02 == null) {
                    return null;
                }
                4YV.A1F(r04, A0d, (-1) << (-1));
                return null;
            case 2003752247:
                1Iv r06 = r302.A00;
                1Is r07 = r06.A01;
                1Iw r08 = r06.A00;
                float f = ((2lD) obj).A00;
                C88q c88q2 = (C88q) r07;
                C89q c89q2 = (C89q) r08.A07(4YU.A0P(r08));
                Message message2 = c88q2.A02;
                VideoAttachmentData videoAttachmentData = c88q2.A01;
                C62q c62q2 = c88q2.A03;
                AnonymousClass622 anonymousClass6222 = c88q2.A05;
                Boolean bool2 = c89q2.A05;
                if (!videoAttachmentData.A0Q) {
                    return null;
                }
                if (bool2.booleanValue()) {
                    if (f >= 90.0f) {
                        return null;
                    }
                    c62q2.C1q(message2);
                    z = false;
                } else {
                    if (f < 90.0f) {
                        return null;
                    }
                    c62q2.C1l(message2, anonymousClass6222);
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                if (r08.A02 == null) {
                    return null;
                }
                4YV.A1F(r08, valueOf, -2147483644);
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.6cL, java.lang.Object] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C89q c89q = (C89q) r303;
        Uri uri = null;
        boolean z = this.A06;
        VideoAttachmentData videoAttachmentData = this.A01;
        Executor executor = (Executor) 1Bi.A03(16457);
        C64T c64t = (C64T) 1Lo.A04(r302.A0D, 1BL.A0F(), (1BY) null, 67933);
        ?? obj = new Object();
        89S r0 = new 89S(r302, executor);
        TriState triState = TriState.UNSET;
        Boolean A0d = 1BK.A0d();
        Boolean A0K = AnonymousClass001.A0K();
        if (A00(r302, videoAttachmentData, c64t, r0, z, false) && videoAttachmentData != null) {
            uri = videoAttachmentData.A0F;
        }
        c89q.A03 = obj;
        c89q.A02 = r0;
        c89q.A00 = uri;
        c89q.A01 = triState;
        c89q.A05 = A0d;
        c89q.A04 = A0K;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
