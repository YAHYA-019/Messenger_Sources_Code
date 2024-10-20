package X;

import com.facebook.rtc.interfaces.RoomsJoinOptions;
import com.google.common.base.Function;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Imm.class */
public final class Imm implements Function {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Imm(I05 i05, RoomsJoinOptions roomsJoinOptions, SettableFuture settableFuture, String str, int i) {
        this.A00 = i;
        this.A02 = settableFuture;
        this.A03 = i05;
        this.A04 = str;
        this.A01 = roomsJoinOptions;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        1FX r304;
        I05 i05;
        String str;
        RoomsJoinOptions roomsJoinOptions;
        String message;
        String str2;
        boolean z;
        Throwable th = (Throwable) obj;
        switch (this.A00) {
            case 0:
                if (th == null) {
                    throw 1BK.A0h();
                }
                r304 = (1FX) this.A02;
                i05 = (I05) this.A03;
                str = this.A04;
                roomsJoinOptions = (RoomsJoinOptions) this.A01;
                message = th.getMessage();
                str2 = "explicit_redirect_to_join_failure_dialog";
                z = true;
                break;
            case 1:
                if (th == null) {
                    throw 1BK.A0h();
                }
                r304 = (1FX) this.A02;
                i05 = (I05) this.A03;
                str = this.A04;
                roomsJoinOptions = (RoomsJoinOptions) this.A01;
                message = th.getMessage();
                str2 = "invalid_server_data";
                z = false;
                break;
            default:
                if (th == null) {
                    throw 1BK.A0h();
                }
                return Boolean.valueOf(((1FX) this.A02).set(Boolean.valueOf(I05.A00((I05) this.A03, (RoomsJoinOptions) this.A01, this.A04, th.getMessage(), th.getMessage(), false, false))));
        }
        AbG.A1W(r304, I05.A00(i05, roomsJoinOptions, str, message, str2, false, z));
        return false;
    }
}
