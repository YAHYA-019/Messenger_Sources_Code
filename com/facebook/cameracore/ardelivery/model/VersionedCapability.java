package com.facebook.cameracore.ardelivery.model;

import X.0fH;
import X.1BK;
import X.AnonymousClass001;
import X.DKC;
import X.EKt;
import android.util.SparseArray;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: VersionedCapability.class */
public final class VersionedCapability {
    public static final /* synthetic */ VersionedCapability[] $VALUES;
    public static final VersionedCapability BiBytedoc;
    public static final VersionedCapability BiDeepText;
    public static final VersionedCapability BiXray;
    public static final VersionedCapability BodyTracking;
    public static final VersionedCapability BodyTracking3D;
    public static final VersionedCapability DepthEstimation;
    public static final VersionedCapability EgoDetectorTracker;
    public static final VersionedCapability EnlightenGAN;
    public static final VersionedCapability FaceExpressionFitting;
    public static final VersionedCapability FaceExpressionFittingRTRRetargeting;
    public static final VersionedCapability FaceWave;
    public static final VersionedCapability Facetracker;
    public static final VersionedCapability GazeCorrection;
    public static final VersionedCapability HairSegmentation;
    public static final VersionedCapability HandGesture;
    public static final VersionedCapability HandTracker;
    public static final VersionedCapability IGReelsXRay;
    public static final VersionedCapability IiFaceTracker;
    public static final VersionedCapability IiIdDetector;
    public static final VersionedCapability IiReducedFaceTracker;
    public static final VersionedCapability MSuggestionsCore;
    public static final VersionedCapability MetaDetTrack;
    public static final VersionedCapability MobileVisionImageUnderstanding;
    public static final VersionedCapability MulticlassSegmentation;
    public static final VersionedCapability MultitaskPeopleSegmentation;
    public static final VersionedCapability Nametag;
    public static final VersionedCapability Ocr2goCreditCard;
    public static final VersionedCapability PytorchTest;
    public static final VersionedCapability Recognition;
    public static final VersionedCapability RingTryOn;
    public static final VersionedCapability Safechat;
    public static final VersionedCapability Saliency;
    public static final VersionedCapability SceneUnderstanding;
    public static final VersionedCapability SegmentAnything;
    public static final VersionedCapability Segmentation;
    public static final VersionedCapability SkySegmentation;
    public static final String TAG = "VersionedCapability";
    public static final Map UPPER_STRING_TO_CAPABILITY_MAP;
    public static final VersionedCapability UTwoNet;
    public static final VersionedCapability VideoHighlights;
    public static final VersionedCapability VideoHighlightsTemporal;
    public static final SparseArray XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP;
    public static final VersionedCapability XRay;
    public final XplatAssetType mAssetType;
    public final EKt mMLFrameworkType;
    public final int mXplatValue;

    public static /* synthetic */ VersionedCapability[] $values() {
        VersionedCapability[] versionedCapabilityArr = new VersionedCapability[40];
        System.arraycopy(new VersionedCapability[]{HandGesture, FaceWave, Saliency, MultitaskPeopleSegmentation, EgoDetectorTracker, FaceExpressionFittingRTRRetargeting, VideoHighlights, MobileVisionImageUnderstanding, VideoHighlightsTemporal, MetaDetTrack, SegmentAnything, UTwoNet, BodyTracking3D}, 1BK.A1W(new VersionedCapability[]{Facetracker, HandTracker, Segmentation, HairSegmentation, XRay, RingTryOn, FaceExpressionFitting, MSuggestionsCore, GazeCorrection, Nametag, BiBytedoc, BiDeepText, PytorchTest, BiXray, BodyTracking, Safechat, IiReducedFaceTracker, MulticlassSegmentation, EnlightenGAN, SceneUnderstanding, Ocr2goCreditCard, IiIdDetector, Recognition, IGReelsXRay, SkySegmentation, DepthEstimation, IiFaceTracker}, versionedCapabilityArr) ? 1 : 0, versionedCapabilityArr, 27, 13);
        return versionedCapabilityArr;
    }

