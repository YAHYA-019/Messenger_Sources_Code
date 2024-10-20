package X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* loaded from: I45.class */
public final class I45 {
    public I5a A00;
    public IMJ A01;
    public JNp A02;
    public HeQ A03;
    public Hme A04;
    public IEo A05;
    public List A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final 1De A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final C01i A0H;

    public I45(1De r302) {
        this.A0B = r302;
        1BY r0 = r302.A00;
        this.A0C = 1Bu.A03(r0, 115026);
        this.A0F = 7zM.A0O();
        this.A0D = 1Bu.A03(r0, 100287);
        this.A0E = 1Bq.A00(16469);
        this.A0G = 1Bq.A00(16470);
        C0ty c0ty = C0ty.A00;
        this.A06 = c0ty;
        this.A07 = c0ty;
        this.A0H = J9s.A00(this, C03i.A02, 19);
    }

    public static final void A00(I45 i45) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.addAll(i45.A07);
        A0s.add(i45.A0H.getValue());
        i45.A06 = A0s;
        4YV.A11(i45.A0F).execute(new IrW(i45));
        4YV.A11(i45.A0G).execute(new IrV(i45));
    }

    public void A01() {
        if (this.A07.isEmpty()) {
            A02((JNp) this.A0H.getValue());
            this.A0A = true;
            return;
        }
        this.A0A = false;
        List list = this.A07;
        IYQ iyq = (IYQ) list.get(new Random().nextInt(list.size()));
        if ((11T.A0O(iyq.A00, Uri.EMPTY) ? 0S2.A0C : iyq.A01) == 0S2.A0C) {
            A02(iyq);
            if (GOq.A1R(this.A0C)) {
                return;
            }
            this.A09 = false;
            return;
        }
        if (this.A02 == null) {
            A02((JNp) this.A0H.getValue());
            if (!GOq.A1R(this.A0C)) {
                this.A09 = false;
            }
        }
        iyq.A00(new IYS(this), 4YV.A11(this.A0F));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (((X.IYQ) r302).A02 == (-4)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00bb, code lost:
    
        if (r315 != null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(X.JNp r302) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I45.A02(X.JNp):void");
    }
}
