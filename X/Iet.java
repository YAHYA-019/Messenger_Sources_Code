package X;

import com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler;

/* loaded from: Iet.class */
public final class Iet implements StreamEventHandler {
    public 5TK A00;

    @Override // com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler
    public void onData(byte[] bArr) {
        this.A00.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r302 != 3) goto L16;
     */
    @Override // com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFlowStatus(int r302) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Iet.onFlowStatus(int):void");
    }

    @Override // com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler
    public void onLog(String str) {
        this.A00.get();
    }

    @Override // com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler
    public void onTermination(int i, String str, boolean z) {
    }
}
