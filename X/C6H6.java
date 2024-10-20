package X;

import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.attachments.AudioAttachmentData;
import com.facebook.messaging.audio.playback.view.AudioPlayerWaveformBubbleView;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: X.6H6, reason: invalid class name */
/* loaded from: 6H6.class */
public final class C6H6 extends 6Fg implements AnonymousClass633 {
    public 6KU A01;
    public final 63D A07;
    public final C6G1 A08;
    public final 6GG A0D;
    public final C00i A0C = 1BQ.A00();
    public final C00i A09 = 1BV.A00(115912);
    public final C00i A03 = 1BQ.A02(49777);
    public final C00i A05 = FbInjector.A00;
    public final C00i A02 = 1BV.A00(65579);
    public final 6H7 A06 = (6H7) 1Bi.A03(50015);
    public final C00i A04 = 1BQ.A02(68470);
    public final C00i A0B = 1BQ.A02(82689);
    public final C00i A0A = 1BV.A00(67936);
    public int A00 = -1;

    public C6H6(C6G2 c6g2, 63D r303, C6G1 c6g1, 6GG r305) {
        c6g2.Cc6(this);
        this.A08 = c6g1;
        this.A0D = r305;
        this.A07 = r303;
    }

    public static void A00(FbUserSession fbUserSession, C6H6 c6h6, Iterator it, int i, boolean z) {
        ViewGroup Ax6;
        GRr gRr;
        Uri uri;
        int i2 = i + 1;
        C6G1 c6g1 = c6h6.A08;
        int Amd = c6g1.Amd();
        if (i2 < 1 || Amd + i2 >= c6g1.AVk() || (Ax6 = c6g1.Ax6()) == null) {
            return;
        }
        int childCount = Ax6.getChildCount();
        while (it.hasNext()) {
            AnonymousClass624 anonymousClass624 = (AnonymousClass624) it.next();
            if (anonymousClass624 instanceof AnonymousClass622) {
                AnonymousClass622 anonymousClass622 = (AnonymousClass622) anonymousClass624;
                AudioAttachmentData audioAttachmentData = anonymousClass622.A01;
                if (audioAttachmentData == null) {
                    return;
                }
                if (anonymousClass622.A0Z != z && !((2yD) c6h6.A0C.get()).AZk(36319776758380884L)) {
                    return;
                }
                if (i2 < childCount) {
                    Hfn BKS = c6h6.A0D.BKS(anonymousClass622.A03);
                    if (BKS != null) {
                        AnonymousClass624 anonymousClass6242 = BKS.A03;
                        anonymousClass6242.getClass();
                        if (!anonymousClass6242.BVk(anonymousClass622) || (gRr = BKS.A01) == null) {
                            return;
                        }
                        if ((gRr.A02 == null || gRr.A05 != GRw.A01) && gRr.A04 != null && 1BK.A0N(gRr.A0Q).AZk(36319776758315347L)) {
                            GRr.A00(gRr.A04.A01, 4YV.A0C(FbInjector.A00()), gRr, true);
                            AudioPlayerWaveformBubbleView audioPlayerWaveformBubbleView = gRr.A0a;
                            Integer num = 0S2.A0N;
                            audioPlayerWaveformBubbleView.A0G(num);
                            gRr.A0Z.A0G(num);
                        }
                        GRr gRr2 = BKS.A01;
                        if (GRr.A0C(gRr2)) {
                            return;
                        }
                        GRn gRn = gRr2.A07;
                        if ((gRn != null && !gRn.A03) || (uri = gRr2.A02) == null || gRr2.A05 != GRw.A01) {
                            return;
                        }
                        5YZ r0 = gRr2.A0X;
                        IDp iDp = (IDp) 1Bn.A0A(116346);
                        iDp.A00 = uri;
                        r0.A08.add(iDp);
                        gRr2.A08 = iDp;
                        GRr.A0A(gRr2, iDp);
                    }
                } else {
                    Uri uri2 = audioAttachmentData.A01;
                    C1ko c1ko = ((GPh) 1Lo.A06(fbUserSession, 116132)).A00;
                    if (c1ko.Apt(uri2) == null && ((2yD) c6h6.A0C.get()).AZk(36319776758315347L)) {
                        6H7 r02 = c6h6.A06;
                        C1pq.A08("url", uri2);
                        r02.A01(fbUserSession, new C7Zl(true, uri2));
                    }
                    Uri uri3 = (Uri) c1ko.Apt(uri2);
                    if (uri3 == null) {
                        return;
                    }
                    5YZ r03 = (5YZ) c6h6.A03.get();
                    IDp iDp2 = (IDp) 1Bn.A0A(116346);
                    iDp2.A00 = uri3;
                    r03.A08.add(iDp2);
                    6KU r04 = c6h6.A01;
                    if (r04 != null) {
                        iDp2.A0B(r04);
                    }
                    iDp2.A0B(new IU9(uri2, (70Q) c6h6.A09.get(), iDp2, audioAttachmentData.A00));
                }
                c6h6.A01(anonymousClass622);
            }
            i2++;
        }
    }

