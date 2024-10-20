package X;

import com.facebook.chatheads.view.bubble.BubbleView;
import com.facebook.messaging.chatheads.view.ChatHeadsFullView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.MessageDeepLinkInfo;
import com.google.common.base.Objects;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* loaded from: Ll3.class */
public abstract class Ll3 implements Runnable {
    public static final String __redex_internal_original_name = "ChatHeadWindowManager$SafeFutureRunnable";
    public final /* synthetic */ JU4 A00;

    public Ll3(JU4 ju4) {
        this.A00 = ju4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MNw A07;
        JU4 ju4 = this.A00;
        int i = JU4.A1p;
        if (ju4.A0U) {
            return;
        }
        if (this instanceof JuB) {
            JU4 ju42 = ((JuB) this).A00;
            if (ju42.A0W) {
                return;
            }
            if (JU4.A11(KNB.A02, ju42)) {
                JU4.A0X(ju42);
                return;
            }
            Kuq kuq = ju42.A1E;
            ConcurrentMap concurrentMap = kuq.A02;
            if (!AbF.A1b(concurrentMap) || concurrentMap.isEmpty()) {
                return;
            }
            AmX A01 = kuq.A01(0);
            MessageDeepLinkInfo messageDeepLinkInfo = null;
            long j = A01.A01;
            if (j != -1) {
                messageDeepLinkInfo = new MessageDeepLinkInfo(null, null, null, "", AnonymousClass001.A0v(), 1L, j, false);
            }
            ThreadKey threadKey = A01.A03;
            5SW r0 = 5SW.A0L;
            ju42.A0Y = false;
            BubbleView.A03(JU4.A06(ju42, threadKey), ju42.A0G);
            if (threadKey == null || (A07 = JU4.A07(ju42, threadKey)) == null) {
                return;
            }
            A07.CvN(threadKey, null, messageDeepLinkInfo, null, r0);
            return;
        }
        final JuC juC = (JuC) this;
        JU4 ju43 = juC.A00;
        if (!ju43.A0K.A04().A06) {
            juC.A01.performHapticFeedback(0);
        }
        final AmX amX = juC.A01;
        JU4.A0j(ju43, amX);
        ThreadKey threadKey2 = amX.A03;
        MNw A072 = JU4.A07(ju43, threadKey2);
        if (A072 != null) {
            A072.CQ6(threadKey2);
        }
        if (amX.A00 != 0) {
            C12034yh c12034yh = ju43.A1C;
            ThreadKey threadKey3 = amX.A03;
            if (threadKey3 != null) {
                c12034yh.A02.A06(1BJ.A00(351), threadKey3.A0u());
            }
        }
        List list = ju43.A1P;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                AmX amX2 = (AmX) list.get(i2);
                if (amX2 != null && Objects.equal(amX2.A03, amX.A03)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        JU4.A0Y(ju43);
        ChatHeadsFullView chatHeadsFullView = ju43.A0K;
        if (chatHeadsFullView != null) {
            chatHeadsFullView.A04().A0V().addListener(new Runnable() { // from class: X.Lna
                public static final String __redex_internal_original_name = "ChatHeadWindowManager$11$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    JuC juC2 = JuC.this;
                    JU4.A0l(juC2.A00, amX, "fling_to_close");
                }
            }, 1JU.A01);
        }
    }
}
