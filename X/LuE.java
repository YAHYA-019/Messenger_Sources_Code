package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.particles.DownloadMessagingParticlesModule$MessagingParticlesFactory;

/* loaded from: LuE.class */
public final class LuE implements C15h {
    public final int A00;
    public final Object A01;

    public LuE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    private NDd A00() {
        return (NDd) 1Bn.A0E((Context) null, ((DownloadMessagingParticlesModule$MessagingParticlesFactory) this.A01).A00, 311298);
    }

    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        int i;
        1BY r305;
        Object A00;
        switch (this.A00) {
            case 0:
                i = 131092;
                LVA lva = (LVA) this.A01;
                CallerContext callerContext = LVA.A0Q;
                r305 = lva.A08.A00;
                A00 = 1Bn.A0E((Context) null, r305, i);
                break;
            case 1:
                i = 115355;
                LVA lva2 = (LVA) this.A01;
                CallerContext callerContext2 = LVA.A0Q;
                r305 = lva2.A08.A00;
                A00 = 1Bn.A0E((Context) null, r305, i);
                break;
            case 2:
                i = 131088;
                LVA lva22 = (LVA) this.A01;
                CallerContext callerContext22 = LVA.A0Q;
                r305 = lva22.A08.A00;
                A00 = 1Bn.A0E((Context) null, r305, i);
                break;
            case 3:
                i = 131107;
                LVA lva222 = (LVA) this.A01;
                CallerContext callerContext222 = LVA.A0Q;
                r305 = lva222.A08.A00;
                A00 = 1Bn.A0E((Context) null, r305, i);
                break;
            case 4:
                i = 131082;
                r305 = ((Lgl) this.A01).A00;
                A00 = 1Bn.A0E((Context) null, r305, i);
                break;
            case 5:
                A00 = 1Bn.A0B(131286);
                break;
            case 6:
                Context context = (Context) this.A01;
                int i2 = JU4.A1p;
                A00 = 1Bn.A0E(context, (1BY) null, 99968);
                break;
            case 7:
                i = 83431;
                r305 = ((Km0) this.A01).A00;
                A00 = 1Bn.A0E((Context) null, r305, i);
                break;
            case 8:
                A00 = A00();
                break;
            case 9:
                i = 67283;
                r305 = ((L8F) this.A01).A00;
                A00 = 1Bn.A0E((Context) null, r305, i);
                break;
            case 10:
                i = 16790;
                r305 = ((L8F) this.A01).A00;
                A00 = 1Bn.A0E((Context) null, r305, i);
                break;
            case 11:
                i = 180298;
                LEX lex = (LEX) this.A01;
                boolean z = LEX.A0N;
                r305 = lex.A0B.A00;
                A00 = 1Bn.A0E((Context) null, r305, i);
                break;
            case 12:
                i = 65798;
                LEX lex2 = (LEX) this.A01;
                boolean z2 = LEX.A0N;
                r305 = lex2.A0B.A00;
                A00 = 1Bn.A0E((Context) null, r305, i);
                break;
            case 13:
                i = 83432;
                r305 = ((C4QQ) this.A01).A00;
                A00 = 1Bn.A0E((Context) null, r305, i);
                break;
            default:
                A00 = ((C3bj) this.A01).A00();
                break;
        }
        return A00;
    }
}