    private void A01(final AnonymousClass622 anonymousClass622) {
        5YZ r0 = (5YZ) this.A03.get();
        Deque deque = r0.A08;
        IDp iDp = deque.isEmpty() ? r0.A01 : (IDp) deque.peekLast();
        if (iDp != null) {
            iDp.A0B(new 5Yc() { // from class: X.3Z7
                public void CCB(Integer num) {
                    int intValue = num.intValue();
                    if (intValue == 0 || intValue == 6) {
                        C6H6.this.A07.CWq();
                        return;
                    }
                    if (intValue == 9) {
                        C6H6 c6h6 = C6H6.this;
                        if (((5YZ) c6h6.A03.get()).A08.isEmpty()) {
                            AnonymousClass622 anonymousClass6222 = anonymousClass622;
                            if (ThreadKey.A0q(anonymousClass6222.A03.A0V)) {
                                return;
                            }
                            C6G1 c6g1 = c6h6.A08;
                            1Dt listIterator = c6g1.AVl().listIterator();
                            FbUserSession A0F = 1BL.A0F();
                            while (listIterator.hasNext()) {
                                AnonymousClass624 anonymousClass624 = (AnonymousClass624) listIterator.next();
                                if (anonymousClass624 instanceof AnonymousClass622) {
                                    AnonymousClass622 anonymousClass6223 = (AnonymousClass622) anonymousClass624;
                                    if (anonymousClass6223.BVk(anonymousClass6222)) {
                                        int Amd = c6g1.Amd();
                                        if (listIterator.hasNext()) {
                                            C6H6.A00(A0F, c6h6, listIterator, (listIterator.nextIndex() - 1) - Amd, anonymousClass6223.A0Z);
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // X.AnonymousClass633
    public void Bju(AnonymousClass622 anonymousClass622) {
        ThreadSummary threadSummary;
        Message message = anonymousClass622.A03;
        if (ThreadKey.A0q(message.A0V)) {
            return;
        }
        Fragment AnK = this.A07.AnK();
        if (AnK != null && (threadSummary = anonymousClass622.A05) != null && 2oI.A06(threadSummary)) {
            61C r0 = anonymousClass622.A04;
            if (!r0.A03("public_channels_is_user_subscribed") && ((1Wi) this.A04.get()).A02()) {
                ThreadKey threadKey = threadSummary.A0n;
                ((CQo) this.A0B.get()).A0I(1, ActionId.ACTIVITY_START, threadKey.A04);
                this.A0A.get();
                CAt.A00(AnK.getChildFragmentManager(), threadKey, r0.A02("thread_entrypoint", ""));
                return;
            }
        }
        A01(anonymousClass622);
        C6G1 c6g1 = this.A08;
        ViewGroup Ax6 = c6g1.Ax6();
        if (Ax6 != null) {
            int childCount = Ax6.getChildCount();
            FbUserSession A04 = ((1Fv) 1Bi.A03(66351)).A04();
            ((C9mX) 1Lo.A06(A04, 68544)).A04(6Pq.A01, message);
            int Amd = c6g1.Amd();
            ImmutableList AVl = c6g1.AVl();
            if (Amd < AVl.size()) {
                1Dt listIterator = AVl.listIterator(Amd);
                while (listIterator.hasNext() && listIterator.nextIndex() < Amd + childCount) {
                    AnonymousClass624 anonymousClass624 = (AnonymousClass624) listIterator.next();
                    if ((anonymousClass624 instanceof AnonymousClass622) && ((AnonymousClass622) anonymousClass624).BVk(anonymousClass622)) {
                        if (listIterator.hasNext()) {
                            A00(A04, this, listIterator, (listIterator.nextIndex() - 1) - Amd, anonymousClass622.A0Z);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
