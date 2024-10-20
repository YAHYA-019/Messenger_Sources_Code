package com.facebook.stall.contframes;

import X.1BK;
import X.1BQ;
import X.AbH;
import X.C00i;
import X.C0dr;
import X.C0il;
import X.C2mT;
import X.Kcp;
import X.L8J;
import X.L8X;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.concurrent.TimeUnit;

/* loaded from: ContiguousFramesTracker.class */
public class ContiguousFramesTracker {
    public L8J mCUTracker;
    public L8X mContiguousFrameBuckets;
    public long mContiguousUpdateStartQplTime;
    public int mContiguousUpdates;
    public L8X mFirstFrameBuckets;
    public int mFirstFrameDurationMs;
    public L8X mFrameBuckets;
    public volatile boolean mHookSetup;
    public boolean mInContiguousUpdate;
    public final C00i mMonotonicClock;
    public long mNativeContext;
    public L8X mPendingBuckets;
    public IntBuffer mSharedBuffer;
    public int mStateDurationWhilePendingMs;
    public int mTotalStateDurationWhilePendingMs;
    public final C00i mQpl = AbH.A0M();
    public final C00i mCurrentModuleHolder = 1BQ.A02(17093);
    public final C00i mAndroidThreadUtil = AbH.A0K();

    static {
        C0il.A0B("ContiguousFramesTracker");
    }

    public ContiguousFramesTracker() {
        1BQ A02 = 1BQ.A02(84488);
        this.mMonotonicClock = A02;
        this.mCUTracker = new L8J((C0dr) A02.get());
        int[] iArr = Kcp.A01;
        this.mFrameBuckets = new L8X(iArr);
        this.mFirstFrameBuckets = new L8X(iArr);
        this.mContiguousFrameBuckets = new L8X(iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endContiguousUpdate() {
        this.mContiguousUpdates = 0;
        if (this.mInContiguousUpdate) {
            this.mInContiguousUpdate = false;
            1BK.A0U(this.mQpl).markerEnd(44826638, 0, (short) 2);
            this.mCUTracker.A03(false);
        }
    }

    public static native long initializeNative(ByteBuffer byteBuffer);

    public void onFrameDuration(int i) {
        IntBuffer intBuffer = this.mSharedBuffer;
        if (intBuffer == null) {
            return;
        }
        int i2 = 0;
        if (intBuffer.get(0) == 0) {
            if (this.mContiguousUpdates != 0) {
                endContiguousUpdate();
                return;
            }
            return;
        }
        this.mSharedBuffer.put(0, 0);
        L8X l8x = this.mFrameBuckets;
        while (true) {
            int[] iArr = l8x.A01;
            if (i2 >= 5 || i < iArr[i2]) {
                break;
            } else {
                i2++;
            }
        }
        l8x.A03(i2, i);
        if (this.mContiguousUpdates == 0) {
            long currentMonotonicTimestamp = 1BK.A0U(this.mQpl).currentMonotonicTimestamp();
            this.mFirstFrameDurationMs = i;
            this.mContiguousUpdateStartQplTime = currentMonotonicTimestamp - i;
            L8X l8x2 = this.mPendingBuckets;
            int i3 = 0;
            while (true) {
                int[] iArr2 = l8x2.A00;
                if (i3 >= 12) {
                    break;
                }
                iArr2[i3] = 0;
                i3++;
            }
            this.mStateDurationWhilePendingMs = 0;
        }
        int i4 = this.mContiguousUpdates + 1;
        this.mContiguousUpdates = i4;
        if (this.mInContiguousUpdate) {
            this.mContiguousFrameBuckets.A03(i2, i);
            return;
        }
        L8X l8x3 = this.mPendingBuckets;
        l8x3.A03(i2, i);
        int i5 = this.mStateDurationWhilePendingMs + i;
        this.mStateDurationWhilePendingMs = i5;
        if (i4 < 5) {
            return;
        }
        this.mInContiguousUpdate = true;
        L8X l8x4 = this.mContiguousFrameBuckets;
        int i6 = 0;
        while (true) {
            int[] iArr3 = l8x4.A00;
            if (i6 >= 12) {
                this.mTotalStateDurationWhilePendingMs += i5;
                this.mFirstFrameBuckets.A02(this.mFirstFrameDurationMs);
                1BK.A0V(this.mQpl).markerStart(44826638, 0, "surface", ((C2mT) this.mCurrentModuleHolder.get()).A02(), this.mContiguousUpdateStartQplTime, TimeUnit.MILLISECONDS);
                this.mCUTracker.A03(true);
                return;
            }
            iArr3[i6] = iArr3[i6] + l8x3.A00[i6];
            i6++;
        }
    }
}
