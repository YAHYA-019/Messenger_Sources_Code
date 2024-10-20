package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.Ma9, reason: case insensitive filesystem */
/* loaded from: Ma9.class */
public final class C3350Ma9 extends C23s implements MQL {
    public C3350Ma9() {
        super(-1795884327);
    }

    public C3350Ma9(int i) {
        super(i);
    }

    public int AkN() {
        return A02(0, TraceFieldType.ErrorCode);
    }

    public String AkO() {
        return A0B(5, TraceFieldType.Error);
    }

    public QtM AkP() {
        return A0A(QtM.A01, "error_form_field_id", 2);
    }

    public String AkZ() {
        return A0B(4, "error_title");
    }

    public String AlN() {
        return A0B(8, "extra_data");
    }

    public MOG B4g() {
        return A05(C3348Ma7.class, "primary_cta", 6);
    }

    public MOH B9L() {
        return A05(C3349Ma8.class, "secondary_cta", 7);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        return MRw.A07();
    }
}
