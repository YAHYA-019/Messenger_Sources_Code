package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.messaging.inbox.loader.event.OnInboxDataChanged;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.83c, reason: invalid class name */
/* loaded from: 83c.class */
public final class C83c implements 1Vf {
    public Runnable A00;
    public boolean A01;
    public final Context A02;
    public final 1Br A05;
    public volatile boolean A07;
    public final 1Br A04 = 1BK.A0C();
    public final Handler A03 = AnonymousClass001.A07();
    public final 1Br A06 = 1Bq.A00(33215);

    public C83c(Context context) {
        this.A02 = context;
        this.A05 = 1Bu.A01(context, 17010);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    public void BQC(1Q5 r302, 1Vp r303, String str) {
        boolean A1X = 1BL.A1X(r302, str);
        switch (str.hashCode()) {
            case -812952152:
                if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnInvisible")) {
                    this.A07 = false;
                    Runnable runnable = this.A00;
                    if (runnable != null) {
                        this.A03.removeCallbacks(runnable);
                    }
                    this.A00 = null;
                    return;
                }
                throw 4YV.A0f(str);
            case -87584635:
                if (str.equals("com.facebook.messaging.inbox.loader.event.OnInboxDataChanged")) {
                    OnInboxDataChanged onInboxDataChanged = (OnInboxDataChanged) r302;
                    11T.A0F(onInboxDataChanged, 0);
                    AbstractCollection abstractCollection = (AbstractCollection) onInboxDataChanged.A00.A03.getValue();
                    boolean z = true;
                    if (!(abstractCollection instanceof Collection) || !abstractCollection.isEmpty()) {
                        Iterator it = abstractCollection.iterator();
                        while (it.hasNext()) {
                            ThreadSummary threadSummary = (ThreadSummary) it.next();
                            11T.A0D(threadSummary);
                            if (2Gt.A0F(threadSummary)) {
                                ThreadKey threadKey = threadSummary.A0n;
                                11T.A0A(threadKey);
                                if (threadKey.A0z() || threadKey.A1L()) {
                                    if (((2Ph) this.A05.A00.get()).A0F(threadSummary)) {
                                        this.A01 = z;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    this.A01 = z;
                    return;
                }
                throw 4YV.A0f(str);
            case 744943903:
                if (str.equals("com.facebook.xapp.messaging.threadlist.events.OnThreadListRendered")) {
                    if (!1XU.A00(this.A02) && this.A01 && this.A00 == null) {
                        Runnable runnable2 = new Runnable() { // from class: X.83h
                            public static final String __redex_internal_original_name = "ReciprocityInboxRapidFeedbackSurveyOpenHandler$onDataRender$1";

                            @Override // java.lang.Runnable
                            public final void run() {
                                C83c c83c = C83c.this;
                                if (c83c.A07) {
                                    ((2ZM) 1Br.A0B(c83c.A06)).A04(c83c.A02, "1167101584486515");
                                }
                            }
                        };
                        this.A00 = runnable2;
                        this.A03.postDelayed(runnable2, TimeUnit.SECONDS.toMillis((long) 1Br.A07(this.A04).Ai7(37170592599835383L)));
                        return;
                    }
                    return;
                }
                throw 4YV.A0f(str);
            case 1942735149:
                if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnVisible")) {
                    this.A07 = A1X;
                    return;
                }
                throw 4YV.A0f(str);
            default:
                throw 4YV.A0f(str);
        }
    }
}
