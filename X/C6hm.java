package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.analytics.perf.events.events.ReportThreadViewOpen;
import com.facebook.messaging.data.repository.threadsummary.interfaces.ThreadSummaryDataModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible;

/* renamed from: X.6hm, reason: invalid class name */
/* loaded from: 6hm.class */
public final class C6hm implements 1Vf {
    public LiveData A00;
    public Observer A01;
    public 1X9 A02;
    public boolean A03;
    public final 1Br A05;
    public final Context A0B;
    public final FbUserSession A0C;
    public final 1Br A04 = 1Bq.A00(66481);
    public final 1Br A07 = 1Bq.A00(68470);
    public final 1Br A06 = 1Bq.A00(66774);
    public final 1Br A09 = 1Bq.A00(67528);
    public final 1Br A08 = 1Bq.A00(82690);
    public final C22K A0A = new C22K();

    public C6hm(Context context, FbUserSession fbUserSession) {
        this.A0B = context;
        this.A0C = fbUserSession;
        this.A05 = 1Lm.A00(context, fbUserSession, 33183);
    }

    public static final void A00(C6hm c6hm, ThreadKey threadKey, ThreadSummary threadSummary, 5SW r304) {
        if (2oI.A05(threadSummary)) {
            ((C3O8) 1Br.A0B(c6hm.A08)).A00(r304);
            c6hm.A03 = true;
            c6hm.A01(threadKey, 0L);
        }
    }

    private final void A01(ThreadKey threadKey, long j) {
        if (!this.A0A.A01(j)) {
            0fH.A0j("SelectiveSyncThreadViewEventHandler", "Skipping sync for current thread");
            return;
        }
        ReportThreadViewOpen reportThreadViewOpen = new ReportThreadViewOpen(threadKey, threadKey.A0u().hashCode());
        6Bw A00 = C6iY.A00();
        A00.A00 = this.A0B;
        2dU.A01(A00, reportThreadViewOpen);
        MailboxFeature mailboxFeature = (MailboxFeature) this.A05.A00.get();
        long A0s = threadKey.A0s();
        PrivacyContext A002 = ((AnonymousClass224) this.A06.A00.get()).A00("951388345621219");
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new Iay(1, A0s, mailboxFutureImpl, mailboxFeature, A002))) {
            mailboxFutureImpl.cancel(false);
        }
        this.A02 = mailboxFutureImpl.addResultCallback(new A1b(this, 6));
    }

    private final boolean A02(ThreadKey threadKey) {
        if (threadKey.A1A() && 1WY.A01((1WY) this.A04.A00.get()).AZk(36318428139237973L)) {
            return true;
        }
        if (this.A03 && 1Wi.A00((1Wi) this.A07.A00.get()).AZk(36320279271652577L)) {
            return true;
        }
        return threadKey.A1D() && 1Wi.A00((1Wi) this.A07.A00.get()).AZk(36320279271652577L);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        LiveData liveData;
        ThreadKey threadKey;
        ThreadSummaryDataModel threadSummaryDataModel;
        ThreadSummary threadSummary;
        long j;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        int hashCode = str.hashCode();
        if (hashCode != -1787492718) {
            if (hashCode != -1440551537) {
                if (hashCode == 22507532 && str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible")) {
                    OnThreadVisible onThreadVisible = (OnThreadVisible) r302;
                    11T.A0F(onThreadVisible, 0);
                    threadKey = onThreadVisible.A00;
                    if (A02(threadKey)) {
                        j = 1WY.A01((1WY) this.A04.A00.get()).Auy(36599903116137241L);
                        A01(threadKey, j);
                        return;
                    }
                    return;
                }
            } else if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
                OnThreadOpened onThreadOpened = (OnThreadOpened) r302;
                11T.A0F(onThreadOpened, 0);
                threadKey = onThreadOpened.A00;
                2Sh r0 = onThreadOpened.A01;
                boolean z = false;
                if (r0.A01((String) null, C6en.class) != null) {
                    z = true;
                }
                this.A03 = z;
                5SW r02 = (5SW) r0.A01((String) null, 5SW.class);
                if (A02(threadKey)) {
                    j = 0;
                    A01(threadKey, j);
                    return;
                }
                if (threadKey.A1F() && !this.A03 && 1Wi.A00((1Wi) this.A07.A00.get()).AZk(36320279271652577L)) {
                    LiveData ASY = ((C5xl) this.A09.A00.get()).ASY(threadKey);
                    this.A00 = ASY;
                    if (ASY != null && (threadSummaryDataModel = (ThreadSummaryDataModel) ASY.getValue()) != null && (threadSummary = threadSummaryDataModel.A00) != null) {
                        A00(this, threadKey, threadSummary, r02);
                        return;
                    }
                    Observer cZx = new CZx(0, this, threadKey, r02);
                    this.A01 = cZx;
                    LiveData liveData2 = this.A00;
                    if (liveData2 != null) {
                        liveData2.observeForever(cZx);
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadClosed")) {
            1X9 r03 = this.A02;
            if (r03 != null) {
                r03.cancel();
            }
            this.A02 = null;
            Observer observer = this.A01;
            if (observer != null && (liveData = this.A00) != null) {
                liveData.removeObserver(observer);
            }
            this.A00 = null;
            this.A01 = null;
            this.A0A.A00(0S2.A0C);
            return;
        }
        throw 4YV.A0f(str);
    }
}
