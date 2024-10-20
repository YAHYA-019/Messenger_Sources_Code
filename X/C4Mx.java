package X;

import androidx.lifecycle.MutableLiveData;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* renamed from: X.4Mx, reason: invalid class name */
/* loaded from: 4Mx.class */
public final class C4Mx extends MutableLiveData {
    public BDh A00;
    public final 1Br A01;
    public final 1De A06;
    public final 1Br A02 = 1Bq.A00(66360);
    public final 1Br A04 = 1Bq.A00(16449);
    public final 1Br A03 = 1Bq.A00(83663);
    public final Function1 A07 = new C4O1(this, 0);
    public final AtomicReference A05 = new AtomicReference();

    public C4Mx(1De r302) {
        this.A06 = r302;
        this.A01 = 1Bu.A03(r302.A00, 82817);
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        Cz4 cz4 = (Cz4) this.A01.A00.get();
        Function1 function1 = this.A07;
        11T.A0F(function1, 0);
        cz4.A00 = function1;
        22I r0 = (22I) 1Lm.A07(((1Fv) 1Bi.A03(66351)).A04(), this.A06.A00, 33183);
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new Cxk(0, r0, new BDh(r0, AQV), mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback((Executor) this.A04.A00.get(), new C4Vw(this, 1));
        ((C1x1) this.A02.A00.get()).A00(this, new C4Q0((List) this.A05.get()));
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        BDh bDh = this.A00;
        if (bDh != null) {
            bDh.D5r();
        }
        this.A00 = null;
    }
}
