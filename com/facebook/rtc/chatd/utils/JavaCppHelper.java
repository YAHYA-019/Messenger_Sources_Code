package com.facebook.rtc.chatd.utils;

import X.C3Pa;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: JavaCppHelper.class */
public class JavaCppHelper {
    static {
        C3Pa.A00();
    }

    public native ArrayList convertPackedParamsToArrayList(McfReference mcfReference);
}
