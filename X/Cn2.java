package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebaroptionsmenu.deleteitem.ThreadedRepliesTitleBarDeleteThreadMenuItemImpl;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadlist.threaditemmenu.plugins.core.deletemenuitem.DeleteMenuItemImplementation;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Cn2.class */
public final class Cn2 implements DIS {
    public final int A00;
    public final Object A01;

    public Cn2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.DIS
    public void Bsz() {
        if (5 - this.A00 == 0) {
            AmD.A07((AmD) this.A01);
        }
    }

    @Override // X.DIS
    public void Bt2() {
        String str;
        switch (this.A00) {
            case 3:
                ((DHc) this.A01).CQL();
                return;
            case 5:
                AmD amD = (AmD) this.A01;
                amD.ANO();
                LithoView lithoView = amD.A02;
                if (lithoView == null) {
                    str = "lithoView";
                } else {
                    C1qb c1qb = amD.A03;
                    str = "sectionContext";
                    if (c1qb != null) {
                        C1rq A00 = C1rg.A00(c1qb);
                        C1ro c1ro = C1ro.CENTER;
                        A00.A2g(c1ro);
                        A00.A2c();
                        C1qb c1qb2 = amD.A03;
                        if (c1qb2 != null) {
                            C1rq A002 = C1rg.A00(c1qb2);
                            A002.A2g(c1ro);
                            A002.A2c();
                            C1qb c1qb3 = amD.A03;
                            if (c1qb3 != null) {
                                8Tj A003 = C8m4.A00(c1qb3);
                                MigColorScheme migColorScheme = amD.A0B;
                                if (migColorScheme != null) {
                                    A002.A2f(8Tj.A06(A003, migColorScheme));
                                    A00.A2e(A002);
                                    lithoView.A0x(A00.A00);
                                    return;
                                }
                                str = "colorScheme";
                            }
                        }
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            default:
                return;
        }
    }

    @Override // X.DIS
    public void Bt3() {
        switch (this.A00) {
            case 1:
                0fH.A0k("ThreadedRepliesTitleBarDeleteThreadMenuItemImpl", "failed to delete reply subthread");
                Context context = ((ThreadedRepliesTitleBarDeleteThreadMenuItemImpl) this.A01).A00;
                6HM r0 = (6HM) 7zR.A0o(context, 50020);
                C8S A00 = COW.A00(context);
                A00.A05 = context.getString(2131957316);
                A00.A04 = context.getString(2131957310);
                r0.A01(context, new COW(A00));
                return;
            case 4:
                DeleteMenuItemImplementation.A02((ThreadSummary) this.A01, false);
                return;
            case 5:
                AmD.A07((AmD) this.A01);
                return;
            default:
                return;
        }
    }

    @Override // X.DIS
    public void Bt7() {
        switch (this.A00) {
            case 0:
                AlR.A09((AlR) this.A01);
                return;
            case 1:
                ThreadedRepliesTitleBarDeleteThreadMenuItemImpl threadedRepliesTitleBarDeleteThreadMenuItemImpl = (ThreadedRepliesTitleBarDeleteThreadMenuItemImpl) this.A01;
                threadedRepliesTitleBarDeleteThreadMenuItemImpl.A04.AGM();
                threadedRepliesTitleBarDeleteThreadMenuItemImpl.A05.CSR();
                return;
            case 2:
                DHc dHc = ((CIf) this.A01).A03;
                if (dHc != null) {
                    dHc.CQL();
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                DeleteMenuItemImplementation.A02((ThreadSummary) this.A01, true);
                return;
            default:
                AmD amD = (AmD) this.A01;
                CallerContext callerContext = AmD.A0V;
                DIa dIa = amD.A0A;
                if (dIa == null) {
                    11T.A0L("messagesRequestListLoader");
                    throw 0Q8.createAndThrow();
                }
                dIa.BZ0(AnonymousClass001.A1W(amD.A06, 1F9.A0O));
                return;
        }
    }
}
