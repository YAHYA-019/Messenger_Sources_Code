package com.facebook.messaging.communitymessaging.plugins.bots.botsthreadsettingdata;

import X.11T;
import X.BTX;
import X.C1x;
import X.CaE;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: BotsThreadSettingDataImplementation.class */
public final class BotsThreadSettingDataImplementation {
    public LiveData A00;
    public BTX A01;
    public final Observer A02;
    public final ThreadKey A03;
    public final C1x A04;

    public BotsThreadSettingDataImplementation(ThreadKey threadKey, C1x c1x) {
        11T.A0F(c1x, 2);
        this.A03 = threadKey;
        this.A04 = c1x;
        this.A02 = CaE.A00(this, 55);
    }
}
