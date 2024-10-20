package com.facebook.looper.features;

import X.0Q8;
import X.C04r;
import X.C15h;

/* loaded from: DeclarativeFeatureExtractor.class */
public abstract class DeclarativeFeatureExtractor implements FeatureExtractor {
    public final C04r mBoolFeatures;
    public final C04r mFloatFeatures;
    public final C04r mIntFeatures;
    public final C04r mIntSingleCategoricalFeatures;

    public DeclarativeFeatureExtractor() {
        throw 0Q8.createAndThrow();
    }

    private long[] convertLongArrToPrimitiveArr(Long[] lArr) {
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.looper.features.FeatureExtractor
    public abstract boolean getBool(long j);

    @Override // com.facebook.looper.features.FeatureExtractor
    public abstract long[] getBoolIds();

    @Override // com.facebook.looper.features.FeatureExtractor
    public abstract double getFloat(long j);

    @Override // com.facebook.looper.features.FeatureExtractor
    public abstract long[] getFloatIds();

    @Override // com.facebook.looper.features.FeatureExtractor
    public abstract long getId();

    @Override // com.facebook.looper.features.FeatureExtractor
    public abstract long getInt(long j);

    @Override // com.facebook.looper.features.FeatureExtractor
    public abstract long[] getIntIds();

    @Override // com.facebook.looper.features.FeatureExtractor
    public abstract long getIntSingleCategorical(long j);

    @Override // com.facebook.looper.features.FeatureExtractor
    public abstract long[] getIntSingleCategoricalIds();

    public abstract void registerBoolFeature(long j);

    public abstract void registerBoolFeature(long j, C15h c15h);

    public abstract void registerFloatFeature(long j);

    public abstract void registerFloatFeature(long j, C15h c15h);

    public abstract void registerIntFeature(long j);

    public abstract void registerIntFeature(long j, C15h c15h);

    public abstract void registerIntSingleCategoricalFeature(long j);

    public abstract void registerIntSingleCategoricalFeature(long j, C15h c15h);
}
