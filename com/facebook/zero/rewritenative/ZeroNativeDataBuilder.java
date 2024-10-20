package com.facebook.zero.rewritenative;

import X.1IJ;
import X.C0il;
import com.facebook.common.dextricks.Constants;
import com.facebook.jni.HybridData;

/* loaded from: ZeroNativeDataBuilder.class */
public class ZeroNativeDataBuilder {
    public HybridData mHybridData;
    public int mFeaturesVector = -1;
    public int mWhitelistVector = -1;
    public int mRuleVector = -1;
    public 1IJ mFlatBufferBuilder = new 1IJ(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);

    static {
        C0il.A0B("rewritenativeinterceptor");
    }

    public static native HybridData initHybrid(byte[] bArr);

    public void buildNative() {
        if (this.mFeaturesVector == -1) {
            this.mFlatBufferBuilder.A0D(4, 0, 4);
            this.mFeaturesVector = this.mFlatBufferBuilder.A03();
        }
        if (this.mWhitelistVector == -1) {
            this.mFlatBufferBuilder.A0D(4, 0, 4);
            this.mWhitelistVector = this.mFlatBufferBuilder.A03();
        }
        int i = this.mRuleVector;
        if (i == -1) {
            this.mFlatBufferBuilder.A0D(4, 0, 4);
            i = this.mFlatBufferBuilder.A03();
            this.mRuleVector = i;
        }
        1IJ r0 = this.mFlatBufferBuilder;
        int i2 = this.mFeaturesVector;
        int i3 = this.mWhitelistVector;
        r0.A09(3);
        r0.A0B(2, i);
        r0.A0B(1, i3);
        r0.A0B(0, i2);
        this.mFlatBufferBuilder.A08(r0.A02());
        1IJ r02 = this.mFlatBufferBuilder;
        int i4 = r02.A03;
        byte[] bArr = new byte[r02.A06.capacity() - r02.A03];
        r02.A06.position(i4);
        r02.A06.get(bArr);
        this.mHybridData = initHybrid(bArr);
    }
}
