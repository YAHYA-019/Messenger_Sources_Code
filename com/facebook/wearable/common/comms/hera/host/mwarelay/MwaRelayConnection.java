package com.facebook.wearable.common.comms.hera.host.mwarelay;

import X.0fH;
import X.11T;
import X.1BP;
import X.1Br;
import X.1Bu;
import X.1Kd;
import X.4YT;
import X.4YU;
import X.54Q;
import X.5Iw;
import X.7hZ;
import X.7zL;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.Bwy;
import X.C06w;
import X.C06z;
import X.CP4;
import X.JJN;
import X.JO6;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Base64;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.wearable.common.comms.hera.shared.intf.HeraCallingCoordinationType;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* loaded from: MwaRelayConnection.class */
public final class MwaRelayConnection extends CP4 implements JJN {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(MwaRelayConnection.class, "context", "getContext()Landroid/content/Context;", 0), new C06w(MwaRelayConnection.class, "stellaIntentLauncher", "getStellaIntentLauncher()Lcom/facebook/messaging/stella/intents/StellaIntentLauncher;", 0), new C06w(MwaRelayConnection.class, "pairedAccountUtils", "getPairedAccountUtils()Lcom/facebook/messaging/stella/utils/pairedaccount/PairedAccountUtils;", 0)};
    public JO6 onCoordinationCallback;
    public final 1BP context$delegate = FbInjector.A00;
    public final 1Br stellaIntentLauncher$delegate = 1Bu.A00(49484);
    public final 1Br pairedAccountUtils$delegate = 1Bu.A00(82256);

    private final Context getContext() {
        return 7zL.A09();
    }

    private final 5Iw getPairedAccountUtils() {
        return (5Iw) 1Br.A0B(this.pairedAccountUtils$delegate);
    }

    private final 54Q getStellaIntentLauncher() {
        return (54Q) 1Br.A0B(this.stellaIntentLauncher$delegate);
    }

    public JO6 getOnCoordinationCallback() {
        return this.onCoordinationCallback;
    }

    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        if (jSONObject == null) {
            0fH.A0k(MwaRelayConnectionKt.TAG, "Received empty call dispatch payload");
            return new 7hZ(AnonymousClass001.A0L("Empty payload"));
        }
        0fH.A0l(MwaRelayConnectionKt.TAG, "Handle call engine data");
        byte[] decode = Base64.decode(jSONObject.getString("encoded_stream"), 0);
        JO6 jo6 = this.onCoordinationCallback;
        if (jo6 != null) {
            int ordinal = HeraCallingCoordinationType.CALL_ENGINE.ordinal();
            11T.A0D(decode);
            11T.A0F(decode, 0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(decode.length);
            allocateDirect.put(decode);
            allocateDirect.flip();
            jo6.onCoordination(0, ordinal, allocateDirect);
        }
        return 1Kd.A0A(CP4.success(""));
    }

    public final boolean isConnected() {
        return getPairedAccountUtils().A02();
    }

    public void sendCoordinationUpdate(int i, int i2, ByteBuffer byteBuffer) {
        11T.A0F(byteBuffer, 2);
        0fH.A0l(MwaRelayConnectionKt.TAG, "Upstream data to devices");
        Intent A0A = 4YU.A0A(4YT.A00(1000));
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        byteBuffer.flip();
        A0A.putExtra(AnonymousClass000.A00(14), bArr);
        A0A.putExtra(TraceFieldType.RequestID, String.valueOf(SystemClock.elapsedRealtimeNanos()));
        getStellaIntentLauncher().A00(7zL.A09(), A0A, "MANAGE_CALLING");
    }

    public void setOnCoordinationCallback(JO6 jo6) {
        this.onCoordinationCallback = jo6;
    }
}
