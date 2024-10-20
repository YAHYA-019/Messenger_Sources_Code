package com.facebook.papaya.mldw;

import X.C0il;
import com.facebook.jni.HybridData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.Set;

/* loaded from: Host.class */
public class Host {
    public final HybridData mHybridData;

    static {
        C0il.A0B("papaya-mldw");
    }

    public Host(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native int nativeGetProduct();

    private native SettableFuture nativeLog(Event event);

    private native SettableFuture nativeReadFeatures(ImmutableMap immutableMap, Set set);

    private native SettableFuture nativeReadFeatures(List list);

    private native SettableFuture nativeRegisterFeatures(String str, int i);

    private native SettableFuture nativeRepackDisk(Long l);

    public ListenableFuture log(Event event) {
        return nativeLog(event);
    }

    public ListenableFuture readFeatures(ImmutableList immutableList) {
        return nativeReadFeatures(immutableList);
    }

    public ListenableFuture readFeatures(ImmutableMap immutableMap, ImmutableSet immutableSet) {
        return nativeReadFeatures(immutableMap, immutableSet);
    }

    public ListenableFuture registerFeatures(String str, int i) {
        return nativeRegisterFeatures(str, i);
    }
}
