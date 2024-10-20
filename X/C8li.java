package X;

import android.content.Context;
import com.facebook.messaging.montage.model.MontageCard;

/* renamed from: X.8li, reason: invalid class name */
/* loaded from: 8li.class */
public final class C8li extends C1rj {
    public 5SA A00;
    public Qxf A01;

    public C8li() {
        super("MessageMontageTileComponent");
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    public Integer A0m() {
        return 0S2.A01;
    }

    public Object A0n(Context context) {
        return ((82O) 1Bn.A0A(356)).A0F(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.274, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ AnonymousClass274 A10() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.23P, java.lang.Object] */
    @Override // X.C1rj
    public void A1I(1Iw r302, AnonymousClass274 anonymousClass274, C27G c27g) {
        int A05 = c27g.A05();
        int A00 = c27g.A00();
        ?? obj = new Object();
        obj.A01 = A05;
        obj.A00 = A00;
        ((C9sh) anonymousClass274).A00 = obj;
    }

    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        69W r0 = ((69T) obj).A02;
        if (r0.A03) {
            return;
        }
        r0.A03();
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        Qxf qxf = this.A01;
        5SA r0 = this.A00;
        C23P c23p = ((C9sh) anonymousClass274).A00;
        int i = c23p.A01;
        int i2 = c23p.A00;
        C69b c69b = ((69T) obj).A03;
        c69b.A01 = i;
        c69b.A00 = i2;
        MontageCard montageCard = qxf.A01;
        if (montageCard != null) {
            c69b.A0D(montageCard, false, true);
        } else {
            c69b.A0C(qxf.A00);
        }
        c69b.A0B(r0);
    }

    @Override // X.C1rj
    public void A1L(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        69W r0 = ((69T) obj).A02;
        if (r0.A03) {
            r0.A04();
        }
    }

    @Override // X.C1rj
    public void A1O(AnonymousClass274 anonymousClass274, AnonymousClass274 anonymousClass2742) {
        ((C9sh) anonymousClass274).A00 = ((C9sh) anonymousClass2742).A00;
    }

    @Override // X.C1rj
    public boolean A1X() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8li c8li = (C8li) r302;
            Qxf qxf = this.A01;
            Qxf qxf2 = c8li.A01;
            if (qxf != null) {
                if (!qxf.equals(qxf2)) {
                    return false;
                }
            } else if (qxf2 != null) {
                return false;
            }
            5SA r0 = this.A00;
            5SA r02 = c8li.A00;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
        }
        return true;
    }
}
