package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.1Aa, reason: invalid class name */
/* loaded from: 1Aa.class */
public final class C1Aa implements C4Av {
    public static final /* synthetic */ C06z[] A00 = {new 08W(C1Aa.class, "attestationNonceProvider", "<v#0>"), new 08W(C1Aa.class, "playIntegrityTokenValidator", "<v#1>")};

    public static final C1Ae A00(1Br r301) {
        return (C1Ae) r301.A0G();
    }

    public static final C1Ag A01(1Br r301) {
        return (C1Ag) r301.A0G();
    }

    public static final boolean A02(MFE mfe, C1Ae c1Ae, C1Ag c1Ag, AnonymousClass046 anonymousClass046, ScheduledExecutorService scheduledExecutorService) {
        11T.A0F(c1Ae, 0);
        11T.A0G(mfe, 1, c1Ag);
        11T.A0F(scheduledExecutorService, 3);
        11T.A0F(anonymousClass046, 4);
        L2b l2b = new L2b(new KzB(0, 0, 3, (DefaultConstructorMarker) null), new L9i(null, null, 3, false), mfe, c1Ae, c1Ag, scheduledExecutorService, 192);
        final SettableFuture create = SettableFuture.create();
        l2b.A01(new MIM() { // from class: X.1Ai
            @Override // X.MIM
            public void Bxl(String str, Throwable th, List list) {
                SettableFuture.this.setException(th);
            }

            @Override // X.MIM
            public void COr(String str, String str2, List list) {
                11T.A0F(str, 0);
                SettableFuture.this.set(str);
            }
        });
        try {
            create.get();
            return true;
        } catch (Exception e) {
            0fH.A0s("PlayIntegrityAttestationConditionalWorkerMessenger", "Play Integrity Attestation failed", e);
            AnonymousClass047 ACu = anonymousClass046.ACu("Play Integrity attestation failed while requesting integrity token from Google", 817898443);
            ACu.Cmr(e);
            ACu.report();
            return false;
        }
    }

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        boolean z = false;
        11T.A0F(r302, 0);
        if (r302.A01()) {
            1Br A002 = 1Bu.A00(60);
            z = A02((MFE) 1Bu.A04(59), A00(A002), A01(1Bu.A00(61)), (AnonymousClass046) 1Bu.A04(16669), (ScheduledExecutorService) 1Bq.A01(16465));
        }
        return z;
    }
}
