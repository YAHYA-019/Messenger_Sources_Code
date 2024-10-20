package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.concurrent.Executor;

/* renamed from: X.22S, reason: invalid class name */
/* loaded from: 22S.class */
public final class C22S implements LifecycleEventObserver {
    public long A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public final SharedPreferences A04;
    public final 22R A05;
    public final Context A06;
    public final Executor A07;

    public C22S(Context context, 22R r303, Executor executor) {
        11T.A0F(r303, 2);
        11T.A0F(executor, 3);
        this.A06 = context;
        this.A05 = r303;
        this.A07 = executor;
        SharedPreferences sharedPreferences = context.getSharedPreferences("media_bank_storage_management_preferences", 0);
        11T.A0A(sharedPreferences);
        this.A04 = sharedPreferences;
        this.A00 = -1;
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, X.0CL] */
    public static final void A00(C22S c22s) {
        LWd lWe;
        22R r0 = c22s.A05;
        boolean z = c22s.A02;
        long j = c22s.A00;
        FbUserSession A04 = ((1Fv) 1Bi.A03(66351)).A04();
        Context context = FbInjector.A03;
        11T.A0A(context);
        36Q r02 = (36Q) 1Lm.A05(context, A04, 67997);
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        11T.A0F(r02, 2);
        if (z && r02.A03) {
            lWe = new LWd(qPLInstance, r02.A02, j, z);
        } else if (!r02.A04) {
            return;
        } else {
            lWe = new LWe(r0, qPLInstance, r02.A01, z);
        }
        C3mD c3mD = (C3mD) lWe;
        if (c3mD != null) {
            0fH.A0j("[MP] MediaBankStorageManagement", 0Pz.A0W("Using Policy: ", c3mD.getName()));
            long currentTimeMillis = System.currentTimeMillis() - c22s.A04.getLong("timestamp_last_mediabank_directory_traversal_ms", 0L);
            long j2 = r02.A00 * 60000;
            if (currentTimeMillis < j2) {
                0fH.A0g(Long.valueOf((j2 - currentTimeMillis) / 3600000), "[MP] MediaBankStorageManagement", "Too soon to perform disk cache eviction. %d hours left");
                return;
            }
            ?? obj = new Object();
            C3RC Auf = c3mD.Auf();
            ((0CL) obj).element = Auf;
            long j3 = currentTimeMillis / 60000;
            C07z c07z = C07y.A00;
            11T.A0F(c07z, 0);
            int A03 = c07z.A03();
            Auf.A00 = A03;
            QuickPerformanceLogger quickPerformanceLogger = Auf.A02;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerStart(Auf.A01, A03);
            }
            C3RC.A00(Auf, Long.valueOf(j3), "time_since_last_eviction");
            if (c3mD.Cyq()) {
                ((C3RC) ((0CL) obj).element).A02("perform_mailbox_action_start");
                c3mD.CXF(new Kpl(c22s, c3mD, obj), c22s.A07);
            } else {
                0fH.A0j("[MP] MediaBankStorageManagement", "Disk cache eviction not started because of cache eviction policy");
                ((C3RC) ((0CL) obj).element).A02("skipped_due_to_cache_eviction_policy");
                ((C3RC) ((0CL) obj).element).A01(0, c22s.A01, 0L, true);
            }
        }
    }

    public final void A01() {
        StringBuilder sb = new StringBuilder();
        sb.append("unregister called on ");
        sb.append(Thread.currentThread());
        0fH.A0j("[MP] MediaBankStorageManagement", sb.toString());
        new Handler(Looper.getMainLooper()).post(new 22T(this));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        11T.A0F(event, 1);
        if (event.ordinal() == 3) {
            0fH.A0j("[MP] MediaBankStorageManagement", "doEviction");
            if (this.A03) {
                A00(this);
                return;
            }
            3J6 r0 = new 3J6(this);
            FbUserSession A04 = ((1Fv) 1Bi.A03(66351)).A04();
            Context context = FbInjector.A03;
            11T.A0A(context);
            1Uj r02 = (1Uj) 1Lm.A05(context, A04, 16686);
            11T.A0F(r02, 0);
            MailboxFeature mailboxFeature = new MailboxFeature(r02);
            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(2);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
            if (!AQV.Cj2(new LXJ(mailboxFutureImpl, mailboxFeature, 3))) {
                mailboxFutureImpl.cancel(false);
            }
            mailboxFutureImpl.addResultCallback(new LXA(r0, 3));
        }
    }
}
