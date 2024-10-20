package com.facebook.papaya.client.transport.batch;

import android.content.Context;
import com.facebook.jni.HybridClassBase;

/* loaded from: ITransport.class */
public abstract class ITransport extends HybridClassBase {
    public final Context context;

    public ITransport(Context context) {
        this.context = context;
    }
}
