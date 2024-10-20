package org.chromium.support_lib_boundary;

/* loaded from: WebMessagePayloadBoundaryInterface.class */
public interface WebMessagePayloadBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    byte[] getAsArrayBuffer();

    String getAsString();

    int getType();
}
