package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JnU, reason: case insensitive filesystem */
/* loaded from: JnU.class */
public final class C3233JnU extends L5Y implements MNp, C2iz {
    public KeK A00;
    public final KuG A03;
    public final Kqt A04;
    public final Kqf A05;
    public final L2h A06;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final MLg A0E;
    public final KeJ A0F;
    public boolean A02 = false;
    public boolean A01 = false;
    public final C00i A07 = 1BQ.A02(17085);
    public final C00i A08 = 1BQ.A00();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0171, code lost:
    
        if (r0.isEmpty() != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3233JnU(android.content.Context r302, android.content.Intent r303, android.view.View r304, X.JgX r305, X.JgX r306, X.KmY r307, X.LDF r308, X.MLg r309, int r310) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3233JnU.<init>(android.content.Context, android.content.Intent, android.view.View, X.JgX, X.JgX, X.KmY, X.LDF, X.MLg, int):void");
    }

    public static MNo A00(C3233JnU c3233JnU) {
        for (MNo mNo : c3233JnU.A0B) {
            if (mNo.isAvailable()) {
                return mNo;
            }
        }
        return null;
    }

    private void A01() {
        KuG kuG = this.A03;
        if (kuG != null) {
            kuG.A00(0);
            Iterator it = this.A0B.iterator();
            while (it.hasNext()) {
                MNo.A00((MNo) it.next());
            }
        }
    }

    public static void A02(C3233JnU c3233JnU) {
        MNo A00 = A00(c3233JnU);
        KuG kuG = c3233JnU.A03;
        if (kuG != null) {
            if (A00 == null || kuG.A00 || kuG.A01) {
                c3233JnU.A01();
                return;
            }
            kuG.A01(A00);
            for (MNo mNo : c3233JnU.A0B) {
                if (mNo != A00) {
                    MNo.A00(mNo);
                }
            }
        }
    }

    @Override // X.C2iz
    public void AU9(C2j1 c2j1) {
        c2j1.A00(5);
    }

    @Override // X.C2iz
    public void AUA(C2mq c2mq) {
    }

    @Override // X.MNp
    public void BOG() {
        A01();
    }

    @Override // X.MNp
    public boolean C24(long j) {
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            if (((MNp) it.next()).C24(j)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.MNp
    public void CAi(String str) {
        KuG kuG;
        if (1BK.A0N(this.A08).AZk(36312398011109752L) && !this.A01) {
            if (A00(this) != null && (kuG = this.A03) != null) {
                kuG.A04.A0U();
            }
            this.A01 = true;
        }
        A02(this);
        ((C2j0) this.A07.get()).A02(this);
    }

    @Override // X.MNp
    public void Cc2() {
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            ((MNp) it.next()).Cc2();
        }
    }

    @Override // X.MNp
    public void Clk(boolean z) {
        KuG kuG;
        MNo A00 = A00(this);
        if ((A00 == null || this.A02) && (kuG = this.A03) != null) {
            kuG.A02(A00, z ? 0S2.A00 : 0S2.A01);
        }
    }

    @Override // X.MNp
    public void D0U() {
        A02(this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // X.MNp
    public void setProgress(int i) {
        this.A02 = AnonymousClass001.A1Q(i, 100);
    }
}
