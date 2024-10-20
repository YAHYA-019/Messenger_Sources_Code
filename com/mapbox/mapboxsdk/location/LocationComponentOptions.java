package com.mapbox.mapboxsdk.location;

import X.0C9;
import X.0Pz;
import X.1BK;
import X.1BL;
import X.1BM;
import X.AbI;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKG;
import X.JQz;
import X.JR1;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.mapboxsdk.R;
import java.util.Arrays;

/* loaded from: LocationComponentOptions.class */
public class LocationComponentOptions implements Parcelable {
    public static final float ACCURACY_ALPHA_DEFAULT = 0.15f;
    public static final float MAX_ZOOM_ICON_SCALE_DEFAULT = 1.0f;
    public static final float MIN_ZOOM_ICON_SCALE_DEFAULT = 0.6f;
    public static final long STALE_STATE_DELAY_MS = 30000;
    public static final float TRACKING_ANIMATION_DURATION_MULTIPLIER_DEFAULT = 1.1f;
    public float accuracyAlpha;
    public boolean accuracyAnimationEnabled;
    public int accuracyColor;
    public int backgroundDrawable;
    public int backgroundDrawableStale;
    public String backgroundName;
    public String backgroundStaleName;
    public Integer backgroundStaleTintColor;
    public Integer backgroundTintColor;
    public int bearingDrawable;
    public String bearingName;
    public Integer bearingTintColor;
    public boolean compassAnimationEnabled;
    public float elevation;
    public boolean enableStaleState;
    public int foregroundDrawable;
    public int foregroundDrawableStale;
    public String foregroundName;
    public String foregroundStaleName;
    public Integer foregroundStaleTintColor;
    public Integer foregroundTintColor;
    public int gpsDrawable;
    public String gpsName;
    public String layerAbove;
    public String layerBelow;
    public float maxZoomIconScale;
    public float minZoomIconScale;
    public int[] padding;
    public long staleStateTimeout;
    public float trackingAnimationDurationMultiplier;
    public boolean trackingGesturesManagement;
    public float trackingInitialMoveThreshold;
    public float trackingMultiFingerMoveThreshold;
    public static final int[] PADDING_DEFAULT = {0, 0, 0, 0};
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.mapbox.mapboxsdk.location.LocationComponentOptions.1
        @Override // android.os.Parcelable.Creator
        public LocationComponentOptions createFromParcel(Parcel parcel) {
            float readFloat = parcel.readFloat();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Integer num = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            int readInt4 = parcel.readInt();
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            int readInt5 = parcel.readInt();
            String readString4 = parcel.readInt() == 0 ? parcel.readString() : null;
            int readInt6 = parcel.readInt();
            String readString5 = parcel.readInt() == 0 ? parcel.readString() : null;
            int readInt7 = parcel.readInt();
            String readString6 = parcel.readInt() == 0 ? parcel.readString() : null;
            Integer A0z = parcel.readInt() == 0 ? AbI.A0z(parcel) : null;
            Integer A0z2 = parcel.readInt() == 0 ? AbI.A0z(parcel) : null;
            Integer A0z3 = parcel.readInt() == 0 ? AbI.A0z(parcel) : null;
            Integer A0z4 = parcel.readInt() == 0 ? AbI.A0z(parcel) : null;
            if (parcel.readInt() == 0) {
                num = AbI.A0z(parcel);
            }
            return new LocationComponentOptions(readFloat, readInt, readInt2, readString, readInt3, readString2, readInt4, readString3, readInt5, readString4, readInt6, readString5, readInt7, readString6, A0z, A0z2, A0z3, A0z4, num, parcel.readFloat(), AnonymousClass001.A1Q(parcel.readInt(), 1), parcel.readLong(), parcel.createIntArray(), parcel.readFloat(), parcel.readFloat(), 1BM.A07(parcel), parcel.readFloat(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readFloat(), 1BM.A07(parcel), 1BM.A07(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            LocationComponentOptions createFromParcel = createFromParcel(parcel);
            synchronized (0C9.A00) {
            }
            return createFromParcel;
        }

        @Override // android.os.Parcelable.Creator
        public LocationComponentOptions[] newArray(int i) {
            return new LocationComponentOptions[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LocationComponentOptions[i];
        }
    };

    /* loaded from: LocationComponentOptions$Builder.class */
    public final class Builder {
        public Float accuracyAlpha;
        public Boolean accuracyAnimationEnabled;
        public Integer accuracyColor;
        public Integer backgroundDrawable;
        public Integer backgroundDrawableStale;
        public String backgroundName;
        public String backgroundStaleName;
        public Integer backgroundStaleTintColor;
        public Integer backgroundTintColor;
        public Integer bearingDrawable;
        public String bearingName;
        public Integer bearingTintColor;
        public Boolean compassAnimationEnabled;
        public Float elevation;
        public Boolean enableStaleState;
        public Integer foregroundDrawable;
        public Integer foregroundDrawableStale;
        public String foregroundName;
        public String foregroundStaleName;
        public Integer foregroundStaleTintColor;
        public Integer foregroundTintColor;
        public Integer gpsDrawable;
        public String gpsName;
        public String layerAbove;
        public String layerBelow;
        public Float maxZoomIconScale;
        public Float minZoomIconScale;
        public int[] padding;
        public Long staleStateTimeout;
        public Float trackingAnimationDurationMultiplier;
        public Boolean trackingGesturesManagement;
        public Float trackingInitialMoveThreshold;
        public Float trackingMultiFingerMoveThreshold;

        public Builder() {
        }

        public Builder(LocationComponentOptions locationComponentOptions) {
            this.accuracyAlpha = Float.valueOf(locationComponentOptions.accuracyAlpha);
            this.accuracyColor = Integer.valueOf(locationComponentOptions.accuracyColor);
            this.backgroundDrawableStale = Integer.valueOf(locationComponentOptions.backgroundDrawableStale);
            this.backgroundStaleName = locationComponentOptions.backgroundStaleName;
            this.foregroundDrawableStale = Integer.valueOf(locationComponentOptions.foregroundDrawableStale);
            this.foregroundStaleName = locationComponentOptions.foregroundStaleName;
            this.gpsDrawable = Integer.valueOf(locationComponentOptions.gpsDrawable);
            this.gpsName = locationComponentOptions.gpsName;
            this.foregroundDrawable = Integer.valueOf(locationComponentOptions.foregroundDrawable);
            this.foregroundName = locationComponentOptions.foregroundName;
            this.backgroundDrawable = Integer.valueOf(locationComponentOptions.backgroundDrawable);
            this.backgroundName = locationComponentOptions.backgroundName;
            this.bearingDrawable = Integer.valueOf(locationComponentOptions.bearingDrawable);
            this.bearingName = locationComponentOptions.bearingName;
            this.bearingTintColor = locationComponentOptions.bearingTintColor;
            this.foregroundTintColor = locationComponentOptions.foregroundTintColor;
            this.backgroundTintColor = locationComponentOptions.backgroundTintColor;
            this.foregroundStaleTintColor = locationComponentOptions.foregroundStaleTintColor;
            this.backgroundStaleTintColor = locationComponentOptions.backgroundStaleTintColor;
            this.elevation = Float.valueOf(locationComponentOptions.elevation);
            this.enableStaleState = Boolean.valueOf(locationComponentOptions.enableStaleState);
            this.staleStateTimeout = Long.valueOf(locationComponentOptions.staleStateTimeout);
            this.padding = locationComponentOptions.padding;
            this.maxZoomIconScale = Float.valueOf(locationComponentOptions.maxZoomIconScale);
            this.minZoomIconScale = Float.valueOf(locationComponentOptions.minZoomIconScale);
            this.trackingGesturesManagement = Boolean.valueOf(locationComponentOptions.trackingGesturesManagement);
            this.trackingInitialMoveThreshold = Float.valueOf(locationComponentOptions.trackingInitialMoveThreshold);
            this.trackingMultiFingerMoveThreshold = Float.valueOf(locationComponentOptions.trackingMultiFingerMoveThreshold);
            this.layerAbove = locationComponentOptions.layerAbove;
            this.layerBelow = locationComponentOptions.layerBelow;
            this.trackingAnimationDurationMultiplier = Float.valueOf(locationComponentOptions.trackingAnimationDurationMultiplier);
            this.compassAnimationEnabled = Boolean.valueOf(locationComponentOptions.compassAnimationEnabled);
            this.accuracyAnimationEnabled = Boolean.valueOf(locationComponentOptions.accuracyAnimationEnabled);
        }

        public Builder accuracyAlpha(float f) {
            this.accuracyAlpha = Float.valueOf(f);
            return this;
        }

        public Builder accuracyAnimationEnabled(Boolean bool) {
            this.accuracyAnimationEnabled = bool;
            return this;
        }

        public Builder accuracyColor(int i) {
            this.accuracyColor = Integer.valueOf(i);
            return this;
        }

        public LocationComponentOptions autoBuild() {
            String str;
            Float f = this.accuracyAlpha;
            str = "";
            str = f == null ? 0Pz.A0W(str, " accuracyAlpha") : "";
            Integer num = this.accuracyColor;
            if (num == null) {
                str = 0Pz.A0W(str, " accuracyColor");
            }
            Integer num2 = this.backgroundDrawableStale;
            if (num2 == null) {
                str = 0Pz.A0W(str, " backgroundDrawableStale");
            }
            Integer num3 = this.foregroundDrawableStale;
            if (num3 == null) {
                str = 0Pz.A0W(str, " foregroundDrawableStale");
            }
            Integer num4 = this.gpsDrawable;
            if (num4 == null) {
                str = 0Pz.A0W(str, " gpsDrawable");
            }
            Integer num5 = this.foregroundDrawable;
            if (num5 == null) {
                str = 0Pz.A0W(str, " foregroundDrawable");
            }
            Integer num6 = this.backgroundDrawable;
            if (num6 == null) {
                str = 0Pz.A0W(str, " backgroundDrawable");
            }
            Integer num7 = this.bearingDrawable;
            if (num7 == null) {
                str = 0Pz.A0W(str, " bearingDrawable");
            }
            Float f2 = this.elevation;
            if (f2 == null) {
                str = 0Pz.A0W(str, " elevation");
            }
            Boolean bool = this.enableStaleState;
            if (bool == null) {
                str = 0Pz.A0W(str, " enableStaleState");
            }
            Long l = this.staleStateTimeout;
            if (l == null) {
                str = 0Pz.A0W(str, " staleStateTimeout");
            }
            int[] iArr = this.padding;
            if (iArr == null) {
                str = 0Pz.A0W(str, " padding");
            }
            Float f3 = this.maxZoomIconScale;
            if (f3 == null) {
                str = 0Pz.A0W(str, " maxZoomIconScale");
            }
            Float f4 = this.minZoomIconScale;
            if (f4 == null) {
                str = 0Pz.A0W(str, " minZoomIconScale");
            }
            Boolean bool2 = this.trackingGesturesManagement;
            if (bool2 == null) {
                str = 0Pz.A0W(str, " trackingGesturesManagement");
            }
            Float f5 = this.trackingInitialMoveThreshold;
            if (f5 == null) {
                str = 0Pz.A0W(str, " trackingInitialMoveThreshold");
            }
            Float f6 = this.trackingMultiFingerMoveThreshold;
            if (f6 == null) {
                str = 0Pz.A0W(str, " trackingMultiFingerMoveThreshold");
            }
            Float f7 = this.trackingAnimationDurationMultiplier;
            if (f7 == null) {
                str = 0Pz.A0W(str, " trackingAnimationDurationMultiplier");
            }
            if (str.isEmpty()) {
                return new LocationComponentOptions(f.floatValue(), num.intValue(), num2.intValue(), this.backgroundStaleName, num3.intValue(), this.foregroundStaleName, num4.intValue(), this.gpsName, num5.intValue(), this.foregroundName, num6.intValue(), this.backgroundName, num7.intValue(), this.bearingName, this.bearingTintColor, this.foregroundTintColor, this.backgroundTintColor, this.foregroundStaleTintColor, this.backgroundStaleTintColor, f2.floatValue(), bool.booleanValue(), l.longValue(), iArr, f3.floatValue(), f4.floatValue(), bool2.booleanValue(), f5.floatValue(), f6.floatValue(), this.layerAbove, this.layerBelow, f7.floatValue(), this.compassAnimationEnabled.booleanValue(), this.accuracyAnimationEnabled.booleanValue());
            }
            throw 1BK.A0i("Missing required properties:", str);
        }

        public Builder backgroundDrawable(int i) {
            this.backgroundDrawable = Integer.valueOf(i);
            return this;
        }

        public Builder backgroundDrawableStale(int i) {
            this.backgroundDrawableStale = Integer.valueOf(i);
            return this;
        }

        public Builder backgroundName(String str) {
            this.backgroundName = str;
            return this;
        }

        public Builder backgroundStaleName(String str) {
            this.backgroundStaleName = str;
            return this;
        }

        public Builder backgroundStaleTintColor(Integer num) {
            this.backgroundStaleTintColor = num;
            return this;
        }

        public Builder backgroundTintColor(Integer num) {
            this.backgroundTintColor = num;
            return this;
        }

        public Builder bearingDrawable(int i) {
            this.bearingDrawable = Integer.valueOf(i);
            return this;
        }

        public Builder bearingName(String str) {
            this.bearingName = str;
            return this;
        }

        public Builder bearingTintColor(Integer num) {
            this.bearingTintColor = num;
            return this;
        }

        public LocationComponentOptions build() {
            LocationComponentOptions autoBuild = autoBuild();
            float f = autoBuild.accuracyAlpha;
            if (f < 0.0f || f > 1.0f) {
                throw AnonymousClass001.A0L("Accuracy alpha value must be between 0.0 and 1.0.");
            }
            float f2 = autoBuild.elevation;
            if (f2 >= 0.0f) {
                if (autoBuild.layerAbove == null || autoBuild.layerBelow == null) {
                    return autoBuild;
                }
                throw AnonymousClass001.A0L("You cannot set both layerAbove and layerBelow options.Choose one or the other.");
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Invalid shadow size ");
            A0k.append(f2);
            throw AnonymousClass002.A0D(". Must be >= 0", A0k);
        }

        public Builder compassAnimationEnabled(Boolean bool) {
            this.compassAnimationEnabled = bool;
            return this;
        }

        public Builder elevation(float f) {
            this.elevation = Float.valueOf(f);
            return this;
        }

        public Builder enableStaleState(boolean z) {
            this.enableStaleState = Boolean.valueOf(z);
            return this;
        }

        public Builder foregroundDrawable(int i) {
            this.foregroundDrawable = Integer.valueOf(i);
            return this;
        }

        public Builder foregroundDrawableStale(int i) {
            this.foregroundDrawableStale = Integer.valueOf(i);
            return this;
        }

        public Builder foregroundName(String str) {
            this.foregroundName = str;
            return this;
        }

        public Builder foregroundStaleName(String str) {
            this.foregroundStaleName = str;
            return this;
        }

        public Builder foregroundStaleTintColor(Integer num) {
            this.foregroundStaleTintColor = num;
            return this;
        }

        public Builder foregroundTintColor(Integer num) {
            this.foregroundTintColor = num;
            return this;
        }

        public Builder gpsDrawable(int i) {
            this.gpsDrawable = Integer.valueOf(i);
            return this;
        }

        public Builder gpsName(String str) {
            this.gpsName = str;
            return this;
        }

        public Builder layerAbove(String str) {
            this.layerAbove = str;
            return this;
        }

        public Builder layerBelow(String str) {
            this.layerBelow = str;
            return this;
        }

        public Builder maxZoomIconScale(float f) {
            this.maxZoomIconScale = Float.valueOf(f);
            return this;
        }

        public Builder minZoomIconScale(float f) {
            this.minZoomIconScale = Float.valueOf(f);
            return this;
        }

        public Builder padding(int[] iArr) {
            if (iArr == null) {
                throw AnonymousClass001.A0Q("Null padding");
            }
            this.padding = iArr;
            return this;
        }

        public Builder staleStateTimeout(long j) {
            this.staleStateTimeout = Long.valueOf(j);
            return this;
        }

        public Builder trackingAnimationDurationMultiplier(float f) {
            this.trackingAnimationDurationMultiplier = Float.valueOf(f);
            return this;
        }

        public Builder trackingGesturesManagement(boolean z) {
            this.trackingGesturesManagement = Boolean.valueOf(z);
            return this;
        }

        public Builder trackingInitialMoveThreshold(float f) {
            this.trackingInitialMoveThreshold = Float.valueOf(f);
            return this;
        }

        public Builder trackingMultiFingerMoveThreshold(float f) {
            this.trackingMultiFingerMoveThreshold = Float.valueOf(f);
            return this;
        }
    }

    public LocationComponentOptions(float f, int i, int i2, String str, int i3, String str2, int i4, String str3, int i5, String str4, int i6, String str5, int i7, String str6, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, float f2, boolean z, long j, int[] iArr, float f3, float f4, boolean z2, float f5, float f6, String str7, String str8, float f7, boolean z3, boolean z4) {
        this.accuracyAlpha = f;
        this.accuracyColor = i;
        this.backgroundDrawableStale = i2;
        this.backgroundStaleName = str;
        this.foregroundDrawableStale = i3;
        this.foregroundStaleName = str2;
        this.gpsDrawable = i4;
        this.gpsName = str3;
        this.foregroundDrawable = i5;
        this.foregroundName = str4;
        this.backgroundDrawable = i6;
        this.backgroundName = str5;
        this.bearingDrawable = i7;
        this.bearingName = str6;
        this.bearingTintColor = num;
        this.foregroundTintColor = num2;
        this.backgroundTintColor = num3;
        this.foregroundStaleTintColor = num4;
        this.backgroundStaleTintColor = num5;
        this.elevation = f2;
        this.enableStaleState = z;
        this.staleStateTimeout = j;
        if (iArr == null) {
            throw AnonymousClass001.A0Q("Null padding");
        }
        this.padding = iArr;
        this.maxZoomIconScale = f3;
        this.minZoomIconScale = f4;
        this.trackingGesturesManagement = z2;
        this.trackingInitialMoveThreshold = f5;
        this.trackingMultiFingerMoveThreshold = f6;
        this.layerAbove = str7;
        this.layerBelow = str8;
        this.trackingAnimationDurationMultiplier = f7;
        this.compassAnimationEnabled = z3;
        this.accuracyAnimationEnabled = z4;
    }

    public static Builder builder(Context context) {
        return new Builder(createFromAttributes(context, R.style.mapbox_LocationComponent));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.mapbox.mapboxsdk.location.LocationComponentOptions$Builder, java.lang.Object] */
    public static LocationComponentOptions createFromAttributes(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.mapbox_LocationComponent);
        ?? obj = new Object();
        obj.enableStaleState(true);
        obj.staleStateTimeout(STALE_STATE_DELAY_MS);
        obj.maxZoomIconScale(1.0f);
        obj.minZoomIconScale(0.6f);
        obj.padding(PADDING_DEFAULT);
        obj.foregroundDrawable(obtainStyledAttributes.getResourceId(12, -1));
        if (obtainStyledAttributes.hasValue(15)) {
            obj.foregroundTintColor = DKG.A12(obtainStyledAttributes, 15, -1);
        }
        obj.backgroundDrawable(obtainStyledAttributes.getResourceId(3, -1));
        if (obtainStyledAttributes.hasValue(6)) {
            obj.backgroundTintColor = DKG.A12(obtainStyledAttributes, 6, -1);
        }
        obj.foregroundDrawableStale(obtainStyledAttributes.getResourceId(13, -1));
        if (obtainStyledAttributes.hasValue(14)) {
            obj.foregroundStaleTintColor = DKG.A12(obtainStyledAttributes, 14, -1);
        }
        obj.backgroundDrawableStale(obtainStyledAttributes.getResourceId(4, -1));
        if (obtainStyledAttributes.hasValue(5)) {
            obj.backgroundStaleTintColor = DKG.A12(obtainStyledAttributes, 5, -1);
        }
        obj.bearingDrawable(obtainStyledAttributes.getResourceId(7, -1));
        if (obtainStyledAttributes.hasValue(8)) {
            obj.bearingTintColor = DKG.A12(obtainStyledAttributes, 8, -1);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            obj.enableStaleState(obtainStyledAttributes.getBoolean(11, true));
        }
        if (obtainStyledAttributes.hasValue(25)) {
            obj.staleStateTimeout(obtainStyledAttributes.getInteger(25, 30000));
        }
        obj.gpsDrawable(obtainStyledAttributes.getResourceId(16, -1));
        float dimension = obtainStyledAttributes.getDimension(10, 0.0f);
        obj.accuracyColor(obtainStyledAttributes.getColor(2, -1));
        obj.accuracyAlpha(obtainStyledAttributes.getFloat(0, 0.15f));
        obj.elevation(dimension);
        obj.trackingGesturesManagement(obtainStyledAttributes.getBoolean(27, false));
        obj.trackingInitialMoveThreshold(obtainStyledAttributes.getDimension(28, context.getResources().getDimension(R.dimen.mapbox_locationComponentTrackingInitialMoveThreshold)));
        obj.trackingMultiFingerMoveThreshold(obtainStyledAttributes.getDimension(29, context.getResources().getDimension(R.dimen.mapbox_locationComponentTrackingMultiFingerMoveThreshold)));
        obj.padding = new int[]{obtainStyledAttributes.getInt(18, 0), obtainStyledAttributes.getInt(20, 0), obtainStyledAttributes.getInt(19, 0), obtainStyledAttributes.getInt(17, 0)};
        obj.layerAbove = obtainStyledAttributes.getString(21);
        obj.layerBelow = obtainStyledAttributes.getString(22);
        float f = obtainStyledAttributes.getFloat(24, 0.6f);
        float f2 = obtainStyledAttributes.getFloat(23, 1.0f);
        obj.minZoomIconScale(f);
        obj.maxZoomIconScale(f2);
        obj.trackingAnimationDurationMultiplier(obtainStyledAttributes.getFloat(26, 1.1f));
        obj.compassAnimationEnabled = Boolean.valueOf(obtainStyledAttributes.getBoolean(9, true));
        obj.accuracyAnimationEnabled = Boolean.valueOf(obtainStyledAttributes.getBoolean(1, true));
        obtainStyledAttributes.recycle();
        return obj.build();
    }

    public float accuracyAlpha() {
        return this.accuracyAlpha;
    }

    public boolean accuracyAnimationEnabled() {
        return this.accuracyAnimationEnabled;
    }

    public int accuracyColor() {
        return this.accuracyColor;
    }

    public int backgroundDrawable() {
        return this.backgroundDrawable;
    }

    public int backgroundDrawableStale() {
        return this.backgroundDrawableStale;
    }

    public String backgroundName() {
        return this.backgroundName;
    }

    public String backgroundStaleName() {
        return this.backgroundStaleName;
    }

    public Integer backgroundStaleTintColor() {
        return this.backgroundStaleTintColor;
    }

    public Integer backgroundTintColor() {
        return this.backgroundTintColor;
    }

    public int bearingDrawable() {
        return this.bearingDrawable;
    }

    public String bearingName() {
        return this.bearingName;
    }

    public Integer bearingTintColor() {
        return this.bearingTintColor;
    }

    public boolean compassAnimationEnabled() {
        return this.compassAnimationEnabled;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float elevation() {
        return this.elevation;
    }

    public boolean enableStaleState() {
        return this.enableStaleState;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            LocationComponentOptions locationComponentOptions = (LocationComponentOptions) obj;
            if (Float.compare(locationComponentOptions.accuracyAlpha, this.accuracyAlpha) != 0 || this.accuracyColor != locationComponentOptions.accuracyColor || this.backgroundDrawableStale != locationComponentOptions.backgroundDrawableStale || this.foregroundDrawableStale != locationComponentOptions.foregroundDrawableStale || this.gpsDrawable != locationComponentOptions.gpsDrawable || this.foregroundDrawable != locationComponentOptions.foregroundDrawable || this.backgroundDrawable != locationComponentOptions.backgroundDrawable || this.bearingDrawable != locationComponentOptions.bearingDrawable || Float.compare(locationComponentOptions.elevation, this.elevation) != 0 || this.enableStaleState != locationComponentOptions.enableStaleState || this.staleStateTimeout != locationComponentOptions.staleStateTimeout || Float.compare(locationComponentOptions.maxZoomIconScale, this.maxZoomIconScale) != 0 || Float.compare(locationComponentOptions.minZoomIconScale, this.minZoomIconScale) != 0 || this.trackingGesturesManagement != locationComponentOptions.trackingGesturesManagement || Float.compare(locationComponentOptions.trackingInitialMoveThreshold, this.trackingInitialMoveThreshold) != 0 || Float.compare(locationComponentOptions.trackingMultiFingerMoveThreshold, this.trackingMultiFingerMoveThreshold) != 0 || Float.compare(locationComponentOptions.trackingAnimationDurationMultiplier, this.trackingAnimationDurationMultiplier) != 0 || this.compassAnimationEnabled != locationComponentOptions.compassAnimationEnabled || this.accuracyAnimationEnabled != locationComponentOptions.accuracyAnimationEnabled) {
                return false;
            }
            String str = this.backgroundStaleName;
            String str2 = locationComponentOptions.backgroundStaleName;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            String str3 = this.foregroundStaleName;
            String str4 = locationComponentOptions.foregroundStaleName;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            String str5 = this.gpsName;
            String str6 = locationComponentOptions.gpsName;
            if (str5 != null) {
                if (!str5.equals(str6)) {
                    return false;
                }
            } else if (str6 != null) {
                return false;
            }
            String str7 = this.foregroundName;
            String str8 = locationComponentOptions.foregroundName;
            if (str7 != null) {
                if (!str7.equals(str8)) {
                    return false;
                }
            } else if (str8 != null) {
                return false;
            }
            String str9 = this.backgroundName;
            String str10 = locationComponentOptions.backgroundName;
            if (str9 != null) {
                if (!str9.equals(str10)) {
                    return false;
                }
            } else if (str10 != null) {
                return false;
            }
            String str11 = this.bearingName;
            String str12 = locationComponentOptions.bearingName;
            if (str11 != null) {
                if (!str11.equals(str12)) {
                    return false;
                }
            } else if (str12 != null) {
                return false;
            }
            Integer num = this.bearingTintColor;
            Integer num2 = locationComponentOptions.bearingTintColor;
            if (num != null) {
                if (!num.equals(num2)) {
                    return false;
                }
            } else if (num2 != null) {
                return false;
            }
            Integer num3 = this.foregroundTintColor;
            Integer num4 = locationComponentOptions.foregroundTintColor;
            if (num3 != null) {
                if (!num3.equals(num4)) {
                    return false;
                }
            } else if (num4 != null) {
                return false;
            }
            Integer num5 = this.backgroundTintColor;
            Integer num6 = locationComponentOptions.backgroundTintColor;
            if (num5 != null) {
                if (!num5.equals(num6)) {
                    return false;
                }
            } else if (num6 != null) {
                return false;
            }
            Integer num7 = this.foregroundStaleTintColor;
            Integer num8 = locationComponentOptions.foregroundStaleTintColor;
            if (num7 != null) {
                if (!num7.equals(num8)) {
                    return false;
                }
            } else if (num8 != null) {
                return false;
            }
            Integer num9 = this.backgroundStaleTintColor;
            Integer num10 = locationComponentOptions.backgroundStaleTintColor;
            if (num9 != null) {
                if (!num9.equals(num10)) {
                    return false;
                }
            } else if (num10 != null) {
                return false;
            }
            if (!Arrays.equals(this.padding, locationComponentOptions.padding)) {
                return false;
            }
            String str13 = this.layerAbove;
            String str14 = locationComponentOptions.layerAbove;
            if (str13 != null) {
                if (!str13.equals(str14)) {
                    return false;
                }
            } else if (str14 != null) {
                return false;
            }
            String str15 = this.layerBelow;
            String str16 = locationComponentOptions.layerBelow;
            if (str15 != null) {
                return str15.equals(str16);
            }
            if (str16 != null) {
                z = false;
            }
        }
        return z;
    }

    public int foregroundDrawable() {
        return this.foregroundDrawable;
    }

    public int foregroundDrawableStale() {
        return this.foregroundDrawableStale;
    }

    public String foregroundName() {
        return this.foregroundName;
    }

    public String foregroundStaleName() {
        return this.foregroundStaleName;
    }

    public Integer foregroundStaleTintColor() {
        return this.foregroundStaleTintColor;
    }

    public Integer foregroundTintColor() {
        return this.foregroundTintColor;
    }

    public int gpsDrawable() {
        return this.gpsDrawable;
    }

    public String gpsName() {
        return this.gpsName;
    }

    public int hashCode() {
        float f = this.accuracyAlpha;
        int i = 0;
        int A06 = ((((((((((((((((((((((((((((((((((((JR1.A06((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)), f) * 31) + this.accuracyColor) * 31) + this.backgroundDrawableStale) * 31) + 1BL.A06(this.backgroundStaleName)) * 31) + this.foregroundDrawableStale) * 31) + 1BL.A06(this.foregroundStaleName)) * 31) + this.gpsDrawable) * 31) + 1BL.A06(this.gpsName)) * 31) + this.foregroundDrawable) * 31) + 1BL.A06(this.foregroundName)) * 31) + this.backgroundDrawable) * 31) + 1BL.A06(this.backgroundName)) * 31) + this.bearingDrawable) * 31) + 1BL.A06(this.bearingName)) * 31) + AnonymousClass002.A04(this.bearingTintColor)) * 31) + AnonymousClass002.A04(this.foregroundTintColor)) * 31) + AnonymousClass002.A04(this.backgroundTintColor)) * 31) + AnonymousClass002.A04(this.foregroundStaleTintColor)) * 31) + AnonymousClass002.A04(this.backgroundStaleTintColor)) * 31;
        float f2 = this.elevation;
        int A02 = (AnonymousClass002.A02(this.staleStateTimeout, (((A06 + JR1.A06((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)), f2)) * 31) + (this.enableStaleState ? 1 : 0)) * 31) + Arrays.hashCode(this.padding)) * 31;
        float f3 = this.maxZoomIconScale;
        int A062 = (A02 + JR1.A06((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)), f3)) * 31;
        float f4 = this.minZoomIconScale;
        int A063 = (((A062 + JR1.A06((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)), f4)) * 31) + (this.trackingGesturesManagement ? 1 : 0)) * 31;
        float f5 = this.trackingInitialMoveThreshold;
        int A064 = (A063 + JR1.A06((f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1)), f5)) * 31;
        float f6 = this.trackingMultiFingerMoveThreshold;
        int A065 = (((((A064 + JR1.A06((f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1)), f6)) * 31) + 1BL.A06(this.layerAbove)) * 31) + 1BL.A06(this.layerBelow)) * 31;
        float f7 = this.trackingAnimationDurationMultiplier;
        if (f7 != 0.0f) {
            i = Float.floatToIntBits(f7);
        }
        return ((((A065 + i) * 31) + (this.compassAnimationEnabled ? 1 : 0)) * 31) + (this.accuracyAnimationEnabled ? 1 : 0);
    }

    public String layerAbove() {
        return this.layerAbove;
    }

    public String layerBelow() {
        return this.layerBelow;
    }

    public float maxZoomIconScale() {
        return this.maxZoomIconScale;
    }

    public float minZoomIconScale() {
        return this.minZoomIconScale;
    }

    public int[] padding() {
        return this.padding;
    }

    public long staleStateTimeout() {
        return this.staleStateTimeout;
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LocationComponentOptions{accuracyAlpha=");
        A0k.append(this.accuracyAlpha);
        A0k.append(", accuracyColor=");
        A0k.append(this.accuracyColor);
        A0k.append(", backgroundDrawableStale=");
        A0k.append(this.backgroundDrawableStale);
        A0k.append(", backgroundStaleName=");
        A0k.append(this.backgroundStaleName);
        A0k.append(", foregroundDrawableStale=");
        A0k.append(this.foregroundDrawableStale);
        A0k.append(", foregroundStaleName=");
        A0k.append(this.foregroundStaleName);
        A0k.append(", gpsDrawable=");
        A0k.append(this.gpsDrawable);
        A0k.append(", gpsName=");
        A0k.append(this.gpsName);
        A0k.append(", foregroundDrawable=");
        A0k.append(this.foregroundDrawable);
        A0k.append(", foregroundName=");
        A0k.append(this.foregroundName);
        A0k.append(", backgroundDrawable=");
        A0k.append(this.backgroundDrawable);
        A0k.append(", backgroundName=");
        A0k.append(this.backgroundName);
        A0k.append(", bearingDrawable=");
        A0k.append(this.bearingDrawable);
        A0k.append(", bearingName=");
        A0k.append(this.bearingName);
        A0k.append(", bearingTintColor=");
        A0k.append(this.bearingTintColor);
        A0k.append(", foregroundTintColor=");
        A0k.append(this.foregroundTintColor);
        A0k.append(", backgroundTintColor=");
        A0k.append(this.backgroundTintColor);
        A0k.append(", foregroundStaleTintColor=");
        A0k.append(this.foregroundStaleTintColor);
        A0k.append(", backgroundStaleTintColor=");
        A0k.append(this.backgroundStaleTintColor);
        A0k.append(", elevation=");
        A0k.append(this.elevation);
        A0k.append(", enableStaleState=");
        A0k.append(this.enableStaleState);
        A0k.append(", staleStateTimeout=");
        A0k.append(this.staleStateTimeout);
        A0k.append(", padding=");
        A0k.append(Arrays.toString(this.padding));
        A0k.append(", maxZoomIconScale=");
        A0k.append(this.maxZoomIconScale);
        A0k.append(", minZoomIconScale=");
        A0k.append(this.minZoomIconScale);
        A0k.append(", trackingGesturesManagement=");
        A0k.append(this.trackingGesturesManagement);
        A0k.append(", trackingInitialMoveThreshold=");
        A0k.append(this.trackingInitialMoveThreshold);
        A0k.append(", trackingMultiFingerMoveThreshold=");
        A0k.append(this.trackingMultiFingerMoveThreshold);
        A0k.append(", layerAbove=");
        A0k.append(this.layerAbove);
        A0k.append("layerBelow=");
        A0k.append(this.layerBelow);
        A0k.append("trackingAnimationDurationMultiplier=");
        A0k.append(this.trackingAnimationDurationMultiplier);
        return 1BL.A0v(A0k);
    }

    public float trackingAnimationDurationMultiplier() {
        return this.trackingAnimationDurationMultiplier;
    }

    public boolean trackingGesturesManagement() {
        return this.trackingGesturesManagement;
    }

    public float trackingInitialMoveThreshold() {
        return this.trackingInitialMoveThreshold;
    }

    public float trackingMultiFingerMoveThreshold() {
        return this.trackingMultiFingerMoveThreshold;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.accuracyAlpha);
        parcel.writeInt(this.accuracyColor);
        parcel.writeInt(this.backgroundDrawableStale);
        if (this.backgroundStaleName == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.backgroundStaleName);
        }
        parcel.writeInt(this.foregroundDrawableStale);
        if (this.foregroundStaleName == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.foregroundStaleName);
        }
        parcel.writeInt(this.gpsDrawable);
        if (this.gpsName == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.gpsName);
        }
        parcel.writeInt(this.foregroundDrawable);
        if (this.foregroundName == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.foregroundName);
        }
        parcel.writeInt(this.backgroundDrawable);
        if (this.backgroundName == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.backgroundName);
        }
        parcel.writeInt(this.bearingDrawable);
        if (this.bearingName == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.bearingName);
        }
        if (this.bearingTintColor == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            JQz.A16(parcel, this.bearingTintColor);
        }
        if (this.foregroundTintColor == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            JQz.A16(parcel, this.foregroundTintColor);
        }
        if (this.backgroundTintColor == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            JQz.A16(parcel, this.backgroundTintColor);
        }
        if (this.foregroundStaleTintColor == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            JQz.A16(parcel, this.foregroundStaleTintColor);
        }
        if (this.backgroundStaleTintColor == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            JQz.A16(parcel, this.backgroundStaleTintColor);
        }
        parcel.writeFloat(this.elevation);
        parcel.writeInt(this.enableStaleState ? 1 : 0);
        parcel.writeLong(this.staleStateTimeout);
        parcel.writeIntArray(this.padding);
        parcel.writeFloat(this.maxZoomIconScale);
        parcel.writeFloat(this.minZoomIconScale);
        parcel.writeInt(this.trackingGesturesManagement ? 1 : 0);
        parcel.writeFloat(this.trackingInitialMoveThreshold);
        parcel.writeFloat(this.trackingMultiFingerMoveThreshold);
        parcel.writeString(this.layerAbove);
        parcel.writeString(this.layerBelow);
        parcel.writeFloat(this.trackingAnimationDurationMultiplier);
        parcel.writeInt(this.compassAnimationEnabled ? 1 : 0);
        parcel.writeInt(this.accuracyAnimationEnabled ? 1 : 0);
    }
}
