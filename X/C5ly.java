package X;

import android.content.Context;

/* renamed from: X.5ly, reason: invalid class name */
/* loaded from: 5ly.class */
public final class C5ly implements C5kd {
    public final C5g3 A00 = 5lF.A00;
    public final Context A01;
    public final C5lv A02;
    public final C5kd A03;

    public C5ly(Context context, C5kd c5kd) {
        this.A01 = context;
        this.A03 = c5kd;
        this.A02 = new C5lv(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.7h2, X.5fq] */
    @Override // X.C5kd
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public 82X AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        11T.A0F(r303, 0);
        11T.A0F(interfaceC07894l7, 2);
        11T.A0F(c4l9, 3);
        11T.A0F(r306, 4);
        11T.A0F(c5to, 5);
        if (!((1qX) r303).mResultSet.getBoolean(i, 37)) {
            return null;
        }
        C5kd c5kd = this.A03;
        5PP AxZ = c5kd.AxZ(c5pu, r303, c4l9, interfaceC07894l7, r306, c5to, i);
        ?? c5fq = new C5fq();
        Context context = this.A01;
        String string = context.getString(2131957594);
        11T.A0A(string);
        c5fq.A01 = string;
        String string2 = context.getString(2131957593);
        11T.A0A(string2);
        c5fq.A00 = string2;
        this.A02.A00(r303, c4l9, interfaceC07894l7, c5fq, i, c5to.A01);
        if (AxZ != null) {
            c5fq.A02(c5kd.Asj(), AxZ);
        }
        return new 82X(new 7HJ((C7h2) c5fq));
    }

    @Override // X.C5kd
    public C5g3 Asj() {
        return this.A00;
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
