package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Ma1, reason: case insensitive filesystem */
/* loaded from: Ma1.class */
public final class C3342Ma1 extends C23s implements MQK {
    public C3342Ma1() {
        super(819626379);
    }

    public C3342Ma1(int i) {
        super(i);
    }

    public String AkR() {
        return A0B(3, "error_message");
    }

    public String AmL() {
        return A0B(4, "field_id");
    }

    public boolean AsE() {
        return A0D(6, "is_optional");
    }

    public String Asw() {
        return A0C("label");
    }

    public String B35() {
        return A0B(1, 7zK.A00(4));
    }

    public ImmutableList BIg() {
        return A09("validation_rules", C3341Ma0.class, 7);
    }

    public QtO BIw() {
        return A0A(QtO.A01, "value_type", 8);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        MRt mRt = MRt.A00;
        return MRl.A0B(new N9a[]{MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt), MRr.A02(Rtc.A00), MRw.A01(), MRr.A02(mRt)});
    }
}
