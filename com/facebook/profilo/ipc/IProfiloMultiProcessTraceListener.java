package com.facebook.profilo.ipc;

import android.os.IInterface;

/* loaded from: IProfiloMultiProcessTraceListener.class */
public interface IProfiloMultiProcessTraceListener extends IInterface {
    void CFc(IProfiloMultiProcessTraceService iProfiloMultiProcessTraceService);

    void DA5(long j);

    void onTraceAbort(TraceContext traceContext);

    void onTraceStart(TraceContext traceContext);

    void onTraceStop(TraceContext traceContext);
}