    static {
        EKt eKt = EKt.A02;
        XplatAssetType xplatAssetType = XplatAssetType.FaceTrackerModel;
        Facetracker = DKC.A0L(eKt, xplatAssetType, "Facetracker", 0, 1);
        EKt eKt2 = EKt.A01;
        XplatAssetType xplatAssetType2 = XplatAssetType.Caffe2Model;
        HandTracker = DKC.A0L(eKt2, xplatAssetType2, "HandTracker", 1, 2);
        Segmentation = DKC.A0L(eKt2, XplatAssetType.SegmentationModel, "Segmentation", 2, 3);
        HairSegmentation = DKC.A0L(eKt2, XplatAssetType.HairSegmentationModel, "HairSegmentation", 3, 4);
        XRay = DKC.A0L(eKt2, XplatAssetType.XRayModel, "XRay", 4, 5);
        RingTryOn = DKC.A0L(eKt2, xplatAssetType2, "RingTryOn", 5, 6);
        FaceExpressionFitting = DKC.A0L(eKt, XplatAssetType.FittedExpressionTrackerModel, "FaceExpressionFitting", 6, 7);
        MSuggestionsCore = DKC.A0L(eKt2, XplatAssetType.MSuggestionsCoreModel, "MSuggestionsCore", 7, 8);
        GazeCorrection = DKC.A0L(eKt2, xplatAssetType2, "GazeCorrection", 8, 9);
        Nametag = DKC.A0L(eKt2, XplatAssetType.NametagModel, "Nametag", 9, 10);
        EKt eKt3 = EKt.A03;
        XplatAssetType xplatAssetType3 = XplatAssetType.PyTorchModel;
        BiBytedoc = DKC.A0L(eKt3, xplatAssetType3, "BiBytedoc", 10, 11);
        BiDeepText = DKC.A0L(eKt2, xplatAssetType2, "BiDeepText", 11, 12);
        PytorchTest = DKC.A0L(eKt3, xplatAssetType3, "PytorchTest", 12, 13);
        BiXray = DKC.A0L(eKt3, xplatAssetType3, "BiXray", 13, 14);
        BodyTracking = DKC.A0L(eKt2, xplatAssetType2, "BodyTracking", 14, 15);
        Safechat = DKC.A0L(eKt3, xplatAssetType3, "Safechat", 15, 16);
        IiReducedFaceTracker = DKC.A0L(eKt3, xplatAssetType3, "IiReducedFaceTracker", 16, 17);
        MulticlassSegmentation = DKC.A0L(eKt3, XplatAssetType.MulticlassSegmentationModel, "MulticlassSegmentation", 17, 18);
        EnlightenGAN = DKC.A0L(eKt3, xplatAssetType3, "EnlightenGAN", 18, 19);
        SceneUnderstanding = DKC.A0L(eKt3, xplatAssetType3, "SceneUnderstanding", 19, 20);
        Ocr2goCreditCard = DKC.A0L(eKt3, XplatAssetType.Ocr2goCreditCardModel, "Ocr2goCreditCard", 20, 21);
        IiIdDetector = DKC.A0L(eKt3, xplatAssetType3, "IiIdDetector", 21, 22);
        Recognition = DKC.A0L(eKt3, XplatAssetType.RecognitionModel, "Recognition", 22, 23);
        IGReelsXRay = DKC.A0L(eKt3, xplatAssetType3, "IGReelsXRay", 23, 24);
        SkySegmentation = DKC.A0L(eKt3, xplatAssetType3, "SkySegmentation", 24, 25);
        DepthEstimation = DKC.A0L(eKt3, xplatAssetType3, "DepthEstimation", 25, 26);
        IiFaceTracker = DKC.A0L(eKt, xplatAssetType, "IiFaceTracker", 26, 27);
        HandGesture = DKC.A0L(eKt3, xplatAssetType3, "HandGesture", 27, 28);
        FaceWave = DKC.A0L(eKt3, xplatAssetType3, "FaceWave", 28, 29);
        Saliency = DKC.A0L(eKt3, xplatAssetType3, "Saliency", 29, 30);
        MultitaskPeopleSegmentation = DKC.A0L(eKt3, xplatAssetType3, "MultitaskPeopleSegmentation", 30, 31);
        EgoDetectorTracker = DKC.A0L(eKt3, xplatAssetType3, "EgoDetectorTracker", 31, 32);
        FaceExpressionFittingRTRRetargeting = DKC.A0L(eKt, XplatAssetType.FittedExpressionTrackerRuntimeRigRetargetingConfig, "FaceExpressionFittingRTRRetargeting", 32, 33);
        VideoHighlights = DKC.A0L(eKt3, xplatAssetType3, "VideoHighlights", 33, 34);
        MobileVisionImageUnderstanding = DKC.A0L(eKt3, xplatAssetType3, "MobileVisionImageUnderstanding", 34, 35);
        VideoHighlightsTemporal = DKC.A0L(eKt3, xplatAssetType3, "VideoHighlightsTemporal", 35, 36);
        MetaDetTrack = DKC.A0L(eKt3, xplatAssetType3, "MetaDetTrack", 36, 37);
        SegmentAnything = DKC.A0L(eKt3, xplatAssetType3, "SegmentAnything", 37, 38);
        UTwoNet = DKC.A0L(eKt3, xplatAssetType3, "UTwoNet", 38, 39);
        BodyTracking3D = DKC.A0L(eKt3, XplatAssetType.BodyTracking3DModel, "BodyTracking3D", 39, 40);
        $VALUES = $values();
        XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP = new SparseArray(values().length + 1);
        UPPER_STRING_TO_CAPABILITY_MAP = AnonymousClass001.A0u();
        for (VersionedCapability versionedCapability : values()) {
            UPPER_STRING_TO_CAPABILITY_MAP.put(DKC.A18(versionedCapability.name()), versionedCapability);
            XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP.put(versionedCapability.getXplatValue(), versionedCapability);
        }
    }

    public VersionedCapability(String str, int i, EKt eKt, int i2, XplatAssetType xplatAssetType) {
        this.mMLFrameworkType = eKt;
        this.mXplatValue = i2;
        this.mAssetType = xplatAssetType;
    }

    public static VersionedCapability fromServerValue(String str) {
        VersionedCapability versionedCapability = (VersionedCapability) UPPER_STRING_TO_CAPABILITY_MAP.get(DKC.A18(str));
        if (versionedCapability == null) {
            0fH.A18(TAG, "Unsupported capability: %s", new Object[]{str});
            versionedCapability = null;
        }
        return versionedCapability;
    }

    public static VersionedCapability fromXplatValue(int i) {
        return (VersionedCapability) XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP.get(i);
    }

    public static VersionedCapability valueOf(String str) {
        return (VersionedCapability) Enum.valueOf(VersionedCapability.class, str);
    }

    public static VersionedCapability[] values() {
        return (VersionedCapability[]) $VALUES.clone();
    }

    public EKt getMLFrameworkType() {
        return this.mMLFrameworkType;
    }

    public XplatAssetType getXplatAssetType() {
        return this.mAssetType;
    }

    public int getXplatValue() {
        return this.mXplatValue;
    }

    public String toServerValue() {
        return name();
    }
}
