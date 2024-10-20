package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.realtime.pulsar.Pulsar;
import com.facebook.realtime.pulsar.PulsarAppJob;
import com.facebook.realtime.pulsar.PulsarOptions;
import com.facebook.realtime.requeststream.RequestStreamClientProvider;
import com.facebook.realtime.requeststream.network.NetworkDetailedStateGetter;

/* loaded from: Ixl.class */
public final class Ixl implements Runnable {
    public static final String __redex_internal_original_name = "PulsarAppJob$createScheduledQEPulsarRunnable$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ PulsarAppJob A01;

    public Ixl(FbUserSession fbUserSession, PulsarAppJob pulsarAppJob) {
        this.A01 = pulsarAppJob;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PulsarAppJob pulsarAppJob = this.A01;
        String A02 = 2yD.A02(PulsarAppJob.A00(pulsarAppJob), 36876374460138190L);
        Qpu qpu = Qpu.A02;
        try {
            int length = A02.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A1U = GOp.A1U(11T.A00(A02.charAt(i2), 32));
                if (z) {
                    if (!A1U) {
                        break;
                    } else {
                        length--;
                    }
                } else if (A1U) {
                    i++;
                } else {
                    z = true;
                }
            }
            qpu = Qpu.valueOf(GOq.A0z(length, i, A02));
        } catch (IllegalArgumentException e) {
            0fH.A0a(A02, qpu, e, "Pulsar", "pulsar test type '%s' does not exist, falling back to '%s'");
        }
        1G1 r0 = this.A00;
        Pulsar.startPulsarTest((RequestStreamClientProvider) 1Lm.A06(r0, 115241), ((1gT) 1Br.A0B(pulsarAppJob.A03)).BL6(), GOp.A1H(pulsarAppJob.A01), (NetworkDetailedStateGetter) 1Br.A0B(pulsarAppJob.A02), Long.parseLong(r0.A05), qpu.value, PulsarAppJob.A00(pulsarAppJob).BCy(36876374456337099L), PulsarAppJob.A00(pulsarAppJob).BCy(36876374455550664L), (PulsarOptions) 1Lo.A08(r0, 82381), PulsarAppJob.A00(pulsarAppJob).AZk(2342157000651644325L));
    }
}
