package X;

import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;

/* loaded from: Izd.class */
public final class Izd implements Runnable {
    public static final String __redex_internal_original_name = "HeadsetDetector$AudioConnectionBR$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ GSL A02;

    public Izd(Context context, Intent intent, GSL gsl) {
        this.A02 = gsl;
        this.A00 = context;
        this.A01 = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        GSL gsl = this.A02;
        Intent intent = this.A01;
        Hpj hpj = gsl.A00;
        synchronized (hpj) {
            if (hpj.A05) {
                String action = intent.getAction();
                if (action != null) {
                    boolean z = true;
                    if (action.equals("android.intent.action.HEADSET_PLUG")) {
                        if (intent.getIntExtra("state", 0) == 0) {
                            for (AudioDeviceInfo audioDeviceInfo : hpj.A02.getDevices(2)) {
                                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7) {
                                    break;
                                }
                            }
                            z = false;
                        }
                        hpj.A03.post(new IvL(hpj, z));
                    }
                    if (action.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED")) {
                        if (intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0) != 2) {
                            for (AudioDeviceInfo audioDeviceInfo2 : hpj.A02.getDevices(2)) {
                                if (audioDeviceInfo2.getType() == 4 || audioDeviceInfo2.getType() == 3) {
                                    break;
                                }
                            }
                            z = false;
                        }
                        hpj.A03.post(new IvL(hpj, z));
                    }
                }
            }
        }
    }
}
