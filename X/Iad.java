package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Iad.class */
public final class Iad implements C1qM {
    public final int A00;
    public final Object A01;

    public Iad(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1qM
    public final void CNu(Set set) {
        switch (this.A00) {
            case 0:
                7VU r0 = (7VU) this.A01;
                if (set.contains("get_live_location_sharers")) {
                    Iterator A13 = GOo.A13(r0.A04);
                    while (A13.hasNext()) {
                        ((C7V8) A13.next()).A00();
                    }
                }
                if (set.contains("get_live_location_sessions")) {
                    Iterator A132 = GOo.A13(r0.A03);
                    while (A132.hasNext()) {
                        ((C7V8) A132.next()).A00();
                    }
                    return;
                }
                return;
            case 1:
                if (set.contains("gif_search_results_query")) {
                    Cxh cxh = (Cxh) this.A01;
                    Cbd cbd = (Cbd) ((Iar) cxh.A01).A01;
                    ((5Xc) cbd.A0K.get()).AQX();
                    ((GsF) cbd.A08.get()).A00((MailboxCallback) null, cxh.A02).addResultCallback(new Iaj(this, this, 10));
                    return;
                }
                return;
            case 2:
                if (set.contains("highMessagesPerSecondStatus")) {
                    ((C3RI) this.A01).A02(true);
                    return;
                }
                return;
            case 3:
                if (set.contains("tam_typing_indicator_list")) {
                    C30d c30d = (C30d) this.A01;
                    AnonymousClass207 anonymousClass207 = C30d.A0F;
                    GsE gsE = c30d.A09;
                    Iby iby = new Iby(c30d, 34);
                    1Um AQV = gsE.mMailboxApiHandleMetaProvider.AQV(0);
                    MailboxFutureImpl A0Q = 1BK.A0Q(AQV, iby);
                    1Um.A02(AQV, new Iaj(gsE, A0Q, 25), A0Q, false);
                    return;
                }
                return;
            default:
                if (set.contains("get_reactions_v2_details_range")) {
                    GVv.A01((GVv) this.A01);
                    return;
                }
                if (set.contains("get_reactions_v2_details")) {
                    GVv gVv = (GVv) this.A01;
                    C2633Gjl c2633Gjl = gVv.A00;
                    GVv.A00(new C2633Gjl(c2633Gjl.A00, c2633Gjl.A01, 2, c2633Gjl.A03, c2633Gjl.A02), gVv);
                    return;
                }
                return;
        }
    }
}
