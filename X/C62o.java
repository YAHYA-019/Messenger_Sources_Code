package X;

import android.content.Context;
import com.facebook.messaging.model.messages.Message;
import com.google.common.collect.ImmutableList;

/* renamed from: X.62o, reason: invalid class name */
/* loaded from: 62o.class */
public final class C62o implements C62p {
    public 1BY A00;
    public final C00i A01 = new 1BQ(66140);
    public final C00i A02 = new 1BV((1BY) null, 49935);

    public C62o(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    @Override // X.C62p
    public boolean BS0(C62b c62b) {
        this.A01.get();
        11T.A0F(c62b, 0);
        int ordinal = c62b.ordinal();
        return (ordinal == 8 || ordinal == 17 || ordinal == 16) ? false : true;
    }

    @Override // X.C62p
    public boolean BS1(5zD r302, AnonymousClass622 anonymousClass622, C63j c63j) {
        6Ay BCm;
        Message message = anonymousClass622.A03;
        boolean z = true;
        if (!5Q0.A06(message)) {
            63V A00 = ((C60h) this.A02.get()).A00(anonymousClass622);
            this.A01.get();
            11T.A0F(A00, 0);
            switch (A00.ordinal()) {
                case 0:
                case 1:
                case 7:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 24:
                case 25:
                case 26:
                case 27:
                case 36:
                case 43:
                    break;
                case 22:
                    if (!(c63j instanceof C63h) && !(c63j instanceof C6eP)) {
                        z = false;
                        break;
                    }
                    break;
                case 23:
                    5Pm r0 = message.A08;
                    if (r0 == null || (BCm = r0.BCm()) == null) {
                        return false;
                    }
                    ImmutableList A0x = BCm.A0x();
                    if (A0x.isEmpty()) {
                        return false;
                    }
                    return ((C6eM) 1Hv.A02((Context) 1Bn.A0E((Context) null, this.A00, 83719), 67315)).A00((6Az) A0x.get(0)) instanceof C63h;
                default:
                    return false;
            }
        }
        return z;
    }
}
