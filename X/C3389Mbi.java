package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Mbi, reason: case insensitive filesystem */
/* loaded from: Mbi.class */
public final class C3389Mbi extends C23s implements NBJ {
    public C3389Mbi() {
        super(360429819);
    }

    public C3389Mbi(int i) {
        super(i);
    }

    @Override // X.NBJ
    public String Ac9() {
        return A0C("checkout_button_label");
    }

    @Override // X.NBJ
    public boolean Ane() {
        return A0D(1, "full_billing_required");
    }

    @Override // X.NBJ
    public ImmutableList B0S() {
        return A07(KOy.A0K, "optional_fields", 2);
    }

    @Override // X.NBJ
    public ImmutableList B7K() {
        return A07(MfN.A01, "request_fields", 3);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        return MRl.A0B(new N9a[]{MRr.A00(), MRr.A02(Rtc.A00), MRr.A01(), MRr.A01(), MRr.A01(), MRw.A00(), MRw.A00()});
    }
}
