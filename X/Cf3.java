package X;

import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: Cf3.class */
public final class Cf3 implements DK5 {
    public Future A00;
    public final DK5 A01;
    public final C1325Ae3 A02;
    public final CBW A03;
    public final DFe A04;
    public final ScheduledExecutorService A05;

    public Cf3(DK5 dk5, CBW cbw, ScheduledExecutorService scheduledExecutorService) {
        Cpq cpq = new Cpq(this, 0);
        this.A04 = cpq;
        this.A02 = new C1325Ae3();
        this.A01 = dk5;
        this.A05 = scheduledExecutorService;
        this.A03 = cbw;
        dk5.A5L(cpq);
    }

    private void A00(Runnable runnable, long j) {
        Future future = this.A00;
        if (future != null) {
            future.cancel(false);
            this.A00 = null;
        }
        this.A01.BPx();
        this.A00 = this.A05.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public void A5L(DFe dFe) {
        this.A02.A00(dFe);
    }

    public void ASQ(CharSequence charSequence) {
        int codePointCount;
        11T.A0F(charSequence, 0);
        if (!1JF.A0E(new CharSequence[]{charSequence}) && (codePointCount = Character.codePointCount(charSequence, 0, charSequence.length())) < 3) {
            long j = codePointCount == 2 ? 300L : 500L;
            0fH.A0X(AnonymousClass001.A0X(this.A01), Cf3.class, "scheduling %s.filter(CharSequence) for constraint: %s", charSequence);
            A00(new SAr(this, charSequence), j);
        } else {
            Future future = this.A00;
            if (future != null) {
                future.cancel(false);
                this.A00 = null;
            }
            this.A01.ASQ(charSequence);
        }
    }

    public void ASS(DHt dHt, CharSequence charSequence) {
        int codePointCount;
        11T.A0F(charSequence, 0);
        if (1JF.A0E(new CharSequence[]{charSequence}) || (codePointCount = Character.codePointCount(charSequence, 0, charSequence.length())) >= 3) {
            Future future = this.A00;
            if (future != null) {
                future.cancel(false);
                this.A00 = null;
            }
            this.A01.ASS(dHt, charSequence);
            return;
        }
        long j = codePointCount == 2 ? 300L : 500L;
        if (this.A00 == null) {
            Qo5 BCA = this.A01.BCA();
            Qo5 qo5 = Qo5.A01;
            if (BCA != qo5) {
                dHt.CN6(qo5);
            }
        }
        0fH.A0X(AnonymousClass001.A0X(this.A01), Cf3.class, "scheduling %s.filter(CharSequence, FilterListener) for constraint: %s", charSequence);
        A00(new SCs(this, dHt, charSequence), j);
    }

    public DataSourceIdentifier AgX() {
        return this.A01.AgX();
    }

    public Qo5 BCA() {
        return this.A00 != null ? Qo5.A01 : this.A01.BCA();
    }

    @Override // X.DK5
    public void BOl(DEZ dez) {
        this.A01.BOl(dez);
    }

    @Override // X.DK5
    public void BPx() {
        this.A01.BPx();
    }

    @Override // X.DK5
    public void Clc(ImmutableList immutableList) {
        this.A01.Clc(immutableList);
    }

    public /* bridge */ /* synthetic */ C1323Ae1 Cpm(ByH byH, Object obj) {
        return this.A01.Cpm(byH, obj);
    }

    @Override // X.DK5
    public void CuB(DEY dey) {
        this.A01.CuB(dey);
    }

    @Override // X.DK5
    public void CuT(String str) {
        this.A01.CuT(str);
    }

    public String getFriendlyName() {
        return 0Pz.A0j("ContactPickerDelayingListFilter wrapping {", this.A01.getFriendlyName(), "}");
    }
}
