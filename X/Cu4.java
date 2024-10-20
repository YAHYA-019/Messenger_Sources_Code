package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fury.context.ReqContext;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Cu4.class */
public final class Cu4 implements C49B {
    public RaJ A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1De A05;

    public Cu4(1De r302) {
        this.A05 = r302;
        1BY r0 = r302.A00;
        this.A04 = 1Bu.A03(r0, 83218);
        this.A02 = 1Bu.A03(r0, 82710);
        this.A01 = 7zM.A0P();
        this.A03 = 1Bu.A03(r0, 83219);
    }

    public final void A00(Context context, 06Z r303, BOp bOp, ThreadSummary threadSummary, DGD dgd, List list) {
        String str;
        int i;
        Object[] objArr;
        ParticipantInfo participantInfo;
        1BK.A1K(list, 3, bOp);
        1Br.A0C(this.A03);
        RaJ raJ = new RaJ(context, r303, bOp, threadSummary, dgd);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : list) {
            ThreadParticipant threadParticipant = (ThreadParticipant) obj;
            if (threadParticipant != null && (participantInfo = threadParticipant.A05) != null && 4YU.A1Y(participantInfo.A0H, 66)) {
                A0s.add(obj);
            }
        }
        ((6Hk) RaJ.A00(raJ)).A00 = raJ;
        B5K A00 = RaJ.A00(raJ);
        ThreadSummary threadSummary2 = raJ.A06;
        BOp bOp2 = raJ.A03;
        A00.A01 = threadSummary2;
        A00.A02 = A0s;
        A00.A00 = bOp2;
        if (!1BK.A1Y(A0s)) {
            throw 1BK.A0g();
        }
        Context context2 = raJ.A01;
        ArrayList A0z = 1BL.A0z(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            A0z.add(AbH.A0j(it).A0F);
        }
        Resources resources = context2.getResources();
        List list2 = RaJ.A00(raJ).A02;
        if (list2 != null) {
            int size = list2.size();
            List list3 = RaJ.A00(raJ).A02;
            if (list3 != null) {
                String quantityString = resources.getQuantityString(2131820783, size, AnonymousClass001.A1a(list3.size()));
                11T.A0A(quantityString);
                B5K A002 = RaJ.A00(raJ);
                List list4 = A002.A02;
                if (list4 != null) {
                    int size2 = list4.size();
                    Resources A09 = 4YV.A09(A002.A04);
                    if (size2 != 1) {
                        if (size2 != 2) {
                            i = 2131964543;
                            if (size2 != 3) {
                                i = 2131964542;
                                objArr = new Object[]{C28p.A02((ThreadParticipant) list4.get(0)), C28p.A02((ThreadParticipant) list4.get(1)), Integer.valueOf(list4.size() - 2)};
                            }
                        } else {
                            i = 2131964544;
                        }
                        objArr = new Object[]{C28p.A02((ThreadParticipant) list4.get(0)), C28p.A02((ThreadParticipant) list4.get(1))};
                    } else {
                        i = 2131964541;
                        objArr = new Object[]{C28p.A02((ThreadParticipant) list4.get(0))};
                    }
                    String string = A09.getString(i, objArr);
                    11T.A0C(string);
                    CDw cDw = new CDw();
                    CDw.A00(cDw, raJ, ActionId.FUTURE_LISTENERS_COMPLETE);
                    String string2 = context2.getString(2131968133);
                    cDw.A02 = string2;
                    AbF.A1V(string2);
                    cDw.A03 = true;
                    C7m c7m = new C7m(cDw);
                    CDw cDw2 = new CDw();
                    cDw2.A01 = new CvG(raJ, 0);
                    String string3 = context2.getString(2131968141);
                    cDw2.A02 = string3;
                    AbF.A1V(string3);
                    ImmutableList of = ImmutableList.of((Object) c7m, (Object) new C7m(cDw2));
                    11T.A0A(of);
                    MigColorScheme A0m = 7zQ.A0m(raJ.A04);
                    11T.A0F(A0m, 5);
                    EAX A003 = BVT.A00(context2, (Drawable) null, A0m, of, quantityString, string, A0z, true);
                    raJ.A00 = A003;
                    str = "bottomSheetDialog";
                    A003.setOnCancelListener(new CQx(raJ, 9));
                    EAX eax = raJ.A00;
                    if (eax != null) {
                        eax.show();
                        B5K A004 = RaJ.A00(raJ);
                        1EK.A09("RestrictGroupWarningPresenter", 529121621636450L);
                        try {
                            FbUserSession A03 = 1Br.A03(A004.A05);
                            ReqContext A04 = AnonymousClass018.A04("RestrictGroupWarningPresenter", 0);
                            try {
                                CQS cqs = (CQS) 1Br.A0B(A004.A03);
                                ThreadSummary threadSummary3 = A004.A01;
                                if (threadSummary3 == null) {
                                    11T.A0L("threadSummary");
                                } else {
                                    ThreadKey A0f = AbF.A0f(threadSummary3);
                                    BOp bOp3 = A004.A00;
                                    if (bOp3 != null) {
                                        CQS.A07(bOp3, A03, A0f, cqs);
                                        if (A04 != null) {
                                            A04.close();
                                        }
                                        1EK.A03();
                                        this.A00 = raJ;
                                        return;
                                    }
                                    11T.A0L("entryPoint");
                                }
                                throw 0Q8.createAndThrow();
                            } finally {
                            }
                        } catch (Throwable th) {
                            1EK.A03();
                            throw th;
                        }
                    }
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
            }
        }
        str = "restrictedUsers";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.C49B
    public void dismiss() {
        RaJ raJ = this.A00;
        if (raJ != null) {
            raJ.A01();
        }
    }
}
