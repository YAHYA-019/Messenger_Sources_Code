package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.checkpoint.CheckpointActivity;
import com.facebook.checkpoint.CheckpointMetadata;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* renamed from: X.Amx, reason: case insensitive filesystem */
/* loaded from: Amx.class */
public final class C1616Amx extends 1Ni {
    public final C00i A00;

    public C1616Amx() {
        super(1BV.A00(32924), (C02w) 1Bi.A03(0));
        this.A00 = 1BQ.A02(16616);
    }

    public /* bridge */ /* synthetic */ void A02(Context context, Intent intent, Object obj) {
        C00i c00i;
        AnonymousClass492 anonymousClass492 = (AnonymousClass492) obj;
        Activity A08 = ((1Od) this.A00.get()).A08();
        if (A08 != null) {
            String action = intent.getAction();
            if ("com.facebook.checkpoint.USER_IN_CHECKPOINT".equals(action)) {
                c00i = anonymousClass492.A00;
                ((C5H) c00i.get()).A02 = true;
                C00i c00i2 = anonymousClass492.A03;
                if (((1Ex) c00i2.get()).BTw() && !((1Ex) c00i2.get()).BU1()) {
                    CheckpointMetadata checkpointMetadata = (CheckpointMetadata) intent.getParcelableExtra("arg_checkpoint_metadata");
                    String str = checkpointMetadata != null ? checkpointMetadata.A00 : ConstantsKt.CAMERA_ID_FRONT;
                    Bzp bzp = (Bzp) anonymousClass492.A01.get();
                    11T.A0F(str, 0);
                    AbL.A0w(1BK.A08(1Br.A02(bzp.A00), "checkpoint_listener_triggered"), str, false);
                    CPc cPc = (CPc) anonymousClass492.A02.get();
                    Bundle extras = intent.getExtras();
                    C00j.A05("FbUriIntentHandler.handleUri", 588858303);
                    try {
                        cPc.A04(A08, extras, "/checkpoint/block", (String) null, true);
                        C00j.A01(235924627);
                        return;
                    } catch (Throwable th) {
                        C00j.A01(-579661457);
                        throw th;
                    }
                }
            } else {
                if (!"com.facebook.checkpoint.USER_IN_CHECKPOINT_NATIVE".equals(action)) {
                    return;
                }
                c00i = anonymousClass492.A00;
                ((C5H) c00i.get()).A02 = true;
                C00i c00i3 = anonymousClass492.A03;
                if (((1Ex) c00i3.get()).BTw() && !((1Ex) c00i3.get()).BU1()) {
                    CheckpointMetadata checkpointMetadata2 = (CheckpointMetadata) intent.getParcelableExtra("arg_checkpoint_metadata");
                    String str2 = checkpointMetadata2 != null ? checkpointMetadata2.A00 : ConstantsKt.CAMERA_ID_FRONT;
                    Bzp bzp2 = (Bzp) anonymousClass492.A01.get();
                    11T.A0F(str2, 0);
                    AbL.A0w(1BK.A08(1Br.A02(bzp2.A00), "checkpoint_listener_triggered"), str2, true);
                    Intent A0D = C3o5.A0D(A08, CheckpointActivity.class);
                    A0D.addFlags(268435456);
                    0LS.A0A(A08, A0D);
                    return;
                }
            }
            C5H c5h = (C5H) c00i.get();
            c5h.A01 = null;
            c5h.A02 = false;
        }
    }
}
