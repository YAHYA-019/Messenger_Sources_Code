package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import kotlin.jvm.functions.Function1;

/* loaded from: AC5.class */
public final class AC5 implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public AC5(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj2;
        this.A04 = str;
        this.A02 = obj;
        this.A01 = obj3;
    }

    public static Function1 A00(AC5 ac5) {
        ((C4k) ac5.A03).A03.A00((ThreadKey) ac5.A02, ac5.A04);
        return (Function1) ac5.A01;
    }

    public void onFailure(Throwable th) {
        Function1 A00;
        8uX r305;
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                9RA r0 = ((9Tp) this.A03).A04;
                String str = this.A04;
                7zV.A13(r0, 1BK.A0n(str), 1Br.A02(r0.A01), "biim_private_reply_send_failure");
                ((1K9) this.A02).onFailure(th);
                C9fd c9fd = (C9fd) this.A01;
                c9fd.A02.remove(str);
                C9fd.A00(c9fd);
                return;
            case 1:
                11T.A0F(th, 0);
                A00 = A00(this);
                if ((th instanceof DpH) && ((DpH) th).error.code == 1915001) {
                    r305 = 8uY.A00;
                    A00.invoke(r305);
                }
                break;
            default:
                A00 = A00(this);
                if (A00 == null) {
                    return;
                }
                break;
        }
        r305 = 8uX.A00;
        A00.invoke(r305);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Function1 A00;
        switch (this.A00) {
            case 0:
                11T.A0F(obj, 0);
                9RA r0 = ((9Tp) this.A03).A04;
                7zV.A13(r0, 1BK.A0n(this.A04), 1Br.A02(r0.A01), 1BJ.A00(1056));
                ((1K9) this.A02).onSuccess(obj);
                return;
            case 1:
                A00 = A00(this);
                A00.invoke(8uZ.A00);
                return;
            default:
                A00 = A00(this);
                if (A00 == null) {
                    return;
                }
                A00.invoke(8uZ.A00);
                return;
        }
    }
}
