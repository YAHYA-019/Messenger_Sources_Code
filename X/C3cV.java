package X;

import com.facebook.stash.core.FileStash;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3cV, reason: invalid class name */
/* loaded from: 3cV.class */
public final class C3cV implements C3mM, InterfaceC04704bq {
    public RHC A00;
    public final C3mM A01;
    public final ScheduledExecutorService A02;

    public C3cV(C3mM c3mM, ScheduledExecutorService scheduledExecutorService) {
        11T.A0F(scheduledExecutorService, 1);
        this.A02 = scheduledExecutorService;
        this.A01 = c3mM;
    }

    @Override // X.InterfaceC04704bq
    public void AAw(FileStash fileStash) {
        this.A00 = new RHC(fileStash);
    }

    @Override // X.InterfaceC04714br
    public boolean BTb(int i) {
        return true;
    }

    @Override // X.C3mM
    public boolean BVm(String str) {
        throw 0Q8.createAndThrow();
    }

    @Override // X.C3mM
    public void BsJ(String str, String str2, String str3) {
        this.A01.BsJ(str, "__key_size", str3);
    }

    @Override // X.InterfaceC04714br
    public void C0R(String str, int i, java.util.Map map) {
        RHC rhc;
        11T.A0F(str, 0);
        C3mM c3mM = this.A01;
        if (c3mM.BVm(str)) {
            if (i == 0 && (rhc = this.A00) != null) {
                i = 1;
                if (rhc.A00.hasKey(str)) {
                    i = 2;
                }
            }
            c3mM.C0R(str, i, null);
        }
    }

    @Override // X.InterfaceC04714br
    public void C1w(String str, int i, java.util.Map map) {
        11T.A0F(str, 0);
        this.A01.C1w(str, i, null);
        RHC rhc = this.A00;
        if (rhc != null) {
            this.A02.schedule((Runnable) new SDf(rhc, this, str), 30, TimeUnit.SECONDS);
        }
    }

    @Override // X.InterfaceC04714br
    public void CGM(int i, int i2, String str, java.util.Map map) {
        11T.A0F(str, 0);
        this.A01.CGM(i, i2, str, null);
    }
}
