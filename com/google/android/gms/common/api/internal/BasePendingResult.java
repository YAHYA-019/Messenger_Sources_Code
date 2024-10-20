package com.google.android.gms.common.api.internal;

import X.1BK;
import X.28M;
import X.28W;
import X.7zL;
import X.AbstractC00481b7;
import X.AnonymousClass001;
import X.C28w;
import X.GOn;
import X.JQx;
import X.K2W;
import X.K2X;
import X.K5k;
import X.K7p;
import X.K7q;
import X.K7w;
import X.K7x;
import X.KTG;
import X.Kfw;
import X.Kou;
import X.Lcm;
import X.Ldi;
import X.Ldj;
import X.MCq;
import X.MG8;
import X.MG9;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.LocationSettingsResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: BasePendingResult.class */
public abstract class BasePendingResult extends KTG {
    public static final ThreadLocal A0D = new ThreadLocal();
    public 28W A00;
    public MG9 A01;
    public Status A02;
    public boolean A03;
    public boolean A05;
    public final K5k A06;
    public final WeakReference A08;
    public volatile boolean A0C;
    public Kou resultGuardian;
    public final Object A07 = AnonymousClass001.A0R();
    public final CountDownLatch A0A = new CountDownLatch(1);
    public final ArrayList A09 = AnonymousClass001.A0s();
    public final AtomicReference A0B = new AtomicReference();
    public boolean A04 = false;

    /* JADX WARN: Type inference failed for: r0v16, types: [X.K5k, X.28w] */
    public BasePendingResult(28M r302) {
        this.A06 = new C28w(r302 != null ? r302.A03() : Looper.getMainLooper());
        this.A08 = 7zL.A14(r302);
    }

    public static final 28W A00(BasePendingResult basePendingResult) {
        28W r0;
        synchronized (basePendingResult.A07) {
            AbstractC00481b7.A09(!basePendingResult.A0C, "Result has already been consumed.");
            AbstractC00481b7.A09(AnonymousClass001.A1O((basePendingResult.A0A.getCount() > 0L ? 1 : (basePendingResult.A0A.getCount() == 0L ? 0 : -1))), "Result is not ready.");
            r0 = basePendingResult.A00;
            basePendingResult.A00 = null;
            basePendingResult.A01 = null;
            basePendingResult.A0C = true;
        }
        Kfw kfw = (Kfw) basePendingResult.A0B.getAndSet(null);
        if (kfw != null) {
            kfw.A00.A01.remove(basePendingResult);
        }
        AbstractC00481b7.A02(r0);
        return r0;
    }

    public static void A01(28W r301) {
        if (r301 instanceof MCq) {
            try {
                DataHolder dataHolder = ((Lcm) ((MCq) r301)).A00;
                if (dataHolder != null) {
                    dataHolder.close();
                }
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(JQx.A0w(r301)), e);
            }
        }
    }

    private final void A02(28W r302) {
        this.A00 = r302;
        this.A02 = r302.BCJ();
        this.A0A.countDown();
        if (this.A03) {
            this.A01 = null;
        } else {
            MG9 mg9 = this.A01;
            if (mg9 != null) {
                K5k k5k = this.A06;
                k5k.removeMessages(2);
                1BK.A1I(k5k, GOn.A0G(mg9, A00(this)), 1);
            } else if (this.A00 instanceof MCq) {
                this.resultGuardian = new Kou(this);
            }
        }
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((MG8) arrayList.get(i)).Bpq(this.A02);
        }
        arrayList.clear();
    }

    public 28W A05(Status status) {
        if (this instanceof K2X) {
            return ((K2X) this).A00;
        }
        if (!(this instanceof K2W)) {
            if (this instanceof K7q) {
                return new Ldi(status, null);
            }
            if (this instanceof K7p) {
                return new Ldj(status, null);
            }
            if (this instanceof K7x) {
                return new LocationSettingsResult(status, null);
            }
            boolean z = this instanceof K7w;
        }
        return status;
    }

    public void A06() {
        synchronized (this.A07) {
            if (!this.A03 && !this.A0C) {
                A01(this.A00);
                this.A03 = true;
                A02(A05(Status.A04));
            }
        }
    }

    public final void A07() {
        boolean z = true;
        if (!this.A04 && !AnonymousClass001.A1V(A0D.get())) {
            z = false;
        }
        this.A04 = z;
    }

    public final void A08(28W r302) {
        synchronized (this.A07) {
            if (this.A05 || this.A03) {
                A01(r302);
            } else {
                this.A0A.getCount();
                AbstractC00481b7.A09(!AnonymousClass001.A1O((r0.getCount() > 0L ? 1 : (r0.getCount() == 0L ? 0 : -1))), "Results have already been set");
                AbstractC00481b7.A09(!this.A0C, "Result has already been consumed");
                A02(r302);
            }
        }
    }

    public final void A09(Status status) {
        synchronized (this.A07) {
            if (!AnonymousClass001.A1O((this.A0A.getCount() > 0L ? 1 : (this.A0A.getCount() == 0L ? 0 : -1)))) {
                A08(A05(status));
                this.A05 = true;
            }
        }
    }
}
