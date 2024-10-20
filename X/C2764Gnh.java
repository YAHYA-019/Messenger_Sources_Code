package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.messaging.montage.composer.ui.EditorToolsIcon;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.Gnh, reason: case insensitive filesystem */
/* loaded from: Gnh.class */
public final class C2764Gnh extends IFM {
    public IE8 A00;
    public HSt A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final Hrw A07;
    public final IWN A08;
    public final Htr A09;
    public final ImmutableSet A0A;

    public C2764Gnh(ViewGroup viewGroup, Hrw hrw, HSt hSt, IWN iwn, C6x1 c6x1, Htr htr, ImmutableSet immutableSet) {
        super(viewGroup, (AbR) null, hrw, c6x1, true);
        this.A02 = 1BV.A00(543);
        this.A03 = AbH.A0Q();
        this.A04 = 1BQ.A02(115988);
        this.A06 = 1BQ.A02(68021);
        this.A05 = 1BQ.A02(114696);
        this.A01 = hSt;
        this.A0A = immutableSet;
        this.A09 = htr;
        htr.A05.add(new C2790Go7(this));
        this.A07 = hrw;
        this.A08 = iwn;
        iwn.CcN(new HSb(this));
    }

    public static void A00(LinearLayout linearLayout, C1u3 c1u3, C2764Gnh c2764Gnh, int i) {
        GOn.A1S(c1u3, GOn.A0M(c2764Gnh.A03), (EditorToolsIcon) linearLayout.findViewById(i));
    }

    public void A0F() {
        super.A0F();
        IE8 ie8 = this.A00;
        if (ie8 != null) {
            1Du it = ie8.A0c.iterator();
            while (it.hasNext()) {
                ((EditorToolsIcon) it.next()).A0E();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0400, code lost:
    
        if (((X.IFM) r0.A0K.A00).A06.A02.AyK() != X.0S2.A01) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0548 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x057a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0568 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0019 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0H() {
        /*
            Method dump skipped, instructions count: 1464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2764Gnh.A0H():void");
    }
}
