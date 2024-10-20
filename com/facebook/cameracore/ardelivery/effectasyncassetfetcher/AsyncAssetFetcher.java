package com.facebook.cameracore.ardelivery.effectasyncassetfetcher;

import X.0fH;
import X.AnonymousClass001;
import X.C0il;
import X.EMi;
import X.GEI;
import X.GJJ;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener;
import com.facebook.cameracore.ardelivery.listener.CancelableToken;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.jni.HybridData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: AsyncAssetFetcher.class */
public class AsyncAssetFetcher {
    public static final String TAG = "AsyncAssetFetcher";
    public final List mAsyncAssets;
    public final String mEffectId;
    public final String mEffectInstanceId;
    public final GJJ mFetchCallback;
    public HybridData mHybridData;
    public final boolean mIsLoggingDisabled;

    public AsyncAssetFetcher(String str, String str2, List list, GJJ gjj, boolean z) {
        HybridData hybridData;
        this.mEffectId = str;
        this.mEffectInstanceId = str2;
        this.mAsyncAssets = list;
        this.mFetchCallback = gjj;
        this.mIsLoggingDisabled = z;
        if ("robolectric".equals(Build.FINGERPRINT)) {
            hybridData = null;
        } else {
            C0il.A0B("ard-android-async-asset-fetcher");
            hybridData = initHybrid();
        }
        this.mHybridData = hybridData;
    }

    public static ARAssetType fromAsyncAssetType(EMi eMi) {
        if (eMi == EMi.A03) {
            return ARAssetType.REMOTE;
        }
        if (eMi == EMi.A01 || eMi == EMi.A04 || eMi == EMi.A02) {
            return ARAssetType.ASYNC;
        }
        return null;
    }

    private native HybridData initHybrid();

    public CancelableToken fetchAsyncAsset(String str, String str2, String str3, int i, int i2, int i3, OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener) {
        GEI BjS;
        StringBuilder A0k;
        String obj;
        String str4 = str;
        GEI gei = null;
        if (this.mFetchCallback == null) {
            0fH.A0o(TAG, "fetch asset async but AsyncAssetFetchCallback is null.");
            obj = "No AsyncAssetFetchCallback. Abort.";
        } else {
            if (i != EMi.A01.mCppValue && i != EMi.A03.mCppValue && i != EMi.A04.mCppValue && i != EMi.A02.mCppValue) {
                A0k = AnonymousClass001.A0k();
                A0k.append("unsupported async asset type: ");
                A0k.append(i);
            } else {
                if (i2 == 0 || i2 == 1) {
                    EMi eMi = EMi.values()[i];
                    ARAssetType fromAsyncAssetType = fromAsyncAssetType(eMi);
                    fromAsyncAssetType.getClass();
                    int i4 = EMi.A02.mCppValue;
                    if (i == i4 && i2 == 0) {
                        gei = this.mFetchCallback.Bxy(onAsyncAssetFetchCompletedListener, str4, this.mEffectId);
                        return new CancelableLoadToken(gei);
                    }
                    if (i == EMi.A04.mCppValue || (i == i4 && i2 == 1)) {
                        BjS = this.mFetchCallback.BjS(onAsyncAssetFetchCompletedListener, fromAsyncAssetType, eMi, str4, this.mEffectId, this.mEffectInstanceId, this.mIsLoggingDisabled);
                    } else {
                        if (i == EMi.A03.mCppValue) {
                            str4 = TextUtils.join("_", Arrays.asList(this.mEffectId, str3));
                        }
                        long j = -1;
                        BjS = this.mFetchCallback.BjR(onAsyncAssetFetchCompletedListener, new ARRequestAsset(fromAsyncAssetType, ARRequestAsset.CompressionMethod.fromCompressionTypeCppValue(i3), null, eMi, null, null, null, null, str4, this.mEffectInstanceId, null, str3, str2, null, null, str3, null, null, null, -1, j, j, this.mIsLoggingDisabled, false, false));
                    }
                    return new CancelableLoadToken(BjS);
                }
                A0k = AnonymousClass001.A0k();
                A0k.append("Unsupported AsyncAssetRequestType: ");
                A0k.append(i2);
            }
            obj = A0k.toString();
        }
        onAsyncAssetFetchCompletedListener.onAsyncAssetFetchCompleted(null, obj);
        return new CancelableLoadToken(gei);
    }

    public List getAsyncAssets() {
        List list = this.mAsyncAssets;
        return list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }
}
