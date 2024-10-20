package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.32h, reason: invalid class name */
/* loaded from: 32h.class */
public final class C32h extends BroadcastReceiver {
    public final 1Ij A00;
    public final 1KX A01;
    public final 39S A02;

    public C32h(1Ij r302, 1KX r303, 39S r304) {
        this.A01 = r303;
        this.A00 = r302;
        this.A02 = r304;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int A01 = 0FI.A01(-1072907436);
        39S r0 = this.A02;
        r0.A00 = System.currentTimeMillis();
        if (getResultCode() == -1) {
            String resultData = getResultData();
            Bundle resultExtras = getResultExtras(true);
            r0.A00 = new 1Ka(resultData, resultExtras.getLong("timestamp", Long.MAX_VALUE), resultExtras.getString("origin"));
            this.A01.A00(r0);
        } else {
            r0.A01 = 0S2.A0C;
        }
        1I9 r02 = this.A01.A01;
        if (r02 != null) {
            r02.A06(true);
        }
        1Ij r03 = this.A00;
        if (r03 != null) {
            r03.A00(r0);
        }
        0FI.A0D(668942137, A01, intent);
    }
}
