package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.google.common.base.Objects;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Afc, reason: case insensitive filesystem */
/* loaded from: Afc.class */
public final class C1370Afc extends 2Xd {
    public 1BY A00;
    public Bbs A01;
    public List A02;
    public final Context A03;
    public final LayoutInflater A04;
    public final View.OnClickListener A05;
    public final C00i A06;
    public final C00i A07;
    public final C2S A08;
    public final List A09;
    public final List A0A;
    public final C15h A0B;

    public C1370Afc(1BO r302) {
        Context A0J = 7zP.A0J();
        this.A03 = A0J;
        this.A0B = DBe.A00(this, 14);
        this.A04 = (LayoutInflater) 1Hv.A02(A0J, 100193);
        this.A08 = (C2S) 1Bn.A0B(82456);
        this.A07 = AbH.A0S();
        this.A06 = AbH.A0K();
        this.A05 = CZD.A00(this, 17);
        this.A02 = AnonymousClass001.A0s();
        this.A0A = AnonymousClass001.A0s();
        this.A09 = AnonymousClass001.A0s();
        this.A00 = 7zL.A0Q(r302);
    }

    public void A0H(List list) {
        Object obj = this.A0B.get();
        LinkedList A1F = AbF.A1F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessengerAccountInfo A0W = AbF.A0W(it);
            if (Objects.equal(A0W.A0A, obj)) {
                A1F.add(0, A0W);
            } else {
                A1F.add(A0W);
            }
        }
        this.A02 = A1F;
        AbG.A0B(this.A06).Ciz(new D5F(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0116, code lost:
    
        r304 = r0.A02;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void BlZ(X.C2lb r302, int r303) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1370Afc.BlZ(X.2lb, int):void");
    }

    public /* bridge */ /* synthetic */ C2lb Bs3(ViewGroup viewGroup, int i) {
        View inflate;
        C2lb b3c;
        if (i != 0) {
            LayoutInflater layoutInflater = this.A04;
            if (i != 2) {
                inflate = layoutInflater.inflate(2132541467, viewGroup, false);
                List list = C2lb.A0J;
                b3c = new B3d(this.A03, inflate, (1GU) this.A06.get(), this, this.A08, 1BK.A0S(this.A07), this.A0A, this.A09);
            } else {
                inflate = layoutInflater.inflate(2132541483, viewGroup, false);
                b3c = new C2lb(inflate);
            }
        } else {
            inflate = this.A04.inflate(2132541467, viewGroup, false);
            List list2 = C2lb.A0J;
            b3c = new B3c(this.A03, inflate, (1GU) this.A06.get(), this, this.A0A, this.A09);
        }
        inflate.setOnClickListener(this.A05);
        return b3c;
    }

    public int getItemCount() {
        return this.A02.size() + 1;
    }

    public int getItemViewType(int i) {
        if (i == this.A02.size()) {
            return 2;
        }
        return (i == 0 && Objects.equal(this.A0B.get(), ((MessengerAccountInfo) this.A02.get(i)).A0A)) ? 0 : 1;
    }
}
