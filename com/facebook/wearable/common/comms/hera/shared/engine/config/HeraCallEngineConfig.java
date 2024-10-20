package com.facebook.wearable.common.comms.hera.shared.engine.config;

import X.1BL;
import com.facebook.wearable.common.comms.hera.shared.context.HeraContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: HeraCallEngineConfig.class */
public final class HeraCallEngineConfig {
    public final boolean enableRecorder;
    public final HeraContext heraContext;
    public final boolean includeProfilePicture;
    public final String tag;

    public HeraCallEngineConfig(String str, HeraContext heraContext, boolean z, boolean z2) {
        1BL.A1F(str, heraContext);
        this.tag = str;
        this.heraContext = heraContext;
        this.includeProfilePicture = z;
        this.enableRecorder = z2;
    }

    public /* synthetic */ HeraCallEngineConfig(String str, HeraContext heraContext, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, heraContext, z, (i & 8) != 0 ? false : z2);
    }

    public final boolean getEnableRecorder() {
        return this.enableRecorder;
    }

    public final HeraContext getHeraContext() {
        return this.heraContext;
    }

    public final boolean getIncludeProfilePicture() {
        return this.includeProfilePicture;
    }

    public final String getTag() {
        return this.tag;
    }
}
