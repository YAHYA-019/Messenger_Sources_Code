package com.facebook.messaging.wellbeing.selfremediation.threadwarning;

import X.03Y;
import X.06Z;
import X.0Dc;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.7zM;
import X.7zN;
import X.7zP;
import X.7zQ;
import X.7zS;
import X.7zV;
import X.AK5;
import X.AbF;
import X.AbG;
import X.AbI;
import X.AbK;
import X.BNJ;
import X.BNT;
import X.BOM;
import X.BOp;
import X.BvE;
import X.BvF;
import X.Byh;
import X.C00j;
import X.C1312Adq;
import X.C1359Af1;
import X.C1931Aww;
import X.C1pq;
import X.C5wr;
import X.C8d;
import X.CHw;
import X.CJj;
import X.CNZ;
import X.CNg;
import X.CZ0;
import X.CZ3;
import X.CZ7;
import X.CwM;
import X.CwN;
import X.CwO;
import X.CwP;
import X.DGF;
import X.DGG;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: GroupThreadWarningCardFragment.class */
public final class GroupThreadWarningCardFragment extends MigBottomSheetDialogFragment {
    public ThreadSummary A01;
    public C8d A02;
    public DGF A03;
    public DGG A04;
    public final 1Br A06 = 7zN.A0I(this);
    public final 1Br A05 = 7zM.A0Y();
    public int A00 = 8;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        return new C1931Aww(this.A02, 7zQ.A0m(this.A06));
    }

    public void onCancel(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        DGF dgf = this.A03;
        if (dgf != null) {
            dgf.onCancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        Parcelable.Creator creator;
        C8d c8d;
        int i;
        Object[] objArr;
        int i2;
        int A02 = 0FI.A02(199051799);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Object obj = ThreadSummary.class.getDeclaredField("CREATOR").get(null);
        if (!(obj instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) obj) == null) {
            IllegalArgumentException A0v = 7zS.A0v(ThreadSummary.class);
            0FI.A08(1608496599, A02);
            throw A0v;
        }
        ThreadSummary threadSummary = (ThreadSummary) 7zQ.A0K(requireArguments, creator, ThreadSummary.class, "thread_summary");
        if (threadSummary == null) {
            A0o();
            i2 = -932107359;
        } else {
            this.A01 = threadSummary;
            this.A00 = requireArguments.getInt("entrypoint");
            Context requireContext = requireContext();
            BvE bvE = (BvE) 1Bn.A0E(requireContext, (1BY) null, 68778);
            ThreadSummary threadSummary2 = this.A01;
            if (threadSummary2 == null) {
                11T.A0L("threadSummary");
                throw 0Q8.createAndThrow();
            }
            FbUserSession A09 = 7zV.A09(this, this.A05);
            06Z parentFragmentManager = getParentFragmentManager();
            AK5 ak5 = new AK5(this, 34);
            int i3 = this.A00;
            11T.A0F(A09, 2);
            C00j.A05("GroupThreadWarningCardModelFactory.getModel", 1786074647);
            try {
                03Y A00 = C5wr.A00(requireContext, A09, threadSummary2);
                List list = (List) A00.first;
                List list2 = (List) A00.second;
                if (1BK.A1Y(list) && !((C1312Adq) 1Br.A0B(bvE.A00)).A01(threadSummary2, list)) {
                    Byh byh = (Byh) 1Br.A0B(bvE.A01);
                    int size = list.size();
                    1Br.A0C(byh.A02);
                    CNZ cnz = new CNZ(requireContext, threadSummary2);
                    BNT bnt = i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 6 ? BNT.A0g : BNT.A0M : BNT.A07 : BNT.A0X : BNT.A0I;
                    ThreadKey A0f = AbF.A0f(threadSummary2);
                    long j = A0f.A04;
                    1Br.A0C(byh.A0A);
                    BOM A01 = CJj.A01(threadSummary2);
                    1Br.A0C(byh.A00);
                    1Br.A0C(byh.A09);
                    BNJ bnj = A0f.A0w() ? BNJ.A0F : A0f.A1F() ? BNJ.A08 : BNJ.A0J;
                    AbK.A1S(requireContext, A01);
                    CNg cNg = new CNg(A01, bnt, bnj, j);
                    CwM cwM = new CwM(cNg);
                    CwO cwO = new CwO(cNg);
                    CZ7 cz7 = new CZ7(5, cNg, requireContext, list, A09, threadSummary2, byh, ak5);
                    boolean z = cnz.A02;
                    Context context = cnz.A00;
                    int i4 = 2131953426;
                    if (z) {
                        i4 = 2131953434;
                    }
                    String string = context.getString(i4);
                    C1pq.A08("primaryButtonText", string);
                    CZ0 cz0 = new CZ0(5, cNg, parentFragmentManager, ak5, threadSummary2, byh);
                    int i5 = 2131953424;
                    if (z) {
                        i5 = 2131953433;
                    }
                    String string2 = context.getString(i5);
                    C1pq.A08("secondaryButtonText", string2);
                    0Dc A0P = 7zP.A0P(requireContext);
                    A0P.A02(cnz.A02(list));
                    A0P.A02(" ");
                    A0P.A04(new C1359Af1(requireContext, parentFragmentManager, A01, threadSummary2, byh, list, ak5, j), 33);
                    SpannableString A0A = 7zS.A0A(A0P, cnz.A01(size));
                    String A03 = cnz.A03(list);
                    AbF.A1V(A03);
                    ArrayList A0z = 1BL.A0z(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        A0z.add(AbG.A0t(it).A0k);
                    }
                    new C8d(cz7, cz0, cwM, cwO, A0A, string, string2, A03, A0z);
                } else if (!1BK.A1Y(list2) || ((CHw) 1Br.A0B(bvE.A02)).A02(threadSummary2, list2)) {
                    c8d = null;
                } else {
                    BvF bvF = (BvF) 1Br.A0B(bvE.A03);
                    int size2 = list2.size();
                    BOp bOp = i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 6 ? BOp.A0g : BOp.A0L : BOp.A06 : BOp.A0W : BOp.A0F;
                    CwN cwN = new CwN(bOp, A09, threadSummary2, bvF);
                    CwP cwP = new CwP(bOp, A09, threadSummary2, bvF);
                    CZ7 cz72 = new CZ7(6, requireContext, bOp, ak5, list2, threadSummary2, bvF, A09);
                    String string3 = requireContext.getString(2131968141);
                    C1pq.A08("primaryButtonText", string3);
                    CZ3 cz3 = new CZ3(4, ak5, A09, bOp, parentFragmentManager, bvF, threadSummary2);
                    String string4 = requireContext.getString(2131968133);
                    C1pq.A08("secondaryButtonText", string4);
                    if (size2 != 1) {
                        if (size2 != 2) {
                            i = 2131964543;
                            if (size2 != 3) {
                                i = 2131964542;
                                objArr = new Object[]{AbI.A0q(list2, 0), AbI.A0q(list2, 1), Integer.valueOf(size2 - 2)};
                            }
                        } else {
                            i = 2131964544;
                        }
                        objArr = new Object[]{AbI.A0q(list2, 0), AbI.A0q(list2, 1)};
                    } else {
                        i = 2131964541;
                        objArr = new Object[]{AbI.A0q(list2, 0)};
                    }
                    String string5 = requireContext.getString(i, objArr);
                    11T.A0C(string5);
                    String quantityString = requireContext.getResources().getQuantityString(2131820783, size2, Integer.valueOf(size2));
                    AbF.A1V(quantityString);
                    ArrayList A0z2 = 1BL.A0z(list2);
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        A0z2.add(AbG.A0t(it2).A0k);
                    }
                    new C8d(cz72, cz3, cwN, cwP, string5, string3, string4, quantityString, A0z2);
                }
                C00j.A01(968722969);
                this.A02 = c8d;
                if (c8d == null) {
                    A0o();
                    i2 = 662080884;
                } else {
                    this.A03 = c8d.A02;
                    this.A04 = c8d.A03;
                    i2 = 48726529;
                }
            } catch (Throwable th) {
                C00j.A01(-1684696466);
                throw th;
            }
        }
        0FI.A08(i2, A02);
    }

    public void onStart() {
        int A02 = 0FI.A02(1218326467);
        super/*X.0D2*/.onStart();
        DGG dgg = this.A04;
        if (dgg != null) {
            dgg.CLZ();
        }
        0FI.A08(1487564800, A02);
    }
}
