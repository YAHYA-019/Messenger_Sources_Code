package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Mcr, reason: case insensitive filesystem */
/* loaded from: Mcr.class */
public final class C3434Mcr extends C23s implements GO3 {
    public C3434Mcr() {
        super(150909867);
    }

    public C3434Mcr(int i) {
        super(i);
    }

    @Override // X.GO3
    public String AXW() {
        return A0B(5, "associated_credential_id");
    }

    @Override // X.GO3
    public ImmutableList AY0() {
        return A09("auth_ticket_capabilities", C3433Mcq.class, 6);
    }

    @Override // X.GO3
    public QtC AY1() {
        return A0A(QtC.A01, "auth_ticket_status", 2);
    }

    @Override // X.GO3
    public EOM AY2() {
        return A0A(EOM.A01, DKB.A00(308), 1);
    }

    @Override // X.GO3
    public String AmY() {
        return A0B(3, "fingerprint");
    }

    @Override // X.GO3
    public int BHH() {
        return A02(4, "ttl");
    }

    @Override // X.GO3
    public String getId() {
        return A0C("strong_id__");
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        MRt mRt = MRt.A00;
        return MRl.A0B(new N9a[]{MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt), MRr.A02(MRs.A00), MRr.A02(mRt), MRw.A01()});
    }
}
