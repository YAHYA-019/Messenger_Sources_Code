package X;

import com.facebook.messaging.cuckoo.apimanager.CuckooApiManager;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.meta.metaai.imagine.creation.impl.data.EmuFlashRepository;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;

/* loaded from: G91.class */
public final class G91 extends 0DO implements Function2 {
    public int A00;
    public int A01;
    public final int A02 = 1;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G91(Eva eva, String str, 0DR r304) {
        super(2, r304);
        this.A03 = eva;
        this.A04 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G91(CuckooApiManager cuckooApiManager, String str, 0DR r304, int i) {
        super(2, r304);
        this.A03 = cuckooApiManager;
        this.A04 = str;
        this.A00 = i;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return this.A02 != 0 ? new G91((Eva) this.A03, this.A04, r303) : new G91((CuckooApiManager) this.A03, this.A04, r303, this.A00);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        int incrementAndGet;
        if (this.A02 != 0) {
            0Ds r0 = 0Ds.A02;
            if (this.A01 != 0) {
                incrementAndGet = this.A00;
                0Dt.A00(obj);
            } else {
                0Dt.A00(obj);
                Eva eva = (Eva) this.A03;
                incrementAndGet = eva.A03.A01.incrementAndGet();
                EmuFlashRepository emuFlashRepository = eva.A02;
                EyE eyE = new EyE(this.A04, eva.A00);
                this.A00 = incrementAndGet;
                this.A01 = 1;
                obj = emuFlashRepository.A00(eyE, this);
                if (obj == r0) {
                    return r0;
                }
            }
            Eva eva2 = (Eva) this.A03;
            AtomicInteger atomicInteger = eva2.A03.A00;
            if (incrementAndGet > atomicInteger.get()) {
                atomicInteger.set(incrementAndGet);
                if (obj != null) {
                    eva2.A06.Cvx(obj);
                }
            }
            return 04S.A00;
        }
        0Ds r02 = 0Ds.A02;
        boolean z = true;
        if (this.A01 != 0) {
            0Dt.A00(obj);
        } else {
            0Dt.A00(obj);
            CuckooApiManager cuckooApiManager = (CuckooApiManager) this.A03;
            CuckooApiManager.A01("fetch_third_party_contact", null, null);
            C8ye A00 = CuckooApiManager.A00(cuckooApiManager);
            String str2 = this.A04;
            int i = this.A00;
            1Um AQV = A00.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
            MailboxFutureImpl mailboxFutureImpl2 = new MailboxFutureImpl(AQV);
            1Um.A01(AQV, new IbM(A00, mailboxFutureImpl2, mailboxFutureImpl, str2, i, 0), mailboxFutureImpl, mailboxFutureImpl2);
            this.A01 = 1;
            obj = 5Rp.A00(mailboxFutureImpl2, this);
            if (obj == r02) {
                return r02;
            }
        }
        5Qb r03 = (5Qb) obj;
        if (r03.A00 == 0) {
            str = "fetch_third_party_contact_success";
        } else {
            z = false;
            str = "fetch_third_party_contact_failure";
        }
        CuckooApiManager.A01(str, r03.A01, r03.A02);
        return Boolean.valueOf(z);
    }
}
