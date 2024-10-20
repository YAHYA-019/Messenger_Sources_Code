package X;

import android.content.Context;

/* renamed from: X.4Io, reason: invalid class name */
/* loaded from: 4Io.class */
public final /* synthetic */ class C4Io implements C4Ip {
    public final /* synthetic */ Context A00;

    @Override // X.C4Ip
    public final 4JE AIT(4JD r302) {
        Context context = this.A00;
        String str = r302.A02;
        4JC r0 = r302.A01;
        11T.A0F(r0, 0);
        if (str == null || str.length() == 0) {
            throw AnonymousClass001.A0L("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new 4JE(context, r0, str, true, true);
    }
}
