package com.facebook.messaging.composer.params;

import X.C00t;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: ComposerInitParamsSpec$ComposerLaunchSource.class */
public final class ComposerInitParamsSpec$ComposerLaunchSource {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ ComposerInitParamsSpec$ComposerLaunchSource[] A01;
    public static final ComposerInitParamsSpec$ComposerLaunchSource A02;
    public static final ComposerInitParamsSpec$ComposerLaunchSource A03;
    public static final ComposerInitParamsSpec$ComposerLaunchSource A04;
    public static final ComposerInitParamsSpec$ComposerLaunchSource A05;
    public static final ComposerInitParamsSpec$ComposerLaunchSource A06;

    static {
        ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource = new ComposerInitParamsSpec$ComposerLaunchSource("THREAD_VIEW", 0);
        A05 = composerInitParamsSpec$ComposerLaunchSource;
        ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource2 = new ComposerInitParamsSpec$ComposerLaunchSource("FRIENDS_TAB_MONTAGE_REPLY", 1);
        A02 = composerInitParamsSpec$ComposerLaunchSource2;
        ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource3 = new ComposerInitParamsSpec$ComposerLaunchSource("INBOX_UNIT_MONTAGE_REPLY", 2);
        A03 = composerInitParamsSpec$ComposerLaunchSource3;
        ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource4 = new ComposerInitParamsSpec$ComposerLaunchSource("MEDIA_VIEWER", 3);
        A04 = composerInitParamsSpec$ComposerLaunchSource4;
        ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource5 = new ComposerInitParamsSpec$ComposerLaunchSource("UNSET", 4);
        A06 = composerInitParamsSpec$ComposerLaunchSource5;
        ComposerInitParamsSpec$ComposerLaunchSource[] composerInitParamsSpec$ComposerLaunchSourceArr = {composerInitParamsSpec$ComposerLaunchSource, composerInitParamsSpec$ComposerLaunchSource2, composerInitParamsSpec$ComposerLaunchSource3, composerInitParamsSpec$ComposerLaunchSource4, composerInitParamsSpec$ComposerLaunchSource5};
        A01 = composerInitParamsSpec$ComposerLaunchSourceArr;
        A00 = C00t.A00(composerInitParamsSpec$ComposerLaunchSourceArr);
    }

    public ComposerInitParamsSpec$ComposerLaunchSource(String str, int i) {
    }

    public static ComposerInitParamsSpec$ComposerLaunchSource valueOf(String str) {
        return (ComposerInitParamsSpec$ComposerLaunchSource) Enum.valueOf(ComposerInitParamsSpec$ComposerLaunchSource.class, str);
    }

    public static ComposerInitParamsSpec$ComposerLaunchSource[] values() {
        return (ComposerInitParamsSpec$ComposerLaunchSource[]) A01.clone();
    }
}
