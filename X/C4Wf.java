package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4Wf, reason: invalid class name */
/* loaded from: 4Wf.class */
public final class C4Wf implements ListenableFuture, Observer {
    public final LiveData A00;
    public final SettableFuture A01 = new Object();
    public final 4IU A02;
    public final UUID A03;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public C4Wf(4IU r302, UUID uuid) {
        this.A02 = r302;
        this.A03 = uuid;
        4KU A0E = r302.A04.A0E();
        List singletonList = Collections.singletonList(uuid.toString());
        4KU r0 = A0E;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = singletonList.size();
        for (int i = 0; i < size; i++) {
            A0k.append("?");
            if (i < size - 1) {
                A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
        }
        String A0d = AnonymousClass001.A0d(")", A0k);
        TreeMap treeMap = 4KC.A08;
        4KC A00 = 4KF.A00(A0d, size);
        Iterator it = singletonList.iterator();
        int i2 = 1;
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                break;
            }
            C3o5.A0i(A00, it, i3);
            i2 = i3 + 1;
        }
        C4J6 c4j6 = r0.A02.A06;
        Ltl ltl = new Ltl(A00, r0, 1);
        C4J8 c4j8 = c4j6.A01;
        String[] A01 = C4J6.A01(c4j6, new String[]{"WorkTag", "WorkProgress", "workspec"});
        for (String str : A01) {
            java.util.Map map = c4j6.A05;
            Locale locale = Locale.US;
            11T.A0B(locale);
            String lowerCase = str.toLowerCase(locale);
            11T.A0A(lowerCase);
            if (!map.containsKey(lowerCase)) {
                throw 0Pz.A05("There is no table with name ", str);
            }
        }
        C3021Jgk c3021Jgk = new C3021Jgk(c4j8, c4j8.A00, ltl, A01);
        LLj lLj = new LLj(r302, 0);
        C4Ii c4Ii = r302.A06;
        Object obj = new Object();
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(c3021Jgk, new C9qo(lLj, mediatorLiveData, c4Ii, obj));
        this.A00 = mediatorLiveData;
        synchronized (this) {
            if (!this.A01.isDone()) {
                LiveData liveData = this.A00;
                if (liveData.getValue() != null) {
                    onChanged((Ktq) liveData.getValue());
                }
                if (liveData.getValue() == null || !((Ktq) liveData.getValue()).A04.A00()) {
                    AnonymousClass001.A07().post(new S6v(this));
                }
            }
        }
    }

    private void A00() {
        synchronized (this) {
            if (this.A00 != null) {
                AnonymousClass001.A07().post(new S6w(this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.lifecycle.Observer
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public void onChanged(Ktq ktq) {
        synchronized (this) {
            SettableFuture settableFuture = this.A01;
            if (!settableFuture.isDone() && ktq != null) {
                int ordinal = ktq.A04.ordinal();
                if (ordinal == 2) {
                    settableFuture.set(ktq.A02);
                } else if (ordinal == 3) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Work with ");
                    A0k.append(this.A03);
                    settableFuture.setException(AnonymousClass001.A0T(AnonymousClass001.A0d(" failed", A0k)));
                } else if (ordinal == 5) {
                    settableFuture.cancel(true);
                }
                A00();
            }
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.A01.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean cancel;
        synchronized (this) {
            A00();
            4IU r0 = this.A02;
            r0.A06.ARK(new JjM(r0, this.A03));
            cancel = this.A01.cancel(z);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public /* bridge */ /* synthetic */ Object get() {
        return this.A01.get();
    }

    @Override // java.util.concurrent.Future
    public /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        return this.A01.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.A01.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.A01.isDone();
    }
}
