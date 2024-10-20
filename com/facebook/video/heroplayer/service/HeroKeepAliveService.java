package com.facebook.video.heroplayer.service;

import X.0FI;
import X.C08o;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* loaded from: HeroKeepAliveService.class */
public final class HeroKeepAliveService extends Service {
    public final Binder A00 = new Binder();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.A00;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int A01 = C08o.A01(this, 87171365);
        int A04 = 0FI.A04(-552491219);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        0FI.A0A(-1415623181, A04);
        C08o.A03(-561151390, A01);
        return onStartCommand;
    }
}
