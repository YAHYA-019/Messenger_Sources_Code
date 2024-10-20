package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.drawee.view.DraweeView;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.threadview.attachment.image.ThreadViewImageAttachmentView;
import com.facebook.papaya.store.PapayaStore;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: InL.class */
public final class InL implements 1K9 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public InL(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj;
        this.A01 = i;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                0fH.A0p(AbE.A00(292), "Unable to load users", th);
                7zP.A0e(((C5M) this.A03).A03).markerEnd(this.A01, (short) 3);
                JIO jio = (JIO) this.A02;
                if (jio != null) {
                    jio.CTF();
                    return;
                }
                return;
            case 1:
                if (th instanceof CancellationException) {
                    return;
                }
                CallerContext callerContext = ThreadViewImageAttachmentView.A0S;
                0fH.A0N(ThreadViewImageAttachmentView.class, "Failed to get FbDraweeControllerBuilder from ImagePipelineWrapper.", th, AnonymousClass001.A1Z());
                return;
            default:
                PapayaStore papayaStore = (PapayaStore) this.A02;
                AtomicInteger atomicInteger = PapayaStore.sSequenceId;
                LXZ lxz = papayaStore.mEventListener;
                if (lxz != null) {
                    QpJ qpJ = (QpJ) this.A03;
                    int i = this.A01;
                    LXZ lxz2 = lxz;
                    if (th != null) {
                        if (th.getCause() != null && th.getCause().getMessage() != null) {
                            th = th.getCause();
                        }
                        String message = th.getMessage();
                        if (message != null) {
                            1BK.A0U(lxz2.A01).markerAnnotate(LXZ.A00(qpJ), i, TraceFieldType.FailureReason, message);
                        }
                    }
                    1BK.A0U(lxz2.A01).markerEnd(LXZ.A00(qpJ), i, (short) 3);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, java.lang.Object, com.facebook.messaging.threadview.attachment.image.ThreadViewImageAttachmentView] */
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C69t A08;
        switch (this.A00) {
            case 0:
                java.util.Map map = (java.util.Map) obj;
                11T.A0F(map, 0);
                boolean isEmpty = map.isEmpty();
                QuickPerformanceLogger A0e = 7zP.A0e(((C5M) this.A03).A03);
                int i = this.A01;
                if (isEmpty) {
                    A0e.markerEnd(i, (short) 3);
                    JIO jio = (JIO) this.A02;
                    if (jio != null) {
                        jio.CTF();
                        return;
                    }
                    return;
                }
                A0e.markerEnd(i, (short) 2);
                JIO jio2 = (JIO) this.A02;
                if (jio2 != null) {
                    jio2.CTU(map);
                    return;
                }
                return;
            case 1:
                Hbj hbj = (Hbj) obj;
                ?? r0 = (ThreadViewImageAttachmentView) this.A02;
                DraweeView draweeView = (DraweeView) this.A03;
                CallerContext callerContext = ThreadViewImageAttachmentView.A0S;
                ImageAttachmentData imageAttachmentData = (ImageAttachmentData) r0.A0H.get(this.A01);
                synchronized (r0) {
                    r0.A0M.A0G(r0.A0D);
                    C69s c69s = r0.A0A;
                    ((C69o) c69s).A02 = ThreadViewImageAttachmentView.A0S;
                    c69s.A07((2Dp[]) hbj.A01.toArray(new 2Dp[0]));
                    ((C69o) c69s).A04 = hbj.A00;
                    ((C69o) c69s).A00 = new C2519Gfz(hbj, r0, 2);
                    5zA r02 = r0.A0Q;
                    if (r02.A01(imageAttachmentData, 0S2.A00, C1q7.A0X(r0.A0D))) {
                        GQl gQl = new GQl(r0.getContext(), 0S2.A01);
                        Message message = r0.A0D;
                        c69s.A01 = new 66O(gQl, (66H) null, message.A1V, true);
                        ((C69o) c69s).A04 = r02.A00(imageAttachmentData, message);
                    }
                    A08 = c69s.A08();
                }
                draweeView.A06(A08);
                return;
            default:
                PapayaStore papayaStore = (PapayaStore) this.A02;
                AtomicInteger atomicInteger = PapayaStore.sSequenceId;
                LXZ lxz = papayaStore.mEventListener;
                if (lxz != null) {
                    QpJ qpJ = (QpJ) this.A03;
                    1BK.A0U(lxz.A01).markerEnd(LXZ.A00(qpJ), this.A01, (short) 2);
                    return;
                }
                return;
        }
    }
}
