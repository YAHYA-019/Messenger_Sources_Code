package com.facebook.proxygen;

/* loaded from: NativeHandleImpl.class */
public class NativeHandleImpl implements NativeHandle {
    public long mNativeHandle;

    @Override // com.facebook.proxygen.NativeHandle
    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r302 == 0) goto L6;
     */
    @Override // com.facebook.proxygen.NativeHandle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setNativeHandle(long r302) {
        /*
            r301 = this;
            r0 = r301
            long r0 = r0.mNativeHandle
            r304 = r0
            r0 = 0
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L21
            r0 = r302
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 0
            r308 = r0
            r0 = r309
            if (r0 != 0) goto L24
        L21:
            r0 = 1
            r308 = r0
        L24:
            r0 = r308
            com.facebook.proxygen.utils.Preconditions.checkState(r0)
            r0 = r301
            r1 = r302
            r0.mNativeHandle = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.proxygen.NativeHandleImpl.setNativeHandle(long):void");
    }
}
