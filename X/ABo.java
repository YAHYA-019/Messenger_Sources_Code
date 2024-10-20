package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.messaging.reactions.MessageReactionsOverlayFragment;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: ABo.class */
public final class ABo implements 1K9 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public ABo(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 1:
                9fV.A00((9fV) this.A01, this.A02, false);
                return;
            case 2:
                0fH.A0w(4YT.A00(689), "Failure to send reaction.", th);
                return;
            case 3:
            default:
                return;
            case 4:
                C7od c7od = (C7od) ((C5gp) this.A01).A07.get();
                String str = this.A02;
                synchronized (c7od) {
                    String message = (th.getCause() == null || th.getCause().getMessage() == null) ? th.getMessage() : th.getCause().getMessage();
                    if (message != null) {
                        c7od.A00.markerAnnotate(188226264, str.hashCode(), TraceFieldType.FailureReason, message);
                    }
                    c7od.A00.markerEnd(188226264, str.hashCode(), (short) 3);
                }
                return;
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        2JY r0;
        2JY A0P;
        2JY A0B;
        2JY A0O;
        2JY A0B2;
        2JY A0B3;
        2JY r02;
        2JY A0B4;
        TreeJNI A0L;
        C7yl c7yl;
        switch (this.A00) {
            case 0:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                if (abstractC08294mh == null || (r0 = (2JY) abstractC08294mh.A03) == null || (A0P = r0.A0P(2JX.class, -1756425186)) == null || (A0B = 1BK.A0B(A0P, 2JX.class, 92645877, 930552731)) == null || (A0O = A0B.A0O(2JX.class, 126029995)) == null || (A0B2 = 1BK.A0B(A0O, 2JX.class, -664008627, 717993062)) == null || (A0B3 = 1BK.A0B(A0B2, 2JX.class, -1084680700, 878471901)) == null || !A0B3.getBooleanValue(-1867169789)) {
                    return;
                }
                9NC r03 = (9NC) 1Br.A0B(((6oQ) this.A01).A02);
                String str = this.A02;
                String A0r = A0B3.A0r(-1739105871);
                if (A0r == null) {
                    A0r = "";
                }
                1Ql A08 = 1Br.A08(r03.A00);
                A08.CaL(r03.A01.A0F(str), A0r);
                A08.commit();
                return;
            case 1:
                AbstractC08294mh abstractC08294mh2 = (AbstractC08294mh) obj;
                9fV.A00((9fV) this.A01, this.A02, (abstractC08294mh2 == null || (r02 = (2JY) abstractC08294mh2.A03) == null || (A0B4 = 1BK.A0B(r02, 2JX.class, 1026442562, 601902225)) == null || (A0L = A0B4.A0L(1429193398, 2JX.class, 2018655471)) == null) ? false : A0L.getBooleanValue(-218179558));
                return;
            case 2:
                if (AnonymousClass001.A1V(obj)) {
                    MessageReactionsOverlayFragment messageReactionsOverlayFragment = (MessageReactionsOverlayFragment) this.A01;
                    CallerContext callerContext = MessageReactionsOverlayFragment.A0g;
                    messageReactionsOverlayFragment.A0H = true;
                    messageReactionsOverlayFragment.A0D.A06.A00();
                    String str2 = this.A02;
                    if (str2 != null && (c7yl = messageReactionsOverlayFragment.A08) != null) {
                        c7yl.Ctf(str2);
                    }
                    MessageReactionsOverlayFragment.A08(messageReactionsOverlayFragment, true);
                    if (str2 == null || !((6qV) messageReactionsOverlayFragment.A0T.get()).A01()) {
                        return;
                    }
                    Bundle A05 = 1BK.A05();
                    A05.putParcelable("emoji", 2KY.A02((C22a) ((7Wd) messageReactionsOverlayFragment.A0W.get()).A01.get(), str2));
                    1Ho.A00(((BlueServiceOperationFactory) messageReactionsOverlayFragment.A0S.get()).newInstance_DEPRECATED("update_recent_emoji", A05, 1, MessageReactionsOverlayFragment.A0g), true);
                    return;
                }
                return;
            case 3:
                C1282Acm c1282Acm = (C1282Acm) obj;
                6O6 r04 = ((6NI) this.A01).A01;
                if (r04 != null) {
                    r04.CAc(c1282Acm, this.A02);
                    return;
                }
                return;
            default:
                C7od c7od = (C7od) ((C5gp) this.A01).A07.get();
                String str3 = this.A02;
                synchronized (c7od) {
                    c7od.A00.markerEnd(188226264, str3.hashCode(), (short) 2);
                }
                return;
        }
    }
}
