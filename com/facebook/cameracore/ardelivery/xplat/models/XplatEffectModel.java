package com.facebook.cameracore.ardelivery.xplat.models;

import X.11T;
import X.AnonymousClass001;
import X.DKH;
import X.FH3;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.SparkVisionCapability;
import java.util.List;

/* loaded from: XplatEffectModel.class */
public final class XplatEffectModel {
    public final String MD5Hash;
    public final List arEffectAsyncAssets;
    public final String cacheKey;
    public List capabilitiesMinVersionModels;
    public final int compressionTypeCppValue;
    public final String effectId;
    public final String effectInstanceId;
    public final boolean encrypted;
    public final String fileName;
    public final long fileSize;
    public final String graphqlId;
    public final String manifestCapabilities;
    public List sparkVisionModels;
    public final String uri;

    public XplatEffectModel(ARRequestAsset aRRequestAsset) {
        11T.A0F(aRRequestAsset, 1);
        FH3 fh3 = aRRequestAsset.A02;
        if (fh3.A02 != ARAssetType.EFFECT) {
            throw AnonymousClass001.A0N("This adapter is only for effect asset");
        }
        String str = fh3.A09;
        11T.A0A(str);
        this.effectId = str;
        this.effectInstanceId = fh3.A0A;
        this.capabilitiesMinVersionModels = aRRequestAsset.A0A;
        SparkVisionCapability sparkVisionCapability = aRRequestAsset.A03;
        this.sparkVisionModels = sparkVisionCapability != null ? DKH.A0d(sparkVisionCapability) : null;
        this.fileName = aRRequestAsset.A07;
        this.graphqlId = str;
        this.cacheKey = fh3.A08;
        this.uri = aRRequestAsset.A09;
        this.MD5Hash = aRRequestAsset.A06;
        this.fileSize = aRRequestAsset.A00;
        this.compressionTypeCppValue = ARRequestAsset.CompressionMethod.toXplatCompressionType(fh3.A03).mCppValue;
        this.arEffectAsyncAssets = aRRequestAsset.A04;
        this.manifestCapabilities = aRRequestAsset.A08;
        this.encrypted = fh3.A06.booleanValue();
    }

    public final List getCapabilitiesMinVersionModels() {
        return this.capabilitiesMinVersionModels;
    }

    public final List getSparkVisionModels() {
        return this.sparkVisionModels;
    }

    public final void setCapabilitiesMinVersionModels(List list) {
        this.capabilitiesMinVersionModels = list;
    }

    public final void setSparkVisionModels(List list) {
        this.sparkVisionModels = list;
    }
}
