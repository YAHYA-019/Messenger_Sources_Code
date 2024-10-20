package X;

/* renamed from: X.Mbz, reason: case insensitive filesystem */
/* loaded from: Mbz.class */
public final class C3406Mbz extends C23s implements MQI {
    public C3406Mbz() {
        super(1127336367);
    }

    public C3406Mbz(int i) {
        super(i);
    }

    public MP5 AWX() {
        return (MP5) A04(C3405Mby.class, "amount");
    }

    public String AhU() {
        return A0B(2, "description");
    }

    public String Apk() {
        return A0B(4, "icon_uri");
    }

    public String Asw() {
        return A0B(1, "label");
    }

    public int B5e() {
        return A02(5, "quantity");
    }

    public QtF BCI() {
        return A0A(QtF.A01, "status", 3);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        N9a A00 = MRw.A00();
        MRt mRt = MRt.A00;
        return MRl.A0B(new N9a[]{A00, MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt), MRr.A02(MRs.A00)});
    }
}
