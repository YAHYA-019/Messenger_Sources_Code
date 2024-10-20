package com.facebook.cameracore.ardelivery.model;

import X.02W;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0By;
import X.FH3;

/* loaded from: XplatAssetType.class */
public enum XplatAssetType {
    Unknown(0),
    AREffect(1),
    Async(2),
    StyleTransferEffect(3),
    LegacyEffect(4),
    ARLink(5),
    Remote(6),
    FaceTrackerModel(7),
    HairSegmentationModel(8),
    SegmentationModel(9),
    XRayModel(10),
    FittedExpressionTrackerModel(11),
    MSuggestionsCoreModel(12),
    NametagModel(13),
    PyTorchModel(14),
    Caffe2Model(15),
    MulticlassSegmentationModel(16),
    ScriptingPackage(17),
    Ocr2goCreditCardModel(18),
    RecognitionModel(19),
    AR3DObject(20),
    SparkVision(21),
    FittedExpressionTrackerRuntimeRigRetargetingConfig(22),
    BodyTracking3DModel(23);

    public static final XplatAssetType[] cppValueToEnumArray = new XplatAssetType[values().length];
    public final int mCppValue;

    static {
        for (XplatAssetType xplatAssetType : values()) {
            cppValueToEnumArray[xplatAssetType.mCppValue] = xplatAssetType;
        }
    }

    XplatAssetType(int i) {
        this.mCppValue = i;
    }

    public static XplatAssetType fromARRequestAsset(ARRequestAsset aRRequestAsset) {
        FH3 fh3 = aRRequestAsset.A02;
        ARAssetType aRAssetType = fh3.A02;
        int ordinal = aRAssetType.ordinal();
        if (ordinal == 0) {
            return AREffect;
        }
        if (ordinal == 2) {
            return Async;
        }
        if (ordinal == 3) {
            return Remote;
        }
        if (ordinal == 4) {
            return ScriptingPackage;
        }
        if (ordinal != 1) {
            throw AnonymousClass002.A0C(aRAssetType, "Unknown ARRequestAsset type : ", AnonymousClass001.A0k());
        }
        02W.A07(AnonymousClass001.A1W(aRAssetType, ARAssetType.SUPPORT), "Cannot get VersionedCapability from Effect Asset");
        VersionedCapability versionedCapability = fh3.A00;
        C0By.A03(versionedCapability, "SUPPORT ARRequestAsset should have versioned capability field");
        return fromVersionedCapability(versionedCapability);
    }

    public static XplatAssetType fromVersionedCapability(VersionedCapability versionedCapability) {
        return versionedCapability.getXplatAssetType();
    }

    public static XplatAssetType ofCppValue(int i) {
        if (i < 0 || i >= values().length) {
            throw AnonymousClass001.A0L("Invalid cpp value for AssetType");
        }
        return cppValueToEnumArray[i];
    }

    public int getValue() {
        return this.mCppValue;
    }
}
