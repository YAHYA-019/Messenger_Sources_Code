package com.facebook.cameracore.mediapipeline.services.networking.interfaces;

/* loaded from: NetworkPolicyConfiguration.class */
public class NetworkPolicyConfiguration {
    public final NetworkPolicyDataSource mNetworkPolicyDataSource;

    public NetworkPolicyConfiguration(NetworkPolicyDataSource networkPolicyDataSource) {
        this.mNetworkPolicyDataSource = networkPolicyDataSource;
    }

    public NetworkPolicyDataSource getNetworkPolicyDataSource() {
        return this.mNetworkPolicyDataSource;
    }
}
