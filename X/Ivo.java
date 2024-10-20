package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Ivo.class */
public final class Ivo implements Runnable {
    public static final String __redex_internal_original_name = "LiveStatusPoller$pollLiveVideoBroadcastStatusInBackgroundThread$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ IF4 A01;

    public Ivo(FbUserSession fbUserSession, IF4 if4) {
        this.A01 = if4;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IF4 if4 = this.A01;
        String str = if4.A0c;
        if (str == null || str.length() == 0) {
            return;
        }
        C30G A0H = AbF.A0H(18);
        A0H.A03(TraceFieldType.VideoId, str);
        boolean z = true;
        if (!if4.A0d) {
            z = false;
        }
        A0H.A08("enable_read_only_viewer_count", z);
        C3sa A00 = C3sa.A00(A0H);
        DKD.A1G(A00);
        A00.A00 = null;
        1Vd A0K = 7zM.A0K(if4.A0J);
        4YU.A1J(A00, 296793995554213L);
        C03713yu A04 = A0K.A04(A00);
        synchronized (if4) {
            ListenableFuture listenableFuture = if4.A03;
            if (listenableFuture != null && !listenableFuture.isDone()) {
                listenableFuture.cancel(false);
                Boolean bool = if4.A06;
                if (bool == null) {
                    bool = 2yD.A01(1Br.A06(if4.A0S), 36311358622534404L);
                    if4.A06 = bool;
                }
                11T.A0I(bool, 1BJ.A00(0));
                if (bool.booleanValue() && !if4.A0F) {
                    ((C01s) AbF.A0R(if4.A0Q).get()).D0v(IF4.A0f, "LiveStatusPoller scheduled a new poll too early");
                    if4.A0F = true;
                }
            }
            if4.A03 = A04;
        }
        1Br.A0D(if4.A0V, new GgZ(if4), A04);
    }
}
